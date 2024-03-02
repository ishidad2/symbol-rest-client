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
from openapi_client.models.network_type_enum import NetworkTypeEnum
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class EmbeddedMosaicMetadataTransactionDTO(BaseModel):
    """
    EmbeddedMosaicMetadataTransactionDTO
    """ # noqa: E501
    signer_public_key: StrictStr = Field(description="Public key.", alias="signerPublicKey")
    version: StrictInt = Field(description="Entity version.")
    network: NetworkTypeEnum
    type: StrictInt
    target_address: StrictStr = Field(description="Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA ", alias="targetAddress")
    scoped_metadata_key: StrictStr = Field(description="Metadata key scoped to source, target and type expressed.", alias="scopedMetadataKey")
    target_mosaic_id: StrictStr = Field(description="Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier. ", alias="targetMosaicId")
    value_size_delta: StrictInt = Field(description="Change in value size in bytes.", alias="valueSizeDelta")
    value_size: StrictInt = Field(description="A number that allows uint 32 values.", alias="valueSize")
    value: StrictStr = Field(description="Metadata value. If embedded in a transaction, this is calculated as xor(previous-value, value).")
    __properties: ClassVar[List[str]] = ["signerPublicKey", "version", "network", "type", "targetAddress", "scopedMetadataKey", "targetMosaicId", "valueSizeDelta", "valueSize", "value"]

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
        """Create an instance of EmbeddedMosaicMetadataTransactionDTO from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of EmbeddedMosaicMetadataTransactionDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "signerPublicKey": obj.get("signerPublicKey"),
            "version": obj.get("version"),
            "network": obj.get("network"),
            "type": obj.get("type"),
            "targetAddress": obj.get("targetAddress"),
            "scopedMetadataKey": obj.get("scopedMetadataKey"),
            "targetMosaicId": obj.get("targetMosaicId"),
            "valueSizeDelta": obj.get("valueSizeDelta"),
            "valueSize": obj.get("valueSize"),
            "value": obj.get("value")
        })
        return _obj


