package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.COMPOSITION_STATUS;

public interface CompositionStatus {
  public static final COMPOSITION_STATUS AMENDED = COMPOSITION_STATUS.AMENDED$.MODULE$;
  public static final COMPOSITION_STATUS ENTERED_IN_ERROR =
      COMPOSITION_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final COMPOSITION_STATUS FINAL = COMPOSITION_STATUS.FINAL$.MODULE$;
  public static final COMPOSITION_STATUS PRELIMINARY = COMPOSITION_STATUS.PRELIMINARY$.MODULE$;
}
