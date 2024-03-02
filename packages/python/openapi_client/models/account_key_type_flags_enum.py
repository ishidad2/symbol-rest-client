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


class AccountKeyTypeFlagsEnum(int, Enum):
    """
    Type of account key: * 0 - Unset. * 1 - Linked account public key. * 2 - Node public key on which remote is allowed to harvest. * 4 - VRF public key. 
    """

    """
    allowed enum values
    """
    NUMBER_0 = 0
    NUMBER_1 = 1
    NUMBER_2 = 2
    NUMBER_4 = 4

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AccountKeyTypeFlagsEnum from a JSON string"""
        return cls(json.loads(json_str))


