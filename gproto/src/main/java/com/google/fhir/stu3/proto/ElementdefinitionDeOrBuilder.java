// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/profiles.proto

package com.google.fhir.stu3.proto;

public interface ElementdefinitionDeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ElementdefinitionDe)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Path of the element in the hierarchy of elements
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String path = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
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
   * .google.fhir.stu3.proto.String path = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The path.
   */
  com.google.fhir.stu3.proto.String getPath();
  /**
   *
   *
   * <pre>
   * Path of the element in the hierarchy of elements
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String path = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getPathOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this particular element (in a set of slices)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String slice_name = 5;</code>
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
   * <code>.google.fhir.stu3.proto.String slice_name = 5;</code>
   *
   * @return The sliceName.
   */
  com.google.fhir.stu3.proto.String getSliceName();
  /**
   *
   *
   * <pre>
   * Name for this particular element (in a set of slices)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String slice_name = 5;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getSliceNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for element to display with or prompt for element
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String label = 6;</code>
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
   * <code>.google.fhir.stu3.proto.String label = 6;</code>
   *
   * @return The label.
   */
  com.google.fhir.stu3.proto.String getLabel();
  /**
   *
   *
   * <pre>
   * Name for element to display with or prompt for element
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String label = 6;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getLabelOrBuilder();

  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding code = 7;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Coding> getCodeList();
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding code = 7;</code>
   */
  com.google.fhir.stu3.proto.Coding getCode(int index);
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding code = 7;</code>
   */
  int getCodeCount();
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding code = 7;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodingOrBuilder> getCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Corresponding codes in terminologies
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding code = 7;</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getCodeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Full formal definition as narrative text
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown definition = 10;</code>
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
   * <code>.google.fhir.stu3.proto.Markdown definition = 10;</code>
   *
   * @return The definition.
   */
  com.google.fhir.stu3.proto.Markdown getDefinition();
  /**
   *
   *
   * <pre>
   * Full formal definition as narrative text
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown definition = 10;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getDefinitionOrBuilder();

  /**
   *
   *
   * <pre>
   * Comments about the use of this element
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown comment = 11;</code>
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
   * <code>.google.fhir.stu3.proto.Markdown comment = 11;</code>
   *
   * @return The comment.
   */
  com.google.fhir.stu3.proto.Markdown getComment();
  /**
   *
   *
   * <pre>
   * Comments about the use of this element
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown comment = 11;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getCommentOrBuilder();

  /**
   *
   *
   * <pre>
   * Why this resource has been created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown requirements = 12;</code>
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
   * <code>.google.fhir.stu3.proto.Markdown requirements = 12;</code>
   *
   * @return The requirements.
   */
  com.google.fhir.stu3.proto.Markdown getRequirements();
  /**
   *
   *
   * <pre>
   * Why this resource has been created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown requirements = 12;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getRequirementsOrBuilder();

  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.String> getAliasList();
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  com.google.fhir.stu3.proto.String getAlias(int index);
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  int getAliasCount();
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.StringOrBuilder> getAliasOrBuilderList();
  /**
   *
   *
   * <pre>
   * Other names
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.String alias = 13;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getAliasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Minimum Cardinality
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt min = 14;</code>
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
   * <code>.google.fhir.stu3.proto.UnsignedInt min = 14;</code>
   *
   * @return The min.
   */
  com.google.fhir.stu3.proto.UnsignedInt getMin();
  /**
   *
   *
   * <pre>
   * Minimum Cardinality
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt min = 14;</code>
   */
  com.google.fhir.stu3.proto.UnsignedIntOrBuilder getMinOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum Cardinality (a number or *)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String max = 15 [(.google.fhir.proto.fhir_path_constraint) = "empty() or ($this = &#92;'*&#92;') or (toInteger() &gt;= 0)"];
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
   * .google.fhir.stu3.proto.String max = 15 [(.google.fhir.proto.fhir_path_constraint) = "empty() or ($this = &#92;'*&#92;') or (toInteger() &gt;= 0)"];
   * </code>
   *
   * @return The max.
   */
  com.google.fhir.stu3.proto.String getMax();
  /**
   *
   *
   * <pre>
   * Maximum Cardinality (a number or *)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String max = 15 [(.google.fhir.proto.fhir_path_constraint) = "empty() or ($this = &#92;'*&#92;') or (toInteger() &gt;= 0)"];
   * </code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getMaxOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.Base base = 16;</code>
   *
   * @return Whether the base field is set.
   */
  boolean hasBase();
  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.Base base = 16;</code>
   *
   * @return The base.
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.Base getBase();
  /** <code>.google.fhir.stu3.proto.ElementdefinitionDe.Base base = 16;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.BaseOrBuilder getBaseOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.stu3.proto.ElementdefinitionDe.TypeRef type = 18 [(.google.fhir.proto.fhir_path_constraint) = "aggregation.empty() or (code = &#92;'Reference&#92;')"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.ElementdefinitionDe.TypeRef> getTypeList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.ElementdefinitionDe.TypeRef type = 18 [(.google.fhir.proto.fhir_path_constraint) = "aggregation.empty() or (code = &#92;'Reference&#92;')"];
   * </code>
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.TypeRef getType(int index);
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.ElementdefinitionDe.TypeRef type = 18 [(.google.fhir.proto.fhir_path_constraint) = "aggregation.empty() or (code = &#92;'Reference&#92;')"];
   * </code>
   */
  int getTypeCount();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.ElementdefinitionDe.TypeRef type = 18 [(.google.fhir.proto.fhir_path_constraint) = "aggregation.empty() or (code = &#92;'Reference&#92;')"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ElementdefinitionDe.TypeRefOrBuilder>
      getTypeOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.ElementdefinitionDe.TypeRef type = 18 [(.google.fhir.proto.fhir_path_constraint) = "aggregation.empty() or (code = &#92;'Reference&#92;')"];
   * </code>
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.TypeRefOrBuilder getTypeOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.DefaultValue default_value = 19;</code>
   *
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.DefaultValue default_value = 19;</code>
   *
   * @return The defaultValue.
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.DefaultValue getDefaultValue();
  /** <code>.google.fhir.stu3.proto.ElementdefinitionDe.DefaultValue default_value = 19;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.DefaultValueOrBuilder getDefaultValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Implicit meaning when this element is missing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown meaning_when_missing = 20;</code>
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
   * <code>.google.fhir.stu3.proto.Markdown meaning_when_missing = 20;</code>
   *
   * @return The meaningWhenMissing.
   */
  com.google.fhir.stu3.proto.Markdown getMeaningWhenMissing();
  /**
   *
   *
   * <pre>
   * Implicit meaning when this element is missing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown meaning_when_missing = 20;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getMeaningWhenMissingOrBuilder();

  /**
   *
   *
   * <pre>
   * What the order of the elements means
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String order_meaning = 21;</code>
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
   * <code>.google.fhir.stu3.proto.String order_meaning = 21;</code>
   *
   * @return The orderMeaning.
   */
  com.google.fhir.stu3.proto.String getOrderMeaning();
  /**
   *
   *
   * <pre>
   * What the order of the elements means
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String order_meaning = 21;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getOrderMeaningOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Example example = 24;</code> */
  java.util.List<com.google.fhir.stu3.proto.ElementdefinitionDe.Example> getExampleList();
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Example example = 24;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.Example getExample(int index);
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Example example = 24;</code> */
  int getExampleCount();
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Example example = 24;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.ElementdefinitionDe.ExampleOrBuilder>
      getExampleOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Example example = 24;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.ExampleOrBuilder getExampleOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.MinValue min_value = 25;</code>
   *
   * @return Whether the minValue field is set.
   */
  boolean hasMinValue();
  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.MinValue min_value = 25;</code>
   *
   * @return The minValue.
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.MinValue getMinValue();
  /** <code>.google.fhir.stu3.proto.ElementdefinitionDe.MinValue min_value = 25;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.MinValueOrBuilder getMinValueOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.MaxValue max_value = 26;</code>
   *
   * @return Whether the maxValue field is set.
   */
  boolean hasMaxValue();
  /**
   * <code>.google.fhir.stu3.proto.ElementdefinitionDe.MaxValue max_value = 26;</code>
   *
   * @return The maxValue.
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.MaxValue getMaxValue();
  /** <code>.google.fhir.stu3.proto.ElementdefinitionDe.MaxValue max_value = 26;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.MaxValueOrBuilder getMaxValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Max length for strings
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Integer max_length = 27;</code>
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
   * <code>.google.fhir.stu3.proto.Integer max_length = 27;</code>
   *
   * @return The maxLength.
   */
  com.google.fhir.stu3.proto.Integer getMaxLength();
  /**
   *
   *
   * <pre>
   * Max length for strings
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Integer max_length = 27;</code>
   */
  com.google.fhir.stu3.proto.IntegerOrBuilder getMaxLengthOrBuilder();

  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Id condition = 28;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Id> getConditionList();
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Id condition = 28;</code>
   */
  com.google.fhir.stu3.proto.Id getCondition(int index);
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Id condition = 28;</code>
   */
  int getConditionCount();
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Id condition = 28;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdOrBuilder> getConditionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reference to invariant about presence
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Id condition = 28;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getConditionOrBuilder(int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Constraint constraint = 29;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ElementdefinitionDe.Constraint> getConstraintList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Constraint constraint = 29;</code>
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.Constraint getConstraint(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Constraint constraint = 29;</code>
   */
  int getConstraintCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Constraint constraint = 29;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ElementdefinitionDe.ConstraintOrBuilder>
      getConstraintOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Constraint constraint = 29;</code>
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.ConstraintOrBuilder getConstraintOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If the element must supported
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean must_support = 30;</code>
   *
   * @return Whether the mustSupport field is set.
   */
  boolean hasMustSupport();
  /**
   *
   *
   * <pre>
   * If the element must supported
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean must_support = 30;</code>
   *
   * @return The mustSupport.
   */
  com.google.fhir.stu3.proto.Boolean getMustSupport();
  /**
   *
   *
   * <pre>
   * If the element must supported
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean must_support = 30;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getMustSupportOrBuilder();

  /**
   * <code>
   * .google.fhir.stu3.proto.ElementdefinitionDe.ElementDefinitionBinding binding = 33 [(.google.fhir.proto.fhir_path_constraint) = "valueSet.exists() or description.exists()", (.google.fhir.proto.fhir_path_constraint) = "valueSet.is(uri).not() or valueSet.as(uri).startsWith(&#92;'http:&#92;') or valueSet.as(uri).startsWith(&#92;'https&#92;') or valueSet.as(uri).startsWith(&#92;'urn:&#92;')"];
   * </code>
   *
   * @return Whether the binding field is set.
   */
  boolean hasBinding();
  /**
   * <code>
   * .google.fhir.stu3.proto.ElementdefinitionDe.ElementDefinitionBinding binding = 33 [(.google.fhir.proto.fhir_path_constraint) = "valueSet.exists() or description.exists()", (.google.fhir.proto.fhir_path_constraint) = "valueSet.is(uri).not() or valueSet.as(uri).startsWith(&#92;'http:&#92;') or valueSet.as(uri).startsWith(&#92;'https&#92;') or valueSet.as(uri).startsWith(&#92;'urn:&#92;')"];
   * </code>
   *
   * @return The binding.
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.ElementDefinitionBinding getBinding();
  /**
   * <code>
   * .google.fhir.stu3.proto.ElementdefinitionDe.ElementDefinitionBinding binding = 33 [(.google.fhir.proto.fhir_path_constraint) = "valueSet.exists() or description.exists()", (.google.fhir.proto.fhir_path_constraint) = "valueSet.is(uri).not() or valueSet.as(uri).startsWith(&#92;'http:&#92;') or valueSet.as(uri).startsWith(&#92;'https&#92;') or valueSet.as(uri).startsWith(&#92;'urn:&#92;')"];
   * </code>
   */
  com.google.fhir.stu3.proto.ElementdefinitionDe.ElementDefinitionBindingOrBuilder
      getBindingOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Mapping mapping = 34;</code> */
  java.util.List<com.google.fhir.stu3.proto.ElementdefinitionDe.Mapping> getMappingList();
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Mapping mapping = 34;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.Mapping getMapping(int index);
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Mapping mapping = 34;</code> */
  int getMappingCount();
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Mapping mapping = 34;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.ElementdefinitionDe.MappingOrBuilder>
      getMappingOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.ElementdefinitionDe.Mapping mapping = 34;</code> */
  com.google.fhir.stu3.proto.ElementdefinitionDe.MappingOrBuilder getMappingOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.String question = 35[json_name = "Question", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-question"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.String> getQuestionList();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.String question = 35[json_name = "Question", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-question"];
   * </code>
   */
  com.google.fhir.stu3.proto.String getQuestion(int index);
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.String question = 35[json_name = "Question", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-question"];
   * </code>
   */
  int getQuestionCount();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.String question = 35[json_name = "Question", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-question"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.StringOrBuilder> getQuestionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.String question = 35[json_name = "Question", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-question"];
   * </code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getQuestionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ElementDefinitionAllowedUnits.Value allowed_units = 36[json_name = "AllowedUnits", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-allowedUnits"];
   * </code>
   *
   * @return Whether the allowedUnits field is set.
   */
  boolean hasAllowedUnits();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ElementDefinitionAllowedUnits.Value allowed_units = 36[json_name = "AllowedUnits", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-allowedUnits"];
   * </code>
   *
   * @return The allowedUnits.
   */
  com.google.fhir.stu3.proto.ElementDefinitionAllowedUnits.Value getAllowedUnits();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ElementDefinitionAllowedUnits.Value allowed_units = 36[json_name = "AllowedUnits", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/elementdefinition-allowedUnits"];
   * </code>
   */
  com.google.fhir.stu3.proto.ElementDefinitionAllowedUnits.ValueOrBuilder
      getAllowedUnitsOrBuilder();
}