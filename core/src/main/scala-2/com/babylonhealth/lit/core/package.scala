package com.babylonhealth.lit

import izumi.reflect.{ Tag, TagKK }
import izumi.reflect.macrortti.LTag

package object core {
  def \::/[L, R](implicit lt: LTag[L], rt: LTag[R]): LTag[L \/ R] =
    new LTag[L \/ R](Tag.appliedTag(TagKK[\/], List(lt.tag, rt.tag)).tag)
}
