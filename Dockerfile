FROM openjdk:8
EXPOSE 8080
ADD target/GithubActionsDemo.jar GithubActionsDemo.jar
ENTRYPOINT ["java", "-jar", "/GithubActionsDemo.jar"]