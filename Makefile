# Why sed and not grep, you ask? Because grep on mac takes the -E flag, but takes -P on *nix
BENCH_NUMBER=$(shell echo ${CIRCLE_JOB} | sed 's/benchmark//')
CORE_MODULES=core hl7
US_MODULES=usbase uscore
ALL_MODULES=$(CORE_MODULES) $(US_MODULES) ukcore
HYDRANT_VERSION=0.10.5
HYDRA_DOCKER=-e LIT_LOG_ON_BAD_PROFILE=false -e LIT_BUILDTIME_CLASSGRAPH=lit-graph -e LIT_CREATE_PHANTOM_VALUES=false $(HYDRANT_IMAGE):$(HYDRANT_VERSION)

generated-compile:
	sbt $(foreach i,$(ALL_MODULES),$i/compile)

build: build-all-class-models test

benchmark:
	sbt "+bench/testOnly *RegressionBenchmarks${BENCH_NUMBER}"

clean-scala-3-core:
	sbt ++3.x.x core/clean

clean-scala-3:
	sbt ++3.x.x core/clean hl7/clean usbase/clean uscore/clean core/test:clean hl7/test:clean usbase/test:clean uscore/test:clean

compile-core: clean-scala-3-core
	sbt +macros/compile $(foreach i,$(ALL_MODULES),+$i/compile) +fhirpath/compile
compile-java:
	sbt $(foreach i,$(ALL_MODULES),$iJava/compile)
compile-bench:
	sbt +bench/test:compile
compile: compile-core compile-java compile-bench

test-java:
	sbt macros/compile
	sbt $(foreach i,$(ALL_MODULES),$i/compile)
	sbt $(foreach i,$(ALL_MODULES),$iJava/compile $iJava/test)

test:
	sbt +common/test +macros/test +generator/test
	sbt $(foreach i,$(CORE_MODULES),+$i/test)
	sbt $(foreach i,$(CORE_MODULES),$iJava/test)
	sbt $(foreach i,$(US_MODULES) ukcore,+$i/test)
	sbt $(foreach i,$(US_MODULES) ukcore,$iJava/test)
	sbt +fhirpath/test
	sbt +protoshim/test
	sbt +'bench/testOnly *ExampleTest'

publish:
	sbt +common/publish +macros/publish
	sbt $(foreach i,$(ALL_MODULES),+$i/publish)
	sbt $(foreach i,$(ALL_MODULES),$iJava/publish)
	sbt +fhirpath/publish
	sbt +protoshim/publish

publish-generator:
	sbt +common/publish || echo "cannot publish commmon. Continuing anyway"
	sbt +generator/publish
publish-local-generator:
	sbt +common/publishLocal +generator/publishLocal

publish-local-core:
	sbt +common/publishLocal +macros/publishLocal $(foreach i,$(ALL_MODULES),+$i/publishLocal) +fhirpath/publishLocal
publish-local-java:
	sbt $(foreach i,$(ALL_MODULES),$iJava/publishLocal)
publish-local: publish-local-core publish-local-java

publish-java-m2:
	sbt $(foreach i,$(ALL_MODULES),$iJava/publishM2)
publish-m2:
	sbt +common/publishM2 +macros/publishM2
	sbt $(foreach i,$(ALL_MODULES),+$i/publishM2 $iJava/publishM2)
	sbt +fhirpath/publishM2

publish-all-local:
	sbt +common/publishLocal +common/publishM2 +macros/publishLocal +macros/publishM2 $(foreach i,$(ALL_MODULES),+$i/publishLocal +$i/publishM2 $iJava/publishLocal $iJava/publishM2) +fhirpath/publishLocal +fhirpath/publishM2

build-hl7-class-models:
	sbt 'project generator' 'run "generate" \
		--javaPackageSuffix=_java \
		--typescriptDir="./generated_typescript"'
	sbt $(foreach i,$(CORE_MODULES),+$i/scalafmtAll)
	sbt $(foreach i,$(CORE_MODULES),$iJava/javafmt)
	./apply_patches.sh

build-all-class-models-dry:
	sbt 'project generator' 'run "generate" \
		--models="usbase=fhir/spec/hl7.fhir.r4.examples/4.0.1/package/StructureDefinition-*;uscore=fhir/spec/hl7.fhir.us.core/3.1.0/package/StructureDefinition-*" \
		--javaPackageSuffix=_java \
		--moduleDependencies="usbase<uscore" \
		--dryRun'

build-all-class-models:
	sbt 'project generator' 'run "generate" \
		--models="usbase=fhir/hl7.fhir.r4.examples/StructureDefinition-*;uscore=fhir/hl7.fhir.us.core/StructureDefinition-*;ukcore=fhir/fhir.r4.ukcore.stu1/UKCore-*" \
		--javaPackageSuffix=_java \
		--moduleDependencies="usbase<uscore"'
	sbt scalafmtAll
	sbt $(foreach i,$(ALL_MODULES),$iJava/javafmt)
	./apply_patches.sh
	sbt $(foreach i,$(ALL_MODULES),+$i/scalafmtAll)
	sbt scalafmtAll

clean-target:
	rm -rf target/ */target

download-deps:
	sbt +macros/update +common/update $(foreach i,$(ALL_MODULES),+$i/update +$iJava/update) +fhirpath/update +protoshim/update +bench/update || true

clean-generated-scala:
	rm -rf $(foreach i,$(ALL_MODULES),$i/src/main/scala{-2,-3,}/com/babylonhealth/lit/$i/model)

clean-generated-java:
	rm -rf $(foreach i,$(ALL_MODULES),$i_java/src/main/java/com/babylonhealth/lit/$i_java/builders $i_java/src/main/java/com/babylonhealth/lit/$i_java/codes)

cycle: clean-generated-java clean-generated-scala build-all-class-models test

pull-stuff:
	rm -rf fhir && mkdir fhir
	npm --registry https://packages.simplifier.net install hl7.fhir.r4.core@4.0.1
	rm -rf generator/src/main/resources/searchParams && mkdir generator/src/main/resources/searchParams
	mv node_modules/hl7.fhir.r4.core/SearchParameter-* generator/src/main/resources/searchParams
	mv node_modules/hl7.fhir.r4.core fhir
	rm -rf node_modules package-lock.json
	cat generator/src/main/resources/searchParams/SearchParameter-* \
		| jq '{name: .name, expression: .expression, base: .base}' \
		| jq -s . \
		> generator/src/main/resources/searchParams.json
	rm -rf generator/src/main/resources/searchParams
	# more
	rm -rf fhir node_modules/hl7.fhir.r4.core node_modules/hl7.fhir.r4.examples node_modules/hl7.fhir.us.core && mkdir fhir
	npm --registry https://packages.simplifier.net install hl7.fhir.us.core@3.1.0
	npm --registry https://packages.simplifier.net install hl7.fhir.r4.examples@4.0.1
	npm --registry https://packages.simplifier.net install fhir.r4.ukcore.stu1@0.1.0
#	npm --registry https://packages.simplifier.net install hl7.fhir.core@4.0.1
	mv node_modules/hl7.fhir.r4.examples fhir
	mv node_modules/hl7.fhir.us.core fhir
	mv node_modules/hl7.fhir.r4.core fhir
	mv node_modules/fhir.r4.ukcore.stu1 fhir
	mkdir fhir/fhir.r4.ukcore.stu1/profiles
	mkdir fhir/fhir.r4.ukcore.stu1/valueSets
	for i in fhir/fhir.r4.ukcore.stu1/Extension-UKCore-*.json; do mv "$${i}" "$${i}.StructureDefinition.json"; done
	for i in fhir/fhir.r4.ukcore.stu1/UKCore-*.json; do mv "$${i}" "$${i}.StructureDefinition.json"; done
	for i in fhir/fhir.r4.ukcore.stu1/ValueSet-UKCore-*.json; do mv "$${i}" "$${i}.ValueSet.json"; done
	sed -i.bak 's/UKCore-VitalSignsObservationType/UKCore-ObservationType/g' fhir/fhir.r4.ukcore.stu1/UKCore-VitalSigns-Observation.json.StructureDefinition.json

find-weird-ones:
	@echo NO BASE:
	@cat generator/src/main/resources/searchParams.json | jq -r '.[] | select (.base == null) | .name' | sort | xargs | tr ' ' ,
	@echo
	@echo MORE THAN ONE BASE:
	@cat generator/src/main/resources/searchParams.json | jq '.[] | select(.base[1] != null) | .name' | sort | xargs | tr ' ' ,
	@echo
	@echo NO EXPRESSION:
	@cat generator/src/main/resources/searchParams.json | jq '.[] | select (.expression == null) | .name' | sort | xargs | tr ' ' ,

gen-uk-snapshots:
	docker run --rm -v $${PWD}/fhir/fhir.r4.ukcore.stu1:/gen -v $${PWD}/fhir/hl7.fhir.r4.core/:/hl7 $(HYDRA_DOCKER) snapshot -s /gen -h hl7
