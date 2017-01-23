#!/usr/bin/env bash
apt-get install openjdk-8-jre
update-alternatives --config java
sbt compile && sbt package && sbt run