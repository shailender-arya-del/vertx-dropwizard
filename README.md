# vertx-dropwizard
Vertx 3.2.1 dropwizard metrics which are not produced locally. To build do maven package. 

 To start it run  following commands 
            * mvn package 
            * ./startup.sh


Main class is Verticle.java which is a http server . exposes following two apis 
            * /waybill : dummy api
            * /metric  : return drop wizard metrics 




