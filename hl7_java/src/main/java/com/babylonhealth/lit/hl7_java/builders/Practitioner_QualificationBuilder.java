package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Practitioner_QualificationBuilder {
  public Practitioner.Qualification build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public class Impl implements Practitioner_QualificationBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private Optional<Period> period = Optional.empty();
    private Optional<Reference> issuer = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Practitioner.Qualification}
     *
     * @param code
     */
    public Impl(CodeableConcept code) {
      this.code = code;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Practitioner_QualificationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param period */
    public Practitioner_QualificationBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Practitioner_QualificationBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param issuer */
    public Practitioner_QualificationBuilder.Impl withIssuer(@NonNull Reference issuer) {
      this.issuer = Optional.of(issuer);
      return this;
    }

    public Practitioner_QualificationBuilder.Impl withIssuer(@NonNull ReferenceBuilder issuer) {
      this.issuer = Optional.of(issuer.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Practitioner_QualificationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Practitioner_QualificationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Practitioner_QualificationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - An identifier that applies to this person in this role. */
    public Practitioner_QualificationBuilder.Impl withIdentifier(
        @NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - An identifier that applies to this person in this role. */
    public Practitioner_QualificationBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Practitioner_QualificationBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
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
    public Practitioner_QualificationBuilder.Impl withModifierExtension(
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
    public Practitioner_QualificationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Practitioner_QualificationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Practitioner.Qualification build() {
      return new Practitioner.Qualification(
          OptionConverters.toScala(id),
          code,
          OptionConverters.toScala(period),
          OptionConverters.toScala(issuer),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
