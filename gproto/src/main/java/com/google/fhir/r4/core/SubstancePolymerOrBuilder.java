// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/substance_polymer.proto

package com.google.fhir.r4.core;

public interface SubstancePolymerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.SubstancePolymer)
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
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept class_value = 10[json_name = "class"];</code>
   *
   * @return Whether the classValue field is set.
   */
  boolean hasClassValue();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept class_value = 10[json_name = "class"];</code>
   *
   * @return The classValue.
   */
  com.google.fhir.r4.core.CodeableConcept getClassValue();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept class_value = 10[json_name = "class"];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getClassValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept geometry = 11;</code>
   *
   * @return Whether the geometry field is set.
   */
  boolean hasGeometry();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept geometry = 11;</code>
   *
   * @return The geometry.
   */
  com.google.fhir.r4.core.CodeableConcept getGeometry();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept geometry = 11;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getGeometryOrBuilder();

  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept copolymer_connectivity = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCopolymerConnectivityList();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept copolymer_connectivity = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCopolymerConnectivity(int index);
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept copolymer_connectivity = 12;</code>
   */
  int getCopolymerConnectivityCount();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept copolymer_connectivity = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCopolymerConnectivityOrBuilderList();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept copolymer_connectivity = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCopolymerConnectivityOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String modification = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.String> getModificationList();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String modification = 13;</code>
   */
  com.google.fhir.r4.core.String getModification(int index);
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String modification = 13;</code>
   */
  int getModificationCount();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String modification = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.StringOrBuilder> getModificationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Todo
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String modification = 13;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getModificationOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.MonomerSet monomer_set = 14;</code> */
  java.util.List<com.google.fhir.r4.core.SubstancePolymer.MonomerSet> getMonomerSetList();
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.MonomerSet monomer_set = 14;</code> */
  com.google.fhir.r4.core.SubstancePolymer.MonomerSet getMonomerSet(int index);
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.MonomerSet monomer_set = 14;</code> */
  int getMonomerSetCount();
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.MonomerSet monomer_set = 14;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SubstancePolymer.MonomerSetOrBuilder>
      getMonomerSetOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.MonomerSet monomer_set = 14;</code> */
  com.google.fhir.r4.core.SubstancePolymer.MonomerSetOrBuilder getMonomerSetOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.Repeat repeat = 15;</code> */
  java.util.List<com.google.fhir.r4.core.SubstancePolymer.Repeat> getRepeatList();
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.Repeat repeat = 15;</code> */
  com.google.fhir.r4.core.SubstancePolymer.Repeat getRepeat(int index);
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.Repeat repeat = 15;</code> */
  int getRepeatCount();
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.Repeat repeat = 15;</code> */
  java.util.List<? extends com.google.fhir.r4.core.SubstancePolymer.RepeatOrBuilder>
      getRepeatOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.SubstancePolymer.Repeat repeat = 15;</code> */
  com.google.fhir.r4.core.SubstancePolymer.RepeatOrBuilder getRepeatOrBuilder(int index);
}
