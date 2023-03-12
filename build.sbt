scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")
Global / serverConnectionType := ConnectionType.Tcp // experimental