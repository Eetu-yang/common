FROM java:8
VOLUME /tmp
ADD single-pro-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java  -jar /app.jar" ]
