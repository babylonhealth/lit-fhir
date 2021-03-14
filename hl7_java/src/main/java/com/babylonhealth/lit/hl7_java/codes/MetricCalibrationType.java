package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.METRIC_CALIBRATION_TYPE;

public interface MetricCalibrationType {
  public static final METRIC_CALIBRATION_TYPE GAIN = METRIC_CALIBRATION_TYPE.GAIN$.MODULE$;
  public static final METRIC_CALIBRATION_TYPE OFFSET = METRIC_CALIBRATION_TYPE.OFFSET$.MODULE$;
  public static final METRIC_CALIBRATION_TYPE TWO_POINT =
      METRIC_CALIBRATION_TYPE.TWO_POINT$.MODULE$;
  public static final METRIC_CALIBRATION_TYPE UNSPECIFIED =
      METRIC_CALIBRATION_TYPE.UNSPECIFIED$.MODULE$;
}
