FROM library/ubuntu:latest

RUN apt-get update
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list
RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 642AC823
RUN apt-get -y install apt-transport-https
RUN apt-get update 
RUN apt-get -y install git
RUN apt-get -y install scala
RUN apt-get -y install sbt
EXPOSE 8080

