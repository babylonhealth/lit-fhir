package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.ENDPOINT_STATUS;

public interface EndpointStatus {
  public static final ENDPOINT_STATUS ACTIVE = ENDPOINT_STATUS.ACTIVE$.MODULE$;
  public static final ENDPOINT_STATUS ENTERED_IN_ERROR = ENDPOINT_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final ENDPOINT_STATUS ERROR = ENDPOINT_STATUS.ERROR$.MODULE$;
  public static final ENDPOINT_STATUS OFF = ENDPOINT_STATUS.OFF$.MODULE$;
  public static final ENDPOINT_STATUS SUSPENDED = ENDPOINT_STATUS.SUSPENDED$.MODULE$;
  public static final ENDPOINT_STATUS TEST = ENDPOINT_STATUS.TEST$.MODULE$;
}
