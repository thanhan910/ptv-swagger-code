# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.    # noqa: E501

    OpenAPI spec version: v3
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class V3DeparturesResponse(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'departures': 'list[V3Departure]',
        'stops': 'dict(str, V3StopModel)',
        'routes': 'dict(str, object)',
        'runs': 'dict(str, V3Run)',
        'directions': 'dict(str, V3Direction)',
        'disruptions': 'dict(str, V3Disruption)',
        'status': 'V3Status'
    }

    attribute_map = {
        'departures': 'departures',
        'stops': 'stops',
        'routes': 'routes',
        'runs': 'runs',
        'directions': 'directions',
        'disruptions': 'disruptions',
        'status': 'status'
    }

    def __init__(self, departures=None, stops=None, routes=None, runs=None, directions=None, disruptions=None, status=None):  # noqa: E501
        """V3DeparturesResponse - a model defined in Swagger"""  # noqa: E501
        self._departures = None
        self._stops = None
        self._routes = None
        self._runs = None
        self._directions = None
        self._disruptions = None
        self._status = None
        self.discriminator = None
        if departures is not None:
            self.departures = departures
        if stops is not None:
            self.stops = stops
        if routes is not None:
            self.routes = routes
        if runs is not None:
            self.runs = runs
        if directions is not None:
            self.directions = directions
        if disruptions is not None:
            self.disruptions = disruptions
        if status is not None:
            self.status = status

    @property
    def departures(self):
        """Gets the departures of this V3DeparturesResponse.  # noqa: E501

        Timetabled and real-time service departures  # noqa: E501

        :return: The departures of this V3DeparturesResponse.  # noqa: E501
        :rtype: list[V3Departure]
        """
        return self._departures

    @departures.setter
    def departures(self, departures):
        """Sets the departures of this V3DeparturesResponse.

        Timetabled and real-time service departures  # noqa: E501

        :param departures: The departures of this V3DeparturesResponse.  # noqa: E501
        :type: list[V3Departure]
        """

        self._departures = departures

    @property
    def stops(self):
        """Gets the stops of this V3DeparturesResponse.  # noqa: E501

        A train station, tram stop, bus stop, regional coach stop or Night Bus stop  # noqa: E501

        :return: The stops of this V3DeparturesResponse.  # noqa: E501
        :rtype: dict(str, V3StopModel)
        """
        return self._stops

    @stops.setter
    def stops(self, stops):
        """Sets the stops of this V3DeparturesResponse.

        A train station, tram stop, bus stop, regional coach stop or Night Bus stop  # noqa: E501

        :param stops: The stops of this V3DeparturesResponse.  # noqa: E501
        :type: dict(str, V3StopModel)
        """

        self._stops = stops

    @property
    def routes(self):
        """Gets the routes of this V3DeparturesResponse.  # noqa: E501

        Train lines, tram routes, bus routes, regional coach routes, Night Bus routes  # noqa: E501

        :return: The routes of this V3DeparturesResponse.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._routes

    @routes.setter
    def routes(self, routes):
        """Sets the routes of this V3DeparturesResponse.

        Train lines, tram routes, bus routes, regional coach routes, Night Bus routes  # noqa: E501

        :param routes: The routes of this V3DeparturesResponse.  # noqa: E501
        :type: dict(str, object)
        """

        self._routes = routes

    @property
    def runs(self):
        """Gets the runs of this V3DeparturesResponse.  # noqa: E501

        Individual trips/services of a route  # noqa: E501

        :return: The runs of this V3DeparturesResponse.  # noqa: E501
        :rtype: dict(str, V3Run)
        """
        return self._runs

    @runs.setter
    def runs(self, runs):
        """Sets the runs of this V3DeparturesResponse.

        Individual trips/services of a route  # noqa: E501

        :param runs: The runs of this V3DeparturesResponse.  # noqa: E501
        :type: dict(str, V3Run)
        """

        self._runs = runs

    @property
    def directions(self):
        """Gets the directions of this V3DeparturesResponse.  # noqa: E501

        Directions of travel of route  # noqa: E501

        :return: The directions of this V3DeparturesResponse.  # noqa: E501
        :rtype: dict(str, V3Direction)
        """
        return self._directions

    @directions.setter
    def directions(self, directions):
        """Sets the directions of this V3DeparturesResponse.

        Directions of travel of route  # noqa: E501

        :param directions: The directions of this V3DeparturesResponse.  # noqa: E501
        :type: dict(str, V3Direction)
        """

        self._directions = directions

    @property
    def disruptions(self):
        """Gets the disruptions of this V3DeparturesResponse.  # noqa: E501

        Disruption information applicable to relevant routes or stops  # noqa: E501

        :return: The disruptions of this V3DeparturesResponse.  # noqa: E501
        :rtype: dict(str, V3Disruption)
        """
        return self._disruptions

    @disruptions.setter
    def disruptions(self, disruptions):
        """Sets the disruptions of this V3DeparturesResponse.

        Disruption information applicable to relevant routes or stops  # noqa: E501

        :param disruptions: The disruptions of this V3DeparturesResponse.  # noqa: E501
        :type: dict(str, V3Disruption)
        """

        self._disruptions = disruptions

    @property
    def status(self):
        """Gets the status of this V3DeparturesResponse.  # noqa: E501


        :return: The status of this V3DeparturesResponse.  # noqa: E501
        :rtype: V3Status
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this V3DeparturesResponse.


        :param status: The status of this V3DeparturesResponse.  # noqa: E501
        :type: V3Status
        """

        self._status = status

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(V3DeparturesResponse, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, V3DeparturesResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
