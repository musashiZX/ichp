FROM openjdk:19
EXPOSE 8080
ADD target/ichp-demo.jar ichp-demo.jar
LABEL authors="BP64RN"

ENTRYPOINT ["java", "-jar", "/ichp-demo.jar"]