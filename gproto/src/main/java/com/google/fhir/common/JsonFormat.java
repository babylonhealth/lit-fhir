//    Copyright 2018 Google Inc.
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        https://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.

package com.google.fhir.common;

import com.google.common.base.CaseFormat;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.fhir.proto.Annotations;
import com.google.fhir.proto.Annotations.FhirVersion;
import com.google.fhir.r4.core.Element;
import com.google.fhir.stu3.google.PrimitiveHasNoValue;
import com.google.fhir.wrappers.CodeWrapper;
import com.google.fhir.wrappers.ExtensionWrapper;
import com.google.fhir.wrappers.PrimitiveWrapper;
import com.google.fhir.wrappers.PrimitiveWrappers;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.protobuf.Any;
import com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Parsers for FHIR data encoded as json or xml. */
public final class JsonFormat {

  // Format in which the printer will represent the FHIR proto in JSON form.
  private enum FhirJsonFormat {
    // Lossless JSON representation of FHIR proto.
    PURE,

    // Lossy JSON representation with specified maximum recursive depth and
    // limited support for Extensions.
    ANALYTIC,
  }

  private JsonFormat() {}

  // TODO: Use r4 extension once generated.
  private static final PrimitiveHasNoValue PRIMITIVE_HAS_NO_VALUE =
      PrimitiveHasNoValue.newBuilder()
          .setValueBoolean(com.google.fhir.stu3.proto.Boolean.newBuilder().setValue(true))
          .build();

  private static boolean isPrimitiveType(FieldDescriptor field) {
    return field.getType() == FieldDescriptor.Type.MESSAGE
        && AnnotationUtils.isPrimitiveType(field.getMessageType());
  }

  /**
   * Creates a {@link Printer} with default configurations. The default timezone is set to the local
   * system default.
   */
  public static Printer getPrinter() {
    return new Printer(
        false /*omittingInsignificantWhitespace*/, ZoneId.systemDefault(), FhirJsonFormat.PURE);
  }

  /** A Printer converts protobuf message to JSON format. */
  public static class Printer {
    private final boolean omittingInsignificantWhitespace;
    private final ZoneId defaultTimeZone;
    private final FhirJsonFormat jsonFormat;

    private Printer(
        boolean omittingInsignificantWhitespace,
        ZoneId defaultTimeZone,
        FhirJsonFormat jsonFormat) {
      this.omittingInsignificantWhitespace = omittingInsignificantWhitespace;
      this.defaultTimeZone = defaultTimeZone;
      this.jsonFormat = jsonFormat;
    }

    /**
     * Create a new {@link Printer} that will omit all insignificant whitespace in the JSON output.
     * This new Printer clones all other configurations from the current Printer. Insignificant
     * whitespace is defined by the JSON spec as whitespace that appear between JSON structural
     * elements:
     *
     * <pre>
     * ws = *(
     * %x20 /              ; Space
     * %x09 /              ; Horizontal tab
     * %x0A /              ; Line feed or New line
     * %x0D )              ; Carriage return
     * </pre>
     *
     * See <a href="https://tools.ietf.org/html/rfc7159">https://tools.ietf.org/html/rfc7159</a>
     * current {@link Printer}.
     */
    public Printer omittingInsignificantWhitespace() {
      return new Printer(true, defaultTimeZone, jsonFormat);
    }

    /*
     * Create a new {@link Printer} with a default timezone. Any Dates and DateTimes printed by
     * this printer which have values in this timezone will be printed without timezone qualifiers.
     * If the default timezone is null, a timezone will be emitted whenever allowed by the FHIR
     * standard, currently always in the form of a time offset.
     */
    public Printer withDefaultTimeZone(ZoneId defaultTimeZone) {
      return new Printer(omittingInsignificantWhitespace, defaultTimeZone, jsonFormat);
    }

    /*
     * Create a new {@link Printer} which formats the output in a manner suitable for SQL queries.
     * This follows the in-progress analytics spec defined at
     * https://github.com/rbrush/sql-on-fhir/blob/master/sql-on-fhir.md
     */
    public Printer forAnalytics() {
      return new Printer(omittingInsignificantWhitespace, defaultTimeZone, FhirJsonFormat.ANALYTIC);
    }

    /**
     * Converts a protobuf message to JSON format.
     *
     * @throws IOException if writing to the output fails.
     */
    public void appendTo(MessageOrBuilder message, Appendable output) throws IOException {
      new PrinterImpl(output, omittingInsignificantWhitespace, defaultTimeZone, jsonFormat)
          .print(message);
    }

    /** Converts a protobuf message to JSON format. */
    public String print(MessageOrBuilder message) throws IOException {
      StringBuilder builder = new StringBuilder();
      appendTo(message, builder);
      return builder.toString();
    }
  }

  /**
   * An interface for json formatting that can be used in combination with the
   * omittingInsignificantWhitespace() method.
   */
  interface TextGenerator {
    void indent();

    void outdent();

    void print(final CharSequence text) throws IOException;
  }

  /** Format the json without indentation */
  private static final class CompactTextGenerator implements TextGenerator {
    private final Appendable output;

    private CompactTextGenerator(final Appendable output) {
      this.output = output;
    }

    /** ignored by compact printer */
    @Override
    public void indent() {}

    /** ignored by compact printer */
    @Override
    public void outdent() {}

    /** Print text to the output stream. */
    @Override
    public void print(final CharSequence text) throws IOException {
      output.append(text);
    }
  }
  /** A TextGenerator adds indentation when writing formatted text. */
  private static final class PrettyTextGenerator implements TextGenerator {
    private final Appendable output;
    private final StringBuilder indent = new StringBuilder();
    private boolean atStartOfLine = true;

    private PrettyTextGenerator(final Appendable output) {
      this.output = output;
    }

    /**
     * Indent text by two spaces. After calling Indent(), two spaces will be inserted at the
     * beginning of each line of text. Indent() may be called multiple times to produce deeper
     * indents.
     */
    @Override
    public void indent() {
      indent.append("  ");
    }

    /** Reduces the current indent level by two spaces, or crashes if the indent level is zero. */
    @Override
    public void outdent() {
      final int length = indent.length();
      if (length < 2) {
        throw new IllegalArgumentException("Outdent() without matching Indent().");
      }
      indent.delete(length - 2, length);
    }

    /** Print text to the output stream. */
    @Override
    public void print(final CharSequence text) throws IOException {

      final int size = text.length();
      int pos = 0;

      for (int i = 0; i < size; i++) {
        if (text.charAt(i) == '\n') {
          write(text.subSequence(pos, i + 1));
          pos = i + 1;
          atStartOfLine = true;
        }
      }
      write(text.subSequence(pos, size));
    }

    private void write(final CharSequence data) throws IOException {
      if (data.length() == 0) {
        return;
      }
      if (atStartOfLine) {
        atStartOfLine = false;
        output.append(indent);
      }
      output.append(data);
    }
  }

  /** A Printer converts protobuf messages to JSON format. */
  private static final class PrinterImpl {
    private final TextGenerator generator;
    private final CharSequence blankOrSpace;
    private final CharSequence blankOrNewLine;
    private final ZoneId defaultTimeZone;
    private final FhirJsonFormat jsonFormat;

    PrinterImpl(
        Appendable jsonOutput,
        boolean omittingInsignificantWhitespace,
        ZoneId defaultTimeZone,
        FhirJsonFormat jsonFormat) {
      // json format related properties, determined by printerType
      if (omittingInsignificantWhitespace) {
        this.generator = new CompactTextGenerator(jsonOutput);
        this.blankOrSpace = "";
        this.blankOrNewLine = "";
      } else {
        this.generator = new PrettyTextGenerator(jsonOutput);
        this.blankOrSpace = " ";
        this.blankOrNewLine = "\n";
      }
      this.defaultTimeZone = defaultTimeZone;
      this.jsonFormat = jsonFormat;
    }

    void print(MessageOrBuilder message) throws IOException {
      WellKnownTypePrinter specialPrinter =
          wellKnownTypePrinters.get(message.getDescriptorForType().getFullName());
      if (specialPrinter != null) {
        specialPrinter.print(this, message);
      } else if (AnnotationUtils.isReference(message)) {
        printReference(message);
      } else {
        printMessage(message);
      }
    }

    private interface WellKnownTypePrinter {
      void print(PrinterImpl printer, MessageOrBuilder message) throws IOException;
    }

    private static final Map<String, WellKnownTypePrinter> wellKnownTypePrinters =
        buildWellKnownTypePrinters();

    private static Map<String, WellKnownTypePrinter> buildWellKnownTypePrinters() {
      Map<String, WellKnownTypePrinter> printers = new HashMap<>();
      // Special-case contained resources.
      WellKnownTypePrinter containedResourcesPrinter =
          new WellKnownTypePrinter() {
            @Override
            public void print(PrinterImpl printer, MessageOrBuilder message) throws IOException {
              printer.printContainedResource(message);
            }
          };
      printers.put(
          com.google.fhir.stu3.proto.ContainedResource.getDescriptor().getFullName(),
          containedResourcesPrinter);
      printers.put(
          com.google.fhir.r4.core.ContainedResource.getDescriptor().getFullName(),
          containedResourcesPrinter);
      // Special-case extensions for analytics use.
      WellKnownTypePrinter stu3ExtensionPrinter =
          new WellKnownTypePrinter() {
            @Override
            public void print(PrinterImpl printer, MessageOrBuilder message) throws IOException {
              printer.printExtension((com.google.fhir.stu3.proto.Extension) message);
            }
          };
      WellKnownTypePrinter r4ExtensionPrinter =
          new WellKnownTypePrinter() {
            @Override
            public void print(PrinterImpl printer, MessageOrBuilder message) throws IOException {
              printer.printExtension((com.google.fhir.r4.core.Extension) message);
            }
          };
      printers.put(
          com.google.fhir.stu3.proto.Extension.getDescriptor().getFullName(), stu3ExtensionPrinter);
      printers.put(
          com.google.fhir.r4.core.Extension.getDescriptor().getFullName(), r4ExtensionPrinter);

      WellKnownTypePrinter anyPrinter =
          new WellKnownTypePrinter() {
            @Override
            public void print(PrinterImpl printer, MessageOrBuilder message) throws IOException {
              // TODO: handle STU3 Any.
              printer.printContainedResource(
                  ((Any) message).unpack(com.google.fhir.r4.core.ContainedResource.class));
            }
          };
      printers.put(Any.getDescriptor().getFullName(), anyPrinter);

      return printers;
    }

    /** Prints a contained resource field. */
    private void printContainedResource(MessageOrBuilder message) throws IOException {
      for (Map.Entry<FieldDescriptor, Object> field : message.getAllFields().entrySet()) {
        if (jsonFormat == FhirJsonFormat.ANALYTIC) {
          /* We print only the type of the contained resource here. */
          generator.print(
              "\""
                  + ((Message) field.getValue())
                      .getDescriptorForType()
                      .getOptions()
                      .getExtension(Annotations.fhirStructureDefinitionUrl)
                  + "\"");
        } else {
          /* Print the entire contained resource. */
          print((Message) field.getValue());
        }
      }
    }

    /** Prints an extension field. */
    private void printExtension(com.google.fhir.stu3.proto.Extension extension) throws IOException {
      if (jsonFormat == FhirJsonFormat.ANALYTIC) {
        generator.print("\"" + extension.getUrl().getValue() + "\"");
      } else {
        printMessage(extension);
      }
    }

    /** Prints an extension field. */
    private void printExtension(com.google.fhir.r4.core.Extension extension) throws IOException {
      if (jsonFormat == FhirJsonFormat.ANALYTIC) {
        generator.print("\"" + extension.getUrl().getValue() + "\"");
      } else {
        printMessage(extension);
      }
    }

    private static String referenceIdToStringUri(FieldDescriptor field, Message refId) {
      // Convert to CamelCase and strip out the trailing "Id"
      String type = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, field.getName());
      type = type.substring(0, type.length() - 2);
      Descriptor refIdDescriptor = refId.getDescriptorForType();
      String uri = type + "/" + ResourceUtils.<String>getValue(refId);
      FieldDescriptor historyField = refIdDescriptor.findFieldByName("history");
      if (refId.hasField(historyField)) {
        uri =
            uri
                + "/_history/"
                + ResourceUtils.<String>getValue((Message) refId.getField(historyField));
      }
      return uri;
    }

    /** Prints a reference field. */
    private void printReference(MessageOrBuilder reference) throws IOException {
      FieldDescriptor uriField = reference.getDescriptorForType().findFieldByName("uri");
      if (reference.hasField(uriField) || jsonFormat == FhirJsonFormat.ANALYTIC) {
        printMessage(reference);
      } else {
        // Restore the Uri field.
        String newUri = null;
        FieldDescriptor fragment = reference.getDescriptorForType().findFieldByName("fragment");
        if (reference.hasField(fragment)) {
          newUri = "#" + ResourceUtils.<String>getValue((Message) reference.getField(fragment));
        } else {
          for (Map.Entry<FieldDescriptor, Object> entry : reference.getAllFields().entrySet()) {
            if (entry.getKey().getContainingOneof() != null) {
              newUri = referenceIdToStringUri(entry.getKey(), (Message) entry.getValue());
            }
          }
        }
        if (newUri != null) {
          Message.Builder builder = ((Message) reference).toBuilder();
          ProtoUtils.fieldWiseCopy(
              com.google.fhir.stu3.proto.String.newBuilder().setValue(newUri).build(),
              builder.getFieldBuilder(uriField));
          printMessage(builder);
        } else {
          printMessage(reference);
        }
      }
    }

    private boolean maybeStartMessage(boolean printedField) throws IOException {
      if (!printedField) {
        generator.print("{" + blankOrNewLine);
        generator.indent();
      } else {
        // Add line-endings for the previous field.
        generator.print("," + blankOrNewLine);
      }
      return true;
    }

    private boolean maybePrintFieldSeparator(boolean printedElement) throws IOException {
      if (printedElement) {
        generator.print("," + blankOrNewLine);
      }
      return true;
    }

    /** Prints a regular message. */
    private void printMessage(MessageOrBuilder message) throws IOException {
      boolean printedField = false;

      if (AnnotationUtils.isResource(message.getDescriptorForType())
          && jsonFormat == FhirJsonFormat.PURE) {
        printedField = maybeStartMessage(printedField);
        generator.print(
            "\"resourceType\":"
                + blankOrSpace
                + "\""
                + message.getDescriptorForType().getName()
                + "\"");
      }

      for (Map.Entry<FieldDescriptor, Object> entry : message.getAllFields().entrySet()) {
        printedField = maybeStartMessage(printedField);
        String name = entry.getKey().getJsonName();
        if (AnnotationUtils.isChoiceType(entry.getKey()) && jsonFormat == FhirJsonFormat.PURE) {
          printChoiceField(entry.getKey(), entry.getValue());
        } else if (isPrimitiveType(entry.getKey())) {
          printPrimitiveField(name, entry.getKey(), entry.getValue());
        } else {
          printMessageField(name, entry.getKey(), entry.getValue());
        }
      }

      if (printedField) {
        generator.print(blankOrNewLine);
        generator.outdent();
        generator.print("}");
      } else {
        generator.print("null");
      }
    }

    private void printChoiceField(FieldDescriptor field, Object value) throws IOException {
      Message message = (Message) value;
      if (message.getAllFields().size() != 1) {
        throw new IllegalArgumentException(
            "Invalid value for choice field " + field.getName() + ": " + message);
      }
      Map.Entry<FieldDescriptor, Object> entry =
          message.getAllFields().entrySet().iterator().next();
      String name =
          field.getJsonName()
              + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, entry.getKey().getJsonName());
      if (isPrimitiveType(entry.getKey())) {
        printPrimitiveField(name, entry.getKey(), entry.getValue());
      } else {
        printMessageField(name, entry.getKey(), entry.getValue());
      }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private void printPrimitiveField(String name, FieldDescriptor field, Object value)
        throws IOException {
      boolean printedElement = false;
      if (field.isRepeated()) {
        boolean hasValue = false;
        boolean hasExtension = false;
        List<MessageOrBuilder> list = (List<MessageOrBuilder>) value;
        List<PrimitiveWrapper> wrappers = new ArrayList<>();
        List<MessageOrBuilder> elements = new ArrayList<>();
        for (MessageOrBuilder message : list) {
          PrimitiveWrapper wrapper = PrimitiveWrappers.primitiveWrapperOf(message, defaultTimeZone);
          wrappers.add(wrapper);
          hasValue = hasValue || wrapper.hasValue();
          Element element = wrapper.getElement();
          elements.add(element != null ? element : Element.getDefaultInstance());
          hasExtension = hasExtension || (element != null);
        }
        if (hasValue) {
          generator.print("\"" + name + "\":" + blankOrSpace);
          generator.print("[" + blankOrNewLine);
          generator.indent();
          for (PrimitiveWrapper wrapper : wrappers) {
            printedElement = maybePrintFieldSeparator(printedElement);
            generator.print(wrapper.toJson().toString());
          }
          generator.print(blankOrNewLine);
          generator.outdent();
          generator.print("]");
        }
        if (hasExtension && jsonFormat == FhirJsonFormat.PURE) {
          printedElement = maybePrintFieldSeparator(printedElement);
          generator.print("\"_" + name + "\":" + blankOrSpace);
          printRepeatedMessage(elements);
        }
      } else {
        Message message = (Message) value;
        String messageName = message.getDescriptorForType().getFullName();
        if (jsonFormat == FhirJsonFormat.ANALYTIC
            && (messageName.equals(
                    com.google.fhir.stu3.proto.ReferenceId.getDescriptor().getFullName())
                || messageName.equals(
                    com.google.fhir.r4.core.ReferenceId.getDescriptor().getFullName()))) {
          // TODO: detect ReferenceId with an annotation
          String referenceValue =
              (String) message.getField(message.getDescriptorForType().findFieldByName("value"));
          generator.print("\"" + name + "\":" + blankOrSpace + "\"" + referenceValue + "\"");
        } else {
          PrimitiveWrapper wrapper = PrimitiveWrappers.primitiveWrapperOf(message, defaultTimeZone);
          if (wrapper.hasValue()) {
            generator.print("\"" + name + "\":" + blankOrSpace + wrapper.toJson());
            printedElement = true;
          }
          Element element = wrapper.getElement();
          if (element != null && jsonFormat == FhirJsonFormat.PURE) {
            printedElement = maybePrintFieldSeparator(printedElement);
            generator.print("\"_" + name + "\":" + blankOrSpace);
            print(element);
          }
        }
      }
    }

    @SuppressWarnings("unchecked")
    private void printMessageField(String name, FieldDescriptor field, Object value)
        throws IOException {
      generator.print("\"" + name + "\":" + blankOrSpace);
      if (field.isRepeated()) {
        printRepeatedMessage((List<MessageOrBuilder>) value);
      } else {
        print((MessageOrBuilder) value);
      }
    }

    private void printRepeatedMessage(List<MessageOrBuilder> value) throws IOException {
      generator.print("[" + blankOrNewLine);
      generator.indent();
      boolean printedElement = false;
      for (MessageOrBuilder element : value) {
        printedElement = maybePrintFieldSeparator(printedElement);
        print(element);
      }
      generator.print(blankOrNewLine);
      generator.outdent();
      generator.print("]");
    }
  }

  /**
   * Return a {@link Parser} instance which can parse json-format FHIR messages. The returned
   * instance is thread-safe.
   */
  public static Parser getParser() {
    return Parser.newBuilder().build();
  }

  /**
   * Returns a specialized parser that is able of parsing non-R4 spec resources (CodeSystems,
   * ValueSets, and StructureDefinitions) into R4 versions for useinprotogeneration. These are *NOT*
   * all-purpose version converters, and should *NOT* be used for purposes other than
   * protogeneration.
   */
  public static Parser getSpecParser(FhirVersion version) {
    switch (version) {
      case STU3:
        return Parser.newBuilder().withStu3ProtoGenTransformer().build();
      case R4:
        return Parser.newBuilder().build();
      default:
        throw new IllegalArgumentException(
            "Fhir version not supported for getSpecParser: " + version);
    }
  }

  /**
   * Parser for json-format FHIR proto instances. This class is thread-safe.
   *
   * <p>Use {@link JsonFormat#getParser()} to obtain the default parser, or {@link Builder} to
   * control the parser behavior.
   */
  public static final class Parser {
    private final JsonParser jsonParser = new JsonParser();
    private final ProtoGenTransformer protoGenTransformer;
    private final ZoneId defaultTimeZone;

    private Parser(ZoneId defaultTimeZone, ProtoGenTransformer protoGenTransformer) {
      this.protoGenTransformer = protoGenTransformer;
      this.defaultTimeZone = defaultTimeZone;
    }

    public static Parser withDefaultTimeZone(ZoneId defaultTimeZone) {
      return Parser.newBuilder().withDefaultTimeZone(defaultTimeZone).build();
    }

    /** Returns a new instance of {@link Builder} with default parameters. */
    public static Builder newBuilder() {
      return new Builder(ZoneId.systemDefault());
    }

    /** Builder that can be used to obtain new instances of {@link Parser}. */
    static final class Builder {
      private ZoneId defaultTimeZone;
      private ProtoGenTransformer protoGenTransformer;

      Builder(ZoneId defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
        this.protoGenTransformer = ProtoGenTransformer.NO_OP;
      }

      /*
       * Create a new {@link Parser} with a default timezone. Any Dates and DateTimes parsed by
       * this instance which do not have explicit timezone or timezone offset information will be
       * assumed to be measured in the default timezone.
       */
      Builder withDefaultTimeZone(ZoneId defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
        return this;
      }

      Builder withStu3ProtoGenTransformer() {
        return withProtoGenTransformer(ProtoGenTransformer.STU3_TO_R4);
      }

      Builder withProtoGenTransformer(ProtoGenTransformer protoGenTransformer) {
        this.protoGenTransformer = protoGenTransformer;
        return this;
      }

      Parser build() {
        return new Parser(defaultTimeZone, protoGenTransformer);
      }
    }

    /**
     * Parse a text-format message from {@code input} and merge the contents into {@code builder}.
     */
    public <T extends Message.Builder> T merge(final Reader input, final T builder) {
      JsonReader reader = new JsonReader(input);
      JsonElement json = jsonParser.parse(reader);
      if (json.isJsonObject()) {
        mergeMessage(json.getAsJsonObject(), builder);
      } else {
        PrimitiveWrappers.parseAndWrap(json, builder, defaultTimeZone).copyInto(builder);
      }
      return builder;
    }

    /**
     * Parse a text-format message from {@code input} and merge the contents into {@code builder}.
     */
    public <T extends Message.Builder> T merge(final CharSequence input, final T builder) {
      merge(new StringReader(input.toString()), builder);
      return builder;
    }

    private Map<String, FieldDescriptor> getFieldMap(Descriptor descriptor) {
      Map<String, FieldDescriptor> nameToDescriptorMap = new HashMap<>();
      for (FieldDescriptor field : descriptor.getFields()) {
        if (AnnotationUtils.isChoiceType(field)) {
          // All the contained fields go in this message.
          Map<String, FieldDescriptor> innerMap = getFieldMap(field.getMessageType());
          for (Map.Entry<String, FieldDescriptor> entry : innerMap.entrySet()) {
            String childFieldName = entry.getKey();
            if (childFieldName.startsWith("_")) {
              // Convert primitive extension field name to field on choice type, e.g.,
              // _boolean -> _valueBoolean for Extension.value.
              nameToDescriptorMap.put(
                  "_"
                      + field.getJsonName()
                      + CaseFormat.LOWER_CAMEL.to(
                          CaseFormat.UPPER_CAMEL, entry.getKey().substring(1)),
                  field);
            } else {
              nameToDescriptorMap.put(
                  field.getJsonName()
                      + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, entry.getKey()),
                  field);
            }
          }
        } else {
          nameToDescriptorMap.put(field.getJsonName(), field);
          if (isPrimitiveType(field)) {
            // Handle extensions on primitive fields.
            nameToDescriptorMap.put("_" + field.getJsonName(), field);
          }
        }
      }
      return nameToDescriptorMap;
    }

    private void mergeMessage(JsonObject json, Message.Builder builder) {
      // TODO: Use an annotation here.
      if (builder.getDescriptorForType().getName().equals("ContainedResource")) {
        // We handle contained resources in a special way, since we need to inspect the input to
        // determine its type.
        parseContainedResource(json, builder);
        return;
      }

      // Create a map of what to expect.
      Descriptor descriptor = builder.getDescriptorForType();
      Map<String, FieldDescriptor> nameToDescriptorMap = getFieldMap(descriptor);

      protoGenTransformer.performMultiFieldConversions(json, builder);

      for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
        JsonElement element = entry.getValue();
        String fieldName = entry.getKey();
        if (protoGenTransformer.performSpecializedConversion(element, fieldName, builder)) {
          // This field was handled via custom logic.
          continue;
        }
        if (nameToDescriptorMap.containsKey(fieldName)) {
          FieldDescriptor field = nameToDescriptorMap.get(fieldName);
          if (field.getMessageType().getFullName().equals(Any.getDescriptor().getFullName())) {
            JsonArray array = element.getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
              Message.Builder containedBuilder = getContainedResourceForMessage(builder);
              parseContainedResource(array.get(i).getAsJsonObject(), containedBuilder);
              builder.addRepeatedField(field, Any.pack(containedBuilder.build()));
            }
          } else if (AnnotationUtils.isChoiceType(field)) {
            mergeChoiceField(field, fieldName, element, builder);
          } else {
            mergeField(field, element, builder);
          }
        } else if (fieldName.equals("resourceType")) {
          String inputType = element.getAsString();
          if (!AnnotationUtils.isResource(descriptor) || !inputType.equals(descriptor.getName())) {
            throw new IllegalArgumentException(
                "Trying to parse a resource of type "
                    + inputType
                    + ", but the target field is of type "
                    + descriptor.getFullName());
          }
        } else {
          String names = "";
          for (Map.Entry<String, FieldDescriptor> e : nameToDescriptorMap.entrySet()) {
            names = names + " " + e.getKey();
          }
          throw new IllegalArgumentException(
              "Unknown field "
                  + fieldName
                  + " in input of expected type "
                  + builder.getDescriptorForType().getFullName()
                  + ", known fields: "
                  + names);
        }
      }
      if (AnnotationUtils.isReference(builder.getDescriptorForType())) {
        // Special-case the "reference" field, which was parsed into the uri field.
        ResourceUtils.splitIfRelativeReference(builder);
      }
    }

    private void mergeChoiceField(
        FieldDescriptor field, String fieldName, JsonElement json, Message.Builder builder) {
      Descriptor descriptor = field.getMessageType();
      Map<String, FieldDescriptor> nameToDescriptorMap = getFieldMap(descriptor);
      String choiceFieldName;
      if (fieldName.startsWith("_")) {
        choiceFieldName =
            "_"
                + CaseFormat.UPPER_CAMEL.to(
                    CaseFormat.LOWER_CAMEL, fieldName.substring(1 + field.getJsonName().length()));
      } else {
        choiceFieldName =
            CaseFormat.UPPER_CAMEL.to(
                CaseFormat.LOWER_CAMEL, fieldName.substring(field.getJsonName().length()));
      }
      FieldDescriptor choiceField = nameToDescriptorMap.get(choiceFieldName);
      if (choiceField == null) {
        throw new IllegalArgumentException(
            "Can't find field: "
                + choiceFieldName
                + " in type "
                + descriptor.getName()
                + " for field "
                + field.getName());
      }
      Message.Builder choiceTypeBuilder;
      if (builder.hasField(field)) {
        choiceTypeBuilder = ((Message) builder.getField(field)).toBuilder();
      } else {
        choiceTypeBuilder = builder.newBuilderForField(field);
      }
      mergeField(choiceField, json, choiceTypeBuilder);
      builder.setField(field, choiceTypeBuilder.build());
    }

    private void mergeField(FieldDescriptor field, JsonElement json, Message.Builder builder) {
      if (!isPrimitiveType(field)) {
        if ((field.isRepeated() && builder.getRepeatedFieldCount(field) > 0)
            || (!field.isRepeated() && builder.hasField(field))) {
          throw new IllegalArgumentException(
              "Field " + field.getFullName() + " has already been set.");
        }

        if (field.getContainingOneof() != null) {
          FieldDescriptor existing = builder.getOneofFieldDescriptor(field.getContainingOneof());
          if (existing != null) {
            throw new IllegalArgumentException(
                "Cannot set field "
                    + field.getFullName()
                    + " because another field "
                    + existing.getFullName()
                    + " belonging to the same oneof has already been set ");
          }
        }
      }
      if (field.isRepeated()) {
        if (!json.isJsonArray()) {
          throw new IllegalArgumentException(
              "Expected JsonArray for repeated field: " + field.getFullName());
        }
        mergeRepeatedField(field, json.getAsJsonArray(), builder);
      } else {
        Message value = parseFieldValue(field, json, builder);
        if (builder.hasField(field) && isPrimitiveType(field)) {
          builder.setField(field, mergePrimitiveField((Message) builder.getField(field), value));
        } else {
          builder.setField(field, value);
        }
      }
    }

    private Message mergePrimitiveField(Message first, Message second) {
      boolean firstHasValue = PrimitiveWrapper.hasValue(first);
      boolean secondHasValue = PrimitiveWrapper.hasValue(second);
      boolean hasValue = firstHasValue || secondHasValue;
      Message.Builder fieldMerger = first.newBuilderForType();

      fieldMerger.mergeFrom(first);
      fieldMerger.mergeFrom(second);
      // Clear the PrimitiveHasNoValueExtension if we have too many copies of it.
      if (!firstHasValue || !secondHasValue) {
        ExtensionWrapper extensions =
            ExtensionWrapper.fromExtensionsIn(fieldMerger)
                .clearMatchingExtensions(PRIMITIVE_HAS_NO_VALUE);
        // Add the PrimitiveHasNoValueExtension back if necessary.
        if (!hasValue) {
          extensions.add(PRIMITIVE_HAS_NO_VALUE);
        }
        fieldMerger.clearField(fieldMerger.getDescriptorForType().findFieldByName("extension"));
        extensions.addToMessage(fieldMerger);
      }
      return fieldMerger.build();
    }

    private void mergeRepeatedField(
        FieldDescriptor field, JsonArray json, Message.Builder builder) {
      boolean hasExistingField = builder.getRepeatedFieldCount(field) > 0;
      if (hasExistingField && builder.getRepeatedFieldCount(field) != json.size()) {
        throw new IllegalArgumentException("Repeated field length mismatch for field: " + field);
      }

      for (int i = 0; i < json.size(); ++i) {
        Message value = parseFieldValue(field, json.get(i), builder);
        if (hasExistingField) {
          builder.setRepeatedField(
              field, i, mergePrimitiveField(value, (Message) builder.getRepeatedField(field, i)));
        } else {
          builder.addRepeatedField(field, value);
        }
      }
    }

    private static final ImmutableTable<FhirVersion, String, FieldDescriptor> RESOURCE_TYPES =
        createResourceTypes();

    private static ImmutableTable<FhirVersion, String, FieldDescriptor> createResourceTypes() {
      Table<FhirVersion, String, FieldDescriptor> table = HashBasedTable.create();
      for (FieldDescriptor field :
          com.google.fhir.stu3.proto.ContainedResource.getDescriptor().getFields()) {
        table.put(FhirVersion.STU3, field.getMessageType().getName(), field);
      }
      for (FieldDescriptor field :
          com.google.fhir.r4.core.ContainedResource.getDescriptor().getFields()) {
        table.put(FhirVersion.R4, field.getMessageType().getName(), field);
      }
      return ImmutableTable.copyOf(table);
    }

    private void parseContainedResource(JsonObject json, Message.Builder builder) {
      String resourceType = json.get("resourceType").getAsString();
      FieldDescriptor resource =
          RESOURCE_TYPES.get(
              AnnotationUtils.getFhirVersion(builder.getDescriptorForType()), resourceType);
      if (resource == null) {
        throw new IllegalArgumentException("Unsupported resource type: " + resourceType);
      }
      Message.Builder innerBuilder = builder.newBuilderForField(resource);
      mergeMessage(json, innerBuilder);
      builder.setField(resource, innerBuilder.build()).build();
    }

    // Supress lack of compile-time type safety because of proto newBuilderForType
    private Message parseFieldValue(
        FieldDescriptor field, JsonElement json, Message.Builder builder) {
      // Everything at the fhir-spec level should be a Message.
      if (field.getType() != FieldDescriptor.Type.MESSAGE) {
        throw new IllegalArgumentException(
            "Error in FHIR proto definition: Field " + field + " is not a message.");
      }

      Message.Builder subBuilder = builder.newBuilderForField(field);

      if (isPrimitiveType(field)) {
        if (json.isJsonObject()) {
          // Special-case primitive type extensions
          mergeMessage((JsonObject) json, subBuilder);
        }
        try {
          return PrimitiveWrappers.parseAndWrap(json, subBuilder, defaultTimeZone)
              .copyInto(subBuilder)
              .build();
        } catch (IllegalArgumentException e) {
          throw new IllegalArgumentException("Error parsing field: " + field.getFullName(), e);
        }
      }

      if (!json.isJsonObject()) {
        if (json.isJsonArray() && json.getAsJsonArray().size() == 1) {
          JsonElement soleElement = json.getAsJsonArray().get(0);
          if (soleElement.isJsonObject()) {
            mergeMessage(soleElement.getAsJsonObject(), subBuilder);
            return subBuilder.build();
          }
        }
        throw new IllegalArgumentException("Expected JsonObject for field " + field);
      } else {
        mergeMessage(json.getAsJsonObject(), subBuilder);
        return subBuilder.build();
      }
    }
  } // End JsonFormat class

  private static Message.Builder getContainedResourceForMessage(MessageOrBuilder input) {
    switch (AnnotationUtils.getFhirVersion(input.getDescriptorForType())) {
      case R4:
        return com.google.fhir.r4.core.ContainedResource.newBuilder();
      default:
        throw new IllegalArgumentException(
            "Any packing not supported for fhir version: "
                + AnnotationUtils.getFhirVersion(input.getDescriptorForType()));
    }
  }

  public static String getOriginalCode(EnumValueDescriptorProtoOrBuilder codeEnum) {
    return CodeWrapper.getOriginalCode(codeEnum);
  }

  public static String enumCodeToFhirCase(String enumCase) {
    return CodeWrapper.enumCodeToFhirCase(enumCase);
  }
}
