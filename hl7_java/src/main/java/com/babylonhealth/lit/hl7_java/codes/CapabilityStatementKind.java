package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.CAPABILITY_STATEMENT_KIND;

public interface CapabilityStatementKind {
  public static final CAPABILITY_STATEMENT_KIND CAPABILITY =
      CAPABILITY_STATEMENT_KIND.CAPABILITY$.MODULE$;
  public static final CAPABILITY_STATEMENT_KIND INSTANCE =
      CAPABILITY_STATEMENT_KIND.INSTANCE$.MODULE$;
  public static final CAPABILITY_STATEMENT_KIND REQUIREMENTS =
      CAPABILITY_STATEMENT_KIND.REQUIREMENTS$.MODULE$;
}
