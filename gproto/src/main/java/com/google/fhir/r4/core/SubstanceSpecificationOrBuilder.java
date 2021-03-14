// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/substance_specification.proto

package com.google.fhir.r4.core;

public interface SubstanceSpecificationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.SubstanceSpecification)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   *
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   *
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   *
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   *
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   *
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   *
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   *
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> getContainedList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> getContainedOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getModifierExtensionList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder>
      getModifierExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Identifier by which this substance is known
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   *
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier by which this substance is known
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   *
   * @return The identifier.
   */
  com.google.fhir.r4.core.Identifier getIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier by which this substance is known
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * High level categorization, e.g. polymer or nucleic acid
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 11;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * High level categorization, e.g. polymer or nucleic acid
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 11;</code>
   *
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * High level categorization, e.g. polymer or nucleic acid
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 11;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Status of substance within the catalogue e.g. approved
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status = 12;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Status of substance within the catalogue e.g. approved
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status = 12;</code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.CodeableConcept getStatus();
  /**
   *
   *
   * <pre>
   * Status of substance within the catalogue e.g. approved
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * If the substance applies to only human or veterinary use
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept domain = 13;</code>
   *
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   *
   *
   * <pre>
   * If the substance applies to only human or veterinary use
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept domain = 13;</code>
   *
   * @return The domain.
   */
  com.google.fhir.r4.core.CodeableConcept getDomain();
  /**
   *
   *
   * <pre>
   * If the substance applies to only human or veterinary use
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept domain = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getDomainOrBuilder();

  /**
   *
   *
   * <pre>
   * Textual description of the substance
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 14;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Textual description of the substance
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 14;</code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.String getDescription();
  /**
   *
   *
   * <pre>
   * Textual description of the substance
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 14;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Supporting literature
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference source = 15 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getSourceList();
  /**
   *
   *
   * <pre>
   * Supporting literature
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference source = 15 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getSource(int index);
  /**
   *
   *
   * <pre>
   * Supporting literature
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference source = 15 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  int getSourceCount();
  /**
   *
   *
   * <pre>
   * Supporting literature
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference source = 15 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getSourceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Supporting literature
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference source = 15 [(.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSourceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Textual comment about this record of a substance
   * </pre>
   *
   * <code>.google.fhir.r4.core.String comment = 16;</code>
   *
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   *
   *
   * <pre>
   * Textual comment about this record of a substance
   * </pre>
   *
   * <code>.google.fhir.r4.core.String comment = 16;</code>
   *
   * @return The comment.
   */
  com.google.fhir.r4.core.String getComment();
  /**
   *
   *
   * <pre>
   * Textual comment about this record of a substance
   * </pre>
   *
   * <code>.google.fhir.r4.core.String comment = 16;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getCommentOrBuilder();

  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Moiety moiety = 17;</code> */
  java.util.List<com.google.fhir.r4.core.SubstanceSpecification.Moiety> getMoietyList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Moiety moiety = 17;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.Moiety getMoiety(int index);
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Moiety moiety = 17;</code> */
  int getMoietyCount();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Moiety moiety = 17;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SubstanceSpecification.MoietyOrBuilder>
      getMoietyOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Moiety moiety = 17;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.MoietyOrBuilder getMoietyOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Property property = 18;</code> */
  java.util.List<com.google.fhir.r4.core.SubstanceSpecification.Property> getPropertyList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Property property = 18;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.Property getProperty(int index);
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Property property = 18;</code> */
  int getPropertyCount();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Property property = 18;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SubstanceSpecification.PropertyOrBuilder>
      getPropertyOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Property property = 18;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.PropertyOrBuilder getPropertyOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * General information detailing this substance
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference reference_information = 19 [(.google.fhir.proto.valid_reference_type) = "SubstanceReferenceInformation"];
   * </code>
   *
   * @return Whether the referenceInformation field is set.
   */
  boolean hasReferenceInformation();
  /**
   *
   *
   * <pre>
   * General information detailing this substance
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference reference_information = 19 [(.google.fhir.proto.valid_reference_type) = "SubstanceReferenceInformation"];
   * </code>
   *
   * @return The referenceInformation.
   */
  com.google.fhir.r4.core.Reference getReferenceInformation();
  /**
   *
   *
   * <pre>
   * General information detailing this substance
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference reference_information = 19 [(.google.fhir.proto.valid_reference_type) = "SubstanceReferenceInformation"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReferenceInformationOrBuilder();

  /**
   * <code>.google.fhir.r4.core.SubstanceSpecification.Structure structure = 20;</code>
   *
   * @return Whether the structure field is set.
   */
  boolean hasStructure();
  /**
   * <code>.google.fhir.r4.core.SubstanceSpecification.Structure structure = 20;</code>
   *
   * @return The structure.
   */
  com.google.fhir.r4.core.SubstanceSpecification.Structure getStructure();
  /** <code>.google.fhir.r4.core.SubstanceSpecification.Structure structure = 20;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.StructureOrBuilder getStructureOrBuilder();

  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.CodeType code = 21;</code> */
  java.util.List<com.google.fhir.r4.core.SubstanceSpecification.CodeType> getCodeList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.CodeType code = 21;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.CodeType getCode(int index);
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.CodeType code = 21;</code> */
  int getCodeCount();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.CodeType code = 21;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SubstanceSpecification.CodeTypeOrBuilder>
      getCodeOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.CodeType code = 21;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.CodeTypeOrBuilder getCodeOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Name name = 22;</code> */
  java.util.List<com.google.fhir.r4.core.SubstanceSpecification.Name> getNameList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Name name = 22;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.Name getName(int index);
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Name name = 22;</code> */
  int getNameCount();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Name name = 22;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SubstanceSpecification.NameOrBuilder>
      getNameOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SubstanceSpecification.Name name = 22;</code> */
  com.google.fhir.r4.core.SubstanceSpecification.NameOrBuilder getNameOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The molecular weight or weight range (for proteins, polymers or nucleic
   * acids)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight molecular_weight = 23;
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight>
      getMolecularWeightList();
  /**
   *
   *
   * <pre>
   * The molecular weight or weight range (for proteins, polymers or nucleic
   * acids)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight molecular_weight = 23;
   * </code>
   */
  com.google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight
      getMolecularWeight(int index);
  /**
   *
   *
   * <pre>
   * The molecular weight or weight range (for proteins, polymers or nucleic
   * acids)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight molecular_weight = 23;
   * </code>
   */
  int getMolecularWeightCount();
  /**
   *
   *
   * <pre>
   * The molecular weight or weight range (for proteins, polymers or nucleic
   * acids)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight molecular_weight = 23;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.fhir.r4.core.SubstanceSpecification.Structure.Isotope
                  .MolecularWeightOrBuilder>
      getMolecularWeightOrBuilderList();
  /**
   *
   *
   * <pre>
   * The molecular weight or weight range (for proteins, polymers or nucleic
   * acids)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeight molecular_weight = 23;
   * </code>
   */
  com.google.fhir.r4.core.SubstanceSpecification.Structure.Isotope.MolecularWeightOrBuilder
      getMolecularWeightOrBuilder(int index);

  /**
   * <code>repeated .google.fhir.r4.core.SubstanceSpecification.Relationship relationship = 24;
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.SubstanceSpecification.Relationship> getRelationshipList();
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceSpecification.Relationship relationship = 24;
   * </code>
   */
  com.google.fhir.r4.core.SubstanceSpecification.Relationship getRelationship(int index);
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceSpecification.Relationship relationship = 24;
   * </code>
   */
  int getRelationshipCount();
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceSpecification.Relationship relationship = 24;
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.SubstanceSpecification.RelationshipOrBuilder>
      getRelationshipOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceSpecification.Relationship relationship = 24;
   * </code>
   */
  com.google.fhir.r4.core.SubstanceSpecification.RelationshipOrBuilder getRelationshipOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Data items specific to nucleic acids
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference nucleic_acid = 25 [(.google.fhir.proto.valid_reference_type) = "SubstanceNucleicAcid"];
   * </code>
   *
   * @return Whether the nucleicAcid field is set.
   */
  boolean hasNucleicAcid();
  /**
   *
   *
   * <pre>
   * Data items specific to nucleic acids
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference nucleic_acid = 25 [(.google.fhir.proto.valid_reference_type) = "SubstanceNucleicAcid"];
   * </code>
   *
   * @return The nucleicAcid.
   */
  com.google.fhir.r4.core.Reference getNucleicAcid();
  /**
   *
   *
   * <pre>
   * Data items specific to nucleic acids
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference nucleic_acid = 25 [(.google.fhir.proto.valid_reference_type) = "SubstanceNucleicAcid"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getNucleicAcidOrBuilder();

  /**
   *
   *
   * <pre>
   * Data items specific to polymers
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference polymer = 26 [(.google.fhir.proto.valid_reference_type) = "SubstancePolymer"];
   * </code>
   *
   * @return Whether the polymer field is set.
   */
  boolean hasPolymer();
  /**
   *
   *
   * <pre>
   * Data items specific to polymers
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference polymer = 26 [(.google.fhir.proto.valid_reference_type) = "SubstancePolymer"];
   * </code>
   *
   * @return The polymer.
   */
  com.google.fhir.r4.core.Reference getPolymer();
  /**
   *
   *
   * <pre>
   * Data items specific to polymers
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference polymer = 26 [(.google.fhir.proto.valid_reference_type) = "SubstancePolymer"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPolymerOrBuilder();

  /**
   *
   *
   * <pre>
   * Data items specific to proteins
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference protein = 27 [(.google.fhir.proto.valid_reference_type) = "SubstanceProtein"];
   * </code>
   *
   * @return Whether the protein field is set.
   */
  boolean hasProtein();
  /**
   *
   *
   * <pre>
   * Data items specific to proteins
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference protein = 27 [(.google.fhir.proto.valid_reference_type) = "SubstanceProtein"];
   * </code>
   *
   * @return The protein.
   */
  com.google.fhir.r4.core.Reference getProtein();
  /**
   *
   *
   * <pre>
   * Data items specific to proteins
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference protein = 27 [(.google.fhir.proto.valid_reference_type) = "SubstanceProtein"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getProteinOrBuilder();

  /**
   *
   *
   * <pre>
   * Material or taxonomic/anatomical source for the substance
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference source_material = 28 [(.google.fhir.proto.valid_reference_type) = "SubstanceSourceMaterial"];
   * </code>
   *
   * @return Whether the sourceMaterial field is set.
   */
  boolean hasSourceMaterial();
  /**
   *
   *
   * <pre>
   * Material or taxonomic/anatomical source for the substance
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference source_material = 28 [(.google.fhir.proto.valid_reference_type) = "SubstanceSourceMaterial"];
   * </code>
   *
   * @return The sourceMaterial.
   */
  com.google.fhir.r4.core.Reference getSourceMaterial();
  /**
   *
   *
   * <pre>
   * Material or taxonomic/anatomical source for the substance
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference source_material = 28 [(.google.fhir.proto.valid_reference_type) = "SubstanceSourceMaterial"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSourceMaterialOrBuilder();
}