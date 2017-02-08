package com.delhivery.vertxDropWiz;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.dropwizard.MetricsService;
import io.vertx.ext.web.RoutingContext;

public class MetricsHandler implements Handler<RoutingContext>{

  @Override
  public void handle(RoutingContext context) {
    HttpServerResponse resp = context.response();

    try {
      Vertx vertx = context.vertx();
      resp.headers().add("Content-Type", "application/json");
      resp.setStatusCode(200);
      MetricsService metricsService = MetricsService.create(vertx);
      JsonObject metrics = metricsService.getMetricsSnapshot(vertx);
      resp.end(metrics.toString());
      } catch (Exception exp) {
      System.out.println("Exception occurred " + exp);
      resp.end("Exception occured " + exp);
    }
  }

}


