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

## Java interop

Most functionality of this library is available from Java without much hassle - however, there are some key differences in the approach:
 