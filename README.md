# vertx-dropwizard
Vertx 3.2.1 dropwizard metrics which are not produced locally. To build do maven package. 

Markup : * Bullet list To start it run 
            * mvn package 
            * ./startup.sh

Main class is Verticle.java which is a http server . exposes following two apis 
Markup : * API 
            * /waybill : dummy api
            * /metric  : return drop wizard metrics 




