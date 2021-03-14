// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface PopulationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Population)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getModifierExtensionList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  int getModifierExtensionCount();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder>
      getModifierExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.Population.AgeX age = 4;</code>
   *
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <code>.google.fhir.r4.core.Population.AgeX age = 4;</code>
   *
   * @return The age.
   */
  com.google.fhir.r4.core.Population.AgeX getAge();
  /** <code>.google.fhir.r4.core.Population.AgeX age = 4;</code> */
  com.google.fhir.r4.core.Population.AgeXOrBuilder getAgeOrBuilder();

  /**
   *
   *
   * <pre>
   * The gender of the specific population
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept gender = 5;</code>
   *
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   *
   *
   * <pre>
   * The gender of the specific population
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept gender = 5;</code>
   *
   * @return The gender.
   */
  com.google.fhir.r4.core.CodeableConcept getGender();
  /**
   *
   *
   * <pre>
   * The gender of the specific population
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept gender = 5;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getGenderOrBuilder();

  /**
   *
   *
   * <pre>
   * Race of the specific population
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept race = 6;</code>
   *
   * @return Whether the race field is set.
   */
  boolean hasRace();
  /**
   *
   *
   * <pre>
   * Race of the specific population
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept race = 6;</code>
   *
   * @return The race.
   */
  com.google.fhir.r4.core.CodeableConcept getRace();
  /**
   *
   *
   * <pre>
   * Race of the specific population
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept race = 6;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getRaceOrBuilder();

  /**
   *
   *
   * <pre>
   * The existing physiological conditions of the specific population to which
   * this applies
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept physiological_condition = 7;</code>
   *
   * @return Whether the physiologicalCondition field is set.
   */
  boolean hasPhysiologicalCondition();
  /**
   *
   *
   * <pre>
   * The existing physiological conditions of the specific population to which
   * this applies
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept physiological_condition = 7;</code>
   *
   * @return The physiologicalCondition.
   */
  com.google.fhir.r4.core.CodeableConcept getPhysiologicalCondition();
  /**
   *
   *
   * <pre>
   * The existing physiological conditions of the specific population to which
   * this applies
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept physiological_condition = 7;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPhysiologicalConditionOrBuilder();
}
