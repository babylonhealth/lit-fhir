package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.SPECIMEN_STATUS;

public interface SpecimenStatus {
  public static final SPECIMEN_STATUS AVAILABLE = SPECIMEN_STATUS.AVAILABLE$.MODULE$;
  public static final SPECIMEN_STATUS ENTERED_IN_ERROR = SPECIMEN_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final SPECIMEN_STATUS UNAVAILABLE = SPECIMEN_STATUS.UNAVAILABLE$.MODULE$;
  public static final SPECIMEN_STATUS UNSATISFACTORY = SPECIMEN_STATUS.UNSATISFACTORY$.MODULE$;
}
