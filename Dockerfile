FROM openjdk:21
EXPOSE 8084
ADD build/libs/docker-demo-0.0.1-SNAPSHOT.jar docker-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-demo-0.0.1-SNAPSHOT.jar"]