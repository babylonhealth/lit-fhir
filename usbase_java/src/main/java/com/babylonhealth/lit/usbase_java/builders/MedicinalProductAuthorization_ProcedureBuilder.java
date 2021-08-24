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

public interface MedicinalProductAuthorization_ProcedureBuilder {
  public MedicinalProductAuthorization.Procedure build();

  public static Impl init(CodeableConcept _type) {
    return new Impl(_type);
  }

  public static Impl builder(CodeableConceptBuilder _type) {
    return new Impl(_type.build());
  }

  public static ChoiceDateTimeOrPeriod date(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod date(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements MedicinalProductAuthorization_ProcedureBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Optional<ChoiceDateTimeOrPeriod> date = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<MedicinalProductAuthorization.Procedure> application =
        Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link MedicinalProductAuthorization.Procedure}
     *
     * @param _type
     */
    public Impl(CodeableConcept _type) {
      this._type = _type;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param date Field is a 'choice' field. Type should be one of FHIRDateTime, Period. To pass
     *     the value in, wrap with one of the MedicinalProductAuthorization_ProcedureBuilder.date
     *     static methods
     */
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withDate(
        @NonNull ChoiceDateTimeOrPeriod date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withExtension(
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
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductAuthorization_ProcedureBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifier for the marketing authorization, as assigned by a
     *     regulator.
     */
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withIdentifier(
        @NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public MedicinalProductAuthorization_ProcedureBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /** @param application */
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withApplication(
        @NonNull MedicinalProductAuthorization.Procedure... application) {
      this.application = Arrays.asList(application);
      return this;
    }
    /** @param application */
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withApplication(
        @NonNull Collection<MedicinalProductAuthorization.Procedure> application) {
      this.application = Collections.unmodifiableCollection(application);
      return this;
    }

    public MedicinalProductAuthorization_ProcedureBuilder.Impl withApplication(
        @NonNull MedicinalProductAuthorization_ProcedureBuilder... application) {
      this.application = Arrays.stream(application).map(e -> e.build()).collect(toList());
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
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withModifierExtension(
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
    public MedicinalProductAuthorization_ProcedureBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductAuthorization_ProcedureBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductAuthorization.Procedure build() {
      return new MedicinalProductAuthorization.Procedure(
          OptionConverters.toScala(id),
          _type,
          (Option) OptionConverters.toScala(date),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          application.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
