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

class V3PassengerFare(object):
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
        'passenger_type': 'str',
        'fare2_hour_peak': 'float',
        'fare2_hour_off_peak': 'float',
        'fare_daily_peak': 'float',
        'fare_daily_off_peak': 'float',
        'pass7_days': 'float',
        'pass28_to69_day_per_day': 'float',
        'pass70_plus_day_per_day': 'float',
        'weekend_cap': 'float',
        'holiday_cap': 'float'
    }

    attribute_map = {
        'passenger_type': 'PassengerType',
        'fare2_hour_peak': 'Fare2HourPeak',
        'fare2_hour_off_peak': 'Fare2HourOffPeak',
        'fare_daily_peak': 'FareDailyPeak',
        'fare_daily_off_peak': 'FareDailyOffPeak',
        'pass7_days': 'Pass7Days',
        'pass28_to69_day_per_day': 'Pass28To69DayPerDay',
        'pass70_plus_day_per_day': 'Pass70PlusDayPerDay',
        'weekend_cap': 'WeekendCap',
        'holiday_cap': 'HolidayCap'
    }

    def __init__(self, passenger_type=None, fare2_hour_peak=None, fare2_hour_off_peak=None, fare_daily_peak=None, fare_daily_off_peak=None, pass7_days=None, pass28_to69_day_per_day=None, pass70_plus_day_per_day=None, weekend_cap=None, holiday_cap=None):  # noqa: E501
        """V3PassengerFare - a model defined in Swagger"""  # noqa: E501
        self._passenger_type = None
        self._fare2_hour_peak = None
        self._fare2_hour_off_peak = None
        self._fare_daily_peak = None
        self._fare_daily_off_peak = None
        self._pass7_days = None
        self._pass28_to69_day_per_day = None
        self._pass70_plus_day_per_day = None
        self._weekend_cap = None
        self._holiday_cap = None
        self.discriminator = None
        if passenger_type is not None:
            self.passenger_type = passenger_type
        if fare2_hour_peak is not None:
            self.fare2_hour_peak = fare2_hour_peak
        if fare2_hour_off_peak is not None:
            self.fare2_hour_off_peak = fare2_hour_off_peak
        if fare_daily_peak is not None:
            self.fare_daily_peak = fare_daily_peak
        if fare_daily_off_peak is not None:
            self.fare_daily_off_peak = fare_daily_off_peak
        if pass7_days is not None:
            self.pass7_days = pass7_days
        if pass28_to69_day_per_day is not None:
            self.pass28_to69_day_per_day = pass28_to69_day_per_day
        if pass70_plus_day_per_day is not None:
            self.pass70_plus_day_per_day = pass70_plus_day_per_day
        if weekend_cap is not None:
            self.weekend_cap = weekend_cap
        if holiday_cap is not None:
            self.holiday_cap = holiday_cap

    @property
    def passenger_type(self):
        """Gets the passenger_type of this V3PassengerFare.  # noqa: E501


        :return: The passenger_type of this V3PassengerFare.  # noqa: E501
        :rtype: str
        """
        return self._passenger_type

    @passenger_type.setter
    def passenger_type(self, passenger_type):
        """Sets the passenger_type of this V3PassengerFare.


        :param passenger_type: The passenger_type of this V3PassengerFare.  # noqa: E501
        :type: str
        """

        self._passenger_type = passenger_type

    @property
    def fare2_hour_peak(self):
        """Gets the fare2_hour_peak of this V3PassengerFare.  # noqa: E501


        :return: The fare2_hour_peak of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._fare2_hour_peak

    @fare2_hour_peak.setter
    def fare2_hour_peak(self, fare2_hour_peak):
        """Sets the fare2_hour_peak of this V3PassengerFare.


        :param fare2_hour_peak: The fare2_hour_peak of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._fare2_hour_peak = fare2_hour_peak

    @property
    def fare2_hour_off_peak(self):
        """Gets the fare2_hour_off_peak of this V3PassengerFare.  # noqa: E501


        :return: The fare2_hour_off_peak of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._fare2_hour_off_peak

    @fare2_hour_off_peak.setter
    def fare2_hour_off_peak(self, fare2_hour_off_peak):
        """Sets the fare2_hour_off_peak of this V3PassengerFare.


        :param fare2_hour_off_peak: The fare2_hour_off_peak of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._fare2_hour_off_peak = fare2_hour_off_peak

    @property
    def fare_daily_peak(self):
        """Gets the fare_daily_peak of this V3PassengerFare.  # noqa: E501


        :return: The fare_daily_peak of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._fare_daily_peak

    @fare_daily_peak.setter
    def fare_daily_peak(self, fare_daily_peak):
        """Sets the fare_daily_peak of this V3PassengerFare.


        :param fare_daily_peak: The fare_daily_peak of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._fare_daily_peak = fare_daily_peak

    @property
    def fare_daily_off_peak(self):
        """Gets the fare_daily_off_peak of this V3PassengerFare.  # noqa: E501


        :return: The fare_daily_off_peak of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._fare_daily_off_peak

    @fare_daily_off_peak.setter
    def fare_daily_off_peak(self, fare_daily_off_peak):
        """Sets the fare_daily_off_peak of this V3PassengerFare.


        :param fare_daily_off_peak: The fare_daily_off_peak of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._fare_daily_off_peak = fare_daily_off_peak

    @property
    def pass7_days(self):
        """Gets the pass7_days of this V3PassengerFare.  # noqa: E501


        :return: The pass7_days of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._pass7_days

    @pass7_days.setter
    def pass7_days(self, pass7_days):
        """Sets the pass7_days of this V3PassengerFare.


        :param pass7_days: The pass7_days of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._pass7_days = pass7_days

    @property
    def pass28_to69_day_per_day(self):
        """Gets the pass28_to69_day_per_day of this V3PassengerFare.  # noqa: E501


        :return: The pass28_to69_day_per_day of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._pass28_to69_day_per_day

    @pass28_to69_day_per_day.setter
    def pass28_to69_day_per_day(self, pass28_to69_day_per_day):
        """Sets the pass28_to69_day_per_day of this V3PassengerFare.


        :param pass28_to69_day_per_day: The pass28_to69_day_per_day of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._pass28_to69_day_per_day = pass28_to69_day_per_day

    @property
    def pass70_plus_day_per_day(self):
        """Gets the pass70_plus_day_per_day of this V3PassengerFare.  # noqa: E501


        :return: The pass70_plus_day_per_day of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._pass70_plus_day_per_day

    @pass70_plus_day_per_day.setter
    def pass70_plus_day_per_day(self, pass70_plus_day_per_day):
        """Sets the pass70_plus_day_per_day of this V3PassengerFare.


        :param pass70_plus_day_per_day: The pass70_plus_day_per_day of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._pass70_plus_day_per_day = pass70_plus_day_per_day

    @property
    def weekend_cap(self):
        """Gets the weekend_cap of this V3PassengerFare.  # noqa: E501


        :return: The weekend_cap of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._weekend_cap

    @weekend_cap.setter
    def weekend_cap(self, weekend_cap):
        """Sets the weekend_cap of this V3PassengerFare.


        :param weekend_cap: The weekend_cap of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._weekend_cap = weekend_cap

    @property
    def holiday_cap(self):
        """Gets the holiday_cap of this V3PassengerFare.  # noqa: E501


        :return: The holiday_cap of this V3PassengerFare.  # noqa: E501
        :rtype: float
        """
        return self._holiday_cap

    @holiday_cap.setter
    def holiday_cap(self, holiday_cap):
        """Sets the holiday_cap of this V3PassengerFare.


        :param holiday_cap: The holiday_cap of this V3PassengerFare.  # noqa: E501
        :type: float
        """

        self._holiday_cap = holiday_cap

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
        if issubclass(V3PassengerFare, dict):
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
        if not isinstance(other, V3PassengerFare):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
