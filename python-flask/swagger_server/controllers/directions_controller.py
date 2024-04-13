import connexion
import six

from swagger_server.models.v3_directions_response import V3DirectionsResponse  # noqa: E501
from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server import util


def directions_for_direction(direction_id, token=None, devid=None, signature=None):  # noqa: E501
    """View all routes for a direction of travel

     # noqa: E501

    :param direction_id: Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
    :type direction_id: int
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DirectionsResponse
    """
    return 'do some magic!'


def directions_for_direction_and_type(direction_id, route_type, token=None, devid=None, signature=None):  # noqa: E501
    """View all routes of a particular type for a direction of travel

     # noqa: E501

    :param direction_id: Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
    :type direction_id: int
    :param route_type: Number identifying transport mode; values returned via RouteTypes API
    :type route_type: int
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DirectionsResponse
    """
    return 'do some magic!'


def directions_for_route(route_id, token=None, devid=None, signature=None):  # noqa: E501
    """View directions that a route travels in

     # noqa: E501

    :param route_id: Identifier of route; values returned by Routes API - v3/routes
    :type route_id: int
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DirectionsResponse
    """
    return 'do some magic!'
