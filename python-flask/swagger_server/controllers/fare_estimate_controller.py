import connexion
import six

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_fare_estimate_response import V3FareEstimateResponse  # noqa: E501
from swagger_server import util


def fare_estimate_get_fare_estimate_by_zone(min_zone, max_zone, journey_touch_on_utc=None, journey_touch_off_utc=None, is_journey_in_free_tram_zone=None, travelled_route_types=None, token=None, devid=None, signature=None):  # noqa: E501
    """Estimate a fare by zone

     # noqa: E501

    :param min_zone: Minimum Zone travelled through ie. 1
    :type min_zone: int
    :param max_zone: Maximum Zone travelled through id. 6
    :type max_zone: int
    :param journey_touch_on_utc: JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
    :type journey_touch_on_utc: str
    :param journey_touch_off_utc: JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
    :type journey_touch_off_utc: str
    :param is_journey_in_free_tram_zone: 
    :type is_journey_in_free_tram_zone: bool
    :param travelled_route_types: 
    :type travelled_route_types: List[int]
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3FareEstimateResponse
    """
    journey_touch_on_utc = util.deserialize_datetime(journey_touch_on_utc)
    journey_touch_off_utc = util.deserialize_datetime(journey_touch_off_utc)
    return 'do some magic!'
