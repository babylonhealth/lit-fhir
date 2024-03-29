package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
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

public interface ImagingStudy_SeriesBuilder {
  public ImagingStudy.Series build();

  public static Impl init(String uid, Coding modality) {
    return new Impl(uid, modality);
  }

  public static Impl builder(String uid, CodingBuilder modality) {
    return new Impl(uid, modality.build());
  }

  public class Impl implements ImagingStudy_SeriesBuilder {
    private Optional<String> id = Optional.empty();
    private String uid;
    private Optional<Integer> number = Optional.empty();
    private Optional<FHIRDateTime> started = Optional.empty();
    private Coding modality;
    private Collection<Reference> endpoint = Collections.emptyList();
    private Optional<Coding> bodySite = Optional.empty();
    private Collection<Reference> specimen = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Coding> laterality = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Integer> numberOfInstances = Optional.empty();
    private Collection<ImagingStudy$Series$Instance> instance = Collections.emptyList();
    private Collection<ImagingStudy$Series$Performer> performer = Collections.emptyList();

    /**
     * Required fields for {@link ImagingStudy.Series}
     *
     * @param uid
     * @param modality - A list of all the series.modality values that are actual acquisition
     *     modalities, i.e. those in the DICOM Context Group 29 (value set OID
     *     1.2.840.10008.6.1.19).
     */
    public Impl(String uid, Coding modality) {
      this.uid = uid;
      this.modality = modality;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ImagingStudy_SeriesBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param number */
    public ImagingStudy_SeriesBuilder.Impl withNumber(@NonNull Integer number) {
      this.number = Optional.of(number);
      return this;
    }
    /** @param started - Date and time the study started. */
    public ImagingStudy_SeriesBuilder.Impl withStarted(@NonNull FHIRDateTime started) {
      this.started = Optional.of(started);
      return this;
    }
    /**
     * @param endpoint - The network service providing access (e.g., query, view, or retrieval) for
     *     the study. See implementation notes for information about using DICOM endpoints. A
     *     study-level endpoint applies to each series in the study, unless overridden by a
     *     series-level endpoint with the same Endpoint.connectionType.
     */
    public ImagingStudy_SeriesBuilder.Impl withEndpoint(@NonNull Reference... endpoint) {
      this.endpoint = Arrays.asList(endpoint);
      return this;
    }
    /**
     * @param endpoint - The network service providing access (e.g., query, view, or retrieval) for
     *     the study. See implementation notes for information about using DICOM endpoints. A
     *     study-level endpoint applies to each series in the study, unless overridden by a
     *     series-level endpoint with the same Endpoint.connectionType.
     */
    public ImagingStudy_SeriesBuilder.Impl withEndpoint(@NonNull Collection<Reference> endpoint) {
      this.endpoint = Collections.unmodifiableCollection(endpoint);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withEndpoint(@NonNull ReferenceBuilder... endpoint) {
      this.endpoint = Arrays.stream(endpoint).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param bodySite */
    public ImagingStudy_SeriesBuilder.Impl withBodySite(@NonNull Coding bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withBodySite(@NonNull CodingBuilder bodySite) {
      this.bodySite = Optional.of(bodySite.build());
      return this;
    }
    /** @param specimen */
    public ImagingStudy_SeriesBuilder.Impl withSpecimen(@NonNull Reference... specimen) {
      this.specimen = Arrays.asList(specimen);
      return this;
    }
    /** @param specimen */
    public ImagingStudy_SeriesBuilder.Impl withSpecimen(@NonNull Collection<Reference> specimen) {
      this.specimen = Collections.unmodifiableCollection(specimen);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withSpecimen(@NonNull ReferenceBuilder... specimen) {
      this.specimen = Arrays.stream(specimen).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ImagingStudy_SeriesBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ImagingStudy_SeriesBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param laterality */
    public ImagingStudy_SeriesBuilder.Impl withLaterality(@NonNull Coding laterality) {
      this.laterality = Optional.of(laterality);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withLaterality(@NonNull CodingBuilder laterality) {
      this.laterality = Optional.of(laterality.build());
      return this;
    }
    /**
     * @param description - The Imaging Manager description of the study. Institution-generated
     *     description or classification of the Study (component) performed.
     */
    public ImagingStudy_SeriesBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
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
    public ImagingStudy_SeriesBuilder.Impl withModifierExtension(
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
    public ImagingStudy_SeriesBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param numberOfInstances - Number of SOP Instances in Study. This value given may be larger
     *     than the number of instance elements this resource contains due to resource availability,
     *     security, or other factors. This element should be present if any instance elements are
     *     present.
     */
    public ImagingStudy_SeriesBuilder.Impl withNumberOfInstances(
        @NonNull Integer numberOfInstances) {
      this.numberOfInstances = Optional.of(numberOfInstances);
      return this;
    }
    /** @param instance */
    public ImagingStudy_SeriesBuilder.Impl withInstance(
        @NonNull ImagingStudy$Series$Instance... instance) {
      this.instance = Arrays.asList(instance);
      return this;
    }
    /** @param instance */
    public ImagingStudy_SeriesBuilder.Impl withInstance(
        @NonNull Collection<ImagingStudy$Series$Instance> instance) {
      this.instance = Collections.unmodifiableCollection(instance);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withInstance(
        @NonNull ImagingStudy_Series_InstanceBuilder... instance) {
      this.instance = Arrays.stream(instance).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performer */
    public ImagingStudy_SeriesBuilder.Impl withPerformer(
        @NonNull ImagingStudy$Series$Performer... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer */
    public ImagingStudy_SeriesBuilder.Impl withPerformer(
        @NonNull Collection<ImagingStudy$Series$Performer> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public ImagingStudy_SeriesBuilder.Impl withPerformer(
        @NonNull ImagingStudy_Series_PerformerBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }

    public ImagingStudy.Series build() {
      return new ImagingStudy.Series(
          OptionConverters.toScala(id),
          uid,
          OptionConverters.toScala(number.map(x -> (Object) x)),
          OptionConverters.toScala(started),
          modality,
          endpoint.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(bodySite),
          specimen.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(laterality),
          OptionConverters.toScala(description),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(numberOfInstances.map(x -> (Object) x)),
          instance.stream().collect(new LitSeqJCollector<>()),
          performer.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
