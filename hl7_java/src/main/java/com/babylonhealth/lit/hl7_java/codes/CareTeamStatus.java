package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.CARE_TEAM_STATUS;

public interface CareTeamStatus {
  public static final CARE_TEAM_STATUS ACTIVE = CARE_TEAM_STATUS.ACTIVE$.MODULE$;
  public static final CARE_TEAM_STATUS ENTERED_IN_ERROR =
      CARE_TEAM_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final CARE_TEAM_STATUS INACTIVE = CARE_TEAM_STATUS.INACTIVE$.MODULE$;
  public static final CARE_TEAM_STATUS PROPOSED = CARE_TEAM_STATUS.PROPOSED$.MODULE$;
  public static final CARE_TEAM_STATUS SUSPENDED = CARE_TEAM_STATUS.SUSPENDED$.MODULE$;
}
