package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ProductShelfLifeBuilder extends BackboneElementBuilder {
  public ProductShelfLife build();

  public static Impl init(CodeableConcept _type, Quantity period) {
    return new Impl(_type, period);
  }

  public class Impl implements ProductShelfLifeBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Quantity period;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> specialPrecautionsForStorage = Collections.emptyList();

    /**
     * Required fields for {@link ProductShelfLife}
     *
     * @param _type - This describes the shelf life, taking into account various scenarios such as
     *     shelf life of the packaged Medicinal Product itself, shelf life after transformation
     *     where necessary and shelf life after the first opening of a bottle, etc. The shelf life
     *     type shall be specified using an appropriate controlled vocabulary The controlled term
     *     and the controlled term identifier shall be specified.
     * @param period - The shelf life time period can be specified using a numerical value for the
     *     period of time and its unit of time measurement The unit of measurement shall be
     *     specified in accordance with ISO 11240 and the resulting terminology The symbol and the
     *     symbol identifier shall be used.
     */
    public Impl(CodeableConcept _type, Quantity period) {
      this._type = _type;
      this.period = period;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ProductShelfLifeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ProductShelfLifeBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ProductShelfLifeBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param identifier - Unique identifier for the packaged Medicinal Product. */
    public ProductShelfLifeBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public ProductShelfLifeBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public ProductShelfLifeBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param specialPrecautionsForStorage - Special precautions for storage, if any, can be
     *     specified using an appropriate controlled vocabulary The controlled term and the
     *     controlled term identifier shall be specified.
     */
    public ProductShelfLifeBuilder.Impl withSpecialPrecautionsForStorage(
        @NonNull CodeableConcept... specialPrecautionsForStorage) {
      this.specialPrecautionsForStorage = Arrays.asList(specialPrecautionsForStorage);
      return this;
    }
    /**
     * @param specialPrecautionsForStorage - Special precautions for storage, if any, can be
     *     specified using an appropriate controlled vocabulary The controlled term and the
     *     controlled term identifier shall be specified.
     */
    public ProductShelfLifeBuilder.Impl withSpecialPrecautionsForStorage(
        @NonNull Collection<CodeableConcept> specialPrecautionsForStorage) {
      this.specialPrecautionsForStorage =
          Collections.unmodifiableCollection(specialPrecautionsForStorage);
      return this;
    }

    public ProductShelfLife build() {
      return new ProductShelfLife(
          OptionConverters.toScala(id),
          _type,
          period,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          specialPrecautionsForStorage.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
