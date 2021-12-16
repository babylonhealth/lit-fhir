package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.TASK_INTENT;

public interface TaskIntent {
  public static final TASK_INTENT FILLER_ORDER = TASK_INTENT.FILLER_ORDER$.MODULE$;
  public static final TASK_INTENT INSTANCE_ORDER = TASK_INTENT.INSTANCE_ORDER$.MODULE$;
  public static final TASK_INTENT OPTION = TASK_INTENT.OPTION$.MODULE$;
  public static final TASK_INTENT ORDER = TASK_INTENT.ORDER$.MODULE$;
  public static final TASK_INTENT ORIGINAL_ORDER = TASK_INTENT.ORIGINAL_ORDER$.MODULE$;
  public static final TASK_INTENT PLAN = TASK_INTENT.PLAN$.MODULE$;
  public static final TASK_INTENT PROPOSAL = TASK_INTENT.PROPOSAL$.MODULE$;
  public static final TASK_INTENT REFLEX_ORDER = TASK_INTENT.REFLEX_ORDER$.MODULE$;
  public static final TASK_INTENT UNKNOWN = TASK_INTENT.UNKNOWN$.MODULE$;
}
