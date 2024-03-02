/*
Catapult REST Endpoints

OpenAPI Specification of catapult-rest

API version: 1.0.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi_client

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the SecretLockPage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SecretLockPage{}

// SecretLockPage struct for SecretLockPage
type SecretLockPage struct {
	// Array of secret locks.
	Data []SecretLockInfoDTO `json:"data"`
	Pagination Pagination `json:"pagination"`
}

type _SecretLockPage SecretLockPage

// NewSecretLockPage instantiates a new SecretLockPage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSecretLockPage(data []SecretLockInfoDTO, pagination Pagination) *SecretLockPage {
	this := SecretLockPage{}
	this.Data = data
	this.Pagination = pagination
	return &this
}

// NewSecretLockPageWithDefaults instantiates a new SecretLockPage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSecretLockPageWithDefaults() *SecretLockPage {
	this := SecretLockPage{}
	return &this
}

// GetData returns the Data field value
func (o *SecretLockPage) GetData() []SecretLockInfoDTO {
	if o == nil {
		var ret []SecretLockInfoDTO
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *SecretLockPage) GetDataOk() ([]SecretLockInfoDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Data, true
}

// SetData sets field value
func (o *SecretLockPage) SetData(v []SecretLockInfoDTO) {
	o.Data = v
}

// GetPagination returns the Pagination field value
func (o *SecretLockPage) GetPagination() Pagination {
	if o == nil {
		var ret Pagination
		return ret
	}

	return o.Pagination
}

// GetPaginationOk returns a tuple with the Pagination field value
// and a boolean to check if the value has been set.
func (o *SecretLockPage) GetPaginationOk() (*Pagination, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pagination, true
}

// SetPagination sets field value
func (o *SecretLockPage) SetPagination(v Pagination) {
	o.Pagination = v
}

func (o SecretLockPage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SecretLockPage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["data"] = o.Data
	toSerialize["pagination"] = o.Pagination
	return toSerialize, nil
}

func (o *SecretLockPage) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"data",
		"pagination",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varSecretLockPage := _SecretLockPage{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varSecretLockPage)

	if err != nil {
		return err
	}

	*o = SecretLockPage(varSecretLockPage)

	return err
}

type NullableSecretLockPage struct {
	value *SecretLockPage
	isSet bool
}

func (v NullableSecretLockPage) Get() *SecretLockPage {
	return v.value
}

func (v *NullableSecretLockPage) Set(val *SecretLockPage) {
	v.value = val
	v.isSet = true
}

func (v NullableSecretLockPage) IsSet() bool {
	return v.isSet
}

func (v *NullableSecretLockPage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSecretLockPage(val *SecretLockPage) *NullableSecretLockPage {
	return &NullableSecretLockPage{value: val, isSet: true}
}

func (v NullableSecretLockPage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSecretLockPage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


