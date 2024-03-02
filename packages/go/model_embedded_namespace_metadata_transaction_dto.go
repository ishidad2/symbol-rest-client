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

// checks if the EmbeddedNamespaceMetadataTransactionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &EmbeddedNamespaceMetadataTransactionDTO{}

// EmbeddedNamespaceMetadataTransactionDTO struct for EmbeddedNamespaceMetadataTransactionDTO
type EmbeddedNamespaceMetadataTransactionDTO struct {
	// Public key.
	SignerPublicKey string `json:"signerPublicKey"`
	// Entity version.
	Version int32 `json:"version"`
	Network NetworkTypeEnum `json:"network"`
	Type int32 `json:"type"`
	// Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA 
	TargetAddress string `json:"targetAddress"`
	// Metadata key scoped to source, target and type expressed.
	ScopedMetadataKey string `json:"scopedMetadataKey"`
	// Namespace identifier.
	TargetNamespaceId *string `json:"targetNamespaceId,omitempty"`
	// Change in value size in bytes.
	ValueSizeDelta int32 `json:"valueSizeDelta"`
	// A number that allows uint 32 values.
	ValueSize int64 `json:"valueSize"`
	// Metadata value. If embedded in a transaction, this is calculated as xor(previous-value, value).
	Value string `json:"value"`
}

type _EmbeddedNamespaceMetadataTransactionDTO EmbeddedNamespaceMetadataTransactionDTO

// NewEmbeddedNamespaceMetadataTransactionDTO instantiates a new EmbeddedNamespaceMetadataTransactionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEmbeddedNamespaceMetadataTransactionDTO(signerPublicKey string, version int32, network NetworkTypeEnum, type_ int32, targetAddress string, scopedMetadataKey string, valueSizeDelta int32, valueSize int64, value string) *EmbeddedNamespaceMetadataTransactionDTO {
	this := EmbeddedNamespaceMetadataTransactionDTO{}
	this.SignerPublicKey = signerPublicKey
	this.Version = version
	this.Network = network
	this.Type = type_
	this.TargetAddress = targetAddress
	this.ScopedMetadataKey = scopedMetadataKey
	this.ValueSizeDelta = valueSizeDelta
	this.ValueSize = valueSize
	this.Value = value
	return &this
}

// NewEmbeddedNamespaceMetadataTransactionDTOWithDefaults instantiates a new EmbeddedNamespaceMetadataTransactionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEmbeddedNamespaceMetadataTransactionDTOWithDefaults() *EmbeddedNamespaceMetadataTransactionDTO {
	this := EmbeddedNamespaceMetadataTransactionDTO{}
	return &this
}

// GetSignerPublicKey returns the SignerPublicKey field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetSignerPublicKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SignerPublicKey
}

// GetSignerPublicKeyOk returns a tuple with the SignerPublicKey field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetSignerPublicKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SignerPublicKey, true
}

// SetSignerPublicKey sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetSignerPublicKey(v string) {
	o.SignerPublicKey = v
}

// GetVersion returns the Version field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetVersion() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetVersionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetVersion(v int32) {
	o.Version = v
}

// GetNetwork returns the Network field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetNetwork() NetworkTypeEnum {
	if o == nil {
		var ret NetworkTypeEnum
		return ret
	}

	return o.Network
}

// GetNetworkOk returns a tuple with the Network field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetNetworkOk() (*NetworkTypeEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Network, true
}

// SetNetwork sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetNetwork(v NetworkTypeEnum) {
	o.Network = v
}

// GetType returns the Type field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetType() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetTypeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetType(v int32) {
	o.Type = v
}

// GetTargetAddress returns the TargetAddress field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetTargetAddress() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TargetAddress
}

// GetTargetAddressOk returns a tuple with the TargetAddress field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetTargetAddressOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TargetAddress, true
}

// SetTargetAddress sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetTargetAddress(v string) {
	o.TargetAddress = v
}

// GetScopedMetadataKey returns the ScopedMetadataKey field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetScopedMetadataKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ScopedMetadataKey
}

// GetScopedMetadataKeyOk returns a tuple with the ScopedMetadataKey field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetScopedMetadataKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ScopedMetadataKey, true
}

// SetScopedMetadataKey sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetScopedMetadataKey(v string) {
	o.ScopedMetadataKey = v
}

// GetTargetNamespaceId returns the TargetNamespaceId field value if set, zero value otherwise.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetTargetNamespaceId() string {
	if o == nil || IsNil(o.TargetNamespaceId) {
		var ret string
		return ret
	}
	return *o.TargetNamespaceId
}

// GetTargetNamespaceIdOk returns a tuple with the TargetNamespaceId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetTargetNamespaceIdOk() (*string, bool) {
	if o == nil || IsNil(o.TargetNamespaceId) {
		return nil, false
	}
	return o.TargetNamespaceId, true
}

// HasTargetNamespaceId returns a boolean if a field has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) HasTargetNamespaceId() bool {
	if o != nil && !IsNil(o.TargetNamespaceId) {
		return true
	}

	return false
}

// SetTargetNamespaceId gets a reference to the given string and assigns it to the TargetNamespaceId field.
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetTargetNamespaceId(v string) {
	o.TargetNamespaceId = &v
}

// GetValueSizeDelta returns the ValueSizeDelta field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetValueSizeDelta() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ValueSizeDelta
}

// GetValueSizeDeltaOk returns a tuple with the ValueSizeDelta field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetValueSizeDeltaOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ValueSizeDelta, true
}

// SetValueSizeDelta sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetValueSizeDelta(v int32) {
	o.ValueSizeDelta = v
}

// GetValueSize returns the ValueSize field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetValueSize() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.ValueSize
}

// GetValueSizeOk returns a tuple with the ValueSize field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetValueSizeOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ValueSize, true
}

// SetValueSize sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetValueSize(v int64) {
	o.ValueSize = v
}

// GetValue returns the Value field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *EmbeddedNamespaceMetadataTransactionDTO) GetValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *EmbeddedNamespaceMetadataTransactionDTO) SetValue(v string) {
	o.Value = v
}

func (o EmbeddedNamespaceMetadataTransactionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o EmbeddedNamespaceMetadataTransactionDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["signerPublicKey"] = o.SignerPublicKey
	toSerialize["version"] = o.Version
	toSerialize["network"] = o.Network
	toSerialize["type"] = o.Type
	toSerialize["targetAddress"] = o.TargetAddress
	toSerialize["scopedMetadataKey"] = o.ScopedMetadataKey
	if !IsNil(o.TargetNamespaceId) {
		toSerialize["targetNamespaceId"] = o.TargetNamespaceId
	}
	toSerialize["valueSizeDelta"] = o.ValueSizeDelta
	toSerialize["valueSize"] = o.ValueSize
	toSerialize["value"] = o.Value
	return toSerialize, nil
}

func (o *EmbeddedNamespaceMetadataTransactionDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"signerPublicKey",
		"version",
		"network",
		"type",
		"targetAddress",
		"scopedMetadataKey",
		"valueSizeDelta",
		"valueSize",
		"value",
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

	varEmbeddedNamespaceMetadataTransactionDTO := _EmbeddedNamespaceMetadataTransactionDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varEmbeddedNamespaceMetadataTransactionDTO)

	if err != nil {
		return err
	}

	*o = EmbeddedNamespaceMetadataTransactionDTO(varEmbeddedNamespaceMetadataTransactionDTO)

	return err
}

type NullableEmbeddedNamespaceMetadataTransactionDTO struct {
	value *EmbeddedNamespaceMetadataTransactionDTO
	isSet bool
}

func (v NullableEmbeddedNamespaceMetadataTransactionDTO) Get() *EmbeddedNamespaceMetadataTransactionDTO {
	return v.value
}

func (v *NullableEmbeddedNamespaceMetadataTransactionDTO) Set(val *EmbeddedNamespaceMetadataTransactionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableEmbeddedNamespaceMetadataTransactionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableEmbeddedNamespaceMetadataTransactionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEmbeddedNamespaceMetadataTransactionDTO(val *EmbeddedNamespaceMetadataTransactionDTO) *NullableEmbeddedNamespaceMetadataTransactionDTO {
	return &NullableEmbeddedNamespaceMetadataTransactionDTO{value: val, isSet: true}
}

func (v NullableEmbeddedNamespaceMetadataTransactionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEmbeddedNamespaceMetadataTransactionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


