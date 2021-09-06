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
  public static class Choice_1349125893
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
    public Choice_1349125893(Address arg) {
      super("Address", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Annotation arg) {
      super("Annotation", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(ContactDetail arg) {
      super("ContactDetail", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(ContactPoint arg) {
      super("ContactPoint", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Contributor arg) {
      super("Contributor", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Count arg) {
      super("Count", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Distance arg) {
      super("Distance", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Dosage arg) {
      super("Dosage", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(HumanName arg) {
      super("HumanName", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Identifier arg) {
      super("Identifier", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Meta arg) {
      super("Meta", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Money arg) {
      super("Money", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(ParameterDefinition arg) {
      super("ParameterDefinition", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(RelatedArtifact arg) {
      super("RelatedArtifact", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Signature arg) {
      super("Signature", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(UUID arg) {
      super("Uuid", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(UsageContext arg) {
      super("UsageContext", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public Choice_1349125893(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    private Choice_1349125893(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    private Choice_1349125893(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_1349125893Tag());
    }

    public static Choice_1349125893 Choice_1349125893Canonical(String arg) {
      return new Choice_1349125893("Canonical", arg);
    }

    public static Choice_1349125893 Choice_1349125893Code(String arg) {
      return new Choice_1349125893("Code", arg);
    }

    public static Choice_1349125893 Choice_1349125893Id(String arg) {
      return new Choice_1349125893("Id", arg);
    }

    public static Choice_1349125893 Choice_1349125893Int(Integer arg) {
      return new Choice_1349125893("Integer", arg);
    }

    public static Choice_1349125893 Choice_1349125893Markdown(String arg) {
      return new Choice_1349125893("Markdown", arg);
    }

    public static Choice_1349125893 Choice_1349125893OID(String arg) {
      return new Choice_1349125893("Oid", arg);
    }

    public static Choice_1349125893 Choice_1349125893PositiveInt(Integer arg) {
      return new Choice_1349125893("PositiveInt", arg);
    }

    public static Choice_1349125893 Choice_1349125893String(String arg) {
      return new Choice_1349125893("String", arg);
    }

    public static Choice_1349125893 Choice_1349125893UnsignedInt(Integer arg) {
      return new Choice_1349125893("UnsignedInt", arg);
    }

    public static Choice_1349125893 Choice_1349125893UriStr(String arg) {
      return new Choice_1349125893("Uri", arg);
    }

    public static Choice_1349125893 Choice_1349125893UrlStr(String arg) {
      return new Choice_1349125893("Url", arg);
    }
  }

  public static class Choice_0119127717
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<CodeableConcept, Quantity>, Range>, Reference>> {
    public Choice_0119127717(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0119127717Tag());
    }

    public Choice_0119127717(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0119127717Tag());
    }

    public Choice_0119127717(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0119127717Tag());
    }

    public Choice_0119127717(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0119127717Tag());
    }
  }

  public static class Choice_1128709984 extends Choice<$bslash$div<Reference, String>> {
    public Choice_1128709984(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1128709984Tag());
    }

    public Choice_1128709984(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1128709984Tag());
    }
  }

  public static class Choice01025009075 extends Choice<$bslash$div<CodeableConcept, Reference>> {
    public Choice01025009075(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01025009075Tag());
    }

    public Choice01025009075(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01025009075Tag());
    }
  }

  public static class Choice01639511888 extends Choice<$bslash$div<Quantity, Range>> {
    public Choice01639511888(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01639511888Tag());
    }

    public Choice01639511888(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01639511888Tag());
    }
  }

  public static class Choice_0575082635
      extends Choice<$bslash$div<$bslash$div<Quantity, Range>, Ratio>> {
    public Choice_0575082635(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0575082635Tag());
    }

    public Choice_0575082635(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0575082635Tag());
    }

    public Choice_0575082635(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_0575082635Tag());
    }
  }

  public static class Choice_1051729086
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDate, FHIRDateTime>, Reference>, Timing>> {
    public Choice_1051729086(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1051729086Tag());
    }

    public Choice_1051729086(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1051729086Tag());
    }

    public Choice_1051729086(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1051729086Tag());
    }

    public Choice_1051729086(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union_1051729086Tag());
    }
  }

  public static class Choice_0731860109
      extends Choice<$bslash$div<$bslash$div<Duration, Period>, Range>> {
    public Choice_0731860109(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union_0731860109Tag());
    }

    public Choice_0731860109(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0731860109Tag());
    }

    public Choice_0731860109(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0731860109Tag());
    }
  }

  public static class Choice_1768247138 extends Choice<$bslash$div<Boolean, CodeableConcept>> {
    public Choice_1768247138(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1768247138Tag());
    }

    public Choice_1768247138(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1768247138Tag());
    }
  }

  public static class Choice_1947777294
      extends Choice<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>> {
    public Choice_1947777294(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union_1947777294Tag());
    }

    public Choice_1947777294(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1947777294Tag());
    }

    public Choice_1947777294(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_1947777294Tag());
    }
  }
}
