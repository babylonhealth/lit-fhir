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
import com.babylonhealth.lit.hl7.MAP_GROUP_TYPE_MODE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface StructureMap_GroupBuilder {
  public StructureMap.Group build();

  public static Impl init(
      String name,
      MAP_GROUP_TYPE_MODE typeMode,
      Collection<StructureMap$Group$Input> input,
      Collection<StructureMap$Group$Rule> rule) {
    return new Impl(name, typeMode, input, rule);
  }

  public static Impl builder(
      String name,
      MAP_GROUP_TYPE_MODE typeMode,
      Collection<StructureMap_Group_InputBuilder> input,
      Collection<StructureMap_Group_RuleBuilder> rule) {
    return new Impl(
        name,
        typeMode,
        new LitSeq<>(input).map(StructureMap_Group_InputBuilder::build),
        new LitSeq<>(rule).map(StructureMap_Group_RuleBuilder::build));
  }

  public class Impl implements StructureMap_GroupBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Optional<String> _extends = Optional.empty();
    private MAP_GROUP_TYPE_MODE typeMode;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> documentation = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<StructureMap$Group$Input> input;
    private Collection<StructureMap$Group$Rule> rule;

    /**
     * Required fields for {@link StructureMap.Group}
     *
     * @param name - A natural language name identifying the structure map. This name should be
     *     usable as an identifier for the module by machine processing applications such as code
     *     generation.
     * @param typeMode
     * @param input
     * @param rule
     */
    public Impl(
        String name,
        MAP_GROUP_TYPE_MODE typeMode,
        Collection<StructureMap$Group$Input> input,
        Collection<StructureMap$Group$Rule> rule) {
      this.name = name;
      this.typeMode = typeMode;
      this.input = input;
      this.rule = rule;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public StructureMap_GroupBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _extends */
    public StructureMap_GroupBuilder.Impl withExtends(@NonNull String _extends) {
      this._extends = Optional.of(_extends);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public StructureMap_GroupBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public StructureMap_GroupBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param documentation */
    public StructureMap_GroupBuilder.Impl withDocumentation(@NonNull String documentation) {
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
    public StructureMap_GroupBuilder.Impl withModifierExtension(
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
    public StructureMap_GroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public StructureMap.Group build() {
      return new StructureMap.Group(
          OptionConverters.toScala(id),
          name,
          OptionConverters.toScala(_extends),
          typeMode,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(documentation),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          input.stream().collect(new NonEmptyLitSeqJCollector<>()),
          rule.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
