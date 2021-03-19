package com.babylonhealth.lit.core

import com.typesafe.config.ConfigFactory

object Config {
  val config                           = ConfigFactory.load().getConfig("lit")
  val tolerantBundleDecoding           = config.getBoolean("tolerantBundleDecoding")
  val tolerateProfileErrors            = config.getBoolean("tolerateProfileErrors")
  val flexibleCardinality              = config.getBoolean("flexibleCardinality")
  val decodePrimitiveExtensions        = config.getBoolean("decodePrimitiveExtensions")
  val createPhantomValues              = config.getBoolean("createPhantomValues")
  val ignoreUnknownFields              = config.getBoolean("ignoreUnknownFields")
  val logOnBadProfile                  = config.getBoolean("logOnBadProfile")
  val logOnMissingExtension            = config.getBoolean("logOnMissingExtension")
  val tolerateExtensionErrors          = config.getBoolean("tolerateExtensionErrors")
  val generatedNamespaces: Seq[String] = config.getString("generatedNamespaces").split(",")
}
