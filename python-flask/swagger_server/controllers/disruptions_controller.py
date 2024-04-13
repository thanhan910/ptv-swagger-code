import connexion
import six

from swagger_server.models.v3_disruption_modes_response import V3DisruptionModesResponse  # noqa: E501
from swagger_server.models.v3_disruption_response import V3DisruptionResponse  # noqa: E501
from swagger_server.models.v3_disruptions_response import V3DisruptionsResponse  # noqa: E501
from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server import util


def disruptions_get_all_disruptions(route_types=None, disruption_modes=None, disruption_status=None, token=None, devid=None, signature=None):  # noqa: E501
    """View all disruptions for all route types

     # noqa: E501

    :param route_types: Filter by route_type; values returned via RouteTypes API
    :type route_types: List[int]
    :param disruption_modes: Filter by disruption_mode; values returned via v3/disruptions/modes API
    :type disruption_modes: List[int]
    :param disruption_status: Filter by status of disruption
    :type disruption_status: str
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DisruptionsResponse
    """
    return 'do some magic!'


def disruptions_get_disruption_by_id(disruption_id, token=None, devid=None, signature=None):  # noqa: E501
    """View a specific disruption

     # noqa: E501

    :param disruption_id: Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
    :type disruption_id: int
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DisruptionResponse
    """
    return 'do some magic!'


def disruptions_get_disruption_modes(token=None, devid=None, signature=None):  # noqa: E501
    """Get all disruption modes

     # noqa: E501

    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DisruptionModesResponse
    """
    return 'do some magic!'


def disruptions_get_disruptions_by_route(route_id, disruption_status=None, token=None, devid=None, signature=None):  # noqa: E501
    """View all disruptions for a particular route

     # noqa: E501

    :param route_id: Identifier of route; values returned by Routes API - v3/routes
    :type route_id: int
    :param disruption_status: Filter by status of disruption
    :type disruption_status: str
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DisruptionsResponse
    """
    return 'do some magic!'


def disruptions_get_disruptions_by_route_and_stop(route_id, stop_id, disruption_status=None, token=None, devid=None, signature=None):  # noqa: E501
    """View all disruptions for a particular route and stop

     # noqa: E501

    :param route_id: Identifier of route; values returned by Routes API - v3/routes
    :type route_id: int
    :param stop_id: Identifier of stop; values returned by Stops API - v3/stops
    :type stop_id: int
    :param disruption_status: Filter by status of disruption
    :type disruption_status: str
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DisruptionsResponse
    """
    return 'do some magic!'


def disruptions_get_disruptions_by_stop(stop_id, disruption_status=None, token=None, devid=None, signature=None):  # noqa: E501
    """View all disruptions for a particular stop

     # noqa: E501

    :param stop_id: Identifier of stop; values returned by Stops API - v3/stops
    :type stop_id: int
    :param disruption_status: Filter by status of disruption
    :type disruption_status: str
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3DisruptionsResponse
    """
    return 'do some magic!'
