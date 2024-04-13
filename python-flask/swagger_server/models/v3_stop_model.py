# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class V3StopModel(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, stop_distance: float=None, stop_suburb: str=None, stop_name: str=None, stop_id: int=None, route_type: int=None, stop_latitude: float=None, stop_longitude: float=None, stop_landmark: str=None, stop_sequence: int=None):  # noqa: E501
        """V3StopModel - a model defined in Swagger

        :param stop_distance: The stop_distance of this V3StopModel.  # noqa: E501
        :type stop_distance: float
        :param stop_suburb: The stop_suburb of this V3StopModel.  # noqa: E501
        :type stop_suburb: str
        :param stop_name: The stop_name of this V3StopModel.  # noqa: E501
        :type stop_name: str
        :param stop_id: The stop_id of this V3StopModel.  # noqa: E501
        :type stop_id: int
        :param route_type: The route_type of this V3StopModel.  # noqa: E501
        :type route_type: int
        :param stop_latitude: The stop_latitude of this V3StopModel.  # noqa: E501
        :type stop_latitude: float
        :param stop_longitude: The stop_longitude of this V3StopModel.  # noqa: E501
        :type stop_longitude: float
        :param stop_landmark: The stop_landmark of this V3StopModel.  # noqa: E501
        :type stop_landmark: str
        :param stop_sequence: The stop_sequence of this V3StopModel.  # noqa: E501
        :type stop_sequence: int
        """
        self.swagger_types = {
            'stop_distance': float,
            'stop_suburb': str,
            'stop_name': str,
            'stop_id': int,
            'route_type': int,
            'stop_latitude': float,
            'stop_longitude': float,
            'stop_landmark': str,
            'stop_sequence': int
        }

        self.attribute_map = {
            'stop_distance': 'stop_distance',
            'stop_suburb': 'stop_suburb',
            'stop_name': 'stop_name',
            'stop_id': 'stop_id',
            'route_type': 'route_type',
            'stop_latitude': 'stop_latitude',
            'stop_longitude': 'stop_longitude',
            'stop_landmark': 'stop_landmark',
            'stop_sequence': 'stop_sequence'
        }
        self._stop_distance = stop_distance
        self._stop_suburb = stop_suburb
        self._stop_name = stop_name
        self._stop_id = stop_id
        self._route_type = route_type
        self._stop_latitude = stop_latitude
        self._stop_longitude = stop_longitude
        self._stop_landmark = stop_landmark
        self._stop_sequence = stop_sequence

    @classmethod
    def from_dict(cls, dikt) -> 'V3StopModel':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The V3.StopModel of this V3StopModel.  # noqa: E501
        :rtype: V3StopModel
        """
        return util.deserialize_model(dikt, cls)

    @property
    def stop_distance(self) -> float:
        """Gets the stop_distance of this V3StopModel.

        Distance of stop from input location (in metres); returns 0 if no location is input  # noqa: E501

        :return: The stop_distance of this V3StopModel.
        :rtype: float
        """
        return self._stop_distance

    @stop_distance.setter
    def stop_distance(self, stop_distance: float):
        """Sets the stop_distance of this V3StopModel.

        Distance of stop from input location (in metres); returns 0 if no location is input  # noqa: E501

        :param stop_distance: The stop_distance of this V3StopModel.
        :type stop_distance: float
        """

        self._stop_distance = stop_distance

    @property
    def stop_suburb(self) -> str:
        """Gets the stop_suburb of this V3StopModel.

        suburb of stop  # noqa: E501

        :return: The stop_suburb of this V3StopModel.
        :rtype: str
        """
        return self._stop_suburb

    @stop_suburb.setter
    def stop_suburb(self, stop_suburb: str):
        """Sets the stop_suburb of this V3StopModel.

        suburb of stop  # noqa: E501

        :param stop_suburb: The stop_suburb of this V3StopModel.
        :type stop_suburb: str
        """

        self._stop_suburb = stop_suburb

    @property
    def stop_name(self) -> str:
        """Gets the stop_name of this V3StopModel.

        Name of stop  # noqa: E501

        :return: The stop_name of this V3StopModel.
        :rtype: str
        """
        return self._stop_name

    @stop_name.setter
    def stop_name(self, stop_name: str):
        """Sets the stop_name of this V3StopModel.

        Name of stop  # noqa: E501

        :param stop_name: The stop_name of this V3StopModel.
        :type stop_name: str
        """

        self._stop_name = stop_name

    @property
    def stop_id(self) -> int:
        """Gets the stop_id of this V3StopModel.

        Stop identifier  # noqa: E501

        :return: The stop_id of this V3StopModel.
        :rtype: int
        """
        return self._stop_id

    @stop_id.setter
    def stop_id(self, stop_id: int):
        """Sets the stop_id of this V3StopModel.

        Stop identifier  # noqa: E501

        :param stop_id: The stop_id of this V3StopModel.
        :type stop_id: int
        """

        self._stop_id = stop_id

    @property
    def route_type(self) -> int:
        """Gets the route_type of this V3StopModel.

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3StopModel.
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type: int):
        """Sets the route_type of this V3StopModel.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3StopModel.
        :type route_type: int
        """

        self._route_type = route_type

    @property
    def stop_latitude(self) -> float:
        """Gets the stop_latitude of this V3StopModel.

        Geographic coordinate of latitude at stop  # noqa: E501

        :return: The stop_latitude of this V3StopModel.
        :rtype: float
        """
        return self._stop_latitude

    @stop_latitude.setter
    def stop_latitude(self, stop_latitude: float):
        """Sets the stop_latitude of this V3StopModel.

        Geographic coordinate of latitude at stop  # noqa: E501

        :param stop_latitude: The stop_latitude of this V3StopModel.
        :type stop_latitude: float
        """

        self._stop_latitude = stop_latitude

    @property
    def stop_longitude(self) -> float:
        """Gets the stop_longitude of this V3StopModel.

        Geographic coordinate of longitude at stop  # noqa: E501

        :return: The stop_longitude of this V3StopModel.
        :rtype: float
        """
        return self._stop_longitude

    @stop_longitude.setter
    def stop_longitude(self, stop_longitude: float):
        """Sets the stop_longitude of this V3StopModel.

        Geographic coordinate of longitude at stop  # noqa: E501

        :param stop_longitude: The stop_longitude of this V3StopModel.
        :type stop_longitude: float
        """

        self._stop_longitude = stop_longitude

    @property
    def stop_landmark(self) -> str:
        """Gets the stop_landmark of this V3StopModel.

        Landmark in proximity of stop  # noqa: E501

        :return: The stop_landmark of this V3StopModel.
        :rtype: str
        """
        return self._stop_landmark

    @stop_landmark.setter
    def stop_landmark(self, stop_landmark: str):
        """Sets the stop_landmark of this V3StopModel.

        Landmark in proximity of stop  # noqa: E501

        :param stop_landmark: The stop_landmark of this V3StopModel.
        :type stop_landmark: str
        """

        self._stop_landmark = stop_landmark

    @property
    def stop_sequence(self) -> int:
        """Gets the stop_sequence of this V3StopModel.

        Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.  # noqa: E501

        :return: The stop_sequence of this V3StopModel.
        :rtype: int
        """
        return self._stop_sequence

    @stop_sequence.setter
    def stop_sequence(self, stop_sequence: int):
        """Sets the stop_sequence of this V3StopModel.

        Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.  # noqa: E501

        :param stop_sequence: The stop_sequence of this V3StopModel.
        :type stop_sequence: int
        """

        self._stop_sequence = stop_sequence
