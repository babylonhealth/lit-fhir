package com.babylonhealth.lit.hl7_java.model;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core.*;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.UnionAliases;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import izumi.reflect.macrortti.LTag;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import scala.math.BigDecimal;

public class Unions {
  public static class ChoiceBooleanOrDateTime extends Choice<$bslash$div<Boolean, FHIRDateTime>> {
    public ChoiceBooleanOrDateTime(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrDateTimeTag());
    }

    public ChoiceBooleanOrDateTime(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionBooleanOrDateTimeTag());
    }
  }

  public static class Choice00193937709
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>,
                      Expression>,
                  Reference>,
              TriggerDefinition>> {
    public Choice00193937709(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.Union00193937709Tag());
    }
  }

  public static class ChoiceQuantityOrRangeOrString
      extends Choice<$bslash$div<$bslash$div<Quantity, Range>, String>> {
    public ChoiceQuantityOrRangeOrString(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrRangeOrStringTag());
    }

    public ChoiceQuantityOrRangeOrString(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionQuantityOrRangeOrStringTag());
    }

    public ChoiceQuantityOrRangeOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionQuantityOrRangeOrStringTag());
    }
  }

  public static class ChoiceBooleanOrInteger extends Choice<$bslash$div<Boolean, Integer>> {
    public ChoiceBooleanOrInteger(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrIntegerTag());
    }

    public ChoiceBooleanOrInteger(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionBooleanOrIntegerTag());
    }
  }

  public static class ChoiceAddressOrReference extends Choice<$bslash$div<Address, Reference>> {
    public ChoiceAddressOrReference(Address arg) {
      super("Address", arg, (LTag) UnionAliases.UnionAddressOrReferenceTag());
    }

    public ChoiceAddressOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAddressOrReferenceTag());
    }
  }

  public static class ChoiceAttachmentOrReference
      extends Choice<$bslash$div<Attachment, Reference>> {
    public ChoiceAttachmentOrReference(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceTag());
    }

    public ChoiceAttachmentOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceTag());
    }
  }

  public static class Choice01850316684
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>> {
    public Choice01850316684(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01850316684Tag());
    }

    public Choice01850316684(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01850316684Tag());
    }

    public Choice01850316684(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01850316684Tag());
    }

    public Choice01850316684(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01850316684Tag());
    }
  }

  public static class ChoiceDateOrPeriod extends Choice<$bslash$div<FHIRDate, Period>> {
    public ChoiceDateOrPeriod(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDateOrPeriodTag());
    }

    public ChoiceDateOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateOrPeriodTag());
    }
  }

  public static class Choice01763000476
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>> {
    public Choice01763000476(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union01763000476Tag());
    }

    public Choice01763000476(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01763000476Tag());
    }

    public Choice01763000476(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01763000476Tag());
    }

    public Choice01763000476(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01763000476Tag());
    }
  }

  public static class ChoiceBooleanOrReference extends Choice<$bslash$div<Boolean, Reference>> {
    public ChoiceBooleanOrReference(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrReferenceTag());
    }

    public ChoiceBooleanOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionBooleanOrReferenceTag());
    }
  }

  public static class ChoiceQuantityOrString extends Choice<$bslash$div<Quantity, String>> {
    public ChoiceQuantityOrString(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrStringTag());
    }

    public ChoiceQuantityOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionQuantityOrStringTag());
    }
  }

  public static class Choice_1280102327
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<$bslash$div<BigDecimal, Boolean>, Coding>,
                                      FHIRDate>,
                                  FHIRDateTime>,
                              Integer>,
                          LocalTime>,
                      Quantity>,
                  Reference>,
              String>> {
    public Choice_1280102327(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }

    public Choice_1280102327(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1280102327Tag());
    }
  }

  public static class ChoiceAddressOrCodeableConceptOrReference
      extends Choice<$bslash$div<$bslash$div<Address, CodeableConcept>, Reference>> {
    public ChoiceAddressOrCodeableConceptOrReference(Address arg) {
      super("Address", arg, (LTag) UnionAliases.UnionAddressOrCodeableConceptOrReferenceTag());
    }

    public ChoiceAddressOrCodeableConceptOrReference(CodeableConcept arg) {
      super(
          "CodeableConcept",
          arg,
          (LTag) UnionAliases.UnionAddressOrCodeableConceptOrReferenceTag());
    }

    public ChoiceAddressOrCodeableConceptOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAddressOrCodeableConceptOrReferenceTag());
    }
  }

  public static class ChoiceMoneyOrUnsignedInt extends Choice<$bslash$div<Money, Integer>> {
    public ChoiceMoneyOrUnsignedInt(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionMoneyOrUnsignedIntTag());
    }

    public ChoiceMoneyOrUnsignedInt(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.UnionMoneyOrUnsignedIntTag());
    }
  }

  public static class ChoiceCanonicalOrCodeableConceptOrUri
      extends Choice<$bslash$div<$bslash$div<String, CodeableConcept>, String>> {
    public ChoiceCanonicalOrCodeableConceptOrUri(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptOrUriTag());
    }

    private ChoiceCanonicalOrCodeableConceptOrUri(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptOrUriTag());
    }

    public static ChoiceCanonicalOrCodeableConceptOrUri
        ChoiceCanonicalOrCodeableConceptOrUriCanonical(String arg) {
      return new ChoiceCanonicalOrCodeableConceptOrUri("Canonical", arg);
    }

    public static ChoiceCanonicalOrCodeableConceptOrUri ChoiceCanonicalOrCodeableConceptOrUriUriStr(
        String arg) {
      return new ChoiceCanonicalOrCodeableConceptOrUri("Uri", arg);
    }
  }

  public static class ChoiceAttachmentOrReferenceOrString
      extends Choice<$bslash$div<$bslash$div<Attachment, Reference>, String>> {
    public ChoiceAttachmentOrReferenceOrString(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceOrStringTag());
    }

    public ChoiceAttachmentOrReferenceOrString(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceOrStringTag());
    }

    public ChoiceAttachmentOrReferenceOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceOrStringTag());
    }
  }

  public static class ChoicePeriodOrStringOrTiming
      extends Choice<$bslash$div<$bslash$div<Period, String>, Timing>> {
    public ChoicePeriodOrStringOrTiming(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionPeriodOrStringOrTimingTag());
    }

    public ChoicePeriodOrStringOrTiming(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionPeriodOrStringOrTimingTag());
    }

    public ChoicePeriodOrStringOrTiming(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionPeriodOrStringOrTimingTag());
    }
  }

  public static class ChoiceReferenceOrUrl extends Choice<$bslash$div<Reference, String>> {
    public ChoiceReferenceOrUrl(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionReferenceOrUrlTag());
    }

    public ChoiceReferenceOrUrl(String arg) {
      super("Url", arg, (LTag) UnionAliases.UnionReferenceOrUrlTag());
    }
  }

  public static class Choice01480857620
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>,
                                  Integer>,
                              LocalTime>,
                          Integer>,
                      Quantity>,
                  Integer>,
              ZonedDateTime>> {
    public Choice01480857620(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    private Choice01480857620(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public static Choice01480857620 Choice01480857620Int(Integer arg) {
      return new Choice01480857620("Integer", arg);
    }

    public static Choice01480857620 Choice01480857620PositiveInt(Integer arg) {
      return new Choice01480857620("PositiveInt", arg);
    }

    public static Choice01480857620 Choice01480857620UnsignedInt(Integer arg) {
      return new Choice01480857620("UnsignedInt", arg);
    }
  }

  public static class ChoiceBase64BinaryOrString extends Choice<$bslash$div<byte[], String>> {
    public ChoiceBase64BinaryOrString(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.UnionBase64BinaryOrStringTag());
    }

    public ChoiceBase64BinaryOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionBase64BinaryOrStringTag());
    }
  }

  public static class ChoiceDecimalOrRange extends Choice<$bslash$div<BigDecimal, Range>> {
    public ChoiceDecimalOrRange(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionDecimalOrRangeTag());
    }

    public ChoiceDecimalOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionDecimalOrRangeTag());
    }
  }

  public static class ChoiceDateTimeOrPeriod extends Choice<$bslash$div<FHIRDateTime, Period>> {
    public ChoiceDateTimeOrPeriod(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodTag());
    }

    public ChoiceDateTimeOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodTag());
    }
  }

  public static class ChoiceMoneyOrStringOrUnsignedInt
      extends Choice<$bslash$div<$bslash$div<Money, String>, Integer>> {
    public ChoiceMoneyOrStringOrUnsignedInt(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionMoneyOrStringOrUnsignedIntTag());
    }

    public ChoiceMoneyOrStringOrUnsignedInt(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionMoneyOrStringOrUnsignedIntTag());
    }

    public ChoiceMoneyOrStringOrUnsignedInt(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.UnionMoneyOrStringOrUnsignedIntTag());
    }
  }

  public static class ChoiceDurationOrDate extends Choice<$bslash$div<Duration, FHIRDate>> {
    public ChoiceDurationOrDate(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrDateTag());
    }

    public ChoiceDurationOrDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDurationOrDateTag());
    }
  }

  public static class Choice00857130015
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Coding, FHIRDate>, Integer>, LocalTime>,
                  Reference>,
              String>> {
    public Choice00857130015(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union00857130015Tag());
    }

    public Choice00857130015(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00857130015Tag());
    }

    public Choice00857130015(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00857130015Tag());
    }

    public Choice00857130015(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00857130015Tag());
    }

    public Choice00857130015(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00857130015Tag());
    }

    public Choice00857130015(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00857130015Tag());
    }
  }

  public static class Choice01474038381
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>> {
    public Choice01474038381(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01474038381Tag());
    }

    public Choice01474038381(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01474038381Tag());
    }

    public Choice01474038381(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01474038381Tag());
    }

    public Choice01474038381(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01474038381Tag());
    }

    public Choice01474038381(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01474038381Tag());
    }
  }

  public static class ChoiceBooleanOrCanonical extends Choice<$bslash$div<Boolean, String>> {
    public ChoiceBooleanOrCanonical(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrCanonicalTag());
    }

    public ChoiceBooleanOrCanonical(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.UnionBooleanOrCanonicalTag());
    }
  }

  public static class Choice_0059314669
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Coding>,
                      FHIRDateTime>,
                  Integer>,
              String>> {
    public Choice_0059314669(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0059314669Tag());
    }

    public Choice_0059314669(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0059314669Tag());
    }

    public Choice_0059314669(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_0059314669Tag());
    }

    public Choice_0059314669(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0059314669Tag());
    }

    public Choice_0059314669(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_0059314669Tag());
    }

    private Choice_0059314669(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_0059314669Tag());
    }

    public static Choice_0059314669 Choice_0059314669Code(String arg) {
      return new Choice_0059314669("Code", arg);
    }

    public static Choice_0059314669 Choice_0059314669String(String arg) {
      return new Choice_0059314669("String", arg);
    }
  }

  public static class ChoiceDateOrPeriodOrString
      extends Choice<$bslash$div<$bslash$div<FHIRDate, Period>, String>> {
    public ChoiceDateOrPeriodOrString(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDateOrPeriodOrStringTag());
    }

    public ChoiceDateOrPeriodOrString(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateOrPeriodOrStringTag());
    }

    public ChoiceDateOrPeriodOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionDateOrPeriodOrStringTag());
    }
  }

  public static class ChoiceMoneyOrQuantity extends Choice<$bslash$div<Money, Quantity>> {
    public ChoiceMoneyOrQuantity(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionMoneyOrQuantityTag());
    }

    public ChoiceMoneyOrQuantity(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionMoneyOrQuantityTag());
    }
  }

  public static class ChoiceCanonicalOrUri extends Choice<$bslash$div<String, String>> {

    private ChoiceCanonicalOrUri(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionCanonicalOrUriTag());
    }

    public static ChoiceCanonicalOrUri ChoiceCanonicalOrUriCanonical(String arg) {
      return new ChoiceCanonicalOrUri("Canonical", arg);
    }

    public static ChoiceCanonicalOrUri ChoiceCanonicalOrUriUriStr(String arg) {
      return new ChoiceCanonicalOrUri("Uri", arg);
    }
  }

  public static class Choice01475253842
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<BigDecimal, Boolean>, String>, FHIRDateTime>,
                      Integer>,
                  String>,
              String>> {
    public Choice01475253842(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01475253842Tag());
    }

    public Choice01475253842(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01475253842Tag());
    }

    public Choice01475253842(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01475253842Tag());
    }

    public Choice01475253842(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01475253842Tag());
    }

    private Choice01475253842(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union01475253842Tag());
    }

    public static Choice01475253842 Choice01475253842Code(String arg) {
      return new Choice01475253842("Code", arg);
    }

    public static Choice01475253842 Choice01475253842String(String arg) {
      return new Choice01475253842("String", arg);
    }

    public static Choice01475253842 Choice01475253842UriStr(String arg) {
      return new Choice01475253842("Uri", arg);
    }
  }

  public static class Choice_1061953715
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<Boolean, CodeableConcept>, Integer>, Quantity>,
                      Range>,
                  Ratio>,
              String>> {
    public Choice_1061953715(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }

    public Choice_1061953715(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }

    public Choice_1061953715(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }

    public Choice_1061953715(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }

    public Choice_1061953715(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }

    public Choice_1061953715(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }

    public Choice_1061953715(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1061953715Tag());
    }
  }

  public static class Choice_1204024681
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Age, Period>, Range>, String>> {
    public Choice_1204024681(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_1204024681Tag());
    }

    public Choice_1204024681(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_1204024681Tag());
    }

    public Choice_1204024681(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1204024681Tag());
    }

    public Choice_1204024681(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1204024681Tag());
    }
  }

  public static class Choice01113166363
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<
                                          $bslash$div<
                                              $bslash$div<
                                                  $bslash$div<Attachment, BigDecimal>, Boolean>,
                                              Coding>,
                                          FHIRDate>,
                                      FHIRDateTime>,
                                  Integer>,
                              LocalTime>,
                          Quantity>,
                      Reference>,
                  String>,
              String>> {
    public Choice01113166363(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public Choice01113166363(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    private Choice01113166363(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union01113166363Tag());
    }

    public static Choice01113166363 Choice01113166363String(String arg) {
      return new Choice01113166363("String", arg);
    }

    public static Choice01113166363 Choice01113166363UriStr(String arg) {
      return new Choice01113166363("Uri", arg);
    }
  }

  public static class Choice00659500323
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>, Range>, String>> {
    public Choice00659500323(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union00659500323Tag());
    }

    public Choice00659500323(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00659500323Tag());
    }

    public Choice00659500323(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00659500323Tag());
    }

    public Choice00659500323(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00659500323Tag());
    }

    public Choice00659500323(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00659500323Tag());
    }
  }

  public static class ChoiceQuantityOrRatio extends Choice<$bslash$div<Quantity, Ratio>> {
    public ChoiceQuantityOrRatio(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrRatioTag());
    }

    public ChoiceQuantityOrRatio(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionQuantityOrRatioTag());
    }
  }

  public static class ChoiceDurationOrRange extends Choice<$bslash$div<Duration, Range>> {
    public ChoiceDurationOrRange(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrRangeTag());
    }

    public ChoiceDurationOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionDurationOrRangeTag());
    }
  }

  public static class Choice_0044338899
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>, Expression>> {
    public Choice_0044338899(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }

    public Choice_0044338899(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }

    public Choice_0044338899(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }

    public Choice_0044338899(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }
  }

  public static class ChoicePositiveIntOrString extends Choice<$bslash$div<Integer, String>> {
    public ChoicePositiveIntOrString(Integer arg) {
      super("PositiveInt", arg, (LTag) UnionAliases.UnionPositiveIntOrStringTag());
    }

    public ChoicePositiveIntOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionPositiveIntOrStringTag());
    }
  }

  public static class ChoiceAgeOrRangeOrString
      extends Choice<$bslash$div<$bslash$div<Age, Range>, String>> {
    public ChoiceAgeOrRangeOrString(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAgeOrRangeOrStringTag());
    }

    public ChoiceAgeOrRangeOrString(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionAgeOrRangeOrStringTag());
    }

    public ChoiceAgeOrRangeOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionAgeOrRangeOrStringTag());
    }
  }

  public static class Choice_0600299688
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<byte[], CodeableConcept>, Quantity>, String>> {
    public Choice_0600299688(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.Union_0600299688Tag());
    }

    public Choice_0600299688(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0600299688Tag());
    }

    public Choice_0600299688(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0600299688Tag());
    }

    public Choice_0600299688(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0600299688Tag());
    }
  }

  public static class Choice_2028408917
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Attachment, Boolean>, Quantity>, Reference>,
              String>> {
    public Choice_2028408917(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_2028408917Tag());
    }

    public Choice_2028408917(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_2028408917Tag());
    }

    public Choice_2028408917(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_2028408917Tag());
    }

    public Choice_2028408917(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_2028408917Tag());
    }

    public Choice_2028408917(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_2028408917Tag());
    }
  }

  public static class ChoiceIdentifierOrReference
      extends Choice<$bslash$div<Identifier, Reference>> {
    public ChoiceIdentifierOrReference(Identifier arg) {
      super("Identifier", arg, (LTag) UnionAliases.UnionIdentifierOrReferenceTag());
    }

    public ChoiceIdentifierOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionIdentifierOrReferenceTag());
    }
  }

  public static class ChoiceDateTimeOrString extends Choice<$bslash$div<FHIRDateTime, String>> {
    public ChoiceDateTimeOrString(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDateTimeOrStringTag());
    }

    public ChoiceDateTimeOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionDateTimeOrStringTag());
    }
  }

  public static class Choice02118820890
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<
                                          $bslash$div<
                                              $bslash$div<Boolean, CodeableConcept>, FHIRDateTime>,
                                          Integer>,
                                      LocalTime>,
                                  Period>,
                              Quantity>,
                          Range>,
                      Ratio>,
                  SampledData>,
              String>> {
    public Choice02118820890(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union02118820890Tag());
    }

    public Choice02118820890(String arg) {
      super("String", arg, (LTag) UnionAliases.Union02118820890Tag());
    }
  }

  public static class ChoiceCodeableConceptOrDate
      extends Choice<$bslash$div<CodeableConcept, FHIRDate>> {
    public ChoiceCodeableConceptOrDate(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrDateTag());
    }

    public ChoiceCodeableConceptOrDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionCodeableConceptOrDateTag());
    }
  }

  public static class ChoiceCodeableConceptOrDuration
      extends Choice<$bslash$div<CodeableConcept, Duration>> {
    public ChoiceCodeableConceptOrDuration(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrDurationTag());
    }

    public ChoiceCodeableConceptOrDuration(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionCodeableConceptOrDurationTag());
    }
  }

  public static class ChoicePeriodOrRange extends Choice<$bslash$div<Period, Range>> {
    public ChoicePeriodOrRange(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionPeriodOrRangeTag());
    }

    public ChoicePeriodOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionPeriodOrRangeTag());
    }
  }

  public static class Choice00133982841
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Quantity, Range>, Ratio>, String>> {
    public Choice00133982841(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00133982841Tag());
    }

    public Choice00133982841(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00133982841Tag());
    }

    public Choice00133982841(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union00133982841Tag());
    }

    public Choice00133982841(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00133982841Tag());
    }
  }

  public static class Choice_1690912481
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>,
              Reference>> {
    public Choice_1690912481(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }
  }

  public static class ChoiceCodeableConceptOrQuantity
      extends Choice<$bslash$div<CodeableConcept, Quantity>> {
    public ChoiceCodeableConceptOrQuantity(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityTag());
    }

    public ChoiceCodeableConceptOrQuantity(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityTag());
    }
  }

  public static class Choice00551919141
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Integer>,
              String>> {
    public Choice00551919141(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00551919141Tag());
    }

    public Choice00551919141(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00551919141Tag());
    }

    public Choice00551919141(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00551919141Tag());
    }

    private Choice00551919141(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union00551919141Tag());
    }

    public static Choice00551919141 Choice00551919141Id(String arg) {
      return new Choice00551919141("Id", arg);
    }

    public static Choice00551919141 Choice00551919141String(String arg) {
      return new Choice00551919141("String", arg);
    }
  }

  public static class ChoiceCodeableConceptOrQuantityOrRange
      extends Choice<$bslash$div<$bslash$div<CodeableConcept, Quantity>, Range>> {
    public ChoiceCodeableConceptOrQuantityOrRange(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityOrRangeTag());
    }

    public ChoiceCodeableConceptOrQuantityOrRange(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityOrRangeTag());
    }

    public ChoiceCodeableConceptOrQuantityOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityOrRangeTag());
    }
  }

  public static class Choice01405873694
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, Duration>, FHIRDateTime>, Period>,
                  Range>,
              Timing>> {
    public Choice01405873694(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01405873694Tag());
    }
  }

  public static class ChoiceCodingOrUri extends Choice<$bslash$div<Coding, String>> {
    public ChoiceCodingOrUri(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionCodingOrUriTag());
    }

    public ChoiceCodingOrUri(String arg) {
      super("Uri", arg, (LTag) UnionAliases.UnionCodingOrUriTag());
    }
  }

  public static class Choice00107722725
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>, ZonedDateTime>> {
    public Choice00107722725(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00107722725Tag());
    }

    public Choice00107722725(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00107722725Tag());
    }

    public Choice00107722725(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union00107722725Tag());
    }

    public Choice00107722725(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union00107722725Tag());
    }
  }

  public static class ChoiceDateTimeOrPeriodOrTiming
      extends Choice<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>> {
    public ChoiceDateTimeOrPeriodOrTiming(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodOrTimingTag());
    }

    public ChoiceDateTimeOrPeriodOrTiming(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodOrTimingTag());
    }

    public ChoiceDateTimeOrPeriodOrTiming(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodOrTimingTag());
    }
  }
}
