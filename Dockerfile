 FROM java:8
 EXPOSE 8080
 ADD /target/springdocker.jar springdocker.jar
 ENTRYPOINT ["java","-jar","springdocker.jar"]
