package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.CODESYSTEM_CONTENT_MODE;

public interface CodesystemContentMode {
  public static final CODESYSTEM_CONTENT_MODE COMPLETE = CODESYSTEM_CONTENT_MODE.COMPLETE$.MODULE$;
  public static final CODESYSTEM_CONTENT_MODE EXAMPLE = CODESYSTEM_CONTENT_MODE.EXAMPLE$.MODULE$;
  public static final CODESYSTEM_CONTENT_MODE FRAGMENT = CODESYSTEM_CONTENT_MODE.FRAGMENT$.MODULE$;
  public static final CODESYSTEM_CONTENT_MODE NOT_PRESENT =
      CODESYSTEM_CONTENT_MODE.NOT_PRESENT$.MODULE$;
  public static final CODESYSTEM_CONTENT_MODE SUPPLEMENT =
      CODESYSTEM_CONTENT_MODE.SUPPLEMENT$.MODULE$;
}