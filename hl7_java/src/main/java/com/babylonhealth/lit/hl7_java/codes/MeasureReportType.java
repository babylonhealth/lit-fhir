package com.babylonhealth.lit.hl7_java.codes;

import com.babylonhealth.lit.hl7.MEASURE_REPORT_TYPE;

public interface MeasureReportType {
  public static final MEASURE_REPORT_TYPE DATA_COLLECTION =
      MEASURE_REPORT_TYPE.DATA_COLLECTION$.MODULE$;
  public static final MEASURE_REPORT_TYPE INDIVIDUAL = MEASURE_REPORT_TYPE.INDIVIDUAL$.MODULE$;
  public static final MEASURE_REPORT_TYPE SUBJECT_LIST = MEASURE_REPORT_TYPE.SUBJECT_LIST$.MODULE$;
  public static final MEASURE_REPORT_TYPE SUMMARY = MEASURE_REPORT_TYPE.SUMMARY$.MODULE$;
}
