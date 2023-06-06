FROM openjdk:11
COPY target/spring-boot-thymeleaf-2.0.0.war spring-boot-thymeleaf-2.0.0.war
ENTRYPOINT ["java","-jar", "/spring-boot-thymeleaf-2.0.0.war"]
