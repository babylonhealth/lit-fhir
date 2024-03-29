import sbt.Keys.{ libraryDependencies, logBuffered }

inThisBuild(
  Seq(
    organization    := "com.babylonhealth.lit",
    publishArtifact := true,
    homepage        := Some(url("https://babylonhealth.com")),
    licenses        := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
      Developer("hughsimpson", "Hugh Simpson", "hugh.simpson@babylonhealth.com", url("https://github.com/hughsimpson"))
    ),
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository     := "https://s01.oss.sonatype.org/service/local"
  ))

val scala2Version = "2.13.10"
val scala3Version = "3.2.0"
val crossVersions = Seq(scala2Version, scala3Version)

def isScala2(version: String) = version startsWith "2"

val V = new {
  val circe                  = "0.14.3"
  val enumeratum             = "1.7.0"
  val googleFHIR             = "0.6.1"
  val izumiReflect           = "2.2.1"
  val jsonassert             = "1.5.1"
  val jUnit                  = "5.9.1"
  val litVersionForGenerator = "0.14.17"
  val logback                = "1.4.4"
  val lombok                 = "1.18.24"
  val scalaMeterVersion      = "0.22"
  val scalaTest              = "3.2.14"
}

def commonSettingsWithCrossVersions(versions: Seq[String]) = Seq(
  scalaVersion        := scala2Version,
  crossScalaVersions  := versions,
  sonatypeProfileName := "com.babylonhealth",
  resolvers += Resolver.mavenLocal,
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

lazy val common = project
  .in(file("common"))
  .settings(commonSettings)

lazy val macros = project
  .in(file("macros"))
  .settings(commonSettings)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations") else Nil),
    libraryDependencies ++= (if (isScala2(scalaVersion.value)) Seq("org.scalameta" %% "scalameta" % "4.6.0") else Nil)
  )

def getGeneratorVersion: String = sys.props.get("genver") match {
  case Some(v) if v.matches("""g\d+\.\d+\.\d+(-\d+)?(-SNAPSHOT)?""") => v.tail
  case _                                                             => "latest-SNAPSHOT"
}
lazy val generator = project
  .in(file("generator"))
  .settings(commonSettings)
  .settings(
    // We override the version set by sbt-dynver for the generator module
    version := getGeneratorVersion,
    libraryDependencies ++= Seq(
      // Runtime deps
      "com.babylonhealth.lit" %% "hl7"         % V.litVersionForGenerator,
      "com.babylonhealth.lit" %% "fhirpath"    % V.litVersionForGenerator,
      "org.typelevel"         %% "cats-effect" % "3.3.0",
      // Test deps
      "org.scalatest"  %% "scalatest"  % V.scalaTest  % Test,
      "org.skyscreamer" % "jsonassert" % V.jsonassert % Test
    )
  )
  .dependsOn(common)

lazy val core = project
  .in(file("core"))
  .settings(commonSettings)
  .settings(
    // https://github.com/lampepfl/dotty/issues/12834 - bug in doctool forbids us from generating doc for scala3 r/n,
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "io.circe"            %% "circe-core"      % V.circe,
      "io.circe"            %% "circe-generic"   % V.circe,
      "io.circe"            %% "circe-parser"    % V.circe,
      "com.typesafe"         % "config"          % "1.4.2",
      "ch.qos.logback"       % "logback-classic" % V.logback,
      "io.github.classgraph" % "classgraph"      % "4.8.149",
      "dev.zio"             %% "izumi-reflect"   % V.izumiReflect,
      // Test
      "org.scalatest"    %% "scalatest"         % V.scalaTest  % Test,
      "org.skyscreamer"   % "jsonassert"        % V.jsonassert % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % V.jUnit      % Test
    ) ++ (if (isScala2(scalaVersion.value))
            Seq("com.beachape" %% "enumeratum" % V.enumeratum, "com.beachape" %% "enumeratum-circe" % "1.7.0")
          else Nil)
  )
  .dependsOn(macros, common)

lazy val hl7 = project
  .in(file("hl7"))
  .settings(commonSettings)
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

lazy val ukcore = project
  .in(file("ukcore"))
  .settings(commonSettings)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "dev.zio"        %% "izumi-reflect" % V.izumiReflect,
      "org.scalatest"  %% "scalatest"     % V.scalaTest  % Test,
      "org.skyscreamer" % "jsonassert"    % V.jsonassert % Test)
  )
  .dependsOn(core, hl7, macros)

lazy val uscore = project
  .in(file("uscore"))
  .settings(commonSettings)
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
  .settings(commonSettings)
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
  .settings(commonSettings)
  .settings(
    scalacOptions ++= (if (isScala2(scalaVersion.value)) Seq("-Ymacro-annotations", "-deprecation")
                       else Seq("-language:implicitConversions")),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-parse"    % "0.3.8",
      "dev.zio"       %% "izumi-reflect" % V.izumiReflect,
      "org.slf4j"      % "slf4j-api"     % "2.0.3",
      // Test
      "org.scalatest" %% "scalatest" % V.scalaTest % Test
    )
  )
  .dependsOn(core, hl7, macros)

// Scalameter Benchmark tests
lazy val bench = project
  .in(file("bench"))
  .settings(commonSettings)
  .settings(
    resolvers ++= Seq(
      "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases",
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots" // needed for jackson-module-scala:2.13.0-SNAPSHOT
    ),
    libraryDependencies ++= Seq(
      "ca.uhn.hapi.fhir"              % "hapi-fhir-structures-r4" % "4.0.3"             % Test,
      "org.jline"                     % "jline"                   % "3.14.1"            % Test,
      "io.github.hughsimpson"        %% "scalameter"              % V.scalaMeterVersion % Test,
      "com.fasterxml.jackson.module" %% "jackson-module-scala"    % "2.13.0"            % Test,
      "org.scalatest"                %% "scalatest"               % V.scalaTest         % Test,
      "org.skyscreamer"               % "jsonassert"              % V.jsonassert        % Test
    ),
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),
    logBuffered               := false,
    parallelExecution in Test := false,
    fork in Test              := true
  )
  .dependsOn(core, hl7, usbase, protoshim)

lazy val coreJava = project
  .in(file("core_java"))
  .settings(commonJSettings)
  .settings(
    crossPaths := false,
    resolvers += Resolver.jcenterRepo,
    libraryDependencies ++= Seq(
      "dev.zio"          %% "izumi-reflect"     % V.izumiReflect, // Sad times that we need to include this here...
      "org.projectlombok" % "lombok"            % V.lombok,
      "net.aichler"       % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
      "org.skyscreamer"   % "jsonassert"        % V.jsonassert % Test,
      "org.junit.jupiter" % "junit-jupiter"     % "5.9.1" % Test
    )
  )
  .dependsOn(core)
  .enablePlugins(JupiterPlugin)

lazy val hl7Java = project
  .in(file("hl7_java"))
  .settings(commonJSettings)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, coreJava)
  .enablePlugins(JupiterPlugin)

lazy val usbaseJava = project
  .in(file("usbase_java"))
  .settings(commonJSettings)
  .settings(javaSettings: _*)
  .dependsOn(core, hl7, usbase, coreJava, hl7Java)
  .enablePlugins(JupiterPlugin)

lazy val uscoreJava = project
  .in(file("uscore_java"))
  .settings(commonJSettings)
  .settings(javaSettings: _*)
  .settings(libraryDependencies ++= Seq(
    "net.aichler"       % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
    "org.skyscreamer"   % "jsonassert"        % V.jsonassert                     % Test,
    "org.junit.jupiter" % "junit-jupiter"     % "5.9.1"                          % Test
  ))
  .dependsOn(core, hl7, usbase, uscore, coreJava, hl7Java, usbaseJava)
  .enablePlugins(JupiterPlugin)

lazy val ukcoreJava = project
  .in(file("ukcore_java"))
  .settings(commonJSettings)
  .settings(javaSettings: _*)
  .settings(libraryDependencies ++= Seq(
    "net.aichler"       % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
    "org.skyscreamer"   % "jsonassert"        % V.jsonassert                     % Test,
    "org.junit.jupiter" % "junit-jupiter"     % "5.9.1"                          % Test
  ))
  .dependsOn(core, hl7, ukcore, coreJava, hl7Java)
  .enablePlugins(JupiterPlugin)

lazy val protoshim = project
  .in(file("protoshim"))
  .settings(commonSettings)
  .settings(
    resolvers += "google-maven".at("https://maven.google.com"),
    libraryDependencies ++= Seq(
      "dev.zio"        %% "izumi-reflect" % V.izumiReflect,
      "com.google.fhir" % "r4"            % V.googleFHIR,
      "org.scalatest"  %% "scalatest"     % V.scalaTest  % Test,
      "org.skyscreamer" % "jsonassert"    % V.jsonassert % Test
    )
  )
  .dependsOn(core, hl7, uscore)

lazy val root =
  project
    .in(file("."))
    .settings(commonSettings, publish / skip := true)
    .dependsOn(
      common,
      macros,
      core,
      hl7,
      usbase,
      uscore,
      coreJava,
      hl7Java,
      usbaseJava,
      uscoreJava,
      ukcore,
      ukcoreJava,
      fhirpath,
      protoshim)
    .aggregate(
      common,
      macros,
      core,
      hl7,
      usbase,
      uscore,
      coreJava,
      hl7Java,
      usbaseJava,
      uscoreJava,
      ukcore,
      ukcoreJava,
      fhirpath,
      protoshim)

addCommandAlias(
  "pushPackages",
  "; +common/publishSigned; +macros/publishSigned; +core/publishSigned; " +
    "+hl7/publishSigned; +usbase/publishSigned; +uscore/publishSigned; +ukcore/publishSigned; coreJava/publishSigned; hl7Java/publishSigned; " +
    "usbaseJava/publishSigned; uscoreJava/publishSigned; ukcoreJava/publishSigned; +fhirpath/publishSigned; +protoshim/publishSigned"
)
