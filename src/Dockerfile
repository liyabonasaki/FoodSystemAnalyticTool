MAINTAINER Liyabona Saki
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/foodSystemAnalyticTool.jar
ENTRYPOINT ["java","-jar","/app.jar"]
CMD ['./deploy.sh' || java -jar "FoodSystemAnalyticTool.jar"]
