# RandomScala

[![Build Status](https://travis-ci.org/fishercoder1534/RandomScala.svg?branch=master)](https://travis-ci.org/fishercoder1534/RandomScala)

How to check out a Scala/SBT project like this one into IntelliJ Idea? This post
helps: http://stackoverflow.com/questions/4250318/how-to-create-sbt-project-with-intellij-idea

1. install scala plugin into your IntelliJ
2. git clone this repo into your local machine
3. File -> New -> Project -> Scala -> SBT -> change Project location to where you cloned this repo -> Finish!
4. If you cannot run these simple Scala programs in your Intellij, do this from your
   terminal: `scalac src/main/scala/HelloWorld.scala && scala HelloWorld`
