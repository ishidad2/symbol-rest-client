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

// checks if the NodeTimeDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &NodeTimeDTO{}

// NodeTimeDTO struct for NodeTimeDTO
type NodeTimeDTO struct {
	CommunicationTimestamps CommunicationTimestampsDTO `json:"communicationTimestamps"`
}

type _NodeTimeDTO NodeTimeDTO

// NewNodeTimeDTO instantiates a new NodeTimeDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNodeTimeDTO(communicationTimestamps CommunicationTimestampsDTO) *NodeTimeDTO {
	this := NodeTimeDTO{}
	this.CommunicationTimestamps = communicationTimestamps
	return &this
}

// NewNodeTimeDTOWithDefaults instantiates a new NodeTimeDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNodeTimeDTOWithDefaults() *NodeTimeDTO {
	this := NodeTimeDTO{}
	return &this
}

// GetCommunicationTimestamps returns the CommunicationTimestamps field value
func (o *NodeTimeDTO) GetCommunicationTimestamps() CommunicationTimestampsDTO {
	if o == nil {
		var ret CommunicationTimestampsDTO
		return ret
	}

	return o.CommunicationTimestamps
}

// GetCommunicationTimestampsOk returns a tuple with the CommunicationTimestamps field value
// and a boolean to check if the value has been set.
func (o *NodeTimeDTO) GetCommunicationTimestampsOk() (*CommunicationTimestampsDTO, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CommunicationTimestamps, true
}

// SetCommunicationTimestamps sets field value
func (o *NodeTimeDTO) SetCommunicationTimestamps(v CommunicationTimestampsDTO) {
	o.CommunicationTimestamps = v
}

func (o NodeTimeDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o NodeTimeDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["communicationTimestamps"] = o.CommunicationTimestamps
	return toSerialize, nil
}

func (o *NodeTimeDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"communicationTimestamps",
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

	varNodeTimeDTO := _NodeTimeDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNodeTimeDTO)

	if err != nil {
		return err
	}

	*o = NodeTimeDTO(varNodeTimeDTO)

	return err
}

type NullableNodeTimeDTO struct {
	value *NodeTimeDTO
	isSet bool
}

func (v NullableNodeTimeDTO) Get() *NodeTimeDTO {
	return v.value
}

func (v *NullableNodeTimeDTO) Set(val *NodeTimeDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableNodeTimeDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableNodeTimeDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNodeTimeDTO(val *NodeTimeDTO) *NullableNodeTimeDTO {
	return &NullableNodeTimeDTO{value: val, isSet: true}
}

func (v NullableNodeTimeDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNodeTimeDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


