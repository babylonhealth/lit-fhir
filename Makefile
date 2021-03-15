VERSION ?= local
G_VERSION ?= local
SBT=sbt -DARTIFACTORY_USER="${ARTIFACTORY_USER}" -DARTIFACTORY_PWD="${ARTIFACTORY_PWD}" -Dversion="${VERSION}"
SBT_G=sbt -DARTIFACTORY_USER="${ARTIFACTORY_USER}" -DARTIFACTORY_PWD="${ARTIFACTORY_PWD}" -Dversion="${G_VERSION}"
# Why sed and not grep, you ask? Because grep on mac takes the -E flag, but takes -P on *nix
BENCH_NUMBER=$(shell echo ${CIRCLE_JOB} | sed 's/benchmark//')
CORE_FILES=$(shell for i in address Age annotation attachment backboneElement codeableConcept coding contactDetail contactPoint Contributor Count DataRequirement Distance dosage duration element Expression extension humanName identifier meta money ParameterDefinition period quantity range ratio reference RelatedArtifact Resource SampledData Signature timing TriggerDefinition UsageContext; do echo "./generator/src/main/resources/resourceModel/$${i}.json"; done | xargs | sed 's/ /,/g')
HL7_FILES=$(shell ls generator/src/main/resources/resourceModel/*.json | grep -vE '/(address|Age|annotation|attachment|backboneElement|codeableConcept|coding|contactDetail|contactPoint|Contributor|Count|DataRequirement|Distance|dosage|duration|element|Expression|extension|humanName|identifier|meta|money|ParameterDefinition|period|quantity|range|ratio|reference|RelatedArtifact|Resource|SampledData|Signature|timing|TriggerDefinition|UsageContext).json'  | xargs | sed -E 's:(^| ):\1./:g' | sed 's/ /,/g')
CORE_MODULES=core hl7
US_MODULES=usbase uscore
ALL_MODULES=$(CORE_MODULES) $(US_MODULES)

generated-compile:
	$(SBT) $(foreach i,$(ALL_MODULES),$i/compile)

build: build-all-class-models test

benchmark:
	$(SBT) "bench/testOnly *RegressionBenchmarks${BENCH_NUMBER}"

compile-core:
	$(SBT) macros/compile $(foreach i,$(ALL_MODULES),$i/compile) fhirpath/compile
compile-java:
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/compile)
compile-proto:
	$(SBT) gproto/compile
compile-bench:
	$(SBT) bench/test:compile
compile: compile-core compile-java compile-proto compile-bench
	$(SBT) bench/test:compile

test-java:
	$(SBT) macros/compile
	$(SBT) $(foreach i,$(ALL_MODULES),$i/compile)
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/compile $iJava/test)

test:
	$(SBT) common/test generator/test macros/test
	$(SBT) $(foreach i,$(CORE_MODULES),$i/test)
	$(SBT) $(foreach i,$(CORE_MODULES),$iJava/test)
	$(SBT) $(foreach i,$(US_MODULES),$i/test)
	$(SBT) $(foreach i,$(US_MODULES),$iJava/test)
	$(SBT) fhirpath/test
	$(SBT) protoshim/test

publish:
	$(SBT) common/publish macros/publish
	$(SBT) $(foreach i,$(ALL_MODULES),$i/publish)
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/publish)
	$(SBT) fhirpath/publish
	$(SBT) gproto/publish
	$(SBT) protoshim/publish

publish-generator:
	$(SBT_G) common/publish generator/publish
publish-local-generator:
	$(SBT_G) common/publishLocal generator/publishLocal

publish-local-core:
	$(SBT) common/publishLocal macros/publishLocal $(foreach i,$(ALL_MODULES),$i/publishLocal) fhirpath/publishLocal
publish-local-java:
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/publishLocal)
publish-local-gproto:
	$(SBT) gproto/publishLocal protoshim/publishLocal
publish-local: publish-local-core publish-local-java publish-local-gproto

publish-java-m2:
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/publishM2)
publish-m2:
	$(SBT) common/publishM2 macros/publishM2
	$(SBT) $(foreach i,$(ALL_MODULES),$i/publishM2 $iJava/publishM2)
	$(SBT) fhirpath/publishM2

publish-all-local:
	$(SBT) common/publishLocal common/publishM2 macros/publishLocal macros/publishM2 $(foreach i,$(ALL_MODULES),$i/publishLocal $i/publishM2 $iJava/publishLocal $iJava/publishM2)

build-hl7-class-models:
	$(SBT) 'project generator' 'run "generate" "$(CORE_FILES)" "$(HL7_FILES)" \
		"./.ignore/dummy=" \
		"_java" \
		"./generated_typescript" \
		"" \
		true'
	$(SBT) $(foreach i,$(CORE_MODULES),$i/scalafmtAll)
	$(SBT) $(foreach i,$(CORE_MODULES),$iJava/javafmt)
	./apply_patches.sh

build-all-class-models:
	$(SBT) 'project generator' 'run "generate" "$(CORE_FILES)" "$(HL7_FILES)" \
		"usbase=fhir/spec/hl7.fhir.r4.examples/4.0.1/package/StructureDefinition-*;uscore=fhir/spec/hl7.fhir.us.core/3.1.0/package/StructureDefinition-*" \
		"_java" \
		"./.ignore/typescript" \
		"usbase<uscore" \
		true'
	$(SBT) $(foreach i,$(ALL_MODULES),$i/scalafmtAll)
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/javafmt)
	./apply_patches.sh

clean-target:
	rm -rf target/ */target

download-deps:
	$(SBT) update || true

clean-generated-scala:
	rm -rf $(foreach i,$(ALL_MODULES),$i/src/main/scala/com/babylonhealth/lit/$i/model)

clean-generated-java:
	rm -rf $(foreach i,$(ALL_MODULES),$i_java/src/main/java/com/babylonhealth/lit/$i_java/builders $i_java/src/main/java/com/babylonhealth/lit/$i_java/codes)

cycle: clean-generated-java clean-generated-scala build-all-class-models test

gen-java-proto: rm-bad-files
	mkdir -p ./gproto/src/main/java
	protoc --proto_path=./fhir -I=./fhir/proto --java_out=./gproto/src/main/java $(shell find ./fhir/proto -name '*.proto' | less)

# TODO: what was this about?
rm-bad-files:
	rm -f fhir/proto/r4/core/profiles/data_element_constraint_on_element_definition_data_type.proto
	rm -f fhir/proto/r4/core/profiles/ehrsfm_record_lifecycle_event_audit_event.proto
	rm -f fhir/proto/r4/core/profiles/cqf_questionnaire.proto
	rm -f fhir/proto/r4/core/profiles/pico_element_profile.proto
	rm -f fhir/proto/r4/core/profiles/cds_hooks_request_group.proto
	rm -f fhir/proto/r4/core/profiles/ehrsfm_record_lifecycle_event_provenance.proto
	rm -f fhir/proto/r4/core/profiles/cql_library.proto
	rm -f fhir/proto/r4/core/profiles/cds_hooks_service_plan_definition.proto
	rm -f fhir/proto/r4/core/profiles/profile_for_hla_genotyping_results.proto
	rm -f fhir/proto/r4/core/profiles/cds_hooks_guidance_response.proto
	rm -f fhir/proto/r4/core/profiles/datatypes.proto

pull-stuff:
	npm --registry https://packages.simplifier.net install hl7.fhir.r4.core@4.0.1
	rm -rf generator/src/main/resources/searchParams && mkdir generator/src/main/resources/searchParams
	mv node_modules/hl7.fhir.r4.core/SearchParameter-* generator/src/main/resources/searchParams
	rm -rf node_modules package-lock.json
	cat generator/src/main/resources/searchParams/SearchParameter-* \
		| jq '{name: .name, expression: .expression, base: .base}' \
		| jq -s . \
		> generator/src/main/resources/searchParams.json
	rm -rf generator/src/main/resources/searchParams

find-weird-ones:
	echo NO BASE:
	cat generator/src/main/resources/searchParams/SearchParameter-* | jq 'select (.base == null) | .id'
	echo MORE THAN ONE BASE:
	cat generator/src/main/resources/searchParams.json | jq '.[] | select(.base[1] != null) | .name'
	echo NO EXPRESSION:
	cat generator/src/main/resources/searchParams/SearchParameter-* | jq 'select (.expression == null) | .id'
