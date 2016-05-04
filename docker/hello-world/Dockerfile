FROM base-image

RUN apt-get -y install wget
RUN wget -O hello-world.jar https://github.com/mt3593/scala-playground/blob/master/scalarabbit-assembly-1.0.jar?raw=true
RUN mkdir /usr/local/helloworld
RUN mv hello-world.jar /usr/local/helloworld/

CMD java -jar /usr/local/local/helloworld/hello-world.jar
