package com.babylonhealth.lit.usbase_java.codes;

import com.babylonhealth.lit.usbase.AUDIT_EVENT_OUTCOME;

public interface AuditEventOutcome {
  public static final AUDIT_EVENT_OUTCOME MAJOR_FAILURE =
      AUDIT_EVENT_OUTCOME.MAJOR_FAILURE$.MODULE$;
  public static final AUDIT_EVENT_OUTCOME MINOR_FAILURE =
      AUDIT_EVENT_OUTCOME.MINOR_FAILURE$.MODULE$;
  public static final AUDIT_EVENT_OUTCOME SERIOUS_FAILURE =
      AUDIT_EVENT_OUTCOME.SERIOUS_FAILURE$.MODULE$;
  public static final AUDIT_EVENT_OUTCOME SUCCESS = AUDIT_EVENT_OUTCOME.SUCCESS$.MODULE$;
}
