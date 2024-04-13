# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3RouteType Class
#'
#' @field route_type_name 
#' @field route_type 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3RouteType <- R6::R6Class(
  'V3RouteType',
  public = list(
    `route_type_name` = NULL,
    `route_type` = NULL,
    initialize = function(`route_type_name`, `route_type`){
      if (!missing(`route_type_name`)) {
        stopifnot(is.character(`route_type_name`), length(`route_type_name`) == 1)
        self$`route_type_name` <- `route_type_name`
      }
      if (!missing(`route_type`)) {
        stopifnot(is.numeric(`route_type`), length(`route_type`) == 1)
        self$`route_type` <- `route_type`
      }
    },
    toJSON = function() {
      V3RouteTypeObject <- list()
      if (!is.null(self$`route_type_name`)) {
        V3RouteTypeObject[['route_type_name']] <- self$`route_type_name`
      }
      if (!is.null(self$`route_type`)) {
        V3RouteTypeObject[['route_type']] <- self$`route_type`
      }

      V3RouteTypeObject
    },
    fromJSON = function(V3RouteTypeJson) {
      V3RouteTypeObject <- jsonlite::fromJSON(V3RouteTypeJson)
      if (!is.null(V3RouteTypeObject$`route_type_name`)) {
        self$`route_type_name` <- V3RouteTypeObject$`route_type_name`
      }
      if (!is.null(V3RouteTypeObject$`route_type`)) {
        self$`route_type` <- V3RouteTypeObject$`route_type`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "route_type_name": %s,
           "route_type": %d
        }',
        self$`route_type_name`,
        self$`route_type`
      )
    },
    fromJSONString = function(V3RouteTypeJson) {
      V3RouteTypeObject <- jsonlite::fromJSON(V3RouteTypeJson)
      self$`route_type_name` <- V3RouteTypeObject$`route_type_name`
      self$`route_type` <- V3RouteTypeObject$`route_type`
    }
  )
)
