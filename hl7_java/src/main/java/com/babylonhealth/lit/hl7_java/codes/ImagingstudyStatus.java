package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.IMAGINGSTUDY_STATUS;

public interface ImagingstudyStatus {
  public static final IMAGINGSTUDY_STATUS AVAILABLE = IMAGINGSTUDY_STATUS.AVAILABLE$.MODULE$;
  public static final IMAGINGSTUDY_STATUS CANCELLED = IMAGINGSTUDY_STATUS.CANCELLED$.MODULE$;
  public static final IMAGINGSTUDY_STATUS ENTERED_IN_ERROR =
      IMAGINGSTUDY_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final IMAGINGSTUDY_STATUS REGISTERED = IMAGINGSTUDY_STATUS.REGISTERED$.MODULE$;
  public static final IMAGINGSTUDY_STATUS UNKNOWN = IMAGINGSTUDY_STATUS.UNKNOWN$.MODULE$;
}