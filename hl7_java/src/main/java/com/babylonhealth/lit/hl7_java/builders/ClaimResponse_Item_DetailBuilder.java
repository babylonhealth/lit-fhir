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

public interface ClaimResponse_Item_DetailBuilder {
  public ClaimResponse$Item$Detail build();

  public static Impl init(
      Collection<ClaimResponse$Item$Adjudication> adjudication, Integer detailSequence) {
    return new Impl(adjudication, detailSequence);
  }

  public static Impl builder(
      Collection<ClaimResponse_Item_AdjudicationBuilder> adjudication, Integer detailSequence) {
    return new Impl(
        new LitSeq<>(adjudication).map(ClaimResponse_Item_AdjudicationBuilder::build),
        detailSequence);
  }

  public class Impl implements ClaimResponse_Item_DetailBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Collection<ClaimResponse$Item$Adjudication> adjudication;
    private Integer detailSequence;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ClaimResponse$Item$Detail$SubDetail> subDetail = Collections.emptyList();

    /**
     * Required fields for {@link ClaimResponse$Item$Detail}
     *
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     * @param detailSequence
     */
    public Impl(Collection<ClaimResponse$Item$Adjudication> adjudication, Integer detailSequence) {
      this.adjudication = adjudication;
      this.detailSequence = detailSequence;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClaimResponse_Item_DetailBuilder.Impl withId(@NonNull String id) {
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
    public ClaimResponse_Item_DetailBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClaimResponse_Item_DetailBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClaimResponse_Item_DetailBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param noteNumber */
    public ClaimResponse_Item_DetailBuilder.Impl withNoteNumber(@NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ClaimResponse_Item_DetailBuilder.Impl withNoteNumber(
        @NonNull Collection<Integer> noteNumber) {
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
    public ClaimResponse_Item_DetailBuilder.Impl withModifierExtension(
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
    public ClaimResponse_Item_DetailBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClaimResponse_Item_DetailBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subDetail */
    public ClaimResponse_Item_DetailBuilder.Impl withSubDetail(
        @NonNull ClaimResponse$Item$Detail$SubDetail... subDetail) {
      this.subDetail = Arrays.asList(subDetail);
      return this;
    }
    /** @param subDetail */
    public ClaimResponse_Item_DetailBuilder.Impl withSubDetail(
        @NonNull Collection<ClaimResponse$Item$Detail$SubDetail> subDetail) {
      this.subDetail = Collections.unmodifiableCollection(subDetail);
      return this;
    }

    public ClaimResponse_Item_DetailBuilder.Impl withSubDetail(
        @NonNull ClaimResponse_Item_Detail_SubDetailBuilder... subDetail) {
      this.subDetail = Arrays.stream(subDetail).map(e -> e.build()).collect(toList());
      return this;
    }

    public ClaimResponse$Item$Detail build() {
      return new ClaimResponse$Item$Detail(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          noteNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          adjudication.stream().collect(new NonEmptyLitSeqJCollector<>()),
          detailSequence,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          subDetail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
