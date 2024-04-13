# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class V3DisruptionDirection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, route_direction_id: int=None, direction_id: int=None, direction_name: str=None, service_time: str=None):  # noqa: E501
        """V3DisruptionDirection - a model defined in Swagger

        :param route_direction_id: The route_direction_id of this V3DisruptionDirection.  # noqa: E501
        :type route_direction_id: int
        :param direction_id: The direction_id of this V3DisruptionDirection.  # noqa: E501
        :type direction_id: int
        :param direction_name: The direction_name of this V3DisruptionDirection.  # noqa: E501
        :type direction_name: str
        :param service_time: The service_time of this V3DisruptionDirection.  # noqa: E501
        :type service_time: str
        """
        self.swagger_types = {
            'route_direction_id': int,
            'direction_id': int,
            'direction_name': str,
            'service_time': str
        }

        self.attribute_map = {
            'route_direction_id': 'route_direction_id',
            'direction_id': 'direction_id',
            'direction_name': 'direction_name',
            'service_time': 'service_time'
        }
        self._route_direction_id = route_direction_id
        self._direction_id = direction_id
        self._direction_name = direction_name
        self._service_time = service_time

    @classmethod
    def from_dict(cls, dikt) -> 'V3DisruptionDirection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The V3.DisruptionDirection of this V3DisruptionDirection.  # noqa: E501
        :rtype: V3DisruptionDirection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def route_direction_id(self) -> int:
        """Gets the route_direction_id of this V3DisruptionDirection.

        Route and direction of travel combination identifier  # noqa: E501

        :return: The route_direction_id of this V3DisruptionDirection.
        :rtype: int
        """
        return self._route_direction_id

    @route_direction_id.setter
    def route_direction_id(self, route_direction_id: int):
        """Sets the route_direction_id of this V3DisruptionDirection.

        Route and direction of travel combination identifier  # noqa: E501

        :param route_direction_id: The route_direction_id of this V3DisruptionDirection.
        :type route_direction_id: int
        """

        self._route_direction_id = route_direction_id

    @property
    def direction_id(self) -> int:
        """Gets the direction_id of this V3DisruptionDirection.

        Direction of travel identifier  # noqa: E501

        :return: The direction_id of this V3DisruptionDirection.
        :rtype: int
        """
        return self._direction_id

    @direction_id.setter
    def direction_id(self, direction_id: int):
        """Sets the direction_id of this V3DisruptionDirection.

        Direction of travel identifier  # noqa: E501

        :param direction_id: The direction_id of this V3DisruptionDirection.
        :type direction_id: int
        """

        self._direction_id = direction_id

    @property
    def direction_name(self) -> str:
        """Gets the direction_name of this V3DisruptionDirection.

        Name of direction of travel  # noqa: E501

        :return: The direction_name of this V3DisruptionDirection.
        :rtype: str
        """
        return self._direction_name

    @direction_name.setter
    def direction_name(self, direction_name: str):
        """Sets the direction_name of this V3DisruptionDirection.

        Name of direction of travel  # noqa: E501

        :param direction_name: The direction_name of this V3DisruptionDirection.
        :type direction_name: str
        """

        self._direction_name = direction_name

    @property
    def service_time(self) -> str:
        """Gets the service_time of this V3DisruptionDirection.

        Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services  # noqa: E501

        :return: The service_time of this V3DisruptionDirection.
        :rtype: str
        """
        return self._service_time

    @service_time.setter
    def service_time(self, service_time: str):
        """Sets the service_time of this V3DisruptionDirection.

        Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services  # noqa: E501

        :param service_time: The service_time of this V3DisruptionDirection.
        :type service_time: str
        """

        self._service_time = service_time
