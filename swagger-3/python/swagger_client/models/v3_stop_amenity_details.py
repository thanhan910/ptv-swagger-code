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

class V3StopAmenityDetails(object):
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
        'toilet': 'bool',
        'taxi_rank': 'bool',
        'car_parking': 'str',
        'cctv': 'bool'
    }

    attribute_map = {
        'toilet': 'toilet',
        'taxi_rank': 'taxi_rank',
        'car_parking': 'car_parking',
        'cctv': 'cctv'
    }

    def __init__(self, toilet=None, taxi_rank=None, car_parking=None, cctv=None):  # noqa: E501
        """V3StopAmenityDetails - a model defined in Swagger"""  # noqa: E501
        self._toilet = None
        self._taxi_rank = None
        self._car_parking = None
        self._cctv = None
        self.discriminator = None
        if toilet is not None:
            self.toilet = toilet
        if taxi_rank is not None:
            self.taxi_rank = taxi_rank
        if car_parking is not None:
            self.car_parking = car_parking
        if cctv is not None:
            self.cctv = cctv

    @property
    def toilet(self):
        """Gets the toilet of this V3StopAmenityDetails.  # noqa: E501

        Indicates if there is a public toilet at or near the stop  # noqa: E501

        :return: The toilet of this V3StopAmenityDetails.  # noqa: E501
        :rtype: bool
        """
        return self._toilet

    @toilet.setter
    def toilet(self, toilet):
        """Sets the toilet of this V3StopAmenityDetails.

        Indicates if there is a public toilet at or near the stop  # noqa: E501

        :param toilet: The toilet of this V3StopAmenityDetails.  # noqa: E501
        :type: bool
        """

        self._toilet = toilet

    @property
    def taxi_rank(self):
        """Gets the taxi_rank of this V3StopAmenityDetails.  # noqa: E501

        Indicates if there is a taxi rank at or near the stop  # noqa: E501

        :return: The taxi_rank of this V3StopAmenityDetails.  # noqa: E501
        :rtype: bool
        """
        return self._taxi_rank

    @taxi_rank.setter
    def taxi_rank(self, taxi_rank):
        """Sets the taxi_rank of this V3StopAmenityDetails.

        Indicates if there is a taxi rank at or near the stop  # noqa: E501

        :param taxi_rank: The taxi_rank of this V3StopAmenityDetails.  # noqa: E501
        :type: bool
        """

        self._taxi_rank = taxi_rank

    @property
    def car_parking(self):
        """Gets the car_parking of this V3StopAmenityDetails.  # noqa: E501

        The number of free car parking spots at the stop  # noqa: E501

        :return: The car_parking of this V3StopAmenityDetails.  # noqa: E501
        :rtype: str
        """
        return self._car_parking

    @car_parking.setter
    def car_parking(self, car_parking):
        """Sets the car_parking of this V3StopAmenityDetails.

        The number of free car parking spots at the stop  # noqa: E501

        :param car_parking: The car_parking of this V3StopAmenityDetails.  # noqa: E501
        :type: str
        """

        self._car_parking = car_parking

    @property
    def cctv(self):
        """Gets the cctv of this V3StopAmenityDetails.  # noqa: E501

        Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop  # noqa: E501

        :return: The cctv of this V3StopAmenityDetails.  # noqa: E501
        :rtype: bool
        """
        return self._cctv

    @cctv.setter
    def cctv(self, cctv):
        """Sets the cctv of this V3StopAmenityDetails.

        Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop  # noqa: E501

        :param cctv: The cctv of this V3StopAmenityDetails.  # noqa: E501
        :type: bool
        """

        self._cctv = cctv

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
        if issubclass(V3StopAmenityDetails, dict):
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
        if not isinstance(other, V3StopAmenityDetails):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
