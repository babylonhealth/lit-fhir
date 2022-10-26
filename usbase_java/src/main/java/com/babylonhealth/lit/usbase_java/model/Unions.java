package com.babylonhealth.lit.usbase_java.model;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core.*;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.usbase.UnionAliases;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import izumi.reflect.macrortti.LTag;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import scala.math.BigDecimal;

public class Unions {
  public static class ChoiceDurationOrPeriod extends Choice<$bslash$div<Duration, Period>> {
    public ChoiceDurationOrPeriod(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrPeriodTag());
    }

    public ChoiceDurationOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDurationOrPeriodTag());
    }
  }

  public static class Choice00916299533
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
                  LocalTime>,
              ZonedDateTime>> {
    public Choice00916299533(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00916299533Tag());
    }

    public Choice00916299533(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00916299533Tag());
    }

    public Choice00916299533(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00916299533Tag());
    }

    public Choice00916299533(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00916299533Tag());
    }

    public Choice00916299533(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00916299533Tag());
    }

    public Choice00916299533(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union00916299533Tag());
    }
  }

  public static class Choice01845407622
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
              LocalTime>> {
    public Choice01845407622(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01845407622Tag());
    }

    public Choice01845407622(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01845407622Tag());
    }

    public Choice01845407622(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01845407622Tag());
    }

    public Choice01845407622(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01845407622Tag());
    }

    public Choice01845407622(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01845407622Tag());
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

  public static class ChoiceCodeableConceptOrRange
      extends Choice<$bslash$div<CodeableConcept, Range>> {
    public ChoiceCodeableConceptOrRange(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrRangeTag());
    }

    public ChoiceCodeableConceptOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionCodeableConceptOrRangeTag());
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

  public static class Choice_0110816169
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
    public Choice_0110816169(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }

    public Choice_0110816169(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0110816169Tag());
    }
  }
}
