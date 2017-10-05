FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD  build/libs/bluegreen-0.0.1-SNAPSHOT.jar bluegreen.jar
EXPOSE 9098
ENTRYPOINT ["java","-jar","/bluegreen.jar"]