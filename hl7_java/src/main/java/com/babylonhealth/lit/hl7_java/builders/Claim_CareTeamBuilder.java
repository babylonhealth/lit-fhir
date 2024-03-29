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

public interface Claim_CareTeamBuilder {
  public Claim.CareTeam build();

  public static Impl init(Integer sequence, Reference provider) {
    return new Impl(sequence, provider);
  }

  public static Impl builder(Integer sequence, ReferenceBuilder provider) {
    return new Impl(sequence, provider.build());
  }

  public class Impl implements Claim_CareTeamBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> role = Optional.empty();
    private Integer sequence;
    private Reference provider;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Boolean> responsible = Optional.empty();
    private Optional<CodeableConcept> qualification = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Claim.CareTeam}
     *
     * @param sequence
     * @param provider - The provider which is responsible for the claim, predetermination or
     *     preauthorization.
     */
    public Impl(Integer sequence, Reference provider) {
      this.sequence = sequence;
      this.provider = provider;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Claim_CareTeamBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param role */
    public Claim_CareTeamBuilder.Impl withRole(@NonNull CodeableConcept role) {
      this.role = Optional.of(role);
      return this;
    }

    public Claim_CareTeamBuilder.Impl withRole(@NonNull CodeableConceptBuilder role) {
      this.role = Optional.of(role.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Claim_CareTeamBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Claim_CareTeamBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Claim_CareTeamBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param responsible */
    public Claim_CareTeamBuilder.Impl withResponsible(@NonNull Boolean responsible) {
      this.responsible = Optional.of(responsible);
      return this;
    }
    /** @param qualification */
    public Claim_CareTeamBuilder.Impl withQualification(@NonNull CodeableConcept qualification) {
      this.qualification = Optional.of(qualification);
      return this;
    }

    public Claim_CareTeamBuilder.Impl withQualification(
        @NonNull CodeableConceptBuilder qualification) {
      this.qualification = Optional.of(qualification.build());
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
    public Claim_CareTeamBuilder.Impl withModifierExtension(
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
    public Claim_CareTeamBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Claim_CareTeamBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Claim.CareTeam build() {
      return new Claim.CareTeam(
          OptionConverters.toScala(id),
          OptionConverters.toScala(role),
          sequence,
          provider,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(responsible.map(x -> (Object) x)),
          OptionConverters.toScala(qualification),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
