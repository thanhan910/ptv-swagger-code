import connexion
import six

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_outlet_geolocation_response import V3OutletGeolocationResponse  # noqa: E501
from swagger_server.models.v3_outlet_response import V3OutletResponse  # noqa: E501
from swagger_server import util


def outlets_get_all_outlets(max_results=None, token=None, devid=None, signature=None):  # noqa: E501
    """List all ticket outlets

     # noqa: E501

    :param max_results: Maximum number of results returned (default &#x3D; 30)
    :type max_results: int
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3OutletResponse
    """
    return 'do some magic!'


def outlets_get_outlets_by_geolocation(latitude, longitude, max_distance=None, max_results=None, token=None, devid=None, signature=None):  # noqa: E501
    """List ticket outlets near a specific location

     # noqa: E501

    :param latitude: Geographic coordinate of latitude
    :type latitude: float
    :param longitude: Geographic coordinate of longitude
    :type longitude: float
    :param max_distance: Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
    :type max_distance: float
    :param max_results: Maximum number of results returned (default &#x3D; 30)
    :type max_results: int
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3OutletGeolocationResponse
    """
    return 'do some magic!'
