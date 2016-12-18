import Dependencies._

lazy val root = (project in file(".")).
  settings(
    organization := "$organization$",
    scalaVersion := "2.12.0",
    version := "$version$",
    homepage := Some(url("https://github.com/$github_username$/$name;format="norm"$")),
    startYear := Some(2016),
    name := "$name$",
    libraryDependencies ++= Seq(
        scalaTest % Test,
        logback,
        scalaLogging,
        typesafeConfig
    )
  )


