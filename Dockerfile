FROM openjdk:11

#EXPOSE 8080

WORKDIR /app

COPY target/voting-control.jar /app/voting-control.jar

ENTRYPOINT [ "java", "-jar", "voting-control.jar" ]

