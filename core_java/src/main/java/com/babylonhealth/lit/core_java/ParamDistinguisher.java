package com.babylonhealth.lit.core_java;

import lombok.NonNull;

public class ParamDistinguisher {
  public final String suffix;
  public final Object wrappedChoice;

  public ParamDistinguisher(@NonNull String suffix, @NonNull Object wrappedChoice) {
    this.suffix = suffix;
    this.wrappedChoice = wrappedChoice;
    // TODO: some type checking here?
  }

  public static ParamDistinguisher choose(@NonNull String suffix, @NonNull Object wrappedChoice) {
    return new ParamDistinguisher(suffix, wrappedChoice);
  }
}
