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

// checks if the RentalFeesDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RentalFeesDTO{}

// RentalFeesDTO struct for RentalFeesDTO
type RentalFeesDTO struct {
	// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
	EffectiveRootNamespaceRentalFeePerBlock string `json:"effectiveRootNamespaceRentalFeePerBlock"`
	// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
	EffectiveChildNamespaceRentalFee string `json:"effectiveChildNamespaceRentalFee"`
	// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
	EffectiveMosaicRentalFee string `json:"effectiveMosaicRentalFee"`
}

type _RentalFeesDTO RentalFeesDTO

// NewRentalFeesDTO instantiates a new RentalFeesDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRentalFeesDTO(effectiveRootNamespaceRentalFeePerBlock string, effectiveChildNamespaceRentalFee string, effectiveMosaicRentalFee string) *RentalFeesDTO {
	this := RentalFeesDTO{}
	this.EffectiveRootNamespaceRentalFeePerBlock = effectiveRootNamespaceRentalFeePerBlock
	this.EffectiveChildNamespaceRentalFee = effectiveChildNamespaceRentalFee
	this.EffectiveMosaicRentalFee = effectiveMosaicRentalFee
	return &this
}

// NewRentalFeesDTOWithDefaults instantiates a new RentalFeesDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRentalFeesDTOWithDefaults() *RentalFeesDTO {
	this := RentalFeesDTO{}
	return &this
}

// GetEffectiveRootNamespaceRentalFeePerBlock returns the EffectiveRootNamespaceRentalFeePerBlock field value
func (o *RentalFeesDTO) GetEffectiveRootNamespaceRentalFeePerBlock() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EffectiveRootNamespaceRentalFeePerBlock
}

// GetEffectiveRootNamespaceRentalFeePerBlockOk returns a tuple with the EffectiveRootNamespaceRentalFeePerBlock field value
// and a boolean to check if the value has been set.
func (o *RentalFeesDTO) GetEffectiveRootNamespaceRentalFeePerBlockOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EffectiveRootNamespaceRentalFeePerBlock, true
}

// SetEffectiveRootNamespaceRentalFeePerBlock sets field value
func (o *RentalFeesDTO) SetEffectiveRootNamespaceRentalFeePerBlock(v string) {
	o.EffectiveRootNamespaceRentalFeePerBlock = v
}

// GetEffectiveChildNamespaceRentalFee returns the EffectiveChildNamespaceRentalFee field value
func (o *RentalFeesDTO) GetEffectiveChildNamespaceRentalFee() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EffectiveChildNamespaceRentalFee
}

// GetEffectiveChildNamespaceRentalFeeOk returns a tuple with the EffectiveChildNamespaceRentalFee field value
// and a boolean to check if the value has been set.
func (o *RentalFeesDTO) GetEffectiveChildNamespaceRentalFeeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EffectiveChildNamespaceRentalFee, true
}

// SetEffectiveChildNamespaceRentalFee sets field value
func (o *RentalFeesDTO) SetEffectiveChildNamespaceRentalFee(v string) {
	o.EffectiveChildNamespaceRentalFee = v
}

// GetEffectiveMosaicRentalFee returns the EffectiveMosaicRentalFee field value
func (o *RentalFeesDTO) GetEffectiveMosaicRentalFee() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EffectiveMosaicRentalFee
}

// GetEffectiveMosaicRentalFeeOk returns a tuple with the EffectiveMosaicRentalFee field value
// and a boolean to check if the value has been set.
func (o *RentalFeesDTO) GetEffectiveMosaicRentalFeeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EffectiveMosaicRentalFee, true
}

// SetEffectiveMosaicRentalFee sets field value
func (o *RentalFeesDTO) SetEffectiveMosaicRentalFee(v string) {
	o.EffectiveMosaicRentalFee = v
}

func (o RentalFeesDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RentalFeesDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["effectiveRootNamespaceRentalFeePerBlock"] = o.EffectiveRootNamespaceRentalFeePerBlock
	toSerialize["effectiveChildNamespaceRentalFee"] = o.EffectiveChildNamespaceRentalFee
	toSerialize["effectiveMosaicRentalFee"] = o.EffectiveMosaicRentalFee
	return toSerialize, nil
}

func (o *RentalFeesDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"effectiveRootNamespaceRentalFeePerBlock",
		"effectiveChildNamespaceRentalFee",
		"effectiveMosaicRentalFee",
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

	varRentalFeesDTO := _RentalFeesDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varRentalFeesDTO)

	if err != nil {
		return err
	}

	*o = RentalFeesDTO(varRentalFeesDTO)

	return err
}

type NullableRentalFeesDTO struct {
	value *RentalFeesDTO
	isSet bool
}

func (v NullableRentalFeesDTO) Get() *RentalFeesDTO {
	return v.value
}

func (v *NullableRentalFeesDTO) Set(val *RentalFeesDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableRentalFeesDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableRentalFeesDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRentalFeesDTO(val *RentalFeesDTO) *NullableRentalFeesDTO {
	return &NullableRentalFeesDTO{value: val, isSet: true}
}

func (v NullableRentalFeesDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRentalFeesDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


