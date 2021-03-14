package com.babylonhealth.lit.core

import io.circe.Error.showError
import io.circe.{ CursorOp, DecodingFailure }

class FhirDecodeError(error: io.circe.Error) extends RuntimeException {
  override def getCause: Throwable = error
  override def getMessage: String  = showError.show(error)

  /** The FHIR path to the decode error */
  def fhirPath: Option[String] =
    error match {
      case failure: DecodingFailure =>
        // Equivalent to fhirpath for common cases - there might be some edge cases I missed though
        Some(CursorOp.opsToPath(failure.history).stripPrefix("."))
      case _ => None
    }
}
