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
 * SecretLockNetworkPropertiesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class SecretLockNetworkPropertiesDTO {
  public static final String SERIALIZED_NAME_MAX_SECRET_LOCK_DURATION = "maxSecretLockDuration";
  @SerializedName(SERIALIZED_NAME_MAX_SECRET_LOCK_DURATION)
  private String maxSecretLockDuration;

  public static final String SERIALIZED_NAME_MIN_PROOF_SIZE = "minProofSize";
  @SerializedName(SERIALIZED_NAME_MIN_PROOF_SIZE)
  private String minProofSize;

  public static final String SERIALIZED_NAME_MAX_PROOF_SIZE = "maxProofSize";
  @SerializedName(SERIALIZED_NAME_MAX_PROOF_SIZE)
  private String maxProofSize;

  public SecretLockNetworkPropertiesDTO() {
  }

  public SecretLockNetworkPropertiesDTO maxSecretLockDuration(String maxSecretLockDuration) {
    this.maxSecretLockDuration = maxSecretLockDuration;
    return this;
  }

   /**
   * Maximum number of blocks for which a secret lock can exist.
   * @return maxSecretLockDuration
  **/
  @javax.annotation.Nullable
  public String getMaxSecretLockDuration() {
    return maxSecretLockDuration;
  }

  public void setMaxSecretLockDuration(String maxSecretLockDuration) {
    this.maxSecretLockDuration = maxSecretLockDuration;
  }


  public SecretLockNetworkPropertiesDTO minProofSize(String minProofSize) {
    this.minProofSize = minProofSize;
    return this;
  }

   /**
   * Minimum size of a proof in bytes.
   * @return minProofSize
  **/
  @javax.annotation.Nullable
  public String getMinProofSize() {
    return minProofSize;
  }

  public void setMinProofSize(String minProofSize) {
    this.minProofSize = minProofSize;
  }


  public SecretLockNetworkPropertiesDTO maxProofSize(String maxProofSize) {
    this.maxProofSize = maxProofSize;
    return this;
  }

   /**
   * Maximum size of a proof in bytes.
   * @return maxProofSize
  **/
  @javax.annotation.Nullable
  public String getMaxProofSize() {
    return maxProofSize;
  }

  public void setMaxProofSize(String maxProofSize) {
    this.maxProofSize = maxProofSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretLockNetworkPropertiesDTO secretLockNetworkPropertiesDTO = (SecretLockNetworkPropertiesDTO) o;
    return Objects.equals(this.maxSecretLockDuration, secretLockNetworkPropertiesDTO.maxSecretLockDuration) &&
        Objects.equals(this.minProofSize, secretLockNetworkPropertiesDTO.minProofSize) &&
        Objects.equals(this.maxProofSize, secretLockNetworkPropertiesDTO.maxProofSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSecretLockDuration, minProofSize, maxProofSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretLockNetworkPropertiesDTO {\n");
    sb.append("    maxSecretLockDuration: ").append(toIndentedString(maxSecretLockDuration)).append("\n");
    sb.append("    minProofSize: ").append(toIndentedString(minProofSize)).append("\n");
    sb.append("    maxProofSize: ").append(toIndentedString(maxProofSize)).append("\n");
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
    openapiFields.add("maxSecretLockDuration");
    openapiFields.add("minProofSize");
    openapiFields.add("maxProofSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SecretLockNetworkPropertiesDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecretLockNetworkPropertiesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecretLockNetworkPropertiesDTO is not found in the empty JSON string", SecretLockNetworkPropertiesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SecretLockNetworkPropertiesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecretLockNetworkPropertiesDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maxSecretLockDuration") != null && !jsonObj.get("maxSecretLockDuration").isJsonNull()) && !jsonObj.get("maxSecretLockDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxSecretLockDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxSecretLockDuration").toString()));
      }
      if ((jsonObj.get("minProofSize") != null && !jsonObj.get("minProofSize").isJsonNull()) && !jsonObj.get("minProofSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minProofSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minProofSize").toString()));
      }
      if ((jsonObj.get("maxProofSize") != null && !jsonObj.get("maxProofSize").isJsonNull()) && !jsonObj.get("maxProofSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxProofSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxProofSize").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecretLockNetworkPropertiesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecretLockNetworkPropertiesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecretLockNetworkPropertiesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecretLockNetworkPropertiesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SecretLockNetworkPropertiesDTO>() {
           @Override
           public void write(JsonWriter out, SecretLockNetworkPropertiesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecretLockNetworkPropertiesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecretLockNetworkPropertiesDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecretLockNetworkPropertiesDTO
  * @throws IOException if the JSON string is invalid with respect to SecretLockNetworkPropertiesDTO
  */
  public static SecretLockNetworkPropertiesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecretLockNetworkPropertiesDTO.class);
  }

 /**
  * Convert an instance of SecretLockNetworkPropertiesDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

