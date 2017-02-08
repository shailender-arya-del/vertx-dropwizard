package com.delhivery.vertxDropWiz;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

public class Verticle extends AbstractVerticle  {


  private void startHttpServer() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    HttpServer httpServer = vertx.createHttpServer();

    Router router = Router.router(vertx);
    router.route().handler(BodyHandler.create());
    router.route(HttpMethod.GET, "/waybill").handler(new GetWaybillHandler()); 
    router.route(HttpMethod.GET, "/metrics").handler(new MetricsHandler());
    httpServer.requestHandler(router::accept).listen(8999);
    System.out.println("successfully Started Http server on port 8999");
  }

  @Override
  public void start(Future<Void> startFuture) throws Exception {
    startHttpServer();
  }

  @Override
  public void stop(Future<Void> stopFuture) throws Exception {

  }
}
