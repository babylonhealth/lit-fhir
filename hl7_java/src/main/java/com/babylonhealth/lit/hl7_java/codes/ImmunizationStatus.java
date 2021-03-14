package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.IMMUNIZATION_STATUS;

public interface ImmunizationStatus {
  public static final IMMUNIZATION_STATUS COMPLETED = IMMUNIZATION_STATUS.COMPLETED$.MODULE$;
  public static final IMMUNIZATION_STATUS ENTERED_IN_ERROR =
      IMMUNIZATION_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final IMMUNIZATION_STATUS NOT_DONE = IMMUNIZATION_STATUS.NOT_DONE$.MODULE$;
}
