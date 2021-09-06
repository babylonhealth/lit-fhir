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
import com.babylonhealth.lit.hl7.ISSUE_TYPE;
import com.babylonhealth.lit.hl7.ISSUE_SEVERITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface OperationOutcome_IssueBuilder {
  public OperationOutcome.Issue build();

  public static Impl init(ISSUE_TYPE code, ISSUE_SEVERITY severity) {
    return new Impl(code, severity);
  }

  public class Impl implements OperationOutcome_IssueBuilder {
    private Optional<String> id = Optional.empty();
    private ISSUE_TYPE code;
    private Optional<CodeableConcept> details = Optional.empty();
    private ISSUE_SEVERITY severity;
    private Collection<String> location = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<String> expression = Collections.emptyList();
    private Optional<String> diagnostics = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link OperationOutcome.Issue}
     *
     * @param code
     * @param severity
     */
    public Impl(ISSUE_TYPE code, ISSUE_SEVERITY severity) {
      this.code = code;
      this.severity = severity;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public OperationOutcome_IssueBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param details */
    public OperationOutcome_IssueBuilder.Impl withDetails(@NonNull CodeableConcept details) {
      this.details = Optional.of(details);
      return this;
    }
    /** @param location */
    public OperationOutcome_IssueBuilder.Impl withLocation(@NonNull String... location) {
      this.location = Arrays.asList(location);
      return this;
    }
    /** @param location */
    public OperationOutcome_IssueBuilder.Impl withLocation(@NonNull Collection<String> location) {
      this.location = Collections.unmodifiableCollection(location);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public OperationOutcome_IssueBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public OperationOutcome_IssueBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param expression */
    public OperationOutcome_IssueBuilder.Impl withExpression(@NonNull String... expression) {
      this.expression = Arrays.asList(expression);
      return this;
    }
    /** @param expression */
    public OperationOutcome_IssueBuilder.Impl withExpression(
        @NonNull Collection<String> expression) {
      this.expression = Collections.unmodifiableCollection(expression);
      return this;
    }
    /** @param diagnostics */
    public OperationOutcome_IssueBuilder.Impl withDiagnostics(@NonNull String diagnostics) {
      this.diagnostics = Optional.of(diagnostics);
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
    public OperationOutcome_IssueBuilder.Impl withModifierExtension(
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
    public OperationOutcome_IssueBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public OperationOutcome.Issue build() {
      return new OperationOutcome.Issue(
          OptionConverters.toScala(id),
          code,
          OptionConverters.toScala(details),
          severity,
          location.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          expression.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(diagnostics),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
