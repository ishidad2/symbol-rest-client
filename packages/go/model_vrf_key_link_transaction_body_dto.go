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

// checks if the VrfKeyLinkTransactionBodyDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &VrfKeyLinkTransactionBodyDTO{}

// VrfKeyLinkTransactionBodyDTO struct for VrfKeyLinkTransactionBodyDTO
type VrfKeyLinkTransactionBodyDTO struct {
	// Public key.
	LinkedPublicKey string `json:"linkedPublicKey"`
	LinkAction LinkActionEnum `json:"linkAction"`
}

type _VrfKeyLinkTransactionBodyDTO VrfKeyLinkTransactionBodyDTO

// NewVrfKeyLinkTransactionBodyDTO instantiates a new VrfKeyLinkTransactionBodyDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVrfKeyLinkTransactionBodyDTO(linkedPublicKey string, linkAction LinkActionEnum) *VrfKeyLinkTransactionBodyDTO {
	this := VrfKeyLinkTransactionBodyDTO{}
	this.LinkedPublicKey = linkedPublicKey
	this.LinkAction = linkAction
	return &this
}

// NewVrfKeyLinkTransactionBodyDTOWithDefaults instantiates a new VrfKeyLinkTransactionBodyDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVrfKeyLinkTransactionBodyDTOWithDefaults() *VrfKeyLinkTransactionBodyDTO {
	this := VrfKeyLinkTransactionBodyDTO{}
	return &this
}

// GetLinkedPublicKey returns the LinkedPublicKey field value
func (o *VrfKeyLinkTransactionBodyDTO) GetLinkedPublicKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LinkedPublicKey
}

// GetLinkedPublicKeyOk returns a tuple with the LinkedPublicKey field value
// and a boolean to check if the value has been set.
func (o *VrfKeyLinkTransactionBodyDTO) GetLinkedPublicKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LinkedPublicKey, true
}

// SetLinkedPublicKey sets field value
func (o *VrfKeyLinkTransactionBodyDTO) SetLinkedPublicKey(v string) {
	o.LinkedPublicKey = v
}

// GetLinkAction returns the LinkAction field value
func (o *VrfKeyLinkTransactionBodyDTO) GetLinkAction() LinkActionEnum {
	if o == nil {
		var ret LinkActionEnum
		return ret
	}

	return o.LinkAction
}

// GetLinkActionOk returns a tuple with the LinkAction field value
// and a boolean to check if the value has been set.
func (o *VrfKeyLinkTransactionBodyDTO) GetLinkActionOk() (*LinkActionEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LinkAction, true
}

// SetLinkAction sets field value
func (o *VrfKeyLinkTransactionBodyDTO) SetLinkAction(v LinkActionEnum) {
	o.LinkAction = v
}

func (o VrfKeyLinkTransactionBodyDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o VrfKeyLinkTransactionBodyDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["linkedPublicKey"] = o.LinkedPublicKey
	toSerialize["linkAction"] = o.LinkAction
	return toSerialize, nil
}

func (o *VrfKeyLinkTransactionBodyDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"linkedPublicKey",
		"linkAction",
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

	varVrfKeyLinkTransactionBodyDTO := _VrfKeyLinkTransactionBodyDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varVrfKeyLinkTransactionBodyDTO)

	if err != nil {
		return err
	}

	*o = VrfKeyLinkTransactionBodyDTO(varVrfKeyLinkTransactionBodyDTO)

	return err
}

type NullableVrfKeyLinkTransactionBodyDTO struct {
	value *VrfKeyLinkTransactionBodyDTO
	isSet bool
}

func (v NullableVrfKeyLinkTransactionBodyDTO) Get() *VrfKeyLinkTransactionBodyDTO {
	return v.value
}

func (v *NullableVrfKeyLinkTransactionBodyDTO) Set(val *VrfKeyLinkTransactionBodyDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableVrfKeyLinkTransactionBodyDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableVrfKeyLinkTransactionBodyDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVrfKeyLinkTransactionBodyDTO(val *VrfKeyLinkTransactionBodyDTO) *NullableVrfKeyLinkTransactionBodyDTO {
	return &NullableVrfKeyLinkTransactionBodyDTO{value: val, isSet: true}
}

func (v NullableVrfKeyLinkTransactionBodyDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVrfKeyLinkTransactionBodyDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


