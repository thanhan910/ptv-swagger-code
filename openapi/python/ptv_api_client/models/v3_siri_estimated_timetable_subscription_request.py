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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List
from typing_extensions import Annotated
from ptv_api_client.models.v3_siri_subscription_topic import V3SiriSubscriptionTopic
from typing import Optional, Set
from typing_extensions import Self

class V3SiriEstimatedTimetableSubscriptionRequest(BaseModel):
    """
    V3SiriEstimatedTimetableSubscriptionRequest
    """ # noqa: E501
    preview_interval: StrictStr = Field(description="Siri Preview Interval")
    subscriber_ref: StrictStr = Field(description="Siri Subscriber Ref")
    subscription_ref: StrictStr = Field(description="Siri Subscription Ref - Unique to a Subscriber Ref")
    siri_format: StrictInt = Field(description="Siri Message Format 'xml' or 'json'")
    siri_version: Annotated[str, Field(strict=True)] = Field(description="Siri Message Version '1.3' or '2.0'")
    consumer_address: StrictStr = Field(description="Siri Consumer Address - Baseline and Updates will be sent to this address")
    initial_termination_time: datetime = Field(description="Siri Initial Termination Time - Expiry of the subscription")
    topics: List[V3SiriSubscriptionTopic]
    __properties: ClassVar[List[str]] = ["preview_interval", "subscriber_ref", "subscription_ref", "siri_format", "siri_version", "consumer_address", "initial_termination_time", "topics"]

    @field_validator('siri_format')
    def siri_format_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set([0, 1]):
            raise ValueError("must be one of enum values (0, 1)")
        return value

    @field_validator('siri_version')
    def siri_version_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"1.3|2.0", value):
            raise ValueError(r"must validate the regular expression /1.3|2.0/")
        return value

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
        """Create an instance of V3SiriEstimatedTimetableSubscriptionRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in topics (list)
        _items = []
        if self.topics:
            for _item in self.topics:
                if _item:
                    _items.append(_item.to_dict())
            _dict['topics'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of V3SiriEstimatedTimetableSubscriptionRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "preview_interval": obj.get("preview_interval"),
            "subscriber_ref": obj.get("subscriber_ref"),
            "subscription_ref": obj.get("subscription_ref"),
            "siri_format": obj.get("siri_format"),
            "siri_version": obj.get("siri_version"),
            "consumer_address": obj.get("consumer_address"),
            "initial_termination_time": obj.get("initial_termination_time"),
            "topics": [V3SiriSubscriptionTopic.from_dict(_item) for _item in obj["topics"]] if obj.get("topics") is not None else None
        })
        return _obj


