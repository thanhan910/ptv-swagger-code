# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3DeparturesBroadParameters Class
#'
#' @field platform_numbers 
#' @field direction_id 
#' @field gtfs 
#' @field date_utc 
#' @field max_results 
#' @field include_cancelled 
#' @field look_backwards 
#' @field expand 
#' @field include_geopath 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3DeparturesBroadParameters <- R6::R6Class(
  'V3DeparturesBroadParameters',
  public = list(
    `platform_numbers` = NULL,
    `direction_id` = NULL,
    `gtfs` = NULL,
    `date_utc` = NULL,
    `max_results` = NULL,
    `include_cancelled` = NULL,
    `look_backwards` = NULL,
    `expand` = NULL,
    `include_geopath` = NULL,
    initialize = function(`platform_numbers`, `direction_id`, `gtfs`, `date_utc`, `max_results`, `include_cancelled`, `look_backwards`, `expand`, `include_geopath`){
      if (!missing(`platform_numbers`)) {
        stopifnot(is.list(`platform_numbers`), length(`platform_numbers`) != 0)
        lapply(`platform_numbers`, function(x) stopifnot(is.character(x)))
        self$`platform_numbers` <- `platform_numbers`
      }
      if (!missing(`direction_id`)) {
        stopifnot(is.numeric(`direction_id`), length(`direction_id`) == 1)
        self$`direction_id` <- `direction_id`
      }
      if (!missing(`gtfs`)) {
        self$`gtfs` <- `gtfs`
      }
      if (!missing(`date_utc`)) {
        stopifnot(is.character(`date_utc`), length(`date_utc`) == 1)
        self$`date_utc` <- `date_utc`
      }
      if (!missing(`max_results`)) {
        stopifnot(is.numeric(`max_results`), length(`max_results`) == 1)
        self$`max_results` <- `max_results`
      }
      if (!missing(`include_cancelled`)) {
        self$`include_cancelled` <- `include_cancelled`
      }
      if (!missing(`look_backwards`)) {
        self$`look_backwards` <- `look_backwards`
      }
      if (!missing(`expand`)) {
        stopifnot(is.list(`expand`), length(`expand`) != 0)
        lapply(`expand`, function(x) stopifnot(is.character(x)))
        self$`expand` <- `expand`
      }
      if (!missing(`include_geopath`)) {
        self$`include_geopath` <- `include_geopath`
      }
    },
    toJSON = function() {
      V3DeparturesBroadParametersObject <- list()
      if (!is.null(self$`platform_numbers`)) {
        V3DeparturesBroadParametersObject[['platform_numbers']] <- self$`platform_numbers`
      }
      if (!is.null(self$`direction_id`)) {
        V3DeparturesBroadParametersObject[['direction_id']] <- self$`direction_id`
      }
      if (!is.null(self$`gtfs`)) {
        V3DeparturesBroadParametersObject[['gtfs']] <- self$`gtfs`
      }
      if (!is.null(self$`date_utc`)) {
        V3DeparturesBroadParametersObject[['date_utc']] <- self$`date_utc`
      }
      if (!is.null(self$`max_results`)) {
        V3DeparturesBroadParametersObject[['max_results']] <- self$`max_results`
      }
      if (!is.null(self$`include_cancelled`)) {
        V3DeparturesBroadParametersObject[['include_cancelled']] <- self$`include_cancelled`
      }
      if (!is.null(self$`look_backwards`)) {
        V3DeparturesBroadParametersObject[['look_backwards']] <- self$`look_backwards`
      }
      if (!is.null(self$`expand`)) {
        V3DeparturesBroadParametersObject[['expand']] <- self$`expand`
      }
      if (!is.null(self$`include_geopath`)) {
        V3DeparturesBroadParametersObject[['include_geopath']] <- self$`include_geopath`
      }

      V3DeparturesBroadParametersObject
    },
    fromJSON = function(V3DeparturesBroadParametersJson) {
      V3DeparturesBroadParametersObject <- jsonlite::fromJSON(V3DeparturesBroadParametersJson)
      if (!is.null(V3DeparturesBroadParametersObject$`platform_numbers`)) {
        self$`platform_numbers` <- V3DeparturesBroadParametersObject$`platform_numbers`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`direction_id`)) {
        self$`direction_id` <- V3DeparturesBroadParametersObject$`direction_id`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`gtfs`)) {
        self$`gtfs` <- V3DeparturesBroadParametersObject$`gtfs`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`date_utc`)) {
        self$`date_utc` <- V3DeparturesBroadParametersObject$`date_utc`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`max_results`)) {
        self$`max_results` <- V3DeparturesBroadParametersObject$`max_results`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`include_cancelled`)) {
        self$`include_cancelled` <- V3DeparturesBroadParametersObject$`include_cancelled`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`look_backwards`)) {
        self$`look_backwards` <- V3DeparturesBroadParametersObject$`look_backwards`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`expand`)) {
        self$`expand` <- V3DeparturesBroadParametersObject$`expand`
      }
      if (!is.null(V3DeparturesBroadParametersObject$`include_geopath`)) {
        self$`include_geopath` <- V3DeparturesBroadParametersObject$`include_geopath`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "platform_numbers": [%s],
           "direction_id": %d,
           "gtfs": %s,
           "date_utc": %s,
           "max_results": %d,
           "include_cancelled": %s,
           "look_backwards": %s,
           "expand": [%s],
           "include_geopath": %s
        }',
        lapply(self$`platform_numbers`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`direction_id`,
        self$`gtfs`,
        self$`date_utc`,
        self$`max_results`,
        self$`include_cancelled`,
        self$`look_backwards`,
        lapply(self$`expand`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`include_geopath`
      )
    },
    fromJSONString = function(V3DeparturesBroadParametersJson) {
      V3DeparturesBroadParametersObject <- jsonlite::fromJSON(V3DeparturesBroadParametersJson)
      self$`platform_numbers` <- V3DeparturesBroadParametersObject$`platform_numbers`
      self$`direction_id` <- V3DeparturesBroadParametersObject$`direction_id`
      self$`gtfs` <- V3DeparturesBroadParametersObject$`gtfs`
      self$`date_utc` <- V3DeparturesBroadParametersObject$`date_utc`
      self$`max_results` <- V3DeparturesBroadParametersObject$`max_results`
      self$`include_cancelled` <- V3DeparturesBroadParametersObject$`include_cancelled`
      self$`look_backwards` <- V3DeparturesBroadParametersObject$`look_backwards`
      self$`expand` <- V3DeparturesBroadParametersObject$`expand`
      self$`include_geopath` <- V3DeparturesBroadParametersObject$`include_geopath`
    }
  )
)
