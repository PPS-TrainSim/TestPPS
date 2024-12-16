ThisBuild / scalaVersion := "3.3.4"

scalafmtOnCompile := true
coverageEnabled := true

wartremoverErrors ++= Warts.unsafe
wartremoverErrors --= Seq(
  Wart.DefaultArguments,
)
wartremoverWarnings ++= Warts.all

lazy val root = (project in file("."))
  .settings(
    name := "TestPPS",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test // ScalaTest per i test
    ),
    Global / onLoad ~= (_ andThen ("writeHooks" :: _)),
  )
