
lazy val commonSettings = Seq(
  name := "cse116",
  version := "0.1",
  scalaVersion := "2.12.12"
)

lazy val core = (project in file("."))
  .settings(
    commonSettings,
    libraryDependencies ++=
      Seq(
        "com.typesafe.akka" %% "akka-actor" % "2.6.3",
        "com.typesafe.akka" %% "akka-stream" % "2.6.3",
        "com.typesafe.akka" %% "akka-slf4j" % "2.6.3",

        "com.typesafe.akka" %% "akka-http" % "10.1.11",
        "org.typelevel" %% "cats-core" % "2.0.0",

        "com.typesafe.play" %% "play-json" % "2.7.1",
        "com.corundumstudio.socketio" % "netty-socketio" % "1.7.12",

        "ch.qos.logback" % "logback-classic" % "1.2.3",
        "net.logstash.logback" % "logstash-logback-encoder" % "6.3",
        "org.slf4j" % "jul-to-slf4j" % "1.7.30",

        "org.scalatest" %% "scalatest" % "3.1.0" % Test,
        "com.softwaremill.diffx" %% "diffx-scalatest" % "0.3.2" % Test
      )
  )
