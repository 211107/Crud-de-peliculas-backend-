FROM openjdk:16
ADD target/esmeraldaaws.jar esmeraldaaws.jar
ENTRYPOINT ["java","-jar","esmeraldaaws.jar"]