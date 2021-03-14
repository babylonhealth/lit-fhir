package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.RESOURCE_AGGREGATION_MODE;

public interface ResourceAggregationMode {
  public static final RESOURCE_AGGREGATION_MODE BUNDLED =
      RESOURCE_AGGREGATION_MODE.BUNDLED$.MODULE$;
  public static final RESOURCE_AGGREGATION_MODE CONTAINED =
      RESOURCE_AGGREGATION_MODE.CONTAINED$.MODULE$;
  public static final RESOURCE_AGGREGATION_MODE REFERENCED =
      RESOURCE_AGGREGATION_MODE.REFERENCED$.MODULE$;
}
