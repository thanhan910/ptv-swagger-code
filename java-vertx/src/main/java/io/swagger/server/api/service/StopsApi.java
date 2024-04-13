package io.swagger.server.api.service;

import org.threeten.bp.OffsetDateTime;
import io.swagger.server.api.model.V3ErrorResponse;
import io.swagger.server.api.model.V3StopResponse;
import io.swagger.server.api.model.V3StopsByDistanceResponse;
import io.swagger.server.api.model.V3StopsOnRouteResponse;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface StopsApi  {

    String WEBSERVICE_ADDRESS_STOPSAPI = "";
    String OPERATION_ID_STOPSSTOPDETAILS = "stopsStopDetails";
    String OPERATION_ID_STOPSSTOPSBYGEOLOCATION = "stopsStopsByGeolocation";
    String OPERATION_ID_STOPSSTOPSFORROUTE = "stopsStopsForRoute";

    void StopsStopDetails(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void StopsStopsByGeolocation(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void StopsStopsForRoute(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
