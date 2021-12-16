package com.babylonhealth.lit.usbase_java.codes;

import com.babylonhealth.lit.usbase.EXPANSION_PROCESSING_RULE;

public interface ExpansionProcessingRule {
  public static final EXPANSION_PROCESSING_RULE ALL_CODES =
      EXPANSION_PROCESSING_RULE.ALL_CODES$.MODULE$;
  public static final EXPANSION_PROCESSING_RULE GROUPS_ONLY =
      EXPANSION_PROCESSING_RULE.GROUPS_ONLY$.MODULE$;
  public static final EXPANSION_PROCESSING_RULE UNGROUPED =
      EXPANSION_PROCESSING_RULE.UNGROUPED$.MODULE$;
}
