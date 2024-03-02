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
 * MosaicDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class MosaicDTO {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SUPPLY = "supply";
  @SerializedName(SERIALIZED_NAME_SUPPLY)
  private String supply;

  public static final String SERIALIZED_NAME_START_HEIGHT = "startHeight";
  @SerializedName(SERIALIZED_NAME_START_HEIGHT)
  private String startHeight;

  public static final String SERIALIZED_NAME_OWNER_ADDRESS = "ownerAddress";
  @SerializedName(SERIALIZED_NAME_OWNER_ADDRESS)
  private String ownerAddress;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Long revision;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private Integer flags;

  public static final String SERIALIZED_NAME_DIVISIBILITY = "divisibility";
  @SerializedName(SERIALIZED_NAME_DIVISIBILITY)
  private Integer divisibility;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public MosaicDTO() {
  }

  public MosaicDTO version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the state
   * @return version
  **/
  @javax.annotation.Nonnull
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  public MosaicDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Mosaic identifier.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public MosaicDTO supply(String supply) {
    this.supply = supply;
    return this;
  }

   /**
   * Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
   * @return supply
  **/
  @javax.annotation.Nonnull
  public String getSupply() {
    return supply;
  }

  public void setSupply(String supply) {
    this.supply = supply;
  }


  public MosaicDTO startHeight(String startHeight) {
    this.startHeight = startHeight;
    return this;
  }

   /**
   * Height of the blockchain.
   * @return startHeight
  **/
  @javax.annotation.Nonnull
  public String getStartHeight() {
    return startHeight;
  }

  public void setStartHeight(String startHeight) {
    this.startHeight = startHeight;
  }


  public MosaicDTO ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * Address encoded using a 32-character set.
   * @return ownerAddress
  **/
  @javax.annotation.Nonnull
  public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }


  public MosaicDTO revision(Long revision) {
    this.revision = revision;
    return this;
  }

   /**
   * A number that allows uint 32 values.
   * @return revision
  **/
  @javax.annotation.Nonnull
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }


  public MosaicDTO flags(Integer flags) {
    this.flags = flags;
    return this;
  }

   /**
   * - 0x00 (none) - No flags present. - 0x01 (supplyMutable) - Mosaic supports supply changes even when mosaic owner owns partial supply. - 0x02 (transferable) - Mosaic supports transfers between arbitrary accounts. When not set, mosaic can only be transferred to and from mosaic owner. - 0x04 (restrictable) - Mosaic supports custom restrictions configured by mosaic owner. - 0x08 (revokable) - Mosaic allows creator to revoke balances from another user. 
   * @return flags
  **/
  @javax.annotation.Nonnull
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }


  public MosaicDTO divisibility(Integer divisibility) {
    this.divisibility = divisibility;
    return this;
  }

   /**
   * Determines up to what decimal place the mosaic can be divided. Divisibility of 3 means that a mosaic can be divided into smallest parts of 0.001 mosaics. The divisibility must be in the range of 0 and 6. 
   * @return divisibility
  **/
  @javax.annotation.Nonnull
  public Integer getDivisibility() {
    return divisibility;
  }

  public void setDivisibility(Integer divisibility) {
    this.divisibility = divisibility;
  }


  public MosaicDTO duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration expressed in number of blocks.
   * @return duration
  **/
  @javax.annotation.Nonnull
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MosaicDTO mosaicDTO = (MosaicDTO) o;
    return Objects.equals(this.version, mosaicDTO.version) &&
        Objects.equals(this.id, mosaicDTO.id) &&
        Objects.equals(this.supply, mosaicDTO.supply) &&
        Objects.equals(this.startHeight, mosaicDTO.startHeight) &&
        Objects.equals(this.ownerAddress, mosaicDTO.ownerAddress) &&
        Objects.equals(this.revision, mosaicDTO.revision) &&
        Objects.equals(this.flags, mosaicDTO.flags) &&
        Objects.equals(this.divisibility, mosaicDTO.divisibility) &&
        Objects.equals(this.duration, mosaicDTO.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, id, supply, startHeight, ownerAddress, revision, flags, divisibility, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MosaicDTO {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
    sb.append("    startHeight: ").append(toIndentedString(startHeight)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    divisibility: ").append(toIndentedString(divisibility)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("id");
    openapiFields.add("supply");
    openapiFields.add("startHeight");
    openapiFields.add("ownerAddress");
    openapiFields.add("revision");
    openapiFields.add("flags");
    openapiFields.add("divisibility");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("supply");
    openapiRequiredFields.add("startHeight");
    openapiRequiredFields.add("ownerAddress");
    openapiRequiredFields.add("revision");
    openapiRequiredFields.add("flags");
    openapiRequiredFields.add("divisibility");
    openapiRequiredFields.add("duration");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MosaicDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MosaicDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MosaicDTO is not found in the empty JSON string", MosaicDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MosaicDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MosaicDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MosaicDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("supply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supply").toString()));
      }
      if (!jsonObj.get("startHeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startHeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startHeight").toString()));
      }
      if (!jsonObj.get("ownerAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerAddress").toString()));
      }
      if (!jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MosaicDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MosaicDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MosaicDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MosaicDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MosaicDTO>() {
           @Override
           public void write(JsonWriter out, MosaicDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MosaicDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MosaicDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MosaicDTO
  * @throws IOException if the JSON string is invalid with respect to MosaicDTO
  */
  public static MosaicDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MosaicDTO.class);
  }

 /**
  * Convert an instance of MosaicDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

