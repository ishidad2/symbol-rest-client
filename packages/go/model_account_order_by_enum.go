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

// AccountOrderByEnum the model 'AccountOrderByEnum'
type AccountOrderByEnum string

// List of AccountOrderByEnum
const (
	ID AccountOrderByEnum = "id"
	BALANCE AccountOrderByEnum = "balance"
)

// All allowed values of AccountOrderByEnum enum
var AllowedAccountOrderByEnumEnumValues = []AccountOrderByEnum{
	"id",
	"balance",
}

func (v *AccountOrderByEnum) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AccountOrderByEnum(value)
	for _, existing := range AllowedAccountOrderByEnumEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AccountOrderByEnum", value)
}

// NewAccountOrderByEnumFromValue returns a pointer to a valid AccountOrderByEnum
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAccountOrderByEnumFromValue(v string) (*AccountOrderByEnum, error) {
	ev := AccountOrderByEnum(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AccountOrderByEnum: valid values are %v", v, AllowedAccountOrderByEnumEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AccountOrderByEnum) IsValid() bool {
	for _, existing := range AllowedAccountOrderByEnumEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AccountOrderByEnum value
func (v AccountOrderByEnum) Ptr() *AccountOrderByEnum {
	return &v
}

type NullableAccountOrderByEnum struct {
	value *AccountOrderByEnum
	isSet bool
}

func (v NullableAccountOrderByEnum) Get() *AccountOrderByEnum {
	return v.value
}

func (v *NullableAccountOrderByEnum) Set(val *AccountOrderByEnum) {
	v.value = val
	v.isSet = true
}

func (v NullableAccountOrderByEnum) IsSet() bool {
	return v.isSet
}

func (v *NullableAccountOrderByEnum) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccountOrderByEnum(val *AccountOrderByEnum) *NullableAccountOrderByEnum {
	return &NullableAccountOrderByEnum{value: val, isSet: true}
}

func (v NullableAccountOrderByEnum) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccountOrderByEnum) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

