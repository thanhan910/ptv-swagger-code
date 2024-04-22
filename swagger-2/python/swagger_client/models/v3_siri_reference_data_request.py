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


class V3SiriReferenceDataRequest(object):
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
        'line_refs': 'list[V3SiriLineRefDirectionRefStopPointRef]',
        'stop_point_refs': 'list[int]',
        'date_utc': 'datetime',
        'mapping_version': 'str'
    }

    attribute_map = {
        'line_refs': 'line_refs',
        'stop_point_refs': 'stop_point_refs',
        'date_utc': 'date_utc',
        'mapping_version': 'mapping_version'
    }

    def __init__(self, line_refs=None, stop_point_refs=None, date_utc=None, mapping_version=None, _configuration=None):  # noqa: E501
        """V3SiriReferenceDataRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._line_refs = None
        self._stop_point_refs = None
        self._date_utc = None
        self._mapping_version = None
        self.discriminator = None

        self.line_refs = line_refs
        if stop_point_refs is not None:
            self.stop_point_refs = stop_point_refs
        if date_utc is not None:
            self.date_utc = date_utc
        self.mapping_version = mapping_version

    @property
    def line_refs(self):
        """Gets the line_refs of this V3SiriReferenceDataRequest.  # noqa: E501


        :return: The line_refs of this V3SiriReferenceDataRequest.  # noqa: E501
        :rtype: list[V3SiriLineRefDirectionRefStopPointRef]
        """
        return self._line_refs

    @line_refs.setter
    def line_refs(self, line_refs):
        """Sets the line_refs of this V3SiriReferenceDataRequest.


        :param line_refs: The line_refs of this V3SiriReferenceDataRequest.  # noqa: E501
        :type: list[V3SiriLineRefDirectionRefStopPointRef]
        """
        if self._configuration.client_side_validation and line_refs is None:
            raise ValueError("Invalid value for `line_refs`, must not be `None`")  # noqa: E501

        self._line_refs = line_refs

    @property
    def stop_point_refs(self):
        """Gets the stop_point_refs of this V3SiriReferenceDataRequest.  # noqa: E501

        Siri StopPointRef  # noqa: E501

        :return: The stop_point_refs of this V3SiriReferenceDataRequest.  # noqa: E501
        :rtype: list[int]
        """
        return self._stop_point_refs

    @stop_point_refs.setter
    def stop_point_refs(self, stop_point_refs):
        """Sets the stop_point_refs of this V3SiriReferenceDataRequest.

        Siri StopPointRef  # noqa: E501

        :param stop_point_refs: The stop_point_refs of this V3SiriReferenceDataRequest.  # noqa: E501
        :type: list[int]
        """

        self._stop_point_refs = stop_point_refs

    @property
    def date_utc(self):
        """Gets the date_utc of this V3SiriReferenceDataRequest.  # noqa: E501

        Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)  # noqa: E501

        :return: The date_utc of this V3SiriReferenceDataRequest.  # noqa: E501
        :rtype: datetime
        """
        return self._date_utc

    @date_utc.setter
    def date_utc(self, date_utc):
        """Sets the date_utc of this V3SiriReferenceDataRequest.

        Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)  # noqa: E501

        :param date_utc: The date_utc of this V3SiriReferenceDataRequest.  # noqa: E501
        :type: datetime
        """

        self._date_utc = date_utc

    @property
    def mapping_version(self):
        """Gets the mapping_version of this V3SiriReferenceDataRequest.  # noqa: E501

        DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load  # noqa: E501

        :return: The mapping_version of this V3SiriReferenceDataRequest.  # noqa: E501
        :rtype: str
        """
        return self._mapping_version

    @mapping_version.setter
    def mapping_version(self, mapping_version):
        """Sets the mapping_version of this V3SiriReferenceDataRequest.

        DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load  # noqa: E501

        :param mapping_version: The mapping_version of this V3SiriReferenceDataRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and mapping_version is None:
            raise ValueError("Invalid value for `mapping_version`, must not be `None`")  # noqa: E501

        self._mapping_version = mapping_version

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
        if issubclass(V3SiriReferenceDataRequest, dict):
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
        if not isinstance(other, V3SiriReferenceDataRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3SiriReferenceDataRequest):
            return True

        return self.to_dict() != other.to_dict()
