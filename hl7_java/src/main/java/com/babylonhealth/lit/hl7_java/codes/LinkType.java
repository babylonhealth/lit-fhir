package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.LINK_TYPE;

public interface LinkType {
  public static final LINK_TYPE REFER = LINK_TYPE.REFER$.MODULE$;
  public static final LINK_TYPE REPLACED_BY = LINK_TYPE.REPLACED_BY$.MODULE$;
  public static final LINK_TYPE REPLACES = LINK_TYPE.REPLACES$.MODULE$;
  public static final LINK_TYPE SEEALSO = LINK_TYPE.SEEALSO$.MODULE$;
}
