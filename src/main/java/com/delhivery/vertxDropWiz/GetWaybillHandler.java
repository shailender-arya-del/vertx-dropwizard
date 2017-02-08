package com.delhivery.vertxDropWiz;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

public class GetWaybillHandler implements Handler<RoutingContext>{
  
  @Override
  public void handle(RoutingContext context) {
    HttpServerResponse resp = context.response();
    resp.putHeader("Content-type", "application/json");
    resp.setStatusCode(200);
    resp.end("waybill : 1");
  }
}
