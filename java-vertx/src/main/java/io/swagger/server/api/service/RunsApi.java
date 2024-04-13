package io.swagger.server.api.service;

import org.threeten.bp.OffsetDateTime;
import io.swagger.server.api.model.V3ErrorResponse;
import io.swagger.server.api.model.V3RunResponse;
import io.swagger.server.api.model.V3RunsResponse;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface RunsApi  {

    String WEBSERVICE_ADDRESS_RUNSAPI = "";
    String OPERATION_ID_RUNSFORROUTE = "runsForRoute";
    String OPERATION_ID_RUNSFORROUTEANDROUTETYPE = "runsForRouteAndRouteType";
    String OPERATION_ID_RUNSFORRUN = "runsForRun";
    String OPERATION_ID_RUNSFORRUNANDROUTETYPE = "runsForRunAndRouteType";

    void RunsForRoute(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void RunsForRouteAndRouteType(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void RunsForRun(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void RunsForRunAndRouteType(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
