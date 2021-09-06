package com.babylonhealth.lit.hl7_java.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.UUID;

import scala.math.BigDecimal;

import izumi.reflect.macrortti.LTag;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.*;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.UnionAliases;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

public class Unions {
  public static class Choice_1926447453
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>, ZonedDateTime>> {
    public Choice_1926447453(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1926447453Tag());
    }

    public Choice_1926447453(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_1926447453Tag());
    }

    public Choice_1926447453(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union_1926447453Tag());
    }

    public Choice_1926447453(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union_1926447453Tag());
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

  public static class ChoiceBooleanOrCanonical extends Choice<$bslash$div<Boolean, String>> {
    public ChoiceBooleanOrCanonical(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrCanonicalTag());
    }

    public ChoiceBooleanOrCanonical(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.UnionBooleanOrCanonicalTag());
    }
  }

  public static class Choice01491947217
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Integer>,
              String>> {
    public Choice01491947217(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01491947217Tag());
    }

    public Choice01491947217(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01491947217Tag());
    }

    public Choice01491947217(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01491947217Tag());
    }

    private Choice01491947217(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union01491947217Tag());
    }

    public static Choice01491947217 Choice01491947217Id(String arg) {
      return new Choice01491947217("Id", arg);
    }

    public static Choice01491947217 Choice01491947217String(String arg) {
      return new Choice01491947217("String", arg);
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

  public static class Choice01946981731
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>> {
    public Choice01946981731(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01946981731Tag());
    }

    public Choice01946981731(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01946981731Tag());
    }

    public Choice01946981731(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01946981731Tag());
    }

    public Choice01946981731(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01946981731Tag());
    }

    public Choice01946981731(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01946981731Tag());
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

  public static class ChoiceCodeableConceptOrQuantity
      extends Choice<$bslash$div<CodeableConcept, Quantity>> {
    public ChoiceCodeableConceptOrQuantity(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityTag());
    }

    public ChoiceCodeableConceptOrQuantity(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityTag());
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

  public static class ChoiceMoneyOrUnsignedInt extends Choice<$bslash$div<Money, Integer>> {
    public ChoiceMoneyOrUnsignedInt(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionMoneyOrUnsignedIntTag());
    }

    public ChoiceMoneyOrUnsignedInt(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.UnionMoneyOrUnsignedIntTag());
    }
  }

  public static class ChoiceBooleanOrDateTime extends Choice<$bslash$div<Boolean, FHIRDateTime>> {
    public ChoiceBooleanOrDateTime(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrDateTimeTag());
    }

    public ChoiceBooleanOrDateTime(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionBooleanOrDateTimeTag());
    }
  }

  public static class Choice01138203188
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Quantity, Range>, Ratio>, String>> {
    public Choice01138203188(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01138203188Tag());
    }

    public Choice01138203188(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01138203188Tag());
    }

    public Choice01138203188(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union01138203188Tag());
    }

    public Choice01138203188(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01138203188Tag());
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

  public static class Choice01434501542
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>,
                      Expression>,
                  Reference>,
              TriggerDefinition>> {
    public Choice01434501542(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union01434501542Tag());
    }

    public Choice01434501542(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01434501542Tag());
    }

    public Choice01434501542(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union01434501542Tag());
    }

    public Choice01434501542(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union01434501542Tag());
    }

    public Choice01434501542(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01434501542Tag());
    }

    public Choice01434501542(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.Union01434501542Tag());
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

  public static class Choice_0603252906
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
    public Choice_0603252906(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    public Choice_0603252906(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    public Choice_0603252906(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    public Choice_0603252906(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    public Choice_0603252906(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    public Choice_0603252906(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    private Choice_0603252906(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_0603252906Tag());
    }

    public static Choice_0603252906 Choice_0603252906Int(Integer arg) {
      return new Choice_0603252906("Integer", arg);
    }

    public static Choice_0603252906 Choice_0603252906PositiveInt(Integer arg) {
      return new Choice_0603252906("PositiveInt", arg);
    }

    public static Choice_0603252906 Choice_0603252906UnsignedInt(Integer arg) {
      return new Choice_0603252906("UnsignedInt", arg);
    }
  }

  public static class Choice_0075792257
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, Duration>, FHIRDateTime>, Period>,
                  Range>,
              Timing>> {
    public Choice_0075792257(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_0075792257Tag());
    }

    public Choice_0075792257(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union_0075792257Tag());
    }

    public Choice_0075792257(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0075792257Tag());
    }

    public Choice_0075792257(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0075792257Tag());
    }

    public Choice_0075792257(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0075792257Tag());
    }

    public Choice_0075792257(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union_0075792257Tag());
    }
  }

  public static class Choice00515330545
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>, Range>, String>> {
    public Choice00515330545(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union00515330545Tag());
    }

    public Choice00515330545(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00515330545Tag());
    }

    public Choice00515330545(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00515330545Tag());
    }

    public Choice00515330545(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00515330545Tag());
    }

    public Choice00515330545(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00515330545Tag());
    }
  }

  public static class Choice02135982830
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
    public Choice02135982830(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public Choice02135982830(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    private Choice02135982830(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union02135982830Tag());
    }

    public static Choice02135982830 Choice02135982830String(String arg) {
      return new Choice02135982830("String", arg);
    }

    public static Choice02135982830 Choice02135982830UriStr(String arg) {
      return new Choice02135982830("Uri", arg);
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

  public static class ChoiceQuantityOrRatio extends Choice<$bslash$div<Quantity, Ratio>> {
    public ChoiceQuantityOrRatio(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrRatioTag());
    }

    public ChoiceQuantityOrRatio(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionQuantityOrRatioTag());
    }
  }

  public static class Choice_1213298663
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>,
              Reference>> {
    public Choice_1213298663(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1213298663Tag());
    }

    public Choice_1213298663(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1213298663Tag());
    }

    public Choice_1213298663(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1213298663Tag());
    }

    public Choice_1213298663(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1213298663Tag());
    }

    public Choice_1213298663(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1213298663Tag());
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

  public static class Choice_0865080338
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<BigDecimal, Boolean>, String>, FHIRDateTime>,
                      Integer>,
                  String>,
              String>> {
    public Choice_0865080338(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0865080338Tag());
    }

    public Choice_0865080338(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0865080338Tag());
    }

    public Choice_0865080338(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0865080338Tag());
    }

    public Choice_0865080338(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_0865080338Tag());
    }

    private Choice_0865080338(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_0865080338Tag());
    }

    public static Choice_0865080338 Choice_0865080338Code(String arg) {
      return new Choice_0865080338("Code", arg);
    }

    public static Choice_0865080338 Choice_0865080338String(String arg) {
      return new Choice_0865080338("String", arg);
    }

    public static Choice_0865080338 Choice_0865080338UriStr(String arg) {
      return new Choice_0865080338("Uri", arg);
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

  public static class ChoiceCodeableConceptOrDate
      extends Choice<$bslash$div<CodeableConcept, FHIRDate>> {
    public ChoiceCodeableConceptOrDate(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrDateTag());
    }

    public ChoiceCodeableConceptOrDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionCodeableConceptOrDateTag());
    }
  }

  public static class Choice00228735254
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Age, Period>, Range>, String>> {
    public Choice00228735254(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union00228735254Tag());
    }

    public Choice00228735254(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00228735254Tag());
    }

    public Choice00228735254(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00228735254Tag());
    }

    public Choice00228735254(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00228735254Tag());
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

  public static class Choice_1938137622
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>> {
    public Choice_1938137622(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union_1938137622Tag());
    }

    public Choice_1938137622(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1938137622Tag());
    }

    public Choice_1938137622(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_1938137622Tag());
    }

    public Choice_1938137622(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union_1938137622Tag());
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

  public static class Choice00836574492
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>, Expression>> {
    public Choice00836574492(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union00836574492Tag());
    }

    public Choice00836574492(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union00836574492Tag());
    }

    public Choice00836574492(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union00836574492Tag());
    }

    public Choice00836574492(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union00836574492Tag());
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

  public static class Choice_1534826566
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<byte[], CodeableConcept>, Quantity>, String>> {
    public Choice_1534826566(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.Union_1534826566Tag());
    }

    public Choice_1534826566(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1534826566Tag());
    }

    public Choice_1534826566(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1534826566Tag());
    }

    public Choice_1534826566(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1534826566Tag());
    }
  }

  public static class Choice_0536852827
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>> {
    public Choice_0536852827(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0536852827Tag());
    }

    public Choice_0536852827(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0536852827Tag());
    }

    public Choice_0536852827(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0536852827Tag());
    }

    public Choice_0536852827(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0536852827Tag());
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

  public static class Choice00304335386
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
    public Choice00304335386(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00304335386Tag());
    }

    public Choice00304335386(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00304335386Tag());
    }
  }

  public static class Choice_0861648458
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Attachment, Boolean>, Quantity>, Reference>,
              String>> {
    public Choice_0861648458(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_0861648458Tag());
    }

    public Choice_0861648458(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0861648458Tag());
    }

    public Choice_0861648458(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0861648458Tag());
    }

    public Choice_0861648458(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0861648458Tag());
    }

    public Choice_0861648458(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0861648458Tag());
    }
  }

  public static class Choice00566743606
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Coding>,
                      FHIRDateTime>,
                  Integer>,
              String>> {
    public Choice00566743606(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00566743606Tag());
    }

    public Choice00566743606(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00566743606Tag());
    }

    public Choice00566743606(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union00566743606Tag());
    }

    public Choice00566743606(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00566743606Tag());
    }

    public Choice00566743606(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00566743606Tag());
    }

    private Choice00566743606(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union00566743606Tag());
    }

    public static Choice00566743606 Choice00566743606Code(String arg) {
      return new Choice00566743606("Code", arg);
    }

    public static Choice00566743606 Choice00566743606String(String arg) {
      return new Choice00566743606("String", arg);
    }
  }

  public static class Choice01239641171
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
    public Choice01239641171(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union01239641171Tag());
    }

    public Choice01239641171(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01239641171Tag());
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

  public static class Choice_1011524451
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<Boolean, CodeableConcept>, Integer>, Quantity>,
                      Range>,
                  Ratio>,
              String>> {
    public Choice_1011524451(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1011524451Tag());
    }

    public Choice_1011524451(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1011524451Tag());
    }

    public Choice_1011524451(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1011524451Tag());
    }

    public Choice_1011524451(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1011524451Tag());
    }

    public Choice_1011524451(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1011524451Tag());
    }

    public Choice_1011524451(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_1011524451Tag());
    }

    public Choice_1011524451(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1011524451Tag());
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

  public static class Choice01554328235
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Coding, FHIRDate>, Integer>, LocalTime>,
                  Reference>,
              String>> {
    public Choice01554328235(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union01554328235Tag());
    }

    public Choice01554328235(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01554328235Tag());
    }

    public Choice01554328235(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01554328235Tag());
    }

    public Choice01554328235(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01554328235Tag());
    }

    public Choice01554328235(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01554328235Tag());
    }

    public Choice01554328235(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01554328235Tag());
    }
  }
}
