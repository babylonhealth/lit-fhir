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

public interface Contract_Term_SecurityLabelBuilder {
  public Contract$Term$SecurityLabel build();

  public static Impl init(Coding classification) {
    return new Impl(classification);
  }

  public static Impl builder(CodingBuilder classification) {
    return new Impl(classification.build());
  }

  public class Impl implements Contract_Term_SecurityLabelBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Integer> number = Collections.emptyList();
    private Collection<Coding> control = Collections.emptyList();
    private Collection<Coding> category = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Coding classification;
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Contract$Term$SecurityLabel}
     *
     * @param classification
     */
    public Impl(Coding classification) {
      this.classification = classification;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Contract_Term_SecurityLabelBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param number */
    public Contract_Term_SecurityLabelBuilder.Impl withNumber(@NonNull Integer... number) {
      this.number = Arrays.asList(number);
      return this;
    }
    /** @param number */
    public Contract_Term_SecurityLabelBuilder.Impl withNumber(@NonNull Collection<Integer> number) {
      this.number = Collections.unmodifiableCollection(number);
      return this;
    }
    /** @param control */
    public Contract_Term_SecurityLabelBuilder.Impl withControl(@NonNull Coding... control) {
      this.control = Arrays.asList(control);
      return this;
    }
    /** @param control */
    public Contract_Term_SecurityLabelBuilder.Impl withControl(
        @NonNull Collection<Coding> control) {
      this.control = Collections.unmodifiableCollection(control);
      return this;
    }
    /** @param category */
    public Contract_Term_SecurityLabelBuilder.Impl withCategory(@NonNull Coding... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category */
    public Contract_Term_SecurityLabelBuilder.Impl withCategory(
        @NonNull Collection<Coding> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Contract_Term_SecurityLabelBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Contract_Term_SecurityLabelBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
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
    public Contract_Term_SecurityLabelBuilder.Impl withModifierExtension(
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
    public Contract_Term_SecurityLabelBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Contract$Term$SecurityLabel build() {
      return new Contract$Term$SecurityLabel(
          OptionConverters.toScala(id),
          number.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          control.stream().collect(new LitSeqJCollector<>()),
          category.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          classification,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
