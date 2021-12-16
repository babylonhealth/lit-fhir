package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.SUPPLYDELIVERY_STATUS;

public interface SupplydeliveryStatus {
  public static final SUPPLYDELIVERY_STATUS ABANDONED = SUPPLYDELIVERY_STATUS.ABANDONED$.MODULE$;
  public static final SUPPLYDELIVERY_STATUS COMPLETED = SUPPLYDELIVERY_STATUS.COMPLETED$.MODULE$;
  public static final SUPPLYDELIVERY_STATUS ENTERED_IN_ERROR =
      SUPPLYDELIVERY_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final SUPPLYDELIVERY_STATUS IN_PROGRESS =
      SUPPLYDELIVERY_STATUS.IN_PROGRESS$.MODULE$;
}
