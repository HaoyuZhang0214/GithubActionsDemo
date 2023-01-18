FROM openjdk:8
EXPOSE 8080
ADD target/github_actions_demo_repo.jar github_actions_demo_repo.jar
ENTRYPOINT ["java", "-jar", "/github_actions_demo_repo.jar"]