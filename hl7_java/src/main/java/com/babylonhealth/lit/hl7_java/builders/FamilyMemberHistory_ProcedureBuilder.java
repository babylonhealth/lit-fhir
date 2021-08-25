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

public interface FamilyMemberHistory_ProcedureBuilder {
  public FamilyMemberHistory.Procedure build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public static Choice01474038381 performed(Age a) {
    return new Choice01474038381(a);
  }

  public static Choice01474038381 performed(FHIRDateTime f) {
    return new Choice01474038381(f);
  }

  public static Choice01474038381 performed(Period p) {
    return new Choice01474038381(p);
  }

  public static Choice01474038381 performed(Range r) {
    return new Choice01474038381(r);
  }

  public static Choice01474038381 performed(String s) {
    return new Choice01474038381(s);
  }

  public class Impl implements FamilyMemberHistory_ProcedureBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<CodeableConcept> outcome = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Choice01474038381> performed = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Boolean> contributedToDeath = Optional.empty();

    /**
     * Required fields for {@link FamilyMemberHistory.Procedure}
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
    public FamilyMemberHistory_ProcedureBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param note - This property allows a non condition-specific note to the made about the
     *     related person. Ideally, the note would be in the condition property, but this is not
     *     always possible.
     */
    public FamilyMemberHistory_ProcedureBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - This property allows a non condition-specific note to the made about the
     *     related person. Ideally, the note would be in the condition property, but this is not
     *     always possible.
     */
    public FamilyMemberHistory_ProcedureBuilder.Impl withNote(
        @NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public FamilyMemberHistory_ProcedureBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param outcome */
    public FamilyMemberHistory_ProcedureBuilder.Impl withOutcome(@NonNull CodeableConcept outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }

    public FamilyMemberHistory_ProcedureBuilder.Impl withOutcome(
        @NonNull CodeableConceptBuilder outcome) {
      this.outcome = Optional.of(outcome.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public FamilyMemberHistory_ProcedureBuilder.Impl withExtension(
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
    public FamilyMemberHistory_ProcedureBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public FamilyMemberHistory_ProcedureBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param performed Field is a 'choice' field. Type should be one of Age, FHIRDateTime, Period,
     *     Range, String. To pass the value in, wrap with one of the
     *     FamilyMemberHistory_ProcedureBuilder.performed static methods
     */
    public FamilyMemberHistory_ProcedureBuilder.Impl withPerformed(
        @NonNull Choice01474038381 performed) {
      this.performed = Optional.of(performed);
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
    public FamilyMemberHistory_ProcedureBuilder.Impl withModifierExtension(
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
    public FamilyMemberHistory_ProcedureBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public FamilyMemberHistory_ProcedureBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param contributedToDeath */
    public FamilyMemberHistory_ProcedureBuilder.Impl withContributedToDeath(
        @NonNull Boolean contributedToDeath) {
      this.contributedToDeath = Optional.of(contributedToDeath);
      return this;
    }

    public FamilyMemberHistory.Procedure build() {
      return new FamilyMemberHistory.Procedure(
          OptionConverters.toScala(id),
          code,
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(outcome),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(performed),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(contributedToDeath.map(x -> (Object) x)),
          LitUtils.emptyMetaElMap());
    }
  }
}
