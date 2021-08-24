package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface AnnotationBuilder extends DataTypeBuilder {
  public Annotation build();

  public static Impl init(String text) {
    return new Impl(text);
  }

  public static Impl builder(String text) {
    return new Impl(text);
  }

  public static ChoiceReferenceOrString author(Reference r) {
    return new ChoiceReferenceOrString(r);
  }

  public static ChoiceReferenceOrString author(String s) {
    return new ChoiceReferenceOrString(s);
  }

  public class Impl implements AnnotationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<FHIRDateTime> time = Optional.empty();
    private String text;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceReferenceOrString> author = Optional.empty();

    /**
     * Required fields for {@link Annotation}
     *
     * @param text - The text of the annotation in markdown format.
     */
    public Impl(String text) {
      this.text = text;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public AnnotationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param time - Indicates when this particular annotation was made. */
    public AnnotationBuilder.Impl withTime(@NonNull FHIRDateTime time) {
      this.time = Optional.of(time);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public AnnotationBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public AnnotationBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AnnotationBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - The individual responsible for making the annotation. Field is a 'choice'
     *     field. Type should be one of Reference, String. To pass the value in, wrap with one of
     *     the AnnotationBuilder.author static methods
     */
    public AnnotationBuilder.Impl withAuthor(@NonNull ChoiceReferenceOrString author) {
      this.author = Optional.of(author);
      return this;
    }

    public Annotation build() {
      return new Annotation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(time),
          text,
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(author),
          LitUtils.emptyMetaElMap());
    }
  }
}
