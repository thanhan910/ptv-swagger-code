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


class V3SiriLineRefDirectionRefsDictionary(object):
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
        'direction_refs': 'dict(str, list[V3SiriReferenceDataDetail])',
        'unmatched_direction_refs': 'dict(str, str)'
    }

    attribute_map = {
        'direction_refs': 'direction_refs',
        'unmatched_direction_refs': 'unmatched_direction_refs'
    }

    def __init__(self, direction_refs=None, unmatched_direction_refs=None, _configuration=None):  # noqa: E501
        """V3SiriLineRefDirectionRefsDictionary - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._direction_refs = None
        self._unmatched_direction_refs = None
        self.discriminator = None

        if direction_refs is not None:
            self.direction_refs = direction_refs
        if unmatched_direction_refs is not None:
            self.unmatched_direction_refs = unmatched_direction_refs

    @property
    def direction_refs(self):
        """Gets the direction_refs of this V3SiriLineRefDirectionRefsDictionary.  # noqa: E501


        :return: The direction_refs of this V3SiriLineRefDirectionRefsDictionary.  # noqa: E501
        :rtype: dict(str, list[V3SiriReferenceDataDetail])
        """
        return self._direction_refs

    @direction_refs.setter
    def direction_refs(self, direction_refs):
        """Sets the direction_refs of this V3SiriLineRefDirectionRefsDictionary.


        :param direction_refs: The direction_refs of this V3SiriLineRefDirectionRefsDictionary.  # noqa: E501
        :type: dict(str, list[V3SiriReferenceDataDetail])
        """

        self._direction_refs = direction_refs

    @property
    def unmatched_direction_refs(self):
        """Gets the unmatched_direction_refs of this V3SiriLineRefDirectionRefsDictionary.  # noqa: E501


        :return: The unmatched_direction_refs of this V3SiriLineRefDirectionRefsDictionary.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._unmatched_direction_refs

    @unmatched_direction_refs.setter
    def unmatched_direction_refs(self, unmatched_direction_refs):
        """Sets the unmatched_direction_refs of this V3SiriLineRefDirectionRefsDictionary.


        :param unmatched_direction_refs: The unmatched_direction_refs of this V3SiriLineRefDirectionRefsDictionary.  # noqa: E501
        :type: dict(str, str)
        """

        self._unmatched_direction_refs = unmatched_direction_refs

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
        if issubclass(V3SiriLineRefDirectionRefsDictionary, dict):
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
        if not isinstance(other, V3SiriLineRefDirectionRefsDictionary):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3SiriLineRefDirectionRefsDictionary):
            return True

        return self.to_dict() != other.to_dict()