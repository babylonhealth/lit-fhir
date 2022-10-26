package com.babylonhealth.lit.core_java;

import com.babylonhealth.lit.core.*;
import com.babylonhealth.lit.core.model.*;
import java.util.HashSet;
import java.util.Set;
import scala.None$;
import scala.Option;
import scala.collection.immutable.TreeMap;
import scala.jdk.javaapi.CollectionConverters;

public class LitUtils {
  public static TreeMap<FHIRComponentFieldMeta<?>, PrimitiveElementInfo> emptyMetaElMap() {
    return TreeMap.<FHIRComponentFieldMeta<?>, PrimitiveElementInfo>newBuilder(
            FHIRObject.metaOrdering())
        .result();
  }

  public static <T> Option<T> none() {
    return None$.empty();
  }

  public static <T extends FHIRObject> String encode(T obj) {
    return encode(obj, defaultEncoderParams);
  }

  public static <T extends FHIRObject> String encode(T obj, EncoderParams encoderParams) {
    return encode(obj, encoderParams, true);
  }

  public static <T extends FHIRObject> String encode(
      T obj, EncoderParams encoderParams, boolean pretty) {
    return pretty
        ? serdes$.MODULE$.encodeComponent(obj, encoderParams).toString()
        : serdes$.MODULE$.encodeComponent(obj, encoderParams).noSpaces();
  }

  public static DecoderParams defaultDecoderParams =
      new DecoderParams(
          Config.tolerantBundleDecoding(),
          Config.tolerateProfileErrors(),
          Config.flexibleCardinality(),
          Config.decodePrimitiveExtensions(),
          Config.createPhantomValues(),
          Config.ignoreUnknownFields(),
          Config.logOnBadProfile(),
          Config.logOnMissingExtension(),
          Config.tolerateExtensionErrors(),
          Config.decodeSpecificExtensions());
  public static EncoderParams defaultEncoderParams = new EncoderParams(true, false, true);

  /** @throws FhirDecodeError when the string cannot be decoded to the given type */
  public static <T extends FHIRObject> T decodeWithParams(
      CompanionFor<T> obj, String jsonStr, DecoderParams params) {
    return serdes$.MODULE$.decodeFHIRObject(obj, jsonStr, params).get();
  }

  /** @throws FhirDecodeError when the string cannot be decoded to the given type */
  public static <T extends FHIRObject> T decodeWithParams(
      Class<T> klass, String jsonStr, DecoderParams params) {
    return decodeWithParams(
        (CompanionFor<T>) serdes$.MODULE$.companionClassMap().apply(klass), jsonStr, params);
  }

  /** @throws FhirDecodeError when the string cannot be decoded to the given type */
  public static <T extends FHIRObject> T decode(CompanionFor<T> obj, String jsonStr) {
    return decodeWithParams(obj, jsonStr, defaultDecoderParams);
  }

  public static <T extends FHIRObject> T decode(Class<T> klass, String jsonStr) {
    //noinspection unchecked -- every FHIRObject will have a companion
    return decode((CompanionFor<T>) serdes$.MODULE$.companionClassMap().apply(klass), jsonStr);
  }

  public static Resource decodeResource(String jsonStr) {
    return decode(Resource.class, jsonStr);
  }

  public static Set<String> validChoiceTypes(String className) {
    switch (className) {
      case "String":
        return Set.of("Canonical", "Code", "Id", "Markdown", "Oid", "Uri", "Url", "String");
      case "Integer":
        return Set.of("UnsignedInt", "PositiveInt", "Integer");
      case "Double":
        return Set.of("Decimal");
      case "LocalTime":
        return Set.of("Time");
      case "UUID":
        return Set.of("Uuid");
      case "ZonedDateTime":
        return Set.of("Instant");
      case "FHIRDateTime":
        return Set.of("DateTime");
      case "FHIRDate":
        return Set.of("Date");
      case "byte[]":
        return Set.of("Base64Binary");
      case "Dosage":
      case "Period":
      case "Distance":
      case "RelatedArtifact":
      case "SampledData":
      case "Timing":
      case "Range":
      case "ParameterDefinition":
      case "HumanName":
      case "Age":
      case "Contributor":
      case "Money":
      case "Boolean":
      case "UsageContext":
      case "Uuid":
      case "Expression":
      case "ContactPoint":
      case "Attachment":
      case "Duration":
      case "CodeableConcept":
      case "Address":
      case "Count":
      case "Coding":
      case "Ratio":
      case "Identifier":
      case "DataRequirement":
      case "Quantity":
      case "TriggerDefinition":
      case "Signature":
      case "Annotation":
      case "Reference":
      case "ContactDetail":
      case "Date":
        return Set.of(className);
      default:
        return Set.of();
    }
  }

  public static String autoSuffix(String className, FHIRComponentFieldMeta<?> fieldMeta) {
    var legalSuffixes = $bslash$div$.MODULE$.validSuffixes(fieldMeta.unwrappedTT());
    var guessedSuffixes = validChoiceTypes(className);
    if (guessedSuffixes.isEmpty())
      throw new RuntimeException(
          "Don't recognise the type '" + className + "' as a valid choice type");
    Set<String> intersection = new HashSet<>(guessedSuffixes);
    intersection.retainAll(CollectionConverters.asJava(legalSuffixes));
    if (intersection.isEmpty())
      throw new RuntimeException("Could not find a valid possibility for this choice");
    else if (intersection.size() > 1)
      throw new RuntimeException("Found more than one valid possibility for this choice");
    return intersection.iterator().next();
  }

  public static void guard(String className, String suffix, FHIRComponentFieldMeta<?> fieldMeta) {
    if (!validChoiceTypes(className).contains(suffix))
      throw new RuntimeException(
          "Suffix '" + suffix + "' is not compatible with class '" + className + "'");
    else if (!$bslash$div$.MODULE$.validSuffixes(fieldMeta.unwrappedTT()).contains(suffix))
      throw new RuntimeException("Cannot assign " + fieldMeta.unwrappedTT() + " to " + className);
  }

  public static class DateTimeSpecificity {
    public static final FHIRDateSpecificity Year = FHIRDateSpecificity.Year$.MODULE$;
    public static final FHIRDateSpecificity Month = FHIRDateSpecificity.Month$.MODULE$;
    public static final FHIRDateSpecificity Day = FHIRDateSpecificity.Day$.MODULE$;
    public static final FHIRDateTimeSpecificity Time = FHIRDateSpecificity.Time$.MODULE$;
    public static final FHIRDateTimeSpecificity Micros = FHIRDateSpecificity.Micros$.MODULE$;
  }
}
