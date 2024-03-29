package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface UsageContextBuilder extends ElementBuilder {
  public UsageContext build();

  public static Impl init(Coding code, @NonNull Choice_1548929031 value) {
    return new Impl(code, value);
  }

  public static Impl builder(CodingBuilder code, @NonNull Choice_1548929031 value) {
    return new Impl(code.build(), value);
  }

  public static Choice_1548929031 value(CodeableConcept c) {
    return new Choice_1548929031(c);
  }

  public static Choice_1548929031 value(Quantity q) {
    return new Choice_1548929031(q);
  }

  public static Choice_1548929031 value(Range r) {
    return new Choice_1548929031(r);
  }

  public static Choice_1548929031 value(Reference r) {
    return new Choice_1548929031(r);
  }

  public class Impl implements UsageContextBuilder {
    private Optional<String> id = Optional.empty();
    private Coding code;
    private Choice_1548929031 value;
    private Collection<Extension> extension = Collections.emptyList();

    /**
     * Required fields for {@link UsageContext}
     *
     * @param code - A code that identifies the type of context being specified by this usage
     *     context.
     * @param value - A value that defines the context specified in this context of use. The
     *     interpretation of the value is defined by the code. Field is a 'choice' field. Type
     *     should be one of CodeableConcept, Quantity, Range, Reference. To pass the value in, wrap
     *     with one of the UsageContextBuilder.value static methods
     */
    public Impl(Coding code, @NonNull Choice_1548929031 value) {
      this.code = code;
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public UsageContextBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public UsageContextBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UsageContextBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UsageContextBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public UsageContext build() {
      return new UsageContext(
          OptionConverters.toScala(id),
          code,
          value,
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
