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

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class V3StopAccessibilityWheelchair(BaseModel):
    """
    V3StopAccessibilityWheelchair
    """ # noqa: E501
    accessible_ramp: Optional[StrictBool] = None
    parking: Optional[StrictBool] = Field(default=None, description="Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
    telephone: Optional[StrictBool] = Field(default=None, description="Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
    toilet: Optional[StrictBool] = Field(default=None, description="Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
    low_ticket_counter: Optional[StrictBool] = Field(default=None, description="Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
    manouvering: Optional[StrictBool] = Field(default=None, description="Indicates if there is a space for mobility device to board on or off a transport mode")
    raised_platform: Optional[StrictBool] = Field(default=None, description="Indicates if there is a raised platform to board a train")
    ramp: Optional[StrictBool] = Field(default=None, description="Indicates if there are ramps (&lt;1:14) at the stop/platform")
    secondary_path: Optional[StrictBool] = Field(default=None, description="Indicates if there is a path beyond the stop which is accessible")
    raised_platform_shelther: Optional[StrictBool] = Field(default=None, description="Indicates if there is shelter near the raised platform")
    steep_ramp: Optional[StrictBool] = Field(default=None, description="Indicates if there are ramps (&gt;1:14) at the stop/platform")
    __properties: ClassVar[List[str]] = ["accessible_ramp", "parking", "telephone", "toilet", "low_ticket_counter", "manouvering", "raised_platform", "ramp", "secondary_path", "raised_platform_shelther", "steep_ramp"]

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
        """Create an instance of V3StopAccessibilityWheelchair from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of V3StopAccessibilityWheelchair from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "accessible_ramp": obj.get("accessible_ramp"),
            "parking": obj.get("parking"),
            "telephone": obj.get("telephone"),
            "toilet": obj.get("toilet"),
            "low_ticket_counter": obj.get("low_ticket_counter"),
            "manouvering": obj.get("manouvering"),
            "raised_platform": obj.get("raised_platform"),
            "ramp": obj.get("ramp"),
            "secondary_path": obj.get("secondary_path"),
            "raised_platform_shelther": obj.get("raised_platform_shelther"),
            "steep_ramp": obj.get("steep_ramp")
        })
        return _obj

