# lit

Opinionated library for easily constructing v4.0.1 compatible FHIR resources.
Supports generating Scala and Java from FHIR structureDefinition and valueSet jsons, with _extremely naïve_ support for transforming from the model at [Google's open-sourced FHIR stuff](https://github.com/google/fhir). (this support basically just goes via json and is nice if you have compatability concerns or a need for protobuf, but otherwise is best avoided)

[About Lit](https://github.com/babylonhealth/lit-fhir/blob/master/docs/documentation.md)

[Examples](https://github.com/babylonhealth/lit-fhir/blob/master/docs/examples.md)

[![Build and run tests](https://github.com/babylonhealth/lit-fhir/actions/workflows/pr.yml/badge.svg)](https://github.com/babylonhealth/lit-fhir/actions/workflows/pr.yml)

---

## How do I get lit?

We're published on maven central. There are various libs availaible, and what you want or need will depend on your use case. Generally, you'll wan't the 'basics', which is availaible as
#### SBT
"com.babylonhealth.lit" %% "hl7" % "0.14.6"
#### Gradle
"com.babylonhealth.lit:hl7_2.13:0.14.6"
#### Other
Should be convertable if you know your dependency manager.

#### I want to know what the modules do

- `core`: The `hl7` module may be more or less that you need. If you want to use the spec's extension modelling, the minimal subset is available as "com.babylonhealth.lit" %% "core" % "0.14.6"
- `hl7`: the expected dependency
- `usbase`: Mostly extensions. Support for this appears nice, but has some performance implications. You may want it if you're dealing with 'meta' fhir
- `uscore`: Adds some useful stuff to the base for FHIR. You may very well want this dependency. Consider using `hl7` alone first -- check your business requirements.
- `coreJava`/`hl7Java`/`usbaseJava`/`uscoreJave`: Like their scala counterparts, but with some builder methods to make handling construction less painful, and some enum aliases to make construction of them have fewer `$` signs. There are some additional serde utils available in `LitUtils`
- `fhirpath`: A reasonably complete FHIR path interpreter
- `protoshim`: In case you want to convert between domain models and proto. Fairly experimental
- `macros`/`common`: It's extremely unlikely you'll want either of these in isolation. The macros module enables the the `with${FOO}`/`update${FOO}`/`with${FOO}IfExists` syntax for scala 2 dependencies (and transitively Java, which for the time being depenends on this because the functionality isn't AFAIK replicable in scala 3). The common module is a very small number of utility functions shared between the generator and the generated code, and arguably shoudldn't exist.
- `generator`: For when you have json representing your own profile definitions, and want to generate a class model along the same lines as the pre-rolled modules here. Currently requires that you also specify an explicit dependency on the 'common' module because of some shenanigans around published versions.

---

## Bugs, questions or suggestions?

Please make a new issue! 

---

## Building and testing

First you may want to generate the classes:

```bash
make build-all-class-models
```

Then you can run the tests:

```
make test
```

---

## Releasing

- We release via github actions, and all releases should be basically traceable. The first couple of versions are a bit wonky because we were figuring out the release process, but everything public was ultimately released via github actions.
---

## Plans for the future

- Better support for protobuf models (current approach just round-trips through json, which is dog-slow)
- Support future versions of FHIR spec (In progress)
- Better support for slices
- Better support for extensions (Arguably complete)
- ~Scala 3 support~ (Done)
- Support for typescript and python (Rust now more interesting)

---


## Maintainers

Hugh Simpson (hugh.simpson@babylonhealth.com)

Felix Chapman (felix.chapman@babylonhealth.com)

Greg McKay (gregory.mckay@babylonhealth.com)
