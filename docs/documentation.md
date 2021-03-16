# Lit Documentation

## Overview 
Lit provides a class model that as much as possible represents the relationships in structure definitions - for example:
- if structure definition A is a baseDefinition for structure definition B, then the class B will inherit from class A
- if a value set is bound to a particular field, its enum representation will be shared with any other field bound to the same value set
- 'choice[x]' fields are represented (as a best effort) by a special kind of union type called ‘Choice’
- Required fields are required by the class constructors. Nonempty fields are required to be non-empty (with some exceptions -- see slices)
- subtyped primitives are represented that way -- e.g. the definition of `PositiveInt` is `type PositiveInt <: Int`

### Choices
FHIR defines various fields which can be one of many values (e.g. a `value[x]` that could be a `valueString` or a `valueInteger`). These are represented in Lit with a combination of a union type (represented with `\/` -- e.g. `Int \/ Boolean \/ String`) and a `Choice[_]` type wrapper to avoid having to reify these union types at runtime -- so a field `value[x]` which is defined in the corresponding structure definition as being either an `Int` or a `String` would be represented as a field `value: Choice[Int \/ String]`

#### Type safety
Choice fields have a few convenience methods to make working with them ~~a joy~~ possible:
- a type safe constructor `choice` that produces a choice from one of the legal subtypes (e.g. `choice(3)` where type inference expects a `Choice[Int \/ String]` will work. `choice(3.2)` would not compile)
- a typesafe extractor method `as[T]` that returns an `Option[T]` (e.g. `def get(c: Choice[Int \/ String]): Option[Int] = c.as[Int]` will return a `Some[Int]` iff the underlying value of the choice is an Int -- this preserves subtyping, so `c.as[PositiveInt]` will only return a Some if the underlying value _is_ a `PoisitiveInt`. `(_: Choice[Int \/ String]).as[Double]` etc will not compile.
- a typesafe `mapValue` method (for mapping from one valid subtype of the Choice to another) (see tests for example usage)
- a typesafe `fold` method (for producing a target value of a single type from any given value held by the choice) (see tests for example usage)

All of these methods are enabled by `import com.babylonhealth.lit.core.ChoiceImplicits._` or inheriting from the `ChoiceImplicits` trait

### Collections
Lit has its own covariant collection type - `LitSeq` - for a) improved scala-java interop, and b) to allow us some limited type-level control of cardinality. So far this is expressed with a `NonEmptyLitSeq` where `NonEmptyLitSeq[T] <: LitSeq[T]`. Certain operations (e.g. `+:` or `:+` on any `LitSeq`, or `.map` on a `NonEmptyLitSeq`) will allow us to infer that the return type is a `NonEmptyLitSeq` at the type level. To be explicit where the typer has been unable to infer that a collection is nonEmpty you can call `.asNonEmpty`. This method will throw if the collection is empty. 

### Modifications
Lit objects are immutable. To make it possible to work with them, there are copy methods defined for all fields: for example, if you have an optional field 'url' of type String, there will be methods `withUrl(url: Option[String])`, `updateUrl(fn: Option[String] => Option[String])` and `updateUrlIfExists(fn: String => String)`
Where a field is optional in a parent, but preserved in a child, access to both methods is available, but the parent method will upcast the return type -- e.g if url is optional in `A` but not in `B` and `B <: A`, then for 
`val b: B, b.withUrl((url: String))` or `b.updateUrl((_: String).reverse)` will return a `B`, but `b.withUrl(Some(url: String))` or `b.updateUrl((b: Option[String]) => None)` will return an `A`

### Field access
To avoid breaking the subclassing relationship, if `B <: A` and url is optional in `A`, then for a `val b: B`, `b.url` must return an `Option[String]`, even if it's mandatory in `B` -- to get back a `String`, the idiomatic manner would be to call the extractor in the companion object (i.e. `B.extractUrl(b: B)` will return a `String`)

### Subclassing
Subclasses may also restrict the types of a Choice, as well as the cardinality. The subtyping relationship is sadly not valid for choice restrictions (yet?).

### Marshaller and unmarshaller

To marshall/unmarshall a json object, we've provided an encoder and decoder for usage with the circe library

```
import com.babylonhealth.lit.core.serdes.{ objectEncoder, objectDecoder }
```

### Example

```
import io.circe.parser.decode

import com.babylonhealth.lit.core.serdes.objectDecoder
import com.babylonhealth.lit.core.model.Resource

val resource: Either[circe.Error, Resource] = decode[Resource](jsonString)
```

You can also use this:

```
import com.babylonhealth.lit.core.serdes.decodeFHIRObject
import com.babylonhealth.lit.core.model.Resource

val resource: Try[Resource] = decodeFHIRObject(Resource, jsonString)
```

To encode:
```
import io.circe.syntax._

import com.babylonhealth.lit.core.serdes.objectEncoder

val jsonString: String = resource.asJson.nospaces
```

### Encoding params

There are some parameters that can be set to configure decoding. The defaults can be changed at the application level (by setting env vars) or at the programmatic level, by bringing at implicit `DecoderParams` into scope:
```
implicit val params: DecoderParams = DecoderParams(flexibleCardinality = true)
val decoded                        = decode[Us_core_observation_lab](bad2)
```

The existing params, env vars and defaults are:

    # Skip over resources in a bundle that can't be decoded
    tolerantBundleDecoding	TOLERANT_BUNDLE_DECODING	false
    # If a record cannot be decoded according to its meta.profile, attempt to fallback to resourceType decoding
    tolerateProfileErrors	LIT_TOLERATE_PROFILE_ERRORS	false
    # Tolerate seeing an object where the FHIR spec says we should see an array, treating it as a singleton array
    flexibleCardinality	LIT_FLEXIBLE_CARDINALITY	false
    # Parse _foo: { "extension": [], "id": .. } elements for primitives with extensions or ids
    decodePrimitiveExtensions	LIT_DECODE_PRIMITIVE_EXTENSIONS	true
    # If a primitive field is missing, but there's an element definition for that field, attempt to synthesise a value from extensions. Only supports http://hl7.org/fhir/StructureDefinition/structuredefinition-json-type
    createPhantomValues	LIT_CREATE_PHANTOM_VALUES	true
    # If false, we throw an error when decoding a json with unexpected fields
    ignoreUnknownFields	LIT_IGNORE_UNKNOWN_FIELDS_IN_JSON	true
    # Log a warning if meta.profile is set but no matching classes are found
    logOnBadProfile	LIT_LOG_ON_BAD_PROFILE	true

### Slices

FHIR slices are not yet supported. Consequently, we miss some valid restrictions at the moment -- for example, a Us_core_observation_lab _must_ have a `category` with system = http://terminology.hl7.org/CodeSystem/observation-category and code = laboratory -- however the class in our current model does not enforce that the category field contains an element that matches the pattern from the profile, and requires only that the collection is non-empty

### Extensions

Extensions are not currently decoded to an appropriate extension class, even when one exists. We hope to add an extension registry that will automagically decode an extension with the right url and value type to the appropriate extension soon!

### Transformational methods

Not all transformations can be ergonomically represented with the updateFoo or withFoo methods. For example, we may want to transform a FHIR class by converting all instances of a particular Coding to a different one. To make this less painful, we have some traversal mechanisms on the base `FHIRObject` class. To whit: 
- `nodalMap` traverses the FHIR object, looking for matching nodes, and applies the provided function to anything of the right type. It does not recurse beyond a match by default -- if you want further recursion, the provided function will have to include an explicit recursive call to `nodalMap` 
  ```
   foo.nodalMap[Coding](classOf, _.updateCodeIfExists(c => if (c == "badOldEncoding") "updatedCode" else c))
  ```
- `>>` is like `nodalMap` but can match on specific subtypes, since it operates using the type tag rather than the java class. It consequently takes an implicit arg rather than an explicit class arg and is difficult to use from Java 
  ```
   foo.>>[Coding](_.updateCodeIfExists(c => if (c == "badOldEncoding") "updatedCode" else c))
  ```
- `>>=` is a generalisation of `>>` for cats fans, taking an f: T => M[T] for some Monad M, e.g.
  ```
   def transform(t: Coding): IO[Coding] = doALookup(t)
   val foo: Bundle = ...
   val res: IO[Bundle] = foo >>= (transform(_))
  ```

### Extraction methods

Similarly to transformations, we've provided some traversing extraction methods for e.g. pulling all Coding values out of an object 
- `nodalGetByClass` traverses the FHIR object, looking for matching nodes. e.g
 `foo.nodalGetByClass[Coding](classOf)`
- `^^^` is like `nodalGetByClass` but can match on specific subtypes, since it operates using the type tag rather than the java class. e.g.
 `foo.^^^[Coding]`
- `nodalExtract` and `^^` are similar, but take an addition argument for transforming the discovered nodes. e.g.
 ```
   sampleResource.nodalExtract[BUNDLE_TYPE, String](classOf, _.entryName)
   sampleResource.^^[BUNDLE_TYPE, String](_.entryName)
 ```

### Primitives

For primitive subtypes such as `type PositiveInt <: Int`, coercion from the supertype primitive is performed via an implicit conversion with guards (somtimes) ((so far checks on conversion are performed only for PositiveInt and UnsignedInt. We may add regex validation for stringy primitive subtypes at some point)). This is enabled by importing `com.babylonhealth.lit.core._`. Be aware that it can potentially cause runtime exceptions if you do not perform sanity checks on the input.

Extensions and ids on primitive fields are held on the parent class, rather than the field itself. So, suppose we have a Cholesterol object `val chol = Cholesterol(...,effective = Some(choice(FHIRDateTime.now)),...)` - the effective field will be serialised as `"effectiveDateTime" : "..."` and the id or extensions would be serialised in a companion field as `"_effectiveDateTime" : {"id":"...", "extension": [...]}"` where both fields are optional. We would access them in code similarly by reaching to the parent object - the methods for this are: 
- `getIds` -- e.g. `chol.getIds(_.effective)` (returns an `Option[String]`)
- `setIds` -- e.g. `chol.setIds(_.effective)(Some("new-id"))`
- `updateIds` -- e.g. `chol.updateIds(_.effective)(_.map(_.reverse))`
- `getExtensions` -- e.g. `chol.getExtensions(_.effective)` (returns a `LitSeq[Extension]`)
- `setExtensions` -- e.g. `chol.setExtensions(_.effective)(LitSeq(myExtension))`
- `updateExtensions` -- e.g. `chol.updateExtensions(_.effective)(_.map(modifyExtension))`

### Warts with no good workaround (yet?)

IntelliJ no longer correctly finds implicit witnesses for `choice(..)` construction since we moved from scala's TypeTag to izumi's LightTypeTag. Type inference from scalac still works, but this can be a source of annoyance nonetheless.

## Java interop

Most functionality of this library is available from Java without much hassle - however, there are some key differences in the approach:

### Dependencies

There are corresponding dependencies that're specific to Java to enable a nicer experience. These are published as ${module}java, and depend on the scala module, as well as any parent java modules - so the dependency for hl7 java in gradle is "com.babylonhealth.lit:hl7java:$litVersion", and depends on "com.babylonhealth.lit:hl7:$litVersion" and "com.babylonhealth.lit:corejava:$litVersion"

### Enumerations for value sets

The enumeratum objects in Scala can't be easily referenced by Java without nasty `.FOO$.MODULE$` syntax, so we provide some static aliases. i.e. instead of
```
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS;
...
var foo = OBSERVATION_STATUS.AMENDED$.MODULE$;
``` 
you can instead use
```
import com.babylonhealth.lit.hl7_java.codes.ObservationStatus;
...
var foo = ObservationStatus.AMENDED;
``` 

### Classes and builders

Due to the lack of default arguments in Java, classes have builders defined in the companion java module. Non-optional arguments are required in the builder contructor, and optional arguments can be passed via methods on the constructor. So to build an Observation, you would do something like:
```
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.codes.ObservationStatus;
...
var observation = new ObservationBuilder(
                new CodeableConceptBuilder().withText("code for observation").build(),
                ObservationStatus.UNKNOWN)
            .withIssued(issued)
            .withValue(new QuantityBuilder().build())
            .withCategory(
                new CodeableConceptBuilder().withText("Cat 1").build(),
                new CodeableConceptBuilder().withText("Cat 2").build())
            .build();
```

### Encoding and decoding

The corejava module contains a `LitUtils` class with some convenience methods since `circe` is an implicit-dependent serde lib and can't be trivially used from Java.
```
import com.babylonhealth.lit.core_java.LitUtils;
...
// Decode
Resource rsc = LitUtils.decodeResource(json);
// Decode with specific target type
Observation obs = LitUtils.decode(Observation.class, json);
// Encode
String encoded = LitUtils.encode(obs);
// Decode with local params
DecoderParams decoderParams =
      new DecoderParams(
          Config.tolerantBundleDecoding(),
          Config.tolerateProfileErrors(),
          Config.flexibleCardinality(),
          Config.decodePrimitiveExtensions(),
          Config.createPhantomValues(),
          Config.ignoreUnknownFields(),
          Config.logOnBadProfile());
Observation rsc = LitUtils.decodeWithParams(Observation.class, json, decoderParams);
```

### Choice construction
Generally choices are not directly constructed in Java, and are instead the raw values are fed directly into the builders.
Because Java doesn't have Scala's notion of witness implicits, we cannot infer typesafety of choice construction at compile time - a choice constructed with an invalid value with throw at runtime. Adding more typesafety to the Java builders via more codegen to create disambiguation targets is under consideration
Since we subtype primitives in our representation of certain FHIR types, we attempt to disambiguate based on the runtime type and there are occasional ambiguities. To pick the desired choice type in such instances you will have to use the `ParamDistinguisher` class to explicitly specify the desired type when passing the value to the builder. e.g `ParamDistinguisher.choose(42, "PositiveInt")`. This is fairly rare in practice, and manifests more often in optional fields. In that case, we generate two methods on the builder - one that takes a suffix for ambiguous runtime types, and one that does not.
Examples: 
```
// optional non-ambiguous param
new ObservationBuilder(new CodeableConceptBuilder().withText("code for observation").build(), ObservationStatus.UNKNOWN)
    .withEffective(FHIRDateTime.now()) // this one is the choice field
    .build();
// optional ambiguous param
new ValueSet_Expansion_ParameterBuilder("foo").withValue("Code", "1234567").build();
// required ambiguous param
new Contract_Term_Offer_AnswerBuilder(ParamDistinguisher.choose("http://foo.bar", "Uri")).build();
```

### Choice extraction
To get the value within a choice, whereas in scala you would use `c.as[FHIRDateTime]` (for example), in java we would call `c.valueToClass(FHIRDateTime.class)`. This will extract any value with a matching runtime class, which can prove in some instances to be too liberal. The workaround in such cases is to perform a check on the suffix -- e.g. `c.suffix().equals("PositiveInt") ? (Integer) c.value() : null`

### Other warts with no good workaround (yet?)

Structural elements for profiles are defined within the companion object, and scalac munges the names for this interestingly... an entry for a bundle has type `Bundle.Entry` in both Java and Scala, however once you get beyond a single level of nesting, this changes, so the 'response' field for a Bundle.entry has type `Bundle.Entry.Response` in Scala, but `Bundle$Entry$Response` in Java.
If you're using intelliJ the highlighting is misleading here, since it will inform you that `Bundle$Entry$Response` doesn't exist and `Bundle.Entry.Response` is the correct type. This is untrue, do not be misled. To avoid highlighting errors when using lit from Java, prefer `var foo` over `Bundle$Entry$Response foo` where possible. For function return or argument types, there's no really nice solution... 

## Generation

Lit can be used to generate new class models from your existing fhir profiles. Simply specify the module name and the location of the profiles in the args for the generator, when running it. Module dependencies can also be specified, in case your profiles depend on ones defined outside of the core and hl7 modules. e.g.
```
'project generator' 'run \
    "generate" \
    --models="usbase=fhir/spec/hl7.fhir.r4.examples/4.0.1/package/StructureDefinition-*;uscore=fhir/spec/hl7.fhir.us.core/3.1.0/package/StructureDefinition-*" \
    --javaPackageSuffix=_java \
    --moduleDependencies="usbase<uscore"
```
