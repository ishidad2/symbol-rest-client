/*
Catapult REST Endpoints

OpenAPI Specification of catapult-rest

API version: 1.0.4
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi_client

import (
	"encoding/json"
)

// checks if the MosaicNetworkPropertiesDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MosaicNetworkPropertiesDTO{}

// MosaicNetworkPropertiesDTO struct for MosaicNetworkPropertiesDTO
type MosaicNetworkPropertiesDTO struct {
	// Maximum number of mosaics that an account can own.
	MaxMosaicsPerAccount *string `json:"maxMosaicsPerAccount,omitempty"`
	// Maximum mosaic duration.
	MaxMosaicDuration *string `json:"maxMosaicDuration,omitempty"`
	// Maximum mosaic divisibility.
	MaxMosaicDivisibility *string `json:"maxMosaicDivisibility,omitempty"`
	// Address encoded using a 32-character set.
	MosaicRentalFeeSinkAddress *string `json:"mosaicRentalFeeSinkAddress,omitempty"`
	// Mosaic rental fee.
	MosaicRentalFee *string `json:"mosaicRentalFee,omitempty"`
}

// NewMosaicNetworkPropertiesDTO instantiates a new MosaicNetworkPropertiesDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMosaicNetworkPropertiesDTO() *MosaicNetworkPropertiesDTO {
	this := MosaicNetworkPropertiesDTO{}
	return &this
}

// NewMosaicNetworkPropertiesDTOWithDefaults instantiates a new MosaicNetworkPropertiesDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMosaicNetworkPropertiesDTOWithDefaults() *MosaicNetworkPropertiesDTO {
	this := MosaicNetworkPropertiesDTO{}
	return &this
}

// GetMaxMosaicsPerAccount returns the MaxMosaicsPerAccount field value if set, zero value otherwise.
func (o *MosaicNetworkPropertiesDTO) GetMaxMosaicsPerAccount() string {
	if o == nil || IsNil(o.MaxMosaicsPerAccount) {
		var ret string
		return ret
	}
	return *o.MaxMosaicsPerAccount
}

// GetMaxMosaicsPerAccountOk returns a tuple with the MaxMosaicsPerAccount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MosaicNetworkPropertiesDTO) GetMaxMosaicsPerAccountOk() (*string, bool) {
	if o == nil || IsNil(o.MaxMosaicsPerAccount) {
		return nil, false
	}
	return o.MaxMosaicsPerAccount, true
}

// HasMaxMosaicsPerAccount returns a boolean if a field has been set.
func (o *MosaicNetworkPropertiesDTO) HasMaxMosaicsPerAccount() bool {
	if o != nil && !IsNil(o.MaxMosaicsPerAccount) {
		return true
	}

	return false
}

// SetMaxMosaicsPerAccount gets a reference to the given string and assigns it to the MaxMosaicsPerAccount field.
func (o *MosaicNetworkPropertiesDTO) SetMaxMosaicsPerAccount(v string) {
	o.MaxMosaicsPerAccount = &v
}

// GetMaxMosaicDuration returns the MaxMosaicDuration field value if set, zero value otherwise.
func (o *MosaicNetworkPropertiesDTO) GetMaxMosaicDuration() string {
	if o == nil || IsNil(o.MaxMosaicDuration) {
		var ret string
		return ret
	}
	return *o.MaxMosaicDuration
}

// GetMaxMosaicDurationOk returns a tuple with the MaxMosaicDuration field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MosaicNetworkPropertiesDTO) GetMaxMosaicDurationOk() (*string, bool) {
	if o == nil || IsNil(o.MaxMosaicDuration) {
		return nil, false
	}
	return o.MaxMosaicDuration, true
}

// HasMaxMosaicDuration returns a boolean if a field has been set.
func (o *MosaicNetworkPropertiesDTO) HasMaxMosaicDuration() bool {
	if o != nil && !IsNil(o.MaxMosaicDuration) {
		return true
	}

	return false
}

// SetMaxMosaicDuration gets a reference to the given string and assigns it to the MaxMosaicDuration field.
func (o *MosaicNetworkPropertiesDTO) SetMaxMosaicDuration(v string) {
	o.MaxMosaicDuration = &v
}

// GetMaxMosaicDivisibility returns the MaxMosaicDivisibility field value if set, zero value otherwise.
func (o *MosaicNetworkPropertiesDTO) GetMaxMosaicDivisibility() string {
	if o == nil || IsNil(o.MaxMosaicDivisibility) {
		var ret string
		return ret
	}
	return *o.MaxMosaicDivisibility
}

// GetMaxMosaicDivisibilityOk returns a tuple with the MaxMosaicDivisibility field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MosaicNetworkPropertiesDTO) GetMaxMosaicDivisibilityOk() (*string, bool) {
	if o == nil || IsNil(o.MaxMosaicDivisibility) {
		return nil, false
	}
	return o.MaxMosaicDivisibility, true
}

// HasMaxMosaicDivisibility returns a boolean if a field has been set.
func (o *MosaicNetworkPropertiesDTO) HasMaxMosaicDivisibility() bool {
	if o != nil && !IsNil(o.MaxMosaicDivisibility) {
		return true
	}

	return false
}

// SetMaxMosaicDivisibility gets a reference to the given string and assigns it to the MaxMosaicDivisibility field.
func (o *MosaicNetworkPropertiesDTO) SetMaxMosaicDivisibility(v string) {
	o.MaxMosaicDivisibility = &v
}

// GetMosaicRentalFeeSinkAddress returns the MosaicRentalFeeSinkAddress field value if set, zero value otherwise.
func (o *MosaicNetworkPropertiesDTO) GetMosaicRentalFeeSinkAddress() string {
	if o == nil || IsNil(o.MosaicRentalFeeSinkAddress) {
		var ret string
		return ret
	}
	return *o.MosaicRentalFeeSinkAddress
}

// GetMosaicRentalFeeSinkAddressOk returns a tuple with the MosaicRentalFeeSinkAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MosaicNetworkPropertiesDTO) GetMosaicRentalFeeSinkAddressOk() (*string, bool) {
	if o == nil || IsNil(o.MosaicRentalFeeSinkAddress) {
		return nil, false
	}
	return o.MosaicRentalFeeSinkAddress, true
}

// HasMosaicRentalFeeSinkAddress returns a boolean if a field has been set.
func (o *MosaicNetworkPropertiesDTO) HasMosaicRentalFeeSinkAddress() bool {
	if o != nil && !IsNil(o.MosaicRentalFeeSinkAddress) {
		return true
	}

	return false
}

// SetMosaicRentalFeeSinkAddress gets a reference to the given string and assigns it to the MosaicRentalFeeSinkAddress field.
func (o *MosaicNetworkPropertiesDTO) SetMosaicRentalFeeSinkAddress(v string) {
	o.MosaicRentalFeeSinkAddress = &v
}

// GetMosaicRentalFee returns the MosaicRentalFee field value if set, zero value otherwise.
func (o *MosaicNetworkPropertiesDTO) GetMosaicRentalFee() string {
	if o == nil || IsNil(o.MosaicRentalFee) {
		var ret string
		return ret
	}
	return *o.MosaicRentalFee
}

// GetMosaicRentalFeeOk returns a tuple with the MosaicRentalFee field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MosaicNetworkPropertiesDTO) GetMosaicRentalFeeOk() (*string, bool) {
	if o == nil || IsNil(o.MosaicRentalFee) {
		return nil, false
	}
	return o.MosaicRentalFee, true
}

// HasMosaicRentalFee returns a boolean if a field has been set.
func (o *MosaicNetworkPropertiesDTO) HasMosaicRentalFee() bool {
	if o != nil && !IsNil(o.MosaicRentalFee) {
		return true
	}

	return false
}

// SetMosaicRentalFee gets a reference to the given string and assigns it to the MosaicRentalFee field.
func (o *MosaicNetworkPropertiesDTO) SetMosaicRentalFee(v string) {
	o.MosaicRentalFee = &v
}

func (o MosaicNetworkPropertiesDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MosaicNetworkPropertiesDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.MaxMosaicsPerAccount) {
		toSerialize["maxMosaicsPerAccount"] = o.MaxMosaicsPerAccount
	}
	if !IsNil(o.MaxMosaicDuration) {
		toSerialize["maxMosaicDuration"] = o.MaxMosaicDuration
	}
	if !IsNil(o.MaxMosaicDivisibility) {
		toSerialize["maxMosaicDivisibility"] = o.MaxMosaicDivisibility
	}
	if !IsNil(o.MosaicRentalFeeSinkAddress) {
		toSerialize["mosaicRentalFeeSinkAddress"] = o.MosaicRentalFeeSinkAddress
	}
	if !IsNil(o.MosaicRentalFee) {
		toSerialize["mosaicRentalFee"] = o.MosaicRentalFee
	}
	return toSerialize, nil
}

type NullableMosaicNetworkPropertiesDTO struct {
	value *MosaicNetworkPropertiesDTO
	isSet bool
}

func (v NullableMosaicNetworkPropertiesDTO) Get() *MosaicNetworkPropertiesDTO {
	return v.value
}

func (v *NullableMosaicNetworkPropertiesDTO) Set(val *MosaicNetworkPropertiesDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableMosaicNetworkPropertiesDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableMosaicNetworkPropertiesDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMosaicNetworkPropertiesDTO(val *MosaicNetworkPropertiesDTO) *NullableMosaicNetworkPropertiesDTO {
	return &NullableMosaicNetworkPropertiesDTO{value: val, isSet: true}
}

func (v NullableMosaicNetworkPropertiesDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMosaicNetworkPropertiesDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


