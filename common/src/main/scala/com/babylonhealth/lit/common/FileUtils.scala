package com.babylonhealth.lit.common

import scala.io.BufferedSource

trait FileUtils {
  def rscStream(s: String): BufferedSource = scala.io.Source.fromInputStream(getClass.getResourceAsStream(s))
  def slurpRsc(s: String): String          = rscStream(s"/$s").getLines.mkString("\n")
}
