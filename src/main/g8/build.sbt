name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.4"

homepage := Some(url("https://github.com/$github_username$/$name;format="norm"$"))

startYear := Some(2015)

libraryDependencies ++= Seq(
 "org.scalatest" %% "scalatest" % "2.2.2" % "test"
 ,"ch.qos.logback" % "logback-classic" % "1.1.2"
 ,"com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
 ,"com.typesafe" % "config" % "1.2.1"
)

