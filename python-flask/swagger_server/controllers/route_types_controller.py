import connexion
import six

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_route_types_response import V3RouteTypesResponse  # noqa: E501
from swagger_server import util


def route_types_get_route_types(token=None, devid=None, signature=None):  # noqa: E501
    """View all route types and their names

     # noqa: E501

    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3RouteTypesResponse
    """
    return 'do some magic!'
