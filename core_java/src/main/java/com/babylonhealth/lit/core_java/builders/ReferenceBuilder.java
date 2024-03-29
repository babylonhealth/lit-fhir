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

public interface ReferenceBuilder extends ElementBuilder {
  public Reference build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ReferenceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> _type = Optional.empty();
    private Optional<String> display = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> reference = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();

    /** Required fields for {@link Reference} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ReferenceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _type - The expected type of the target of the reference. If both Reference.type and
     *     Reference.reference are populated and Reference.reference is a FHIR URL, both SHALL be
     *     consistent.
     *     <p>The type is the Canonical URL of Resource Definition that is the type this reference
     *     refers to. References are URLs that are relative to
     *     http://hl7.org/fhir/StructureDefinition/ e.g. "Patient" is a reference to
     *     http://hl7.org/fhir/StructureDefinition/Patient. Absolute URLs are only allowed for
     *     logical models (and can only be used in references in logical models, not resources).
     */
    public ReferenceBuilder.Impl withType(@NonNull String _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /**
     * @param display - Plain text narrative that identifies the resource in addition to the
     *     resource reference.
     */
    public ReferenceBuilder.Impl withDisplay(@NonNull String display) {
      this.display = Optional.of(display);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ReferenceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ReferenceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ReferenceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param reference - A reference to a location at which the other resource is found. The
     *     reference may be a relative reference, in which case it is relative to the service base
     *     URL, or an absolute URL that resolves to the location where the resource is found. The
     *     reference may be version specific or not. If the reference is not to a FHIR RESTful
     *     server, then it should be assumed to be version specific. Internal fragment references
     *     (start with '#') refer to contained resources.
     */
    public ReferenceBuilder.Impl withReference(@NonNull String reference) {
      this.reference = Optional.of(reference);
      return this;
    }
    /**
     * @param identifier - An identifier for the target resource. This is used when there is no way
     *     to reference the other resource directly, either because the entity it represents is not
     *     available through a FHIR server, or because there is no way for the author of the
     *     resource to convert a known identifier to an actual location. There is no requirement
     *     that a Reference.identifier point to something that is actually exposed as a FHIR
     *     instance, but it SHALL point to a business concept that would be expected to be exposed
     *     as a FHIR instance, and that instance would need to be of a FHIR resource type allowed by
     *     the reference.
     */
    public ReferenceBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public ReferenceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }

    public Reference build() {
      return new Reference(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(display),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(reference),
          OptionConverters.toScala(identifier),
          LitUtils.emptyMetaElMap());
    }
  }
}
