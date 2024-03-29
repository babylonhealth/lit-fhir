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
import java.util.stream.Collectors;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ClaimResponse_ItemBuilder {
  public ClaimResponse.Item build();

  public static Impl init(
      Integer itemSequence, Collection<ClaimResponse$Item$Adjudication> adjudication) {
    return new Impl(itemSequence, adjudication);
  }

  public static Impl builder(
      Integer itemSequence, Collection<ClaimResponse_Item_AdjudicationBuilder> adjudication) {
    return new Impl(
        itemSequence,
        new LitSeq<>(adjudication).map(ClaimResponse_Item_AdjudicationBuilder::build));
  }

  public class Impl implements ClaimResponse_ItemBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Integer itemSequence;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ClaimResponse$Item$Adjudication> adjudication;
    private Collection<ClaimResponse$Item$Detail> detail = Collections.emptyList();

    /**
     * Required fields for {@link ClaimResponse.Item}
     *
     * @param itemSequence
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public Impl(Integer itemSequence, Collection<ClaimResponse$Item$Adjudication> adjudication) {
      this.itemSequence = itemSequence;
      this.adjudication = adjudication;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClaimResponse_ItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ClaimResponse_ItemBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClaimResponse_ItemBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClaimResponse_ItemBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param noteNumber */
    public ClaimResponse_ItemBuilder.Impl withNoteNumber(@NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ClaimResponse_ItemBuilder.Impl withNoteNumber(@NonNull Collection<Integer> noteNumber) {
      this.noteNumber = Collections.unmodifiableCollection(noteNumber);
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
    public ClaimResponse_ItemBuilder.Impl withModifierExtension(
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
    public ClaimResponse_ItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClaimResponse_ItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param detail */
    public ClaimResponse_ItemBuilder.Impl withDetail(@NonNull ClaimResponse$Item$Detail... detail) {
      this.detail = Arrays.asList(detail);
      return this;
    }
    /** @param detail */
    public ClaimResponse_ItemBuilder.Impl withDetail(
        @NonNull Collection<ClaimResponse$Item$Detail> detail) {
      this.detail = Collections.unmodifiableCollection(detail);
      return this;
    }

    public ClaimResponse_ItemBuilder.Impl withDetail(
        @NonNull ClaimResponse_Item_DetailBuilder... detail) {
      this.detail = Arrays.stream(detail).map(e -> e.build()).collect(toList());
      return this;
    }

    public ClaimResponse.Item build() {
      return new ClaimResponse.Item(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          noteNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          itemSequence,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          adjudication.stream().collect(new NonEmptyLitSeqJCollector<>()),
          detail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
