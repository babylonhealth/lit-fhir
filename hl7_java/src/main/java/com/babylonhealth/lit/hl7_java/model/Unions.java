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
  public static class Choice_0839638734 extends Choice<$bslash$div<Integer, String>> {
    public Choice_0839638734(Integer arg) {
      super("PositiveInt", arg, (LTag) UnionAliases.Union_0839638734Tag());
    }

    public Choice_0839638734(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0839638734Tag());
    }
  }

  public static class Choice_1489367071
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Coding>,
                      FHIRDateTime>,
                  Integer>,
              String>> {
    public Choice_1489367071(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1489367071Tag());
    }

    public Choice_1489367071(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1489367071Tag());
    }

    public Choice_1489367071(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_1489367071Tag());
    }

    public Choice_1489367071(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1489367071Tag());
    }

    public Choice_1489367071(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1489367071Tag());
    }

    private Choice_1489367071(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_1489367071Tag());
    }

    public static Choice_1489367071 Choice_1489367071Code(String arg) {
      return new Choice_1489367071("Code", arg);
    }

    public static Choice_1489367071 Choice_1489367071String(String arg) {
      return new Choice_1489367071("String", arg);
    }
  }

  public static class Choice00483057553 extends Choice<$bslash$div<byte[], String>> {
    public Choice00483057553(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.Union00483057553Tag());
    }

    public Choice00483057553(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00483057553Tag());
    }
  }

  public static class Choice_0221283134 extends Choice<$bslash$div<Money, Quantity>> {
    public Choice_0221283134(Money arg) {
      super("Money", arg, (LTag) UnionAliases.Union_0221283134Tag());
    }

    public Choice_0221283134(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0221283134Tag());
    }
  }

  public static class Choice01056080496
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<Boolean, CodeableConcept>, Integer>, Quantity>,
                      Range>,
                  Ratio>,
              String>> {
    public Choice01056080496(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01056080496Tag());
    }

    public Choice01056080496(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01056080496Tag());
    }

    public Choice01056080496(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01056080496Tag());
    }

    public Choice01056080496(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01056080496Tag());
    }

    public Choice01056080496(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01056080496Tag());
    }

    public Choice01056080496(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union01056080496Tag());
    }

    public Choice01056080496(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01056080496Tag());
    }
  }

  public static class Choice01200936722 extends Choice<$bslash$div<Period, Range>> {
    public Choice01200936722(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01200936722Tag());
    }

    public Choice01200936722(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01200936722Tag());
    }
  }

  public static class Choice_0181779868
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, Duration>, FHIRDateTime>, Period>,
                  Range>,
              Timing>> {
    public Choice_0181779868(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_0181779868Tag());
    }

    public Choice_0181779868(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union_0181779868Tag());
    }

    public Choice_0181779868(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0181779868Tag());
    }

    public Choice_0181779868(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0181779868Tag());
    }

    public Choice_0181779868(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0181779868Tag());
    }

    public Choice_0181779868(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union_0181779868Tag());
    }
  }

  public static class Choice_1524702593 extends Choice<$bslash$div<Boolean, Reference>> {
    public Choice_1524702593(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1524702593Tag());
    }

    public Choice_1524702593(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1524702593Tag());
    }
  }

  public static class Choice_0964108894 extends Choice<$bslash$div<Quantity, Ratio>> {
    public Choice_0964108894(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0964108894Tag());
    }

    public Choice_0964108894(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_0964108894Tag());
    }
  }

  public static class Choice01646729908
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>,
              Reference>> {
    public Choice01646729908(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01646729908Tag());
    }

    public Choice01646729908(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01646729908Tag());
    }

    public Choice01646729908(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01646729908Tag());
    }

    public Choice01646729908(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01646729908Tag());
    }

    public Choice01646729908(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01646729908Tag());
    }
  }

  public static class Choice02065782851 extends Choice<$bslash$div<Boolean, Integer>> {
    public Choice02065782851(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union02065782851Tag());
    }

    public Choice02065782851(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union02065782851Tag());
    }
  }

  public static class Choice_0970951552 extends Choice<$bslash$div<CodeableConcept, Quantity>> {
    public Choice_0970951552(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0970951552Tag());
    }

    public Choice_0970951552(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0970951552Tag());
    }
  }

  public static class Choice_0802685816
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
    public Choice_0802685816(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }

    public Choice_0802685816(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0802685816Tag());
    }
  }

  public static class Choice_0040864668
      extends Choice<$bslash$div<$bslash$div<Money, String>, Integer>> {
    public Choice_0040864668(Money arg) {
      super("Money", arg, (LTag) UnionAliases.Union_0040864668Tag());
    }

    public Choice_0040864668(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0040864668Tag());
    }

    public Choice_0040864668(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.Union_0040864668Tag());
    }
  }

  public static class Choice00607514014
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>> {
    public Choice00607514014(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union00607514014Tag());
    }

    public Choice00607514014(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00607514014Tag());
    }

    public Choice00607514014(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00607514014Tag());
    }

    public Choice00607514014(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union00607514014Tag());
    }
  }

  public static class Choice00078348305 extends Choice<$bslash$div<CodeableConcept, FHIRDate>> {
    public Choice00078348305(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union00078348305Tag());
    }

    public Choice00078348305(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00078348305Tag());
    }
  }

  public static class Choice00910671146
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Quantity, Range>, Ratio>, String>> {
    public Choice00910671146(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00910671146Tag());
    }

    public Choice00910671146(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00910671146Tag());
    }

    public Choice00910671146(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union00910671146Tag());
    }

    public Choice00910671146(String arg) {
      super("String", arg, (LTag) UnionAliases.Union00910671146Tag());
    }
  }

  public static class Choice_0966801288
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>, Range>, String>> {
    public Choice_0966801288(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_0966801288Tag());
    }

    public Choice_0966801288(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0966801288Tag());
    }

    public Choice_0966801288(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_0966801288Tag());
    }

    public Choice_0966801288(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0966801288Tag());
    }

    public Choice_0966801288(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0966801288Tag());
    }
  }

  public static class Choice01352864625
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>> {
    public Choice01352864625(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01352864625Tag());
    }

    public Choice01352864625(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01352864625Tag());
    }

    public Choice01352864625(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01352864625Tag());
    }

    public Choice01352864625(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01352864625Tag());
    }

    public Choice01352864625(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01352864625Tag());
    }
  }

  public static class Choice_0934386166 extends Choice<$bslash$div<FHIRDateTime, Period>> {
    public Choice_0934386166(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0934386166Tag());
    }

    public Choice_0934386166(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0934386166Tag());
    }
  }

  public static class Choice_1516277229
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>> {
    public Choice_1516277229(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1516277229Tag());
    }

    public Choice_1516277229(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1516277229Tag());
    }

    public Choice_1516277229(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1516277229Tag());
    }

    public Choice_1516277229(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1516277229Tag());
    }
  }

  public static class Choice_1750183386
      extends Choice<$bslash$div<$bslash$div<Attachment, Reference>, String>> {
    public Choice_1750183386(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_1750183386Tag());
    }

    public Choice_1750183386(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1750183386Tag());
    }

    public Choice_1750183386(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1750183386Tag());
    }
  }

  public static class Choice_1507098327
      extends Choice<$bslash$div<$bslash$div<Age, Range>, String>> {
    public Choice_1507098327(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_1507098327Tag());
    }

    public Choice_1507098327(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1507098327Tag());
    }

    public Choice_1507098327(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1507098327Tag());
    }
  }

  public static class Choice_2072987899 extends Choice<$bslash$div<Quantity, String>> {
    public Choice_2072987899(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_2072987899Tag());
    }

    public Choice_2072987899(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_2072987899Tag());
    }
  }

  public static class Choice_0831630297 extends Choice<$bslash$div<BigDecimal, Range>> {
    public Choice_0831630297(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0831630297Tag());
    }

    public Choice_0831630297(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0831630297Tag());
    }
  }

  public static class Choice_0687680458
      extends Choice<$bslash$div<$bslash$div<String, CodeableConcept>, String>> {
    public Choice_0687680458(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0687680458Tag());
    }

    private Choice_0687680458(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_0687680458Tag());
    }

    public static Choice_0687680458 Choice_0687680458Canonical(String arg) {
      return new Choice_0687680458("Canonical", arg);
    }

    public static Choice_0687680458 Choice_0687680458UriStr(String arg) {
      return new Choice_0687680458("Uri", arg);
    }
  }

  public static class Choice_0543144563
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Attachment, Boolean>, Quantity>, Reference>,
              String>> {
    public Choice_0543144563(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_0543144563Tag());
    }

    public Choice_0543144563(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0543144563Tag());
    }

    public Choice_0543144563(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0543144563Tag());
    }

    public Choice_0543144563(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0543144563Tag());
    }

    public Choice_0543144563(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0543144563Tag());
    }
  }

  public static class Choice_1132894602
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Coding, FHIRDate>, Integer>, LocalTime>,
                  Reference>,
              String>> {
    public Choice_1132894602(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_1132894602Tag());
    }

    public Choice_1132894602(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1132894602Tag());
    }

    public Choice_1132894602(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1132894602Tag());
    }

    public Choice_1132894602(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1132894602Tag());
    }

    public Choice_1132894602(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1132894602Tag());
    }

    public Choice_1132894602(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1132894602Tag());
    }
  }

  public static class Choice_1750128470
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>, Expression>> {
    public Choice_1750128470(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union_1750128470Tag());
    }

    public Choice_1750128470(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1750128470Tag());
    }

    public Choice_1750128470(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union_1750128470Tag());
    }

    public Choice_1750128470(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union_1750128470Tag());
    }
  }

  public static class Choice01560785079
      extends Choice<$bslash$div<$bslash$div<CodeableConcept, Quantity>, Range>> {
    public Choice01560785079(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01560785079Tag());
    }

    public Choice01560785079(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01560785079Tag());
    }

    public Choice01560785079(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01560785079Tag());
    }
  }

  public static class Choice01831019594 extends Choice<$bslash$div<Reference, String>> {
    public Choice01831019594(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union01831019594Tag());
    }

    public Choice01831019594(String arg) {
      super("Url", arg, (LTag) UnionAliases.Union01831019594Tag());
    }
  }

  public static class Choice00434638053 extends Choice<$bslash$div<Address, Reference>> {
    public Choice00434638053(Address arg) {
      super("Address", arg, (LTag) UnionAliases.Union00434638053Tag());
    }

    public Choice00434638053(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00434638053Tag());
    }
  }

  public static class Choice_1309404550
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<byte[], CodeableConcept>, Quantity>, String>> {
    public Choice_1309404550(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.Union_1309404550Tag());
    }

    public Choice_1309404550(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1309404550Tag());
    }

    public Choice_1309404550(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1309404550Tag());
    }

    public Choice_1309404550(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1309404550Tag());
    }
  }

  public static class Choice00609373412
      extends Choice<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>> {
    public Choice00609373412(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00609373412Tag());
    }

    public Choice00609373412(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00609373412Tag());
    }

    public Choice00609373412(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union00609373412Tag());
    }
  }

  public static class Choice00600764285
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Integer>,
              String>> {
    public Choice00600764285(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00600764285Tag());
    }

    public Choice00600764285(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00600764285Tag());
    }

    public Choice00600764285(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00600764285Tag());
    }

    private Choice00600764285(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union00600764285Tag());
    }

    public static Choice00600764285 Choice00600764285Id(String arg) {
      return new Choice00600764285("Id", arg);
    }

    public static Choice00600764285 Choice00600764285String(String arg) {
      return new Choice00600764285("String", arg);
    }
  }

  public static class Choice01486281057
      extends Choice<$bslash$div<$bslash$div<FHIRDate, Period>, String>> {
    public Choice01486281057(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01486281057Tag());
    }

    public Choice01486281057(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01486281057Tag());
    }

    public Choice01486281057(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01486281057Tag());
    }
  }

  public static class Choice_0637176084
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
    public Choice_0637176084(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    public Choice_0637176084(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    public Choice_0637176084(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    public Choice_0637176084(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    public Choice_0637176084(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    public Choice_0637176084(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    private Choice_0637176084(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_0637176084Tag());
    }

    public static Choice_0637176084 Choice_0637176084Int(Integer arg) {
      return new Choice_0637176084("Integer", arg);
    }

    public static Choice_0637176084 Choice_0637176084PositiveInt(Integer arg) {
      return new Choice_0637176084("PositiveInt", arg);
    }

    public static Choice_0637176084 Choice_0637176084UnsignedInt(Integer arg) {
      return new Choice_0637176084("UnsignedInt", arg);
    }
  }

  public static class Choice_2131715935 extends Choice<$bslash$div<Boolean, FHIRDateTime>> {
    public Choice_2131715935(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_2131715935Tag());
    }

    public Choice_2131715935(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_2131715935Tag());
    }
  }

  public static class Choice01726112534
      extends Choice<$bslash$div<$bslash$div<Period, String>, Timing>> {
    public Choice01726112534(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01726112534Tag());
    }

    public Choice01726112534(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01726112534Tag());
    }

    public Choice01726112534(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01726112534Tag());
    }
  }

  public static class Choice_1289000811 extends Choice<$bslash$div<Money, Integer>> {
    public Choice_1289000811(Money arg) {
      super("Money", arg, (LTag) UnionAliases.Union_1289000811Tag());
    }

    public Choice_1289000811(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.Union_1289000811Tag());
    }
  }

  public static class Choice01473702374
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>, ZonedDateTime>> {
    public Choice01473702374(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01473702374Tag());
    }

    public Choice01473702374(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01473702374Tag());
    }

    public Choice01473702374(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01473702374Tag());
    }

    public Choice01473702374(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union01473702374Tag());
    }
  }

  public static class Choice_1427970408
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<BigDecimal, Boolean>, String>, FHIRDateTime>,
                      Integer>,
                  String>,
              String>> {
    public Choice_1427970408(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1427970408Tag());
    }

    public Choice_1427970408(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1427970408Tag());
    }

    public Choice_1427970408(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1427970408Tag());
    }

    public Choice_1427970408(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1427970408Tag());
    }

    private Choice_1427970408(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_1427970408Tag());
    }

    public static Choice_1427970408 Choice_1427970408Code(String arg) {
      return new Choice_1427970408("Code", arg);
    }

    public static Choice_1427970408 Choice_1427970408String(String arg) {
      return new Choice_1427970408("String", arg);
    }

    public static Choice_1427970408 Choice_1427970408UriStr(String arg) {
      return new Choice_1427970408("Uri", arg);
    }
  }

  public static class Choice01727798874
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Age, Period>, Range>, String>> {
    public Choice01727798874(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01727798874Tag());
    }

    public Choice01727798874(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01727798874Tag());
    }

    public Choice01727798874(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01727798874Tag());
    }

    public Choice01727798874(String arg) {
      super("String", arg, (LTag) UnionAliases.Union01727798874Tag());
    }
  }

  public static class Choice01219602913 extends Choice<$bslash$div<Duration, FHIRDate>> {
    public Choice01219602913(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union01219602913Tag());
    }

    public Choice01219602913(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01219602913Tag());
    }
  }

  public static class Choice_0388264667
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
    public Choice_0388264667(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }

    public Choice_0388264667(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_0388264667Tag());
    }
  }

  public static class Choice01583485927 extends Choice<$bslash$div<Coding, String>> {
    public Choice01583485927(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union01583485927Tag());
    }

    public Choice01583485927(String arg) {
      super("Uri", arg, (LTag) UnionAliases.Union01583485927Tag());
    }
  }

  public static class Choice00801828838 extends Choice<$bslash$div<Duration, Range>> {
    public Choice00801828838(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union00801828838Tag());
    }

    public Choice00801828838(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00801828838Tag());
    }
  }

  public static class Choice_2101127777
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
    public Choice_2101127777(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public Choice_2101127777(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    private Choice_2101127777(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_2101127777Tag());
    }

    public static Choice_2101127777 Choice_2101127777String(String arg) {
      return new Choice_2101127777("String", arg);
    }

    public static Choice_2101127777 Choice_2101127777UriStr(String arg) {
      return new Choice_2101127777("Uri", arg);
    }
  }

  public static class Choice_0503196159 extends Choice<$bslash$div<FHIRDate, Period>> {
    public Choice_0503196159(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_0503196159Tag());
    }

    public Choice_0503196159(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0503196159Tag());
    }
  }

  public static class Choice_1527751898
      extends Choice<$bslash$div<$bslash$div<Quantity, Range>, String>> {
    public Choice_1527751898(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1527751898Tag());
    }

    public Choice_1527751898(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1527751898Tag());
    }

    public Choice_1527751898(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1527751898Tag());
    }
  }

  public static class Choice01243416269 extends Choice<$bslash$div<CodeableConcept, Duration>> {
    public Choice01243416269(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01243416269Tag());
    }

    public Choice01243416269(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union01243416269Tag());
    }
  }

  public static class Choice_0358050020
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>,
                      Expression>,
                  Reference>,
              TriggerDefinition>> {
    public Choice_0358050020(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union_0358050020Tag());
    }

    public Choice_0358050020(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0358050020Tag());
    }

    public Choice_0358050020(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union_0358050020Tag());
    }

    public Choice_0358050020(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union_0358050020Tag());
    }

    public Choice_0358050020(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0358050020Tag());
    }

    public Choice_0358050020(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.Union_0358050020Tag());
    }
  }

  public static class Choice_0983418289 extends Choice<$bslash$div<Identifier, Reference>> {
    public Choice_0983418289(Identifier arg) {
      super("Identifier", arg, (LTag) UnionAliases.Union_0983418289Tag());
    }

    public Choice_0983418289(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0983418289Tag());
    }
  }

  public static class Choice_1715923163 extends Choice<$bslash$div<FHIRDateTime, String>> {
    public Choice_1715923163(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1715923163Tag());
    }

    public Choice_1715923163(String arg) {
      super("String", arg, (LTag) UnionAliases.Union_1715923163Tag());
    }
  }

  public static class Choice00545979821 extends Choice<$bslash$div<String, String>> {

    private Choice00545979821(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union00545979821Tag());
    }

    public static Choice00545979821 Choice00545979821Canonical(String arg) {
      return new Choice00545979821("Canonical", arg);
    }

    public static Choice00545979821 Choice00545979821UriStr(String arg) {
      return new Choice00545979821("Uri", arg);
    }
  }

  public static class Choice_0316522316
      extends Choice<$bslash$div<$bslash$div<Address, CodeableConcept>, Reference>> {
    public Choice_0316522316(Address arg) {
      super("Address", arg, (LTag) UnionAliases.Union_0316522316Tag());
    }

    public Choice_0316522316(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0316522316Tag());
    }

    public Choice_0316522316(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0316522316Tag());
    }
  }

  public static class Choice00683246261 extends Choice<$bslash$div<Boolean, String>> {
    public Choice00683246261(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00683246261Tag());
    }

    public Choice00683246261(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union00683246261Tag());
    }
  }

  public static class Choice_0340660840 extends Choice<$bslash$div<Attachment, Reference>> {
    public Choice_0340660840(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_0340660840Tag());
    }

    public Choice_0340660840(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_0340660840Tag());
    }
  }
}
