FROM xldevops/jdk17-lts
LABEL authors="caobaoqi"


COPY target/sb3-mysql-study-0.0.1-SNAPSHOT.jar .

CMD java -jar sb3-mysql-study-0.0.1-SNAPSHOT.jar

EXPOSE 8080
