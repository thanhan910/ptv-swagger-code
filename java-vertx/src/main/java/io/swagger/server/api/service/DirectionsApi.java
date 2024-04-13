package io.swagger.server.api.service;

import io.swagger.server.api.model.V3DirectionsResponse;
import io.swagger.server.api.model.V3ErrorResponse;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface DirectionsApi  {

    String WEBSERVICE_ADDRESS_DIRECTIONSAPI = "";
    String OPERATION_ID_DIRECTIONSFORDIRECTION = "directionsForDirection";
    String OPERATION_ID_DIRECTIONSFORDIRECTIONANDTYPE = "directionsForDirectionAndType";
    String OPERATION_ID_DIRECTIONSFORROUTE = "directionsForRoute";

    void DirectionsForDirection(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DirectionsForDirectionAndType(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DirectionsForRoute(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
