package com.babylonhealth.lit.usbase_java.codes;

import com.babylonhealth.lit.usbase.CONFORMANCE_EXPECTATION;

public interface ConformanceExpectation {
  public static final CONFORMANCE_EXPECTATION MAY = CONFORMANCE_EXPECTATION.MAY$.MODULE$;
  public static final CONFORMANCE_EXPECTATION SHALL = CONFORMANCE_EXPECTATION.SHALL$.MODULE$;
  public static final CONFORMANCE_EXPECTATION SHOULD = CONFORMANCE_EXPECTATION.SHOULD$.MODULE$;
  public static final CONFORMANCE_EXPECTATION SHOULD_NOT =
      CONFORMANCE_EXPECTATION.SHOULD_NOT$.MODULE$;
}
