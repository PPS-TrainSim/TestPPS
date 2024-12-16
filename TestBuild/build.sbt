
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

// Specifica la classe principale
assembly / mainClass := Some("main")

// Aggiungi il repository Sonatype OSS
// Aggiungi repository se non trova in maven
//resolvers += Resolver.sonatypeRepo("releases")

// Evita conflitti di dipendenze
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x                           => MergeStrategy.first
}

lazy val root = (project in file("."))
  .settings(
    name := "TestBuild",
    libraryDependencies ++= Seq(
      // dipendenze
      "org.scalatest" %% "scalatest" % "3.2.17" % Test // ScalaTest per i test
      )
  )

lazy val myTask = taskKey[Unit]("Descrizione del task")

myTask := {
  println("Eseguendo il mio task!")
}

//lazy val assemblyTask = taskKey[Unit]("Esegue il comando sbt assembly")
//
//assemblyTask := {
//  val _ = assembly.value // Esegue il task assembly
//  println("Build dell'assembly completata con successo!")
//
