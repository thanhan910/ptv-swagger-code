# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.v3_stop_accessibility import V3StopAccessibility  # noqa: F401,E501
from swagger_server.models.v3_stop_amenity_details import V3StopAmenityDetails  # noqa: F401,E501
from swagger_server.models.v3_stop_location import V3StopLocation  # noqa: F401,E501
from swagger_server.models.v3_stop_staffing import V3StopStaffing  # noqa: F401,E501
from swagger_server import util


class V3StopDetails(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, disruption_ids: List[int]=None, station_type: str=None, station_description: str=None, route_type: int=None, stop_location: V3StopLocation=None, stop_amenities: V3StopAmenityDetails=None, stop_accessibility: V3StopAccessibility=None, stop_staffing: V3StopStaffing=None, routes: List[object]=None, stop_id: int=None, stop_name: str=None, stop_landmark: str=None):  # noqa: E501
        """V3StopDetails - a model defined in Swagger

        :param disruption_ids: The disruption_ids of this V3StopDetails.  # noqa: E501
        :type disruption_ids: List[int]
        :param station_type: The station_type of this V3StopDetails.  # noqa: E501
        :type station_type: str
        :param station_description: The station_description of this V3StopDetails.  # noqa: E501
        :type station_description: str
        :param route_type: The route_type of this V3StopDetails.  # noqa: E501
        :type route_type: int
        :param stop_location: The stop_location of this V3StopDetails.  # noqa: E501
        :type stop_location: V3StopLocation
        :param stop_amenities: The stop_amenities of this V3StopDetails.  # noqa: E501
        :type stop_amenities: V3StopAmenityDetails
        :param stop_accessibility: The stop_accessibility of this V3StopDetails.  # noqa: E501
        :type stop_accessibility: V3StopAccessibility
        :param stop_staffing: The stop_staffing of this V3StopDetails.  # noqa: E501
        :type stop_staffing: V3StopStaffing
        :param routes: The routes of this V3StopDetails.  # noqa: E501
        :type routes: List[object]
        :param stop_id: The stop_id of this V3StopDetails.  # noqa: E501
        :type stop_id: int
        :param stop_name: The stop_name of this V3StopDetails.  # noqa: E501
        :type stop_name: str
        :param stop_landmark: The stop_landmark of this V3StopDetails.  # noqa: E501
        :type stop_landmark: str
        """
        self.swagger_types = {
            'disruption_ids': List[int],
            'station_type': str,
            'station_description': str,
            'route_type': int,
            'stop_location': V3StopLocation,
            'stop_amenities': V3StopAmenityDetails,
            'stop_accessibility': V3StopAccessibility,
            'stop_staffing': V3StopStaffing,
            'routes': List[object],
            'stop_id': int,
            'stop_name': str,
            'stop_landmark': str
        }

        self.attribute_map = {
            'disruption_ids': 'disruption_ids',
            'station_type': 'station_type',
            'station_description': 'station_description',
            'route_type': 'route_type',
            'stop_location': 'stop_location',
            'stop_amenities': 'stop_amenities',
            'stop_accessibility': 'stop_accessibility',
            'stop_staffing': 'stop_staffing',
            'routes': 'routes',
            'stop_id': 'stop_id',
            'stop_name': 'stop_name',
            'stop_landmark': 'stop_landmark'
        }
        self._disruption_ids = disruption_ids
        self._station_type = station_type
        self._station_description = station_description
        self._route_type = route_type
        self._stop_location = stop_location
        self._stop_amenities = stop_amenities
        self._stop_accessibility = stop_accessibility
        self._stop_staffing = stop_staffing
        self._routes = routes
        self._stop_id = stop_id
        self._stop_name = stop_name
        self._stop_landmark = stop_landmark

    @classmethod
    def from_dict(cls, dikt) -> 'V3StopDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The V3.StopDetails of this V3StopDetails.  # noqa: E501
        :rtype: V3StopDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def disruption_ids(self) -> List[int]:
        """Gets the disruption_ids of this V3StopDetails.

        Disruption information identifier(s)  # noqa: E501

        :return: The disruption_ids of this V3StopDetails.
        :rtype: List[int]
        """
        return self._disruption_ids

    @disruption_ids.setter
    def disruption_ids(self, disruption_ids: List[int]):
        """Sets the disruption_ids of this V3StopDetails.

        Disruption information identifier(s)  # noqa: E501

        :param disruption_ids: The disruption_ids of this V3StopDetails.
        :type disruption_ids: List[int]
        """

        self._disruption_ids = disruption_ids

    @property
    def station_type(self) -> str:
        """Gets the station_type of this V3StopDetails.

        Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train  # noqa: E501

        :return: The station_type of this V3StopDetails.
        :rtype: str
        """
        return self._station_type

    @station_type.setter
    def station_type(self, station_type: str):
        """Sets the station_type of this V3StopDetails.

        Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train  # noqa: E501

        :param station_type: The station_type of this V3StopDetails.
        :type station_type: str
        """

        self._station_type = station_type

    @property
    def station_description(self) -> str:
        """Gets the station_description of this V3StopDetails.

        The definition applicable to the station_type; returns null for V/Line train  # noqa: E501

        :return: The station_description of this V3StopDetails.
        :rtype: str
        """
        return self._station_description

    @station_description.setter
    def station_description(self, station_description: str):
        """Sets the station_description of this V3StopDetails.

        The definition applicable to the station_type; returns null for V/Line train  # noqa: E501

        :param station_description: The station_description of this V3StopDetails.
        :type station_description: str
        """

        self._station_description = station_description

    @property
    def route_type(self) -> int:
        """Gets the route_type of this V3StopDetails.

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3StopDetails.
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type: int):
        """Sets the route_type of this V3StopDetails.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3StopDetails.
        :type route_type: int
        """

        self._route_type = route_type

    @property
    def stop_location(self) -> V3StopLocation:
        """Gets the stop_location of this V3StopDetails.


        :return: The stop_location of this V3StopDetails.
        :rtype: V3StopLocation
        """
        return self._stop_location

    @stop_location.setter
    def stop_location(self, stop_location: V3StopLocation):
        """Sets the stop_location of this V3StopDetails.


        :param stop_location: The stop_location of this V3StopDetails.
        :type stop_location: V3StopLocation
        """

        self._stop_location = stop_location

    @property
    def stop_amenities(self) -> V3StopAmenityDetails:
        """Gets the stop_amenities of this V3StopDetails.


        :return: The stop_amenities of this V3StopDetails.
        :rtype: V3StopAmenityDetails
        """
        return self._stop_amenities

    @stop_amenities.setter
    def stop_amenities(self, stop_amenities: V3StopAmenityDetails):
        """Sets the stop_amenities of this V3StopDetails.


        :param stop_amenities: The stop_amenities of this V3StopDetails.
        :type stop_amenities: V3StopAmenityDetails
        """

        self._stop_amenities = stop_amenities

    @property
    def stop_accessibility(self) -> V3StopAccessibility:
        """Gets the stop_accessibility of this V3StopDetails.


        :return: The stop_accessibility of this V3StopDetails.
        :rtype: V3StopAccessibility
        """
        return self._stop_accessibility

    @stop_accessibility.setter
    def stop_accessibility(self, stop_accessibility: V3StopAccessibility):
        """Sets the stop_accessibility of this V3StopDetails.


        :param stop_accessibility: The stop_accessibility of this V3StopDetails.
        :type stop_accessibility: V3StopAccessibility
        """

        self._stop_accessibility = stop_accessibility

    @property
    def stop_staffing(self) -> V3StopStaffing:
        """Gets the stop_staffing of this V3StopDetails.


        :return: The stop_staffing of this V3StopDetails.
        :rtype: V3StopStaffing
        """
        return self._stop_staffing

    @stop_staffing.setter
    def stop_staffing(self, stop_staffing: V3StopStaffing):
        """Sets the stop_staffing of this V3StopDetails.


        :param stop_staffing: The stop_staffing of this V3StopDetails.
        :type stop_staffing: V3StopStaffing
        """

        self._stop_staffing = stop_staffing

    @property
    def routes(self) -> List[object]:
        """Gets the routes of this V3StopDetails.

        Routes travelling through the stop  # noqa: E501

        :return: The routes of this V3StopDetails.
        :rtype: List[object]
        """
        return self._routes

    @routes.setter
    def routes(self, routes: List[object]):
        """Sets the routes of this V3StopDetails.

        Routes travelling through the stop  # noqa: E501

        :param routes: The routes of this V3StopDetails.
        :type routes: List[object]
        """

        self._routes = routes

    @property
    def stop_id(self) -> int:
        """Gets the stop_id of this V3StopDetails.

        Stop identifier  # noqa: E501

        :return: The stop_id of this V3StopDetails.
        :rtype: int
        """
        return self._stop_id

    @stop_id.setter
    def stop_id(self, stop_id: int):
        """Sets the stop_id of this V3StopDetails.

        Stop identifier  # noqa: E501

        :param stop_id: The stop_id of this V3StopDetails.
        :type stop_id: int
        """

        self._stop_id = stop_id

    @property
    def stop_name(self) -> str:
        """Gets the stop_name of this V3StopDetails.

        Name of stop  # noqa: E501

        :return: The stop_name of this V3StopDetails.
        :rtype: str
        """
        return self._stop_name

    @stop_name.setter
    def stop_name(self, stop_name: str):
        """Sets the stop_name of this V3StopDetails.

        Name of stop  # noqa: E501

        :param stop_name: The stop_name of this V3StopDetails.
        :type stop_name: str
        """

        self._stop_name = stop_name

    @property
    def stop_landmark(self) -> str:
        """Gets the stop_landmark of this V3StopDetails.

        Landmark in proximity of stop  # noqa: E501

        :return: The stop_landmark of this V3StopDetails.
        :rtype: str
        """
        return self._stop_landmark

    @stop_landmark.setter
    def stop_landmark(self, stop_landmark: str):
        """Sets the stop_landmark of this V3StopDetails.

        Landmark in proximity of stop  # noqa: E501

        :param stop_landmark: The stop_landmark of this V3StopDetails.
        :type stop_landmark: str
        """

        self._stop_landmark = stop_landmark
