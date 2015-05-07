name := """products"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
//  jdbc,
//  anorm,
//  cache,
//  ws,
//  "net.sf.barcode4j" % "barcode4j" % "2.1" //FAIL - dependency invalid, so downloaded the JAR file to /lib
)

