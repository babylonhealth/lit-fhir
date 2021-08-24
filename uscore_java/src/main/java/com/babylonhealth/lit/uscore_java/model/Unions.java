package com.babylonhealth.lit.uscore_java.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.UUID;

import scala.math.BigDecimal;

import izumi.reflect.macrortti.LTag;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.*;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.uscore.UnionAliases;
import com.babylonhealth.lit.uscore_java.model.Unions.*;

public class Unions {
  public static class ChoicePositiveIntOrString extends Choice<$bslash$div<Integer, String>> {
    public ChoicePositiveIntOrString(Integer arg) {
      super("PositiveInt", arg, (LTag) UnionAliases.UnionPositiveIntOrStringTag());
    }

    public ChoicePositiveIntOrString(String arg) {
      super("String", arg, (LTag) UnionAliases.UnionPositiveIntOrStringTag());
    }
  }
}
