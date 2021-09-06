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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TerminologyCapabilities_CodeSystemBuilder {
  public TerminologyCapabilities.CodeSystem build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements TerminologyCapabilities_CodeSystemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> uri = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Boolean> subsumption = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<TerminologyCapabilities$CodeSystem$Version> version =
        Collections.emptyList();

    /** Required fields for {@link TerminologyCapabilities.CodeSystem} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TerminologyCapabilities_CodeSystemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param uri */
    public TerminologyCapabilities_CodeSystemBuilder.Impl withUri(@NonNull String uri) {
      this.uri = Optional.of(uri);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TerminologyCapabilities_CodeSystemBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public TerminologyCapabilities_CodeSystemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TerminologyCapabilities_CodeSystemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subsumption */
    public TerminologyCapabilities_CodeSystemBuilder.Impl withSubsumption(
        @NonNull Boolean subsumption) {
      this.subsumption = Optional.of(subsumption);
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
    public TerminologyCapabilities_CodeSystemBuilder.Impl withModifierExtension(
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
    public TerminologyCapabilities_CodeSystemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TerminologyCapabilities_CodeSystemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the terminology
     *     capabilities when it is referenced in a specification, model, design or instance. This is
     *     an arbitrary value managed by the terminology capabilities author and is not expected to
     *     be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence.
     */
    public TerminologyCapabilities_CodeSystemBuilder.Impl withVersion(
        @NonNull TerminologyCapabilities$CodeSystem$Version... version) {
      this.version = Arrays.asList(version);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the terminology
     *     capabilities when it is referenced in a specification, model, design or instance. This is
     *     an arbitrary value managed by the terminology capabilities author and is not expected to
     *     be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence.
     */
    public TerminologyCapabilities_CodeSystemBuilder.Impl withVersion(
        @NonNull Collection<TerminologyCapabilities$CodeSystem$Version> version) {
      this.version = Collections.unmodifiableCollection(version);
      return this;
    }

    public TerminologyCapabilities_CodeSystemBuilder.Impl withVersion(
        @NonNull TerminologyCapabilities_CodeSystem_VersionBuilder... version) {
      this.version = Arrays.stream(version).map(e -> e.build()).collect(toList());
      return this;
    }

    public TerminologyCapabilities.CodeSystem build() {
      return new TerminologyCapabilities.CodeSystem(
          OptionConverters.toScala(id),
          OptionConverters.toScala(uri),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subsumption.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          version.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
