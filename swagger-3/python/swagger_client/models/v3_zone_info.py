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

class V3ZoneInfo(object):
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
        'min_zone': 'int',
        'max_zone': 'int',
        'unique_zones': 'list[int]'
    }

    attribute_map = {
        'min_zone': 'MinZone',
        'max_zone': 'MaxZone',
        'unique_zones': 'UniqueZones'
    }

    def __init__(self, min_zone=None, max_zone=None, unique_zones=None):  # noqa: E501
        """V3ZoneInfo - a model defined in Swagger"""  # noqa: E501
        self._min_zone = None
        self._max_zone = None
        self._unique_zones = None
        self.discriminator = None
        if min_zone is not None:
            self.min_zone = min_zone
        if max_zone is not None:
            self.max_zone = max_zone
        if unique_zones is not None:
            self.unique_zones = unique_zones

    @property
    def min_zone(self):
        """Gets the min_zone of this V3ZoneInfo.  # noqa: E501


        :return: The min_zone of this V3ZoneInfo.  # noqa: E501
        :rtype: int
        """
        return self._min_zone

    @min_zone.setter
    def min_zone(self, min_zone):
        """Sets the min_zone of this V3ZoneInfo.


        :param min_zone: The min_zone of this V3ZoneInfo.  # noqa: E501
        :type: int
        """

        self._min_zone = min_zone

    @property
    def max_zone(self):
        """Gets the max_zone of this V3ZoneInfo.  # noqa: E501


        :return: The max_zone of this V3ZoneInfo.  # noqa: E501
        :rtype: int
        """
        return self._max_zone

    @max_zone.setter
    def max_zone(self, max_zone):
        """Sets the max_zone of this V3ZoneInfo.


        :param max_zone: The max_zone of this V3ZoneInfo.  # noqa: E501
        :type: int
        """

        self._max_zone = max_zone

    @property
    def unique_zones(self):
        """Gets the unique_zones of this V3ZoneInfo.  # noqa: E501


        :return: The unique_zones of this V3ZoneInfo.  # noqa: E501
        :rtype: list[int]
        """
        return self._unique_zones

    @unique_zones.setter
    def unique_zones(self, unique_zones):
        """Sets the unique_zones of this V3ZoneInfo.


        :param unique_zones: The unique_zones of this V3ZoneInfo.  # noqa: E501
        :type: list[int]
        """

        self._unique_zones = unique_zones

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
        if issubclass(V3ZoneInfo, dict):
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
        if not isinstance(other, V3ZoneInfo):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
