package com.babylonhealth.lit.core_java.codes;

import com.babylonhealth.lit.core.EXPRESSION_LANGUAGE;

public interface ExpressionLanguage {
  public static final EXPRESSION_LANGUAGE CQL = EXPRESSION_LANGUAGE.CQL$.MODULE$;
  public static final EXPRESSION_LANGUAGE FHIRPATH = EXPRESSION_LANGUAGE.FHIRPATH$.MODULE$;
  public static final EXPRESSION_LANGUAGE FHIR_QUERY = EXPRESSION_LANGUAGE.FHIR_QUERY$.MODULE$;
}
