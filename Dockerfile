FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/demo-0.0.1-SNAPSHOT.jar players.jar
ENTRYPOINT ["java","-jar","/players.jar"]
