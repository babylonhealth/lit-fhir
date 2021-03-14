// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface ElementDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ElementDefinition)
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
   *
   *
   * <pre>
   * Path of the element in the hierarchy of elements
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String path = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   *
   *
   * <pre>
   * Path of the element in the hierarchy of elements
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String path = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The path.
   */
  com.google.fhir.r4.core.String getPath();
  /**
   *
   *
   * <pre>
   * Path of the element in the hierarchy of elements
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String path = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPathOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.ElementDefinition.RepresentationCode representation = 5;
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.ElementDefinition.RepresentationCode>
      getRepresentationList();
  /**
   * <code>repeated .google.fhir.r4.core.ElementDefinition.RepresentationCode representation = 5;
   * </code>
   */
  com.google.fhir.r4.core.ElementDefinition.RepresentationCode getRepresentation(int index);
  /**
   * <code>repeated .google.fhir.r4.core.ElementDefinition.RepresentationCode representation = 5;
   * </code>
   */
  int getRepresentationCount();
  /**
   * <code>repeated .google.fhir.r4.core.ElementDefinition.RepresentationCode representation = 5;
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ElementDefinition.RepresentationCodeOrBuilder>
      getRepresentationOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.ElementDefinition.RepresentationCode representation = 5;
   * </code>
   */
  com.google.fhir.r4.core.ElementDefinition.RepresentationCodeOrBuilder getRepresentationOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Name for this particular element (in a set of slices)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String slice_name = 6;</code>
   *
   * @return Whether the sliceName field is set.
   */
  boolean hasSliceName();
  /**
   *
   *
   * <pre>
   * Name for this particular element (in a set of slices)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String slice_name = 6;</code>
   *
   * @return The sliceName.
   */
  com.google.fhir.r4.core.String getSliceName();
  /**
   *
   *
   * <pre>
   * Name for this particular element (in a set of slices)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String slice_name = 6;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getSliceNameOrBuilder();

  /**
   *
   *
   * <pre>
   * If this slice definition constrains an inherited slice definition (or not)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean slice_is_constraining = 7;</code>
   *
   * @return Whether the sliceIsConstraining field is set.
   */
  boolean hasSliceIsConstraining();
  /**
   *
   *
   * <pre>
   * If this slice definition constrains an inherited slice definition (or not)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean slice_is_constraining = 7;</code>
   *
   * @return The sliceIsConstraining.
   */
  com.google.fhir.r4.core.Boolean getSliceIsConstraining();
  /**
   *
   *
   * <pre>
   * If this slice definition constrains an inherited slice definition (or not)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean slice_is_constraining = 7;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getSliceIsConstrainingOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for element to display with or prompt for element
   * </pre>
   *
   * <code>.google.fhir.r4.core.String label = 8;</code>
   *
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   *
   *
   * <pre>
   * Name for element to display with or prompt for element
   * </pre>
   *
   * <code>.google.fhir.r4.core.String label = 8;</code>
   *
   * @return The label.
   */
  com.google.fhir.r4.core.String getLabel();
  /**
   *
   *
   * <pre>
   * Name for element to display with or prompt for element
   * </pre>
   *
   * <code>.google.fhir.r4.core.String label = 8;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getLabelOrBuilder();

  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding code = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Coding> getCodeList();
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding code = 9;</code>
   */
  com.google.fhir.r4.core.Coding getCode(int index);
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding code = 9;</code>
   */
  int getCodeCount();
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding code = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodingOrBuilder> getCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding code = 9;</code>
   */
  com.google.fhir.r4.core.CodingOrBuilder getCodeOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.Slicing slicing = 10;</code>
   *
   * @return Whether the slicing field is set.
   */
  boolean hasSlicing();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.Slicing slicing = 10;</code>
   *
   * @return The slicing.
   */
  com.google.fhir.r4.core.ElementDefinition.Slicing getSlicing();
  /** <code>.google.fhir.r4.core.ElementDefinition.Slicing slicing = 10;</code> */
  com.google.fhir.r4.core.ElementDefinition.SlicingOrBuilder getSlicingOrBuilder();

  /**
   *
   *
   * <pre>
   * Concise definition for space-constrained presentation
   * </pre>
   *
   * <code>.google.fhir.r4.core.String short = 11;</code>
   *
   * @return Whether the short field is set.
   */
  boolean hasShort();
  /**
   *
   *
   * <pre>
   * Concise definition for space-constrained presentation
   * </pre>
   *
   * <code>.google.fhir.r4.core.String short = 11;</code>
   *
   * @return The short.
   */
  com.google.fhir.r4.core.String getShort();
  /**
   *
   *
   * <pre>
   * Concise definition for space-constrained presentation
   * </pre>
   *
   * <code>.google.fhir.r4.core.String short = 11;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getShortOrBuilder();

  /**
   *
   *
   * <pre>
   * Full formal definition as narrative text
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown definition = 12;</code>
   *
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   *
   *
   * <pre>
   * Full formal definition as narrative text
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown definition = 12;</code>
   *
   * @return The definition.
   */
  com.google.fhir.r4.core.Markdown getDefinition();
  /**
   *
   *
   * <pre>
   * Full formal definition as narrative text
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown definition = 12;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getDefinitionOrBuilder();

  /**
   *
   *
   * <pre>
   * Comments about the use of this element
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown comment = 13;</code>
   *
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   *
   *
   * <pre>
   * Comments about the use of this element
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown comment = 13;</code>
   *
   * @return The comment.
   */
  com.google.fhir.r4.core.Markdown getComment();
  /**
   *
   *
   * <pre>
   * Comments about the use of this element
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown comment = 13;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getCommentOrBuilder();

  /**
   *
   *
   * <pre>
   * Why this resource has been created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown requirements = 14;</code>
   *
   * @return Whether the requirements field is set.
   */
  boolean hasRequirements();
  /**
   *
   *
   * <pre>
   * Why this resource has been created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown requirements = 14;</code>
   *
   * @return The requirements.
   */
  com.google.fhir.r4.core.Markdown getRequirements();
  /**
   *
   *
   * <pre>
   * Why this resource has been created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown requirements = 14;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getRequirementsOrBuilder();

  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 15;</code>
   */
  java.util.List<com.google.fhir.r4.core.String> getAliasList();
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 15;</code>
   */
  com.google.fhir.r4.core.String getAlias(int index);
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 15;</code>
   */
  int getAliasCount();
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 15;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.StringOrBuilder> getAliasOrBuilderList();
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.String alias = 15;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getAliasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Minimum Cardinality
   * </pre>
   *
   * <code>.google.fhir.r4.core.UnsignedInt min = 16;</code>
   *
   * @return Whether the min field is set.
   */
  boolean hasMin();
  /**
   *
   *
   * <pre>
   * Minimum Cardinality
   * </pre>
   *
   * <code>.google.fhir.r4.core.UnsignedInt min = 16;</code>
   *
   * @return The min.
   */
  com.google.fhir.r4.core.UnsignedInt getMin();
  /**
   *
   *
   * <pre>
   * Minimum Cardinality
   * </pre>
   *
   * <code>.google.fhir.r4.core.UnsignedInt min = 16;</code>
   */
  com.google.fhir.r4.core.UnsignedIntOrBuilder getMinOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum Cardinality (a number or *)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String max = 17 [(.google.fhir.proto.fhir_path_constraint) = "empty() or ($this = &#92;'*&#92;') or (toInteger() &gt;= 0)"];
   * </code>
   *
   * @return Whether the max field is set.
   */
  boolean hasMax();
  /**
   *
   *
   * <pre>
   * Maximum Cardinality (a number or *)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String max = 17 [(.google.fhir.proto.fhir_path_constraint) = "empty() or ($this = &#92;'*&#92;') or (toInteger() &gt;= 0)"];
   * </code>
   *
   * @return The max.
   */
  com.google.fhir.r4.core.String getMax();
  /**
   *
   *
   * <pre>
   * Maximum Cardinality (a number or *)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String max = 17 [(.google.fhir.proto.fhir_path_constraint) = "empty() or ($this = &#92;'*&#92;') or (toInteger() &gt;= 0)"];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getMaxOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.Base base = 18;</code>
   *
   * @return Whether the base field is set.
   */
  boolean hasBase();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.Base base = 18;</code>
   *
   * @return The base.
   */
  com.google.fhir.r4.core.ElementDefinition.Base getBase();
  /** <code>.google.fhir.r4.core.ElementDefinition.Base base = 18;</code> */
  com.google.fhir.r4.core.ElementDefinition.BaseOrBuilder getBaseOrBuilder();

  /**
   *
   *
   * <pre>
   * Reference to definition of content for the element
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri content_reference = 19;</code>
   *
   * @return Whether the contentReference field is set.
   */
  boolean hasContentReference();
  /**
   *
   *
   * <pre>
   * Reference to definition of content for the element
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri content_reference = 19;</code>
   *
   * @return The contentReference.
   */
  com.google.fhir.r4.core.Uri getContentReference();
  /**
   *
   *
   * <pre>
   * Reference to definition of content for the element
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri content_reference = 19;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getContentReferenceOrBuilder();

  /** <code>repeated .google.fhir.r4.core.ElementDefinition.TypeRef type = 20;</code> */
  java.util.List<com.google.fhir.r4.core.ElementDefinition.TypeRef> getTypeList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.TypeRef type = 20;</code> */
  com.google.fhir.r4.core.ElementDefinition.TypeRef getType(int index);
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.TypeRef type = 20;</code> */
  int getTypeCount();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.TypeRef type = 20;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ElementDefinition.TypeRefOrBuilder>
      getTypeOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.TypeRef type = 20;</code> */
  com.google.fhir.r4.core.ElementDefinition.TypeRefOrBuilder getTypeOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.DefaultValueX default_value = 21;</code>
   *
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.DefaultValueX default_value = 21;</code>
   *
   * @return The defaultValue.
   */
  com.google.fhir.r4.core.ElementDefinition.DefaultValueX getDefaultValue();
  /** <code>.google.fhir.r4.core.ElementDefinition.DefaultValueX default_value = 21;</code> */
  com.google.fhir.r4.core.ElementDefinition.DefaultValueXOrBuilder getDefaultValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Implicit meaning when this element is missing
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown meaning_when_missing = 22;</code>
   *
   * @return Whether the meaningWhenMissing field is set.
   */
  boolean hasMeaningWhenMissing();
  /**
   *
   *
   * <pre>
   * Implicit meaning when this element is missing
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown meaning_when_missing = 22;</code>
   *
   * @return The meaningWhenMissing.
   */
  com.google.fhir.r4.core.Markdown getMeaningWhenMissing();
  /**
   *
   *
   * <pre>
   * Implicit meaning when this element is missing
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown meaning_when_missing = 22;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getMeaningWhenMissingOrBuilder();

  /**
   *
   *
   * <pre>
   * What the order of the elements means
   * </pre>
   *
   * <code>.google.fhir.r4.core.String order_meaning = 23;</code>
   *
   * @return Whether the orderMeaning field is set.
   */
  boolean hasOrderMeaning();
  /**
   *
   *
   * <pre>
   * What the order of the elements means
   * </pre>
   *
   * <code>.google.fhir.r4.core.String order_meaning = 23;</code>
   *
   * @return The orderMeaning.
   */
  com.google.fhir.r4.core.String getOrderMeaning();
  /**
   *
   *
   * <pre>
   * What the order of the elements means
   * </pre>
   *
   * <code>.google.fhir.r4.core.String order_meaning = 23;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getOrderMeaningOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.FixedX fixed = 24;</code>
   *
   * @return Whether the fixed field is set.
   */
  boolean hasFixed();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.FixedX fixed = 24;</code>
   *
   * @return The fixed.
   */
  com.google.fhir.r4.core.ElementDefinition.FixedX getFixed();
  /** <code>.google.fhir.r4.core.ElementDefinition.FixedX fixed = 24;</code> */
  com.google.fhir.r4.core.ElementDefinition.FixedXOrBuilder getFixedOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.PatternX pattern = 25;</code>
   *
   * @return Whether the pattern field is set.
   */
  boolean hasPattern();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.PatternX pattern = 25;</code>
   *
   * @return The pattern.
   */
  com.google.fhir.r4.core.ElementDefinition.PatternX getPattern();
  /** <code>.google.fhir.r4.core.ElementDefinition.PatternX pattern = 25;</code> */
  com.google.fhir.r4.core.ElementDefinition.PatternXOrBuilder getPatternOrBuilder();

  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Example example = 26;</code> */
  java.util.List<com.google.fhir.r4.core.ElementDefinition.Example> getExampleList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Example example = 26;</code> */
  com.google.fhir.r4.core.ElementDefinition.Example getExample(int index);
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Example example = 26;</code> */
  int getExampleCount();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Example example = 26;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ElementDefinition.ExampleOrBuilder>
      getExampleOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Example example = 26;</code> */
  com.google.fhir.r4.core.ElementDefinition.ExampleOrBuilder getExampleOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.MinValueX min_value = 27;</code>
   *
   * @return Whether the minValue field is set.
   */
  boolean hasMinValue();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.MinValueX min_value = 27;</code>
   *
   * @return The minValue.
   */
  com.google.fhir.r4.core.ElementDefinition.MinValueX getMinValue();
  /** <code>.google.fhir.r4.core.ElementDefinition.MinValueX min_value = 27;</code> */
  com.google.fhir.r4.core.ElementDefinition.MinValueXOrBuilder getMinValueOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.MaxValueX max_value = 28;</code>
   *
   * @return Whether the maxValue field is set.
   */
  boolean hasMaxValue();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.MaxValueX max_value = 28;</code>
   *
   * @return The maxValue.
   */
  com.google.fhir.r4.core.ElementDefinition.MaxValueX getMaxValue();
  /** <code>.google.fhir.r4.core.ElementDefinition.MaxValueX max_value = 28;</code> */
  com.google.fhir.r4.core.ElementDefinition.MaxValueXOrBuilder getMaxValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Max length for strings
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer max_length = 29;</code>
   *
   * @return Whether the maxLength field is set.
   */
  boolean hasMaxLength();
  /**
   *
   *
   * <pre>
   * Max length for strings
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer max_length = 29;</code>
   *
   * @return The maxLength.
   */
  com.google.fhir.r4.core.Integer getMaxLength();
  /**
   *
   *
   * <pre>
   * Max length for strings
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer max_length = 29;</code>
   */
  com.google.fhir.r4.core.IntegerOrBuilder getMaxLengthOrBuilder();

  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Id condition = 30;</code>
   */
  java.util.List<com.google.fhir.r4.core.Id> getConditionList();
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Id condition = 30;</code>
   */
  com.google.fhir.r4.core.Id getCondition(int index);
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Id condition = 30;</code>
   */
  int getConditionCount();
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Id condition = 30;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdOrBuilder> getConditionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Id condition = 30;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getConditionOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Constraint constraint = 31;</code> */
  java.util.List<com.google.fhir.r4.core.ElementDefinition.Constraint> getConstraintList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Constraint constraint = 31;</code> */
  com.google.fhir.r4.core.ElementDefinition.Constraint getConstraint(int index);
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Constraint constraint = 31;</code> */
  int getConstraintCount();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Constraint constraint = 31;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ElementDefinition.ConstraintOrBuilder>
      getConstraintOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Constraint constraint = 31;</code> */
  com.google.fhir.r4.core.ElementDefinition.ConstraintOrBuilder getConstraintOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If the element must be supported
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean must_support = 32;</code>
   *
   * @return Whether the mustSupport field is set.
   */
  boolean hasMustSupport();
  /**
   *
   *
   * <pre>
   * If the element must be supported
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean must_support = 32;</code>
   *
   * @return The mustSupport.
   */
  com.google.fhir.r4.core.Boolean getMustSupport();
  /**
   *
   *
   * <pre>
   * If the element must be supported
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean must_support = 32;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getMustSupportOrBuilder();

  /**
   *
   *
   * <pre>
   * If this modifies the meaning of other elements
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_modifier = 33;</code>
   *
   * @return Whether the isModifier field is set.
   */
  boolean hasIsModifier();
  /**
   *
   *
   * <pre>
   * If this modifies the meaning of other elements
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_modifier = 33;</code>
   *
   * @return The isModifier.
   */
  com.google.fhir.r4.core.Boolean getIsModifier();
  /**
   *
   *
   * <pre>
   * If this modifies the meaning of other elements
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_modifier = 33;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getIsModifierOrBuilder();

  /**
   *
   *
   * <pre>
   * Reason that this element is marked as a modifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String is_modifier_reason = 34;</code>
   *
   * @return Whether the isModifierReason field is set.
   */
  boolean hasIsModifierReason();
  /**
   *
   *
   * <pre>
   * Reason that this element is marked as a modifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String is_modifier_reason = 34;</code>
   *
   * @return The isModifierReason.
   */
  com.google.fhir.r4.core.String getIsModifierReason();
  /**
   *
   *
   * <pre>
   * Reason that this element is marked as a modifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String is_modifier_reason = 34;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIsModifierReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * Include when _summary = true?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_summary = 35;</code>
   *
   * @return Whether the isSummary field is set.
   */
  boolean hasIsSummary();
  /**
   *
   *
   * <pre>
   * Include when _summary = true?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_summary = 35;</code>
   *
   * @return The isSummary.
   */
  com.google.fhir.r4.core.Boolean getIsSummary();
  /**
   *
   *
   * <pre>
   * Include when _summary = true?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_summary = 35;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getIsSummaryOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ElementDefinition.ElementDefinitionBinding binding = 36;</code>
   *
   * @return Whether the binding field is set.
   */
  boolean hasBinding();
  /**
   * <code>.google.fhir.r4.core.ElementDefinition.ElementDefinitionBinding binding = 36;</code>
   *
   * @return The binding.
   */
  com.google.fhir.r4.core.ElementDefinition.ElementDefinitionBinding getBinding();
  /** <code>.google.fhir.r4.core.ElementDefinition.ElementDefinitionBinding binding = 36;</code> */
  com.google.fhir.r4.core.ElementDefinition.ElementDefinitionBindingOrBuilder getBindingOrBuilder();

  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Mapping mapping = 37;</code> */
  java.util.List<com.google.fhir.r4.core.ElementDefinition.Mapping> getMappingList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Mapping mapping = 37;</code> */
  com.google.fhir.r4.core.ElementDefinition.Mapping getMapping(int index);
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Mapping mapping = 37;</code> */
  int getMappingCount();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Mapping mapping = 37;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ElementDefinition.MappingOrBuilder>
      getMappingOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ElementDefinition.Mapping mapping = 37;</code> */
  com.google.fhir.r4.core.ElementDefinition.MappingOrBuilder getMappingOrBuilder(int index);
}