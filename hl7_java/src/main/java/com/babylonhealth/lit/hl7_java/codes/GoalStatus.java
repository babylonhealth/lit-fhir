package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.GOAL_STATUS;

public interface GoalStatus {
  public static final GOAL_STATUS ACCEPTED = GOAL_STATUS.ACCEPTED$.MODULE$;
  public static final GOAL_STATUS ACTIVE = GOAL_STATUS.ACTIVE$.MODULE$;
  public static final GOAL_STATUS CANCELLED = GOAL_STATUS.CANCELLED$.MODULE$;
  public static final GOAL_STATUS COMPLETED = GOAL_STATUS.COMPLETED$.MODULE$;
  public static final GOAL_STATUS ENTERED_IN_ERROR = GOAL_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final GOAL_STATUS ON_HOLD = GOAL_STATUS.ON_HOLD$.MODULE$;
  public static final GOAL_STATUS PLANNED = GOAL_STATUS.PLANNED$.MODULE$;
  public static final GOAL_STATUS PROPOSED = GOAL_STATUS.PROPOSED$.MODULE$;
  public static final GOAL_STATUS REJECTED = GOAL_STATUS.REJECTED$.MODULE$;
}
