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

public interface CodeableReferenceBuilder extends DataTypeBuilder {
  public CodeableReference build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements CodeableReferenceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> concept = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> reference = Optional.empty();

    /** Required fields for {@link CodeableReference} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public CodeableReferenceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param concept - A reference to a concept - e.g. the information is identified by it's
     *     general classto the degree of precision found in the terminology.
     */
    public CodeableReferenceBuilder.Impl withConcept(@NonNull CodeableConcept concept) {
      this.concept = Optional.of(concept);
      return this;
    }

    public CodeableReferenceBuilder.Impl withConcept(@NonNull CodeableConceptBuilder concept) {
      this.concept = Optional.of(concept.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public CodeableReferenceBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public CodeableReferenceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CodeableReferenceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param reference - A reference to a resource the provides exact details about the information
     *     being referenced.
     */
    public CodeableReferenceBuilder.Impl withReference(@NonNull Reference reference) {
      this.reference = Optional.of(reference);
      return this;
    }

    public CodeableReferenceBuilder.Impl withReference(@NonNull ReferenceBuilder reference) {
      this.reference = Optional.of(reference.build());
      return this;
    }

    public CodeableReference build() {
      return new CodeableReference(
          OptionConverters.toScala(id),
          OptionConverters.toScala(concept),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(reference),
          LitUtils.emptyMetaElMap());
    }
  }
}
