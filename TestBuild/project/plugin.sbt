// Questo è un parametro globale di SBT che definisce una
// lista di repository da cui scaricare le dipendenze o i plugin.
// sonatype è specifica un repository pubblico di sonatype
//resolvers += Resolver.sonatypeRepo("releases") // questo è deprecato
resolvers := Resolver.sonatypeOssRepos("releases")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.3.0")
//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.1.0")