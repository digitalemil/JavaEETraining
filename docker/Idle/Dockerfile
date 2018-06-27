FROM centos:7
RUN yum install -y java-1.8.0-openjdk
COPY gctestapp-1.0-SNAPSHOT.jar /
ENTRYPOINT echo JAVA_OPTS: $JAVA_OPTS; java $JAVA_OPTS -cp /gctestapp-1.0-SNAPSHOT.jar Idle
