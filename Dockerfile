FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY . .
ENTRYPOINT ["java","-jar","/players.jar"]

