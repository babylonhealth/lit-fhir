package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.FILTER_OPERATOR;

public interface FilterOperator {
  public static final FILTER_OPERATOR DESCENDENT_OF = FILTER_OPERATOR.DESCENDENT_OF$.MODULE$;
  public static final FILTER_OPERATOR EQUALS = FILTER_OPERATOR.EQUALS$.MODULE$;
  public static final FILTER_OPERATOR EXISTS = FILTER_OPERATOR.EXISTS$.MODULE$;
  public static final FILTER_OPERATOR GENERALIZES = FILTER_OPERATOR.GENERALIZES$.MODULE$;
  public static final FILTER_OPERATOR IN = FILTER_OPERATOR.IN$.MODULE$;
  public static final FILTER_OPERATOR IS_A = FILTER_OPERATOR.IS_A$.MODULE$;
  public static final FILTER_OPERATOR IS_NOT_A = FILTER_OPERATOR.IS_NOT_A$.MODULE$;
  public static final FILTER_OPERATOR NOT_IN_SET = FILTER_OPERATOR.NOT_IN_SET$.MODULE$;
  public static final FILTER_OPERATOR REGEX = FILTER_OPERATOR.REGEX$.MODULE$;
}