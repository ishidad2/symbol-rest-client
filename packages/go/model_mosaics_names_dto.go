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

// checks if the MosaicsNamesDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MosaicsNamesDTO{}

// MosaicsNamesDTO struct for MosaicsNamesDTO
type MosaicsNamesDTO struct {
	// Array of mosaic names.
	MosaicNames []MosaicNamesDTO `json:"mosaicNames"`
}

type _MosaicsNamesDTO MosaicsNamesDTO

// NewMosaicsNamesDTO instantiates a new MosaicsNamesDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMosaicsNamesDTO(mosaicNames []MosaicNamesDTO) *MosaicsNamesDTO {
	this := MosaicsNamesDTO{}
	this.MosaicNames = mosaicNames
	return &this
}

// NewMosaicsNamesDTOWithDefaults instantiates a new MosaicsNamesDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMosaicsNamesDTOWithDefaults() *MosaicsNamesDTO {
	this := MosaicsNamesDTO{}
	return &this
}

// GetMosaicNames returns the MosaicNames field value
func (o *MosaicsNamesDTO) GetMosaicNames() []MosaicNamesDTO {
	if o == nil {
		var ret []MosaicNamesDTO
		return ret
	}

	return o.MosaicNames
}

// GetMosaicNamesOk returns a tuple with the MosaicNames field value
// and a boolean to check if the value has been set.
func (o *MosaicsNamesDTO) GetMosaicNamesOk() ([]MosaicNamesDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.MosaicNames, true
}

// SetMosaicNames sets field value
func (o *MosaicsNamesDTO) SetMosaicNames(v []MosaicNamesDTO) {
	o.MosaicNames = v
}

func (o MosaicsNamesDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MosaicsNamesDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["mosaicNames"] = o.MosaicNames
	return toSerialize, nil
}

func (o *MosaicsNamesDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"mosaicNames",
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

	varMosaicsNamesDTO := _MosaicsNamesDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMosaicsNamesDTO)

	if err != nil {
		return err
	}

	*o = MosaicsNamesDTO(varMosaicsNamesDTO)

	return err
}

type NullableMosaicsNamesDTO struct {
	value *MosaicsNamesDTO
	isSet bool
}

func (v NullableMosaicsNamesDTO) Get() *MosaicsNamesDTO {
	return v.value
}

func (v *NullableMosaicsNamesDTO) Set(val *MosaicsNamesDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableMosaicsNamesDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableMosaicsNamesDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMosaicsNamesDTO(val *MosaicsNamesDTO) *NullableMosaicsNamesDTO {
	return &NullableMosaicsNamesDTO{value: val, isSet: true}
}

func (v NullableMosaicsNamesDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMosaicsNamesDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


