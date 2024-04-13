package io.swagger.server.api.service;

import org.threeten.bp.OffsetDateTime;
import io.swagger.server.api.model.V3ErrorResponse;
import io.swagger.server.api.model.V3FareEstimateResponse;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface FareEstimateApi  {

    String WEBSERVICE_ADDRESS_FAREESTIMATEAPI = "";
    String OPERATION_ID_FAREESTIMATEGETFAREESTIMATEBYZONE = "fareEstimateGetFareEstimateByZone";

    void FareEstimateGetFareEstimateByZone(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
