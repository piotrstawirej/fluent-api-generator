#!/bin/bash

./clean.sh
java -jar ./target/fluent-api-generator-1.0.0-SNAPSHOT.jar "src/main/resources/postpositions.txt" "com.github.stawirej.fluentapi.postpositions" "src/main/output/postpositions"
java -jar ./target/fluent-api-generator-1.0.0-SNAPSHOT.jar "src/main/resources/complexPrepositions.txt" "com.github.stawirej.fluentapi.prepositions.complex" "src/main/output/prepositions/complex"
java -jar ./target/fluent-api-generator-1.0.0-SNAPSHOT.jar "src/main/resources/simplePrepositions.txt" "com.github.stawirej.fluentapi.prepositions.simple" "src/main/output/prepositions/simple"