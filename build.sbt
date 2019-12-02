ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "org.bheaver.ngl4"
ThisBuild / name := "admin"

lazy val core = project.dependsOn(protocol)
  .settings(
    name := "core",
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.1.8.RELEASE",
    libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.7.0",
    // https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat
    libraryDependencies += "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.0",
    libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.7",
    libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.0.8" % "test"



  )

lazy val protocol = project

lazy val root = (project in file("."))
  .aggregate(core, protocol)
