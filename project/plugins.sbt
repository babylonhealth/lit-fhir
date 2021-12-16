logLevel := Level.Warn

if (file(s"${System.getProperty("user.home")}/.ivy2/artifactory_credentials").exists())
  credentials += Credentials(file(s"${System.getProperty("user.home")}/.ivy2/artifactory_credentials"))
else
  credentials += Credentials(
    "Artifactory Realm",
    "artifactory.ops.babylontech.co.uk",
    sys.props("ARTIFACTORY_USER"),
    sys.props("ARTIFACTORY_PWD"))

resolvers += Resolver.jcenterRepo

addSbtPlugin("org.scalameta"     % "sbt-scalafmt"          % "2.3.4")
addSbtPlugin("net.aichler"       % "sbt-jupiter-interface" % "0.8.3")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter"    % "0.5.1")
//addSbtPlugin("com.etsy" % "sbt-checkstyle-plugin" % "3.1.1")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")
