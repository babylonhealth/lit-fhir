package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;

public interface PublicationStatus {
  public static final PUBLICATION_STATUS ACTIVE = PUBLICATION_STATUS.ACTIVE$.MODULE$;
  public static final PUBLICATION_STATUS DRAFT = PUBLICATION_STATUS.DRAFT$.MODULE$;
  public static final PUBLICATION_STATUS RETIRED = PUBLICATION_STATUS.RETIRED$.MODULE$;
  public static final PUBLICATION_STATUS UNKNOWN = PUBLICATION_STATUS.UNKNOWN$.MODULE$;
}
