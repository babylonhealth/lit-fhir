logLevel := Level.Warn

resolvers += Resolver.jcenterRepo

addSbtPlugin("org.scalameta"     % "sbt-scalafmt"          % "2.3.0")
addSbtPlugin("net.aichler"       % "sbt-jupiter-interface" % "0.8.3")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter"    % "0.5.1")
addSbtPlugin("com.github.sbt"    % "sbt-ci-release"        % "1.5.9")

addDependencyTreePlugin
