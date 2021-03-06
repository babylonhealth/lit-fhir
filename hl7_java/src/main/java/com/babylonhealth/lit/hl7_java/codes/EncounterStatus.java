package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.ENCOUNTER_STATUS;

public interface EncounterStatus {
  public static final ENCOUNTER_STATUS ARRIVED = ENCOUNTER_STATUS.ARRIVED$.MODULE$;
  public static final ENCOUNTER_STATUS CANCELLED = ENCOUNTER_STATUS.CANCELLED$.MODULE$;
  public static final ENCOUNTER_STATUS ENTERED_IN_ERROR =
      ENCOUNTER_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final ENCOUNTER_STATUS FINISHED = ENCOUNTER_STATUS.FINISHED$.MODULE$;
  public static final ENCOUNTER_STATUS IN_PROGRESS = ENCOUNTER_STATUS.IN_PROGRESS$.MODULE$;
  public static final ENCOUNTER_STATUS ONLEAVE = ENCOUNTER_STATUS.ONLEAVE$.MODULE$;
  public static final ENCOUNTER_STATUS PLANNED = ENCOUNTER_STATUS.PLANNED$.MODULE$;
  public static final ENCOUNTER_STATUS TRIAGED = ENCOUNTER_STATUS.TRIAGED$.MODULE$;
  public static final ENCOUNTER_STATUS UNKNOWN = ENCOUNTER_STATUS.UNKNOWN$.MODULE$;
}
