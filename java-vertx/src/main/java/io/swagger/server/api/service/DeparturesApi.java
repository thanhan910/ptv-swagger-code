package io.swagger.server.api.service;

import org.threeten.bp.OffsetDateTime;
import io.swagger.server.api.model.V3DeparturesResponse;
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
public interface DeparturesApi  {

    String WEBSERVICE_ADDRESS_DEPARTURESAPI = "";
    String OPERATION_ID_DEPARTURESGETFORSTOP = "departuresGetForStop";
    String OPERATION_ID_DEPARTURESGETFORSTOPANDROUTE = "departuresGetForStopAndRoute";

    void DeparturesGetForStop(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void DeparturesGetForStopAndRoute(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
