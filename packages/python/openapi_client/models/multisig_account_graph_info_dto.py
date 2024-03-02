# coding: utf-8

"""
    Catapult REST Endpoints

    OpenAPI Specification of catapult-rest

    The version of the OpenAPI document: 1.0.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, ClassVar, Dict, List
from pydantic import BaseModel, StrictInt
from pydantic import Field
from openapi_client.models.multisig_account_info_dto import MultisigAccountInfoDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class MultisigAccountGraphInfoDTO(BaseModel):
    """
    MultisigAccountGraphInfoDTO
    """ # noqa: E501
    level: StrictInt = Field(description="Level of the multisig account.")
    multisig_entries: List[MultisigAccountInfoDTO] = Field(description="Array of multisig accounts for this level.", alias="multisigEntries")
    __properties: ClassVar[List[str]] = ["level", "multisigEntries"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of MultisigAccountGraphInfoDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in multisig_entries (list)
        _items = []
        if self.multisig_entries:
            for _item in self.multisig_entries:
                if _item:
                    _items.append(_item.to_dict())
            _dict['multisigEntries'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of MultisigAccountGraphInfoDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "level": obj.get("level"),
            "multisigEntries": [MultisigAccountInfoDTO.from_dict(_item) for _item in obj.get("multisigEntries")] if obj.get("multisigEntries") is not None else None
        })
        return _obj


