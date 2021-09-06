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
  public static class Choice_1946587936 extends Choice<$bslash$div<CodeableConcept, Range>> {
    public Choice_1946587936(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1946587936Tag());
    }

    public Choice_1946587936(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1946587936Tag());
    }
  }

  public static class Choice01613806391
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
              LocalTime>> {
    public Choice01613806391(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01613806391Tag());
    }

    public Choice01613806391(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01613806391Tag());
    }

    public Choice01613806391(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01613806391Tag());
    }

    public Choice01613806391(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01613806391Tag());
    }

    public Choice01613806391(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01613806391Tag());
    }
  }

  public static class Choice00315627715
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>, Integer>,
                  LocalTime>,
              ZonedDateTime>> {
    public Choice00315627715(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00315627715Tag());
    }

    public Choice00315627715(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00315627715Tag());
    }

    public Choice00315627715(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00315627715Tag());
    }

    public Choice00315627715(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00315627715Tag());
    }

    public Choice00315627715(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00315627715Tag());
    }

    public Choice00315627715(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union00315627715Tag());
    }
  }

  public static class Choice01054268719 extends Choice<$bslash$div<String, CodeableConcept>> {
    public Choice01054268719(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union01054268719Tag());
    }

    public Choice01054268719(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01054268719Tag());
    }
  }

  public static class Choice00813350082
      extends Choice<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>> {
    public Choice00813350082(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union00813350082Tag());
    }

    public Choice00813350082(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00813350082Tag());
    }

    public Choice00813350082(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00813350082Tag());
    }
  }

  public static class Choice_1915626029
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
    public Choice_1915626029(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }

    public Choice_1915626029(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1915626029Tag());
    }
  }

  public static class Choice00284192631 extends Choice<$bslash$div<Duration, Period>> {
    public Choice00284192631(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union00284192631Tag());
    }

    public Choice00284192631(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00284192631Tag());
    }
  }
}
