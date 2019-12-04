Repository to go along with the *How To Secure Your Gradle Credentials In Jenkins* article
at [tomgregory.com](https://www.tomgregory.com).

## Pre-requisites

* Docker (unless you just want to run the application)

## Running

`./gradlew docker dockerComposeUp`

## Stopping

`docker-compose down`

(unfortunately the Palantir Gradle plugin doesn't provide a *dockerComposeDown* task
so we have to run the *docker-compose* command directly)