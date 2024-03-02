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

// checks if the EmbeddedMosaicAliasTransactionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &EmbeddedMosaicAliasTransactionDTO{}

// EmbeddedMosaicAliasTransactionDTO struct for EmbeddedMosaicAliasTransactionDTO
type EmbeddedMosaicAliasTransactionDTO struct {
	// Public key.
	SignerPublicKey string `json:"signerPublicKey"`
	// Entity version.
	Version int32 `json:"version"`
	Network NetworkTypeEnum `json:"network"`
	Type int32 `json:"type"`
	// Namespace identifier.
	NamespaceId string `json:"namespaceId"`
	// Mosaic identifier.
	MosaicId string `json:"mosaicId"`
	AliasAction AliasActionEnum `json:"aliasAction"`
}

type _EmbeddedMosaicAliasTransactionDTO EmbeddedMosaicAliasTransactionDTO

// NewEmbeddedMosaicAliasTransactionDTO instantiates a new EmbeddedMosaicAliasTransactionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEmbeddedMosaicAliasTransactionDTO(signerPublicKey string, version int32, network NetworkTypeEnum, type_ int32, namespaceId string, mosaicId string, aliasAction AliasActionEnum) *EmbeddedMosaicAliasTransactionDTO {
	this := EmbeddedMosaicAliasTransactionDTO{}
	this.SignerPublicKey = signerPublicKey
	this.Version = version
	this.Network = network
	this.Type = type_
	this.NamespaceId = namespaceId
	this.MosaicId = mosaicId
	this.AliasAction = aliasAction
	return &this
}

// NewEmbeddedMosaicAliasTransactionDTOWithDefaults instantiates a new EmbeddedMosaicAliasTransactionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEmbeddedMosaicAliasTransactionDTOWithDefaults() *EmbeddedMosaicAliasTransactionDTO {
	this := EmbeddedMosaicAliasTransactionDTO{}
	return &this
}

// GetSignerPublicKey returns the SignerPublicKey field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetSignerPublicKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SignerPublicKey
}

// GetSignerPublicKeyOk returns a tuple with the SignerPublicKey field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetSignerPublicKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SignerPublicKey, true
}

// SetSignerPublicKey sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetSignerPublicKey(v string) {
	o.SignerPublicKey = v
}

// GetVersion returns the Version field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetVersion() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetVersionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetVersion(v int32) {
	o.Version = v
}

// GetNetwork returns the Network field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetNetwork() NetworkTypeEnum {
	if o == nil {
		var ret NetworkTypeEnum
		return ret
	}

	return o.Network
}

// GetNetworkOk returns a tuple with the Network field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetNetworkOk() (*NetworkTypeEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Network, true
}

// SetNetwork sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetNetwork(v NetworkTypeEnum) {
	o.Network = v
}

// GetType returns the Type field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetType() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetTypeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetType(v int32) {
	o.Type = v
}

// GetNamespaceId returns the NamespaceId field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetNamespaceId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NamespaceId
}

// GetNamespaceIdOk returns a tuple with the NamespaceId field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetNamespaceIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NamespaceId, true
}

// SetNamespaceId sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetNamespaceId(v string) {
	o.NamespaceId = v
}

// GetMosaicId returns the MosaicId field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetMosaicId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MosaicId
}

// GetMosaicIdOk returns a tuple with the MosaicId field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetMosaicIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MosaicId, true
}

// SetMosaicId sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetMosaicId(v string) {
	o.MosaicId = v
}

// GetAliasAction returns the AliasAction field value
func (o *EmbeddedMosaicAliasTransactionDTO) GetAliasAction() AliasActionEnum {
	if o == nil {
		var ret AliasActionEnum
		return ret
	}

	return o.AliasAction
}

// GetAliasActionOk returns a tuple with the AliasAction field value
// and a boolean to check if the value has been set.
func (o *EmbeddedMosaicAliasTransactionDTO) GetAliasActionOk() (*AliasActionEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AliasAction, true
}

// SetAliasAction sets field value
func (o *EmbeddedMosaicAliasTransactionDTO) SetAliasAction(v AliasActionEnum) {
	o.AliasAction = v
}

func (o EmbeddedMosaicAliasTransactionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o EmbeddedMosaicAliasTransactionDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["signerPublicKey"] = o.SignerPublicKey
	toSerialize["version"] = o.Version
	toSerialize["network"] = o.Network
	toSerialize["type"] = o.Type
	toSerialize["namespaceId"] = o.NamespaceId
	toSerialize["mosaicId"] = o.MosaicId
	toSerialize["aliasAction"] = o.AliasAction
	return toSerialize, nil
}

func (o *EmbeddedMosaicAliasTransactionDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"signerPublicKey",
		"version",
		"network",
		"type",
		"namespaceId",
		"mosaicId",
		"aliasAction",
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

	varEmbeddedMosaicAliasTransactionDTO := _EmbeddedMosaicAliasTransactionDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varEmbeddedMosaicAliasTransactionDTO)

	if err != nil {
		return err
	}

	*o = EmbeddedMosaicAliasTransactionDTO(varEmbeddedMosaicAliasTransactionDTO)

	return err
}

type NullableEmbeddedMosaicAliasTransactionDTO struct {
	value *EmbeddedMosaicAliasTransactionDTO
	isSet bool
}

func (v NullableEmbeddedMosaicAliasTransactionDTO) Get() *EmbeddedMosaicAliasTransactionDTO {
	return v.value
}

func (v *NullableEmbeddedMosaicAliasTransactionDTO) Set(val *EmbeddedMosaicAliasTransactionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableEmbeddedMosaicAliasTransactionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableEmbeddedMosaicAliasTransactionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEmbeddedMosaicAliasTransactionDTO(val *EmbeddedMosaicAliasTransactionDTO) *NullableEmbeddedMosaicAliasTransactionDTO {
	return &NullableEmbeddedMosaicAliasTransactionDTO{value: val, isSet: true}
}

func (v NullableEmbeddedMosaicAliasTransactionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEmbeddedMosaicAliasTransactionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


