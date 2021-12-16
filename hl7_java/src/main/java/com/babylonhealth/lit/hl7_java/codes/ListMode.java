package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.LIST_MODE;

public interface ListMode {
  public static final LIST_MODE CHANGES = LIST_MODE.CHANGES$.MODULE$;
  public static final LIST_MODE SNAPSHOT = LIST_MODE.SNAPSHOT$.MODULE$;
  public static final LIST_MODE WORKING = LIST_MODE.WORKING$.MODULE$;
}
