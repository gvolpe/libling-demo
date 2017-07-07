name := """libling-demo"""
scalaVersion := "2.12.2"

// the libling library plugin configures this build as a libling
enablePlugins(HacklingLibraryPlugin)

// choose your test framework (but don't include binary dependencies in compile scope)
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.9" % "test"

sourceDependencies += Dependency(
  HashVersion("a2de5ae94a7160a7938cdd11e8509b5b48b25082"), 
  Repositories(uri("https://github.com/gvolpe/hello-world")))
