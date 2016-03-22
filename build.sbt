name := """mop-organizer"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.github.tototoshi" %% "play-scalate" % "0.3.0-SNAPSHOT",
  "org.scalatra.scalate" %% "scalate-core" % "1.7.1",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "app" / "views"