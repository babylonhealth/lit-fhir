package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CONCEPTMAP_UNMAPPED_MODE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ConceptMap_Group_UnmappedBuilder {
  public ConceptMap$Group$Unmapped build();

  public static Impl init(CONCEPTMAP_UNMAPPED_MODE mode) {
    return new Impl(mode);
  }

  public static Impl builder(CONCEPTMAP_UNMAPPED_MODE mode) {
    return new Impl(mode);
  }

  public class Impl implements ConceptMap_Group_UnmappedBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private CONCEPTMAP_UNMAPPED_MODE mode;
    private Optional<String> code = Optional.empty();
    private Optional<String> display = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ConceptMap$Group$Unmapped}
     *
     * @param mode
     */
    public Impl(CONCEPTMAP_UNMAPPED_MODE mode) {
      this.mode = mode;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ConceptMap_Group_UnmappedBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this concept map when it is referenced
     *     in a specification, model, design or an instance; also called its canonical identifier.
     *     This SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this concept map is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the concept map is stored
     *     on different servers.
     */
    public ConceptMap_Group_UnmappedBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /** @param code */
    public ConceptMap_Group_UnmappedBuilder.Impl withCode(@NonNull String code) {
      this.code = Optional.of(code);
      return this;
    }
    /** @param display */
    public ConceptMap_Group_UnmappedBuilder.Impl withDisplay(@NonNull String display) {
      this.display = Optional.of(display);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ConceptMap_Group_UnmappedBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ConceptMap_Group_UnmappedBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ConceptMap_Group_UnmappedBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public ConceptMap_Group_UnmappedBuilder.Impl withModifierExtension(
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
    public ConceptMap_Group_UnmappedBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ConceptMap_Group_UnmappedBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ConceptMap$Group$Unmapped build() {
      return new ConceptMap$Group$Unmapped(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          mode,
          OptionConverters.toScala(code),
          OptionConverters.toScala(display),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
