package io.swagger.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;

import java.util.Set;
import java.util.HashSet;

import io.swagger.api.impl.V3ApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(V3ApiServiceImpl.class);


        return resources;
    }




}
