package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.ISSUE_SEVERITY;

public interface IssueSeverity {
  public static final ISSUE_SEVERITY ERROR = ISSUE_SEVERITY.ERROR$.MODULE$;
  public static final ISSUE_SEVERITY FATAL = ISSUE_SEVERITY.FATAL$.MODULE$;
  public static final ISSUE_SEVERITY INFORMATION = ISSUE_SEVERITY.INFORMATION$.MODULE$;
  public static final ISSUE_SEVERITY WARNING = ISSUE_SEVERITY.WARNING$.MODULE$;
}
