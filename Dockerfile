#FROM openjdk:11
#EXPOSE 8080
#ADD target/spring-with-pgql-2.jar app.jar
#ENTRYPOINT ["java","-jar", "app.jar"]


FROM openjdk:11
ARG JAR=target/*.jar
COPY ${JAR} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "app.jar"]
