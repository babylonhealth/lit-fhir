package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.CONTRIBUTOR_TYPE;
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

public interface ContributorBuilder extends ElementBuilder {
  public Contributor build();

  public static Impl init(CONTRIBUTOR_TYPE _type, String name) {
    return new Impl(_type, name);
  }

  public static Impl builder(CONTRIBUTOR_TYPE _type, String name) {
    return new Impl(_type, name);
  }

  public class Impl implements ContributorBuilder {
    private Optional<String> id = Optional.empty();
    private CONTRIBUTOR_TYPE _type;
    private String name;
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();

    /**
     * Required fields for {@link Contributor}
     *
     * @param _type - The type of contributor.
     * @param name - The name of the individual or organization responsible for the contribution.
     */
    public Impl(CONTRIBUTOR_TYPE _type, String name) {
      this._type = _type;
      this.name = name;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ContributorBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     contributor.
     */
    public ContributorBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     contributor.
     */
    public ContributorBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public ContributorBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ContributorBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ContributorBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ContributorBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Contributor build() {
      return new Contributor(
          OptionConverters.toScala(id),
          _type,
          name,
          contact.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
