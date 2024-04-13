# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3StoppingPatternStop Class
#'
#' @field stop_ticket 
#' @field stop_distance 
#' @field stop_suburb 
#' @field stop_name 
#' @field stop_id 
#' @field route_type 
#' @field stop_latitude 
#' @field stop_longitude 
#' @field stop_landmark 
#' @field stop_sequence 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3StoppingPatternStop <- R6::R6Class(
  'V3StoppingPatternStop',
  public = list(
    `stop_ticket` = NULL,
    `stop_distance` = NULL,
    `stop_suburb` = NULL,
    `stop_name` = NULL,
    `stop_id` = NULL,
    `route_type` = NULL,
    `stop_latitude` = NULL,
    `stop_longitude` = NULL,
    `stop_landmark` = NULL,
    `stop_sequence` = NULL,
    initialize = function(`stop_ticket`, `stop_distance`, `stop_suburb`, `stop_name`, `stop_id`, `route_type`, `stop_latitude`, `stop_longitude`, `stop_landmark`, `stop_sequence`){
      if (!missing(`stop_ticket`)) {
        stopifnot(R6::is.R6(`stop_ticket`))
        self$`stop_ticket` <- `stop_ticket`
      }
      if (!missing(`stop_distance`)) {
        stopifnot(is.numeric(`stop_distance`), length(`stop_distance`) == 1)
        self$`stop_distance` <- `stop_distance`
      }
      if (!missing(`stop_suburb`)) {
        stopifnot(is.character(`stop_suburb`), length(`stop_suburb`) == 1)
        self$`stop_suburb` <- `stop_suburb`
      }
      if (!missing(`stop_name`)) {
        stopifnot(is.character(`stop_name`), length(`stop_name`) == 1)
        self$`stop_name` <- `stop_name`
      }
      if (!missing(`stop_id`)) {
        stopifnot(is.numeric(`stop_id`), length(`stop_id`) == 1)
        self$`stop_id` <- `stop_id`
      }
      if (!missing(`route_type`)) {
        stopifnot(is.numeric(`route_type`), length(`route_type`) == 1)
        self$`route_type` <- `route_type`
      }
      if (!missing(`stop_latitude`)) {
        stopifnot(is.numeric(`stop_latitude`), length(`stop_latitude`) == 1)
        self$`stop_latitude` <- `stop_latitude`
      }
      if (!missing(`stop_longitude`)) {
        stopifnot(is.numeric(`stop_longitude`), length(`stop_longitude`) == 1)
        self$`stop_longitude` <- `stop_longitude`
      }
      if (!missing(`stop_landmark`)) {
        stopifnot(is.character(`stop_landmark`), length(`stop_landmark`) == 1)
        self$`stop_landmark` <- `stop_landmark`
      }
      if (!missing(`stop_sequence`)) {
        stopifnot(is.numeric(`stop_sequence`), length(`stop_sequence`) == 1)
        self$`stop_sequence` <- `stop_sequence`
      }
    },
    toJSON = function() {
      V3StoppingPatternStopObject <- list()
      if (!is.null(self$`stop_ticket`)) {
        V3StoppingPatternStopObject[['stop_ticket']] <- self$`stop_ticket`$toJSON()
      }
      if (!is.null(self$`stop_distance`)) {
        V3StoppingPatternStopObject[['stop_distance']] <- self$`stop_distance`
      }
      if (!is.null(self$`stop_suburb`)) {
        V3StoppingPatternStopObject[['stop_suburb']] <- self$`stop_suburb`
      }
      if (!is.null(self$`stop_name`)) {
        V3StoppingPatternStopObject[['stop_name']] <- self$`stop_name`
      }
      if (!is.null(self$`stop_id`)) {
        V3StoppingPatternStopObject[['stop_id']] <- self$`stop_id`
      }
      if (!is.null(self$`route_type`)) {
        V3StoppingPatternStopObject[['route_type']] <- self$`route_type`
      }
      if (!is.null(self$`stop_latitude`)) {
        V3StoppingPatternStopObject[['stop_latitude']] <- self$`stop_latitude`
      }
      if (!is.null(self$`stop_longitude`)) {
        V3StoppingPatternStopObject[['stop_longitude']] <- self$`stop_longitude`
      }
      if (!is.null(self$`stop_landmark`)) {
        V3StoppingPatternStopObject[['stop_landmark']] <- self$`stop_landmark`
      }
      if (!is.null(self$`stop_sequence`)) {
        V3StoppingPatternStopObject[['stop_sequence']] <- self$`stop_sequence`
      }

      V3StoppingPatternStopObject
    },
    fromJSON = function(V3StoppingPatternStopJson) {
      V3StoppingPatternStopObject <- jsonlite::fromJSON(V3StoppingPatternStopJson)
      if (!is.null(V3StoppingPatternStopObject$`stop_ticket`)) {
        stop_ticketObject <- V3StopTicket$new()
        stop_ticketObject$fromJSON(jsonlite::toJSON(V3StoppingPatternStopObject$stop_ticket, auto_unbox = TRUE))
        self$`stop_ticket` <- stop_ticketObject
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_distance`)) {
        self$`stop_distance` <- V3StoppingPatternStopObject$`stop_distance`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_suburb`)) {
        self$`stop_suburb` <- V3StoppingPatternStopObject$`stop_suburb`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_name`)) {
        self$`stop_name` <- V3StoppingPatternStopObject$`stop_name`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_id`)) {
        self$`stop_id` <- V3StoppingPatternStopObject$`stop_id`
      }
      if (!is.null(V3StoppingPatternStopObject$`route_type`)) {
        self$`route_type` <- V3StoppingPatternStopObject$`route_type`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_latitude`)) {
        self$`stop_latitude` <- V3StoppingPatternStopObject$`stop_latitude`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_longitude`)) {
        self$`stop_longitude` <- V3StoppingPatternStopObject$`stop_longitude`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_landmark`)) {
        self$`stop_landmark` <- V3StoppingPatternStopObject$`stop_landmark`
      }
      if (!is.null(V3StoppingPatternStopObject$`stop_sequence`)) {
        self$`stop_sequence` <- V3StoppingPatternStopObject$`stop_sequence`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "stop_ticket": %s,
           "stop_distance": %d,
           "stop_suburb": %s,
           "stop_name": %s,
           "stop_id": %d,
           "route_type": %d,
           "stop_latitude": %d,
           "stop_longitude": %d,
           "stop_landmark": %s,
           "stop_sequence": %d
        }',
        self$`stop_ticket`$toJSON(),
        self$`stop_distance`,
        self$`stop_suburb`,
        self$`stop_name`,
        self$`stop_id`,
        self$`route_type`,
        self$`stop_latitude`,
        self$`stop_longitude`,
        self$`stop_landmark`,
        self$`stop_sequence`
      )
    },
    fromJSONString = function(V3StoppingPatternStopJson) {
      V3StoppingPatternStopObject <- jsonlite::fromJSON(V3StoppingPatternStopJson)
      V3StopTicketObject <- V3StopTicket$new()
      self$`stop_ticket` <- V3StopTicketObject$fromJSON(jsonlite::toJSON(V3StoppingPatternStopObject$stop_ticket, auto_unbox = TRUE))
      self$`stop_distance` <- V3StoppingPatternStopObject$`stop_distance`
      self$`stop_suburb` <- V3StoppingPatternStopObject$`stop_suburb`
      self$`stop_name` <- V3StoppingPatternStopObject$`stop_name`
      self$`stop_id` <- V3StoppingPatternStopObject$`stop_id`
      self$`route_type` <- V3StoppingPatternStopObject$`route_type`
      self$`stop_latitude` <- V3StoppingPatternStopObject$`stop_latitude`
      self$`stop_longitude` <- V3StoppingPatternStopObject$`stop_longitude`
      self$`stop_landmark` <- V3StoppingPatternStopObject$`stop_landmark`
      self$`stop_sequence` <- V3StoppingPatternStopObject$`stop_sequence`
    }
  )
)
