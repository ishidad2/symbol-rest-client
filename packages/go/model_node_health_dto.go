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

// checks if the NodeHealthDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &NodeHealthDTO{}

// NodeHealthDTO struct for NodeHealthDTO
type NodeHealthDTO struct {
	ApiNode NodeStatusEnum `json:"apiNode"`
	Db NodeStatusEnum `json:"db"`
}

type _NodeHealthDTO NodeHealthDTO

// NewNodeHealthDTO instantiates a new NodeHealthDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNodeHealthDTO(apiNode NodeStatusEnum, db NodeStatusEnum) *NodeHealthDTO {
	this := NodeHealthDTO{}
	this.ApiNode = apiNode
	this.Db = db
	return &this
}

// NewNodeHealthDTOWithDefaults instantiates a new NodeHealthDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNodeHealthDTOWithDefaults() *NodeHealthDTO {
	this := NodeHealthDTO{}
	return &this
}

// GetApiNode returns the ApiNode field value
func (o *NodeHealthDTO) GetApiNode() NodeStatusEnum {
	if o == nil {
		var ret NodeStatusEnum
		return ret
	}

	return o.ApiNode
}

// GetApiNodeOk returns a tuple with the ApiNode field value
// and a boolean to check if the value has been set.
func (o *NodeHealthDTO) GetApiNodeOk() (*NodeStatusEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ApiNode, true
}

// SetApiNode sets field value
func (o *NodeHealthDTO) SetApiNode(v NodeStatusEnum) {
	o.ApiNode = v
}

// GetDb returns the Db field value
func (o *NodeHealthDTO) GetDb() NodeStatusEnum {
	if o == nil {
		var ret NodeStatusEnum
		return ret
	}

	return o.Db
}

// GetDbOk returns a tuple with the Db field value
// and a boolean to check if the value has been set.
func (o *NodeHealthDTO) GetDbOk() (*NodeStatusEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Db, true
}

// SetDb sets field value
func (o *NodeHealthDTO) SetDb(v NodeStatusEnum) {
	o.Db = v
}

func (o NodeHealthDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o NodeHealthDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["apiNode"] = o.ApiNode
	toSerialize["db"] = o.Db
	return toSerialize, nil
}

func (o *NodeHealthDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"apiNode",
		"db",
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

	varNodeHealthDTO := _NodeHealthDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNodeHealthDTO)

	if err != nil {
		return err
	}

	*o = NodeHealthDTO(varNodeHealthDTO)

	return err
}

type NullableNodeHealthDTO struct {
	value *NodeHealthDTO
	isSet bool
}

func (v NullableNodeHealthDTO) Get() *NodeHealthDTO {
	return v.value
}

func (v *NullableNodeHealthDTO) Set(val *NodeHealthDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableNodeHealthDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableNodeHealthDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNodeHealthDTO(val *NodeHealthDTO) *NullableNodeHealthDTO {
	return &NullableNodeHealthDTO{value: val, isSet: true}
}

func (v NullableNodeHealthDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNodeHealthDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


