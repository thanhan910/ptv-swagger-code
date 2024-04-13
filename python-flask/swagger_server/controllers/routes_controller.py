import connexion
import six

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_route_response import V3RouteResponse  # noqa: E501
from swagger_server import util


def routes_one_or_more_routes(route_types=None, route_name=None, token=None, devid=None, signature=None):  # noqa: E501
    """View route names and numbers for all routes

     # noqa: E501

    :param route_types: Filter by route_type; values returned via RouteTypes API
    :type route_types: List[int]
    :param route_name: Filter by name  of route (accepts partial route name matches)
    :type route_name: str
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3RouteResponse
    """
    return 'do some magic!'


def routes_route_from_id(route_id, include_geopath=None, geopath_utc=None, token=None, devid=None, signature=None):  # noqa: E501
    """View route name and number for specific route ID

     # noqa: E501

    :param route_id: Identifier of route; values returned by Departures, Directions and Disruptions APIs
    :type route_id: int
    :param include_geopath: Indicates kif geopath data will be returned (default &#x3D; false)
    :type include_geopath: bool
    :param geopath_utc: Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)
    :type geopath_utc: str
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3RouteResponse
    """
    geopath_utc = util.deserialize_datetime(geopath_utc)
    return 'do some magic!'
