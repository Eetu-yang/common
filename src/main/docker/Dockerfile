FROM java:8
VOLUME /tmp
ADD ./single-pro-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar /app.jar" ]