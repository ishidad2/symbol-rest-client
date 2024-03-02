# coding: utf-8

"""
    Catapult REST Endpoints

    OpenAPI Specification of catapult-rest

    The version of the OpenAPI document: 1.0.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
import re  # noqa: F401
from enum import Enum



try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class MosaicSupplyChangeActionEnum(int, Enum):
    """
    Direction of the supply change: * 0  - Decrease. * 1  - Increase. 
    """

    """
    allowed enum values
    """
    NUMBER_0 = 0
    NUMBER_1 = 1

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of MosaicSupplyChangeActionEnum from a JSON string"""
        return cls(json.loads(json_str))


