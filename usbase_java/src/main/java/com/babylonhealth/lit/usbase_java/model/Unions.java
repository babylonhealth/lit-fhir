package com.babylonhealth.lit.usbase_java.model;

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
import com.babylonhealth.lit.usbase.UnionAliases;
import com.babylonhealth.lit.usbase_java.model.Unions.*;

public class Unions {
  public static class ChoiceAgeOrBooleanOrFHIRDate
      extends Choice<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>> {
    public ChoiceAgeOrBooleanOrFHIRDate(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAgeOrBooleanOrFHIRDateTag());
    }

    public ChoiceAgeOrBooleanOrFHIRDate(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionAgeOrBooleanOrFHIRDateTag());
    }

    public ChoiceAgeOrBooleanOrFHIRDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionAgeOrBooleanOrFHIRDateTag());
    }
  }

  public static class ChoiceMinValue_Value
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
              LocalTime>> {
    public ChoiceMinValue_Value(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionMinValue_ValueTag());
    }

    public ChoiceMinValue_Value(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionMinValue_ValueTag());
    }

    public ChoiceMinValue_Value(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionMinValue_ValueTag());
    }

    public ChoiceMinValue_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionMinValue_ValueTag());
    }

    public ChoiceMinValue_Value(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionMinValue_ValueTag());
    }
  }

  public static class ChoiceCodeableConceptOrRange
      extends Choice<$bslash$div<CodeableConcept, Range>> {
    public ChoiceCodeableConceptOrRange(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrRangeTag());
    }

    public ChoiceCodeableConceptOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionCodeableConceptOrRangeTag());
    }
  }

  public static class ChoiceDevicemetricobservation_Value
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<CodeableConcept, FHIRDateTime>, LocalTime>,
                                  Period>,
                              Quantity>,
                          Range>,
                      Ratio>,
                  SampledData>,
              String>> {
    public ChoiceDevicemetricobservation_Value(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }

    public ChoiceDevicemetricobservation_Value(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionDevicemetricobservation_ValueTag());
    }
  }

  public static class ChoiceDurationOrPeriod extends Choice<$bslash$div<Duration, Period>> {
    public ChoiceDurationOrPeriod(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrPeriodTag());
    }

    public ChoiceDurationOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDurationOrPeriodTag());
    }
  }

  public static class ChoiceMaxValue_Value
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
                  LocalTime>,
              ZonedDateTime>> {
    public ChoiceMaxValue_Value(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionMaxValue_ValueTag());
    }

    public ChoiceMaxValue_Value(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionMaxValue_ValueTag());
    }

    public ChoiceMaxValue_Value(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionMaxValue_ValueTag());
    }

    public ChoiceMaxValue_Value(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionMaxValue_ValueTag());
    }

    public ChoiceMaxValue_Value(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionMaxValue_ValueTag());
    }

    public ChoiceMaxValue_Value(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.UnionMaxValue_ValueTag());
    }
  }

  public static class ChoiceCanonicalOrCodeableConcept
      extends Choice<$bslash$div<String, CodeableConcept>> {
    public ChoiceCanonicalOrCodeableConcept(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptTag());
    }

    public ChoiceCanonicalOrCodeableConcept(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptTag());
    }
  }
}
