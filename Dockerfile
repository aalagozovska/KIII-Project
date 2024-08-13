FROM openjdk:18
VOLUME /tmp
EXPOSE 8080
ADD target/demo-0.0.1-SNAPSHOT.jar players.jar
ENTRYPOINT ["java","-jar","players.jar"]
