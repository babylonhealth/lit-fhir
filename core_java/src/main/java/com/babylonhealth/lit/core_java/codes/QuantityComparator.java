package com.babylonhealth.lit.core_java.codes;

import com.babylonhealth.lit.core.QUANTITY_COMPARATOR;

public interface QuantityComparator {
  public static final QUANTITY_COMPARATOR GREATER_OR_EQUAL_TO =
      QUANTITY_COMPARATOR.GREATER_OR_EQUAL_TO$.MODULE$;
  public static final QUANTITY_COMPARATOR GREATER_THAN = QUANTITY_COMPARATOR.GREATER_THAN$.MODULE$;
  public static final QUANTITY_COMPARATOR LESS_OR_EQUAL_TO =
      QUANTITY_COMPARATOR.LESS_OR_EQUAL_TO$.MODULE$;
  public static final QUANTITY_COMPARATOR LESS_THAN = QUANTITY_COMPARATOR.LESS_THAN$.MODULE$;
}
