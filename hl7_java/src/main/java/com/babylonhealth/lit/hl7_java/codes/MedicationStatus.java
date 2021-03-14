package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.MEDICATION_STATUS;

public interface MedicationStatus {
  public static final MEDICATION_STATUS ACTIVE = MEDICATION_STATUS.ACTIVE$.MODULE$;
  public static final MEDICATION_STATUS ENTERED_IN_ERROR =
      MEDICATION_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final MEDICATION_STATUS INACTIVE = MEDICATION_STATUS.INACTIVE$.MODULE$;
}
