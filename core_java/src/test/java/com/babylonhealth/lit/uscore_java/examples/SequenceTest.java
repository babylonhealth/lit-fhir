package com.babylonhealth.lit.uscore_java.examples;

import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeq;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceTest {
  @Test
  public void varargsLitSeqConstructors() {
    NonEmptyLitSeq<String> l0 = new LitSeq(List.of("a", "b", "c")).asNonEmpty();
    NonEmptyLitSeq<String> l1 = LitSeq.nonempty("a", "b", "c");
    NonEmptyLitSeq<String> l2 = LitSeq$.MODULE$.apply("a", "b", "c");
    LitSeq<String> l3 = (LitSeq) LitSeq.emptyInstance();
    LitSeq<String> l4 = LitSeq$.MODULE$.apply();
    assertEquals(l0, l1);
    assertEquals(l1, l2);
    assertEquals(l3, l4);
  }
}
