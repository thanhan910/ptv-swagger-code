package io.swagger.server.api.service;

import org.threeten.bp.OffsetDateTime;
import io.swagger.server.api.model.V3ErrorResponse;
import io.swagger.server.api.model.V3RouteResponse;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface RoutesApi  {

    String WEBSERVICE_ADDRESS_ROUTESAPI = "";
    String OPERATION_ID_ROUTESONEORMOREROUTES = "routesOneOrMoreRoutes";
    String OPERATION_ID_ROUTESROUTEFROMID = "routesRouteFromId";

    void RoutesOneOrMoreRoutes(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void RoutesRouteFromId(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
