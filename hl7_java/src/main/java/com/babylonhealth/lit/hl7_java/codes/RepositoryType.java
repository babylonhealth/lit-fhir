package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.REPOSITORY_TYPE;

public interface RepositoryType {
  public static final REPOSITORY_TYPE DIRECTLINK = REPOSITORY_TYPE.DIRECTLINK$.MODULE$;
  public static final REPOSITORY_TYPE LOGIN = REPOSITORY_TYPE.LOGIN$.MODULE$;
  public static final REPOSITORY_TYPE OAUTH = REPOSITORY_TYPE.OAUTH$.MODULE$;
  public static final REPOSITORY_TYPE OPENAPI = REPOSITORY_TYPE.OPENAPI$.MODULE$;
  public static final REPOSITORY_TYPE OTHER = REPOSITORY_TYPE.OTHER$.MODULE$;
}
