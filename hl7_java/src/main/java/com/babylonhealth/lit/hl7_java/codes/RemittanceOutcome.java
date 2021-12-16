package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.REMITTANCE_OUTCOME;

public interface RemittanceOutcome {
  public static final REMITTANCE_OUTCOME COMPLETE = REMITTANCE_OUTCOME.COMPLETE$.MODULE$;
  public static final REMITTANCE_OUTCOME ERROR = REMITTANCE_OUTCOME.ERROR$.MODULE$;
  public static final REMITTANCE_OUTCOME PARTIAL = REMITTANCE_OUTCOME.PARTIAL$.MODULE$;
  public static final REMITTANCE_OUTCOME QUEUED = REMITTANCE_OUTCOME.QUEUED$.MODULE$;
}
