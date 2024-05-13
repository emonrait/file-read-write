FROM openjdk:17
EXPOSE 7003
ADD target/file-read-write.jar file-read-write.jar
ENTRYPOINT ["java","-jar","/file-read-write.jar"]

