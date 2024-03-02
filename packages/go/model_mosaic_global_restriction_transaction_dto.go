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

// checks if the MosaicGlobalRestrictionTransactionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MosaicGlobalRestrictionTransactionDTO{}

// MosaicGlobalRestrictionTransactionDTO Transaction to set a network-wide restriction rule to a mosaic.
type MosaicGlobalRestrictionTransactionDTO struct {
	// A number that allows uint 32 values.
	Size int64 `json:"size"`
	// Entity's signature generated by the signer.
	Signature string `json:"signature"`
	// Public key.
	SignerPublicKey string `json:"signerPublicKey"`
	// Entity version.
	Version int32 `json:"version"`
	Network NetworkTypeEnum `json:"network"`
	Type int32 `json:"type"`
	// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
	MaxFee string `json:"maxFee"`
	// Duration expressed in number of blocks.
	Deadline string `json:"deadline"`
	// Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier. 
	MosaicId string `json:"mosaicId"`
	// Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier. 
	ReferenceMosaicId string `json:"referenceMosaicId"`
	// Restriction key.
	RestrictionKey string `json:"restrictionKey"`
	// Restriction value.
	PreviousRestrictionValue string `json:"previousRestrictionValue"`
	// Restriction value.
	NewRestrictionValue string `json:"newRestrictionValue"`
	PreviousRestrictionType MosaicRestrictionTypeEnum `json:"previousRestrictionType"`
	NewRestrictionType MosaicRestrictionTypeEnum `json:"newRestrictionType"`
}

type _MosaicGlobalRestrictionTransactionDTO MosaicGlobalRestrictionTransactionDTO

// NewMosaicGlobalRestrictionTransactionDTO instantiates a new MosaicGlobalRestrictionTransactionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMosaicGlobalRestrictionTransactionDTO(size int64, signature string, signerPublicKey string, version int32, network NetworkTypeEnum, type_ int32, maxFee string, deadline string, mosaicId string, referenceMosaicId string, restrictionKey string, previousRestrictionValue string, newRestrictionValue string, previousRestrictionType MosaicRestrictionTypeEnum, newRestrictionType MosaicRestrictionTypeEnum) *MosaicGlobalRestrictionTransactionDTO {
	this := MosaicGlobalRestrictionTransactionDTO{}
	this.Size = size
	this.Signature = signature
	this.SignerPublicKey = signerPublicKey
	this.Version = version
	this.Network = network
	this.Type = type_
	this.MaxFee = maxFee
	this.Deadline = deadline
	this.MosaicId = mosaicId
	this.ReferenceMosaicId = referenceMosaicId
	this.RestrictionKey = restrictionKey
	this.PreviousRestrictionValue = previousRestrictionValue
	this.NewRestrictionValue = newRestrictionValue
	this.PreviousRestrictionType = previousRestrictionType
	this.NewRestrictionType = newRestrictionType
	return &this
}

// NewMosaicGlobalRestrictionTransactionDTOWithDefaults instantiates a new MosaicGlobalRestrictionTransactionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMosaicGlobalRestrictionTransactionDTOWithDefaults() *MosaicGlobalRestrictionTransactionDTO {
	this := MosaicGlobalRestrictionTransactionDTO{}
	return &this
}

// GetSize returns the Size field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetSize() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.Size
}

// GetSizeOk returns a tuple with the Size field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetSizeOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Size, true
}

// SetSize sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetSize(v int64) {
	o.Size = v
}

// GetSignature returns the Signature field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetSignature() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Signature
}

// GetSignatureOk returns a tuple with the Signature field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetSignatureOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Signature, true
}

// SetSignature sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetSignature(v string) {
	o.Signature = v
}

// GetSignerPublicKey returns the SignerPublicKey field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetSignerPublicKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SignerPublicKey
}

// GetSignerPublicKeyOk returns a tuple with the SignerPublicKey field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetSignerPublicKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SignerPublicKey, true
}

// SetSignerPublicKey sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetSignerPublicKey(v string) {
	o.SignerPublicKey = v
}

// GetVersion returns the Version field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetVersion() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetVersionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetVersion(v int32) {
	o.Version = v
}

// GetNetwork returns the Network field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetNetwork() NetworkTypeEnum {
	if o == nil {
		var ret NetworkTypeEnum
		return ret
	}

	return o.Network
}

// GetNetworkOk returns a tuple with the Network field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetNetworkOk() (*NetworkTypeEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Network, true
}

// SetNetwork sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetNetwork(v NetworkTypeEnum) {
	o.Network = v
}

// GetType returns the Type field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetType() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetTypeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetType(v int32) {
	o.Type = v
}

// GetMaxFee returns the MaxFee field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetMaxFee() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MaxFee
}

// GetMaxFeeOk returns a tuple with the MaxFee field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetMaxFeeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MaxFee, true
}

// SetMaxFee sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetMaxFee(v string) {
	o.MaxFee = v
}

// GetDeadline returns the Deadline field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetDeadline() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Deadline
}

// GetDeadlineOk returns a tuple with the Deadline field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetDeadlineOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Deadline, true
}

// SetDeadline sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetDeadline(v string) {
	o.Deadline = v
}

// GetMosaicId returns the MosaicId field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetMosaicId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MosaicId
}

// GetMosaicIdOk returns a tuple with the MosaicId field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetMosaicIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MosaicId, true
}

// SetMosaicId sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetMosaicId(v string) {
	o.MosaicId = v
}

// GetReferenceMosaicId returns the ReferenceMosaicId field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetReferenceMosaicId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ReferenceMosaicId
}

// GetReferenceMosaicIdOk returns a tuple with the ReferenceMosaicId field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetReferenceMosaicIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ReferenceMosaicId, true
}

// SetReferenceMosaicId sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetReferenceMosaicId(v string) {
	o.ReferenceMosaicId = v
}

// GetRestrictionKey returns the RestrictionKey field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetRestrictionKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RestrictionKey
}

// GetRestrictionKeyOk returns a tuple with the RestrictionKey field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetRestrictionKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RestrictionKey, true
}

// SetRestrictionKey sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetRestrictionKey(v string) {
	o.RestrictionKey = v
}

// GetPreviousRestrictionValue returns the PreviousRestrictionValue field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetPreviousRestrictionValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.PreviousRestrictionValue
}

// GetPreviousRestrictionValueOk returns a tuple with the PreviousRestrictionValue field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetPreviousRestrictionValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PreviousRestrictionValue, true
}

// SetPreviousRestrictionValue sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetPreviousRestrictionValue(v string) {
	o.PreviousRestrictionValue = v
}

// GetNewRestrictionValue returns the NewRestrictionValue field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetNewRestrictionValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NewRestrictionValue
}

// GetNewRestrictionValueOk returns a tuple with the NewRestrictionValue field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetNewRestrictionValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NewRestrictionValue, true
}

// SetNewRestrictionValue sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetNewRestrictionValue(v string) {
	o.NewRestrictionValue = v
}

// GetPreviousRestrictionType returns the PreviousRestrictionType field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetPreviousRestrictionType() MosaicRestrictionTypeEnum {
	if o == nil {
		var ret MosaicRestrictionTypeEnum
		return ret
	}

	return o.PreviousRestrictionType
}

// GetPreviousRestrictionTypeOk returns a tuple with the PreviousRestrictionType field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetPreviousRestrictionTypeOk() (*MosaicRestrictionTypeEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PreviousRestrictionType, true
}

// SetPreviousRestrictionType sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetPreviousRestrictionType(v MosaicRestrictionTypeEnum) {
	o.PreviousRestrictionType = v
}

// GetNewRestrictionType returns the NewRestrictionType field value
func (o *MosaicGlobalRestrictionTransactionDTO) GetNewRestrictionType() MosaicRestrictionTypeEnum {
	if o == nil {
		var ret MosaicRestrictionTypeEnum
		return ret
	}

	return o.NewRestrictionType
}

// GetNewRestrictionTypeOk returns a tuple with the NewRestrictionType field value
// and a boolean to check if the value has been set.
func (o *MosaicGlobalRestrictionTransactionDTO) GetNewRestrictionTypeOk() (*MosaicRestrictionTypeEnum, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NewRestrictionType, true
}

// SetNewRestrictionType sets field value
func (o *MosaicGlobalRestrictionTransactionDTO) SetNewRestrictionType(v MosaicRestrictionTypeEnum) {
	o.NewRestrictionType = v
}

func (o MosaicGlobalRestrictionTransactionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MosaicGlobalRestrictionTransactionDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["size"] = o.Size
	toSerialize["signature"] = o.Signature
	toSerialize["signerPublicKey"] = o.SignerPublicKey
	toSerialize["version"] = o.Version
	toSerialize["network"] = o.Network
	toSerialize["type"] = o.Type
	toSerialize["maxFee"] = o.MaxFee
	toSerialize["deadline"] = o.Deadline
	toSerialize["mosaicId"] = o.MosaicId
	toSerialize["referenceMosaicId"] = o.ReferenceMosaicId
	toSerialize["restrictionKey"] = o.RestrictionKey
	toSerialize["previousRestrictionValue"] = o.PreviousRestrictionValue
	toSerialize["newRestrictionValue"] = o.NewRestrictionValue
	toSerialize["previousRestrictionType"] = o.PreviousRestrictionType
	toSerialize["newRestrictionType"] = o.NewRestrictionType
	return toSerialize, nil
}

func (o *MosaicGlobalRestrictionTransactionDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"size",
		"signature",
		"signerPublicKey",
		"version",
		"network",
		"type",
		"maxFee",
		"deadline",
		"mosaicId",
		"referenceMosaicId",
		"restrictionKey",
		"previousRestrictionValue",
		"newRestrictionValue",
		"previousRestrictionType",
		"newRestrictionType",
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

	varMosaicGlobalRestrictionTransactionDTO := _MosaicGlobalRestrictionTransactionDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMosaicGlobalRestrictionTransactionDTO)

	if err != nil {
		return err
	}

	*o = MosaicGlobalRestrictionTransactionDTO(varMosaicGlobalRestrictionTransactionDTO)

	return err
}

type NullableMosaicGlobalRestrictionTransactionDTO struct {
	value *MosaicGlobalRestrictionTransactionDTO
	isSet bool
}

func (v NullableMosaicGlobalRestrictionTransactionDTO) Get() *MosaicGlobalRestrictionTransactionDTO {
	return v.value
}

func (v *NullableMosaicGlobalRestrictionTransactionDTO) Set(val *MosaicGlobalRestrictionTransactionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableMosaicGlobalRestrictionTransactionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableMosaicGlobalRestrictionTransactionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMosaicGlobalRestrictionTransactionDTO(val *MosaicGlobalRestrictionTransactionDTO) *NullableMosaicGlobalRestrictionTransactionDTO {
	return &NullableMosaicGlobalRestrictionTransactionDTO{value: val, isSet: true}
}

func (v NullableMosaicGlobalRestrictionTransactionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMosaicGlobalRestrictionTransactionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


