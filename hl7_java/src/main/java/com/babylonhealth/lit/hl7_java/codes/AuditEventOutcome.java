package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.AUDIT_EVENT_OUTCOME;

public interface AuditEventOutcome {
  public static final AUDIT_EVENT_OUTCOME MAJOR_FAILURE =
      AUDIT_EVENT_OUTCOME.MAJOR_FAILURE$.MODULE$;
  public static final AUDIT_EVENT_OUTCOME MINOR_FAILURE =
      AUDIT_EVENT_OUTCOME.MINOR_FAILURE$.MODULE$;
  public static final AUDIT_EVENT_OUTCOME SERIOUS_FAILURE =
      AUDIT_EVENT_OUTCOME.SERIOUS_FAILURE$.MODULE$;
  public static final AUDIT_EVENT_OUTCOME SUCCESS = AUDIT_EVENT_OUTCOME.SUCCESS$.MODULE$;
}
