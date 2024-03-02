/*
Catapult REST Endpoints

OpenAPI Specification of catapult-rest

API version: 1.0.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi_client

import (
	"encoding/json"
	"fmt"
)

// MerkleTreeNodeTypeEnum Type of Merkle tree node: * 0 - Branch node. * 255 - Leaf node. 
type MerkleTreeNodeTypeEnum int32

// List of MerkleTreeNodeTypeEnum
const (
	_0 MerkleTreeNodeTypeEnum = 0
	_255 MerkleTreeNodeTypeEnum = 255
)

// All allowed values of MerkleTreeNodeTypeEnum enum
var AllowedMerkleTreeNodeTypeEnumEnumValues = []MerkleTreeNodeTypeEnum{
	0,
	255,
}

func (v *MerkleTreeNodeTypeEnum) UnmarshalJSON(src []byte) error {
	var value int32
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := MerkleTreeNodeTypeEnum(value)
	for _, existing := range AllowedMerkleTreeNodeTypeEnumEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid MerkleTreeNodeTypeEnum", value)
}

// NewMerkleTreeNodeTypeEnumFromValue returns a pointer to a valid MerkleTreeNodeTypeEnum
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewMerkleTreeNodeTypeEnumFromValue(v int32) (*MerkleTreeNodeTypeEnum, error) {
	ev := MerkleTreeNodeTypeEnum(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for MerkleTreeNodeTypeEnum: valid values are %v", v, AllowedMerkleTreeNodeTypeEnumEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v MerkleTreeNodeTypeEnum) IsValid() bool {
	for _, existing := range AllowedMerkleTreeNodeTypeEnumEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to MerkleTreeNodeTypeEnum value
func (v MerkleTreeNodeTypeEnum) Ptr() *MerkleTreeNodeTypeEnum {
	return &v
}

type NullableMerkleTreeNodeTypeEnum struct {
	value *MerkleTreeNodeTypeEnum
	isSet bool
}

func (v NullableMerkleTreeNodeTypeEnum) Get() *MerkleTreeNodeTypeEnum {
	return v.value
}

func (v *NullableMerkleTreeNodeTypeEnum) Set(val *MerkleTreeNodeTypeEnum) {
	v.value = val
	v.isSet = true
}

func (v NullableMerkleTreeNodeTypeEnum) IsSet() bool {
	return v.isSet
}

func (v *NullableMerkleTreeNodeTypeEnum) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMerkleTreeNodeTypeEnum(val *MerkleTreeNodeTypeEnum) *NullableMerkleTreeNodeTypeEnum {
	return &NullableMerkleTreeNodeTypeEnum{value: val, isSet: true}
}

func (v NullableMerkleTreeNodeTypeEnum) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMerkleTreeNodeTypeEnum) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

