#!/bin/bash

./clean.sh
# java -jar <GENERATOR.jar> <WORDS_INPUT_FILE> <OUTPUT_PACKAGE_NAME> <OUTPUT_FOLDER>
java -jar ./target/fluent-api-generator-1.0.0-SNAPSHOT.jar "src/main/resources/postpositions.txt" "io.github.stawirej.fluentapi.postpositions" "src/main/output/postpositions"
java -jar ./target/fluent-api-generator-1.0.0-SNAPSHOT.jar "src/main/resources/complexPrepositions.txt" "io.github.stawirej.fluentapi.prepositions.complex" "src/main/output/prepositions/complex"
java -jar ./target/fluent-api-generator-1.0.0-SNAPSHOT.jar "src/main/resources/simplePrepositions.txt" "io.github.stawirej.fluentapi.prepositions.simple" "src/main/output/prepositions/simple"