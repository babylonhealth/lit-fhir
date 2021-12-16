package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.UDI_ENTRY_TYPE;

public interface UdiEntryType {
  public static final UDI_ENTRY_TYPE BARCODE = UDI_ENTRY_TYPE.BARCODE$.MODULE$;
  public static final UDI_ENTRY_TYPE CARD = UDI_ENTRY_TYPE.CARD$.MODULE$;
  public static final UDI_ENTRY_TYPE MANUAL = UDI_ENTRY_TYPE.MANUAL$.MODULE$;
  public static final UDI_ENTRY_TYPE RFID = UDI_ENTRY_TYPE.RFID$.MODULE$;
  public static final UDI_ENTRY_TYPE SELF_REPORTED = UDI_ENTRY_TYPE.SELF_REPORTED$.MODULE$;
  public static final UDI_ENTRY_TYPE UNKNOWN = UDI_ENTRY_TYPE.UNKNOWN$.MODULE$;
}
