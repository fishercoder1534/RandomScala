#!/usr/bin/env bash
apt-get install openjdk-8-jre
alternatives --config java
sbt compile && sbt package && sbt run