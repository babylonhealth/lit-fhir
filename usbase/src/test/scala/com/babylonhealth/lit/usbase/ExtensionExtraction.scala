package com.babylonhealth.lit.usbase

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.usbase.model.Data_absent_reason

class ExtensionExtraction extends AnyFreeSpec with Matchers {
  "should extract an enum as an enum" in {
    val ext   = Data_absent_reason(value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    val value = Data_absent_reason.extractValue(ext)
    value shouldEqual DATA_ABSENT_REASON.ASKED_BUT_DECLINED
  }
  "should copy ok" in {
    val ext  = Data_absent_reason(value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    val ext1 = ext.withValue(DATA_ABSENT_REASON.TEMPORARILY_UNKNOWN)
    val ext2 = ext1.withValue(DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    ext2 shouldEqual ext
    ext1 shouldNot equal(ext)
    Data_absent_reason.extractValue(ext2) shouldEqual DATA_ABSENT_REASON.ASKED_BUT_DECLINED
    Data_absent_reason.extractValue(ext1) shouldEqual DATA_ABSENT_REASON.TEMPORARILY_UNKNOWN
  }

}
