############################################################
# Dockerfile to run the Application
############################################################

# Set the base image to Ubuntu
FROM relateiq/oracle-java8

# File Author / Maintainer
MAINTAINER Erneszt


# Usage: ADD [source directory or URL] [destination directory]
ADD . /hello-world

# Usage: WORKDIR /path
WORKDIR /hello-world

EXPOSE 8080

RUN ./gradlew tasks