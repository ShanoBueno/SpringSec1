FROM openjdk:8
EXPOSE 8084
ADD target/springsecurity-0.0.1-SNAPSHOT.war  springsecurity-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/springsecurity-0.0.1-SNAPSHOT.war"]