package io.swagger.api.factories;

import io.swagger.api.V3ApiService;
import io.swagger.api.impl.V3ApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-04-14T03:35:25.635146900+10:00[Australia/Sydney]")
public class V3ApiServiceFactory {
    private final static V3ApiService service = new V3ApiServiceImpl();

    public static V3ApiService getV3Api() {
        return service;
    }
}
