package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.VERSIONING_POLICY;

public interface VersioningPolicy {
  public static final VERSIONING_POLICY NO_VERSIONID_SUPPORT =
      VERSIONING_POLICY.NO_VERSIONID_SUPPORT$.MODULE$;
  public static final VERSIONING_POLICY VERSIONED = VERSIONING_POLICY.VERSIONED$.MODULE$;
  public static final VERSIONING_POLICY VERSIONID_TRACKED_FULLY =
      VERSIONING_POLICY.VERSIONID_TRACKED_FULLY$.MODULE$;
}
