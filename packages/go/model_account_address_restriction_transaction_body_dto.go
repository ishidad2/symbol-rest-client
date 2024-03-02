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

// checks if the AccountAddressRestrictionTransactionBodyDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AccountAddressRestrictionTransactionBodyDTO{}

// AccountAddressRestrictionTransactionBodyDTO struct for AccountAddressRestrictionTransactionBodyDTO
type AccountAddressRestrictionTransactionBodyDTO struct {
	RestrictionFlags AccountRestrictionFlagsEnum `json:"restrictionFlags"`
	// Account restriction additions.
	RestrictionAdditions []string `json:"restrictionAdditions"`
	// Account restriction deletions.
	RestrictionDeletions []string `json:"restrictionDeletions"`
}

type _AccountAddressRestrictionTransactionBodyDTO AccountAddressRestrictionTransactionBodyDTO

// NewAccountAddressRestrictionTransactionBodyDTO instantiates a new AccountAddressRestrictionTransactionBodyDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccountAddressRestrictionTransactionBodyDTO(restrictionFlags AccountRestrictionFlagsEnum, restrictionAdditions []string, restrictionDeletions []string) *AccountAddressRestrictionTransactionBodyDTO {
	this := AccountAddressRestrictionTransactionBodyDTO{}
	this.RestrictionFlags = restrictionFlags
	this.RestrictionAdditions = restrictionAdditions
	this.RestrictionDeletions = restrictionDeletions
	return &this
}

// NewAccountAddressRestrictionTransactionBodyDTOWithDefaults instantiates a new AccountAddressRestrictionTransactionBodyDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountAddressRestrictionTransactionBodyDTOWithDefaults() *AccountAddressRestrictionTransactionBodyDTO {
	this := AccountAddressRestrictionTransactionBodyDTO{}
	return &this
}

// GetRestrictionFlags returns the RestrictionFlags field value
func (o *AccountAddressRestrictionTransactionBodyDTO) GetRestrictionFlags() AccountRestrictionFlagsEnum {
	if o == nil {
		var ret AccountRestrictionFlagsEnum
		return ret
	}

	return o.RestrictionFlags
}

// GetRestrictionFlagsOk returns a tuple with the RestrictionFlags field value
// and a boolean to check if the value has been set.
func (o *AccountAddressRestrictionTransactionBodyDTO) GetRestrictionFlagsOk() (*AccountRestrictionFlagsEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RestrictionFlags, true
}

// SetRestrictionFlags sets field value
func (o *AccountAddressRestrictionTransactionBodyDTO) SetRestrictionFlags(v AccountRestrictionFlagsEnum) {
	o.RestrictionFlags = v
}

// GetRestrictionAdditions returns the RestrictionAdditions field value
func (o *AccountAddressRestrictionTransactionBodyDTO) GetRestrictionAdditions() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.RestrictionAdditions
}

// GetRestrictionAdditionsOk returns a tuple with the RestrictionAdditions field value
// and a boolean to check if the value has been set.
func (o *AccountAddressRestrictionTransactionBodyDTO) GetRestrictionAdditionsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.RestrictionAdditions, true
}

// SetRestrictionAdditions sets field value
func (o *AccountAddressRestrictionTransactionBodyDTO) SetRestrictionAdditions(v []string) {
	o.RestrictionAdditions = v
}

// GetRestrictionDeletions returns the RestrictionDeletions field value
func (o *AccountAddressRestrictionTransactionBodyDTO) GetRestrictionDeletions() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.RestrictionDeletions
}

// GetRestrictionDeletionsOk returns a tuple with the RestrictionDeletions field value
// and a boolean to check if the value has been set.
func (o *AccountAddressRestrictionTransactionBodyDTO) GetRestrictionDeletionsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.RestrictionDeletions, true
}

// SetRestrictionDeletions sets field value
func (o *AccountAddressRestrictionTransactionBodyDTO) SetRestrictionDeletions(v []string) {
	o.RestrictionDeletions = v
}

func (o AccountAddressRestrictionTransactionBodyDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AccountAddressRestrictionTransactionBodyDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["restrictionFlags"] = o.RestrictionFlags
	toSerialize["restrictionAdditions"] = o.RestrictionAdditions
	toSerialize["restrictionDeletions"] = o.RestrictionDeletions
	return toSerialize, nil
}

func (o *AccountAddressRestrictionTransactionBodyDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"restrictionFlags",
		"restrictionAdditions",
		"restrictionDeletions",
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

	varAccountAddressRestrictionTransactionBodyDTO := _AccountAddressRestrictionTransactionBodyDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAccountAddressRestrictionTransactionBodyDTO)

	if err != nil {
		return err
	}

	*o = AccountAddressRestrictionTransactionBodyDTO(varAccountAddressRestrictionTransactionBodyDTO)

	return err
}

type NullableAccountAddressRestrictionTransactionBodyDTO struct {
	value *AccountAddressRestrictionTransactionBodyDTO
	isSet bool
}

func (v NullableAccountAddressRestrictionTransactionBodyDTO) Get() *AccountAddressRestrictionTransactionBodyDTO {
	return v.value
}

func (v *NullableAccountAddressRestrictionTransactionBodyDTO) Set(val *AccountAddressRestrictionTransactionBodyDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableAccountAddressRestrictionTransactionBodyDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableAccountAddressRestrictionTransactionBodyDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccountAddressRestrictionTransactionBodyDTO(val *AccountAddressRestrictionTransactionBodyDTO) *NullableAccountAddressRestrictionTransactionBodyDTO {
	return &NullableAccountAddressRestrictionTransactionBodyDTO{value: val, isSet: true}
}

func (v NullableAccountAddressRestrictionTransactionBodyDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccountAddressRestrictionTransactionBodyDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


