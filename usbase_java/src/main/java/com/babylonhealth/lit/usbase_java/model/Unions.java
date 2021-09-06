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
  public static class Choice00863392741
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
                  LocalTime>,
              ZonedDateTime>> {
    public Choice00863392741(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00863392741Tag());
    }

    public Choice00863392741(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00863392741Tag());
    }

    public Choice00863392741(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00863392741Tag());
    }

    public Choice00863392741(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00863392741Tag());
    }

    public Choice00863392741(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00863392741Tag());
    }

    public Choice00863392741(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union00863392741Tag());
    }
  }

  public static class Choice00999522603
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
    public Choice00999522603(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union00999522603Tag());
    }

    public Choice00999522603(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00999522603Tag());
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

  public static class Choice_1391615921
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
              LocalTime>> {
    public Choice_1391615921(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1391615921Tag());
    }

    public Choice_1391615921(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1391615921Tag());
    }

    public Choice_1391615921(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1391615921Tag());
    }

    public Choice_1391615921(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1391615921Tag());
    }

    public Choice_1391615921(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1391615921Tag());
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

  public static class ChoiceAgeOrBooleanOrDate
      extends Choice<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>> {
    public ChoiceAgeOrBooleanOrDate(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAgeOrBooleanOrDateTag());
    }

    public ChoiceAgeOrBooleanOrDate(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionAgeOrBooleanOrDateTag());
    }

    public ChoiceAgeOrBooleanOrDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionAgeOrBooleanOrDateTag());
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
}
