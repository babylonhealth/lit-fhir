package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.GROUP_TYPE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface GroupBuilder extends DomainResourceBuilder {
  public Group build();

  public static Impl init(GROUP_TYPE _type, Boolean actual) {
    return new Impl(_type, actual);
  }

  public static Impl builder(GROUP_TYPE _type, Boolean actual) {
    return new Impl(_type, actual);
  }

  public class Impl implements GroupBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private GROUP_TYPE _type;
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<Boolean> active = Optional.empty();
    private Boolean actual;
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Integer> quantity = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Reference> managingEntity = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Group.Member> member = Collections.emptyList();
    private Collection<Group.Characteristic> characteristic = Collections.emptyList();

    /**
     * Required fields for {@link Group}
     *
     * @param _type - Identifies the broad classification of the kind of resources the group
     *     includes.
     * @param actual - If true, indicates that the resource refers to a specific group of real
     *     individuals. If false, the group defines a set of intended individuals.
     */
    public Impl(GROUP_TYPE _type, Boolean actual) {
      this._type = _type;
      this.actual = actual;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public GroupBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public GroupBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public GroupBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public GroupBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public GroupBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param code - Provides a specific type of resource the group includes; e.g. "cow", "syringe",
     *     etc.
     */
    public GroupBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public GroupBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param name - A label assigned to the group for human identification and communication. */
    public GroupBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param active - Indicates whether the record for the group is available for use or is merely
     *     being retained for historical purposes.
     */
    public GroupBuilder.Impl withActive(@NonNull Boolean active) {
      this.active = Optional.of(active);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public GroupBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param quantity - A count of the number of resource instances that are part of the group. */
    public GroupBuilder.Impl withQuantity(@NonNull Integer quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public GroupBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public GroupBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public GroupBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public GroupBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public GroupBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public GroupBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique business identifier for this group. */
    public GroupBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique business identifier for this group. */
    public GroupBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public GroupBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public GroupBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param managingEntity - Entity responsible for defining and maintaining Group characteristics
     *     and/or registered members.
     */
    public GroupBuilder.Impl withManagingEntity(@NonNull Reference managingEntity) {
      this.managingEntity = Optional.of(managingEntity);
      return this;
    }

    public GroupBuilder.Impl withManagingEntity(@NonNull ReferenceBuilder managingEntity) {
      this.managingEntity = Optional.of(managingEntity.build());
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
    public GroupBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public GroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public GroupBuilder.Impl withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param member - Identifies the resource instances that are members of the group. */
    public GroupBuilder.Impl withMember(@NonNull Group.Member... member) {
      this.member = Arrays.asList(member);
      return this;
    }
    /** @param member - Identifies the resource instances that are members of the group. */
    public GroupBuilder.Impl withMember(@NonNull Collection<Group.Member> member) {
      this.member = Collections.unmodifiableCollection(member);
      return this;
    }

    public GroupBuilder.Impl withMember(@NonNull Group_MemberBuilder... member) {
      this.member = Arrays.stream(member).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param characteristic - Identifies traits whose presence r absence is shared by members of
     *     the group.
     */
    public GroupBuilder.Impl withCharacteristic(@NonNull Group.Characteristic... characteristic) {
      this.characteristic = Arrays.asList(characteristic);
      return this;
    }
    /**
     * @param characteristic - Identifies traits whose presence r absence is shared by members of
     *     the group.
     */
    public GroupBuilder.Impl withCharacteristic(
        @NonNull Collection<Group.Characteristic> characteristic) {
      this.characteristic = Collections.unmodifiableCollection(characteristic);
      return this;
    }

    public GroupBuilder.Impl withCharacteristic(
        @NonNull Group_CharacteristicBuilder... characteristic) {
      this.characteristic = Arrays.stream(characteristic).map(e -> e.build()).collect(toList());
      return this;
    }

    public GroupBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Group build() {
      return new Group(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(code),
          OptionConverters.toScala(name),
          OptionConverters.toScala(active.map(x -> (Object) x)),
          actual,
          OptionConverters.toScala(language),
          OptionConverters.toScala(quantity.map(x -> (Object) x)),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(managingEntity),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          member.stream().collect(new LitSeqJCollector<>()),
          characteristic.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
