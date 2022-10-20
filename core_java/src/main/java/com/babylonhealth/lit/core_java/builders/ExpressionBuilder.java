package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.EXPRESSION_LANGUAGE;
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

public interface ExpressionBuilder extends ElementBuilder {
  public Expression build();

  public static Impl init(EXPRESSION_LANGUAGE language) {
    return new Impl(language);
  }

  public static Impl builder(EXPRESSION_LANGUAGE language) {
    return new Impl(language);
  }

  public class Impl implements ExpressionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> name = Optional.empty();
    private EXPRESSION_LANGUAGE language;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> reference = Optional.empty();
    private Optional<String> expression = Optional.empty();
    private Optional<String> description = Optional.empty();

    /**
     * Required fields for {@link Expression}
     *
     * @param language - The media type of the language for the expression.
     */
    public Impl(EXPRESSION_LANGUAGE language) {
      this.language = language;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ExpressionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param name - A short name assigned to the expression to allow for multiple reuse of the
     *     expression in the context where it is defined.
     */
    public ExpressionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ExpressionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExpressionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExpressionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reference - A URI that defines where the expression is found. */
    public ExpressionBuilder.Impl withReference(@NonNull String reference) {
      this.reference = Optional.of(reference);
      return this;
    }
    /** @param expression - An expression in the specified language that returns a value. */
    public ExpressionBuilder.Impl withExpression(@NonNull String expression) {
      this.expression = Optional.of(expression);
      return this;
    }
    /**
     * @param description - A brief, natural language description of the condition that effectively
     *     communicates the intended semantics.
     */
    public ExpressionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }

    public Expression build() {
      return new Expression(
          OptionConverters.toScala(id),
          OptionConverters.toScala(name),
          language,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(reference),
          OptionConverters.toScala(expression),
          OptionConverters.toScala(description),
          LitUtils.emptyMetaElMap());
    }
  }
}
