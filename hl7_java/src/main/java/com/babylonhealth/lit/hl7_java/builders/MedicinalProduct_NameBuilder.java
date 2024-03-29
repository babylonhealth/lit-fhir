package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

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

public interface MedicinalProduct_NameBuilder {
  public MedicinalProduct.Name build();

  public static Impl init(String productName) {
    return new Impl(productName);
  }

  public static Impl builder(String productName) {
    return new Impl(productName);
  }

  public class Impl implements MedicinalProduct_NameBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private String productName;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MedicinalProduct$Name$NamePart> namePart = Collections.emptyList();
    private Collection<MedicinalProduct$Name$CountryLanguage> countryLanguage =
        Collections.emptyList();

    /**
     * Required fields for {@link MedicinalProduct.Name}
     *
     * @param productName
     */
    public Impl(String productName) {
      this.productName = productName;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProduct_NameBuilder.Impl withId(@NonNull String id) {
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
    public MedicinalProduct_NameBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicinalProduct_NameBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProduct_NameBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
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
    public MedicinalProduct_NameBuilder.Impl withModifierExtension(
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
    public MedicinalProduct_NameBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProduct_NameBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param namePart */
    public MedicinalProduct_NameBuilder.Impl withNamePart(
        @NonNull MedicinalProduct$Name$NamePart... namePart) {
      this.namePart = Arrays.asList(namePart);
      return this;
    }
    /** @param namePart */
    public MedicinalProduct_NameBuilder.Impl withNamePart(
        @NonNull Collection<MedicinalProduct$Name$NamePart> namePart) {
      this.namePart = Collections.unmodifiableCollection(namePart);
      return this;
    }

    public MedicinalProduct_NameBuilder.Impl withNamePart(
        @NonNull MedicinalProduct_Name_NamePartBuilder... namePart) {
      this.namePart = Arrays.stream(namePart).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param countryLanguage */
    public MedicinalProduct_NameBuilder.Impl withCountryLanguage(
        @NonNull MedicinalProduct$Name$CountryLanguage... countryLanguage) {
      this.countryLanguage = Arrays.asList(countryLanguage);
      return this;
    }
    /** @param countryLanguage */
    public MedicinalProduct_NameBuilder.Impl withCountryLanguage(
        @NonNull Collection<MedicinalProduct$Name$CountryLanguage> countryLanguage) {
      this.countryLanguage = Collections.unmodifiableCollection(countryLanguage);
      return this;
    }

    public MedicinalProduct_NameBuilder.Impl withCountryLanguage(
        @NonNull MedicinalProduct_Name_CountryLanguageBuilder... countryLanguage) {
      this.countryLanguage = Arrays.stream(countryLanguage).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProduct.Name build() {
      return new MedicinalProduct.Name(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          productName,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          namePart.stream().collect(new LitSeqJCollector<>()),
          countryLanguage.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
