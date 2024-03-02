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

// checks if the MultisigDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MultisigDTO{}

// MultisigDTO struct for MultisigDTO
type MultisigDTO struct {
	// The version of the state
	Version int32 `json:"version"`
	// Address encoded using a 32-character set.
	AccountAddress string `json:"accountAddress"`
	// A number that allows uint 32 values.
	MinApproval int64 `json:"minApproval"`
	// A number that allows uint 32 values.
	MinRemoval int64 `json:"minRemoval"`
	// Addresses of the cosignatory accounts.
	CosignatoryAddresses []string `json:"cosignatoryAddresses"`
	// Multisig accounts where the account is cosignatory.
	MultisigAddresses []string `json:"multisigAddresses"`
}

type _MultisigDTO MultisigDTO

// NewMultisigDTO instantiates a new MultisigDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMultisigDTO(version int32, accountAddress string, minApproval int64, minRemoval int64, cosignatoryAddresses []string, multisigAddresses []string) *MultisigDTO {
	this := MultisigDTO{}
	this.Version = version
	this.AccountAddress = accountAddress
	this.MinApproval = minApproval
	this.MinRemoval = minRemoval
	this.CosignatoryAddresses = cosignatoryAddresses
	this.MultisigAddresses = multisigAddresses
	return &this
}

// NewMultisigDTOWithDefaults instantiates a new MultisigDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMultisigDTOWithDefaults() *MultisigDTO {
	this := MultisigDTO{}
	return &this
}

// GetVersion returns the Version field value
func (o *MultisigDTO) GetVersion() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *MultisigDTO) GetVersionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *MultisigDTO) SetVersion(v int32) {
	o.Version = v
}

// GetAccountAddress returns the AccountAddress field value
func (o *MultisigDTO) GetAccountAddress() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AccountAddress
}

// GetAccountAddressOk returns a tuple with the AccountAddress field value
// and a boolean to check if the value has been set.
func (o *MultisigDTO) GetAccountAddressOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AccountAddress, true
}

// SetAccountAddress sets field value
func (o *MultisigDTO) SetAccountAddress(v string) {
	o.AccountAddress = v
}

// GetMinApproval returns the MinApproval field value
func (o *MultisigDTO) GetMinApproval() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.MinApproval
}

// GetMinApprovalOk returns a tuple with the MinApproval field value
// and a boolean to check if the value has been set.
func (o *MultisigDTO) GetMinApprovalOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MinApproval, true
}

// SetMinApproval sets field value
func (o *MultisigDTO) SetMinApproval(v int64) {
	o.MinApproval = v
}

// GetMinRemoval returns the MinRemoval field value
func (o *MultisigDTO) GetMinRemoval() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.MinRemoval
}

// GetMinRemovalOk returns a tuple with the MinRemoval field value
// and a boolean to check if the value has been set.
func (o *MultisigDTO) GetMinRemovalOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MinRemoval, true
}

// SetMinRemoval sets field value
func (o *MultisigDTO) SetMinRemoval(v int64) {
	o.MinRemoval = v
}

// GetCosignatoryAddresses returns the CosignatoryAddresses field value
func (o *MultisigDTO) GetCosignatoryAddresses() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.CosignatoryAddresses
}

// GetCosignatoryAddressesOk returns a tuple with the CosignatoryAddresses field value
// and a boolean to check if the value has been set.
func (o *MultisigDTO) GetCosignatoryAddressesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CosignatoryAddresses, true
}

// SetCosignatoryAddresses sets field value
func (o *MultisigDTO) SetCosignatoryAddresses(v []string) {
	o.CosignatoryAddresses = v
}

// GetMultisigAddresses returns the MultisigAddresses field value
func (o *MultisigDTO) GetMultisigAddresses() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.MultisigAddresses
}

// GetMultisigAddressesOk returns a tuple with the MultisigAddresses field value
// and a boolean to check if the value has been set.
func (o *MultisigDTO) GetMultisigAddressesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.MultisigAddresses, true
}

// SetMultisigAddresses sets field value
func (o *MultisigDTO) SetMultisigAddresses(v []string) {
	o.MultisigAddresses = v
}

func (o MultisigDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MultisigDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["version"] = o.Version
	toSerialize["accountAddress"] = o.AccountAddress
	toSerialize["minApproval"] = o.MinApproval
	toSerialize["minRemoval"] = o.MinRemoval
	toSerialize["cosignatoryAddresses"] = o.CosignatoryAddresses
	toSerialize["multisigAddresses"] = o.MultisigAddresses
	return toSerialize, nil
}

func (o *MultisigDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"version",
		"accountAddress",
		"minApproval",
		"minRemoval",
		"cosignatoryAddresses",
		"multisigAddresses",
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

	varMultisigDTO := _MultisigDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMultisigDTO)

	if err != nil {
		return err
	}

	*o = MultisigDTO(varMultisigDTO)

	return err
}

type NullableMultisigDTO struct {
	value *MultisigDTO
	isSet bool
}

func (v NullableMultisigDTO) Get() *MultisigDTO {
	return v.value
}

func (v *NullableMultisigDTO) Set(val *MultisigDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableMultisigDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableMultisigDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMultisigDTO(val *MultisigDTO) *NullableMultisigDTO {
	return &NullableMultisigDTO{value: val, isSet: true}
}

func (v NullableMultisigDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMultisigDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


