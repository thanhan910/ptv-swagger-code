# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.v3_disruption import V3Disruption  # noqa: F401,E501
from swagger_server.models.v3_status import V3Status  # noqa: F401,E501
from swagger_server.models.v3_stop_geosearch import V3StopGeosearch  # noqa: F401,E501
from swagger_server import util


class V3StopsByDistanceResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, stops: List[V3StopGeosearch]=None, disruptions: Dict[str, V3Disruption]=None, status: V3Status=None):  # noqa: E501
        """V3StopsByDistanceResponse - a model defined in Swagger

        :param stops: The stops of this V3StopsByDistanceResponse.  # noqa: E501
        :type stops: List[V3StopGeosearch]
        :param disruptions: The disruptions of this V3StopsByDistanceResponse.  # noqa: E501
        :type disruptions: Dict[str, V3Disruption]
        :param status: The status of this V3StopsByDistanceResponse.  # noqa: E501
        :type status: V3Status
        """
        self.swagger_types = {
            'stops': List[V3StopGeosearch],
            'disruptions': Dict[str, V3Disruption],
            'status': V3Status
        }

        self.attribute_map = {
            'stops': 'stops',
            'disruptions': 'disruptions',
            'status': 'status'
        }
        self._stops = stops
        self._disruptions = disruptions
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'V3StopsByDistanceResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The V3.StopsByDistanceResponse of this V3StopsByDistanceResponse.  # noqa: E501
        :rtype: V3StopsByDistanceResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def stops(self) -> List[V3StopGeosearch]:
        """Gets the stops of this V3StopsByDistanceResponse.

        Train stations, tram stops, bus stops, regional coach stops or Night Bus stops  # noqa: E501

        :return: The stops of this V3StopsByDistanceResponse.
        :rtype: List[V3StopGeosearch]
        """
        return self._stops

    @stops.setter
    def stops(self, stops: List[V3StopGeosearch]):
        """Sets the stops of this V3StopsByDistanceResponse.

        Train stations, tram stops, bus stops, regional coach stops or Night Bus stops  # noqa: E501

        :param stops: The stops of this V3StopsByDistanceResponse.
        :type stops: List[V3StopGeosearch]
        """

        self._stops = stops

    @property
    def disruptions(self) -> Dict[str, V3Disruption]:
        """Gets the disruptions of this V3StopsByDistanceResponse.

        Disruption information applicable to relevant routes or stops  # noqa: E501

        :return: The disruptions of this V3StopsByDistanceResponse.
        :rtype: Dict[str, V3Disruption]
        """
        return self._disruptions

    @disruptions.setter
    def disruptions(self, disruptions: Dict[str, V3Disruption]):
        """Sets the disruptions of this V3StopsByDistanceResponse.

        Disruption information applicable to relevant routes or stops  # noqa: E501

        :param disruptions: The disruptions of this V3StopsByDistanceResponse.
        :type disruptions: Dict[str, V3Disruption]
        """

        self._disruptions = disruptions

    @property
    def status(self) -> V3Status:
        """Gets the status of this V3StopsByDistanceResponse.


        :return: The status of this V3StopsByDistanceResponse.
        :rtype: V3Status
        """
        return self._status

    @status.setter
    def status(self, status: V3Status):
        """Sets the status of this V3StopsByDistanceResponse.


        :param status: The status of this V3StopsByDistanceResponse.
        :type status: V3Status
        """

        self._status = status
