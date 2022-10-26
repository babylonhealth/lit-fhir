logLevel := Level.Warn

resolvers += Resolver.jcenterRepo

addSbtPlugin("org.scalameta"     % "sbt-scalafmt"          % "2.4.6")
addSbtPlugin("net.aichler"       % "sbt-jupiter-interface" % "0.11.1")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter"    % "0.7.0")
addSbtPlugin("com.github.sbt"    % "sbt-ci-release"        % "1.5.11")

addDependencyTreePlugin
