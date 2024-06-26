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

class V3Disruption(object):
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
        'disruption_id': 'int',
        'title': 'str',
        'url': 'str',
        'description': 'str',
        'disruption_status': 'str',
        'disruption_type': 'str',
        'published_on': 'datetime',
        'last_updated': 'datetime',
        'from_date': 'datetime',
        'to_date': 'datetime',
        'routes': 'list[V3DisruptionRoute]',
        'stops': 'list[V3DisruptionStop]',
        'colour': 'str',
        'display_on_board': 'bool',
        'display_status': 'bool'
    }

    attribute_map = {
        'disruption_id': 'disruption_id',
        'title': 'title',
        'url': 'url',
        'description': 'description',
        'disruption_status': 'disruption_status',
        'disruption_type': 'disruption_type',
        'published_on': 'published_on',
        'last_updated': 'last_updated',
        'from_date': 'from_date',
        'to_date': 'to_date',
        'routes': 'routes',
        'stops': 'stops',
        'colour': 'colour',
        'display_on_board': 'display_on_board',
        'display_status': 'display_status'
    }

    def __init__(self, disruption_id=None, title=None, url=None, description=None, disruption_status=None, disruption_type=None, published_on=None, last_updated=None, from_date=None, to_date=None, routes=None, stops=None, colour=None, display_on_board=None, display_status=None):  # noqa: E501
        """V3Disruption - a model defined in Swagger"""  # noqa: E501
        self._disruption_id = None
        self._title = None
        self._url = None
        self._description = None
        self._disruption_status = None
        self._disruption_type = None
        self._published_on = None
        self._last_updated = None
        self._from_date = None
        self._to_date = None
        self._routes = None
        self._stops = None
        self._colour = None
        self._display_on_board = None
        self._display_status = None
        self.discriminator = None
        if disruption_id is not None:
            self.disruption_id = disruption_id
        if title is not None:
            self.title = title
        if url is not None:
            self.url = url
        if description is not None:
            self.description = description
        if disruption_status is not None:
            self.disruption_status = disruption_status
        if disruption_type is not None:
            self.disruption_type = disruption_type
        if published_on is not None:
            self.published_on = published_on
        if last_updated is not None:
            self.last_updated = last_updated
        if from_date is not None:
            self.from_date = from_date
        if to_date is not None:
            self.to_date = to_date
        if routes is not None:
            self.routes = routes
        if stops is not None:
            self.stops = stops
        if colour is not None:
            self.colour = colour
        if display_on_board is not None:
            self.display_on_board = display_on_board
        if display_status is not None:
            self.display_status = display_status

    @property
    def disruption_id(self):
        """Gets the disruption_id of this V3Disruption.  # noqa: E501

        Disruption information identifier  # noqa: E501

        :return: The disruption_id of this V3Disruption.  # noqa: E501
        :rtype: int
        """
        return self._disruption_id

    @disruption_id.setter
    def disruption_id(self, disruption_id):
        """Sets the disruption_id of this V3Disruption.

        Disruption information identifier  # noqa: E501

        :param disruption_id: The disruption_id of this V3Disruption.  # noqa: E501
        :type: int
        """

        self._disruption_id = disruption_id

    @property
    def title(self):
        """Gets the title of this V3Disruption.  # noqa: E501

        Headline title summarising disruption information  # noqa: E501

        :return: The title of this V3Disruption.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this V3Disruption.

        Headline title summarising disruption information  # noqa: E501

        :param title: The title of this V3Disruption.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def url(self):
        """Gets the url of this V3Disruption.  # noqa: E501

        URL of relevant article on PTV website  # noqa: E501

        :return: The url of this V3Disruption.  # noqa: E501
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this V3Disruption.

        URL of relevant article on PTV website  # noqa: E501

        :param url: The url of this V3Disruption.  # noqa: E501
        :type: str
        """

        self._url = url

    @property
    def description(self):
        """Gets the description of this V3Disruption.  # noqa: E501

        Description of the disruption  # noqa: E501

        :return: The description of this V3Disruption.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this V3Disruption.

        Description of the disruption  # noqa: E501

        :param description: The description of this V3Disruption.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def disruption_status(self):
        """Gets the disruption_status of this V3Disruption.  # noqa: E501

        Status of the disruption (e.g. \"Planned\", \"Current\")  # noqa: E501

        :return: The disruption_status of this V3Disruption.  # noqa: E501
        :rtype: str
        """
        return self._disruption_status

    @disruption_status.setter
    def disruption_status(self, disruption_status):
        """Sets the disruption_status of this V3Disruption.

        Status of the disruption (e.g. \"Planned\", \"Current\")  # noqa: E501

        :param disruption_status: The disruption_status of this V3Disruption.  # noqa: E501
        :type: str
        """

        self._disruption_status = disruption_status

    @property
    def disruption_type(self):
        """Gets the disruption_type of this V3Disruption.  # noqa: E501

        Type of disruption  # noqa: E501

        :return: The disruption_type of this V3Disruption.  # noqa: E501
        :rtype: str
        """
        return self._disruption_type

    @disruption_type.setter
    def disruption_type(self, disruption_type):
        """Sets the disruption_type of this V3Disruption.

        Type of disruption  # noqa: E501

        :param disruption_type: The disruption_type of this V3Disruption.  # noqa: E501
        :type: str
        """

        self._disruption_type = disruption_type

    @property
    def published_on(self):
        """Gets the published_on of this V3Disruption.  # noqa: E501

        Date and time disruption information is published on PTV website, in ISO 8601 UTC format  # noqa: E501

        :return: The published_on of this V3Disruption.  # noqa: E501
        :rtype: datetime
        """
        return self._published_on

    @published_on.setter
    def published_on(self, published_on):
        """Sets the published_on of this V3Disruption.

        Date and time disruption information is published on PTV website, in ISO 8601 UTC format  # noqa: E501

        :param published_on: The published_on of this V3Disruption.  # noqa: E501
        :type: datetime
        """

        self._published_on = published_on

    @property
    def last_updated(self):
        """Gets the last_updated of this V3Disruption.  # noqa: E501

        Date and time disruption information was last updated by PTV, in ISO 8601 UTC format  # noqa: E501

        :return: The last_updated of this V3Disruption.  # noqa: E501
        :rtype: datetime
        """
        return self._last_updated

    @last_updated.setter
    def last_updated(self, last_updated):
        """Sets the last_updated of this V3Disruption.

        Date and time disruption information was last updated by PTV, in ISO 8601 UTC format  # noqa: E501

        :param last_updated: The last_updated of this V3Disruption.  # noqa: E501
        :type: datetime
        """

        self._last_updated = last_updated

    @property
    def from_date(self):
        """Gets the from_date of this V3Disruption.  # noqa: E501

        Date and time at which disruption begins, in ISO 8601 UTC format  # noqa: E501

        :return: The from_date of this V3Disruption.  # noqa: E501
        :rtype: datetime
        """
        return self._from_date

    @from_date.setter
    def from_date(self, from_date):
        """Sets the from_date of this V3Disruption.

        Date and time at which disruption begins, in ISO 8601 UTC format  # noqa: E501

        :param from_date: The from_date of this V3Disruption.  # noqa: E501
        :type: datetime
        """

        self._from_date = from_date

    @property
    def to_date(self):
        """Gets the to_date of this V3Disruption.  # noqa: E501

        Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)  # noqa: E501

        :return: The to_date of this V3Disruption.  # noqa: E501
        :rtype: datetime
        """
        return self._to_date

    @to_date.setter
    def to_date(self, to_date):
        """Sets the to_date of this V3Disruption.

        Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)  # noqa: E501

        :param to_date: The to_date of this V3Disruption.  # noqa: E501
        :type: datetime
        """

        self._to_date = to_date

    @property
    def routes(self):
        """Gets the routes of this V3Disruption.  # noqa: E501

        Route relevant to a disruption (if applicable)  # noqa: E501

        :return: The routes of this V3Disruption.  # noqa: E501
        :rtype: list[V3DisruptionRoute]
        """
        return self._routes

    @routes.setter
    def routes(self, routes):
        """Sets the routes of this V3Disruption.

        Route relevant to a disruption (if applicable)  # noqa: E501

        :param routes: The routes of this V3Disruption.  # noqa: E501
        :type: list[V3DisruptionRoute]
        """

        self._routes = routes

    @property
    def stops(self):
        """Gets the stops of this V3Disruption.  # noqa: E501

        Stop relevant to a disruption (if applicable)  # noqa: E501

        :return: The stops of this V3Disruption.  # noqa: E501
        :rtype: list[V3DisruptionStop]
        """
        return self._stops

    @stops.setter
    def stops(self, stops):
        """Sets the stops of this V3Disruption.

        Stop relevant to a disruption (if applicable)  # noqa: E501

        :param stops: The stops of this V3Disruption.  # noqa: E501
        :type: list[V3DisruptionStop]
        """

        self._stops = stops

    @property
    def colour(self):
        """Gets the colour of this V3Disruption.  # noqa: E501


        :return: The colour of this V3Disruption.  # noqa: E501
        :rtype: str
        """
        return self._colour

    @colour.setter
    def colour(self, colour):
        """Sets the colour of this V3Disruption.


        :param colour: The colour of this V3Disruption.  # noqa: E501
        :type: str
        """

        self._colour = colour

    @property
    def display_on_board(self):
        """Gets the display_on_board of this V3Disruption.  # noqa: E501


        :return: The display_on_board of this V3Disruption.  # noqa: E501
        :rtype: bool
        """
        return self._display_on_board

    @display_on_board.setter
    def display_on_board(self, display_on_board):
        """Sets the display_on_board of this V3Disruption.


        :param display_on_board: The display_on_board of this V3Disruption.  # noqa: E501
        :type: bool
        """

        self._display_on_board = display_on_board

    @property
    def display_status(self):
        """Gets the display_status of this V3Disruption.  # noqa: E501


        :return: The display_status of this V3Disruption.  # noqa: E501
        :rtype: bool
        """
        return self._display_status

    @display_status.setter
    def display_status(self, display_status):
        """Sets the display_status of this V3Disruption.


        :param display_status: The display_status of this V3Disruption.  # noqa: E501
        :type: bool
        """

        self._display_status = display_status

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
        if issubclass(V3Disruption, dict):
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
        if not isinstance(other, V3Disruption):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
