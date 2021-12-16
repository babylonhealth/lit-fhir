package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.REQUEST_STATUS;

public interface RequestStatus {
  public static final REQUEST_STATUS ACTIVE = REQUEST_STATUS.ACTIVE$.MODULE$;
  public static final REQUEST_STATUS COMPLETED = REQUEST_STATUS.COMPLETED$.MODULE$;
  public static final REQUEST_STATUS DRAFT = REQUEST_STATUS.DRAFT$.MODULE$;
  public static final REQUEST_STATUS ENTERED_IN_ERROR = REQUEST_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final REQUEST_STATUS ON_HOLD = REQUEST_STATUS.ON_HOLD$.MODULE$;
  public static final REQUEST_STATUS REVOKED = REQUEST_STATUS.REVOKED$.MODULE$;
  public static final REQUEST_STATUS UNKNOWN = REQUEST_STATUS.UNKNOWN$.MODULE$;
}
