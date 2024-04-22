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

class V3DynamoDbTimetable(object):
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
        'table_name': 'str',
        'parser_version': 'int',
        'parser_mapping_version': 'str',
        'pt_version': 'int',
        'pt_mapping_version': 'str',
        'transport_type': 'int',
        'applicable_local_date': 'str',
        'exists': 'bool'
    }

    attribute_map = {
        'table_name': 'table_name',
        'parser_version': 'parser_version',
        'parser_mapping_version': 'parser_mapping_version',
        'pt_version': 'pt_version',
        'pt_mapping_version': 'pt_mapping_version',
        'transport_type': 'transport_type',
        'applicable_local_date': 'applicable_local_date',
        'exists': 'exists'
    }

    def __init__(self, table_name=None, parser_version=None, parser_mapping_version=None, pt_version=None, pt_mapping_version=None, transport_type=None, applicable_local_date=None, exists=None):  # noqa: E501
        """V3DynamoDbTimetable - a model defined in Swagger"""  # noqa: E501
        self._table_name = None
        self._parser_version = None
        self._parser_mapping_version = None
        self._pt_version = None
        self._pt_mapping_version = None
        self._transport_type = None
        self._applicable_local_date = None
        self._exists = None
        self.discriminator = None
        if table_name is not None:
            self.table_name = table_name
        if parser_version is not None:
            self.parser_version = parser_version
        if parser_mapping_version is not None:
            self.parser_mapping_version = parser_mapping_version
        if pt_version is not None:
            self.pt_version = pt_version
        if pt_mapping_version is not None:
            self.pt_mapping_version = pt_mapping_version
        if transport_type is not None:
            self.transport_type = transport_type
        if applicable_local_date is not None:
            self.applicable_local_date = applicable_local_date
        if exists is not None:
            self.exists = exists

    @property
    def table_name(self):
        """Gets the table_name of this V3DynamoDbTimetable.  # noqa: E501

        Name of corresponding table in DynamoDB.  # noqa: E501

        :return: The table_name of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: str
        """
        return self._table_name

    @table_name.setter
    def table_name(self, table_name):
        """Sets the table_name of this V3DynamoDbTimetable.

        Name of corresponding table in DynamoDB.  # noqa: E501

        :param table_name: The table_name of this V3DynamoDbTimetable.  # noqa: E501
        :type: str
        """

        self._table_name = table_name

    @property
    def parser_version(self):
        """Gets the parser_version of this V3DynamoDbTimetable.  # noqa: E501

        Parser verison  # noqa: E501

        :return: The parser_version of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: int
        """
        return self._parser_version

    @parser_version.setter
    def parser_version(self, parser_version):
        """Sets the parser_version of this V3DynamoDbTimetable.

        Parser verison  # noqa: E501

        :param parser_version: The parser_version of this V3DynamoDbTimetable.  # noqa: E501
        :type: int
        """

        self._parser_version = parser_version

    @property
    def parser_mapping_version(self):
        """Gets the parser_mapping_version of this V3DynamoDbTimetable.  # noqa: E501

        Diva Mapping Version used to load Parser into DynamoDB  # noqa: E501

        :return: The parser_mapping_version of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: str
        """
        return self._parser_mapping_version

    @parser_mapping_version.setter
    def parser_mapping_version(self, parser_mapping_version):
        """Sets the parser_mapping_version of this V3DynamoDbTimetable.

        Diva Mapping Version used to load Parser into DynamoDB  # noqa: E501

        :param parser_mapping_version: The parser_mapping_version of this V3DynamoDbTimetable.  # noqa: E501
        :type: str
        """

        self._parser_mapping_version = parser_mapping_version

    @property
    def pt_version(self):
        """Gets the pt_version of this V3DynamoDbTimetable.  # noqa: E501

        PT version  # noqa: E501

        :return: The pt_version of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: int
        """
        return self._pt_version

    @pt_version.setter
    def pt_version(self, pt_version):
        """Sets the pt_version of this V3DynamoDbTimetable.

        PT version  # noqa: E501

        :param pt_version: The pt_version of this V3DynamoDbTimetable.  # noqa: E501
        :type: int
        """

        self._pt_version = pt_version

    @property
    def pt_mapping_version(self):
        """Gets the pt_mapping_version of this V3DynamoDbTimetable.  # noqa: E501

        Diva Mapping Version used to load PT into DynamoDB  # noqa: E501

        :return: The pt_mapping_version of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: str
        """
        return self._pt_mapping_version

    @pt_mapping_version.setter
    def pt_mapping_version(self, pt_mapping_version):
        """Sets the pt_mapping_version of this V3DynamoDbTimetable.

        Diva Mapping Version used to load PT into DynamoDB  # noqa: E501

        :param pt_mapping_version: The pt_mapping_version of this V3DynamoDbTimetable.  # noqa: E501
        :type: str
        """

        self._pt_mapping_version = pt_mapping_version

    @property
    def transport_type(self):
        """Gets the transport_type of this V3DynamoDbTimetable.  # noqa: E501

        A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)  # noqa: E501

        :return: The transport_type of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: int
        """
        return self._transport_type

    @transport_type.setter
    def transport_type(self, transport_type):
        """Sets the transport_type of this V3DynamoDbTimetable.

        A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)  # noqa: E501

        :param transport_type: The transport_type of this V3DynamoDbTimetable.  # noqa: E501
        :type: int
        """
        allowed_values = [0, 1, 2, 3, 4]  # noqa: E501
        if transport_type not in allowed_values:
            raise ValueError(
                "Invalid value for `transport_type` ({0}), must be one of {1}"  # noqa: E501
                .format(transport_type, allowed_values)
            )

        self._transport_type = transport_type

    @property
    def applicable_local_date(self):
        """Gets the applicable_local_date of this V3DynamoDbTimetable.  # noqa: E501

        Formated date string of applicable date  # noqa: E501

        :return: The applicable_local_date of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: str
        """
        return self._applicable_local_date

    @applicable_local_date.setter
    def applicable_local_date(self, applicable_local_date):
        """Sets the applicable_local_date of this V3DynamoDbTimetable.

        Formated date string of applicable date  # noqa: E501

        :param applicable_local_date: The applicable_local_date of this V3DynamoDbTimetable.  # noqa: E501
        :type: str
        """

        self._applicable_local_date = applicable_local_date

    @property
    def exists(self):
        """Gets the exists of this V3DynamoDbTimetable.  # noqa: E501

        True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.  # noqa: E501

        :return: The exists of this V3DynamoDbTimetable.  # noqa: E501
        :rtype: bool
        """
        return self._exists

    @exists.setter
    def exists(self, exists):
        """Sets the exists of this V3DynamoDbTimetable.

        True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.  # noqa: E501

        :param exists: The exists of this V3DynamoDbTimetable.  # noqa: E501
        :type: bool
        """

        self._exists = exists

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
        if issubclass(V3DynamoDbTimetable, dict):
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
        if not isinstance(other, V3DynamoDbTimetable):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
