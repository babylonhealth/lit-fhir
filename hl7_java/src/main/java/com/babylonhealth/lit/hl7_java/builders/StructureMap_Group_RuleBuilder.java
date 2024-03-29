package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
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

public interface StructureMap_Group_RuleBuilder {
  public StructureMap$Group$Rule build();

  public static Impl init(String name, Collection<StructureMap$Group$Rule$Source> source) {
    return new Impl(name, source);
  }

  public static Impl builder(
      String name, Collection<StructureMap_Group_Rule_SourceBuilder> source) {
    return new Impl(name, new LitSeq<>(source).map(StructureMap_Group_Rule_SourceBuilder::build));
  }

  public class Impl implements StructureMap_Group_RuleBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Collection<StructureMap$Group$Rule> rule = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> documentation = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<StructureMap$Group$Rule$Source> source;
    private Collection<StructureMap$Group$Rule$Dependent> dependent = Collections.emptyList();
    private Collection<StructureMap$Group$Rule$Target> target = Collections.emptyList();

    /**
     * Required fields for {@link StructureMap$Group$Rule}
     *
     * @param name - A natural language name identifying the structure map. This name should be
     *     usable as an identifier for the module by machine processing applications such as code
     *     generation.
     * @param source
     */
    public Impl(String name, Collection<StructureMap$Group$Rule$Source> source) {
      this.name = name;
      this.source = source;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public StructureMap_Group_RuleBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param rule */
    public StructureMap_Group_RuleBuilder.Impl withRule(@NonNull StructureMap$Group$Rule... rule) {
      this.rule = Arrays.asList(rule);
      return this;
    }
    /** @param rule */
    public StructureMap_Group_RuleBuilder.Impl withRule(
        @NonNull Collection<StructureMap$Group$Rule> rule) {
      this.rule = Collections.unmodifiableCollection(rule);
      return this;
    }

    public StructureMap_Group_RuleBuilder.Impl withRule(
        @NonNull StructureMap_Group_RuleBuilder... rule) {
      this.rule = Arrays.stream(rule).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public StructureMap_Group_RuleBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public StructureMap_Group_RuleBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public StructureMap_Group_RuleBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param documentation */
    public StructureMap_Group_RuleBuilder.Impl withDocumentation(@NonNull String documentation) {
      this.documentation = Optional.of(documentation);
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
    public StructureMap_Group_RuleBuilder.Impl withModifierExtension(
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
    public StructureMap_Group_RuleBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public StructureMap_Group_RuleBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dependent */
    public StructureMap_Group_RuleBuilder.Impl withDependent(
        @NonNull StructureMap$Group$Rule$Dependent... dependent) {
      this.dependent = Arrays.asList(dependent);
      return this;
    }
    /** @param dependent */
    public StructureMap_Group_RuleBuilder.Impl withDependent(
        @NonNull Collection<StructureMap$Group$Rule$Dependent> dependent) {
      this.dependent = Collections.unmodifiableCollection(dependent);
      return this;
    }

    public StructureMap_Group_RuleBuilder.Impl withDependent(
        @NonNull StructureMap_Group_Rule_DependentBuilder... dependent) {
      this.dependent = Arrays.stream(dependent).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param target */
    public StructureMap_Group_RuleBuilder.Impl withTarget(
        @NonNull StructureMap$Group$Rule$Target... target) {
      this.target = Arrays.asList(target);
      return this;
    }
    /** @param target */
    public StructureMap_Group_RuleBuilder.Impl withTarget(
        @NonNull Collection<StructureMap$Group$Rule$Target> target) {
      this.target = Collections.unmodifiableCollection(target);
      return this;
    }

    public StructureMap_Group_RuleBuilder.Impl withTarget(
        @NonNull StructureMap_Group_Rule_TargetBuilder... target) {
      this.target = Arrays.stream(target).map(e -> e.build()).collect(toList());
      return this;
    }

    public StructureMap$Group$Rule build() {
      return new StructureMap$Group$Rule(
          OptionConverters.toScala(id),
          name,
          rule.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(documentation),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          source.stream().collect(new NonEmptyLitSeqJCollector<>()),
          dependent.stream().collect(new LitSeqJCollector<>()),
          target.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
