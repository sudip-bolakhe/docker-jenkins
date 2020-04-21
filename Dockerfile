FROM java:8
EXPOSE 8080
VOLUME /usr/docker-demo
COPY  ./build/libs/docker-0.1.jar ./
ENTRYPOINT ["java", "-jar", "docker-0.1.jar"]