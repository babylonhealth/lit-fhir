package com.babylonhealth.lit.core

import scala.collection.immutable.TreeMap
import scala.reflect.ClassTag
import scala.reflect.runtime.universe.{ RuntimeClass, typeOf }

import cats.Monad
import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.TagSummoners.lTypeOf
import com.babylonhealth.lit.core.model.{ Element, Extension, intSubSuffixes, stringSubSuffixes, typeSuffixMap }

object FHIRObject {
  implicit val metaOrdering: Ordering[FHIRComponentFieldMeta[_]]          = Ordering.by(_.name)
  val emptyAtts: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = TreeMap.empty

  def attrMap(
      el: (
          FHIRComponentFieldMeta[_],
          PrimitiveElementInfo)*): TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
    new TreeMap()(FHIRObject.metaOrdering) ++ el
}

abstract class FHIRObject(
    // attributes are stored in a TreeMap with an ordering on `.name` only, in order to ensure that subtyped fields with
    // a different type tag to the parent still have the same key
    val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
    extends FHIRComponent {
  type FieldToElementLookup = TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo]

  def withPrimitiveAttributes(a: FieldToElementLookup): this.type =
    companion.classConstructor.newInstance(fields.map(_.value) :+ a: _*)

  def updatePrimitiveAttributes(fn: FieldToElementLookup => FieldToElementLookup): this.type =
    withPrimitiveAttributes(fn(primitiveAttributes))

  val extensions = new {
    def update(field: FHIRComponentFieldMeta[_])(
        update: LitSeq[Extension] => LitSeq[Extension]): FHIRObject.this.type = {
      def updateExtension: Option[PrimitiveElementInfo] => Option[PrimitiveElementInfo] = {
        case None => Some(PrimitiveElementInfo(Element(extension = update(LitSeq.emptyInstance))))
        case Some(PrimitiveElementInfo(Element(id, ext), phantom)) =>
          Some(PrimitiveElementInfo(Element(id, update(ext)), phantom))
      }

      updatePrimitiveAttributes(_.updatedWith(field)(updateExtension))
    }

    def set(field: FHIRComponentFieldMeta[_])(newExtensions: LitSeq[Extension]): FHIRObject.this.type =
      update(field)((_: LitSeq[Extension]) => newExtensions)

    def get(field: FHIRComponentFieldMeta[_]): LitSeq[Extension] =
      primitiveAttributes(field).element.extension
  }
  val ids = new {
    def update(field: FHIRComponentFieldMeta[_])(update: Option[String] => Option[String]): FHIRObject.this.type = {
      def updateId: Option[PrimitiveElementInfo] => Option[PrimitiveElementInfo] = {
        case None => Some(PrimitiveElementInfo(Element(id = update(None))))
        case Some(PrimitiveElementInfo(Element(id, ext), phantom)) =>
          Some(PrimitiveElementInfo(Element(update(id), ext), phantom))
      }

      updatePrimitiveAttributes(_.updatedWith(field)(updateId))
    }

    def set(field: FHIRComponentFieldMeta[_])(newId: Option[String]): FHIRObject.this.type = update(field)(_ => newId)

    def get(field: FHIRComponentFieldMeta[_]): Option[String] = primitiveAttributes(field).element.id
  }

  def fields: Seq[FHIRComponentField[_]] = companion.fields(this)

  def companion: CompanionFor[this.type]

  def thisClassName: String // For HL7 classes, this should be the same as `thisTypeName`, but will differ for domain-specific subclasses
  def thisTypeName: String

  // kinda a java-ish API. TODO: Would like to have a `T <: this.type` type bound, but since `this.type <: _TheActualTypeOfThis`, that doesn't work. Might help to have a type param on the class that takes itself. Will consider
  def toClass[T](klass: Class[T]): Option[T] =
    this match {
      case t: T @unchecked if klass.isInstance(t) => Some(t)
      case _                                      => None
    }

  // scala API
  def toType[T](implicit ct: ClassTag[T]): Option[T] =
    this match {
      case t: T @unchecked if ct.runtimeClass.isInstance(t) => Some(t)
      case _                                                => None
    }

  def modifyFieldUnsafe[T, Up >: this.type <: FHIRObject](fieldName: String, modify: T => T)(implicit
      ct: ClassTag[Up],
      tt: LTag[Up]): Up =
    ct.runtimeClass.getDeclaredConstructors.head
      .newInstance(companionOf(tt).fields(this).map {
        case FHIRComponentField(FHIRComponentFieldMeta(`fieldName`, _, _, _), v: T @unchecked) => modify(v)
        case FHIRComponentField(_, v)                                                          => v
      } :+ primitiveAttributes: _*)
      .asInstanceOf[Up]

  def modifyField[T: LTag, Up >: this.type <: FHIRObject](fieldName: String, modify: T => T)(implicit
      ct: ClassTag[Up],
      tt: LTag[Up]): Up = {
    var hasModified = false
    val modifiedFields: Seq[Any] = companionOf(tt).fields(this).map {
      case FHIRComponentField(FHIRComponentFieldMeta(`fieldName`, t, _, _), v: T @unchecked) if lTypeOf[T] <:< t.tag =>
        hasModified = true
        modify(v)
      case FHIRComponentField(FHIRComponentFieldMeta(`fieldName`, t, _, _), _) =>
        throw new RuntimeException(s"Cannot modify field $fieldName because we can't prove that ${lTypeOf[T]} <:< $t")
      case FHIRComponentField(_, v) => v
    }
    if (!hasModified) throw new RuntimeException(s"Cannot set field $fieldName. Expecting one of type ${lTypeOf[T]}")
    else
      ct.runtimeClass.getDeclaredConstructors.head
        .newInstance(modifiedFields :+ primitiveAttributes: _*)
        .asInstanceOf[this.type]
  }

  def withFieldUnsafe[T, Up >: this.type <: FHIRObject](fieldName: String, value: T)(implicit
      ct: ClassTag[Up],
      tt: LTag[Up]): Up =
    ct.runtimeClass.getDeclaredConstructors.head
      .newInstance(companionOf(tt).fields(this).map {
        case FHIRComponentField(FHIRComponentFieldMeta(`fieldName`, _, _, _), _) => value
        case FHIRComponentField(_, v)                                            => v
      } :+ primitiveAttributes: _*)
      .asInstanceOf[this.type]

  def withField[T: LTag, Up >: this.type <: FHIRObject](fieldName: String, value: T)(implicit
      ct: ClassTag[Up],
      tt: LTag[Up]): Up = {
    var hasModified = false
    val modifiedFields: Seq[Any] = companionOf(tt).fields(this).map {
      case FHIRComponentField(FHIRComponentFieldMeta(`fieldName`, t, _, _), _) if lTypeOf[T] <:< t.tag =>
        hasModified = true
        value
      case FHIRComponentField(FHIRComponentFieldMeta(`fieldName`, t, _, _), _) =>
        throw new RuntimeException(s"Cannot set field $fieldName because we can't prove that ${lTypeOf[T]} <:< $t")
      case FHIRComponentField(_, v) => v
    }
    if (!hasModified) throw new RuntimeException(s"Cannot set field $fieldName. Expecting one of type ${lTypeOf[T]}")
    else
      ct.runtimeClass.getDeclaredConstructors.head
        .newInstance(modifiedFields :+ primitiveAttributes: _*)
        .asInstanceOf[this.type]
  }

  def withFields[Up >: this.type <: FHIRObject](
      replacementFields: (String, Any)*)(implicit ct: ClassTag[Up], tt: LTag[Up]): Up = {
    var numModified = 0
    val pairedFields: Seq[(FHIRComponentField[_], Option[(String, Any)])] =
      companionOf(tt).fields(this).map(f => f -> replacementFields.find(_._1 == f.name))
    val modifiedFields: Seq[Any] = pairedFields.map {
      case (_, Some((_, v))) =>
        numModified += 1
        v
      case (FHIRComponentField(_, v), _) => v
    }
    if (numModified != replacementFields.size)
      throw new RuntimeException(s"Cannot set all fields [${replacementFields.mkString(", ")}]")
    else
      ct.runtimeClass.getDeclaredConstructors.head
        .newInstance(modifiedFields :+ primitiveAttributes: _*)
        .asInstanceOf[this.type]
  }

  import cats.instances.list._
  import cats.syntax.flatMap._
  import cats.syntax.functor._
  import cats.syntax.traverse._
  final def >>=[T, F[_]: Monad](fn: T => F[T])(implicit tt: LTag[T]): F[this.type] = {
    val (suff, cond) = suffCond[T]
    >>>=(fn, suff, cond).map(_._1)
  }
  private final val FCF = FHIRComponentField
  private final def >>>=[T, F[_]](fn: T => F[T], suffix: Option[String], cond: (Any, LTag[_]) => Boolean)(implicit
      F: Monad[F]): F[(this.type, Boolean)] = {
    var changed = false
    def change[T](t: => T): T = { changed = true; t }
    val newFields: F[List[Any]] = fields.toList.traverse[F, Any] {
      case FCF(_, v @ (None | LitSeq.emptyInstance)) => F pure v
      case FCF(_, c: Choice[_]) =>
        c match {
          case Choice(suf, v) if suffix contains suf => change(fn(v.asInstanceOf[T]).map(Choice(suf, _)(c.tt)))
          case Choice(suf, v: FHIRObject) =>
            v.>>>=(fn, suffix, cond).map { case (obj, f) => if (f) change(Choice(suf, obj)(c.tt)) else c }
          case _ => F pure c
        }
      case FCF(_, opt @ Some(c: Choice[_])) =>
        c match {
          case Choice(suf, v) if suffix contains suf =>
            change(fn(v.asInstanceOf[T]).map(nv => Some(Choice(suf, nv)(c.tt))))
          case Choice(suf, v: FHIRObject) =>
            v.>>>=(fn, suffix, cond).map { case (obj, f) => if (f) change(Choice(suf, obj)(c.tt)) else opt }
          case _ => F pure opt
        }
      case FCF(meta, vs: LitSeq[_]) =>
        if (cond(vs.head, meta.unwrappedTT))
          change(
            vs.toList traverse (v => fn(v.asInstanceOf[T])) map (_.to(LitSeq))
          ) // conceptually dodgy to only check head
        else if (vs.head.isInstanceOf[FHIRObject])
          vs.asInstanceOf[LitSeq[FHIRObject]]
            .foldLeft(F pure (LitSeq.newBuilder[FHIRObject], false: Boolean)) { case (_F, next) =>
              _F.flatMap { case (acc, flag) =>
                next.>>>=(fn, suffix, cond).map { case (n1, f1) => acc.addOne(n1) -> (flag || f1) }
              }
            }
            .map { case (res, f) => if (f) change(res.result()) else vs }
        else F pure vs
      case FCF(meta, opt @ Some(t)) =>
        if (cond(t, meta.unwrappedTT)) change(fn(t.asInstanceOf[T]) map (Some(_)))
        else
          t match {
            case v: FHIRObject => v.>>>=(fn, suffix, cond).map { case (obj, f) => if (f) change(obj) else opt }
            case _             => F pure opt
          }
      case FCF(meta, v: T @unchecked) if cond(v, meta.tt) => change(fn(v).asInstanceOf[F[Any]])
      case FCF(_, v: FHIRObject) =>
        v.>>>=(fn, suffix, cond).map { case (obj, f) => if (f) change(obj) else v }
      case FCF(_, v) => F pure v
    }
    (if (!changed) F pure (this -> false)
     else newFields.map(fs => constructor.newInstance(fs :+ primitiveAttributes: _*) -> true))
      .asInstanceOf[F[(this.type, Boolean)]]
  }

  private final def suffCond[T](implicit tt: LTag[T]): (Option[String], (Any, LTag[_]) => Boolean) = {
    val suff: Option[String]            = typeSuffixMap(tt.tag)
    val cond: (Any, LTag[_]) => Boolean =
      // The double checks here are to short-circuit when possible. `isInstanceOf` is much cheaper than `=:=`
      // TODO: Is this still worth doing with LightTypeTag?
      if (suff exists stringSubSuffixes) (cand, t) => cand.isInstanceOf[String] && t.tag =:= tt.tag
      else if (suff exists intSubSuffixes) (cand, t) => cand.isInstanceOf[Int] && t.tag =:= tt.tag
      else {
        val clazz: RuntimeClass = Class forName tt.tag.repr
        (cand, _) => clazz.isInstance(cand)
      }
    (suff, cond)
  }

  /** Slower than nodalMap, but should work with subtypes (e.g. PositiveInt). If you _must_ use it, then:
    * - `T` should not be a Choice[_], a LitSeq[_] or an Option[_]
    * - It may require a type parameter sometimes (e.g.
    * `sampleResource >>[BUNDLE_TYPE] { (_: BUNDLE_TYPE) => BUNDLE_TYPE.SEARCHSET }`
    * )
    */
  final def >>[T](fn: T => T)(implicit tt: LTag[T]): this.type = {
    val (suff, cond) = suffCond[T]
    >>>(fn, suff, cond)._1
  }

  private final def >>>[T](
      fn: T => T,
      suffix: Option[String],
      cond: (Any, LTag[_]) => Boolean): (this.type, Boolean) = {
    var changed = false
    def change[T](t: => T): T = { changed = true; t }
    val newFields = fields.map {
      case FHIRComponentField(_, v @ (None | LitSeq.emptyInstance)) => v
      case FHIRComponentField(_, c: Choice[_]) =>
        c match {
          case Choice(suf, v) if suffix contains suf => change(Choice(suf, fn(v.asInstanceOf[T]))(c.tt))
          case Choice(suf, v: FHIRObject) =>
            val (obj, f) = v >>> (fn, suffix, cond)
            if (f) change(Choice(suf, obj)(c.tt)) else c
          case _ => c
        }
      case FHIRComponentField(_, opt @ Some(c: Choice[_])) =>
        c match {
          case Choice(suf, v) if suffix contains suf => change(Some(Choice(suf, fn(v.asInstanceOf[T]))(c.tt)))
          case Choice(suf, v: FHIRObject) =>
            val (obj, f) = v >>> (fn, suffix, cond)
            if (f) change(Some(Choice(suf, obj)(c.tt))) else opt
          case _ => opt
        }
      case FHIRComponentField(meta, vs: LitSeq[_]) =>
        if (cond(vs.head, meta.unwrappedTT))
          change(vs map (v => fn(v.asInstanceOf[T]))) // conceptually dodgy to only check head
        else if (vs.head.isInstanceOf[FHIRObject]) {
          val (res, f) = vs.asInstanceOf[LitSeq[FHIRObject]].foldLeft(LitSeq.newBuilder[FHIRObject] -> false) {
            case ((acc, flag), next) =>
              val (n1, f1) = next >>> (fn, suffix, cond)
              acc.addOne(n1) -> (flag || f1)
          }
          if (f) change(res.result()) else vs
        } else vs
      case FHIRComponentField(meta, opt @ Some(t)) =>
        if (cond(t, meta.unwrappedTT)) change(Some(fn(t.asInstanceOf[T])))
        else
          t match {
            case v: FHIRObject =>
              val (obj, f) = v >>> (fn, suffix, cond)
              if (f) change(Some(obj)) else opt
            case v => opt
          }
      case FHIRComponentField(meta, v: T @unchecked) if cond(v, meta.tt) => change(fn(v))
      case FHIRComponentField(_, v: FHIRObject) =>
        val (obj, f) = v >>> (fn, suffix, cond)
        if (f) change(obj) else v
      case FHIRComponentField(_, v) => v
    }
    (if (!changed) this                                                 -> false
     else constructor.newInstance(newFields :+ primitiveAttributes: _*) -> true).asInstanceOf[(this.type, Boolean)]
  }

  /** Bit faster than `>>`, but still much slower than using `update$foo` when possible. If you _must_ use it, then:
    * - `T` should not be a Choice[_], a LitSeq[_], an Option[_], or any 'subtyped' type (eg PositiveInt). You should
    * ensure, if T is a supertype of multiple valid choice values (e.g. T =:= Object), that the return value of fn
    * retains the same type as the input value.
    */
  final def nodalMap[T](klass: Class[T], fn: T => T): this.type = nodalMapFlag(klass, fn)._1
  private final def nodalMapFlag[T](klass: Class[T], fn: T => T): (this.type, Boolean) = {
    var changed = false
    def change[T](t: => T): T = { changed = true; t }
    val newFields = fields.map {
      case FHIRComponentField(_, v @ (None | LitSeq.emptyInstance)) => v
      case FHIRComponentField(_, c: Choice[_]) =>
        c match {
          case Choice(s, v: T @unchecked) if klass.isInstance(v) => change(Choice(s, fn(v))(c.tt))
          case Choice(s, v: FHIRObject) =>
            val (v1, c1) = v.nodalMapFlag(klass, fn)
            if (c1) change(Choice(s, v1)(c.tt)) else c
          case _ => c
        }
      case FHIRComponentField(_, opt @ Some(c: Choice[_])) =>
        c match {
          case Choice(s, v: T @unchecked) if klass.isInstance(v) => change(Choice(s, fn(v))(c.tt))
          case Choice(s, v: FHIRObject) =>
            val (v1, c1) = v.nodalMapFlag(klass, fn)
            if (c1) change(Some(Choice(s, v1)(c.tt))) else opt
          case _ => opt
        }
      case FHIRComponentField(_, vs: LitSeq[_]) =>
        vs match {
          // conceptually dodgy...
          case vs: LitSeq[T @unchecked] if klass.isInstance(vs.head) => change(vs map fn)
          // looks dodgy, but isn't
          case vs: LitSeq[FHIRObject @unchecked] if vs.head.isInstanceOf[FHIRObject] =>
            val (res, f) = vs.foldLeft(LitSeq.newBuilder[FHIRObject] -> false) { case ((acc, flag), next) =>
              val (n1, f1) = next.nodalMapFlag(klass, fn)
              acc.addOne(n1) -> (flag || f1)
            }
            if (f) change(res.result()) else vs
          case _ => vs
        }
      case FHIRComponentField(_, opt @ Some(v)) =>
        v match {
          case v: T @unchecked if klass.isInstance(v) => change(Some(fn(v)))
          case v: FHIRObject =>
            val (v1, c1) = v.nodalMapFlag(klass, fn)
            if (c1) change(Some(v1)) else opt
          case _ => opt
        }
      case FHIRComponentField(_, v) =>
        v match {
          case v: T @unchecked if klass.isInstance(v) => change(fn(v))
          case v: FHIRObject =>
            val (v1, c1) = v.nodalMapFlag(klass, fn)
            if (c1) change(v1) else v
          case _ => v
        }
    }
    (if (!changed) this                                                 -> false
     else constructor.newInstance(newFields :+ primitiveAttributes: _*) -> true).asInstanceOf[(this.type, Boolean)]
  }

  /** Extract values of type From, and map to LitSeq[To] using fn: From => To.
    * Unlike >>, this is safe even if From is a Choice[_], a LitSeq[_] or an Option[_]
    * Quite slow, slower than nodalExtract
    */
  final def ^^[From, To](fn: From => To)(implicit tt: LTag[From]): LitSeq[To] = ^^^[From] map fn
  final def ^^^[T](implicit tt: LTag[T]): LitSeq[T] = {
    val (suff, cond) = suffCond[T]
    ^:^(suff, cond)
  }

  private final def ^:^[Target](suffix: Option[String], cond: (Any, LTag[_]) => Boolean): LitSeq[Target] =
    fields.to(LitSeq).flatMap {
      case FHIRComponentField(meta, v: Target @unchecked) if cond(v, meta.tt) => LitSeq(v)
      case FHIRComponentField(_, None | LitSeq.emptyInstance)                 => LitSeq.empty
      case FHIRComponentField(_, c: Choice[_]) =>
        c match {
          case Choice(suf, v: Target @unchecked) if suffix contains suf => LitSeq(v)
          case Choice(_, v: FHIRObject)                                 => v ^:^ (suffix, cond)
          case _                                                        => LitSeq.empty
        }
      case FHIRComponentField(meta, vs: LitSeq[_]) =>
        if (cond(vs.head, meta.unwrappedTT)) vs.asInstanceOf[LitSeq[Target]]
        else if (vs.head.isInstanceOf[FHIRObject]) vs.asInstanceOf[LitSeq[FHIRObject]] flatMap (_ ^:^ (suffix, cond))
        else LitSeq.empty
      case FHIRComponentField(meta, Some(t)) =>
        if (cond(t, meta.unwrappedTT)) LitSeq(t.asInstanceOf[Target])
        else
          t match {
            case v: FHIRObject                                            => v ^:^ (suffix, cond)
            case Choice(suf, v: Target @unchecked) if suffix contains suf => LitSeq(v)
            case Choice(_, v: FHIRObject)                                 => v ^:^ (suffix, cond)
            case _                                                        => LitSeq.empty
          }
      case FHIRComponentField(_, v: FHIRObject) => v ^:^ (suffix, cond)
      case _                                    => LitSeq.empty
    }

  /** Convenience alias for nodalGetByClass andThen map to LitSeq[To] using fn: From => To.
    */
  final def nodalExtract[From, To](klass: Class[From], fn: From => To): LitSeq[To] = nodalGetByClass(klass).map(fn)

  /** Extract values of type From
    * Unlike nodalMap, this is safe even if From is a Choice[_], a LitSeq[_] or an Option[_], however there remains a
    * caveat with 'subtyped' types (eg PositiveInt), in that we can't differentiate them from the parent class
    * Quite slow but faster than ^^
    */
  final def nodalGetByClass[Target](klass: Class[Target]): LitSeq[Target] =
    fields.to(LitSeq).flatMap {
      case FHIRComponentField(_, v: Target @unchecked) if klass.isInstance(v) => LitSeq(v)
      case FHIRComponentField(_, None | LitSeq.emptyInstance)                 => LitSeq.empty
      case FHIRComponentField(_, c: Choice[_]) =>
        c match {
          case Choice(_, v: Target @unchecked) if klass.isInstance(v) => LitSeq(v)
          case Choice(_, v: FHIRObject)                               => v.nodalGetByClass(klass)
          case _                                                      => LitSeq.empty
        }
      case FHIRComponentField(_, vs: LitSeq[_]) =>
        if (klass.isInstance(vs.head)) vs.asInstanceOf[LitSeq[Target]]
        else if (vs.head.isInstanceOf[FHIRObject]) vs.asInstanceOf[LitSeq[FHIRObject]].flatMap(_.nodalGetByClass(klass))
        else LitSeq.empty
      case FHIRComponentField(_, Some(t)) =>
        if (klass.isInstance(t)) LitSeq(t.asInstanceOf[Target])
        else
          t match {
            case v: FHIRObject                                          => v.nodalGetByClass(klass)
            case Choice(s, v: Target @unchecked) if klass.isInstance(v) => LitSeq(v)
            case Choice(s, v: FHIRObject)                               => v.nodalGetByClass(klass)
            case _                                                      => LitSeq.empty
          }
      case FHIRComponentField(_, v: FHIRObject) => v.nodalGetByClass(klass)
      case _                                    => LitSeq.empty
    }

  private def refToString(r: Choice[_]): String =
    r.suffix match {
      case "" => s"<Any> = ${r.json}"
      case s  => s"$s = ${r.toUnion.asInstanceOf[_ \/ _].value.toString}"
    }

  private def refishToString(r: Any): String =
    r match {
      case r: Choice[_] => refToString(r)
      case None         => "<absent> = None" // probably shouldn't happen
      case Some(x)      => refishToString(x)
      case x: LitSeq[_] => x.map(refishToString).mkString("[", ", ", "]")
      // these apply only in the case that we have subtyped a Ref to a single value in a custom profile
      case x: String => s"String (possible erasure of subtype) = $x"
      case x: Int    => s"Int (possible erasure of subtype) = ${x.toString}"
      case x         => s"${x.getClass.getName} = ${x.toString}"
    }

  override def toString: String =
    fields
      .map {
        case f if f.value == None         => None
        case f if f.value == LitSeq.empty => None
        case f if f.isRef                 => Some(s"${f.name}[x]: ${refishToString(f.value)}")
        case f                            => Some(s"${f.name} = ${f.value}")
      }
      .collect { case Some(x) => x }
      .mkString(thisClassName + "(", ", ", ")")
}
