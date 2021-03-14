package com.babylonhealth.lit

import com.typesafe.config.ConfigFactory


object Config {
  private val c = ConfigFactory.load()

  val expandValueSets: Boolean = c.getBoolean("expandValueSets")
  val useLabelAsDisplayNameForEnums: Boolean = c.getBoolean("useLabelAsDisplayNameForEnums")
  val useVersionedReferencesForEnums: Boolean = c.getBoolean("useVersionedReferencesForEnums")
}
