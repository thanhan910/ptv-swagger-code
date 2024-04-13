package io.swagger.server.api.service;

import io.swagger.server.api.model.V3ErrorResponse;
import io.swagger.server.api.model.V3SearchResult;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface SearchApi  {

    String WEBSERVICE_ADDRESS_SEARCHAPI = "";
    String OPERATION_ID_SEARCHSEARCH = "searchSearch";

    void SearchSearch(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
