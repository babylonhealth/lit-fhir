package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.TASK_STATUS;

public interface TaskStatus {
  public static final TASK_STATUS ACCEPTED = TASK_STATUS.ACCEPTED$.MODULE$;
  public static final TASK_STATUS CANCELLED = TASK_STATUS.CANCELLED$.MODULE$;
  public static final TASK_STATUS COMPLETED = TASK_STATUS.COMPLETED$.MODULE$;
  public static final TASK_STATUS DRAFT = TASK_STATUS.DRAFT$.MODULE$;
  public static final TASK_STATUS ENTERED_IN_ERROR = TASK_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final TASK_STATUS FAILED = TASK_STATUS.FAILED$.MODULE$;
  public static final TASK_STATUS IN_PROGRESS = TASK_STATUS.IN_PROGRESS$.MODULE$;
  public static final TASK_STATUS ON_HOLD = TASK_STATUS.ON_HOLD$.MODULE$;
  public static final TASK_STATUS READY = TASK_STATUS.READY$.MODULE$;
  public static final TASK_STATUS RECEIVED = TASK_STATUS.RECEIVED$.MODULE$;
  public static final TASK_STATUS REJECTED = TASK_STATUS.REJECTED$.MODULE$;
  public static final TASK_STATUS REQUESTED = TASK_STATUS.REQUESTED$.MODULE$;
}
