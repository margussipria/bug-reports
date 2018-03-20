scalaVersion := "2.12.4"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  //.enablePlugins(PlayNettyServer)
  //.disablePlugins(PlayAkkaHttpServer)

resolvers ++= Seq(
)

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)

routesGenerator := InjectedRoutesGenerator