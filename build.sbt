name := "admin"

ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.0"

lazy val protocol = (project in file("protocol")).settings(
  scalaVersion := "2.13.0"
)

lazy val core = (project in file("core")).dependsOn(protocol).settings(
  scalaVersion := "2.13.0",
  libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  libraryDependencies += "org.springframework.boot" % "spring-boot" % "2.1.7.RELEASE"
)

lazy val root = (project in file(".")).aggregate(protocol, core)


