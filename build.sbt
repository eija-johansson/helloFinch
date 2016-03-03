lazy val root = (project in file(".")).
  settings(
    name         := "helloworld",
    version      := "1.0",
    scalaVersion := "2.11.7",

    libraryDependencies ++= Seq(
      "com.github.finagle" %% "finch-core"    % "0.10.0",
      "com.github.finagle" %% "finch-circe"   % "0.10.0",
      "io.circe"           %% "circe-generic" % "0.3.0"
    )

  )
