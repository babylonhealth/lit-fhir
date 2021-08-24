package com.babylonhealth.lit.core.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

import io.circe.{ Decoder, HCursor }

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.UnionAliases._

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Base extends CompanionFor[Base] {
  implicit def summonObjectAndCompanionBase_2065988538(o: Base): ObjectAndCompanion[Base, Base.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Base
  override type ParentType   = Base
  override val baseType: CompanionFor[ResourceType] = Base
  override val parentType: CompanionFor[ParentType] = Base
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Base")
  def apply(
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Base = new Base(
    primitiveAttributes = primitiveAttributes
  )
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq()
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Base): Seq[FHIRComponentField[_]] = Seq(
  )
  override val thisName: String      = "Base"
  def unapply(o: Base): Option[Unit] = Some(())
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Base] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Base(
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Base Type: Base definition for all types defined in FHIR type system.
  *
  * @constructor
  *   Inherits all params from parent.
  */
@POJOBoilerplate
class Base(
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends FHIRObject(primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Base"
}
