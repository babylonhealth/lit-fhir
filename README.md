# lit

Opinionated experimental library for easily constructing v4.0.1 compatible FHIR resources. [About Lit](https://github.com/babylonhealth/lit-fhir/blob/master/docs/documentation.md)

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
A tag of the form `g\d+.\d+.\d+` will publish the generator module with that semver (and the common module, if not already released with that semver. For that reason, generator module should always be tagged with whatever version of the generated libs it currently depends on)


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
