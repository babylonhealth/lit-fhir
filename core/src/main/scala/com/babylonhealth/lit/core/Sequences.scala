package com.babylonhealth.lit.core

import java.util
import java.util.function.{ BiConsumer, BinaryOperator, Supplier }
import java.util.stream.{ Collector => JCollector, Stream => JStream }
import java.util.{ function, Collection => JCollection, List => JList, ListIterator => JListIterator, Set => JSet }

import scala.annotation.unchecked.uncheckedVariance
import scala.collection.mutable.ArrayBuffer
import scala.collection.{ Iterable, IterableFactory, IterableOnce, Iterator, Seq, View, mutable }
import scala.util.hashing.MurmurHash3

object MutUtils {
  def !!! : Nothing = throw new NotImplementedError("Will not implement - mutator method used on immutable collection")
}
import MutUtils._

abstract class LitSeqBuilderBase[T, F[_] <: LitSeq[_]](cardSelector: Int => ArrayBuffer[T] => F[T])
    extends mutable.Builder[T, F[T]] {
  protected val _buffer: ArrayBuffer[T] = ArrayBuffer.empty
  override def clear(): Unit            = _buffer.clear()
  override def result(): F[T]           = cardSelector(_buffer.length)(_buffer)
  override def addOne(elem: T): LitSeqBuilderBase.this.type = {
    _buffer.addOne(elem)
    this
  }
}
class LitSeqBuilder[T]
    extends LitSeqBuilderBase[T, LitSeq]({
      case 0 => _ => LitSeq.empty[T]
      case _ => acc => new NonEmptyLitSeq[T](acc.toSeq)
    })

abstract class LitSeqJCollectorBase[T, F[_] <: LitSeq[_]](cardSelector: Int => ArrayBuffer[T] => F[T])
    extends JCollector[T, ArrayBuffer[T], F[T]] {
  override def supplier(): Supplier[ArrayBuffer[T]]                    = () => ArrayBuffer.empty
  override def accumulator(): BiConsumer[ArrayBuffer[T], T]            = (acc, next) => acc.addOne(next)
  override def combiner(): BinaryOperator[ArrayBuffer[T]]              = (acc1, acc2) => acc1.addAll(acc2)
  override def finisher(): function.Function[ArrayBuffer[T], F[T]]     = acc => cardSelector(acc.length)(acc)
  override def characteristics(): util.Set[JCollector.Characteristics] = JSet.of()
}

class LitSeqJCollector[T]
    extends LitSeqJCollectorBase[T, LitSeq]({
      case 0 => _ => LitSeq.empty[T]
      case _ => acc => new NonEmptyLitSeq[T](acc.toSeq)
    })
class NonEmptyLitSeqJCollector[T]
    extends LitSeqJCollectorBase[T, NonEmptyLitSeq]({
      case 0 =>
        _ =>
          throw new RuntimeException(
            "Attempted to create a NonEmptyLitSeq with 0 elements. A NonEmptyLitSeq must contain at least 1 element.")
      case _ => acc => new NonEmptyLitSeq[T](acc.toSeq)
    })

object LitSeq extends IterableFactory[LitSeq] {
  override def from[A](source: IterableOnce[A]): LitSeq[A] =
    if (source.isEmpty) empty else new NonEmptyLitSeq(source.iterator.toSeq)
  val emptyInstance: LitSeq[Nothing]     = new LitSeq(Seq.empty)
  override final def empty[A]: LitSeq[A] = emptyInstance.asInstanceOf[LitSeq[A]]

  override def newBuilder[A]: mutable.Builder[A, LitSeq[A]] = new LitSeqBuilder()
//  implicit def _fromSeq[T](seq: Seq[T]): LitSeq[T]          = new LitSeq[T](seq)

  // specialised
  def nonempty[A](head: A, rest: A*): NonEmptyLitSeq[A] = new NonEmptyLitSeq[A](head +: rest)
  def apply[A](): LitSeq[A]                             = empty
  def apply[A](head: A, rest: A*): NonEmptyLitSeq[A]    = nonempty(head, rest: _*)
}

class LitSeqIterator[+T](private val xs: Array[_], initialIndex: Int = 0)
    extends Iterator[T]
    with JListIterator[T @uncheckedVariance] {
  private[this] var pos  = initialIndex
  private[this] val len  = xs.length
  override def knownSize = len - pos
  def hasNext: Boolean   = pos < len
  def next: T =
    try {
      val r = xs(pos)
      pos += 1
      r.asInstanceOf[T]
    } catch { case _: ArrayIndexOutOfBoundsException => Iterator.empty.next() }
  override def drop(n: Int): Iterator[T] = {
    if (n > 0) pos = Math.min(xs.length, pos + n)
    this
  }
  def hasPrevious: Boolean = pos > 0
  def nextIndex: Int       = pos
  def previous: T =
    if (pos > 0) {
      pos -= 1
      xs(pos).asInstanceOf[T]
    } else Iterator.empty.next()
  def previousIndex: Int = pos - 1
  // mutability. Unimplemented
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def remove(): Unit = ???
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  def add(x$1: T @uncheckedVariance): Unit = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  def set(x$1: T @uncheckedVariance): Unit = !!!
}

class LitSeq[+T] protected (protected val _contents: Array[Object])
    extends scala.collection.IterableOps[T, LitSeq, LitSeq[T]]
    with PartialFunction[Int, T]
    with JList[T @uncheckedVariance] {
  // extra constructors
  def this(coll: JCollection[T]) = {
    this(coll.toArray)
  }
  def this(initial: Iterable[T]) = {
    this {
      val arr: Array[Object] = new Array[Object](initial.size)
      initial.zipWithIndex.foreach { case (o, i) => arr(i) = o.asInstanceOf[Object] }
      arr
    }
  }
  // Java combination fns
  def prepend(elem: T @uncheckedVariance): NonEmptyLitSeq[T] = elem +: this
  def append(elem: T @uncheckedVariance): NonEmptyLitSeq[T]  = this :+ elem
  def concat(nonEmpty: NonEmptyLitSeq[T @uncheckedVariance]): NonEmptyLitSeq[T] =
    iterableFactory.from(iterator ++ nonEmpty.iterator).asInstanceOf[NonEmptyLitSeq[T]]
  def concat(that: JCollection[T @uncheckedVariance]): LitSeq[T] =
    JStream.concat(this.stream(), that.stream()).collect(new LitSeqJCollector[T])
  // PartialFunction[Int, T]
  def isDefinedAt(x: Int): Boolean = 0 <= x && x < _contents.length
  // Subset of SeqOps[...] fns...
  def +:[T1 >: T](elem: T1): NonEmptyLitSeq[T1] =
    iterableFactory.from(new View.Prepended(elem, this)).asInstanceOf[NonEmptyLitSeq[T]]
  def :+[T1 >: T](elem: T1): NonEmptyLitSeq[T1] =
    iterableFactory.from(new View.Appended(this, elem)).asInstanceOf[NonEmptyLitSeq[T]]
  def ++[T1 >: T](suffix: NonEmptyLitSeq[T1]): NonEmptyLitSeq[T1] =
    iterableFactory
      .from(suffix match {
        case xs: Iterable[T] => new View.Concat(this, xs)
        case xs              => iterator ++ xs.iterator
      })
      .asInstanceOf[NonEmptyLitSeq[T]]
  def ++[T1 >: T](suffix: Iterable[T1]): LitSeq[T1] =
    iterableFactory.from(suffix match {
      case xs: Iterable[T] => new View.Concat(this, xs)
      case xs              => iterator ++ xs.iterator
    })
  def distinctBy[B](f: T => B): LitSeq[T] = fromSpecific(new View.DistinctBy(this, f))
  def distinct: LitSeq[T]                 = distinctBy(identity)
  def reverse: LitSeq[T]                  = fromSpecific(reversed)
  def sorted[B >: T](implicit ord: Ordering[B]): LitSeq[T] = {
    val len = this.length
    val b   = newSpecificBuilder
    if (len == 1) b += head
    else if (len > 1) {
      b.sizeHint(len)
      val arr = new Array[Any](len)
      copyToArray(arr)
      java.util.Arrays.sort(arr.asInstanceOf[Array[AnyRef]], ord.asInstanceOf[Ordering[AnyRef]])
      var i = 0
      while (i < len) {
        b += arr(i).asInstanceOf[T]
        i += 1
      }
    }
    b.result()
  }
  def sortWith(lt: (T, T) => Boolean): LitSeq[T]                 = sorted(Ordering.fromLessThan(lt))
  def sortBy[B](f: T => B)(implicit ord: Ordering[B]): LitSeq[T] = sorted(ord on f)
  def corresponds[B](that: Seq[B])(p: (T, B) => Boolean): Boolean = {
    val i = iterator
    val j = that.iterator
    while (i.hasNext && j.hasNext)
      if (!p(i.next(), j.next()))
        return false
    !i.hasNext && !j.hasNext
  }
  def length: Int = _contents.length

  // override toSeq
  @`inline` final override def toSeq: scala.collection.immutable.Seq[T] =
    _contents.toSeq.asInstanceOf[scala.collection.immutable.Seq[T]]
  // From IterableOps & JList
  override def iterator(): LitSeqIterator[T] = new LitSeqIterator(_contents)

  // From IterableOps
  protected def coll: LitSeq[T] = this
  protected def fromSpecific(coll: scala.collection.IterableOnce[T @uncheckedVariance]): LitSeq[T] =
    if (coll.isEmpty) LitSeq.empty else new NonEmptyLitSeq[T](coll.iterator.toSeq)
  def iterableFactory: scala.collection.IterableFactory[LitSeq] =
    LitSeq
  protected def newSpecificBuilder: scala.collection.mutable.Builder[T @uncheckedVariance, LitSeq[T @uncheckedVariance]] =
    new LitSeqBuilder()

  def toIterable: Iterable[T] = _contents.toIterable.asInstanceOf[Iterable[T]]

  def apply(i: Int): T = _contents(i).asInstanceOf[T]

  // From JCollection
  override def contains(o: Object): Boolean                     = _contents.contains(o)
  override def containsAll(collection: JCollection[_]): Boolean = collection.stream().allMatch(_contents.contains)
  override def toArray: Array[AnyRef]                           = Array.copyOf(_contents, _contents.length)
  override def toArray[T1](xs: Array[T1 with Object]): Array[T1 with Object] =
    if (xs.length < _contents.length) (toArray: Array[AnyRef]).asInstanceOf[Array[T1 with Object]]
    else {
      for (i <- _contents.indices) xs(i) = _contents(i).asInstanceOf[T1 with Object]
      if (xs.length > _contents.length) xs(_contents.length) = null.asInstanceOf[T1 with Object]
      xs
    }

  // From JList
  def get(i: Int): T                              = apply(i)
  def indexOf(x: Object): Int                     = _contents.indexOf(x)
  def lastIndexOf(x: Object): Int                 = _contents.lastIndexOf(x)
  def subList(from: Int, until: Int): LitSeq[T]   = new LitSeq[T](_contents.slice(from, until).toSeq.asInstanceOf[Seq[T]])
  def listIterator(index: Int): LitSeqIterator[T] = new LitSeqIterator[T](_contents, index)
  def listIterator(): LitSeqIterator[T]           = new LitSeqIterator[T](_contents)

  // mutabilty. Will not implement.
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def add(e: T @uncheckedVariance): Boolean = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def remove(o: Any): Boolean = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def addAll(collection: JCollection[_ <: T @uncheckedVariance]): Boolean = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def removeAll(collection: JCollection[_]): Boolean = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def retainAll(collection: JCollection[_]): Boolean = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  override def clear(): Unit = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  def add(x$1: Int, x$2: T @uncheckedVariance): Unit = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  def addAll(x$1: Int, x$2: java.util.Collection[_ <: T @uncheckedVariance]): Boolean = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  def remove(x$1: Int): T = !!!
  @throws(classOf[NotImplementedError]) @deprecated("Do not use -- this collection is immutable")
  def set(x$1: Int, x$2: T @uncheckedVariance): T = !!!

  // Non-seq methods
  override def toString = mkString("LitSeq(", ", ", ")")
  override def equals(o: scala.Any): Boolean =
    this.eq(o.asInstanceOf[AnyRef]) || (
      o match {
        case it: LitSeq[T] => (it eq this) || (it.length == length && iterator().sameElements(it))
        case it: Seq[T]    => it.canEqual(this) && it.sameElements(this)
        case _             => false
      }
    )
  override def hashCode(): Int = MurmurHash3.arrayHash(_contents)

  // specialised
  def asNonEmpty: NonEmptyLitSeq[T] = new NonEmptyLitSeq[T](toSeq)
  def refine: LitSeq[T]             = if (_contents.isEmpty) LitSeq.empty else new NonEmptyLitSeq[T](toSeq)
}

class NonEmptyLitSeq[+T] protected (override protected val _contents: Array[Object], wasChecked: Boolean)
    extends LitSeq[T](_contents) {
  if (!wasChecked && _contents.isEmpty) throw new IllegalStateException(s"Non-empty seq can't be empty")
  def this(initial: JCollection[T]) = {
    this(initial.toArray, false)
  }
  def this(initial: Iterable[T]) = {
    this(
      {
        val arr: Array[Object] = new Array[Object](initial.size)
        initial.zipWithIndex.foreach { case (o, i) => arr(i) = o.asInstanceOf[Object] }
        arr
      },
      wasChecked = false)
  }
  def concat(nonEmpty: LitSeq[T @uncheckedVariance]): NonEmptyLitSeq[T] =
    iterableFactory.from(iterator ++ nonEmpty.iterator).asInstanceOf[NonEmptyLitSeq[T]]
  override def concat(that: JCollection[T @uncheckedVariance]): NonEmptyLitSeq[T] =
    JStream.concat(this.stream(), that.stream()).collect(new NonEmptyLitSeqJCollector[T])
  override def ++[T1 >: T](suffix: Iterable[T1]): NonEmptyLitSeq[T1] = super.++(suffix).asInstanceOf[NonEmptyLitSeq[T1]]
  def ++[T1 >: T](suffix: LitSeq[T1]): NonEmptyLitSeq[T1]            = super.++(suffix).asInstanceOf[NonEmptyLitSeq[T1]]
  // There are more cardinality refinements that could be made, but for now let's just do the most useful two
  override def map[B](f: T => B): NonEmptyLitSeq[B] =
    new NonEmptyLitSeq(_contents.map(o => f(o.asInstanceOf[T]).asInstanceOf[Object]), wasChecked = true)
  def zip[B](that: NonEmptyLitSeq[B]): NonEmptyLitSeq[(T @uncheckedVariance, B)] = super.zip(that).asNonEmpty
  // ...and our refinement ops can just return `this`
  override def asNonEmpty: NonEmptyLitSeq[T] = this
  override def refine: NonEmptyLitSeq[T]     = this
}
