import sbt.Keys.{ libraryDependencies, logBuffered }

val artifactoryHost = "artifactory.ops.babylontech.co.uk"
val artifactory     = s"https://$artifactoryHost/"

val thisVersion = sys.props.get("version") getOrElse "local"

val fullScalaVersion = "2.13.3"
val V = new {
  val circe             = "0.13.0"
  val logback           = "1.2.3"
  val enumeratum        = "1.5.15"
  val scalaMeterVersion = "0.20-BBL"
  val izumiReflect      = "1.0.0-M12"
}

val commonSettings = Seq(
  version := thisVersion,
  organization := "com.babylonhealth.lit",
  scalaVersion := fullScalaVersion,
  resolvers ++= Seq(
    Resolver.mavenLocal,
    "babylon-snapshots" at "https://artifactory.ops.babylontech.co.uk/artifactory/babylon-maven-snapshots",
    "babylon-releases" at "https://artifactory.ops.babylontech.co.uk/artifactory/babylon-maven-releases"
  ),
  libraryDependencies += "org.scala-lang" % "scala-reflect" % fullScalaVersion,
  scalacOptions += "-language:postfixOps"
)
val javaSettings = Seq(
  crossPaths := false,
  resolvers += Resolver.jcenterRepo,
  libraryDependencies ++= Seq(
    "dev.zio"          %% "izumi-reflect" % V.izumiReflect, // Sad times that we need to include this here...
    "org.projectlombok" % "lombok"        % "1.16.22"
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
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies += "org.scalameta" %% "scalameta" % "4.3.15"
  )

lazy val generator = project
  .in(file("generator"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      // Runtime deps
      "com.babylonhealth.lit" %% "hl7"                    % "0.10.3",
      "com.babylonhealth.lit" %% "fhirpath"               % "0.10.3",
      "org.typelevel" %% "cats-effect"    % "2.3.1",
      // Test deps
      "org.scalatest"  %% "scalatest"  % "3.2.3" % Test,
      "org.skyscreamer" % "jsonassert" % "1.5.0" % Test
    )
  )
  .dependsOn(common)

lazy val core = project
  .in(file("core"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= Seq(
      "io.circe"               %% "circe-core"                 % V.circe,
      "io.circe"               %% "circe-generic"              % V.circe,
      "io.circe"               %% "circe-parser"               % V.circe,
      "com.lihaoyi"            %% "fastparse"                  % "2.2.2",
      "com.typesafe"            % "config"                     % "1.4.0",
      "ch.qos.logback"          % "logback-classic"            % V.logback,
      "com.beachape"           %% "enumeratum"                 % V.enumeratum,
      "com.beachape"           %% "enumeratum-circe"           % "1.5.23",
      "io.github.classgraph"    % "classgraph"                 % "4.8.78",
      "org.scala-lang.modules" %% "scala-parallel-collections" % "0.2.0",
      "dev.zio"                %% "izumi-reflect"              % V.izumiReflect,
      // Test
      "org.scalatest"    %% "scalatest"         % "3.2.3" % Test,
      "org.skyscreamer"   % "jsonassert"        % "1.5.0" % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % "5.6.0" % Test,
      "com.chuusai"      %% "shapeless"         % "2.3.3" % Test
    )
  )
  .dependsOn(macros, common)

lazy val hl7 = project
  .in(file("hl7"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= Seq(
      "dev.zio" %% "izumi-reflect" % V.izumiReflect,
      // Test
      "org.scalatest"    %% "scalatest"         % "3.2.3" % Test,
      "org.skyscreamer"   % "jsonassert"        % "1.5.0" % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % "5.6.0" % Test,
      "com.chuusai"      %% "shapeless"         % "2.3.3" % Test
    )
  )
  .dependsOn(core, macros)

lazy val uscore = project
  .in(file("uscore"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= Seq(
      "dev.zio"        %% "izumi-reflect" % V.izumiReflect,
      "org.scalatest"  %% "scalatest"     % "3.2.3" % Test,
      "org.skyscreamer" % "jsonassert"    % "1.5.0" % Test)
  )
  .dependsOn(core, hl7, usbase, macros)

lazy val usbase = project
  .in(file("usbase"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies += "dev.zio" %% "izumi-reflect" % V.izumiReflect
  )
  .dependsOn(core, hl7, macros)

lazy val fhirpath = project
  .in(file("fhirpath"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= Seq(
      "dev.zio"  %% "izumi-reflect" % V.izumiReflect,
      "org.slf4j" % "slf4j-api"     % "1.7.30",
      // Test
      "org.scalatest" %% "scalatest" % "3.2.3" % Test
    )
  )
  .dependsOn(core, hl7, macros)

// Scalameter Benchmark tests
lazy val bench = project
  .in(file("bench"))
  .settings(commonSettings: _*)
  .settings(
    resolvers += "Sonatype OSS Snapshots" at
      "https://oss.sonatype.org/content/repositories/releases",
    libraryDependencies ++= Seq(
      "ca.uhn.hapi.fhir"   % "hapi-fhir-structures-r4" % "4.0.3"             % Test,
      "org.jline"          % "jline"                   % "3.14.1"            % Test,
      "com.storm-enroute" %% "scalameter"              % V.scalaMeterVersion % Test,
      "org.scalatest"     %% "scalatest"               % "3.2.3"             % Test
    ),
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),
    logBuffered := false,
    parallelExecution in Test := false,
    fork in Test := true
  )
  .dependsOn(core, hl7, usbase, protoshim, coreJava)

lazy val coreJava = project
  .in(file("core_java"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    crossPaths := false,
    resolvers += Resolver.jcenterRepo,
    libraryDependencies ++= Seq(
      "dev.zio"          %% "izumi-reflect"     % V.izumiReflect, // Sad times that we need to include this here...
      "org.projectlombok" % "lombok"            % "1.16.22",
      "net.aichler"       % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
      "org.skyscreamer"   % "jsonassert"        % "1.5.0"                          % Test,
      "org.junit.jupiter" % "junit-jupiter"     % "5.5.2"                          % Test
    )
  )
  .dependsOn(core)
  .enablePlugins(JupiterPlugin)

lazy val hl7Java = project
  .in(file("hl7_java"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, coreJava)
  .enablePlugins(JupiterPlugin)

lazy val usbaseJava = project
  .in(file("usbase_java"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, usbase, coreJava, hl7Java)
  .enablePlugins(JupiterPlugin)

lazy val uscoreJava = project
  .in(file("uscore_java"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, usbase, uscore, coreJava, hl7Java, usbaseJava)
  .enablePlugins(JupiterPlugin)

lazy val gproto = project
  .in(file("gproto"))
  .settings(commonSettings: _*)
  .settings(publishSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "com.google.protobuf" % "protobuf-java"      % "3.11.4",
      "com.google.protobuf" % "protobuf-java-util" % "3.11.4",
      "com.beust"           % "jcommander"         % "1.78",
      "org.reflections"     % "reflections"        % "0.9.12",
      "com.google.guava"    % "guava"              % "29.0-jre",
      "org.scalatest"      %% "scalatest"          % "3.2.3" % Test
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
      "org.scalatest" %% "scalatest"     % "3.2.3" % Test
    )
  )
  .dependsOn(core, hl7, uscore, gproto)

lazy val root = project.in(file(".")).aggregate(generator)
