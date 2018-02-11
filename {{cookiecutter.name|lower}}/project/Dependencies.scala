import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val logback = "ch.qos.logback" % "logback-classic" % "1.1.7"
  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
  lazy val typesafeConfig = "com.typesafe" % "config" % "1.3.2"
}
