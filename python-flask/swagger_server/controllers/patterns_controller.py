import connexion
import six

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_stopping_pattern import V3StoppingPattern  # noqa: E501
from swagger_server import util


def patterns_get_pattern_by_run(run_ref, route_type, expand, stop_id=None, date_utc=None, include_skipped_stops=None, include_geopath=None, token=None, devid=None, signature=None):  # noqa: E501
    """View the stopping pattern for a specific trip/service run

     # noqa: E501

    :param run_ref: The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
    :type run_ref: str
    :param route_type: Number identifying transport mode; values returned via RouteTypes API
    :type route_type: int
    :param expand: List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
    :type expand: List[str]
    :param stop_id: Filter by stop_id; values returned by Stops API
    :type stop_id: int
    :param date_utc: Filter by the date and time of the request (ISO 8601 UTC format)
    :type date_utc: str
    :param include_skipped_stops: Include any skipped stops in a stopping pattern. Defaults to false.
    :type include_skipped_stops: bool
    :param include_geopath: Indicates if geopath data will be returned (default &#x3D; false)
    :type include_geopath: bool
    :param token: Please ignore
    :type token: str
    :param devid: Your developer id
    :type devid: str
    :param signature: Authentication signature for request
    :type signature: str

    :rtype: V3StoppingPattern
    """
    date_utc = util.deserialize_datetime(date_utc)
    return 'do some magic!'
