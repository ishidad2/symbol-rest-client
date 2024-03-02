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

// TransactionGroupEnum A transaction could be classified in the following groups: * Unconfirmed: The transaction reached the P2P network. At this point, it is not guaranteed that the transaction will be included in a block. * Confirmed: The transaction is included in a block. * Partial: The transaction requires to be cosigned by other transaction participants in order to be included in a block. * Failed: The transaction did not pass the network validation, and it was rejected. 
type TransactionGroupEnum string

// List of TransactionGroupEnum
const (
	UNCONFIRMED TransactionGroupEnum = "unconfirmed"
	CONFIRMED TransactionGroupEnum = "confirmed"
	FAILED TransactionGroupEnum = "failed"
	PARTIAL TransactionGroupEnum = "partial"
)

// All allowed values of TransactionGroupEnum enum
var AllowedTransactionGroupEnumEnumValues = []TransactionGroupEnum{
	"unconfirmed",
	"confirmed",
	"failed",
	"partial",
}

func (v *TransactionGroupEnum) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := TransactionGroupEnum(value)
	for _, existing := range AllowedTransactionGroupEnumEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid TransactionGroupEnum", value)
}

// NewTransactionGroupEnumFromValue returns a pointer to a valid TransactionGroupEnum
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewTransactionGroupEnumFromValue(v string) (*TransactionGroupEnum, error) {
	ev := TransactionGroupEnum(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for TransactionGroupEnum: valid values are %v", v, AllowedTransactionGroupEnumEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v TransactionGroupEnum) IsValid() bool {
	for _, existing := range AllowedTransactionGroupEnumEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to TransactionGroupEnum value
func (v TransactionGroupEnum) Ptr() *TransactionGroupEnum {
	return &v
}

type NullableTransactionGroupEnum struct {
	value *TransactionGroupEnum
	isSet bool
}

func (v NullableTransactionGroupEnum) Get() *TransactionGroupEnum {
	return v.value
}

func (v *NullableTransactionGroupEnum) Set(val *TransactionGroupEnum) {
	v.value = val
	v.isSet = true
}

func (v NullableTransactionGroupEnum) IsSet() bool {
	return v.isSet
}

func (v *NullableTransactionGroupEnum) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTransactionGroupEnum(val *TransactionGroupEnum) *NullableTransactionGroupEnum {
	return &NullableTransactionGroupEnum{value: val, isSet: true}
}

func (v NullableTransactionGroupEnum) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTransactionGroupEnum) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

