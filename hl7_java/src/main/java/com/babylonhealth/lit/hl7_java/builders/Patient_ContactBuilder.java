package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Patient_ContactBuilder {
  public Patient.Contact build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Patient_ContactBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<HumanName> name = Optional.empty();
    private Optional<ADMINISTRATIVE_GENDER> gender = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Collection<ContactPoint> telecom = Collections.emptyList();
    private Optional<Address> address = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> relationship = Collections.emptyList();
    private Optional<Reference> organization = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Patient.Contact} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Patient_ContactBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param name - A name associated with the individual. */
    public Patient_ContactBuilder.Impl withName(@NonNull HumanName name) {
      this.name = Optional.of(name);
      return this;
    }

    public Patient_ContactBuilder.Impl withName(@NonNull HumanNameBuilder name) {
      this.name = Optional.of(name.build());
      return this;
    }
    /**
     * @param gender - Administrative Gender - the gender that the patient is considered to have for
     *     administration and record keeping purposes.
     */
    public Patient_ContactBuilder.Impl withGender(@NonNull ADMINISTRATIVE_GENDER gender) {
      this.gender = Optional.of(gender);
      return this;
    }
    /** @param period */
    public Patient_ContactBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Patient_ContactBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param telecom - A contact detail (e.g. a telephone number or an email address) by which the
     *     individual may be contacted.
     */
    public Patient_ContactBuilder.Impl withTelecom(@NonNull ContactPoint... telecom) {
      this.telecom = Arrays.asList(telecom);
      return this;
    }
    /**
     * @param telecom - A contact detail (e.g. a telephone number or an email address) by which the
     *     individual may be contacted.
     */
    public Patient_ContactBuilder.Impl withTelecom(@NonNull Collection<ContactPoint> telecom) {
      this.telecom = Collections.unmodifiableCollection(telecom);
      return this;
    }

    public Patient_ContactBuilder.Impl withTelecom(@NonNull ContactPointBuilder... telecom) {
      this.telecom = Arrays.stream(telecom).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param address - An address for the individual. */
    public Patient_ContactBuilder.Impl withAddress(@NonNull Address address) {
      this.address = Optional.of(address);
      return this;
    }

    public Patient_ContactBuilder.Impl withAddress(@NonNull AddressBuilder address) {
      this.address = Optional.of(address.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Patient_ContactBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Patient_ContactBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Patient_ContactBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param relationship */
    public Patient_ContactBuilder.Impl withRelationship(@NonNull CodeableConcept... relationship) {
      this.relationship = Arrays.asList(relationship);
      return this;
    }
    /** @param relationship */
    public Patient_ContactBuilder.Impl withRelationship(
        @NonNull Collection<CodeableConcept> relationship) {
      this.relationship = Collections.unmodifiableCollection(relationship);
      return this;
    }

    public Patient_ContactBuilder.Impl withRelationship(
        @NonNull CodeableConceptBuilder... relationship) {
      this.relationship = Arrays.stream(relationship).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param organization */
    public Patient_ContactBuilder.Impl withOrganization(@NonNull Reference organization) {
      this.organization = Optional.of(organization);
      return this;
    }

    public Patient_ContactBuilder.Impl withOrganization(@NonNull ReferenceBuilder organization) {
      this.organization = Optional.of(organization.build());
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
    public Patient_ContactBuilder.Impl withModifierExtension(
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
    public Patient_ContactBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Patient_ContactBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Patient.Contact build() {
      return new Patient.Contact(
          OptionConverters.toScala(id),
          OptionConverters.toScala(name),
          OptionConverters.toScala(gender),
          OptionConverters.toScala(period),
          telecom.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(address),
          extension.stream().collect(new LitSeqJCollector<>()),
          relationship.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(organization),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
