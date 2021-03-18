#!/usr/bin/env bash

# Apply some manual hacks to the output: Currently, this consists of:
# - adding a 'tolerant' mode for bundle decoding
# - adding a couple of convenience methods to Resource for fetching a (potentially versioned) formatted identifier
# - splicing an extension url lookup into the decoding method for Extension
# - replacing carriage returns in .scala files with a normal space
# 	 - this basically only applies to scaladoc generated from FHIR structure definition jsons
# - Deleting usbase_java/src/main/java/com/babylonhealth/lit/usbase_java/builders/`11179* 'cause we don't handle the class names 'properly' in java yet
# - Deleting uscore_java/src/main/java/com/babylonhealth/lit/uscore_java/builders/Us_core_smokingstatusBuilder.java 'cause we don't automatically convert the unspecified 'Code' type to the parent enum value
patch hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Bundle.scala bundle_decoding.patch
patch core/src/main/scala/com/babylonhealth/lit/core/model/Resource.scala resource_identifier.patch
patch core/src/main/scala/com/babylonhealth/lit/core/model/Extension.scala Extension.scala.patch
rm -f hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Bundle.scala.orig \
core/src/main/scala/com/babylonhealth/lit/core/model/Resource.scala.orig \
core/src/main/scala/com/babylonhealth/lit/core/model/Extension.scala.orig \
uscore_java/src/main/java/com/babylonhealth/lit/uscore_java/builders/Us_core_smokingstatusBuilder.java
find . -name '*.scala' | xargs grep -l '\r' | xargs perl -pi.to_del -e 's/\r/ /g' && find . -name '*.to_del' -exec rm -rf {} \;
