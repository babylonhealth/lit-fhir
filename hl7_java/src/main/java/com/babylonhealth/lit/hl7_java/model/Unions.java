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
  public static class ChoiceObservation_Effective
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>, ZonedDateTime>> {
    public ChoiceObservation_Effective(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionObservation_EffectiveTag());
    }

    public ChoiceObservation_Effective(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionObservation_EffectiveTag());
    }

    public ChoiceObservation_Effective(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionObservation_EffectiveTag());
    }

    public ChoiceObservation_Effective(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.UnionObservation_EffectiveTag());
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

  public static class ChoiceAction_Timing
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, Duration>, FHIRDateTime>, Period>,
                  Range>,
              Timing>> {
    public ChoiceAction_Timing(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAction_TimingTag());
    }

    public ChoiceAction_Timing(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionAction_TimingTag());
    }

    public ChoiceAction_Timing(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionAction_TimingTag());
    }

    public ChoiceAction_Timing(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionAction_TimingTag());
    }

    public ChoiceAction_Timing(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionAction_TimingTag());
    }

    public ChoiceAction_Timing(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionAction_TimingTag());
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

  public static class ChoiceTarget_Detail
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<Boolean, CodeableConcept>, Integer>, Quantity>,
                      Range>,
                  Ratio>,
              String>> {
    public ChoiceTarget_Detail(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }

    public ChoiceTarget_Detail(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }

    public ChoiceTarget_Detail(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }

    public ChoiceTarget_Detail(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }

    public ChoiceTarget_Detail(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }

    public ChoiceTarget_Detail(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }

    public ChoiceTarget_Detail(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionTarget_DetailTag());
    }
  }

  public static class ChoiceCharacteristic_Definition
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>,
                      Expression>,
                  Reference>,
              TriggerDefinition>> {
    public ChoiceCharacteristic_Definition(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.UnionCharacteristic_DefinitionTag());
    }

    public ChoiceCharacteristic_Definition(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCharacteristic_DefinitionTag());
    }

    public ChoiceCharacteristic_Definition(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.UnionCharacteristic_DefinitionTag());
    }

    public ChoiceCharacteristic_Definition(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.UnionCharacteristic_DefinitionTag());
    }

    public ChoiceCharacteristic_Definition(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionCharacteristic_DefinitionTag());
    }

    public ChoiceCharacteristic_Definition(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.UnionCharacteristic_DefinitionTag());
    }
  }

  public static class ChoiceBooleanOrInt extends Choice<$bslash$div<Boolean, Integer>> {
    public ChoiceBooleanOrInt(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrIntTag());
    }

    public ChoiceBooleanOrInt(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionBooleanOrIntTag());
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

  public static class ChoiceCanonicalOrCodeableConceptOrUriStr
      extends Choice<$bslash$div<$bslash$div<String, CodeableConcept>, String>> {
    public ChoiceCanonicalOrCodeableConceptOrUriStr(CodeableConcept arg) {
      super(
          "CodeableConcept", arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptOrUriStrTag());
    }

    private ChoiceCanonicalOrCodeableConceptOrUriStr(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptOrUriStrTag());
    }

    public static ChoiceCanonicalOrCodeableConceptOrUriStr
        ChoiceCanonicalOrCodeableConceptOrUriStrCanonical(String arg) {
      return new ChoiceCanonicalOrCodeableConceptOrUriStr("Canonical", arg);
    }

    public static ChoiceCanonicalOrCodeableConceptOrUriStr
        ChoiceCanonicalOrCodeableConceptOrUriStrUriStr(String arg) {
      return new ChoiceCanonicalOrCodeableConceptOrUriStr("Uri", arg);
    }
  }

  public static class ChoiceProperty_Value
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Coding>,
                      FHIRDateTime>,
                  Integer>,
              String>> {
    public ChoiceProperty_Value(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionProperty_ValueTag());
    }

    public ChoiceProperty_Value(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionProperty_ValueTag());
    }

    public ChoiceProperty_Value(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionProperty_ValueTag());
    }

    public ChoiceProperty_Value(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionProperty_ValueTag());
    }

    public ChoiceProperty_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionProperty_ValueTag());
    }

    private ChoiceProperty_Value(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionProperty_ValueTag());
    }

    public static ChoiceProperty_Value ChoiceProperty_ValueCode(String arg) {
      return new ChoiceProperty_Value("Code", arg);
    }

    public static ChoiceProperty_Value ChoiceProperty_ValueString(String arg) {
      return new ChoiceProperty_Value("String", arg);
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

  public static class ChoiceBase64BinaryOrString extends Choice<$bslash$div<byte[], String>> {
    public ChoiceBase64BinaryOrString(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.UnionBase64BinaryOrStringTag());
    }

    public ChoiceBase64BinaryOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionBase64BinaryOrStringTag());
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

  public static class ChoiceCodingOrUriStr extends Choice<$bslash$div<Coding, String>> {
    public ChoiceCodingOrUriStr(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionCodingOrUriStrTag());
    }

    public ChoiceCodingOrUriStr(String arg) {
      super("Uri", arg, (LTag) UnionAliases.UnionCodingOrUriStrTag());
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

  public static class ChoiceCharacteristic_Value
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>,
              Reference>> {
    public ChoiceCharacteristic_Value(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionCharacteristic_ValueTag());
    }

    public ChoiceCharacteristic_Value(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCharacteristic_ValueTag());
    }

    public ChoiceCharacteristic_Value(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionCharacteristic_ValueTag());
    }

    public ChoiceCharacteristic_Value(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionCharacteristic_ValueTag());
    }

    public ChoiceCharacteristic_Value(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionCharacteristic_ValueTag());
    }
  }

  public static class ChoiceFHIRDateTimeOrPeriodOrTiming
      extends Choice<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>> {
    public ChoiceFHIRDateTimeOrPeriodOrTiming(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrPeriodOrTimingTag());
    }

    public ChoiceFHIRDateTimeOrPeriodOrTiming(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrPeriodOrTimingTag());
    }

    public ChoiceFHIRDateTimeOrPeriodOrTiming(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrPeriodOrTimingTag());
    }
  }

  public static class ChoiceCanonicalOrUriStr extends Choice<$bslash$div<String, String>> {

    private ChoiceCanonicalOrUriStr(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionCanonicalOrUriStrTag());
    }

    public static ChoiceCanonicalOrUriStr ChoiceCanonicalOrUriStrCanonical(String arg) {
      return new ChoiceCanonicalOrUriStr("Canonical", arg);
    }

    public static ChoiceCanonicalOrUriStr ChoiceCanonicalOrUriStrUriStr(String arg) {
      return new ChoiceCanonicalOrUriStr("Uri", arg);
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

  public static class ChoiceEnableWhen_Answer
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
    public ChoiceEnableWhen_Answer(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }

    public ChoiceEnableWhen_Answer(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionEnableWhen_AnswerTag());
    }
  }

  public static class ChoiceFHIRDateOrPeriodOrString
      extends Choice<$bslash$div<$bslash$div<FHIRDate, Period>, String>> {
    public ChoiceFHIRDateOrPeriodOrString(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionFHIRDateOrPeriodOrStringTag());
    }

    public ChoiceFHIRDateOrPeriodOrString(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionFHIRDateOrPeriodOrStringTag());
    }

    public ChoiceFHIRDateOrPeriodOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionFHIRDateOrPeriodOrStringTag());
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

  public static class ChoiceDurationOrFHIRDate extends Choice<$bslash$div<Duration, FHIRDate>> {
    public ChoiceDurationOrFHIRDate(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrFHIRDateTag());
    }

    public ChoiceDurationOrFHIRDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDurationOrFHIRDateTag());
    }
  }

  public static class ChoiceSupportingInfo_Value
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Attachment, Boolean>, Quantity>, Reference>,
              String>> {
    public ChoiceSupportingInfo_Value(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionSupportingInfo_ValueTag());
    }

    public ChoiceSupportingInfo_Value(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionSupportingInfo_ValueTag());
    }

    public ChoiceSupportingInfo_Value(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionSupportingInfo_ValueTag());
    }

    public ChoiceSupportingInfo_Value(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionSupportingInfo_ValueTag());
    }

    public ChoiceSupportingInfo_Value(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionSupportingInfo_ValueTag());
    }
  }

  public static class ChoiceAllergyIntolerance_Onset
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>> {
    public ChoiceAllergyIntolerance_Onset(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAllergyIntolerance_OnsetTag());
    }

    public ChoiceAllergyIntolerance_Onset(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionAllergyIntolerance_OnsetTag());
    }

    public ChoiceAllergyIntolerance_Onset(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionAllergyIntolerance_OnsetTag());
    }

    public ChoiceAllergyIntolerance_Onset(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionAllergyIntolerance_OnsetTag());
    }

    public ChoiceAllergyIntolerance_Onset(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionAllergyIntolerance_OnsetTag());
    }
  }

  public static class ChoiceBooleanOrFHIRDateTime
      extends Choice<$bslash$div<Boolean, FHIRDateTime>> {
    public ChoiceBooleanOrFHIRDateTime(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrFHIRDateTimeTag());
    }

    public ChoiceBooleanOrFHIRDateTime(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionBooleanOrFHIRDateTimeTag());
    }
  }

  public static class ChoiceParameter_Value
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Integer>,
              String>> {
    public ChoiceParameter_Value(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionParameter_ValueTag());
    }

    public ChoiceParameter_Value(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionParameter_ValueTag());
    }

    public ChoiceParameter_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionParameter_ValueTag());
    }

    private ChoiceParameter_Value(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionParameter_ValueTag());
    }

    public static ChoiceParameter_Value ChoiceParameter_ValueId(String arg) {
      return new ChoiceParameter_Value("Id", arg);
    }

    public static ChoiceParameter_Value ChoiceParameter_ValueString(String arg) {
      return new ChoiceParameter_Value("String", arg);
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

  public static class ChoiceBigDecimalOrRange extends Choice<$bslash$div<BigDecimal, Range>> {
    public ChoiceBigDecimalOrRange(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionBigDecimalOrRangeTag());
    }

    public ChoiceBigDecimalOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionBigDecimalOrRangeTag());
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

  public static class ChoiceCondition_Onset
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Age, Period>, Range>, String>> {
    public ChoiceCondition_Onset(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionCondition_OnsetTag());
    }

    public ChoiceCondition_Onset(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionCondition_OnsetTag());
    }

    public ChoiceCondition_Onset(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionCondition_OnsetTag());
    }

    public ChoiceCondition_Onset(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionCondition_OnsetTag());
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

  public static class ChoiceReferenceOrUrlStr extends Choice<$bslash$div<Reference, String>> {
    public ChoiceReferenceOrUrlStr(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionReferenceOrUrlStrTag());
    }

    public ChoiceReferenceOrUrlStr(String arg) {
      super("Url", arg, (LTag) UnionAliases.UnionReferenceOrUrlStrTag());
    }
  }

  public static class ChoiceRelationship_Amount
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Quantity, Range>, Ratio>, String>> {
    public ChoiceRelationship_Amount(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionRelationship_AmountTag());
    }

    public ChoiceRelationship_Amount(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionRelationship_AmountTag());
    }

    public ChoiceRelationship_Amount(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionRelationship_AmountTag());
    }

    public ChoiceRelationship_Amount(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionRelationship_AmountTag());
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

  public static class ChoiceAnswerOption_Value
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Coding, FHIRDate>, Integer>, LocalTime>,
                  Reference>,
              String>> {
    public ChoiceAnswerOption_Value(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionAnswerOption_ValueTag());
    }

    public ChoiceAnswerOption_Value(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionAnswerOption_ValueTag());
    }

    public ChoiceAnswerOption_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionAnswerOption_ValueTag());
    }

    public ChoiceAnswerOption_Value(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionAnswerOption_ValueTag());
    }

    public ChoiceAnswerOption_Value(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAnswerOption_ValueTag());
    }

    public ChoiceAnswerOption_Value(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionAnswerOption_ValueTag());
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

  public static class ChoiceObservation_Value
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
    public ChoiceObservation_Value(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
    }

    public ChoiceObservation_Value(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionObservation_ValueTag());
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

  public static class ChoiceCharacteristic_ParticipantEffective
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>> {
    public ChoiceCharacteristic_ParticipantEffective(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionCharacteristic_ParticipantEffectiveTag());
    }

    public ChoiceCharacteristic_ParticipantEffective(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionCharacteristic_ParticipantEffectiveTag());
    }

    public ChoiceCharacteristic_ParticipantEffective(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionCharacteristic_ParticipantEffectiveTag());
    }

    public ChoiceCharacteristic_ParticipantEffective(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionCharacteristic_ParticipantEffectiveTag());
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

  public static class ChoiceFamilyMemberHistory_Deceased
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>, Range>, String>> {
    public ChoiceFamilyMemberHistory_Deceased(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionFamilyMemberHistory_DeceasedTag());
    }

    public ChoiceFamilyMemberHistory_Deceased(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionFamilyMemberHistory_DeceasedTag());
    }

    public ChoiceFamilyMemberHistory_Deceased(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionFamilyMemberHistory_DeceasedTag());
    }

    public ChoiceFamilyMemberHistory_Deceased(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionFamilyMemberHistory_DeceasedTag());
    }

    public ChoiceFamilyMemberHistory_Deceased(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionFamilyMemberHistory_DeceasedTag());
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

  public static class ChoiceCodeableConceptOrFHIRDate
      extends Choice<$bslash$div<CodeableConcept, FHIRDate>> {
    public ChoiceCodeableConceptOrFHIRDate(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrFHIRDateTag());
    }

    public ChoiceCodeableConceptOrFHIRDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionCodeableConceptOrFHIRDateTag());
    }
  }

  public static class ChoiceFHIRDateTimeOrPeriod extends Choice<$bslash$div<FHIRDateTime, Period>> {
    public ChoiceFHIRDateTimeOrPeriod(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrPeriodTag());
    }

    public ChoiceFHIRDateTimeOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrPeriodTag());
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

  public static class ChoiceFHIRDateOrPeriod extends Choice<$bslash$div<FHIRDate, Period>> {
    public ChoiceFHIRDateOrPeriod(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionFHIRDateOrPeriodTag());
    }

    public ChoiceFHIRDateOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionFHIRDateOrPeriodTag());
    }
  }

  public static class ChoiceElementDefinition_MinValue
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
    public ChoiceElementDefinition_MinValue(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    public ChoiceElementDefinition_MinValue(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    public ChoiceElementDefinition_MinValue(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    public ChoiceElementDefinition_MinValue(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    public ChoiceElementDefinition_MinValue(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    public ChoiceElementDefinition_MinValue(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    private ChoiceElementDefinition_MinValue(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionElementDefinition_MinValueTag());
    }

    public static ChoiceElementDefinition_MinValue ChoiceElementDefinition_MinValueInt(
        Integer arg) {
      return new ChoiceElementDefinition_MinValue("Integer", arg);
    }

    public static ChoiceElementDefinition_MinValue ChoiceElementDefinition_MinValuePositiveInt(
        Integer arg) {
      return new ChoiceElementDefinition_MinValue("PositiveInt", arg);
    }

    public static ChoiceElementDefinition_MinValue ChoiceElementDefinition_MinValueUnsignedInt(
        Integer arg) {
      return new ChoiceElementDefinition_MinValue("UnsignedInt", arg);
    }
  }

  public static class ChoiceDrugCharacteristic_Value
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<byte[], CodeableConcept>, Quantity>, String>> {
    public ChoiceDrugCharacteristic_Value(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.UnionDrugCharacteristic_ValueTag());
    }

    public ChoiceDrugCharacteristic_Value(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionDrugCharacteristic_ValueTag());
    }

    public ChoiceDrugCharacteristic_Value(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionDrugCharacteristic_ValueTag());
    }

    public ChoiceDrugCharacteristic_Value(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionDrugCharacteristic_ValueTag());
    }
  }

  public static class ChoiceFHIRDateTimeOrString extends Choice<$bslash$div<FHIRDateTime, String>> {
    public ChoiceFHIRDateTimeOrString(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrStringTag());
    }

    public ChoiceFHIRDateTimeOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionFHIRDateTimeOrStringTag());
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

  public static class ChoiceAnswer_Value
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
    public ChoiceAnswer_Value(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public ChoiceAnswer_Value(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    private ChoiceAnswer_Value(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionAnswer_ValueTag());
    }

    public static ChoiceAnswer_Value ChoiceAnswer_ValueString(String arg) {
      return new ChoiceAnswer_Value("String", arg);
    }

    public static ChoiceAnswer_Value ChoiceAnswer_ValueUriStr(String arg) {
      return new ChoiceAnswer_Value("Uri", arg);
    }
  }
}
