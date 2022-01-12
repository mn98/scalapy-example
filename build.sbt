ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "scalapy-example"
  )

libraryDependencies += "me.shadaj" %% "scalapy-core" % "0.5.1"

fork := true

import ai.kien.python.Python

lazy val python = Python("/opt/anaconda3/bin/python3.9")

lazy val scalapyJavaOpts = python.scalapyProperties.get.map {
  case (k, v) => s"""-D$k=$v"""
}.toSeq

javaOptions ++= scalapyJavaOpts
