package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;

public interface RequestPriority {
  public static final REQUEST_PRIORITY ASAP = REQUEST_PRIORITY.ASAP$.MODULE$;
  public static final REQUEST_PRIORITY ROUTINE = REQUEST_PRIORITY.ROUTINE$.MODULE$;
  public static final REQUEST_PRIORITY STAT = REQUEST_PRIORITY.STAT$.MODULE$;
  public static final REQUEST_PRIORITY URGENT = REQUEST_PRIORITY.URGENT$.MODULE$;
}
