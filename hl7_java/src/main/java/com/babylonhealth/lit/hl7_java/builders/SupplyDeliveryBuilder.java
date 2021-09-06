package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.hl7.SUPPLYDELIVERY_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface SupplyDeliveryBuilder extends DomainResourceBuilder {
  public SupplyDelivery build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceFHIRDateTimeOrPeriodOrTiming occurrence(FHIRDateTime f) {
    return new ChoiceFHIRDateTimeOrPeriodOrTiming(f);
  }

  public static ChoiceFHIRDateTimeOrPeriodOrTiming occurrence(Period p) {
    return new ChoiceFHIRDateTimeOrPeriodOrTiming(p);
  }

  public static ChoiceFHIRDateTimeOrPeriodOrTiming occurrence(Timing t) {
    return new ChoiceFHIRDateTimeOrPeriodOrTiming(t);
  }

  public class Impl implements SupplyDeliveryBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Reference> partOf = Collections.emptyList();
    private Optional<SUPPLYDELIVERY_STATUS> status = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<Reference> patient = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Reference> supplier = Optional.empty();
    private Collection<Reference> receiver = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Reference> destination = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<ChoiceFHIRDateTimeOrPeriodOrTiming> occurrence = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<SupplyDelivery.SuppliedItem> suppliedItem = Optional.empty();

    /** Required fields for {@link SupplyDelivery} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SupplyDeliveryBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SupplyDeliveryBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public SupplyDeliveryBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - Indicates the type of dispensing event that is performed. Examples include:
     *     Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
     */
    public SupplyDeliveryBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param partOf - A larger event of which this particular event is a component or step. */
    public SupplyDeliveryBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /** @param partOf - A larger event of which this particular event is a component or step. */
    public SupplyDeliveryBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param status - A code specifying the state of the dispense event. */
    public SupplyDeliveryBuilder.Impl withStatus(@NonNull SUPPLYDELIVERY_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /**
     * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
     *     event.
     */
    public SupplyDeliveryBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
     *     event.
     */
    public SupplyDeliveryBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param patient - A link to a resource representing the person whom the delivered item is for.
     */
    public SupplyDeliveryBuilder.Impl withPatient(@NonNull Reference patient) {
      this.patient = Optional.of(patient);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withPatient(@NonNull ReferenceBuilder patient) {
      this.patient = Optional.of(patient.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SupplyDeliveryBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param supplier - The individual responsible for dispensing the medication, supplier or
     *     device.
     */
    public SupplyDeliveryBuilder.Impl withSupplier(@NonNull Reference supplier) {
      this.supplier = Optional.of(supplier);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withSupplier(@NonNull ReferenceBuilder supplier) {
      this.supplier = Optional.of(supplier.build());
      return this;
    }
    /** @param receiver - Identifies the person who picked up the Supply. */
    public SupplyDeliveryBuilder.Impl withReceiver(@NonNull Reference... receiver) {
      this.receiver = Arrays.asList(receiver);
      return this;
    }
    /** @param receiver - Identifies the person who picked up the Supply. */
    public SupplyDeliveryBuilder.Impl withReceiver(@NonNull Collection<Reference> receiver) {
      this.receiver = Collections.unmodifiableCollection(receiver);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withReceiver(@NonNull ReferenceBuilder... receiver) {
      this.receiver = Arrays.stream(receiver).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SupplyDeliveryBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SupplyDeliveryBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SupplyDeliveryBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SupplyDeliveryBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Identifier for the supply delivery event that is used to identify it
     *     across multiple disparate systems.
     */
    public SupplyDeliveryBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifier for the supply delivery event that is used to identify it
     *     across multiple disparate systems.
     */
    public SupplyDeliveryBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param destination - Identification of the facility/location where the Supply was shipped to,
     *     as part of the dispense event.
     */
    public SupplyDeliveryBuilder.Impl withDestination(@NonNull Reference destination) {
      this.destination = Optional.of(destination);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withDestination(@NonNull ReferenceBuilder destination) {
      this.destination = Optional.of(destination.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SupplyDeliveryBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param occurrence - The date or time(s) the activity occurred. Field is a 'choice' field.
     *     Type should be one of FHIRDateTime, Period, Timing. To pass the value in, wrap with one
     *     of the SupplyDeliveryBuilder.occurrence static methods
     */
    public SupplyDeliveryBuilder.Impl withOccurrence(
        @NonNull ChoiceFHIRDateTimeOrPeriodOrTiming occurrence) {
      this.occurrence = Optional.of(occurrence);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public SupplyDeliveryBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public SupplyDeliveryBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param suppliedItem - The item that is being delivered or has been supplied. */
    public SupplyDeliveryBuilder.Impl withSuppliedItem(
        @NonNull SupplyDelivery.SuppliedItem suppliedItem) {
      this.suppliedItem = Optional.of(suppliedItem);
      return this;
    }

    public SupplyDeliveryBuilder.Impl withSuppliedItem(
        @NonNull SupplyDelivery_SuppliedItemBuilder suppliedItem) {
      this.suppliedItem = Optional.of(suppliedItem.build());
      return this;
    }

    public SupplyDeliveryBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public SupplyDelivery build() {
      return new SupplyDelivery(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          partOf.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(status),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(patient),
          OptionConverters.toScala(language),
          OptionConverters.toScala(supplier),
          receiver.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(destination),
          OptionConverters.toScala(implicitRules),
          (Option) OptionConverters.toScala(occurrence),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(suppliedItem),
          LitUtils.emptyMetaElMap());
    }
  }
}
