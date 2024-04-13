package io.swagger.server.api.service;

import io.swagger.server.api.model.V3DisruptionModesResponse;
import io.swagger.server.api.model.V3DisruptionResponse;
import io.swagger.server.api.model.V3DisruptionsResponse;
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
public interface DisruptionsApi  {

    String WEBSERVICE_ADDRESS_DISRUPTIONSAPI = "";
    String OPERATION_ID_DISRUPTIONSGETALLDISRUPTIONS = "disruptionsGetAllDisruptions";
    String OPERATION_ID_DISRUPTIONSGETDISRUPTIONBYID = "disruptionsGetDisruptionById";
    String OPERATION_ID_DISRUPTIONSGETDISRUPTIONMODES = "disruptionsGetDisruptionModes";
    String OPERATION_ID_DISRUPTIONSGETDISRUPTIONSBYROUTE = "disruptionsGetDisruptionsByRoute";
    String OPERATION_ID_DISRUPTIONSGETDISRUPTIONSBYROUTEANDSTOP = "disruptionsGetDisruptionsByRouteAndStop";
    String OPERATION_ID_DISRUPTIONSGETDISRUPTIONSBYSTOP = "disruptionsGetDisruptionsByStop";

    void DisruptionsGetAllDisruptions(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DisruptionsGetDisruptionById(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DisruptionsGetDisruptionModes(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DisruptionsGetDisruptionsByRoute(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DisruptionsGetDisruptionsByRouteAndStop(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DisruptionsGetDisruptionsByStop(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
