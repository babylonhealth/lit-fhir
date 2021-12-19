# lit

Opinionated library for easily constructing v4.0.1 compatible FHIR resources.
Supports generating Scala and Java from FHIR structureDefinition and valueSet jsons, with _extremely early days and very tentative_ support for transforming from the model at [Google's open-sourced FHIR stuff](https://github.com/google/fhir). (this support basically just goes via json and is nice if you have compatability concerns or a need for protobuf, but otherwise is best avoided)

[About Lit](https://github.com/babylonhealth/lit-fhir/blob/master/docs/documentation.md)

[Examples](https://github.com/babylonhealth/lit-fhir/blob/master/docs/examples.md)

[![Build and run tests](https://github.com/babylonhealth/lit-fhir/actions/workflows/pr.yml/badge.svg)](https://github.com/babylonhealth/lit-fhir/actions/workflows/pr.yml)

---

## How do I get lit?

We're published on maven central. There are various libs availaible, and what you want or need will depend on your use case. Generally, you'll wan't the 'basics', which is availaible as
#### SBT
"com.babylonhealth.lit" %% "hl7" % "0.14.6"
#### Gradle
"com.babylonhealth.lit:hl7:0.14.6"
#### Other
Should be convertable if you know your dependency manager.

#### I want to know what the modules do

- `core`: The `hl7` module may be more or less that you need. If, for some reason, you love hl7's extension modelling, the minimal subset is available as "com.babylonhealth.lit" %% "core" % "0.14.6"
- `hl7`: the expected dependency
- `usbase`: Mostly extensions. Support for this appears nice, but has some performance implications. You may want it if you're dealing with 'meta' fhir
- `uscore`: Adds some useful stuff to the base for FHIR. You may very well want this dependency. Consider using `hl7` alone first -- check your business requirements.
- `coreJava`/`hl7Java`/`usbaseJava`/`uscoreJave`: Like their scala counterparts, but with some builder methods to make handling construction less painful, and some enum aliases to make construction of them have fewer `$` signs. There are some additional serde utils available in `LitUtils`
- `fhirpath`: A reasonably complete FHIR path interpreter
- `protoshim`: In case you want to convert between domain models and proto and trust us enough to make reat more efficient in the future. Very little attention has been paid to it so far...
- `macros`/`common`: It's extremely unlikely you'll want either of these in isolation. The macros module enables the the `with${FOO}`/`update${FOO}`/`with${FOO}IfExists` syntax for scala 2 dependencies (and transitively Java, which for the time being depenends on this because the functionality isn't AFAIK replicable in scala 3). The common module is a very small number of utility functions shared between the generator and the generated code, and arguably shoudldn't exist.


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

A tag of the form `\d+.\d+.\d+` will publish the generated modules with that semver
A tag of the form `g\d+.\d+.\d+(-\d+)?` will publish the generator module with that semver (and the common module, if not already released with that semver. For that reason, generator module should always be tagged with whatever version of the generated libs it currently depends on)


---

## Plans for the future

- Better support for protobuf models (current approach just round-trips through json, which is dog-slow)
- Support future versions of FHIR spec
- Better support for slices
- Better support for extensions
- Scala 3 support
- Support for typescript and python

---


## Maintainers

Hugh Simpson (hugh.simpson@babylonhealth.com)

Felix Chapman (felix.chapman@babylonhealth.com)

Greg McKay (gregory.mckay@babylonhealth.com)
