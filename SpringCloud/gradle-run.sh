#!/usr/bin/env bash
./gradlew discoveryserver:run --args="--port=8761"
./gradlew configserver:run --args="--port=8090"
./gradlew service:run --args="--port=8080"
./gradlew service:run --args="--port=8081"
./gradlew service:run --args="--port=8082"
./gradlew proxy:run --args="--port=8085"
./gradlew client:run --args="--service=proxy"