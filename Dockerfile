# Dockerfile 
# FROM openjdk:7
# COPY . /usr/src/myapp
# WORKDIR /usr/src/myapp
# RUN javac Main.java
# CMD ["java", "Main"]

#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/Exam/src
COPY pom.xml /home/Exam
RUN mvn -f /home/Exam/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/Exam/target/ENSE375Final-0.0.1-SNAPSHOT.jar /usr/local/lib/Exam.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/Exam.jar"]