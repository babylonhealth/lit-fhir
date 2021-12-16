package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.DOCUMENT_REFERENCE_STATUS;

public interface DocumentReferenceStatus {
  public static final DOCUMENT_REFERENCE_STATUS CURRENT =
      DOCUMENT_REFERENCE_STATUS.CURRENT$.MODULE$;
  public static final DOCUMENT_REFERENCE_STATUS ENTERED_IN_ERROR =
      DOCUMENT_REFERENCE_STATUS.ENTERED_IN_ERROR$.MODULE$;
  public static final DOCUMENT_REFERENCE_STATUS SUPERSEDED =
      DOCUMENT_REFERENCE_STATUS.SUPERSEDED$.MODULE$;
}
