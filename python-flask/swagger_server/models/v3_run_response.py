# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.v3_run import V3Run  # noqa: F401,E501
from swagger_server.models.v3_status import V3Status  # noqa: F401,E501
from swagger_server import util


class V3RunResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, run: V3Run=None, status: V3Status=None):  # noqa: E501
        """V3RunResponse - a model defined in Swagger

        :param run: The run of this V3RunResponse.  # noqa: E501
        :type run: V3Run
        :param status: The status of this V3RunResponse.  # noqa: E501
        :type status: V3Status
        """
        self.swagger_types = {
            'run': V3Run,
            'status': V3Status
        }

        self.attribute_map = {
            'run': 'run',
            'status': 'status'
        }
        self._run = run
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'V3RunResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The V3.RunResponse of this V3RunResponse.  # noqa: E501
        :rtype: V3RunResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def run(self) -> V3Run:
        """Gets the run of this V3RunResponse.


        :return: The run of this V3RunResponse.
        :rtype: V3Run
        """
        return self._run

    @run.setter
    def run(self, run: V3Run):
        """Sets the run of this V3RunResponse.


        :param run: The run of this V3RunResponse.
        :type run: V3Run
        """

        self._run = run

    @property
    def status(self) -> V3Status:
        """Gets the status of this V3RunResponse.


        :return: The status of this V3RunResponse.
        :rtype: V3Status
        """
        return self._status

    @status.setter
    def status(self, status: V3Status):
        """Sets the status of this V3RunResponse.


        :param status: The status of this V3RunResponse.
        :type status: V3Status
        """

        self._status = status
