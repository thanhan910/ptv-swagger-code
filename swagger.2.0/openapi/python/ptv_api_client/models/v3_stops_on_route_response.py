# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

    The version of the OpenAPI document: v3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from ptv_api_client.models.v3_disruption import V3Disruption
from ptv_api_client.models.v3_status import V3Status
from ptv_api_client.models.v3_stop_on_route import V3StopOnRoute
from typing import Optional, Set
from typing_extensions import Self

class V3StopsOnRouteResponse(BaseModel):
    """
    V3StopsOnRouteResponse
    """ # noqa: E501
    stops: Optional[List[V3StopOnRoute]] = Field(default=None, description="Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
    disruptions: Optional[Dict[str, V3Disruption]] = Field(default=None, description="Disruption information applicable to relevant routes or stops")
    geopath: Optional[List[Dict[str, Any]]] = Field(default=None, description="GeoPath for the route")
    status: Optional[V3Status] = None
    __properties: ClassVar[List[str]] = ["stops", "disruptions", "geopath", "status"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of V3StopsOnRouteResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in stops (list)
        _items = []
        if self.stops:
            for _item in self.stops:
                if _item:
                    _items.append(_item.to_dict())
            _dict['stops'] = _items
        # override the default output from pydantic by calling `to_dict()` of each value in disruptions (dict)
        _field_dict = {}
        if self.disruptions:
            for _key in self.disruptions:
                if self.disruptions[_key]:
                    _field_dict[_key] = self.disruptions[_key].to_dict()
            _dict['disruptions'] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of V3StopsOnRouteResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "stops": [V3StopOnRoute.from_dict(_item) for _item in obj["stops"]] if obj.get("stops") is not None else None,
            "disruptions": dict(
                (_k, V3Disruption.from_dict(_v))
                for _k, _v in obj["disruptions"].items()
            )
            if obj.get("disruptions") is not None
            else None,
            "geopath": obj.get("geopath"),
            "status": V3Status.from_dict(obj["status"]) if obj.get("status") is not None else None
        })
        return _obj

