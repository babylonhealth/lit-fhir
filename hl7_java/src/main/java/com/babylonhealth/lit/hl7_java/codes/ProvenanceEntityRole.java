package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.PROVENANCE_ENTITY_ROLE;

public interface ProvenanceEntityRole {
  public static final PROVENANCE_ENTITY_ROLE DERIVATION =
      PROVENANCE_ENTITY_ROLE.DERIVATION$.MODULE$;
  public static final PROVENANCE_ENTITY_ROLE QUOTATION = PROVENANCE_ENTITY_ROLE.QUOTATION$.MODULE$;
  public static final PROVENANCE_ENTITY_ROLE REMOVAL = PROVENANCE_ENTITY_ROLE.REMOVAL$.MODULE$;
  public static final PROVENANCE_ENTITY_ROLE REVISION = PROVENANCE_ENTITY_ROLE.REVISION$.MODULE$;
  public static final PROVENANCE_ENTITY_ROLE SOURCE = PROVENANCE_ENTITY_ROLE.SOURCE$.MODULE$;
}
