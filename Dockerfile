FROM openjdk:8
EXPOSE 8084
ADD target/springsec1-0.0.1-SNAPSHOT.war  springsec1-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/springsec1-0.0.1-SNAPSHOT.war"]