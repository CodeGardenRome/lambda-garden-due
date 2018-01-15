name := "tic-tac-toe"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.4"

val scalazVersion = "7.2.18"

libraryDependencies ++= Seq(
	"org.scalaz"    %% "scalaz-core" % scalazVersion,
	"org.scalatest" %% "scalatest"   % "3.0.1"  % "test"
)

wartremoverWarnings ++= Warts.unsafe

cancelable in Global := true
