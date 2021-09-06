package com.babylonhealth.lit.core_java.model;

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
import com.babylonhealth.lit.core.UnionAliases;
import com.babylonhealth.lit.core_java.model.Unions.*;

public class Unions {
  public static class ChoiceBooleanOrCodeableConcept
      extends Choice<$bslash$div<Boolean, CodeableConcept>> {
    public ChoiceBooleanOrCodeableConcept(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrCodeableConceptTag());
    }

    public ChoiceBooleanOrCodeableConcept(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionBooleanOrCodeableConceptTag());
    }
  }

  public static class ChoiceQuantityOrRange extends Choice<$bslash$div<Quantity, Range>> {
    public ChoiceQuantityOrRange(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrRangeTag());
    }

    public ChoiceQuantityOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionQuantityOrRangeTag());
    }
  }

  public static class Choice00624997139
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<CodeableConcept, Quantity>, Range>, Reference>> {
    public Choice00624997139(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union00624997139Tag());
    }

    public Choice00624997139(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00624997139Tag());
    }

    public Choice00624997139(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00624997139Tag());
    }

    public Choice00624997139(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00624997139Tag());
    }
  }

  public static class Choice01769853217
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDate, FHIRDateTime>, Reference>, Timing>> {
    public Choice01769853217(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01769853217Tag());
    }

    public Choice01769853217(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01769853217Tag());
    }

    public Choice01769853217(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01769853217Tag());
    }

    public Choice01769853217(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01769853217Tag());
    }
  }

  public static class ChoiceCodeableConceptOrReference
      extends Choice<$bslash$div<CodeableConcept, Reference>> {
    public ChoiceCodeableConceptOrReference(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrReferenceTag());
    }

    public ChoiceCodeableConceptOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionCodeableConceptOrReferenceTag());
    }
  }

  public static class ChoiceDurationOrDateTimeOrPeriod
      extends Choice<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>> {
    public ChoiceDurationOrDateTimeOrPeriod(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrDateTimeOrPeriodTag());
    }

    public ChoiceDurationOrDateTimeOrPeriod(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDurationOrDateTimeOrPeriodTag());
    }

    public ChoiceDurationOrDateTimeOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDurationOrDateTimeOrPeriodTag());
    }
  }

  public static class ChoiceQuantityOrRangeOrRatio
      extends Choice<$bslash$div<$bslash$div<Quantity, Range>, Ratio>> {
    public ChoiceQuantityOrRangeOrRatio(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrRangeOrRatioTag());
    }

    public ChoiceQuantityOrRangeOrRatio(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionQuantityOrRangeOrRatioTag());
    }

    public ChoiceQuantityOrRangeOrRatio(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionQuantityOrRangeOrRatioTag());
    }
  }

  public static class ChoiceDurationOrPeriodOrRange
      extends Choice<$bslash$div<$bslash$div<Duration, Period>, Range>> {
    public ChoiceDurationOrPeriodOrRange(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrPeriodOrRangeTag());
    }

    public ChoiceDurationOrPeriodOrRange(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDurationOrPeriodOrRangeTag());
    }

    public ChoiceDurationOrPeriodOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionDurationOrPeriodOrRangeTag());
    }
  }

  public static class ChoiceAll
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
                                                                                                                                                                          $bslash$div<
                                                                                                                                                                              $bslash$div<
                                                                                                                                                                                  $bslash$div<
                                                                                                                                                                                      $bslash$div<
                                                                                                                                                                                          $bslash$div<
                                                                                                                                                                                              $bslash$div<
                                                                                                                                                                                                  $bslash$div<
                                                                                                                                                                                                      $bslash$div<
                                                                                                                                                                                                          $bslash$div<
                                                                                                                                                                                                              Address,
                                                                                                                                                                                                              Age>,
                                                                                                                                                                                                          Annotation>,
                                                                                                                                                                                                      Attachment>,
                                                                                                                                                                                                  byte
                                                                                                                                                                                                      []>,
                                                                                                                                                                                              BigDecimal>,
                                                                                                                                                                                          Boolean>,
                                                                                                                                                                                      String>,
                                                                                                                                                                                  String>,
                                                                                                                                                                              CodeableConcept>,
                                                                                                                                                                          Coding>,
                                                                                                                                                                      ContactDetail>,
                                                                                                                                                                  ContactPoint>,
                                                                                                                                                              Contributor>,
                                                                                                                                                          Count>,
                                                                                                                                                      DataRequirement>,
                                                                                                                                                  Distance>,
                                                                                                                                              Dosage>,
                                                                                                                                          Duration>,
                                                                                                                                      Expression>,
                                                                                                                                  FHIRDate>,
                                                                                                                              FHIRDateTime>,
                                                                                                                          HumanName>,
                                                                                                                      String>,
                                                                                                                  Identifier>,
                                                                                                              Integer>,
                                                                                                          LocalTime>,
                                                                                                      String>,
                                                                                                  Meta>,
                                                                                              Money>,
                                                                                          String>,
                                                                                      ParameterDefinition>,
                                                                                  Period>,
                                                                              Integer>,
                                                                          Quantity>,
                                                                      Range>,
                                                                  Ratio>,
                                                              Reference>,
                                                          RelatedArtifact>,
                                                      SampledData>,
                                                  Signature>,
                                              String>,
                                          Timing>,
                                      TriggerDefinition>,
                                  UUID>,
                              Integer>,
                          String>,
                      String>,
                  UsageContext>,
              ZonedDateTime>> {
    public ChoiceAll(Address arg) {
      super("Address", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Annotation arg) {
      super("Annotation", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(ContactDetail arg) {
      super("ContactDetail", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(ContactPoint arg) {
      super("ContactPoint", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Contributor arg) {
      super("Contributor", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Count arg) {
      super("Count", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Distance arg) {
      super("Distance", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Dosage arg) {
      super("Dosage", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(HumanName arg) {
      super("HumanName", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Identifier arg) {
      super("Identifier", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Meta arg) {
      super("Meta", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(ParameterDefinition arg) {
      super("ParameterDefinition", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(RelatedArtifact arg) {
      super("RelatedArtifact", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Signature arg) {
      super("Signature", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(UUID arg) {
      super("Uuid", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(UsageContext arg) {
      super("UsageContext", arg, (LTag) UnionAliases.UnionAllTag());
    }

    public ChoiceAll(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.UnionAllTag());
    }

    private ChoiceAll(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionAllTag());
    }

    private ChoiceAll(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionAllTag());
    }

    public static ChoiceAll ChoiceAllCanonical(String arg) {
      return new ChoiceAll("Canonical", arg);
    }

    public static ChoiceAll ChoiceAllCode(String arg) {
      return new ChoiceAll("Code", arg);
    }

    public static ChoiceAll ChoiceAllId(String arg) {
      return new ChoiceAll("Id", arg);
    }

    public static ChoiceAll ChoiceAllInt(Integer arg) {
      return new ChoiceAll("Integer", arg);
    }

    public static ChoiceAll ChoiceAllMarkdown(String arg) {
      return new ChoiceAll("Markdown", arg);
    }

    public static ChoiceAll ChoiceAllOID(String arg) {
      return new ChoiceAll("Oid", arg);
    }

    public static ChoiceAll ChoiceAllPositiveInt(Integer arg) {
      return new ChoiceAll("PositiveInt", arg);
    }

    public static ChoiceAll ChoiceAllString(String arg) {
      return new ChoiceAll("String", arg);
    }

    public static ChoiceAll ChoiceAllUnsignedInt(Integer arg) {
      return new ChoiceAll("UnsignedInt", arg);
    }

    public static ChoiceAll ChoiceAllUriStr(String arg) {
      return new ChoiceAll("Uri", arg);
    }

    public static ChoiceAll ChoiceAllUrlStr(String arg) {
      return new ChoiceAll("Url", arg);
    }
  }

  public static class ChoiceReferenceOrString extends Choice<$bslash$div<Reference, String>> {
    public ChoiceReferenceOrString(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionReferenceOrStringTag());
    }

    public ChoiceReferenceOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionReferenceOrStringTag());
    }
  }
}
