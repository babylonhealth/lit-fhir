package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.SUBSCRIPTION_STATUS;

public interface SubscriptionStatus {
  public static final SUBSCRIPTION_STATUS ACTIVE = SUBSCRIPTION_STATUS.ACTIVE$.MODULE$;
  public static final SUBSCRIPTION_STATUS ERROR = SUBSCRIPTION_STATUS.ERROR$.MODULE$;
  public static final SUBSCRIPTION_STATUS OFF = SUBSCRIPTION_STATUS.OFF$.MODULE$;
  public static final SUBSCRIPTION_STATUS REQUESTED = SUBSCRIPTION_STATUS.REQUESTED$.MODULE$;
}
