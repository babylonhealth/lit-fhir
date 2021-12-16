package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.ACTION_GROUPING_BEHAVIOR;

public interface ActionGroupingBehavior {
  public static final ACTION_GROUPING_BEHAVIOR LOGICAL_GROUP =
      ACTION_GROUPING_BEHAVIOR.LOGICAL_GROUP$.MODULE$;
  public static final ACTION_GROUPING_BEHAVIOR SENTENCE_GROUP =
      ACTION_GROUPING_BEHAVIOR.SENTENCE_GROUP$.MODULE$;
  public static final ACTION_GROUPING_BEHAVIOR VISUAL_GROUP =
      ACTION_GROUPING_BEHAVIOR.VISUAL_GROUP$.MODULE$;
}
