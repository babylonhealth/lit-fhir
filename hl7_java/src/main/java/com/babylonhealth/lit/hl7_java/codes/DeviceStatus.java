package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.DEVICE_STATUS;

public interface DeviceStatus {
  public static final DEVICE_STATUS ACTIVE = DEVICE_STATUS.ACTIVE$.MODULE$;
  public static final DEVICE_STATUS ENTERED_IN_ERROR = DEVICE_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final DEVICE_STATUS INACTIVE = DEVICE_STATUS.INACTIVE$.MODULE$;
  public static final DEVICE_STATUS UNKNOWN = DEVICE_STATUS.UNKNOWN$.MODULE$;
}
