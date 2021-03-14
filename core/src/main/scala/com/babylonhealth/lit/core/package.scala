package com.babylonhealth.lit

import izumi.reflect.{ Tag, TagKK }
import izumi.reflect.macrortti.LTag

package object core {
  def \::/[L, R](implicit lt: LTag[L], rt: LTag[R]): LTag[L \/ R] =
    new LTag[L \/ R](Tag.appliedTag(TagKK[\/], List(lt.tag, rt.tag)).tag)

  type Base64Binary = Array[Byte]
  // Todo: automatic type conversion and value check for these subtypes
  type UnsignedInt <: Int
  type PositiveInt <: Int

  /** A canonical reference to a profile or part of a profile, can contain version information * */
  type Canonical <: String

  /** A code in a coding system * */
  type Code <: String
  type Id <: String
  type Markdown <: String
  type OID <: String
  type UriStr <: String
  type UrlStr <: String
  type XHTML <: String
  implicit def toUnsignedInt(s: Int): UnsignedInt = {
    assert(s >= 0, "`UnsignedInt`s must be >= 0")
    s.asInstanceOf[UnsignedInt]
  }
  implicit def toPositiveInt(s: Int): PositiveInt = {
    assert(s >= 1, "`PositiveInt`s must be >= 1")
    s.asInstanceOf[PositiveInt]
  }
  implicit def toCanonical(s: String): Canonical                        = s.asInstanceOf[Canonical]
  implicit def toCode(s: String): Code                                  = s.asInstanceOf[Code]
  implicit def toId(s: String): Id                                      = s.asInstanceOf[Id]
  implicit def toMarkdown(s: String): Markdown                          = s.asInstanceOf[Markdown]
  implicit def toOID(s: String): OID                                    = s.asInstanceOf[OID]
  implicit def toUri(s: String): UriStr                                 = s.asInstanceOf[UriStr]
  implicit def toUrlStr(s: String): UrlStr                              = s.asInstanceOf[UrlStr]
  implicit def toXHTML(s: String): XHTML                                = s.asInstanceOf[XHTML]
  implicit def implicitConversions: languageFeature.implicitConversions = scala.language.implicitConversions
}
