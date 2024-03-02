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
from pydantic import BaseModel, StrictInt, StrictStr
from pydantic import Field
from openapi_client.models.mosaic_address_restriction_entry_dto import MosaicAddressRestrictionEntryDTO
from openapi_client.models.mosaic_restriction_entry_type_enum import MosaicRestrictionEntryTypeEnum
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class MosaicAddressRestrictionEntryWrapperDTO(BaseModel):
    """
    MosaicAddressRestrictionEntryWrapperDTO
    """ # noqa: E501
    version: StrictInt = Field(description="The version of the state")
    composite_hash: StrictStr = Field(alias="compositeHash")
    entry_type: MosaicRestrictionEntryTypeEnum = Field(alias="entryType")
    mosaic_id: StrictStr = Field(description="Mosaic identifier.", alias="mosaicId")
    target_address: StrictStr = Field(description="Address encoded using a 32-character set.", alias="targetAddress")
    restrictions: List[MosaicAddressRestrictionEntryDTO]
    __properties: ClassVar[List[str]] = ["version", "compositeHash", "entryType", "mosaicId", "targetAddress", "restrictions"]

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
        """Create an instance of MosaicAddressRestrictionEntryWrapperDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in restrictions (list)
        _items = []
        if self.restrictions:
            for _item in self.restrictions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['restrictions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of MosaicAddressRestrictionEntryWrapperDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "version": obj.get("version"),
            "compositeHash": obj.get("compositeHash"),
            "entryType": obj.get("entryType"),
            "mosaicId": obj.get("mosaicId"),
            "targetAddress": obj.get("targetAddress"),
            "restrictions": [MosaicAddressRestrictionEntryDTO.from_dict(_item) for _item in obj.get("restrictions")] if obj.get("restrictions") is not None else None
        })
        return _obj


