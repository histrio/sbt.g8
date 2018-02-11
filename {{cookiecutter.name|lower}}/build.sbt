import Dependencies._

lazy val root = (project in file(".")).
  settings(
    scalaVersion := "{{ cookiecutter.scala_version }}",
    organization := "{{ cookiecutter.organization }}",
    version := "{{ cookiecutter.version }}",
    homepage := Some(url("https://github.com/{{ cookiecutter.github_username }}/{{ cookiecutter.name }}")),
    startYear := Some(2018),
    name := "{{ cookiecutter.name }}",
    libraryDependencies ++= Seq(
        scalaTest % Test,
        logback,
        scalaLogging,
        typesafeConfig
    )
  )


