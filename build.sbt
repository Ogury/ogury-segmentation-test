name := "segmentation"

version := "1.0"

scalaVersion := "2.12.18"

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.5"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test

libraryDependencies += "org.mockito" % "mockito-all" % "1.10.19" % Test
