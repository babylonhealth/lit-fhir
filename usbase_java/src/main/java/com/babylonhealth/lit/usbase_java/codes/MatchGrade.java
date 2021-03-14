package com.babylonhealth.lit.usbase_java.codes;

import com.babylonhealth.lit.usbase.MATCH_GRADE;

public interface MatchGrade {
  public static final MATCH_GRADE CERTAIN = MATCH_GRADE.CERTAIN$.MODULE$;
  public static final MATCH_GRADE CERTAINLY_NOT_A_MATCH =
      MATCH_GRADE.CERTAINLY_NOT_A_MATCH$.MODULE$;
  public static final MATCH_GRADE POSSIBLE = MATCH_GRADE.POSSIBLE$.MODULE$;
  public static final MATCH_GRADE PROBABLE = MATCH_GRADE.PROBABLE$.MODULE$;
}
