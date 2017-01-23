#!/usr/bin/env bash
apt-get install openjdk-8-jre
sbt compile && sbt package && sbt run