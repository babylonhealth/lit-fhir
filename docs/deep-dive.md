## Lit: Yet another FHIR library

Want an intro? Check out [the article](https://medium.com/@alexmorley/lit-yet-another-fhir-library-dfe663b36c14) on Medium.

**What does Lit look like?**

Here is a function to construct a FHIR BMI object, given a timestamp at which the observation was take, a double (representing the measured BMI) and a patientId (for the patient to which the observation applies):

```scala
def mkBmi(ts: ZonedDateTime, value: Double, patientId: String): Bmi =
 Bmi(
   identifier = LitSeq(Identifier(system = Some("http://system.foo/bar"), value = Some("123"))),
   status = OBSERVATION_STATUS.FINAL,
   subject = Reference(reference = Some(s"Patient/$patientId")),
   category = LitSeq(
     CodeableConcept(coding = LitSeq(
       Coding(system = Some("http://terminology.hl7.org/CodeSystem/observation-category"), code = Some("vital-signs"))))),
   value =
     Quantity(system = Some("http://unitsofmeasure.org"), code = Some("kg/m2"), unit = Some("bmi"), value = Some(value)),
   effective = choose(FHIRDateTime(dateTime = ts)),
   code = CodeableConcept(coding = LitSeq(Coding(system = Some("http://loinc.org"), code = Some("39156-5"))))
 )
```

Extracting the Quantity value from a BMI

```scala
val value: Option[BigDecimal] = Bmi.extractValue(bmi).value
```

Extracting the Quantity value from a generic Observation if and only if the value is, in fact, a Quantity

```scala
val value: Option[BigDecimal] = obs.value.flatMap(_.as[Quantity]).flatMap(_.value)
```

**Simple**

Simplicity for us boiled down to three things: terseness, consistency and the fundamental model. Having calls to boilerplate methods all over the place can make it gratuitously difficult to follow what a piece of code is doing - and having to *write out* those calls slows us down when we’re trying to make things happen. We want to be concerned about the business logic, not the syntax. From that same motivation, we wanted our API to be *consistent* (similar things should look similar and behave similarly), and to represent the structures defined in FHIR with the most natural unit of structure in the JVM - which is to say, the lowly class. The FHIR spec defines a hierarchy, however only single inheritance is permitted, so this seemed like a perfect fit. We also wanted our primitives to actually *be* primitive - where the spec says that there should be a boolean field active on a Patient, we want ourPatient.active to return a boolean. Of course, the spec doesn’t actually say that. The spec says that there’s an *optional* field, and to encode this at the type level, we [actually](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[hold](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[that](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[variable](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[as](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[an](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[Option](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[\[](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[Boolean](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)[\]](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/main/scala/com/babylonhealth/lit/hl7/model/Patient.scala#L607)...

How does this differ from existing implementations? Well the two main ones to consider on the JVM are the HAPI and the FHIRProto implementations. In the interests of selecting the more compelling example, here’s what the FHIRProto implementation of the same mkBmi function we saw above would look like (we’ll come back to HAPI later):

```scala
def mkBMI(ts: ZonedDateTime, value: Double, patientId: String): Observation = Observation
 .newBuilder()
 .setMeta(Meta
   .newBuilder()
   .addProfile(Canonical.newBuilder().setValue("http://hl7.org/fhir/StructureDefinition/bmi")))
 .addIdentifier(
   Identifier
     .newBuilder()
     .setSystem(Uri.newBuilder().setValue("http://system.foo/bar"))
     .setValue(String.newBuilder.setValue("123"))
 )
 .setStatus(Observation.StatusCode.newBuilder().setValue(ObservationStatusCode.Value.FINAL))
 .setSubject(Reference.newBuilder().setPatientId(ReferenceId.newBuilder().setValue(patientId)))
 .addCategory(
   CodeableConcept
     .newBuilder()
     .addCoding(
       Coding
         .newBuilder()
         .setSystem(Uri.newBuilder().setValue("http://terminology.hl7.org/CodeSystem/observation-category"))
         .setCode(Code.newBuilder().setValue("vital-signs"))))
 .setValue(
   Observation.ValueX
     .newBuilder()
     .setQuantity(
       Quantity
         .newBuilder()
         .setSystem(Uri.newBuilder().setValue("http://unitsofmeasure.org"))
         .setCode(Code.newBuilder().setValue("kg/m2"))
         .setUnit(String.newBuilder().setValue("bmi"))
         .setValue(Decimal.newBuilder().setValue(value.toString))))
 .setEffective(
   Observation.EffectiveX
     .newBuilder()
     .setDateTime(
       DateTime
         .newBuilder()
         .setValueUs(ts.toInstant.toEpochMilli * 1000)
         .setTimezone(ts.getZone.toString)
         .setPrecision(Precision.MILLISECOND)))
 .setCode(
   CodeableConcept
     .newBuilder()
     .addCoding(
       Coding
         .newBuilder()
         .setSystem(Uri.newBuilder().setValue("http://loinc.org"))
         .setCode(Code.newBuilder().setValue("39156-5"))))
 .build()
```

This is a little more verbose than we would like our object construction to be. There’s also one little trick that you might not have spotted: because our BMI representation is generated from a specific FHIR profile, the corresponding url is already inserted by default into the meta.profile field, so there’s no need for us to explicitly specify it (although, for example if we were operating with a subprofile of the BMI structure, we would be able to explicitly override that profile if we so chose).

**Well typed**

I, like so many other people who’ve consigned themselves to a life of ~~programming~~ software engineering, spend a lot of time inside my IDE. It’s where I write a lot of my code. And IDEs are really rather smart (and have been for a long time) -- if you try to call a method without the right number of parameters, they’ll complain. If you’re in a typed language (or a language with type annotations - so, nearly every language these days...) they’ll tell you off if your parameters are the wrong type. We wanted to leverage that as much as possible:

- Constructors: Rather than finding out at runtime when calling some validation function (or, worse, when sending to some validation server) that a required field is missing, or a non-empty list is empty, we wanted to catch such errors at compile time. So all of our constructors mandate the presence of non-optional fields. In Scala, this is enforced by having default values for all optional fields, but only those fields. In Java, where we have some additional Builder objects, this is enforced by a Builder’s constructor taking the required fields, and optional fields being provided by the methods on the constructed Builder object. As a consequence of this, because IDEs are so very smart, we usually see immediately when writing the code if we’ve forgotten to source any value that’s required for valid FHIR.
- Collections: We ended up with [our](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[own](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[covariant](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[collection](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala)[implementation](https://github.com/babylonhealth/lit-fhir/blob/master/core/src/main/scala/com/babylonhealth/lit/core/Sequences.scala) with LitSeq[+T] and NonEmptyLitSeq[+T] extends LitSeq[T], because we *really* wanted to catch that distinction between a potentially-empty and a non-empty list at this level (and we wanted this to be usable idiomatically in both Java and Scala, so there weren’t a lot of existing implementations that satisfied us there).
- Choices: FHIR also has the notion of ‘choice’ fields, which can be one of a few different types (precisely *which* types depends on the field in question). Scala implicits gave us a way to enforce at compile time that the foo in a choice(foo) had one of the legal types for a specific field without having to provide multiple constructors for every object with such a field - essentially giving us the functionality of a union type. Sadly, this particular piece of wizardry doesn’t work in Java, and we have to take that multiple constructor path in a few places
- Subtypes: Another one that helps more in Scala than in Java, just because of the respective feature set of the languages. Having an additional wrapper around all Integer primitives just because there’s also a PositiveInt defined in the FHIR spec would’ve violated out design goal of ergonomics, so the relation between those two concepts is represented as type PositiveInt <: Integer - and the semantic implication there is validated at deserialisation time, or, if you’re in Scala, at construction time ([obviously](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[this](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[has](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[to](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[be](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[a](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[runtime](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[check](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[when](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[you](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[’](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[re](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[dealing](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[with](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[non](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[-](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[constant](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[variables](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26)[…](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/core/src/main/scala/com/babylonhealth/lit/core/package.scala#L26))

To motivate us a bit more, here’s the HAPI version of the mkBmi function:

```scala
def mkBmi(ts: ZonedDateTime, value: Double, patientId: String): Observation = {
 val obs = new Observation()
   .addIdentifier(new Identifier().setSystem("http://system.foo/bar").setValue("123"))
   .setStatus(ObservationStatus.FINAL)
   .setSubject(new Reference(s"Patient/$patientId"))
   .addCategory(new CodeableConcept(new Coding()
     .setSystem("http://terminology.hl7.org/CodeSystem/observation-category")
     .setCode("vital-signs")))
   .setValue(new Quantity().setSystem("http://unitsofmeasure.org").setCode("kg/m2").setUnit("bmi").setValue(value))
   .setEffective(new DateTimeType(Date.from(ts.toInstant), TemporalPrecisionEnum.MILLI))
   .setCode(new CodeableConcept(new Coding().setSystem("http://loinc.org").setCode("39156-5")))
 obs.setMeta(new Meta().addProfile("http://hl7.org/fhir/StructureDefinition/bmi"))
 obs
}
```

This looks alright in terms of terseness, right? It’s about the same size as the Lit example, and much shorter than the FHIRProto one. But if we look into it we can see some inconsistencies:

- `setMeta` doesn’t follow the builder pattern established elsewhere. This is because in HAPI that method, even called on an Observation, will return a generic Resource (the other option here would’ve been to cast the result)
- Some of the classes have constructors, some don’t. Some *do* have constructors but we don’t use them in the above code because they include non-required fields that we don’t want to use in our example.

So far this is maybe a tiny bit warty, but not really compelling. It gets more interesting when we look at the value field in particular. Here’s what the IDE has to tell us about the possible values we can pass to the setValue method in the HAPI constructor:

<img width="264" alt="type-lit" src="https://user-images.githubusercontent.com/13655521/231153516-1aa4b16b-d772-4c8c-a0fe-62ca104419e6.png">

And here’s what it tells us if we try to put a DateTime instead of a Quantity in that field:

<img width="664" alt="datetime-quantity-lit" src="https://user-images.githubusercontent.com/13655521/231153540-8cba98c3-c636-4e08-8ce8-6f314ee74a41.png">

As you can see, the library is completely happy with it (and this will also compile and run). Now, to be fair, we’re using the generic Observation instance here, and a DateTime is actually a valid value. So what if we put in an Address, instead? That seems more fair - it’s invalid for the underlying Observation type. Well, it turns out that this will also compile. And run. And eventually throw a runtime validation error (and all of this behaviour is rather implied when we look at that initial type hint: all the library is telling us is that the field should be a Type, which is to say, one of the 50 types that the FHIR spec permits in *choices in general* - even though the type of this field is much more constrained). So one nice thing about Lit is that it’s removed this particular source of error: since the profile constrains the value to a Quantity, and requires that it be present, that’s exactly the set of constraints we’re presented with in our class model. The FHIRProto library, as we’d suspect from the fact that the constructor requires an Observation.ValueX, *does* perform the compile-time type validation we’d hope for (at least at the level of Observation, if not at the more fine-grained level of BMI), but it is, of course, a much more verbose API.

So that’s constructors. What about collections? The profile for BMI requires that at least one category element is present. As you might expect, either of the HAPI and FHIRProto libs will happily compile and run even if we don’t pass it a category - it’s not required for a generic Observation after all (although neither library enforces required fields are present in general, so even if the underlying field were nonempty, neither would complain). But doesn’t this apply to Lit too? What happens if we change category = LitSeq(CodeableConcept(...)) to category = LitSeq()? It looks like that would compile just fine, too, doesn’t it?

<img width="437" alt="type-mismatch-lit" src="https://user-images.githubusercontent.com/13655521/231153610-e0400800-7d7d-471d-bacd-7b64623844d6.png">

But, in fact, it does not. There’s a little trick in the LitSeq constructor, so that if one or more entries is passed, we build the aforementioned NonEmptyLitSeq instead of the more general LitSeq. This means that you very rarely (if ever) need to explicitly refer to the non-empty subtype, and is what permits our initial example to work.

So, constructors and collections are (to some degree) more helpful than in the other two libraries we have under consideration. What about when we’re not able to exclude all other possible types, and have to work directly with a Choice that can be one of two or more options? We have one of these in our example, and it’s the effective field which, for a BMI observation, can take either a Period or a DateTime. Here’s how it looks if we try to use an address instead:


<img width="437" alt="period-address-lit" src="https://user-images.githubusercontent.com/13655521/231153786-caf0d3a3-02c0-4b18-9361-6f536a8f18ba.png">


We should be able to do a bit better here, and have the IDE/compile explicitly tell us that we’re missing a witness for the underlying type of FHIRDateTime \/ Period but that is sadly something we haven’t figured out how to render at present - even the compiler error is Cannot prove that com.babylonhealth.lit.core.model.Address is a viable type for union com.babylonhealth.lit.hl7.UnionAliases.Union\_0934386166, whereas ideally we would want that union type to be dealiased before being displayed. Nonetheless, the essential information that *something is wrong* is being propagated directly to the developer as they work, and the underlying required type is discoverable with a few clicks through the source code.

Now we’ve gone down into some detail here, but the primary difference between Lit and both of the other two libraries is simply this: neither of those libraries will refuse to deal with incomplete (that is, syntactically invalid) objects *at any point* - they will serialize, deserialize, create and mutate objects that lack required fields quite happily. And this is something that might not outrage us at all, if we remember that with both libraries we’re working in the world of mutability - and with the implication that, at any time, an object may be only partially constructed. This is, however, behaviour that’s contrary to the design choices that we were making with our own offering.


**Immutable**

Enforcing constraints in a constructor is no good if you can then go on to change the underlying instances - but there are other reasons why immutability can be safer: using the hashcode of an object for any reason (such as putting it into a HashSet) can have surprising results if you mutate the underlying data; concurrency can present some weird and wonderful surprises if you attempt to parallelise logically-independent processing steps; creating multiple similar objects requires you to be very careful (the less about clone() the better); there’s a certain peace of mind that comes from knowing that, whatever else you got wrong in your code, at least the input to a function is still the same input you got originally. This does provide some additional design constraints - in order to work conveniently with immutable objects, we really needed to have the facility to easily create copies with arbitrary modifications. And if we wanted that to be remotely efficient, we needed to try to avoid runtime reflection as much as possible. We’re fairly pleased with [how](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85)[that](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85)[turned](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85)[out](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/FauxLensTest.scala#L81..L85).

Creating an updated version of a Bundle, by setting all the subject of all contained Observations resources to some prefixed form of their id and subsequently deleting the id (one must imagine that we’re receiving quite bad data)

```scala
val modified = bundle.updateAll(_.entry)(_.updateIfExists(_.resource) {
  case o: Observation =>
    o.updateIfExists(_.subject)(s => 
      s.set(_.reference)(Some(s"Patient/${s.id.get}")).set(_.id)(None))
  case x => x
})
```


**Generated and extensible**

So the generation templates are in scala.

In theory, these same generation templates could be used to generate kotlin, python or TS, right ? Doesn't matter that the engine used to generate it is scala, am I thinking correctly?

FHIR is a *big* spec. Hand-rolling the class model would be extremely painful - and making changes to that model would be such an epic task that it would likely put you off ever changing anything. Fortunately, FHIR is defined by a machine-readable specification (naturally, this specification is written in FHIR). So one of the very first goals of this project, once we’d got far enough with a small hand-rolled subset of FHIR, was to bootstrap itself - permitting it to read the FHIR that defined the FHIR model, and generate the class models that we wanted by processing these representations.

But more than ‘big’, it’s also an *extensible* spec, and we at Babylon have some internal profiles, which define some additional restrictions on various structures. We wanted to be able to generate a code model of these restricted subtypes just as well as for the top-level definitions. This functionality is demonstrated in the public offering by the inclusion of the [FHIR](http://hl7.org/fhir/us/core/)[ ](http://hl7.org/fhir/us/core/)[US](http://hl7.org/fhir/us/core/)[ ](http://hl7.org/fhir/us/core/)[core](http://hl7.org/fhir/us/core/) structures into the base repo (we saw this earlier with the BMI example, which comes from that same spec).

We all have dreams, and we have the dream to one day provide implementations for other programming languages (Python? Typescript?). Initially this was another motivation for being able to generate the library; however, for the time being, that remains to be implemented...


**Metamodel**

Most of the time, when dealing with data, you’re really dealing with a piece of data; you can inspect the fields of the structure, and manipulate it accordingly. But you’re not always in that position - for example, if you’re programmatically instantiating a DB schema, generating data for a specs test, or defining the documentation for a REST endpoint. We wanted to be able to introspect with minimal fuss on the types themselves, and not just the instances of these types, to enable us to perform such operations.

Selecting the names of all fields required for a valid StructureDefinition

```scala
 def filterRequired(s: Seq[FHIRComponentFieldMeta[_]]): Seq[FHIRComponentFieldMeta[_]] =
   s.filter { f =>
     // f is not an Option field
     !(f.tt.tag <:< LTT[Option[_]]) &&
     // and if it _is_ a listy field, it's non-empty
     (!(f.tt.tag <:< LTT[LitSeq[_]]) || f.tt.tag <:< LTT[NonEmptyLitSeq[_]])  }
  val requiredStructureDefinitionFields: Seq[String] =
    filterRequired(StructureDefinition.fieldsMeta).map(_.name)
```

**Transformation and extraction**

Sometimes, when you’re working with data, you have to modify (or inspect) something that’s deeply nested. *Sometimes*, especially when you’re working with heterogeneous and recursive data structures, you have to modify something and you *don’t even know where it is*. We’ve certainly hit those use cases here. Lit incorporates a few powerful methods on its representations to enable these high-level operations in a [terse](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19)[and](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19)[ergonomic](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19)[ ](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19)[way](https://github.com/babylonhealth/lit-fhir/blob/4c24d9409b0f49294a1a1d7c01e500e0975b2ae6/hl7/src/test/scala/com/babylonhealth/lit/hl7/MutationTest.scala#L19).

Transforming all Coding objects with a particular system and code to a ‘corrected’ version

```scala
def fixBadCode[T <: Resource](r: T): T = r.nodalMap[Coding](
  classOf,
  coding =>
    coding.updateIfExists(_.code)(c =>
      if (coding.system.contains("targetSystem") && c == "badCode") "replacementCode" else c))
```

Extract all Coding objects from a resource

```scala
def extractAllCodings[T <: Resource](r: T): LitSeq[Coding] = r.nodalGetByClass(classOf[Coding])
```

Anyway of getting some numbers here? In comparison to HAPI for example?

Could link to the CI performance regression tests here


**Performance**

Performance is not really the primary concern in this domain as much as in some others - we’re not doing high frequency trading here - but it is *a* concern. The end user experience of both our patients and our clinicians relies on us being able to send, receive and process data at sufficient pace. We don’t want to be an order of magnitude slower than other implementations, or the use case for our library becomes much less compelling. To that end, we have [incorporated](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[automated](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[performance](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[regression](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[ ](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala)[testing](https://github.com/babylonhealth/lit-fhir/blob/master/bench/src/test/scala/com/babylonhealth/lit/bench/RegressionBenchmark.scala) into the development cycle of this library since the very early days (and performance in that time has gone from ‘literally so slow we can’t really use it’ to ‘probably fast enough’ to ‘about the same as other implementations’… one day, perhaps, we shall be truly fast)

**Wait, what was that thing you said earlier? About the FHIRPath?**

FHIR defines an extraction language (FHIRPath) for traversing and extracting data. We’ve implemented a fairly significant chunk of it, although we’ve found a few surprises when attempting to implement the official test suite (we struggled to understand why 3.14159.round(3) = 2 should evaluate to true, for example, and that test case doesn’t pass). There are some aspects of the DSL that struck us as quite esoteric and which would’ve required some significant implementation effort which we’ve eschewed (the semantics of $this, for example, are not supported). We also went over-and-above, in some other regards; whilst FHIRPath parsing and execution is implicitly a dynamic operation (with all the associated overhead) we also bake in some code-generation functionality, to the extent that from the expression

```
QuestionnaireResponse.item.where(hasExtension('foo')).answer.value.ofType(Reference)
```

we can generate the code

```scala
obj.item.filter(\_.extension.exists(\_.url == "foo")).flatMap(\_.answer).flatMap(\_.value).flatMap(\_.as[Reference]).toSeq
```

which is obviously more performant than the dynamic equivalent, but also lends itself much better to the static compile-time checks we love so much.

This all comes around into dog-food, since our FHIR code generator is a client service for our library, and thus our FHIRPath engine enables our generation of search parameters from the official specification (said ‘search parameters’ are arguably more a part of the server spec than the domain model itself, but for various compatibility reasons we wanted to be able to generate the expected values of each parameter for a given object on the object itself). It is beyond the scope of this article to detail the reasoning behind search parameters in the first place. This does mean that there’s ultimately a circular dependency between the generator -> the model -> the fhirpath engine -> the generator, but although you might expect this to present issues, it turns out that once you’ve tied the knot it’s pretty much fine.

**So what next?**

This library is one we’ve found to be usable and useful in its present state, and we’re excited to be able to share it with the world. But there’s still more that we’d like to do!

- FhirProto: We have some experimental support for conversion between the Lit models and Google’s own format, for the purpose of protobuf serialization and other interop. Ideally this would not, as is currently the case, be round-tripped through the Json representation, but rather occur directly.
- Other languages: We support Java and Scala at the moment, but we’ve been considering increasing the number of supported languages, if we find something compelling that we think is missing from other existing implementations.
- Support other FHIR features: FHIR is an extremely feature-rich spec, and not every aspect of it is well-supported at the moment. We currently have no support for [slicing](https://www.hl7.org/fhir/profiling.html#slicing), for example.
- More defaults: In the motivating BMI example, we should be able to derive more of the fields from the profile; the category field, for example, is required by the spec to contain *Coding*(system = *Some*("http://terminology.hl7.org/CodeSystem/observation-category"), code = *Some*("vital-signs")) but we’ve nonetheless had to put it in manually there (this actually falls somewhat under the category of slice support, albeit for a more restricted case). Similarly, the code field could also be auto-propagated.
- Even stronger typing: Again harking back to the BMI example, the valueQuantity.value is actually a required field, even though we represent it as an Option. It may not surprise you to learn at this point that this is another slice-related weakness of the library, in as much as the ‘requiredness’ of the field is declared by a slice definition (although there’s more to it than that...)

**Weird bugs and other issues**

The only perfect project is one with no code. Lit is no exception, and there are issues we’d still like to resolve:

- Earlier on, I mentioned the choose construct, which powers our treatment of FHIR’s Choice types. Although it behaves as we’d like as far as compile-time validation goes, the compiler errors and the IDE messages are not as explicit or helpful as we’d like them to be.
- The choose construct itself relies on a shim that uses Scala 2’s TypeTags, to work around some kind of as-yet-to-be-minimised issue with IntelliJ which probably has something to do with macros - the ‘idiomatic’ method to use would actually be choice, were it not for the fact that it’s incorrectly reported by the IDE to be invalid at use sites. Lit also provides support for Scala 3, and there is no workaround for the highlighting issue in this case - choice is the only type-safe Choice constructor for Scala 3, and it always looks wrong…
- Java support has not been developed much since the early days, and the only maintained requirement has been interop and completeness - many potential opportunities for increased type-safety have been overlooked. In particular, the builder functions for adding Choice types lack compile-time type-safety that could, in principle, be added fairly easily.
- The Choice class itself is, currently, abused to serve two purposes: as a union wrapper for the FHIR Choice fields, and as a named wrapper around raw Json for modelling classes that are yet-to-be-defined by the FHIR specification (such as ProductShelfLife). This overloading of purpose is cumbersome in some places, and means that we can’t yet have the natural semantics, in Scala 3, that the value of a Choice[T] is *actually of type T*.
- Versioning: It is as-yet uncertain to what extent future versions of FHIR will be backwards-compatible with the R4 release: currently, we anticipate few if any breaking changes in source code, and expect to be able to upgrade gracefully once the next version is released, with adoption being on an as-required basis. To what extent this holds true will have to remain to be seen, however [the](http://build.fhir.org/versions.html#f-compat)[ ](http://build.fhir.org/versions.html#f-compat)[guarantees](http://build.fhir.org/versions.html#f-compat)[ ](http://build.fhir.org/versions.html#f-compat)[provided](http://build.fhir.org/versions.html#f-compat)[ ](http://build.fhir.org/versions.html#f-compat)[by](http://build.fhir.org/versions.html#f-compat)[ ](http://build.fhir.org/versions.html#f-compat)[the](http://build.fhir.org/versions.html#f-compat)[ ](http://build.fhir.org/versions.html#f-compat)[HL](http://build.fhir.org/versions.html#f-compat)[7 ](http://build.fhir.org/versions.html#f-compat)[specification](http://build.fhir.org/versions.html#f-compat)[ ](http://build.fhir.org/versions.html#f-compat)[body](http://build.fhir.org/versions.html#f-compat) suggest that this is a reasonable expectation.
