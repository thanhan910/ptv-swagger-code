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

from swagger_client.configuration import Configuration


class V3SiriSubscriptionTopic(object):
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
        'line_ref': 'str',
        'direction_ref': 'int',
        'route_type': 'int'
    }

    attribute_map = {
        'line_ref': 'line_ref',
        'direction_ref': 'direction_ref',
        'route_type': 'route_type'
    }

    def __init__(self, line_ref=None, direction_ref=None, route_type=None, _configuration=None):  # noqa: E501
        """V3SiriSubscriptionTopic - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._line_ref = None
        self._direction_ref = None
        self._route_type = None
        self.discriminator = None

        self.line_ref = line_ref
        if direction_ref is not None:
            self.direction_ref = direction_ref
        self.route_type = route_type

    @property
    def line_ref(self):
        """Gets the line_ref of this V3SiriSubscriptionTopic.  # noqa: E501

        Siri LineRef  # noqa: E501

        :return: The line_ref of this V3SiriSubscriptionTopic.  # noqa: E501
        :rtype: str
        """
        return self._line_ref

    @line_ref.setter
    def line_ref(self, line_ref):
        """Sets the line_ref of this V3SiriSubscriptionTopic.

        Siri LineRef  # noqa: E501

        :param line_ref: The line_ref of this V3SiriSubscriptionTopic.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and line_ref is None:
            raise ValueError("Invalid value for `line_ref`, must not be `None`")  # noqa: E501

        self._line_ref = line_ref

    @property
    def direction_ref(self):
        """Gets the direction_ref of this V3SiriSubscriptionTopic.  # noqa: E501

        Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)  # noqa: E501

        :return: The direction_ref of this V3SiriSubscriptionTopic.  # noqa: E501
        :rtype: int
        """
        return self._direction_ref

    @direction_ref.setter
    def direction_ref(self, direction_ref):
        """Sets the direction_ref of this V3SiriSubscriptionTopic.

        Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)  # noqa: E501

        :param direction_ref: The direction_ref of this V3SiriSubscriptionTopic.  # noqa: E501
        :type: int
        """
        allowed_values = [1, 2, 5, 10, 16, 32, 65, 130]  # noqa: E501
        if (self._configuration.client_side_validation and
                direction_ref not in allowed_values):
            raise ValueError(
                "Invalid value for `direction_ref` ({0}), must be one of {1}"  # noqa: E501
                .format(direction_ref, allowed_values)
            )

        self._direction_ref = direction_ref

    @property
    def route_type(self):
        """Gets the route_type of this V3SiriSubscriptionTopic.  # noqa: E501

        Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)  # noqa: E501

        :return: The route_type of this V3SiriSubscriptionTopic.  # noqa: E501
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type):
        """Sets the route_type of this V3SiriSubscriptionTopic.

        Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)  # noqa: E501

        :param route_type: The route_type of this V3SiriSubscriptionTopic.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and route_type is None:
            raise ValueError("Invalid value for `route_type`, must not be `None`")  # noqa: E501
        allowed_values = [0, 1, 2, 3, 4]  # noqa: E501
        if (self._configuration.client_side_validation and
                route_type not in allowed_values):
            raise ValueError(
                "Invalid value for `route_type` ({0}), must be one of {1}"  # noqa: E501
                .format(route_type, allowed_values)
            )

        self._route_type = route_type

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
        if issubclass(V3SiriSubscriptionTopic, dict):
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
        if not isinstance(other, V3SiriSubscriptionTopic):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3SiriSubscriptionTopic):
            return True

        return self.to_dict() != other.to_dict()
