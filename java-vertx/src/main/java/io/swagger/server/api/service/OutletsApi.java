package io.swagger.server.api.service;

import io.swagger.server.api.model.V3ErrorResponse;
import io.swagger.server.api.model.V3OutletGeolocationResponse;
import io.swagger.server.api.model.V3OutletResponse;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface OutletsApi  {

    String WEBSERVICE_ADDRESS_OUTLETSAPI = "";
    String OPERATION_ID_OUTLETSGETALLOUTLETS = "outletsGetAllOutlets";
    String OPERATION_ID_OUTLETSGETOUTLETSBYGEOLOCATION = "outletsGetOutletsByGeolocation";

    void OutletsGetAllOutlets(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void OutletsGetOutletsByGeolocation(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
