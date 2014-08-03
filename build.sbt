scalaJSSettings

name := "angular-scala"

organization := "com.pwootage"

version := "1.0-1.3.0-beta.17"

scalaVersion := "2.11.2"

ScalaJSKeys.jsDependencies ++= Seq(
  ProvidedJS / "bridge.js",
  ProvidedJS / "angular.js"
)

ScalaJSKeys.requiresDOM := true