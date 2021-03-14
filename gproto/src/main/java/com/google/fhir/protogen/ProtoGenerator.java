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

package com.google.fhir.protogen;

import static com.google.common.collect.ImmutableMap.toImmutableMap;
import static com.google.fhir.protogen.GeneratorUtils.getElementById;
import static com.google.fhir.protogen.GeneratorUtils.getParent;
import static com.google.fhir.protogen.GeneratorUtils.isExtensionProfile;
import static com.google.fhir.protogen.GeneratorUtils.isProfile;
import static com.google.fhir.protogen.GeneratorUtils.isSlice;
import static com.google.fhir.protogen.GeneratorUtils.lastIdToken;
import static com.google.fhir.protogen.GeneratorUtils.nameFromQualifiedName;
import static com.google.fhir.protogen.GeneratorUtils.toFieldNameCase;
import static com.google.fhir.protogen.GeneratorUtils.toFieldTypeCase;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

import com.google.common.base.Ascii;
import com.google.common.base.CaseFormat;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.fhir.common.AnnotationUtils;
import com.google.fhir.common.FhirVersion;
import com.google.fhir.common.ProtoUtils;
import com.google.fhir.proto.Annotations;
import com.google.fhir.proto.PackageInfo;
import com.google.fhir.proto.PackageInfo.ContainedResourceBehavior;
import com.google.fhir.proto.ProtoGeneratorAnnotations;
import com.google.fhir.protogen.GeneratorUtils.IdToken;
import com.google.fhir.protogen.GeneratorUtils.QualifiedType;
import com.google.fhir.r4.core.BindingStrengthCode;
import com.google.fhir.r4.core.Canonical;
import com.google.fhir.r4.core.CodeableConcept;
import com.google.fhir.r4.core.ConstraintSeverityCode;
import com.google.fhir.r4.core.ElementDefinition;
import com.google.fhir.r4.core.Extension;
import com.google.fhir.r4.core.StructureDefinition;
import com.google.fhir.r4.core.StructureDefinitionKindCode;
import com.google.fhir.r4.core.TypeDerivationRuleCode;
import com.google.fhir.r4.core.Uri;
import com.google.fhir.stu3.proto.CodingWithFixedSystem;
import com.google.fhir.stu3.proto.ElementDefinitionExplicitTypeName;
import com.google.fhir.stu3.proto.Instant;
import com.google.fhir.wrappers.CanonicalWrapper;
import com.google.fhir.wrappers.ExtensionWrapper;
import com.google.fhir.wrappers.InstantWrapper;
import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldOptions;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder;
import com.google.protobuf.DescriptorProtos.FileOptions;
import com.google.protobuf.DescriptorProtos.MessageOptions;
import com.google.protobuf.DescriptorProtos.OneofDescriptorProto;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Message;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/** A class which turns FHIR StructureDefinitions into protocol messages. */
// TODO: Move a bunch of the public static methods into ProtoGeneratorUtils.
public class ProtoGenerator {

  // Map of time-like primitive type ids to supported granularity
  private static final ImmutableMap<String, List<String>> TIME_LIKE_PRECISION_MAP =
      ImmutableMap.of(
          "date", ImmutableList.of("YEAR", "MONTH", "DAY"),
          "dateTime",
              ImmutableList.of("YEAR", "MONTH", "DAY", "SECOND", "MILLISECOND", "MICROSECOND"),
          "instant", ImmutableList.of("SECOND", "MILLISECOND", "MICROSECOND"),
          "time", ImmutableList.of("SECOND", "MILLISECOND", "MICROSECOND"));
  private static final ImmutableSet<String> TYPES_WITH_TIMEZONE =
      ImmutableSet.of("date", "dateTime", "instant");

  // Certain field names are reserved symbols in various languages.
  private static final ImmutableSet<String> RESERVED_FIELD_NAMES =
      ImmutableSet.of("assert", "for", "hasAnswer", "package", "string", "class");

  private static final EnumDescriptorProto PRECISION_ENUM =
      EnumDescriptorProto.newBuilder()
          .setName("Precision")
          .addValue(
              EnumValueDescriptorProto.newBuilder()
                  .setName("PRECISION_UNSPECIFIED")
                  .setNumber(0)
                  .build())
          .build();

  private static final FieldDescriptorProto TIMEZONE_FIELD =
      FieldDescriptorProto.newBuilder()
          .setName("timezone")
          .setLabel(FieldDescriptorProto.Label.LABEL_OPTIONAL)
          .setType(FieldDescriptorProto.Type.TYPE_STRING)
          .setNumber(2)
          .build();

  private static final ImmutableMap<String, FieldDescriptorProto.Type> PRIMITIVE_TYPE_OVERRIDES =
      ImmutableMap.of(
          "base64Binary", FieldDescriptorProto.Type.TYPE_BYTES,
          "boolean", FieldDescriptorProto.Type.TYPE_BOOL,
          "integer", FieldDescriptorProto.Type.TYPE_SINT32,
          "positiveInt", FieldDescriptorProto.Type.TYPE_UINT32,
          "unsignedInt", FieldDescriptorProto.Type.TYPE_UINT32);

  // Exclude constraints from the DomainResource until we refactor
  // them to a common place rather on every resource.
  // TODO: remove these with the above refactoring.
  private static final ImmutableSet<String> DOMAIN_RESOURCE_CONSTRAINTS =
      ImmutableSet.of(
          "contained.contained.empty()",
          "contained.meta.versionId.empty() and contained.meta.lastUpdated.empty()",
          "contained.where((('#'+id in (%resource.descendants().reference"
              + " | %resource.descendants().as(canonical) | %resource.descendants().as(uri)"
              + " | %resource.descendants().as(url))) or descendants().where(reference = '#')"
              + ".exists() or descendants().where(as(canonical) = '#').exists() or"
              + " descendants().where(as(canonical) = '#').exists()).not())"
              + ".trace('unmatched', id).empty()",
          "text.div.exists()",
          "text.`div`.exists()",
          "contained.meta.security.empty()");

  // FHIR elements may have core constraint definitions that do not add
  // value to protocol buffers, so we exclude them.
  private static final ImmutableSet<String> EXCLUDED_FHIR_CONSTRAINTS =
      ImmutableSet.<String>builder()
          .addAll(DOMAIN_RESOURCE_CONSTRAINTS)
          .add(
              "extension.exists() != value.exists()",
              "hasValue() | (children().count() > id.count())",
              "hasValue() or (children().count() > id.count())",
              // Exclude the FHIR-provided element name regex, since field names are known at
              // compile time
              "path.matches('[^\\\\s\\\\.,:;\\\\\\'\"\\\\/|?!@#$%&*()\\\\[\\\\]{}]{1,64}"
                  + "(\\\\.[^\\\\s\\\\.,:;\\\\\\'\"\\\\/|?!@#$%&*()\\\\[\\\\]{}]{1,64}"
                  + "(\\\\[x\\\\])?(\\\\:[^\\\\s\\\\.]+)?)*')",
              // "telcom or endpoint" is an invalid expression that shows up in USCore
              "telecom or endpoint",
              "fullUrl.contains('/_history/').not()", // See https://jira.hl7.org/browse/FHIR-25525
              // Invalid FHIRPath constraint on StructureDefinition.snapshot in STU3. Fixed in R4
              // but unlikely to be backported.
              "element.all(definition and min and max)",
              // See https://jira.hl7.org/browse/FHIR-25796
              "probability is decimal implies (probability as decimal) <= 100")
          .build();

  private static final String FHIRPATH_TYPE_PREFIX = "http://hl7.org/fhirpath/";

  private static final String FHIR_TYPE_EXTENSION_URL =
      "http://hl7.org/fhir/StructureDefinition/structuredefinition-fhir-type";

  // Should we use custom types for constrained references?
  private static final boolean USE_TYPED_REFERENCES = false;

  // Sometimes (especially in STU3) the spec contains bugs between the "snapshot" view of a
  // structure and the "differential" view.  Enable this to fix those when possible.
  // It is disabled for 4.0.1 because that fixed the original bug, that has a different bug,
  // that breaks the fixer
  // See https://jira.hl7.org/browse/FHIR-25275
  private static final boolean RECONCILE_SNAPSHOTS = false;

  // Mapping from urls for StructureDefinition to data about that StructureDefinition.
  private final ImmutableMap<String, StructureDefinitionData> structDefDataByUrl;
  // Mapping from id to StructureDefinition data about all known base (i.e., not profile) types.
  private final ImmutableMap<String, StructureDefinition> baseStructDefsById;

  private final ImmutableMap<String, Set<String>> coreTypeDefinitionsByFile;

  private static Set<String> getTypesDefinedInFile(FileDescriptor file) {
    return file.getMessageTypes().stream()
        .flatMap(desc -> getTypesDefinedInType(desc).stream())
        .collect(Collectors.toSet());
  }

  private static Set<String> getTypesDefinedInType(Descriptor type) {
    Set<String> types = new HashSet<>();
    types.add(type.getFullName());
    for (Descriptor subType : type.getNestedTypes()) {
      types.addAll(getTypesDefinedInType(subType));
    }
    for (EnumDescriptor enumType : type.getEnumTypes()) {
      types.add(enumType.getFullName());
    }
    return types;
  }

  // The package to write new protos to.
  private final PackageInfo packageInfo;
  // The fhir version to use (e.g., STU3, R4).
  // This determines which core dependencies (e.g., datatypes.proto) to use.
  private final FhirVersion fhirVersion;

  private final ValueSetGenerator valueSetGenerator;

  private static class StructureDefinitionData {
    final StructureDefinition structDef;
    final String inlineType;
    final String protoPackage;

    StructureDefinitionData(StructureDefinition structDef, String inlineType, String protoPackage) {
      this.structDef = structDef;
      this.inlineType = inlineType;
      this.protoPackage = protoPackage;
    }
  }

  public ProtoGenerator(PackageInfo packageInfo, Set<FhirPackage> fhirPackages) {
    this(packageInfo, fhirPackages, null);
  }

  public ProtoGenerator(
      PackageInfo packageInfo, Set<FhirPackage> fhirPackages, ValueSetGenerator valueSetGenerator) {
    this.packageInfo = packageInfo;
    this.fhirVersion = FhirVersion.fromAnnotation(packageInfo.getFhirVersion());
    this.valueSetGenerator = valueSetGenerator;

    ImmutableMap.Builder<String, Set<String>> coreTypeBuilder = new ImmutableMap.Builder<>();
    for (Map.Entry<String, FileDescriptor> entry : fhirVersion.coreTypeMap.entrySet()) {
      coreTypeBuilder.put(entry.getKey(), getTypesDefinedInFile(entry.getValue()));
    }
    this.coreTypeDefinitionsByFile = coreTypeBuilder.build();

    Map<StructureDefinition, String> allDefinitions = new HashMap<>();
    for (FhirPackage fhirPackage : fhirPackages) {
      PackageInfo info = fhirPackage.packageInfo;
      allDefinitions.putAll(
          fhirPackage.structureDefinitions.stream()
              .collect(Collectors.toMap(def -> def, def -> info.getProtoPackage())));
    }

    Map<String, StructureDefinitionData> mutableStructDefDataByUrl = new HashMap<>();
    for (Map.Entry<StructureDefinition, String> knownType : allDefinitions.entrySet()) {
      StructureDefinition def = knownType.getKey();
      String protoPackage = knownType.getValue();
      String url = def.getUrl().getValue();
      if (url.isEmpty()) {
        throw new IllegalArgumentException(
            "Invalid FHIR structure definition: " + def.getId().getValue() + " has no url");
      }
      boolean isSimpleExtensionProfile =
          isExtensionProfile(def)
              && isSimpleExtension(
                  def.getSnapshot().getElement(0), def.getSnapshot().getElementList());
      String inlineType;
      String structDefPackage;
      if (isSimpleExtensionProfile) {
        QualifiedType qualifiedType = getSimpleExtensionDefinitionType(def, protoPackage);
        inlineType = qualifiedType.type;
        structDefPackage = qualifiedType.packageName;
      } else {
        inlineType = getTypeName(def);
        structDefPackage = protoPackage;
      }

      StructureDefinitionData structDefData =
          new StructureDefinitionData(def, inlineType, structDefPackage);
      mutableStructDefDataByUrl.put(def.getUrl().getValue(), structDefData);
    }
    this.structDefDataByUrl = ImmutableMap.copyOf(mutableStructDefDataByUrl);

    // Used to ensure each structure definition is unique by url.
    final Set<String> knownUrls = new HashSet<>();

    this.baseStructDefsById =
        allDefinitions.keySet().stream()
            .filter(
                def -> def.getDerivation().getValue() != TypeDerivationRuleCode.Value.CONSTRAINT)
            .filter(def -> knownUrls.add(def.getUrl().getValue()))
            .collect(toImmutableMap(def -> def.getId().getValue(), def -> def));
  }

  // Given a structure definition, gets the name of the top-level message that will be generated.
  private String getTypeName(StructureDefinition def) {
    return GeneratorUtils.getTypeName(def, packageInfo.getFhirVersion());
  }

  private StructureDefinitionData getDefinitionDataByUrl(String url) {
    if (!structDefDataByUrl.containsKey(url)) {
      throw new IllegalArgumentException("Unrecognized resource URL: " + url);
    }
    return structDefDataByUrl.get(url);
  }

  /**
   * Generate a proto descriptor from a StructureDefinition, using the snapshot form of the
   * definition. For a more elaborate discussion of these versions, see
   * https://www.hl7.org/fhir/structuredefinition.html.
   */
  public DescriptorProto generateProto(StructureDefinition def) {
    // Build a top-level message description.
    StringBuilder comment =
        new StringBuilder()
            .append("Auto-generated from StructureDefinition for ")
            .append(def.getName().getValue());
    if (def.getMeta().hasLastUpdated()) {
      comment
          .append(", last updated ")
          .append(
              new InstantWrapper(
                  ProtoUtils.fieldWiseCopy(def.getMeta().getLastUpdated(), Instant.newBuilder())
                      .build()));
    }
    comment.append(".");
    if (def.getSnapshot().getElement(0).hasShort()) {
      String shortString = def.getSnapshot().getElement(0).getShort().getValue();
      if (!shortString.endsWith(".")) {
        shortString += ".";
      }
      comment.append("\n").append(shortString.replaceAll("[\\n\\r]", "\n"));
    }
    comment.append("\nSee ").append(def.getUrl().getValue());

    // Add message-level annotations.
    DescriptorProto.Builder builder = DescriptorProto.newBuilder();
    MessageOptions.Builder optionsBuilder =
        MessageOptions.newBuilder()
            .setExtension(
                Annotations.structureDefinitionKind,
                Annotations.StructureDefinitionKindValue.valueOf(
                    "KIND_" + def.getKind().getValue()))
            .setExtension(ProtoGeneratorAnnotations.messageDescription, comment.toString())
            .setExtension(Annotations.fhirStructureDefinitionUrl, def.getUrl().getValue());
    if (def.getAbstract().getValue()) {
      optionsBuilder.setExtension(Annotations.isAbstractType, def.getAbstract().getValue());
    }
    builder.setOptions(optionsBuilder);

    // If this is a primitive type, generate the value field first.
    if (def.getKind().getValue() == StructureDefinitionKindCode.Value.PRIMITIVE_TYPE) {
      generatePrimitiveValue(def, builder);
    }

    if (def.getKind().getValue() == StructureDefinitionKindCode.Value.RESOURCE) {
      // Fix bug in 4.0.1 where $RESOURCE.id types are strings instead of ids.
      // See https://jira.hl7.org/browse/FHIR-25262
      StructureDefinition.Builder defBuilder = def.toBuilder();
      for (ElementDefinition.Builder elementBuilder :
          defBuilder.getSnapshotBuilder().getElementBuilderList()) {
        if (elementBuilder.getId().getValue().matches("[A-Za-z]*\\.id")) {
          for (int i = 0; i < elementBuilder.getTypeBuilder(0).getExtensionCount(); i++) {
            Extension.Builder extensionBuilder =
                elementBuilder.getTypeBuilder(0).getExtensionBuilder(i);
            if (extensionBuilder.getUrl().getValue().equals(FHIR_TYPE_EXTENSION_URL)) {
              extensionBuilder.getValueBuilder().getUrlBuilder().setValue("id");
            }
          }
        }
      }
      def = defBuilder.build();
    }

    List<ElementDefinition> elementList = def.getSnapshot().getElementList();
    builder = generateMessage(elementList.get(0), elementList, builder).toBuilder();

    if (isProfile(def)) {
      String name = getTypeName(def);
      // This is a profile on a pre-existing type.
      // Make sure any nested subtypes use the profile name, not the base name
      replaceType(builder, def.getType().getValue(), name);

      // Add all base structure definition url annotations
      StructureDefinition defInChain = def;
      while (isProfile(defInChain)) {
        String baseUrl = defInChain.getBaseDefinition().getValue();
        builder
            .setName(name)
            .getOptionsBuilder()
            .addExtension(Annotations.fhirProfileBase, baseUrl);
        defInChain = getDefinitionDataByUrl(baseUrl).structDef;
      }
    }
    return builder.build();
  }

  /** Generate a .proto file descriptor from a list of StructureDefinitions. */
  public FileDescriptorProto generateFileDescriptor(List<StructureDefinition> defs) {
    FileDescriptorProto.Builder builder = FileDescriptorProto.newBuilder();
    builder.setPackage(packageInfo.getProtoPackage()).setSyntax("proto3");
    FileOptions.Builder options = FileOptions.newBuilder();
    if (!packageInfo.getJavaProtoPackage().isEmpty()) {
      options.setJavaPackage(packageInfo.getJavaProtoPackage()).setJavaMultipleFiles(true);
    }
    if (!packageInfo.getGoProtoPackage().isEmpty()) {
      options.setGoPackage(packageInfo.getGoProtoPackage());
    }
    options.setExtension(Annotations.fhirVersion, fhirVersion.toAnnotation());
    builder.setOptions(options);
    for (StructureDefinition def : defs) {
      validateDefinition(def);
      DescriptorProto proto = generateProto(def);
      builder.addMessageType(proto);
    }
    // Add imports. Annotations is always needed.
    NavigableSet<String> dependencies = new TreeSet<>();
    dependencies.add(new File(FhirVersion.ANNOTATION_PATH, "annotations.proto").toString());
    // Add the remaining FHIR dependencies if the file uses a type from the FHIR dep, but does not
    // define a type from that dep.
    for (Map.Entry<String, Set<String>> entry : coreTypeDefinitionsByFile.entrySet()) {
      String filename = entry.getKey();
      Set<String> types = entry.getValue();

      if (needsDep(builder, fhirVersion.coreProtoPackage, types)) {
        dependencies.add(new File(fhirVersion.coreProtoImportRoot, filename).toString());
      }
    }

    if (needsDep(builder, "google.protobuf", ImmutableSet.of("google.protobuf.Any"))) {
      dependencies.add("google/protobuf/any.proto");
    }
    dependencies.forEach(dep -> builder.addDependency(dep));
    return builder.build();
  }

  private void validateDefinition(StructureDefinition def) {
    if (RECONCILE_SNAPSHOTS) {
      def = reconcileSnapshotAndDifferential(def);
    }

    // Make sure the package the proto declared in is the same as it will be generated in.
    StructureDefinitionData structDefData = structDefDataByUrl.get(def.getUrl().getValue());
    if (structDefData == null) {
      throw new IllegalArgumentException(
          "No StructureDefinition data found for: " + def.getUrl().getValue());
    }
    if (!structDefData.protoPackage.equals(packageInfo.getProtoPackage())
        && !isSingleTypedExtensionDefinition(structDefData.structDef)) {
      throw new IllegalArgumentException(
          "Inconsistent package name for "
              + def.getUrl().getValue()
              + ".  Registered in --known_types in "
              + structDefData.protoPackage
              + " but being generated in "
              + packageInfo.getProtoPackage());
    }
  }

  // Returns true if the file proto uses a type from a set of types, but does not define it.
  private static boolean needsDep(
      FileDescriptorProtoOrBuilder fileProto, String packageString, Set<String> types) {
    for (DescriptorProto descriptor : fileProto.getMessageTypeList()) {
      if (types.contains(packageString + "." + descriptor.getName())
          && !descriptor.getName().equals("RelatedArtifact")) {
        // This file defines a type from the set.  It can't depend on itself.
        // TODO: We don't pay attention to RelatedArtifact because there's an extension
        // with that name.  This is a hack, we should do something cleverer.
        return false;
      }
    }
    for (DescriptorProto proto : fileProto.getMessageTypeList()) {
      if (usesTypeFromSet(proto, types)) {
        return true;
      }
    }
    return false;
  }

  // Returns true if the file proto uses a type from a set of types.
  private static boolean usesTypeFromSet(DescriptorProto proto, Set<String> types) {
    for (FieldDescriptorProto field : proto.getFieldList()) {
      // Drop leading dot before checking field type.
      if (!field.getTypeName().isEmpty() && types.contains(field.getTypeName().substring(1))) {
        return true;
      }
      for (DescriptorProto nested : proto.getNestedTypeList()) {
        if (usesTypeFromSet(nested, types)) {
          return true;
        }
      }
    }
    return false;
  }

  // Does a global find-and-replace of a given token in a message namespace.
  // This is necessary for profiles, since the StructureDefinition uses the base Resource name
  // throughout, but we wish to use the Profiled resource name.
  // So, for instance, for a profile MyProfiledResource on MyResource, this would be used to turn
  // some.package.MyResource.Submessage into some.package.MyProfiledResource.Submessage
  private static void replaceType(DescriptorProto.Builder protoBuilder, String from, String to) {
    String fromWithDots = "." + from + ".";
    String toWithDots = "." + to + ".";
    for (FieldDescriptorProto.Builder field : protoBuilder.getFieldBuilderList()) {
      if (field.getTypeName().contains(fromWithDots)) {
        field.setTypeName(field.getTypeName().replaceFirst(fromWithDots, toWithDots));
      }
    }
    for (DescriptorProto.Builder nested : protoBuilder.getNestedTypeBuilderList()) {
      replaceType(nested, from, to);
    }
  }

  /**
   * Returns a version of the passed-in FileDescriptor that contains a ContainedResource message,
   * which contains only the resource types present in the generated FileDescriptorProto.
   */
  public FileDescriptorProto addContainedResource(
      FileDescriptorProto fileDescriptor, List<DescriptorProto> resourceTypes) {
    DescriptorProto.Builder contained =
        DescriptorProto.newBuilder()
            .setName("ContainedResource")
            .addOneofDecl(OneofDescriptorProto.newBuilder().setName("oneof_resource"));
    if (packageInfo.getProtoPackage().equals(fhirVersion.coreProtoPackage)) {
      // When generating contained resources for the core type (resources.proto),
      // iterate through all the non-abstract resources sorted alphebetically, assigning tag numbers
      // as you go
      TreeSet<DescriptorProto> sortedResources =
          new TreeSet<>((a, b) -> a.getName().compareTo(b.getName()));
      sortedResources.addAll(resourceTypes);
      int tagNumber = 1;
      for (DescriptorProto type : sortedResources) {
        if (AnnotationUtils.isResource(type)
            && !type.getOptions().getExtension(Annotations.isAbstractType)) {
          contained.addField(
              FieldDescriptorProto.newBuilder()
                  .setName(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, type.getName()))
                  .setNumber(tagNumber++)
                  .setTypeName(type.getName())
                  .setType(FieldDescriptorProto.Type.TYPE_MESSAGE)
                  .setLabel(FieldDescriptorProto.Label.LABEL_OPTIONAL)
                  .setOneofIndex(0 /* the oneof_resource */)
                  .build());
        }
      }
    } else {
      // For derived contained resources, make sure to keep the tag numbers from the base file for
      // resources that keep the same name.
      // In other words, if there is a profiled resource called "Patient", it will keep the tag
      // number of the field in the base contained resources for Patient.
      // Resources with no exact name matches are assigned field numbers that are greater than
      // the max used by the base ContainedResource.
      Descriptor baseContainedResource = fhirVersion.coreContainedResource;
      List<String> resourcesToInclude =
          resourceTypes.stream()
              .filter(desc -> !desc.getOptions().getExtension(Annotations.isAbstractType))
              .map(desc -> desc.getName())
              .collect(Collectors.toList());
      for (FieldDescriptor field : baseContainedResource.getFields()) {
        String typename = field.getMessageType().getName();
        if (resourcesToInclude.contains(typename)) {
          contained.addField(
              field
                  .toProto()
                  .toBuilder()
                  .setTypeName("." + packageInfo.getProtoPackage() + "." + typename));
          resourcesToInclude.remove(typename);
        }
      }
      int tagNumber = Iterables.getLast(baseContainedResource.getFields()).getNumber() + 1;
      for (String resourceType : resourcesToInclude) {
        contained.addField(
            FieldDescriptorProto.newBuilder()
                .setName(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, resourceType))
                .setNumber(tagNumber++)
                .setTypeName("." + packageInfo.getProtoPackage() + "." + resourceType)
                .setType(FieldDescriptorProto.Type.TYPE_MESSAGE)
                .setLabel(FieldDescriptorProto.Label.LABEL_OPTIONAL)
                .setOneofIndex(0 /* the oneof_resource */)
                .build());
      }
    }

    return fileDescriptor.toBuilder().addMessageType(contained).build();
  }

  private DescriptorProto generateMessage(
      ElementDefinition currentElement,
      List<ElementDefinition> elementList,
      DescriptorProto.Builder builder) {
    // Get the name of this message
    builder.setName(nameFromQualifiedName(getContainerType(currentElement, elementList)));

    // Add message-level constraints.
    List<String> expressions = getFhirPathConstraints(currentElement);
    if (!expressions.isEmpty()) {
      builder.getOptionsBuilder().setExtension(Annotations.fhirPathMessageConstraint, expressions);
    }

    // When generating a descriptor for a primitive type, the value part may already be present.
    int nextTag = builder.getFieldCount() + 1;

    // Some repeated fields can have profiled elements in them, that get inlined as fields.
    // The most common case of this is typed extensions.  We defer adding these to the end of the
    // message, so that non-profiled messages will be binary compatiple with this proto.
    // Note that the inverse is not true - loading a profiled message bytes into the non-profiled
    // will result in the data in the typed fields being dropped.
    List<ElementDefinition> deferredElements = new ArrayList<>();

    // Loop over the direct children of this element.
    for (ElementDefinition element : getDirectChildren(currentElement, elementList)) {
      if (element.getId().getValue().matches("[^.]*\\.value")
          && (element.getType(0).getCode().getValue().isEmpty()
              || element.getType(0).getCode().getValue().startsWith(FHIRPATH_TYPE_PREFIX))) {
        // This is a primitive field.  Skip it, as primitive fields are handled specially.
        continue;
      }

      // Per spec, the fixed Extension.url on a top-level extension must match the
      // StructureDefinition url.  Since that is already added to the message via the
      // fhir_structure_definition_url, we can skip over it here.
      if (element.getBase().getPath().getValue().equals("Extension.url")
          && element.getFixed().hasUri()) {
        continue;
      }

      // Slices on choice types are handled during the creation of the choice type itself.
      // Ignore them here.
      if (GeneratorUtils.isChoiceTypeSlice(element)) {
        continue;
      }

      if (!isChoiceType(element) && !isSingleType(element)) {
        throw new IllegalArgumentException(
            "Illegal field has multiple types but is not a Choice Type:\n" + element);
      }

      if (lastIdToken(element).slicename != null) {
        // This is a slice.  Defer this field until the end of the message, to keep base field
        // numbers consistent across profiles.
        deferredElements.add(element);
      } else if (isContainedResourceField(element)
          && getContainedResourceBehavior(packageInfo)
              != ContainedResourceBehavior.TYPED_CONTAINED_RESOURCE) {
        buildAndAddField(element, elementList, nextTag++, builder);
        builder
            .addFieldBuilder()
            .setNumber(nextTag)
            .getOptionsBuilder()
            .setExtension(
                ProtoGeneratorAnnotations.reservedReason,
                "Field "
                    + nextTag
                    + " reserved for strongly-typed ContainedResource for id: "
                    + element.getId().getValue());
        nextTag++;
      } else {
        buildAndAddField(element, elementList, nextTag++, builder);
      }
    }

    for (ElementDefinition deferredElement : deferredElements) {
      // Currently we only support slicing for Extensions and Codings
      if (isElementSupportedForSlicing(deferredElement)
          || isContainedResourceField(deferredElement)) {
        buildAndAddField(deferredElement, elementList, nextTag++, builder);
      } else {
        builder
            .addFieldBuilder()
            .setNumber(nextTag)
            .getOptionsBuilder()
            .setExtension(
                ProtoGeneratorAnnotations.reservedReason,
                "field "
                    + nextTag
                    + " reserved for "
                    + deferredElement.getId().getValue()
                    + " which uses an unsupported slicing on "
                    + deferredElement.getType(0).getCode().getValue());
        nextTag++;
      }
    }
    return builder.build();
  }

  private void buildAndAddField(
      ElementDefinition element,
      List<ElementDefinition> elementList,
      int tag,
      DescriptorProto.Builder builder) {
    // Generate the field. If this field doesn't actually exist in this version of the
    // message, for example, the max attribute is 0, buildField returns null and no field
    // should be added.
    Optional<FieldDescriptorProto> fieldOptional = buildField(element, elementList, tag);
    if (fieldOptional.isPresent()) {
      FieldDescriptorProto field = fieldOptional.get();
      Optional<DescriptorProto> optionalNestedType = buildNestedTypeIfNeeded(element, elementList);
      if (optionalNestedType.isPresent()) {
        builder.addNestedType(optionalNestedType.get());
        // The nested type is defined in the local package, so replace the core FHIR package
        // with the local packageName in the field type.
        field =
            field
                .toBuilder()
                .setTypeName(
                    field
                        .getTypeName()
                        .replace(fhirVersion.coreProtoPackage, packageInfo.getProtoPackage()))
                .build();
      } else {
        // There is no submessage defined for this field, so apply constraints to the field itself.
        List<String> expressions = getFhirPathConstraints(element);
        if (!expressions.isEmpty()) {
          field =
              field
                  .toBuilder()
                  .setOptions(
                      field
                          .getOptions()
                          .toBuilder()
                          .setExtension(Annotations.fhirPathConstraint, expressions))
                  .build();
        }
      }

      builder.addField(field);
    } else if (!element.getPath().getValue().equals("Extension.extension")
        && !element.getPath().getValue().equals("Extension.value[x]")) {
      // Don't bother adding reserved messages for Extension.extension or Extension.value[x]
      // since that's part of the extension definition, and adds a lot of unhelpful noise.
      builder
          .addFieldBuilder()
          .setNumber(tag)
          .getOptionsBuilder()
          .setExtension(
              ProtoGeneratorAnnotations.reservedReason,
              element.getPath().getValue() + " not present on profile.");
    }
  }

  private Optional<DescriptorProto> buildNestedTypeIfNeeded(
      ElementDefinition element, List<ElementDefinition> elementList) {
    Optional<DescriptorProto> choiceType = buildChoiceTypeIfRequired(element, elementList);
    if (choiceType.isPresent()) {
      if (isValueElementOfSingleTypedExtension(element, elementList)) {
        // In the case of a single-typed simple extension, we pull the field type out of the choice
        // type rather than have a choice type with a single field.
        // Thus, if the single type required a newly-defined message (e.g., a bound code), return
        // that, otherwise (e.g., for a normal primitive like String) return empty (no nested type
        // needed.
        return choiceType.get().getNestedTypeList().isEmpty()
            ? Optional.empty()
            : Optional.of(choiceType.get().getNestedType(0));
      }
      return choiceType;
    }
    return buildNonChoiceTypeNestedTypeIfNeeded(element, elementList);
  }

  private Optional<DescriptorProto> buildNonChoiceTypeNestedTypeIfNeeded(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (element.getTypeCount() != 1) {
      return Optional.empty();
    }

    Optional<DescriptorProto> profiledCodeableConcept =
        makeProfiledCodeableConceptIfRequired(element, elementList);
    if (profiledCodeableConcept.isPresent()) {
      return profiledCodeableConcept;
    }
    Optional<DescriptorProto> profiledCoding = makeProfiledCodingIfRequired(element, elementList);
    if (profiledCoding.isPresent()) {
      return profiledCoding;
    }
    Optional<DescriptorProto> profiledCode = makeProfiledCodeIfRequired(element, elementList);
    if (profiledCode.isPresent()) {
      return profiledCode;
    }

    // Check for all other profiled datatypes
    Optional<DescriptorProto> profiledDatatype =
        makeProfiledDatatypeIfRequired(element, elementList);
    if (profiledDatatype.isPresent()) {
      return profiledDatatype;
    }

    // If this is a container type, or a complex internal extension, define the inner message.
    // If this is a CodeableConcept, check for fixed coding slices.  Normally we don't add a
    // message for CodeableConcept because it's defined as a datatype, but if there are slices
    // on it we need to generate a custom version.
    if (isContainer(element) || isComplexInternalExtension(element, elementList)) {
      return Optional.of(generateMessage(element, elementList, DescriptorProto.newBuilder()));
    }
    return Optional.empty();
  }

  // Generates the nested type descriptor proto for a choice type if required.
  private Optional<DescriptorProto> buildChoiceTypeIfRequired(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (isChoiceTypeExtension(element, elementList)) {
      return Optional.of(
          makeChoiceType(getExtensionValueElement(element, elementList), elementList));
    }
    Optional<ElementDefinition> choiceTypeBase = getChoiceTypeBase(element);
    if (choiceTypeBase.isPresent()) {
      List<ElementDefinition.TypeRef> baseTypes = choiceTypeBase.get().getTypeList();
      Map<String, Integer> baseTypesToIndex = new HashMap<>();
      for (int i = 0; i < baseTypes.size(); i++) {
        String code = baseTypes.get(i).getCode().getValue();
        // Only add each code type once.  This is only relevant for references, which can appear
        // multiple times.
        if (!baseTypesToIndex.containsKey(code)) {
          baseTypesToIndex.put(code, i);
        }
      }
      DescriptorProto baseChoiceType = makeChoiceType(choiceTypeBase.get(), elementList);
      final Set<String> uniqueTypes = new HashSet<>();
      List<FieldDescriptorProto> matchingFields =
          element.getTypeList().stream()
              .filter(type -> uniqueTypes.add(type.getCode().getValue()))
              .map(type -> baseChoiceType.getField(baseTypesToIndex.get(type.getCode().getValue())))
              .collect(Collectors.toList());

      // TODO: If a choice type is a slice of another choice type (not a pure
      // constraint, but actual slice) we'll need to update the name and type name as well.
      DescriptorProto.Builder newChoiceType =
          baseChoiceType.toBuilder().clearField().addAllField(matchingFields);

      // Constraints may be on the choice base element rather than the value element,
      // so reflect that here.
      List<String> expressions = getFhirPathConstraints(element);
      if (!expressions.isEmpty()) {
        newChoiceType.setOptions(
            baseChoiceType
                .getOptions()
                .toBuilder()
                .setExtension(Annotations.fhirPathMessageConstraint, expressions));
      }

      return Optional.of(newChoiceType.build());
    }

    if (isChoiceType(element)) {
      return Optional.of(makeChoiceType(element, elementList));
    }

    return Optional.empty();
  }

  /**
   * Returns true if this is the value[x] element of an extension with a single type. This is a
   * special case because we extract the type out of the choice type and into a simple field. Since
   * extensions are handled specially anyway, and the vast majority of simple extensions are a
   * single type, it's much nicer to use a single field rather than a single-typed choice type. Note
   * that prior to FHIR 4.0.1, the structure definition was written as a single field, but changed
   * in that version to a true choice type.
   */
  private static boolean isValueElementOfSingleTypedExtension(
      ElementDefinition element, List<ElementDefinition> elementList) {
    return isValueElementOfSimpleExtension(element, elementList)
        && getDistinctTypeCount(element) == 1;
  }

  private static boolean isValueElementOfChoiceTypeExtension(
      ElementDefinition element, List<ElementDefinition> elementList) {
    return isValueElementOfSimpleExtension(element, elementList)
        && getDistinctTypeCount(element) > 1;
  }

  private static boolean isValueElementOfSimpleExtension(
      ElementDefinition element, List<ElementDefinition> elementList) {
    Optional<ElementDefinition> parent = GeneratorUtils.getParent(element, elementList);
    if (!parent.isPresent()) {
      return false;
    }
    return isSimpleExtension(parent.get(), elementList)
        && lastIdToken(element).pathpart.equals("value");
  }

  private Optional<DescriptorProto> makeProfiledCodeIfRequired(
      ElementDefinition element, List<ElementDefinition> elementList) {
    ElementDefinition valueElement =
        isSimpleExtension(element, elementList)
            ? getExtensionValueElement(element, elementList)
            : element;
    if (valueElement.getTypeCount() != 1
        || !valueElement.getType(0).getCode().getValue().equals("code")) {
      return Optional.empty();
    }

    Optional<String> boundValueSetUrl = getBindingValueSetUrl(element, elementList);
    if (!boundValueSetUrl.isPresent()) {
      return Optional.empty();
    }

    Optional<QualifiedType> typeWithBoundValueSet =
        checkForTypeWithBoundValueSet(element, elementList);
    if (!typeWithBoundValueSet.isPresent()) {
      return Optional.empty();
    }

    return Optional.of(
        valueSetGenerator.generateCodeBoundToValueSet(
            boundValueSetUrl.get(), typeWithBoundValueSet.get()));
  }

  private Optional<DescriptorProto> makeProfiledDatatypeIfRequired(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (isContainer(element)
        || isExtensionBackboneElement(element)
        || !descendantsHaveSlices(element, elementList)) {
      return Optional.empty();
    }

    String baseId = element.getType(0).getCode().getValue();
    StructureDefinition baseStructureDefinition = baseStructDefsById.get(baseId);

    DescriptorProto.Builder builder = generateProto(baseStructureDefinition).toBuilder();
    MessageOptions.Builder options = builder.getOptionsBuilder();
    options
        .clearExtension(ProtoGeneratorAnnotations.messageDescription)
        .addExtension(
            Annotations.fhirProfileBase,
            options.getExtension(Annotations.fhirStructureDefinitionUrl))
        .clearExtension(Annotations.fhirStructureDefinitionUrl);

    QualifiedType qualifiedType = getQualifiedFieldType(element, elementList);
    String fieldType = qualifiedType.type;
    String name = fieldType.substring(fieldType.lastIndexOf(".") + 1);

    int nextTag = builder.getField(builder.getFieldCount() - 1).getNumber() + 1;

    String extensionSlicePattern =
        Pattern.quote(element.getId().getValue() + ".") + "extension:[^.:]*";

    List<ElementDefinition> extensionSlices =
        getDescendants(element, elementList).stream()
            .filter(child -> child.getId().getValue().matches(extensionSlicePattern))
            .collect(toList());

    for (ElementDefinition slice : extensionSlices) {
      buildAndAddField(slice, elementList, nextTag++, builder);
    }

    return Optional.of(builder.setName(name).build());
  }

  private Optional<DescriptorProto> makeProfiledCodeableConceptIfRequired(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (element.getTypeCount() != 1
        || !element.getType(0).getCode().getValue().equals("CodeableConcept")) {
      return Optional.empty();
    }
    List<ElementDefinition> codingSlices =
        getDirectChildren(element, elementList).stream()
            .filter(candidateElement -> candidateElement.hasSliceName())
            .collect(Collectors.toList());
    if (codingSlices.isEmpty()) {
      return Optional.empty();
    }
    String codeableConceptStructDefUrl =
        CodeableConcept.getDescriptor()
            .getOptions()
            .getExtension(Annotations.fhirStructureDefinitionUrl);
    StructureDefinition codeableConceptDefinition =
        structDefDataByUrl.get(codeableConceptStructDefUrl).structDef;
    QualifiedType qualifiedType = getQualifiedFieldType(element, elementList);
    String fieldType = qualifiedType.type;
    DescriptorProto.Builder codeableConceptBuilder =
        generateMessage(
                codeableConceptDefinition.getSnapshot().getElementList().get(0),
                codeableConceptDefinition.getSnapshot().getElementList(),
                DescriptorProto.newBuilder())
            .toBuilder();
    codeableConceptBuilder.setName(fieldType.substring(fieldType.lastIndexOf(".") + 1));
    codeableConceptBuilder
        .getOptionsBuilder()
        .clearExtension(Annotations.structureDefinitionKind)
        .clearExtension(Annotations.fhirStructureDefinitionUrl)
        .addExtension(Annotations.fhirProfileBase, codeableConceptStructDefUrl);
    for (ElementDefinition codingSlice : codingSlices) {
      String fixedSystem = null;
      ElementDefinition codeDefinition = null;
      for (ElementDefinition codingField : getDirectChildren(codingSlice, elementList)) {
        String basePath = codingField.getBase().getPath().getValue();
        if (basePath.equals("Coding.system")) {
          fixedSystem = codingField.getFixed().getUri().getValue();
        }
        if (basePath.equals("Coding.code")) {
          codeDefinition = codingField;
        }
      }
      if (fixedSystem == null || codeDefinition == null) {
        System.out.println(
            "Warning: Coding slicing not handled because it does not have both a fixed system and a"
                + " code slice:\n"
                + codingSlice.getId());
      }

      if (codeDefinition.getFixed().hasCode()) {
        FieldDescriptorProto.Builder codingField =
            codeableConceptBuilder
                .addFieldBuilder()
                .setType(FieldDescriptorProto.Type.TYPE_MESSAGE)
                .setTypeName("." + fhirVersion.coreProtoPackage + ".CodingWithFixedCode")
                .setName(toFieldNameCase(codingSlice.getSliceName().getValue()))
                .setLabel(getFieldSize(codingSlice))
                .setNumber(codeableConceptBuilder.getFieldCount());
        if (!snakeCaseToJsonCase(codingField.getName())
            .equals(codingSlice.getSliceName().getValue())) {
          codingField.setJsonName(codingSlice.getSliceName().getValue());
        }
        codingField
            .getOptionsBuilder()
            .setExtension(Annotations.fhirInlinedCodingSystem, fixedSystem)
            .setExtension(
                Annotations.fhirInlinedCodingCode, codeDefinition.getFixed().getCode().getValue());
      } else {
        // For codings with fixed systems, we should inline a custom Coding type that incorporates
        // this information, e.g., inlining a strongly-typed Code enum.
        // For legacy reasons, we're only doing this for R4.
        // TODO: Do this for all versions before 1.0 release.
        if (packageInfo.getFhirVersion() == Annotations.FhirVersion.R4) {
          addCodingFieldWithFixedSystem(
              codeableConceptBuilder, qualifiedType, codingSlice, fixedSystem);
        } else {
          // Legacy "CodingWithFixedSystem"
          FieldDescriptorProto.Builder codingField =
              codeableConceptBuilder
                  .addFieldBuilder()
                  .setType(FieldDescriptorProto.Type.TYPE_MESSAGE)
                  .setTypeName(CodingWithFixedSystem.getDescriptor().getFullName())
                  .setName(toFieldNameCase(codingSlice.getSliceName().getValue()))
                  .setLabel(getFieldSize(codingSlice))
                  .setNumber(codeableConceptBuilder.getFieldCount());
          if (!snakeCaseToJsonCase(codingField.getName())
              .equals(codingSlice.getSliceName().getValue())) {
            codingField.setJsonName(codingSlice.getSliceName().getValue());
          }
          codingField
              .getOptionsBuilder()
              .setExtension(Annotations.fhirInlinedCodingSystem, fixedSystem);
        }
      }
    }

    return Optional.of(codeableConceptBuilder.build());
  }

  private void addCodingFieldWithFixedSystem(
      DescriptorProto.Builder parentBuilder,
      QualifiedType parentType,
      ElementDefinition codingSlice,
      String fixedSystem) {
    String typeName = toFieldTypeCase(codingSlice.getSliceName().getValue()) + "Coding";

    // Build and add a custom Coding message with a fixed system & inlined code
    QualifiedType codingType = parentType.childType(typeName);
    DescriptorProto codingMessage =
        valueSetGenerator.generateCodingWithFixedCodeSystem(fixedSystem, codingType);
    parentBuilder.addNestedType(codingMessage);

    // Add a field with that type.
    FieldDescriptorProto.Builder fieldBuilder =
        parentBuilder
            .addFieldBuilder()
            .setType(FieldDescriptorProto.Type.TYPE_MESSAGE)
            .setTypeName(codingType.toQualifiedTypeString())
            .setName(toFieldNameCase(codingSlice.getSliceName().getValue()))
            .setLabel(getFieldSize(codingSlice))
            .setNumber(parentBuilder.getFieldCount());

    if (!snakeCaseToJsonCase(fieldBuilder.getName())
        .equals(codingSlice.getSliceName().getValue())) {
      fieldBuilder.setJsonName(codingSlice.getSliceName().getValue());
    }
  }

  private static List<ElementDefinition> getDirectChildren(
      ElementDefinition element, List<ElementDefinition> elementList) {
    List<String> messagePathParts = Splitter.on('.').splitToList(element.getId().getValue());
    return getDescendants(element, elementList).stream()
        .filter(
            candidateElement -> {
              List<String> parts =
                  Splitter.on('.').splitToList(candidateElement.getId().getValue());
              // To be a direct child, the id should start with the parent id, and add a single
              // additional token.
              return parts.size() == messagePathParts.size() + 1;
            })
        .collect(Collectors.toList());
  }

  private static List<ElementDefinition> getDescendants(
      ElementDefinition element, List<ElementDefinition> elementList) {
    // The id of descendants should start with the parent id + at least one more token.
    String parentIdPrefix = element.getId().getValue() + ".";
    return elementList.stream()
        .filter(candidateElement -> candidateElement.getId().getValue().startsWith(parentIdPrefix))
        .collect(Collectors.toList());
  }

  private static final ElementDefinition.TypeRef STRING_TYPE =
      ElementDefinition.TypeRef.newBuilder().setCode(Uri.newBuilder().setValue("string")).build();

  private Optional<String> getPrimitiveRegex(ElementDefinition element) {
    switch (packageInfo.getFhirVersion()) {
      case STU3:
        List<com.google.fhir.stu3.proto.ElementDefinitionRegex> stu3Regex =
            ExtensionWrapper.fromExtensionsIn(element.getType(0))
                .getMatchingExtensions(
                    com.google.fhir.stu3.proto.ElementDefinitionRegex.getDefaultInstance());
        return stu3Regex.size() == 1
            ? Optional.of(stu3Regex.get(0).getValueString().getValue())
            : Optional.empty();
      case R4:
        List<com.google.fhir.r4.core.Regex> r4Regex =
            ExtensionWrapper.fromExtensionsIn(element.getType(0))
                .getMatchingExtensions(com.google.fhir.r4.core.Regex.getDefaultInstance());
        return r4Regex.size() == 1
            ? Optional.of(r4Regex.get(0).getValueString().getValue())
            : Optional.empty();
      default:
        throw new IllegalArgumentException(
            "Unrecognized fhir version: " + packageInfo.getFhirVersion());
    }
  }
  /** Generate the primitive value part of a datatype. */
  private void generatePrimitiveValue(StructureDefinition def, DescriptorProto.Builder builder) {
    String defId = def.getId().getValue();
    String valueFieldId = defId + ".value";
    // Find the value field.
    ElementDefinition valueElement =
        getElementById(valueFieldId, def.getSnapshot().getElementList());
    // If a regex for this primitive type is present, add it as a message-level annotation.
    if (valueElement.getTypeCount() == 1) {
      Optional<String> regexOptional = getPrimitiveRegex(valueElement);
      if (regexOptional.isPresent()) {
        builder.setOptions(
            builder
                .getOptions()
                .toBuilder()
                .setExtension(Annotations.valueRegex, regexOptional.get())
                .build());
      }
    }

    // The value field sometimes has no type. We need to add a fake one here for buildField
    // to succeed.  This will get overridden with the correct time,
    ElementDefinition elementWithType =
        valueElement.toBuilder().clearType().addType(STRING_TYPE).build();
    Optional<FieldDescriptorProto> fieldOptional =
        buildField(elementWithType, def.getSnapshot().getElementList(), 1 /* nextTag */);
    if (fieldOptional.isPresent()) {
      FieldDescriptorProto field = fieldOptional.get();
      if (TIME_LIKE_PRECISION_MAP.containsKey(defId)) {
        // Handle time-like types differently.
        EnumDescriptorProto.Builder enumBuilder = PRECISION_ENUM.toBuilder();
        for (String value : TIME_LIKE_PRECISION_MAP.get(defId)) {
          enumBuilder.addValue(
              EnumValueDescriptorProto.newBuilder()
                  .setName(value)
                  .setNumber(enumBuilder.getValueCount()));
        }
        builder.addEnumType(enumBuilder);
        builder.addField(
            field
                .toBuilder()
                .clearTypeName()
                .setType(FieldDescriptorProto.Type.TYPE_INT64)
                .setLabel(FieldDescriptorProto.Label.LABEL_OPTIONAL)
                .setName("value_us"));
        if (TYPES_WITH_TIMEZONE.contains(defId)) {
          builder.addField(TIMEZONE_FIELD);
        }
        builder.addField(
            FieldDescriptorProto.newBuilder()
                .setName("precision")
                .setLabel(FieldDescriptorProto.Label.LABEL_OPTIONAL)
                .setType(FieldDescriptorProto.Type.TYPE_ENUM)
                .setTypeName(
                    "."
                        + packageInfo.getProtoPackage()
                        + "."
                        + toFieldTypeCase(defId)
                        + ".Precision")
                .setNumber(builder.getFieldCount() + 1));
      } else {
        // Handle non-time-like types.
        // If they don't explicitly appear in the PRIMITIVE_TYPE_OVERRIDES, they are assumed
        // to be of type TYPE_STRING.
        FieldDescriptorProto.Type primitiveType =
            PRIMITIVE_TYPE_OVERRIDES.getOrDefault(defId, FieldDescriptorProto.Type.TYPE_STRING);
        builder.addField(field.toBuilder().clearTypeName().setType(primitiveType));
      }
    }
  }

  /**
   * Fields of the abstract types Element or BackboneElement are containers, which contain internal
   * fields (including possibly nested containers). Also, the top-level message is a container. See
   * https://www.hl7.org/fhir/backboneelement.html for additional information.
   */
  private static boolean isContainer(ElementDefinition element) {
    if (element.getTypeCount() != 1) {
      return false;
    }
    if (element.getId().getValue().indexOf('.') == -1) {
      return true;
    }
    String type = element.getType(0).getCode().getValue();
    return type.equals("BackboneElement") || type.equals("Element");
  }

  /**
   * Does this element have a single, well-defined type? For example: string, Patient or
   * Observation.ReferenceRange, as opposed to one of a set of types, most commonly encoded in field
   * with names like "value[x]".
   */
  private static boolean isSingleType(ElementDefinition element) {
    // If the type of this element is defined by referencing another element,
    // then it has a single defined type.
    if (element.getTypeCount() == 0 && element.hasContentReference()) {
      return true;
    }

    // Loop through the list of types. There may be multiple copies of the same
    // high-level type, for example, multiple kinds of References.
    Set<String> types = new HashSet<>();
    for (ElementDefinition.TypeRef type : element.getTypeList()) {
      if (type.hasCode()) {
        types.add(type.getCode().getValue());
      }
    }
    return types.size() == 1;
  }

  /** Returns true if this ElementDefinition is an extension with a profile. */
  private static boolean isExternalExtension(ElementDefinition element) {
    return element.getTypeCount() == 1
        && element.getType(0).getCode().getValue().equals("Extension")
        && element.getType(0).getProfileCount() == 1;
  }

  private static boolean isChoiceType(ElementDefinition element) {
    return lastIdToken(element).isChoiceType;
  }

  /** Extract the type of a container field, possibly by reference. */
  private String getContainerType(ElementDefinition element, List<ElementDefinition> elementList) {
    if (element.hasContentReference()) {
      // Find the named element which was referenced. We'll use the type of that element.
      // Strip the first character from the content reference since it is a '#'
      String referencedElementId = element.getContentReference().getValue().substring(1);
      ElementDefinition referencedElement = getElementById(referencedElementId, elementList);
      if (!isContainer(referencedElement)) {
        throw new IllegalArgumentException(
            "ContentReference does not reference a container: " + element.getContentReference());
      }
      if (lastIdToken(referencedElementId).slicename != null
          && !isElementSupportedForSlicing(referencedElement)) {
        // This is a reference to a slice of a field, but the slice isn't a supported slice type.
        // Just use a reference to the base field.

        // TODO:  This logic assumes only a single level of slicing is present - the
        // base element could theoretically also be unsupported for slicing.
        referencedElement =
            getElementById(
                referencedElementId.substring(0, referencedElementId.lastIndexOf(":")),
                elementList);
      }
      return getContainerType(referencedElement, elementList);
    }

    // The container type is the full type of the message that will be generated (minus package).
    // It is derived from the id (e.g., Medication.package.content), and these are usually equal
    // other than casing (e.g., Medication.Package.Content).
    // However, any parent in the path could have been renamed via a explicit type name extensions.

    // Check for explicit renamings on this element.
    List<ElementDefinitionExplicitTypeName> explicitTypeNames =
        ExtensionWrapper.fromExtensionsIn(element)
            .getMatchingExtensions(ElementDefinitionExplicitTypeName.getDefaultInstance());

    // Use explicit type name if present.  Otherwise, use the field_name, converted to FieldType
    // casing, as the submessage name.
    String typeName =
        toFieldTypeCase(
            explicitTypeNames.isEmpty()
                ? getNameForElement(element, elementList)
                : explicitTypeNames.get(0).getValueString().getValue());
    if (isChoiceType(element) && !isValueElementOfSingleTypedExtension(element, elementList)) {
      typeName = typeName + "X";
    }

    Optional<ElementDefinition> parentOpt = getParent(element, elementList);

    String packageString;
    if (parentOpt.isPresent()) {
      ElementDefinition parent = parentOpt.get();
      String parentType = getContainerType(parent, elementList);
      packageString = parentType + ".";
    } else {
      packageString = "";
    }

    if (packageString.startsWith(typeName + ".")
        || packageString.contains("." + typeName + ".")
        || (typeName.equals("Code") && parentOpt.isPresent())) {
      typeName = typeName + "Type";
    }
    return packageString + typeName;
  }

  // Commented out until STU3 generation is re-enabled.
  // private static String legacyRenaming(String typeName, String packageString) {
  //   return packageString.contains(".")
  //           && (packageString.startsWith(typeName + ".")
  //               || packageString.contains("." + typeName + ".")
  //               || typeName.equals("Timing")
  //               || typeName.equals("Age"))
  //       ? typeName + "Type"
  //       : typeName;
  // }

  /**
   * Gets the field type and package of a potentially complex element. This handles choice types,
   * types that reference other elements, references, profiles, etc.
   */
  private QualifiedType getQualifiedFieldType(
      ElementDefinition element, List<ElementDefinition> elementList) {
    Optional<QualifiedType> valueSetType = checkForTypeWithBoundValueSet(element, elementList);
    if (valueSetType.isPresent()) {
      return valueSetType.get();
    }

    if (isExtensionBackboneElement(element)) {
      return getInternalExtensionType(element, elementList);
    } else if (isValueElementOfChoiceTypeExtension(element, elementList)
        && !element.getId().getValue().equals("Extension.value[x]")) {
      // This is a choice type defined in a simple extension.
      // We use this element to make the choice type, but name it using the parent to avoid an
      // unnecessary choice-type wrapper.
      // So, if there is a choice field myField on MyExtension, it should have type
      // MyExtension.MyFieldX, not MyExtension.MyField.ValueX
      String containerType = getContainerType(element, elementList);
      return new QualifiedType(
          containerType.substring(0, containerType.lastIndexOf('.')) + "X",
          packageInfo.getProtoPackage());
    } else if (isContainer(element)
        || (isChoiceType(element) && !isValueElementOfSingleTypedExtension(element, elementList))) {
      return new QualifiedType(
          getContainerType(element, elementList), packageInfo.getProtoPackage());
    } else if (element.hasContentReference()) {
      // Get the type for this container from a named reference to another element.
      return new QualifiedType(
          getContainerType(element, elementList),
          isLocalContentReference(element)
              ? packageInfo.getProtoPackage()
              : fhirVersion.coreProtoPackage);
    } else if (element.getType(0).getCode().getValue().equals("Reference")) {
      return new QualifiedType(
          USE_TYPED_REFERENCES ? getTypedReferenceName(element.getTypeList()) : "Reference",
          fhirVersion.coreProtoPackage);
    } else {
      if (element.getTypeCount() > 1) {
        throw new IllegalArgumentException(
            "Unknown multiple type definition on element: " + element.getId());
      }
      // Note: this is the "fhir type", e.g., Resource, BackboneElement, boolean,
      // not the field type name.
      String normalizedFhirTypeName =
          normalizeType(Iterables.getOnlyElement(element.getTypeList()));

      // See https://jira.hl7.org/browse/FHIR-25262
      if (element.getId().getValue().equals("xhtml.id")) {
        normalizedFhirTypeName = "String";
      }

      if (!isContainer(element) && descendantsHaveSlices(element, elementList)) {
        // This is not a backbone element, but it has children that have slices.  This means we
        // cannot use the "stock" FHIR datatype here.
        // A common example of this is CodeableConcepts.  These are not themselves sliced, but the
        // repeated coding field on CodeableConcept can be.
        // This means we have to generate a nested CodeableConcept message that has these additional
        // fields.
        String containerType = getContainerType(element, elementList);
        int lastDotIndex = containerType.lastIndexOf(".");

        String containerTypeName = containerType.substring(lastDotIndex + 1);
        if (containerTypeName.endsWith("CodeType")) {
          // If we added "Type" to the end of a Code field to disambiguate it, drop the "Type"
          // because we don't need to disambiguate anymore.  This is a "Hack".
          containerTypeName = containerTypeName.substring(0, containerTypeName.length() - 4);
        }
        String name =
            Ascii.equalsIgnoreCase(normalizedFhirTypeName, containerTypeName)
                ? ("Profiled" + containerTypeName)
                : (normalizedFhirTypeName + "For" + containerTypeName);
        return new QualifiedType(
            containerType.substring(0, lastDotIndex + 1) + name, packageInfo.getProtoPackage());
      }

      if (normalizedFhirTypeName.equals("Resource")) {
        // We represent "Resource" FHIR types as "Any",
        // unless we are on the Bundle type, in which case we use "ContainedResources" type.
        // This allows defining resources in separate files without circular dependencies.
        if (elementList.get(0).getId().getValue().equals("Bundle")
            || getContainedResourceBehavior(packageInfo)
                == ContainedResourceBehavior.TYPED_CONTAINED_RESOURCE) {
          if (packageInfo.getLocalContainedResource()) {
            return new QualifiedType("ContainedResource", packageInfo.getProtoPackage());
          }
          if (!packageInfo.getContainedResourcePackage().isEmpty()) {
            return new QualifiedType(
                "ContainedResource", packageInfo.getContainedResourcePackage());
          }
          return new QualifiedType("ContainedResource", fhirVersion.coreProtoPackage);
        } else {
          return new QualifiedType("Any", "google.protobuf");
        }
      }
      return new QualifiedType(normalizedFhirTypeName, fhirVersion.coreProtoPackage);
    }
  }

  private Optional<String> getBindingValueSetUrl(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (isSimpleExtension(element, elementList)) {
      return getBindingValueSetUrl(getExtensionValueElement(element, elementList), elementList);
    }
    if (!useLegacyTypeNaming()
        && element.getBinding().getStrength().getValue() != BindingStrengthCode.Value.REQUIRED) {
      return Optional.empty();
    }
    String url = CanonicalWrapper.getUri(element.getBinding().getValueSet());
    if (url.isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(url);
  }

  /** Build a single field for the proto. */
  private Optional<FieldDescriptorProto> buildField(
      ElementDefinition element, List<ElementDefinition> elementList, int nextTag) {
    FieldDescriptorProto.Label fieldSize = getFieldSize(element);
    if (fieldSize == null) {
      // This field has a max size of zero.  Do not emit a field.
      return Optional.empty();
    }

    FieldOptions.Builder options = FieldOptions.newBuilder();

    // Add a short description of the field.
    if (element.hasShort()) {
      options.setExtension(
          ProtoGeneratorAnnotations.fieldDescription, element.getShort().getValue());
    }

    // Is this field required?
    if (isRequiredByFhir(element, elementList)) {
      options.setExtension(
          Annotations.validationRequirement, Annotations.Requirement.REQUIRED_BY_FHIR);
    } else if (element.getMin().getValue() != 0) {
      System.out.println("Unexpected minimum field count: " + element.getMin().getValue());
    }

    if (isExternalExtension(element)) {
      // This is an extension with a single type defined by an external profile.
      // If we know about it, we'll inline a field for it.
      String profileUrl = element.getType(0).getProfile(0).getValue();
      StructureDefinitionData profileData = structDefDataByUrl.get(profileUrl);
      if (profileData == null) {
        // Unrecognized url.
        // TODO: add a lenient mode that just ignores this extension.
        throw new IllegalArgumentException("Encountered unknown extension url: " + profileUrl);
      }
      options.setExtension(Annotations.fhirInlinedExtensionUrl, profileUrl);

      return Optional.of(
          buildFieldInternal(
                  getNameForElement(element, elementList),
                  profileData.inlineType,
                  profileData.protoPackage,
                  nextTag,
                  fieldSize,
                  options.build())
              .build());
    }

    Optional<ElementDefinition> choiceTypeBase = getChoiceTypeBase(element);
    if (choiceTypeBase.isPresent()) {
      ElementDefinition choiceTypeBaseElement = choiceTypeBase.get();
      String baseName = getNameForElement(choiceTypeBaseElement, elementList);
      String baseContainerType = getContainerType(choiceTypeBaseElement, elementList);
      String containerType = getContainerType(element, elementList);
      containerType =
          containerType.substring(0, containerType.lastIndexOf(".") + 1)
              + baseContainerType.substring(baseContainerType.lastIndexOf(".") + 1);

      return Optional.of(
          buildFieldInternal(
                  baseName,
                  containerType,
                  packageInfo.getProtoPackage(),
                  nextTag,
                  fieldSize,
                  options.build())
              .build());
    }

    boolean isChoiceType =
        (!isValueElementOfSingleTypedExtension(element, elementList) && isChoiceType(element))
            || isChoiceTypeExtension(element, elementList);
    // Add typed reference options
    if (!isChoiceType
        && element.getTypeCount() > 0
        && element.getType(0).getCode().getValue().equals("Reference")) {
      for (ElementDefinition.TypeRef type : element.getTypeList()) {
        if (type.getCode().getValue().equals("Reference") && type.getTargetProfileCount() > 0) {
          for (Canonical referenceType : type.getTargetProfileList()) {
            if (!referenceType.getValue().isEmpty()) {
              addReferenceType(options, referenceType.getValue());
            }
          }
        }
      }
    }

    QualifiedType fieldType = getQualifiedFieldType(element, elementList);
    FieldDescriptorProto.Builder fieldBuilder =
        buildFieldInternal(
            getNameForElement(element, elementList),
            fieldType.type,
            fieldType.packageName,
            nextTag,
            fieldSize,
            options.build());
    if (isExtensionBackboneElement(element)) {
      // For internal extension, the default is to assume the url is equal to the jsonName of the
      // field. The json name of the field is the snake-to-json fieldName, unless a jsonName was
      // explicitly set.
      String url =
          getElementById(element.getId().getValue() + ".url", elementList)
              .getFixed()
              .getUri()
              .getValue();
      if ((fieldBuilder.hasJsonName() && !fieldBuilder.getJsonName().equals(url))
          || (!fieldBuilder.hasJsonName()
              && !snakeCaseToJsonCase(fieldBuilder.getName()).equals(url))) {
        fieldBuilder.getOptionsBuilder().setExtension(Annotations.fhirInlinedExtensionUrl, url);
      }
    }
    return Optional.of(fieldBuilder.build());
  }

  private static boolean isRequiredByFhir(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (isChoiceType(element) && element.getTypeCount() == 1) {
      return checkForChoiceSlice(element.getType(0), element, elementList)
              .orElse(element)
              .getMin()
              .getValue()
          == 1;
    }
    return element.getMin().getValue() == 1;
  }

  // Returns the FHIRPath constraints on the given element, if any.
  private static List<String> getFhirPathConstraints(ElementDefinition element) {
    return element.getConstraintList().stream()
        .filter(constraint -> constraint.hasExpression())
        .filter(
            constraint -> constraint.getSeverity().getValue() == ConstraintSeverityCode.Value.ERROR)
        .map(constraint -> constraint.getExpression().getValue())
        .filter(expression -> !EXCLUDED_FHIR_CONSTRAINTS.contains(expression))
        .collect(Collectors.toList());
  }

  private static FieldDescriptorProto.Label getFieldSize(ElementDefinition element) {
    if (element.getMax().getValue().equals("0")) {
      // This field doesn't actually exist.
      return null;
    }
    return element.getMax().getValue().equals("1")
        ? FieldDescriptorProto.Label.LABEL_OPTIONAL
        : FieldDescriptorProto.Label.LABEL_REPEATED;
  }

  private static boolean isLocalContentReference(ElementDefinition element) {
    // TODO: more sophisticated logic.  This wouldn't handle references to fields in
    // other elements in a non-core package
    if (!element.hasContentReference()) {
      return false;
    }
    String rootType = Splitter.on(".").limit(2).splitToList(element.getId().getValue()).get(0);
    return element.getContentReference().getValue().startsWith("#" + rootType);
  }

  /**
   * Returns the field name that should be used for an element. If element is a slice, uses that
   * slice name. Since the id token slice name is all-lowercase, uses the SliceName field.
   * Otherwise, uses the last token's pathpart. Logs a warning if the slice name in the id token
   * does not match the SliceName field.
   */
  // TODO: Handle reslices. Could be as easy as adding it to the end of SliceName.
  private static String getNameForElement(
      ElementDefinition element, List<ElementDefinition> elementList) {
    IdToken lastToken = lastIdToken(element);
    if (lastToken.slicename == null || !element.getId().getValue().contains(".")) {
      if (isValueElementOfSingleTypedExtension(element, elementList)) {
        String type = element.getType(0).getCode().getValue();
        return "value" + Ascii.toUpperCase(type.charAt(0)) + type.substring(1);
      }
      return hyphenToCamel(lastToken.pathpart);
    }
    String sliceName = element.getSliceName().getValue();
    if (!lastToken.slicename.equals(Ascii.toLowerCase(sliceName))) {
      // TODO: pull this into a common validator that runs ealier.
      logDiscrepancies(
          "Warning: Inconsistent slice name for element with id "
              + element.getId().getValue()
              + " and slicename "
              + element.getSliceName());
    }
    sliceName = hyphenToCamel(sliceName);
    return resolveSliceNameConflicts(sliceName, element, elementList);
  }

  private static String hyphenToCamel(String fieldName) {
    int i;
    while ((i = fieldName.indexOf("-")) != -1) {
      fieldName =
          fieldName.substring(0, i)
              + Ascii.toUpperCase(fieldName.substring(i + 1, i + 2))
              + fieldName.substring(i + 2);
    }
    return fieldName;
  }

  private static boolean descendantsHaveSlices(
      ElementDefinition element, List<ElementDefinition> elementList) {
    return getDescendants(element, elementList).stream()
        .anyMatch(candidate -> candidate.hasSliceName());
  }

  // Given a potential slice field name and an element, returns true if that slice name would
  // conflict with the field name of any siblings to that elements.
  // TODO: This only checks against non-slice names.  Theoretically, you could have
  // two identically-named slices of different base fields.
  private static String resolveSliceNameConflicts(
      String fieldName, ElementDefinition element, List<ElementDefinition> elementList) {
    if (RESERVED_FIELD_NAMES.contains(fieldName)) {
      return fieldName + "Slice";
    }
    Optional<ElementDefinition> parent = GeneratorUtils.getParent(element, elementList);
    if (!parent.isPresent()) {
      // This is a profile on a top-level Element. There can't be any conflicts.
      return fieldName;
    }
    List<ElementDefinition> elementsWithIdsConflictingWithSliceName =
        getDirectChildren(parent.get(), elementList).stream()
            .filter(
                candidateElement ->
                    toFieldNameCase(lastIdToken(candidateElement).pathpart)
                            .equals(toFieldNameCase(fieldName))
                        && !candidateElement.getBase().getPath().getValue().equals("Extension.url"))
            .collect(Collectors.toList());

    return elementsWithIdsConflictingWithSliceName.isEmpty() ? fieldName : fieldName + "Slice";
  }

  // TODO: memoize
  private Optional<ElementDefinition> getChoiceTypeBase(ElementDefinition element) {
    if (!element.hasBase()) {
      return Optional.empty();
    }
    String basePath = element.getBase().getPath().getValue();
    if (basePath.equals("Extension.value[x]")) {
      // Extension value fields extend from choice-types, but since single-typed extensions will be
      // inlined as that type anyway, there's no point in generating a choice type for them.
      return Optional.empty();
    }
    String baseType = Splitter.on(".").splitToList(basePath).get(0);
    if (basePath.endsWith("[x]")) {
      ElementDefinition choiceTypeBase =
          getElementById(basePath, baseStructDefsById.get(baseType).getSnapshot().getElementList());
      return Optional.of(choiceTypeBase);
    }
    if (!baseType.equals("Element")) {
      // Traverse up the tree to check for a choice type in this element's ancestry.
      if (!baseStructDefsById.containsKey(baseType)) {
        throw new IllegalArgumentException("Unknown StructureDefinition id: " + baseType);
      }
      ElementDefinition baseElement =
          getElementById(basePath, baseStructDefsById.get(baseType).getSnapshot().getElementList());
      if (baseElement.getId().equals(element.getId())) {
        // Starting with r4, elements that don't inherit from anything list themselves as base :/
        return Optional.empty();
      }
      return getChoiceTypeBase(baseElement);
    }
    return Optional.empty();
  }

  private boolean useLegacyTypeNaming() {
    return useLegacyTypeNaming(packageInfo.getFhirVersion());
  }

  private static boolean useLegacyTypeNaming(Annotations.FhirVersion version) {
    return version != Annotations.FhirVersion.R4;
  }

  /** Add a choice type container message to the proto. */
  private DescriptorProto makeChoiceType(
      ElementDefinition element, List<ElementDefinition> elementList) {
    QualifiedType choiceQualifiedType = getQualifiedFieldType(element, elementList);
    DescriptorProto.Builder choiceType =
        DescriptorProto.newBuilder().setName(choiceQualifiedType.getName());
    choiceType.getOptionsBuilder().setExtension(Annotations.isChoiceType, true);

    // Add constraints on choice types.
    List<String> expressions = getFhirPathConstraints(element);
    if (!expressions.isEmpty()) {
      choiceType
          .getOptionsBuilder()
          .setExtension(Annotations.fhirPathMessageConstraint, expressions);
    }

    choiceType.addOneofDeclBuilder().setName("choice");

    int nextTag = 1;
    // Group types.
    List<ElementDefinition.TypeRef> types = new ArrayList<>();
    List<String> referenceTypes = new ArrayList<>();
    Set<String> foundTypes = new HashSet<>();
    for (ElementDefinition.TypeRef type : element.getTypeList()) {
      if (!foundTypes.contains(type.getCode().getValue())) {
        types.add(type);
        foundTypes.add(type.getCode().getValue());
      }

      if (type.getCode().getValue().equals("Reference") && type.getTargetProfileCount() > 0) {
        for (Canonical referenceType : type.getTargetProfileList()) {
          if (!referenceType.getValue().isEmpty()) {
            referenceTypes.add(referenceType.getValue());
          }
        }
      }
    }

    for (ElementDefinition.TypeRef type : types) {
      String fieldName =
          Ascii.toLowerCase(type.getCode().getValue().substring(0, 1))
              + type.getCode().getValue().substring(1);

      // There are two cases of choice type fields:
      // a) we need to generate a custom type for the field (e.g., a bound code, or a profiled type)
      // b) it's an already existing type, so just generate the field.

      // Check for a slice of this type on the choice, e.g., value[x]:valueCode
      // If one is found, use that to create the choice field and type.  Otherwise, just use the
      // value[x] element itself.
      ElementDefinition choiceFieldElement =
          checkForChoiceSlice(type, element, elementList).orElse(element);
      Optional<DescriptorProto> typeFromChoiceElement =
          buildNonChoiceTypeNestedTypeIfNeeded(choiceFieldElement, elementList);

      if (typeFromChoiceElement.isPresent()) {
        // There is a sub type
        choiceType.addNestedType(typeFromChoiceElement.get());
        QualifiedType sliceType =
            choiceQualifiedType.childType(typeFromChoiceElement.get().getName());
        FieldDescriptorProto.Builder fieldBuilder =
            buildFieldInternal(
                    fieldName,
                    sliceType.type,
                    sliceType.packageName,
                    nextTag++,
                    FieldDescriptorProto.Label.LABEL_OPTIONAL,
                    FieldOptions.getDefaultInstance())
                .setOneofIndex(0);
        choiceType.addField(fieldBuilder);
      } else {
        // If no custom type was generated, just use the type name from the core FHIR types.
        // TODO:  This assumes all types in a oneof are core FHIR types.  In order to
        // support custom types, we'll need to load the structure definition for the type and check
        // against knownStructureDefinitionPackages
        FieldOptions.Builder options = FieldOptions.newBuilder();
        if (fieldName.equals("reference")) {
          for (String referenceType : referenceTypes) {
            addReferenceType(options, referenceType);
          }
        }
        FieldDescriptorProto.Builder fieldBuilder =
            buildFieldInternal(
                    fieldName,
                    normalizeType(type),
                    fhirVersion.coreProtoPackage,
                    nextTag++,
                    FieldDescriptorProto.Label.LABEL_OPTIONAL,
                    options.build())
                .setOneofIndex(0);
        choiceType.addField(fieldBuilder);
      }
    }
    return choiceType.build();
  }

  private static Optional<ElementDefinition> checkForChoiceSlice(
      ElementDefinition.TypeRef type,
      ElementDefinition element,
      List<ElementDefinition> elementList) {
    Set<ElementDefinition> matchingSlices =
        GeneratorUtils.getSlices(element, elementList).stream()
            .filter(
                elmenent ->
                    element.getTypeCount() == 1
                        && element
                            .getType(0)
                            .getCode()
                            .getValue()
                            .equals(type.getCode().getValue()))
            .collect(Collectors.toSet());
    if (matchingSlices.isEmpty()) {
      return Optional.empty();
    }
    // TODO: this might be something we need to eventually support, e.g., if oneof could
    // be bound to multiple different systems.
    if (matchingSlices.size() > 1) {
      throw new IllegalArgumentException(
          "Invalid choice type slicing: More than one slice of a given type on"
              + element.getId().getValue()
              + ".  Type: "
              + type.getCode().getValue());
    }
    return Optional.of(Iterables.getOnlyElement(matchingSlices));
  }

  private void addReferenceType(FieldOptions.Builder options, String referenceUrl) {
    options.addExtension(
        Annotations.validReferenceType, getBaseStructureDefinitionData(referenceUrl).inlineType);
  }

  /**
   * Given a structure definition url, returns the base (FHIR) structure definition data for that
   * type.
   */
  private StructureDefinitionData getBaseStructureDefinitionData(String url) {
    StructureDefinitionData defData = getDefinitionDataByUrl(url);
    while (isProfile(defData.structDef)) {
      defData = getDefinitionDataByUrl(defData.structDef.getBaseDefinition().getValue());
    }
    return defData;
  }

  private static FieldDescriptorProto.Builder buildFieldInternal(
      String fhirName,
      String fieldType,
      String fieldPackage,
      int tag,
      FieldDescriptorProto.Label size,
      FieldOptions options) {
    FieldDescriptorProto.Builder builder =
        FieldDescriptorProto.newBuilder()
            .setNumber(tag)
            .setType(FieldDescriptorProto.Type.TYPE_MESSAGE)
            .setLabel(size)
            .setTypeName("." + fieldPackage + "." + fieldType);

    String fieldName =
        RESERVED_FIELD_NAMES.contains(fhirName)
            ? toFieldNameCase(fhirName) + "_value"
            : toFieldNameCase(fhirName);

    builder.setName(fieldName);
    if (!fhirName.equals(snakeCaseToJsonCase(fieldName))) {
      // We can't recover the original FHIR field name with a to-json transform, so add an
      // annotation
      // for the original field name.
      builder.setJsonName(fhirName);
    }

    // Add annotations.
    if (!options.equals(FieldOptions.getDefaultInstance())) {
      builder.setOptions(options);
    }
    return builder;
  }

  private String normalizeType(ElementDefinition.TypeRef type) {
    String code = type.getCode().getValue();
    if (code.startsWith(FHIRPATH_TYPE_PREFIX)) {
      for (Extension extension : type.getExtensionList()) {
        if (extension.getUrl().getValue().equals(FHIR_TYPE_EXTENSION_URL)) {
          return toFieldTypeCase(extension.getValue().getUrl().getValue());
        }
      }
    }
    if (type.getProfileCount() == 0 || type.getProfile(0).getValue().isEmpty()) {
      return toFieldTypeCase(code);
    }
    String profileUrl = type.getProfile(0).getValue();
    if (structDefDataByUrl.containsKey(profileUrl)) {
      return structDefDataByUrl.get(profileUrl).inlineType;
    }
    throw new IllegalArgumentException(
        "Unable to deduce typename for profile: " + profileUrl + " on " + type);
  }

  private static String snakeCaseToJsonCase(String snakeString) {
    return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, snakeString);
  }

  private Optional<QualifiedType> checkForTypeWithBoundValueSet(
      ElementDefinition element, List<ElementDefinition> elementList) {
    // Note that for Simple extensions that are inlined as a single type, we need to actually check
    // the internal value element on the extension, even though the element we're replacing and
    // naming the field after is the extension itself.  Thus, here we differentiate between
    // "value element" and "naming element".
    // E.g., for element mySubExtension, which has a valueCoding element on it, the datatype will be
    // generated from the valueElement, valueCoding in this case, but the name should be based on
    // the original, mySubExtension element.
    //
    // For all cases other than simple sub extensions, the value element is equal to the naming
    // element.
    ElementDefinition namingElement = element;
    ElementDefinition valueElement =
        isSimpleExtension(element, elementList)
            ? getExtensionValueElement(element, elementList)
            : element;

    // If this is a simple extension structure definition with a single possible
    // type, make sure to check for a slice of that type to use to generate the field.  This
    // special case is necessary, because when in a complex extension, this is handled when looking
    // at the simple extension _field_.  In this case that field doesn't exist, so we need to make a
    // special case for slicing.
    // TODO: We should do a broader rewrite at somepoint that makes type and field
    // co-generated.  That would remove this class of special case.
    if (element == valueElement
        && element.getPath().getValue().equals("Extension.value[x]")
        && isValueElementOfSingleTypedExtension(element, elementList)
        && !isSlice(element)) {
      valueElement = checkForChoiceSlice(element.getType(0), element, elementList).orElse(element);
    }

    if (getDistinctTypeCount(valueElement) == 1) {
      String containerName = getContainerType(namingElement, elementList);
      ElementDefinition.TypeRef type = valueElement.getType(0);

      String typeName = type.getCode().getValue();
      Optional<String> valueSetUrl = getBindingValueSetUrl(valueElement, elementList);
      if (valueSetUrl.isPresent()) {
        if (typeName.equals("code")) {
          if (!containerName.endsWith("Code") && !containerName.endsWith(".CodeType")) {
            // Carve out some exceptions because CodeCode and CodeTypeCode sounds silly.
            containerName = containerName + "Code";
          }
          return Optional.of(new QualifiedType(containerName, packageInfo.getProtoPackage()));
        }
        if (!useLegacyTypeNaming() && typeName.equals("Coding")) {
          return Optional.of(
              new QualifiedType(containerName + "Coding", packageInfo.getProtoPackage()));
        }
      }
      // TODO: Handle bound systems on CodeableConcepts
      // TODO: return an error for unhandled types with required bindings in strict mode
    }
    return Optional.empty();
  }

  private Optional<DescriptorProto> makeProfiledCodingIfRequired(
      ElementDefinition element, List<ElementDefinition> elementList) {
    // Coding profiles don't exist in legacy type naming.
    if (useLegacyTypeNaming()) {
      return Optional.empty();
    }
    // Note that in the case of sub extensions, the element will be an extension, but the field
    // we're using to generate the type will be the "value" field on that extension.
    // In all other cases, the value element is the same as the element passed in.
    ElementDefinition valueElement =
        isSimpleExtension(element, elementList)
            ? getExtensionValueElement(element, elementList)
            : element;

    if (valueElement.getTypeCount() != 1
        || !valueElement.getType(0).getCode().getValue().equals("Coding")) {
      return Optional.empty();
    }

    Optional<String> boundValueSetUrl = getBindingValueSetUrl(valueElement, elementList);
    if (!boundValueSetUrl.isPresent()) {
      return Optional.empty();
    }
    Optional<QualifiedType> typeWithBoundValueSet =
        checkForTypeWithBoundValueSet(element, elementList);
    if (!typeWithBoundValueSet.isPresent()) {
      return Optional.empty();
    }

    return Optional.of(
        valueSetGenerator.generateCodingWithBoundValueSet(
            boundValueSetUrl.get(), typeWithBoundValueSet.get()));
  }

  private static boolean isContainedResourceField(ElementDefinition element) {
    return element.getBase().getPath().getValue().equals("DomainResource.contained");
  }

  private String getTypedReferenceName(List<ElementDefinition.TypeRef> typeList) {
    // Use a Tree Set to have a stable sort.
    TreeSet<String> refTypes =
        typeList.stream()
            .flatMap(type -> type.getTargetProfileList().stream())
            .map(profile -> profile.getValue())
            .collect(toCollection(TreeSet::new));

    String refType = null;
    for (String r : refTypes) {
      if (!r.isEmpty()) {
        if (structDefDataByUrl.containsKey(r)) {
          r = structDefDataByUrl.get(r).inlineType;
        } else {
          throw new IllegalArgumentException("Unsupported reference profile: " + r);
        }
        if (refType == null) {
          refType = r;
        } else {
          refType = refType + "Or" + r;
        }
      }
    }
    if (refType != null && !refType.equals("Resource")) {
      // Specialize the reference type.
      return refType + "Reference";
    }
    return "Reference";
  }

  private static boolean isExtensionBackboneElement(ElementDefinition element) {
    // An element is an extension element if either
    // A) it is a root element with id "Extension" and is a derivation from a base element or
    // B) it is a slice on an extension that is not defined by an external profile.
    if (!element.hasBase()) {
      return false;
    }
    String idString = element.getId().getValue();
    boolean isRootExtensionElement =
        idString.equals("Extension")
            || (!idString.contains(".") && idString.startsWith("Extension:"));
    boolean isInternallyDefinedExtension =
        (element.getBase().getPath().getValue().endsWith(".extension")
            && lastIdToken(element).slicename != null
            && element.getType(0).getProfileCount() == 0);
    return isRootExtensionElement || isInternallyDefinedExtension;
  }

  // Returns the QualifiedType (type + package) of a simple extension.
  private QualifiedType getSimpleExtensionDefinitionType(
      StructureDefinition def, String protoPackage) {
    if (!isExtensionProfile(def)) {
      throw new IllegalArgumentException(
          "StructureDefinition is not an extension profile: " + def.getId().getValue());
    }
    if (!isSingleTypedExtensionDefinition(def)) {
      throw new IllegalArgumentException(
          "StructureDefinition is not a simple extension: " + def.getId().getValue());
    }

    ElementDefinition element = def.getSnapshot().getElement(0);
    List<ElementDefinition> elementList = def.getSnapshot().getElementList();
    ElementDefinition valueElement = getExtensionValueElement(element, elementList);
    QualifiedType valueType = getQualifiedFieldType(valueElement, elementList);

    // getQualifiedFieldType is not package-aware, it assumes that anything that is not core is from
    // the "current" package (i.e., the package used in the constructor).  So, in the case where
    // getQualifiedFieldType returns a non-core package, replace it with the package this structure
    // definition belongs in.
    if (!valueType.packageName.equals(fhirVersion.coreProtoPackage)) {
      valueType = new QualifiedType(valueType.type, protoPackage);
    }

    return new QualifiedType(
        valueType.type.replaceFirst("Extension", getTypeName(def)), valueType.packageName);
  }

  private static ElementDefinition getExtensionValueElement(
      ElementDefinition element, List<ElementDefinition> elementList) {
    for (ElementDefinition child : getDirectChildren(element, elementList)) {
      if (!isSlice(child) && child.getBase().getPath().getValue().endsWith(".value[x]")) {
        if (child.getTypeCount() == 1
            && !child.getType(0).getCode().getValue().equals("Extension")) {
          // This is not a true choice type, since we don't generate choice types for extensions
          // with only one valid type.  So, check if there's a slicing for that type and use
          // that as the value element if present.
          return checkForChoiceSlice(child.getType(0), child, elementList).orElse(child);
        }
        return child;
      }
    }
    throw new IllegalArgumentException(
        "Element " + element.getId().getValue() + " has no value element");
  }

  private QualifiedType getSimpleInternalExtensionType(
      ElementDefinition element, List<ElementDefinition> elementList) {
    ElementDefinition valueElement = getExtensionValueElement(element, elementList);

    if (valueElement.getMax().getValue().equals("0")) {
      // There is no value element, this is a complex extension.
      throw new IllegalArgumentException(
          "getSimpleInternalExtensionType called with complex extension: "
              + element.getId().getValue());
    }
    return getQualifiedFieldType(valueElement, elementList);
  }

  private static long getDistinctTypeCount(ElementDefinition element) {
    // Don't do fancier logic if fast logic is sufficient.
    if (element.getTypeCount() < 2 || USE_TYPED_REFERENCES) {
      return element.getTypeCount();
    }
    return element.getTypeList().stream().map(type -> type.getCode()).distinct().count();
  }

  private static boolean isChoiceTypeExtension(
      ElementDefinition element, List<ElementDefinition> elementList) {
    if (!isExtensionBackboneElement(element)) {
      return false;
    }
    ElementDefinition valueElement = getExtensionValueElement(element, elementList);
    return !valueElement.getMax().getValue().equals("0") && getDistinctTypeCount(valueElement) > 1;
  }

  private static boolean isSimpleExtension(
      ElementDefinition element, List<ElementDefinition> elementList) {
    return isExtensionBackboneElement(element)
        && !getExtensionValueElement(element, elementList).getMax().getValue().equals("0");
  }

  private static boolean isComplexInternalExtension(
      ElementDefinition element, List<ElementDefinition> elementList) {
    return isExtensionBackboneElement(element) && !isSimpleExtension(element, elementList);
  }

  private static boolean isSingleTypedExtensionDefinition(StructureDefinition def) {
    ElementDefinition element = def.getSnapshot().getElement(0);
    List<ElementDefinition> elementList = def.getSnapshot().getElementList();
    return isSimpleExtension(element, elementList);
  }

  /**
   * Returns the type that should be used for an internal extension. If this is a simple internal
   * extension, uses the appropriate primitive type. If this is a complex internal extension, treats
   * the element like a backbone container.
   */
  private QualifiedType getInternalExtensionType(
      ElementDefinition element, List<ElementDefinition> elementList) {
    return isSimpleExtension(element, elementList)
        ? getSimpleInternalExtensionType(element, elementList)
        : new QualifiedType(getContainerType(element, elementList), packageInfo.getProtoPackage());
  }

  // TODO: consider supporting more types of slicing.
  private static boolean isElementSupportedForSlicing(ElementDefinition element) {
    return element.getTypeCount() == 1
        && (element.getType(0).getCode().getValue().equals("Extension")
            || element.getType(0).getCode().getValue().equals("Coding"));
  }

  private static ContainedResourceBehavior getContainedResourceBehavior(PackageInfo info) {
    if (info.getContainedResourceBehavior() != ContainedResourceBehavior.DEFAULT) {
      return info.getContainedResourceBehavior();
    }
    switch (info.getFhirVersion()) {
      case STU3:
        return ContainedResourceBehavior.TYPED_CONTAINED_RESOURCE;
      default:
        return ContainedResourceBehavior.ANY;
    }
  }

  private static final boolean PRINT_SNAPSHOT_DISCREPANCIES = false;

  private static void logDiscrepancies(String msg) {
    if (PRINT_SNAPSHOT_DISCREPANCIES) {
      System.out.println(msg);
    }
  }

  // We generate protos based on the "Snapshot" view of the proto, but these are often
  // generated off of the "Differential" view, which can be buggy.  So, before processing the
  // snapshot, do a pass over the differential and correct any inconsistencies in the snapshot.
  private static StructureDefinition reconcileSnapshotAndDifferential(StructureDefinition def) {
    // Generate a map from (element id) -> (element) for all elements in the Differential view.
    Map<String, ElementDefinition> diffs =
        def.getDifferential().getElementList().stream()
            .collect(
                Collectors.toMap((element) -> element.getId().getValue(), Function.identity()));

    StructureDefinition.Builder defBuilder = def.toBuilder();
    defBuilder.getSnapshotBuilder().clearElement();
    for (ElementDefinition element : def.getSnapshot().getElementList()) {
      ElementDefinition elementDiffs = diffs.get(element.getId().getValue());
      defBuilder
          .getSnapshotBuilder()
          .addElement(
              elementDiffs == null
                  ? element
                  : (ElementDefinition)
                      reconcileMessage(
                          element,
                          elementDiffs,
                          def.getId().getValue(),
                          element.getId().getValue(),
                          ""));
    }
    return defBuilder.build();
  }

  private static Message reconcileMessage(
      Message snapshot,
      Message differential,
      String structureDefinitionId,
      String elementId,
      String fieldpath) {
    Message.Builder reconciledElement = snapshot.toBuilder();
    for (FieldDescriptor field : reconciledElement.getDescriptorForType().getFields()) {
      String subFieldpath = (fieldpath.isEmpty() ? "" : (fieldpath + ".")) + field.getJsonName();
      if (!field.isRepeated()
          && differential.hasField(field)
          && !differential.getField(field).equals(reconciledElement.getField(field))) {
        if (AnnotationUtils.isPrimitiveType(field.getMessageType())) {
          reconciledElement.setField(field, differential.getField(field));
          logDiscrepancies(
              "Warning: found inconsistent Snapshot for "
                  + structureDefinitionId
                  + ".  Field \""
                  + subFieldpath
                  + "\" on "
                  + elementId
                  + " has snapshot\n"
                  + snapshot.getField(field)
                  + "but differential\n"
                  + differential.getField(field)
                  + "Using differential value for protogeneration.\n");
        } else {
          reconciledElement.setField(
              field,
              reconcileMessage(
                  (Message) snapshot.getField(field),
                  (Message) differential.getField(field),
                  structureDefinitionId,
                  elementId,
                  subFieldpath));
        }
      } else if (field.isRepeated()) {
        // For repeated fields, make sure each element in the differential appears in the snapshot.
        Set<Message> valuesInSnapshot = new HashSet<>();
        for (int i = 0; i < snapshot.getRepeatedFieldCount(field); i++) {
          valuesInSnapshot.add((Message) snapshot.getRepeatedField(field, i));
        }
        for (int i = 0; i < differential.getRepeatedFieldCount(field); i++) {
          Message differentialValue = (Message) differential.getRepeatedField(field, i);
          if (!valuesInSnapshot.contains(differentialValue)) {
            logDiscrepancies(
                "Warning: found inconsistent Snapshot for "
                    + structureDefinitionId
                    + ".  Field \""
                    + subFieldpath
                    + "\" on "
                    + elementId
                    + " has value on differential that is missing from snapshot:\n"
                    + differentialValue
                    + "Adding in for use in protogeneration.\n");
            reconciledElement.addRepeatedField(field, differentialValue);
          }
        }
      }
    }
    return reconciledElement.build();
  }
}
