// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface SubstanceAmountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.SubstanceAmount)
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
   * <code>.google.fhir.r4.core.SubstanceAmount.AmountX amount = 4;</code>
   *
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.google.fhir.r4.core.SubstanceAmount.AmountX amount = 4;</code>
   *
   * @return The amount.
   */
  com.google.fhir.r4.core.SubstanceAmount.AmountX getAmount();
  /** <code>.google.fhir.r4.core.SubstanceAmount.AmountX amount = 4;</code> */
  com.google.fhir.r4.core.SubstanceAmount.AmountXOrBuilder getAmountOrBuilder();

  /**
   *
   *
   * <pre>
   * Most elements that require a quantitative value will also have a field
   * called amount type. Amount type should always be specified because the
   * actual value of the amount is often dependent on it. EXAMPLE: In capturing
   * the actual relative amounts of substances or molecular fragments it is
   * essential to indicate whether the amount refers to a mole ratio or weight
   * ratio. For any given element an effort should be made to use same the
   * amount type for all related definitional elements
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept amount_type = 5;</code>
   *
   * @return Whether the amountType field is set.
   */
  boolean hasAmountType();
  /**
   *
   *
   * <pre>
   * Most elements that require a quantitative value will also have a field
   * called amount type. Amount type should always be specified because the
   * actual value of the amount is often dependent on it. EXAMPLE: In capturing
   * the actual relative amounts of substances or molecular fragments it is
   * essential to indicate whether the amount refers to a mole ratio or weight
   * ratio. For any given element an effort should be made to use same the
   * amount type for all related definitional elements
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept amount_type = 5;</code>
   *
   * @return The amountType.
   */
  com.google.fhir.r4.core.CodeableConcept getAmountType();
  /**
   *
   *
   * <pre>
   * Most elements that require a quantitative value will also have a field
   * called amount type. Amount type should always be specified because the
   * actual value of the amount is often dependent on it. EXAMPLE: In capturing
   * the actual relative amounts of substances or molecular fragments it is
   * essential to indicate whether the amount refers to a mole ratio or weight
   * ratio. For any given element an effort should be made to use same the
   * amount type for all related definitional elements
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept amount_type = 5;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getAmountTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * A textual comment on a numeric value
   * </pre>
   *
   * <code>.google.fhir.r4.core.String amount_text = 6;</code>
   *
   * @return Whether the amountText field is set.
   */
  boolean hasAmountText();
  /**
   *
   *
   * <pre>
   * A textual comment on a numeric value
   * </pre>
   *
   * <code>.google.fhir.r4.core.String amount_text = 6;</code>
   *
   * @return The amountText.
   */
  com.google.fhir.r4.core.String getAmountText();
  /**
   *
   *
   * <pre>
   * A textual comment on a numeric value
   * </pre>
   *
   * <code>.google.fhir.r4.core.String amount_text = 6;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getAmountTextOrBuilder();

  /**
   * <code>.google.fhir.r4.core.SubstanceAmount.ReferenceRange reference_range = 7;</code>
   *
   * @return Whether the referenceRange field is set.
   */
  boolean hasReferenceRange();
  /**
   * <code>.google.fhir.r4.core.SubstanceAmount.ReferenceRange reference_range = 7;</code>
   *
   * @return The referenceRange.
   */
  com.google.fhir.r4.core.SubstanceAmount.ReferenceRange getReferenceRange();
  /** <code>.google.fhir.r4.core.SubstanceAmount.ReferenceRange reference_range = 7;</code> */
  com.google.fhir.r4.core.SubstanceAmount.ReferenceRangeOrBuilder getReferenceRangeOrBuilder();
}
