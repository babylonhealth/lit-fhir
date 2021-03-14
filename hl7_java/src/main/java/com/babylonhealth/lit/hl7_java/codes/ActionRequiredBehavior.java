package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.ACTION_REQUIRED_BEHAVIOR;

public interface ActionRequiredBehavior {
  public static final ACTION_REQUIRED_BEHAVIOR COULD = ACTION_REQUIRED_BEHAVIOR.COULD$.MODULE$;
  public static final ACTION_REQUIRED_BEHAVIOR MUST = ACTION_REQUIRED_BEHAVIOR.MUST$.MODULE$;
  public static final ACTION_REQUIRED_BEHAVIOR MUST_UNLESS_DOCUMENTED =
      ACTION_REQUIRED_BEHAVIOR.MUST_UNLESS_DOCUMENTED$.MODULE$;
}
