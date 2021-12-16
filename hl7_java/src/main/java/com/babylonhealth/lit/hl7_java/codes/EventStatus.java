package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.EVENT_STATUS;

public interface EventStatus {
  public static final EVENT_STATUS COMPLETED = EVENT_STATUS.COMPLETED$.MODULE$;
  public static final EVENT_STATUS ENTERED_IN_ERROR = EVENT_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final EVENT_STATUS IN_PROGRESS = EVENT_STATUS.IN_PROGRESS$.MODULE$;
  public static final EVENT_STATUS NOT_DONE = EVENT_STATUS.NOT_DONE$.MODULE$;
  public static final EVENT_STATUS ON_HOLD = EVENT_STATUS.ON_HOLD$.MODULE$;
  public static final EVENT_STATUS PREPARATION = EVENT_STATUS.PREPARATION$.MODULE$;
  public static final EVENT_STATUS STOPPED = EVENT_STATUS.STOPPED$.MODULE$;
  public static final EVENT_STATUS UNKNOWN = EVENT_STATUS.UNKNOWN$.MODULE$;
}
