package com.babylonhealth.lit.bench

import java.time.ZonedDateTime

import com.babylonhealth.lit.usbase.model.Bmi

trait JavaApiCalls {
  def mkEffectiveQuantityLitJ(value: Double)                                      = None
  def mkEffectiveChoiceLitJ(ts: ZonedDateTime)                                    = None
  def mkBmiLitJ(ts: ZonedDateTime, value: Double, patientId: String): Option[Bmi] = None
  def mkCategoriesLitJ                                                            = None
}
