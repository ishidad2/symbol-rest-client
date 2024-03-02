/*
 * Catapult REST Endpoints
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.NetworkTypeEnum;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * EmbeddedMosaicMetadataTransactionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class EmbeddedMosaicMetadataTransactionDTO {
  public static final String SERIALIZED_NAME_SIGNER_PUBLIC_KEY = "signerPublicKey";
  @SerializedName(SERIALIZED_NAME_SIGNER_PUBLIC_KEY)
  private String signerPublicKey;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private NetworkTypeEnum network;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_TARGET_ADDRESS = "targetAddress";
  @SerializedName(SERIALIZED_NAME_TARGET_ADDRESS)
  private String targetAddress;

  public static final String SERIALIZED_NAME_SCOPED_METADATA_KEY = "scopedMetadataKey";
  @SerializedName(SERIALIZED_NAME_SCOPED_METADATA_KEY)
  private String scopedMetadataKey;

  public static final String SERIALIZED_NAME_TARGET_MOSAIC_ID = "targetMosaicId";
  @SerializedName(SERIALIZED_NAME_TARGET_MOSAIC_ID)
  private String targetMosaicId;

  public static final String SERIALIZED_NAME_VALUE_SIZE_DELTA = "valueSizeDelta";
  @SerializedName(SERIALIZED_NAME_VALUE_SIZE_DELTA)
  private Integer valueSizeDelta;

  public static final String SERIALIZED_NAME_VALUE_SIZE = "valueSize";
  @SerializedName(SERIALIZED_NAME_VALUE_SIZE)
  private Long valueSize;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public EmbeddedMosaicMetadataTransactionDTO() {
  }

  public EmbeddedMosaicMetadataTransactionDTO signerPublicKey(String signerPublicKey) {
    this.signerPublicKey = signerPublicKey;
    return this;
  }

   /**
   * Public key.
   * @return signerPublicKey
  **/
  @javax.annotation.Nonnull
  public String getSignerPublicKey() {
    return signerPublicKey;
  }

  public void setSignerPublicKey(String signerPublicKey) {
    this.signerPublicKey = signerPublicKey;
  }


  public EmbeddedMosaicMetadataTransactionDTO version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Entity version.
   * @return version
  **/
  @javax.annotation.Nonnull
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  public EmbeddedMosaicMetadataTransactionDTO network(NetworkTypeEnum network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nonnull
  public NetworkTypeEnum getNetwork() {
    return network;
  }

  public void setNetwork(NetworkTypeEnum network) {
    this.network = network;
  }


  public EmbeddedMosaicMetadataTransactionDTO type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  public EmbeddedMosaicMetadataTransactionDTO targetAddress(String targetAddress) {
    this.targetAddress = targetAddress;
    return this;
  }

   /**
   * Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA 
   * @return targetAddress
  **/
  @javax.annotation.Nonnull
  public String getTargetAddress() {
    return targetAddress;
  }

  public void setTargetAddress(String targetAddress) {
    this.targetAddress = targetAddress;
  }


  public EmbeddedMosaicMetadataTransactionDTO scopedMetadataKey(String scopedMetadataKey) {
    this.scopedMetadataKey = scopedMetadataKey;
    return this;
  }

   /**
   * Metadata key scoped to source, target and type expressed.
   * @return scopedMetadataKey
  **/
  @javax.annotation.Nonnull
  public String getScopedMetadataKey() {
    return scopedMetadataKey;
  }

  public void setScopedMetadataKey(String scopedMetadataKey) {
    this.scopedMetadataKey = scopedMetadataKey;
  }


  public EmbeddedMosaicMetadataTransactionDTO targetMosaicId(String targetMosaicId) {
    this.targetMosaicId = targetMosaicId;
    return this;
  }

   /**
   * Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier. 
   * @return targetMosaicId
  **/
  @javax.annotation.Nonnull
  public String getTargetMosaicId() {
    return targetMosaicId;
  }

  public void setTargetMosaicId(String targetMosaicId) {
    this.targetMosaicId = targetMosaicId;
  }


  public EmbeddedMosaicMetadataTransactionDTO valueSizeDelta(Integer valueSizeDelta) {
    this.valueSizeDelta = valueSizeDelta;
    return this;
  }

   /**
   * Change in value size in bytes.
   * @return valueSizeDelta
  **/
  @javax.annotation.Nonnull
  public Integer getValueSizeDelta() {
    return valueSizeDelta;
  }

  public void setValueSizeDelta(Integer valueSizeDelta) {
    this.valueSizeDelta = valueSizeDelta;
  }


  public EmbeddedMosaicMetadataTransactionDTO valueSize(Long valueSize) {
    this.valueSize = valueSize;
    return this;
  }

   /**
   * A number that allows uint 32 values.
   * @return valueSize
  **/
  @javax.annotation.Nonnull
  public Long getValueSize() {
    return valueSize;
  }

  public void setValueSize(Long valueSize) {
    this.valueSize = valueSize;
  }


  public EmbeddedMosaicMetadataTransactionDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Metadata value. If embedded in a transaction, this is calculated as xor(previous-value, value).
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedMosaicMetadataTransactionDTO embeddedMosaicMetadataTransactionDTO = (EmbeddedMosaicMetadataTransactionDTO) o;
    return Objects.equals(this.signerPublicKey, embeddedMosaicMetadataTransactionDTO.signerPublicKey) &&
        Objects.equals(this.version, embeddedMosaicMetadataTransactionDTO.version) &&
        Objects.equals(this.network, embeddedMosaicMetadataTransactionDTO.network) &&
        Objects.equals(this.type, embeddedMosaicMetadataTransactionDTO.type) &&
        Objects.equals(this.targetAddress, embeddedMosaicMetadataTransactionDTO.targetAddress) &&
        Objects.equals(this.scopedMetadataKey, embeddedMosaicMetadataTransactionDTO.scopedMetadataKey) &&
        Objects.equals(this.targetMosaicId, embeddedMosaicMetadataTransactionDTO.targetMosaicId) &&
        Objects.equals(this.valueSizeDelta, embeddedMosaicMetadataTransactionDTO.valueSizeDelta) &&
        Objects.equals(this.valueSize, embeddedMosaicMetadataTransactionDTO.valueSize) &&
        Objects.equals(this.value, embeddedMosaicMetadataTransactionDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signerPublicKey, version, network, type, targetAddress, scopedMetadataKey, targetMosaicId, valueSizeDelta, valueSize, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedMosaicMetadataTransactionDTO {\n");
    sb.append("    signerPublicKey: ").append(toIndentedString(signerPublicKey)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetAddress: ").append(toIndentedString(targetAddress)).append("\n");
    sb.append("    scopedMetadataKey: ").append(toIndentedString(scopedMetadataKey)).append("\n");
    sb.append("    targetMosaicId: ").append(toIndentedString(targetMosaicId)).append("\n");
    sb.append("    valueSizeDelta: ").append(toIndentedString(valueSizeDelta)).append("\n");
    sb.append("    valueSize: ").append(toIndentedString(valueSize)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("signerPublicKey");
    openapiFields.add("version");
    openapiFields.add("network");
    openapiFields.add("type");
    openapiFields.add("targetAddress");
    openapiFields.add("scopedMetadataKey");
    openapiFields.add("targetMosaicId");
    openapiFields.add("valueSizeDelta");
    openapiFields.add("valueSize");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("signerPublicKey");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("targetAddress");
    openapiRequiredFields.add("scopedMetadataKey");
    openapiRequiredFields.add("targetMosaicId");
    openapiRequiredFields.add("valueSizeDelta");
    openapiRequiredFields.add("valueSize");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EmbeddedMosaicMetadataTransactionDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmbeddedMosaicMetadataTransactionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmbeddedMosaicMetadataTransactionDTO is not found in the empty JSON string", EmbeddedMosaicMetadataTransactionDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmbeddedMosaicMetadataTransactionDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmbeddedMosaicMetadataTransactionDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmbeddedMosaicMetadataTransactionDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("signerPublicKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerPublicKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerPublicKey").toString()));
      }
      // validate the required field `network`
      NetworkTypeEnum.validateJsonElement(jsonObj.get("network"));
      if (!jsonObj.get("targetAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetAddress").toString()));
      }
      if (!jsonObj.get("scopedMetadataKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopedMetadataKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scopedMetadataKey").toString()));
      }
      if (!jsonObj.get("targetMosaicId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetMosaicId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetMosaicId").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmbeddedMosaicMetadataTransactionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmbeddedMosaicMetadataTransactionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmbeddedMosaicMetadataTransactionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmbeddedMosaicMetadataTransactionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EmbeddedMosaicMetadataTransactionDTO>() {
           @Override
           public void write(JsonWriter out, EmbeddedMosaicMetadataTransactionDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmbeddedMosaicMetadataTransactionDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmbeddedMosaicMetadataTransactionDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmbeddedMosaicMetadataTransactionDTO
  * @throws IOException if the JSON string is invalid with respect to EmbeddedMosaicMetadataTransactionDTO
  */
  public static EmbeddedMosaicMetadataTransactionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmbeddedMosaicMetadataTransactionDTO.class);
  }

 /**
  * Convert an instance of EmbeddedMosaicMetadataTransactionDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

