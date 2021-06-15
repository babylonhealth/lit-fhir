package com.babylonhealth.lit.usbase

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.Extension
import com.babylonhealth.lit.usbase.model.Data_absent_reason

class ExtensionExtraction extends AnyFreeSpec with Matchers {
  "should extract an enum as an enum" in {
    val ext   = Data_absent_reason(value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    val value = Data_absent_reason.extractValue(ext)
    value shouldEqual DATA_ABSENT_REASON.ASKED_BUT_DECLINED
  }
  "should copy ok" in {
    val ext  = Data_absent_reason(value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    val ext1 = ext.set(_.value)(DATA_ABSENT_REASON.TEMPORARILY_UNKNOWN)
    val ext2 = ext1.set(_.value)(DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    ext2 shouldEqual ext
    ext1 shouldNot equal(ext)
    Data_absent_reason.extractValue(ext2) shouldEqual DATA_ABSENT_REASON.ASKED_BUT_DECLINED
    Data_absent_reason.extractValue(ext1) shouldEqual DATA_ABSENT_REASON.TEMPORARILY_UNKNOWN
  }
  "Do things" in {
    val ext1 = Data_absent_reason(value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
    val ext2 =
      Extension(url = Data_absent_reason.profileUrl.get, value = Some(choice(DATA_ABSENT_REASON.ASKED_BUT_DECLINED)))
    val fs = Data_absent_reason.fieldsFromParent(ext2).get
    println(s"FS: ${fs}")
    val ext3 = Data_absent_reason.cast(ext2).get
    ext3 shouldEqual ext1
    ext1.companion shouldEqual Data_absent_reason
    ext2.companion shouldEqual Extension
    ext3.companion shouldEqual Data_absent_reason

  }

}
