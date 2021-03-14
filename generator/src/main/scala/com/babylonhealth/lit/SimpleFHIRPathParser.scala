package com.babylonhealth.lit

import scala.annotation.tailrec
import scala.util.Try

import cats.MonadError

import com.babylonhealth.lit.core.{ CompanionFor, FHIRObject }
import com.babylonhealth.lit.core.model.companionLookup
import com.babylonhealth.lit.fhirpath._
import com.babylonhealth.lit.fhirpath.genScala.{ ExactlyOne, FieldCardinality, GenScalaParams }
import com.babylonhealth.lit.languages.BaseFieldImplicits

class SimpleFHIRPathParser(topLevelClass: TopLevelClass, allTopLevelElements: TopLevelClasses)
    extends BaseFieldImplicits {
  val fields = topLevelClass.fields

  type Id[+T] = T
  private val resolver: FHIRReadClient[Id] = (url: String) => ???
  implicit val _asdlkjfds = new MonadError[Id, Throwable] { // TODO: I'm sure this exists somewhere else...
    override def flatMap[A, B](fa: Id[A])(f: A => Id[B]): Id[B] = f(fa)
    @tailrec
    override def tailRecM[A, B](a: A)(f: A => Id[Either[A, B]]): Id[B] =
      f(a) match {
        case Right(n) => n
        case Left(a)  => tailRecM[A, B](a)(f)
      }
    override def raiseError[A](e: Throwable): Id[A]                          = throw e
    override def handleErrorWith[A](fa: Id[A])(f: Throwable => Id[A]): Id[A] = Try(fa).fold(f, identity)
    override def pure[A](x: A): Id[A]                                        = x
  }
  def decapitalise(s: String): String = s.head.toLower +: s.tail
  def getFieldInReferenceClass(className: String, fieldName: String): Option[BaseField] = {
    val Array(h, t @ _*) = className.split("\\.")
    def firstClass       = allTopLevelElements.getI(h).orElse { println(s"Can't find a class for $className"); None }
    if (firstClass.isEmpty) return None
    if (t.isEmpty) return firstClass.flatMap(_.fields.find(_.noParensName == fieldName))
    // for e.g. ConceptMap.Group.Element.Target.DependsOn
    t.tail
      .foldLeft(firstClass.flatMap(_.fields.find(_.noParensName == decapitalise(t.head)))) {
        case (None, _)               => None
        case (Some(lastField), next) => lastField.childFields.find(_.noParensName == decapitalise(next))
      }
      .flatMap(_.childFields.find(_.noParensName == fieldName))
  }
  // TODO: The split+flatMap combob can be removed once fhirpath lib supports union `|` op...
  //  the filter(_.contains('.')) is to exclude stuff like `Observation`, which IDK what to do with
  def extractionExpression(s: String, name: String, tmp: String): Seq[(String, FieldCardinality)] =
    s.split("""\s*\|\s*""")
      .filter(_.contains('.'))
      .flatMap { s =>
        if (s.split("\\.").head.replaceAll("\\(", "") != name) Nil
        else {
          val expr                                             = Try(Parser.parseUnsafe(s)) getOrElse { System.exit(1); ??? }
          val topLevelCompanion: CompanionFor[_ <: FHIRObject] = companionLookup(topLevelClass.scalaClassName)
          val p                                                = genScala.gen(expr, GenScalaParams(Left(topLevelCompanion), ExactlyOne, "obj"))
          Seq((p.rootStr, p.baseCardinality))
        }
      }
  def applicableParams: Seq[FHIRSearchParam] = {
    Autogenerator.searchParams.filter(x => x.getBase.contains(topLevelClass.className) && x.expression.isDefined)
  }
  def foo3: Seq[(String, Seq[(String, FieldCardinality)])] =
    applicableParams.map { ps =>
      ps.name -> extractionExpression(ps.getExpression, topLevelClass.className, ps.name)
    }

  lazy val bar: Map[String, Seq[(String, FieldCardinality)]] = foo3.distinct.toMap

}
