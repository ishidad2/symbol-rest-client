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

// checks if the CosignatureDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CosignatureDTO{}

// CosignatureDTO struct for CosignatureDTO
type CosignatureDTO struct {
	// Entity's signature generated by the signer.
	Signature string `json:"signature"`
	// Cosignature version.
	Version string `json:"version"`
	// Public key.
	SignerPublicKey string `json:"signerPublicKey"`
}

type _CosignatureDTO CosignatureDTO

// NewCosignatureDTO instantiates a new CosignatureDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCosignatureDTO(signature string, version string, signerPublicKey string) *CosignatureDTO {
	this := CosignatureDTO{}
	this.Signature = signature
	this.Version = version
	this.SignerPublicKey = signerPublicKey
	return &this
}

// NewCosignatureDTOWithDefaults instantiates a new CosignatureDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCosignatureDTOWithDefaults() *CosignatureDTO {
	this := CosignatureDTO{}
	return &this
}

// GetSignature returns the Signature field value
func (o *CosignatureDTO) GetSignature() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Signature
}

// GetSignatureOk returns a tuple with the Signature field value
// and a boolean to check if the value has been set.
func (o *CosignatureDTO) GetSignatureOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Signature, true
}

// SetSignature sets field value
func (o *CosignatureDTO) SetSignature(v string) {
	o.Signature = v
}

// GetVersion returns the Version field value
func (o *CosignatureDTO) GetVersion() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *CosignatureDTO) GetVersionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *CosignatureDTO) SetVersion(v string) {
	o.Version = v
}

// GetSignerPublicKey returns the SignerPublicKey field value
func (o *CosignatureDTO) GetSignerPublicKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SignerPublicKey
}

// GetSignerPublicKeyOk returns a tuple with the SignerPublicKey field value
// and a boolean to check if the value has been set.
func (o *CosignatureDTO) GetSignerPublicKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SignerPublicKey, true
}

// SetSignerPublicKey sets field value
func (o *CosignatureDTO) SetSignerPublicKey(v string) {
	o.SignerPublicKey = v
}

func (o CosignatureDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CosignatureDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["signature"] = o.Signature
	toSerialize["version"] = o.Version
	toSerialize["signerPublicKey"] = o.SignerPublicKey
	return toSerialize, nil
}

func (o *CosignatureDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"signature",
		"version",
		"signerPublicKey",
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

	varCosignatureDTO := _CosignatureDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCosignatureDTO)

	if err != nil {
		return err
	}

	*o = CosignatureDTO(varCosignatureDTO)

	return err
}

type NullableCosignatureDTO struct {
	value *CosignatureDTO
	isSet bool
}

func (v NullableCosignatureDTO) Get() *CosignatureDTO {
	return v.value
}

func (v *NullableCosignatureDTO) Set(val *CosignatureDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCosignatureDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCosignatureDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCosignatureDTO(val *CosignatureDTO) *NullableCosignatureDTO {
	return &NullableCosignatureDTO{value: val, isSet: true}
}

func (v NullableCosignatureDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCosignatureDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


