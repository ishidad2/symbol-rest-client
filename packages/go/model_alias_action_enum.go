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

// AliasActionEnum Alias action: * 0 - Unlink alias. * 1 - Link alias. 
type AliasActionEnum int32

// List of AliasActionEnum
const (
	_0 AliasActionEnum = 0
	_1 AliasActionEnum = 1
)

// All allowed values of AliasActionEnum enum
var AllowedAliasActionEnumEnumValues = []AliasActionEnum{
	0,
	1,
}

func (v *AliasActionEnum) UnmarshalJSON(src []byte) error {
	var value int32
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AliasActionEnum(value)
	for _, existing := range AllowedAliasActionEnumEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AliasActionEnum", value)
}

// NewAliasActionEnumFromValue returns a pointer to a valid AliasActionEnum
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAliasActionEnumFromValue(v int32) (*AliasActionEnum, error) {
	ev := AliasActionEnum(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AliasActionEnum: valid values are %v", v, AllowedAliasActionEnumEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AliasActionEnum) IsValid() bool {
	for _, existing := range AllowedAliasActionEnumEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AliasActionEnum value
func (v AliasActionEnum) Ptr() *AliasActionEnum {
	return &v
}

type NullableAliasActionEnum struct {
	value *AliasActionEnum
	isSet bool
}

func (v NullableAliasActionEnum) Get() *AliasActionEnum {
	return v.value
}

func (v *NullableAliasActionEnum) Set(val *AliasActionEnum) {
	v.value = val
	v.isSet = true
}

func (v NullableAliasActionEnum) IsSet() bool {
	return v.isSet
}

func (v *NullableAliasActionEnum) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAliasActionEnum(val *AliasActionEnum) *NullableAliasActionEnum {
	return &NullableAliasActionEnum{value: val, isSet: true}
}

func (v NullableAliasActionEnum) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAliasActionEnum) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

