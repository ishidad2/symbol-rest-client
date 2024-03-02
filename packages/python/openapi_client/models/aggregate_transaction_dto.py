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
from openapi_client.models.cosignature_dto import CosignatureDTO
from openapi_client.models.network_type_enum import NetworkTypeEnum
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class AggregateTransactionDTO(BaseModel):
    """
    Transaction to combine multiple transactions together.
    """ # noqa: E501
    size: StrictInt = Field(description="A number that allows uint 32 values.")
    signature: StrictStr = Field(description="Entity's signature generated by the signer.")
    signer_public_key: StrictStr = Field(description="Public key.", alias="signerPublicKey")
    version: StrictInt = Field(description="Entity version.")
    network: NetworkTypeEnum
    type: StrictInt
    max_fee: StrictStr = Field(description="Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).", alias="maxFee")
    deadline: StrictStr = Field(description="Duration expressed in number of blocks.")
    transactions_hash: StrictStr = Field(alias="transactionsHash")
    cosignatures: List[CosignatureDTO] = Field(description="Array of transaction cosignatures.")
    __properties: ClassVar[List[str]] = ["size", "signature", "signerPublicKey", "version", "network", "type", "maxFee", "deadline", "transactionsHash", "cosignatures"]

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
        """Create an instance of AggregateTransactionDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in cosignatures (list)
        _items = []
        if self.cosignatures:
            for _item in self.cosignatures:
                if _item:
                    _items.append(_item.to_dict())
            _dict['cosignatures'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of AggregateTransactionDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "size": obj.get("size"),
            "signature": obj.get("signature"),
            "signerPublicKey": obj.get("signerPublicKey"),
            "version": obj.get("version"),
            "network": obj.get("network"),
            "type": obj.get("type"),
            "maxFee": obj.get("maxFee"),
            "deadline": obj.get("deadline"),
            "transactionsHash": obj.get("transactionsHash"),
            "cosignatures": [CosignatureDTO.from_dict(_item) for _item in obj.get("cosignatures")] if obj.get("cosignatures") is not None else None
        })
        return _obj


