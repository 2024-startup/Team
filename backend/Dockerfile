FROM openjdk:17
ARG JAR_FILE=ready/build/libs/server.jar
COPY ${JAR_FILE} /home/server.jar
ENTRYPOINT ["java","-jar","/home/server.jar"]
