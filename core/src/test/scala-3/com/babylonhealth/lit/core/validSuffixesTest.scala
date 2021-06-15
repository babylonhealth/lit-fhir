package com.babylonhealth.lit.core

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.{ Code, OID, \/ }

class validSuffixesTest extends AnyFreeSpec with Matchers {
  "\\/.validSuffixes works" - {
    "for String | Int" in {
      \/.validSuffixes[String | Int] shouldEqual Set("String", "Integer")
    }
    "for String | Code" in {
      \/.validSuffixes[String | Code] shouldEqual Set("String", "Code")
    }
    "for String | Code | OID" in {
      \/.validSuffixes[String | Code | OID] shouldEqual Set("String", "Code", "Oid")
    }
  }
}
