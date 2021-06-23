import sbt.Def
import sbt.Keys.{ libraryDependencies, logBuffered }

val artifactoryHost = "artifactory.ops.babylontech.co.uk"
val artifactory     = s"https://$artifactoryHost/"

val thisVersion = sys.props.get("version") getOrElse "local"

val scala2Version = "2.13.6"
val scala3Version = "3.0.2-RC1-bin-20210618-515cb9f-NIGHTLY"
val crossVersions = Seq(scala2Version, scala3Version)

def isScala2(version: String) = version startsWith "2"

val V = new {
  val circe                  = "0.14.1"
  val logback                = "1.2.3"
  val enumeratum             = "1.5.15"
  val scalaMeterVersion      = "0.22.BBL"
  val izumiReflect           = "1.1.2"
  val litVersionForGenerator = "0.12.0"
  val scalaTest              = "3.2.9"
  val jsonassert             = "1.5.0"
  val lombok                 = "1.16.22"
  val jUnit                  = "5.6.0"
}

def commonSettingsWithCrossVersions(versions: Seq[String]) = Seq(
  version := thisVersion,
  organization := "com.babylonhealth.lit",
  scalaVersion := scala2Version,
  crossScalaVersions := versions,
  resolvers ++= Seq(
    Resolver.mavenLocal,
    "babylon-snapshots" at "https://artifactory.ops.babylontech.co.uk/artifactory/babylon-maven-snapshots",
    "babylon-releases" at "https://artifactory.ops.babylontech.co.uk/artifactory/babylon-maven-releases"
  ),
  libraryDependencies ++= (if (isScala2(scalaVersion.value)) Seq("org.scala-lang" % "scala-reflect" % scala2Version)
                           else Nil),
  scalacOptions += "-language:postfixOps",
  scalacOptions ++= (if (!isScala2(scalaVersion.value)) Seq("-Ytasty-reader") else Nil)
)
val commonSettings = commonSettingsWithCrossVersions(crossVersions)
// for now, Java  modules will be compiled against scala 2 (it's been more thorougly tested, and the setFoo API from
// class annotation macros is more convenient called from Java than the .set(_.foo) one, since it requires no implicits
val commonJSettings = commonSettingsWithCrossVersions(Seq(scala2Version))
val javaSettings = Seq(
  crossPaths := false,
  resolvers += Resolver.jcenterRepo,
  libraryDependencies ++= Seq(
    "dev.zio"          %% "izumi-reflect" % V.izumiReflect, // Sad times that we need to include this here...
    "org.projectlombok" % "lombok"        % V.lombok
  )
)
val publishSettings = Seq(
  publishTo := {
    if (version.value.trim.endsWith("SNAPSHOT"))
      Some("snapshots" at artifactory + "artifactory/babylon-maven-snapshots")
    else
      Some("releases" at artifactory + "artifactory/babylon-maven-releases")
  },
  publishMavenStyle := true,
  publishArtifact := true
)

lazy val common = project
  .in(file("common"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)

lazy val macros = project
  .in(file("macros"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations") else Nil),
    libraryDependencies ++= (if (isScala2(scalaVersion.value)) Seq("org.scalameta" %% "scalameta" % "4.3.15") else Nil)
  )

lazy val generator = project
  .in(file("generator"))
  .settings(commonJSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      // Runtime deps
      "com.babylonhealth.lit" %% "hl7"         % V.litVersionForGenerator,
      "com.babylonhealth.lit" %% "fhirpath"    % V.litVersionForGenerator,
      "org.typelevel"         %% "cats-effect" % "2.3.1",
      // Test deps
      "org.scalatest"  %% "scalatest"  % V.scalaTest  % Test,
      "org.skyscreamer" % "jsonassert" % V.jsonassert % Test
    )
  )
  .dependsOn(common)

lazy val core = project
  .in(file("core"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    // https://github.com/lampepfl/dotty/issues/12834 - bug in doctool forbids us from generating doc for scala3 r/n,
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "io.circe"            %% "circe-core"      % V.circe,
      "io.circe"            %% "circe-generic"   % V.circe,
      "io.circe"            %% "circe-parser"    % V.circe,
      "com.typesafe"         % "config"          % "1.4.0",
      "ch.qos.logback"       % "logback-classic" % V.logback,
      "io.github.classgraph" % "classgraph"      % "4.8.78",
      "dev.zio"             %% "izumi-reflect"   % V.izumiReflect,
      // Test
      "org.scalatest"    %% "scalatest"         % V.scalaTest  % Test,
      "org.skyscreamer"   % "jsonassert"        % V.jsonassert % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % V.jUnit      % Test
    ) ++ (if (isScala2(scalaVersion.value))
            Seq("com.beachape" %% "enumeratum" % V.enumeratum, "com.beachape" %% "enumeratum-circe" % "1.5.23")
          else Nil)
  )
  .dependsOn(macros, common)

lazy val hl7 = project
  .in(file("hl7"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "dev.zio" %% "izumi-reflect" % V.izumiReflect,
      // Test
      "org.scalatest"    %% "scalatest"         % V.scalaTest  % Test,
      "org.skyscreamer"   % "jsonassert"        % V.jsonassert % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % V.jUnit      % Test
    )
  )
  .dependsOn(core, macros)

lazy val uscore = project
  .in(file("uscore"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "dev.zio"        %% "izumi-reflect" % V.izumiReflect,
      "org.scalatest"  %% "scalatest"     % V.scalaTest  % Test,
      "org.skyscreamer" % "jsonassert"    % V.jsonassert % Test)
  )
  .dependsOn(core, hl7, usbase, macros)

lazy val usbase = project
  .in(file("usbase"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "dev.zio"        %% "izumi-reflect" % V.izumiReflect,
      "org.scalatest"  %% "scalatest"     % V.scalaTest  % Test,
      "org.skyscreamer" % "jsonassert"    % V.jsonassert % Test)
  )
  .dependsOn(core, hl7, macros)

lazy val fhirpath = project
  .in(file("fhirpath"))
  .settings(commonJSettings: _*) // TODO: crosspublish for scala 3.0.0
  .settings(publishSettings: _*)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "fastparse"     % "2.2.2",
      "dev.zio"     %% "izumi-reflect" % V.izumiReflect,
      "org.slf4j"    % "slf4j-api"     % "1.7.30",
      // Test
      "org.scalatest" %% "scalatest" % V.scalaTest % Test
    )
  )
  .dependsOn(core, hl7, macros)

// Scalameter Benchmark tests
lazy val bench = project
  .in(file("bench"))
  .settings(commonSettings: _*)
  .settings(
    resolvers ++= Seq(
      "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases",
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots" // needed for jackson-module-scala:2.13.0-SNAPSHOT
    ),
    libraryDependencies ++= Seq(
      "ca.uhn.hapi.fhir"   % "hapi-fhir-structures-r4" % "4.0.3"             % Test,
      "org.jline"          % "jline"                   % "3.14.1"            % Test,
      "com.storm-enroute" %% "scalameter"              % V.scalaMeterVersion % Test,
      "org.scalatest"     %% "scalatest"               % V.scalaTest         % Test
    ),
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),
    logBuffered := false,
    parallelExecution in Test := false,
    fork in Test := true
  )
  .dependsOn(core, hl7, usbase, protoshim)

lazy val coreJava = project
  .in(file("core_java"))
  .settings(commonJSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    crossPaths := false,
    resolvers += Resolver.jcenterRepo,
    libraryDependencies ++= Seq(
      "dev.zio"          %% "izumi-reflect"     % V.izumiReflect, // Sad times that we need to include this here...
      "org.projectlombok" % "lombok"            % V.lombok,
      "net.aichler"       % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
      "org.skyscreamer"   % "jsonassert"        % V.jsonassert                     % Test,
      "org.junit.jupiter" % "junit-jupiter"     % "5.5.2"                          % Test
    )
  )
  .dependsOn(core)
  .enablePlugins(JupiterPlugin)

lazy val hl7Java = project
  .in(file("hl7_java"))
  .settings(commonJSettings: _*)
  .settings(publishSettings: _*)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, coreJava)
  .enablePlugins(JupiterPlugin)

lazy val usbaseJava = project
  .in(file("usbase_java"))
  .settings(commonJSettings: _*)
  .settings(publishSettings: _*)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, usbase, coreJava, hl7Java)
  .enablePlugins(JupiterPlugin)

lazy val uscoreJava = project
  .in(file("uscore_java"))
  .settings(commonJSettings: _*)
  .settings(publishSettings: _*)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, usbase, uscore, coreJava, hl7Java, usbaseJava)
  .enablePlugins(JupiterPlugin)

lazy val gproto = project
  .in(file("gproto"))
  .settings(commonJSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "com.google.protobuf" % "protobuf-java"      % "3.11.4",
      "com.google.protobuf" % "protobuf-java-util" % "3.11.4",
      "com.beust"           % "jcommander"         % "1.78",
      "org.reflections"     % "reflections"        % "0.9.12",
      "com.google.guava"    % "guava"              % "29.0-jre",
      "org.scalatest"      %% "scalatest"          % V.scalaTest % Test
    ),
    javafmtOnCompile := false,
    crossPaths := false
  )

lazy val protoshim = project
  .in(file("protoshim"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "dev.zio"       %% "izumi-reflect" % V.izumiReflect,
      "org.scalatest" %% "scalatest"     % V.scalaTest % Test
    )
  )
  .dependsOn(core, hl7, uscore, gproto)

lazy val root = project.in(file(".")).aggregate(generator)
