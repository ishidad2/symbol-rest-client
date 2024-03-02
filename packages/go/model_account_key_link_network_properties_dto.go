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

// checks if the AccountKeyLinkNetworkPropertiesDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AccountKeyLinkNetworkPropertiesDTO{}

// AccountKeyLinkNetworkPropertiesDTO struct for AccountKeyLinkNetworkPropertiesDTO
type AccountKeyLinkNetworkPropertiesDTO struct {
	// to trigger plugin load
	Dummy *string `json:"dummy,omitempty"`
}

// NewAccountKeyLinkNetworkPropertiesDTO instantiates a new AccountKeyLinkNetworkPropertiesDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccountKeyLinkNetworkPropertiesDTO() *AccountKeyLinkNetworkPropertiesDTO {
	this := AccountKeyLinkNetworkPropertiesDTO{}
	return &this
}

// NewAccountKeyLinkNetworkPropertiesDTOWithDefaults instantiates a new AccountKeyLinkNetworkPropertiesDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountKeyLinkNetworkPropertiesDTOWithDefaults() *AccountKeyLinkNetworkPropertiesDTO {
	this := AccountKeyLinkNetworkPropertiesDTO{}
	return &this
}

// GetDummy returns the Dummy field value if set, zero value otherwise.
func (o *AccountKeyLinkNetworkPropertiesDTO) GetDummy() string {
	if o == nil || IsNil(o.Dummy) {
		var ret string
		return ret
	}
	return *o.Dummy
}

// GetDummyOk returns a tuple with the Dummy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountKeyLinkNetworkPropertiesDTO) GetDummyOk() (*string, bool) {
	if o == nil || IsNil(o.Dummy) {
		return nil, false
	}
	return o.Dummy, true
}

// HasDummy returns a boolean if a field has been set.
func (o *AccountKeyLinkNetworkPropertiesDTO) HasDummy() bool {
	if o != nil && !IsNil(o.Dummy) {
		return true
	}

	return false
}

// SetDummy gets a reference to the given string and assigns it to the Dummy field.
func (o *AccountKeyLinkNetworkPropertiesDTO) SetDummy(v string) {
	o.Dummy = &v
}

func (o AccountKeyLinkNetworkPropertiesDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AccountKeyLinkNetworkPropertiesDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Dummy) {
		toSerialize["dummy"] = o.Dummy
	}
	return toSerialize, nil
}

type NullableAccountKeyLinkNetworkPropertiesDTO struct {
	value *AccountKeyLinkNetworkPropertiesDTO
	isSet bool
}

func (v NullableAccountKeyLinkNetworkPropertiesDTO) Get() *AccountKeyLinkNetworkPropertiesDTO {
	return v.value
}

func (v *NullableAccountKeyLinkNetworkPropertiesDTO) Set(val *AccountKeyLinkNetworkPropertiesDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableAccountKeyLinkNetworkPropertiesDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableAccountKeyLinkNetworkPropertiesDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccountKeyLinkNetworkPropertiesDTO(val *AccountKeyLinkNetworkPropertiesDTO) *NullableAccountKeyLinkNetworkPropertiesDTO {
	return &NullableAccountKeyLinkNetworkPropertiesDTO{value: val, isSet: true}
}

func (v NullableAccountKeyLinkNetworkPropertiesDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccountKeyLinkNetworkPropertiesDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


