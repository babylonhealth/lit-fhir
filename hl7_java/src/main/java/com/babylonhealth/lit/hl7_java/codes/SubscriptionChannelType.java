package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.SUBSCRIPTION_CHANNEL_TYPE;

public interface SubscriptionChannelType {
  public static final SUBSCRIPTION_CHANNEL_TYPE EMAIL = SUBSCRIPTION_CHANNEL_TYPE.EMAIL$.MODULE$;
  public static final SUBSCRIPTION_CHANNEL_TYPE MESSAGE =
      SUBSCRIPTION_CHANNEL_TYPE.MESSAGE$.MODULE$;
  public static final SUBSCRIPTION_CHANNEL_TYPE REST_HOOK =
      SUBSCRIPTION_CHANNEL_TYPE.REST_HOOK$.MODULE$;
  public static final SUBSCRIPTION_CHANNEL_TYPE SMS = SUBSCRIPTION_CHANNEL_TYPE.SMS$.MODULE$;
  public static final SUBSCRIPTION_CHANNEL_TYPE WEBSOCKET =
      SUBSCRIPTION_CHANNEL_TYPE.WEBSOCKET$.MODULE$;
}
