package com.babylonhealth.lit.hl7_java.model;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.model.Period;
import com.babylonhealth.lit.hl7.UnionAliases;

public class Unions {
  public static class Choice_0934386166 extends Choice<$bslash$div<FHIRDateTime, Period>> {
    public Choice_0934386166(FHIRDateTime fhirDateTime) {
      super("DateTime", fhirDateTime, UnionAliases.Union_0934386166Tag());
    }

    public Choice_0934386166(Period period) {
      super("Period", period, UnionAliases.Union_0934386166Tag());
    }
  }
}
