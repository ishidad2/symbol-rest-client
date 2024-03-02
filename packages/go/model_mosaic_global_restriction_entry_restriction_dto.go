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

// checks if the MosaicGlobalRestrictionEntryRestrictionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MosaicGlobalRestrictionEntryRestrictionDTO{}

// MosaicGlobalRestrictionEntryRestrictionDTO struct for MosaicGlobalRestrictionEntryRestrictionDTO
type MosaicGlobalRestrictionEntryRestrictionDTO struct {
	// Mosaic identifier.
	ReferenceMosaicId string `json:"referenceMosaicId"`
	// Restriction value.
	RestrictionValue string `json:"restrictionValue"`
	RestrictionType MosaicRestrictionTypeEnum `json:"restrictionType"`
}

type _MosaicGlobalRestrictionEntryRestrictionDTO MosaicGlobalRestrictionEntryRestrictionDTO

// NewMosaicGlobalRestrictionEntryRestrictionDTO instantiates a new MosaicGlobalRestrictionEntryRestrictionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMosaicGlobalRestrictionEntryRestrictionDTO(referenceMosaicId string, restrictionValue string, restrictionType MosaicRestrictionTypeEnum) *MosaicGlobalRestrictionEntryRestrictionDTO {
	this := MosaicGlobalRestrictionEntryRestrictionDTO{}
	this.ReferenceMosaicId = referenceMosaicId
	this.RestrictionValue = restrictionValue
	this.RestrictionType = restrictionType
	return &this
}

// NewMosaicGlobalRestrictionEntryRestrictionDTOWithDefaults instantiates a new MosaicGlobalRestrictionEntryRestrictionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMosaicGlobalRestrictionEntryRestrictionDTOWithDefaults() *MosaicGlobalRestrictionEntryRestrictionDTO {
	this := MosaicGlobalRestrictionEntryRestrictionDTO{}
	return &this
}

// GetReferenceMosaicId returns the ReferenceMosaicId field value
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) GetReferenceMosaicId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ReferenceMosaicId
}

// GetReferenceMosaicIdOk returns a tuple with the ReferenceMosaicId field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) GetReferenceMosaicIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ReferenceMosaicId, true
}

// SetReferenceMosaicId sets field value
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) SetReferenceMosaicId(v string) {
	o.ReferenceMosaicId = v
}

// GetRestrictionValue returns the RestrictionValue field value
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) GetRestrictionValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RestrictionValue
}

// GetRestrictionValueOk returns a tuple with the RestrictionValue field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) GetRestrictionValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RestrictionValue, true
}

// SetRestrictionValue sets field value
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) SetRestrictionValue(v string) {
	o.RestrictionValue = v
}

// GetRestrictionType returns the RestrictionType field value
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) GetRestrictionType() MosaicRestrictionTypeEnum {
	if o == nil {
		var ret MosaicRestrictionTypeEnum
		return ret
	}

	return o.RestrictionType
}

// GetRestrictionTypeOk returns a tuple with the RestrictionType field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) GetRestrictionTypeOk() (*MosaicRestrictionTypeEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RestrictionType, true
}

// SetRestrictionType sets field value
func (o *MosaicGlobalRestrictionEntryRestrictionDTO) SetRestrictionType(v MosaicRestrictionTypeEnum) {
	o.RestrictionType = v
}

func (o MosaicGlobalRestrictionEntryRestrictionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MosaicGlobalRestrictionEntryRestrictionDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["referenceMosaicId"] = o.ReferenceMosaicId
	toSerialize["restrictionValue"] = o.RestrictionValue
	toSerialize["restrictionType"] = o.RestrictionType
	return toSerialize, nil
}

func (o *MosaicGlobalRestrictionEntryRestrictionDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"referenceMosaicId",
		"restrictionValue",
		"restrictionType",
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

	varMosaicGlobalRestrictionEntryRestrictionDTO := _MosaicGlobalRestrictionEntryRestrictionDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMosaicGlobalRestrictionEntryRestrictionDTO)

	if err != nil {
		return err
	}

	*o = MosaicGlobalRestrictionEntryRestrictionDTO(varMosaicGlobalRestrictionEntryRestrictionDTO)

	return err
}

type NullableMosaicGlobalRestrictionEntryRestrictionDTO struct {
	value *MosaicGlobalRestrictionEntryRestrictionDTO
	isSet bool
}

func (v NullableMosaicGlobalRestrictionEntryRestrictionDTO) Get() *MosaicGlobalRestrictionEntryRestrictionDTO {
	return v.value
}

func (v *NullableMosaicGlobalRestrictionEntryRestrictionDTO) Set(val *MosaicGlobalRestrictionEntryRestrictionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableMosaicGlobalRestrictionEntryRestrictionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableMosaicGlobalRestrictionEntryRestrictionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMosaicGlobalRestrictionEntryRestrictionDTO(val *MosaicGlobalRestrictionEntryRestrictionDTO) *NullableMosaicGlobalRestrictionEntryRestrictionDTO {
	return &NullableMosaicGlobalRestrictionEntryRestrictionDTO{value: val, isSet: true}
}

func (v NullableMosaicGlobalRestrictionEntryRestrictionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMosaicGlobalRestrictionEntryRestrictionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


