/*
Catapult REST Endpoints

OpenAPI Specification of catapult-rest

API version: 1.0.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi_client

import (
	"encoding/json"
)

// checks if the TransactionIds type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TransactionIds{}

// TransactionIds struct for TransactionIds
type TransactionIds struct {
	// Array of transaction identifiers.
	TransactionIds []string `json:"transactionIds,omitempty"`
}

// NewTransactionIds instantiates a new TransactionIds object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTransactionIds() *TransactionIds {
	this := TransactionIds{}
	return &this
}

// NewTransactionIdsWithDefaults instantiates a new TransactionIds object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTransactionIdsWithDefaults() *TransactionIds {
	this := TransactionIds{}
	return &this
}

// GetTransactionIds returns the TransactionIds field value if set, zero value otherwise.
func (o *TransactionIds) GetTransactionIds() []string {
	if o == nil || IsNil(o.TransactionIds) {
		var ret []string
		return ret
	}
	return o.TransactionIds
}

// GetTransactionIdsOk returns a tuple with the TransactionIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TransactionIds) GetTransactionIdsOk() ([]string, bool) {
	if o == nil || IsNil(o.TransactionIds) {
		return nil, false
	}
	return o.TransactionIds, true
}

// HasTransactionIds returns a boolean if a field has been set.
func (o *TransactionIds) HasTransactionIds() bool {
	if o != nil && !IsNil(o.TransactionIds) {
		return true
	}

	return false
}

// SetTransactionIds gets a reference to the given []string and assigns it to the TransactionIds field.
func (o *TransactionIds) SetTransactionIds(v []string) {
	o.TransactionIds = v
}

func (o TransactionIds) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TransactionIds) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.TransactionIds) {
		toSerialize["transactionIds"] = o.TransactionIds
	}
	return toSerialize, nil
}

type NullableTransactionIds struct {
	value *TransactionIds
	isSet bool
}

func (v NullableTransactionIds) Get() *TransactionIds {
	return v.value
}

func (v *NullableTransactionIds) Set(val *TransactionIds) {
	v.value = val
	v.isSet = true
}

func (v NullableTransactionIds) IsSet() bool {
	return v.isSet
}

func (v *NullableTransactionIds) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTransactionIds(val *TransactionIds) *NullableTransactionIds {
	return &NullableTransactionIds{value: val, isSet: true}
}

func (v NullableTransactionIds) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTransactionIds) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


