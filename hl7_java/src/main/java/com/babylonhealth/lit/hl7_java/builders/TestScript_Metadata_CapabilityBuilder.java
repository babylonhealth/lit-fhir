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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class TestScript_Metadata_CapabilityBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<String> link = Collections.emptyList();
  private Collection<Integer> origin = Collections.emptyList();
  private Boolean required;
  private Collection<Extension> extension = Collections.emptyList();
  private Boolean validated;
  private Optional<String> description = Optional.empty();
  private Optional<Integer> destination = Optional.empty();
  private String capabilities;
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link TestScript$Metadata$Capability}
   *
   * @param required
   * @param validated
   * @param capabilities
   */
  public TestScript_Metadata_CapabilityBuilder(
      Boolean required, Boolean validated, String capabilities) {
    this.required = required;
    this.validated = validated;
    this.capabilities = capabilities;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public TestScript_Metadata_CapabilityBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param link */
  public TestScript_Metadata_CapabilityBuilder withLink(@NonNull String... link) {
    this.link = Arrays.asList(link);
    return this;
  }
  /** @param link */
  public TestScript_Metadata_CapabilityBuilder withLink(@NonNull Collection<String> link) {
    this.link = Collections.unmodifiableCollection(link);
    return this;
  }
  /**
   * @param origin - An abstract server used in operations within this test script in the origin
   *     element.
   */
  public TestScript_Metadata_CapabilityBuilder withOrigin(@NonNull Integer... origin) {
    this.origin = Arrays.asList(origin);
    return this;
  }
  /**
   * @param origin - An abstract server used in operations within this test script in the origin
   *     element.
   */
  public TestScript_Metadata_CapabilityBuilder withOrigin(@NonNull Collection<Integer> origin) {
    this.origin = Collections.unmodifiableCollection(origin);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TestScript_Metadata_CapabilityBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TestScript_Metadata_CapabilityBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param description - A free text natural language description of the test script from a
   *     consumer's perspective.
   */
  public TestScript_Metadata_CapabilityBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param destination - An abstract server used in operations within this test script in the
   *     destination element.
   */
  public TestScript_Metadata_CapabilityBuilder withDestination(@NonNull Integer destination) {
    this.destination = Optional.of(destination);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public TestScript_Metadata_CapabilityBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public TestScript_Metadata_CapabilityBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public TestScript$Metadata$Capability build() {
    return new TestScript$Metadata$Capability(
        OptionConverters.toScala(id),
        link.stream().collect(new LitSeqJCollector<>()),
        origin.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        required,
        extension.stream().collect(new LitSeqJCollector<>()),
        validated,
        OptionConverters.toScala(description),
        OptionConverters.toScala(destination.map(x -> (Object) x)),
        capabilities,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
