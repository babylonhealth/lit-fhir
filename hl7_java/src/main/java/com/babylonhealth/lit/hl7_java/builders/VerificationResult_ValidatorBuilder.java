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

public interface VerificationResult_ValidatorBuilder {
  public VerificationResult.Validator build();

  public static Impl init(Reference organization) {
    return new Impl(organization);
  }

  public static Impl builder(ReferenceBuilder organization) {
    return new Impl(organization.build());
  }

  public class Impl implements VerificationResult_ValidatorBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Reference organization;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> identityCertificate = Optional.empty();
    private Optional<Signature> attestationSignature = Optional.empty();

    /**
     * Required fields for {@link VerificationResult.Validator}
     *
     * @param organization
     */
    public Impl(Reference organization) {
      this.organization = organization;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public VerificationResult_ValidatorBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public VerificationResult_ValidatorBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public VerificationResult_ValidatorBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public VerificationResult_ValidatorBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public VerificationResult_ValidatorBuilder.Impl withModifierExtension(
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
    public VerificationResult_ValidatorBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public VerificationResult_ValidatorBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identityCertificate */
    public VerificationResult_ValidatorBuilder.Impl withIdentityCertificate(
        @NonNull String identityCertificate) {
      this.identityCertificate = Optional.of(identityCertificate);
      return this;
    }
    /** @param attestationSignature */
    public VerificationResult_ValidatorBuilder.Impl withAttestationSignature(
        @NonNull Signature attestationSignature) {
      this.attestationSignature = Optional.of(attestationSignature);
      return this;
    }

    public VerificationResult_ValidatorBuilder.Impl withAttestationSignature(
        @NonNull SignatureBuilder attestationSignature) {
      this.attestationSignature = Optional.of(attestationSignature.build());
      return this;
    }

    public VerificationResult.Validator build() {
      return new VerificationResult.Validator(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          organization,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identityCertificate),
          OptionConverters.toScala(attestationSignature),
          LitUtils.emptyMetaElMap());
    }
  }
}
