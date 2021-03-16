package com.babylonhealth.lit

import java.io.{ File, FileWriter }
import java.nio.charset.StandardCharsets
import java.nio.file.Files

import scala.util.Try

import io.circe.Json
import io.circe.parser.parse

object FileUtils extends FileUtils
trait FileUtils extends common.FileUtils {
  def getFileAsJson(file: File): Json =
    if (!file.exists()) {
      println(s"Oh no, ${file.toPath} desn't exist")
      sys.exit(1)
    } else
      Try(Files.lines(file.toPath, StandardCharsets.UTF_8).toArray.mkString("\n")).toEither
        .flatMap(parse)
        .fold(t => throw new RuntimeException(s"Can't parse ${file.toPath}", t), identity)

  def getAsJson(filename: String): Json = parse(slurpRsc(filename)).fold(throw _, identity)

  def expandGlob(filePathWithGlob: String): Seq[File] = filePathWithGlob.split("/").foldLeft(Seq.empty[File]) {
    case (Nil, ".") => Seq(new File(System.getProperty("user.dir")))
    case (fs, ".") => fs
    case (Nil, "..") => Seq(new File(System.getProperty("user.dir")).getParentFile)
    case (file, "..") => file.map(_.getParentFile).distinct
    case (Nil, next) if !next.contains("*") =>
      val file = new File(next)
      if (file.exists()) Seq(file)
      else {
        println(s"Couldn't expand path $filePathWithGlob -- $next does not exist")
        sys.exit(1)
      }
    case (files, "*")  => files.filter(_.isDirectory).flatMap(_.listFiles)
    case (files, "**") => ??? // TODO: handle this? Or not bother?
    case (files, next) if !next.contains("*") =>
      files.filter(_.isDirectory).flatMap(_.listFiles).filter(_.getName == next)
    case (files, globbyFilename) =>
      files
        .filter(_.isDirectory)
        .flatMap(_.listFiles)
        .filter(_.getName.matches(globbyFilename.replaceAllLiterally("*", ".*")))
  }

  def emptyCreate(dirName: String): Unit = {
    val dir = new File(dirName)
    if (dir.exists()) { // if dir exists, delete it
      println(s"deleting $dirName")
      dir.listFiles().foreach(_.delete())
      dir.delete()
    }
    dir.mkdirs() // create the directory fresh
    println(s"created $dirName")
  }

  def write(location: String, contents: String): Unit = {
    val fw = new FileWriter(location)
    try fw.write(contents)
    finally fw.close()
  }
}
