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
 * MultisigNetworkPropertiesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class MultisigNetworkPropertiesDTO {
  public static final String SERIALIZED_NAME_MAX_MULTISIG_DEPTH = "maxMultisigDepth";
  @SerializedName(SERIALIZED_NAME_MAX_MULTISIG_DEPTH)
  private String maxMultisigDepth;

  public static final String SERIALIZED_NAME_MAX_COSIGNATORIES_PER_ACCOUNT = "maxCosignatoriesPerAccount";
  @SerializedName(SERIALIZED_NAME_MAX_COSIGNATORIES_PER_ACCOUNT)
  private String maxCosignatoriesPerAccount;

  public static final String SERIALIZED_NAME_MAX_COSIGNED_ACCOUNTS_PER_ACCOUNT = "maxCosignedAccountsPerAccount";
  @SerializedName(SERIALIZED_NAME_MAX_COSIGNED_ACCOUNTS_PER_ACCOUNT)
  private String maxCosignedAccountsPerAccount;

  public MultisigNetworkPropertiesDTO() {
  }

  public MultisigNetworkPropertiesDTO maxMultisigDepth(String maxMultisigDepth) {
    this.maxMultisigDepth = maxMultisigDepth;
    return this;
  }

   /**
   * Maximum number of multisig levels.
   * @return maxMultisigDepth
  **/
  @javax.annotation.Nullable
  public String getMaxMultisigDepth() {
    return maxMultisigDepth;
  }

  public void setMaxMultisigDepth(String maxMultisigDepth) {
    this.maxMultisigDepth = maxMultisigDepth;
  }


  public MultisigNetworkPropertiesDTO maxCosignatoriesPerAccount(String maxCosignatoriesPerAccount) {
    this.maxCosignatoriesPerAccount = maxCosignatoriesPerAccount;
    return this;
  }

   /**
   * Maximum number of cosignatories per account.
   * @return maxCosignatoriesPerAccount
  **/
  @javax.annotation.Nullable
  public String getMaxCosignatoriesPerAccount() {
    return maxCosignatoriesPerAccount;
  }

  public void setMaxCosignatoriesPerAccount(String maxCosignatoriesPerAccount) {
    this.maxCosignatoriesPerAccount = maxCosignatoriesPerAccount;
  }


  public MultisigNetworkPropertiesDTO maxCosignedAccountsPerAccount(String maxCosignedAccountsPerAccount) {
    this.maxCosignedAccountsPerAccount = maxCosignedAccountsPerAccount;
    return this;
  }

   /**
   * Maximum number of accounts a single account can cosign.
   * @return maxCosignedAccountsPerAccount
  **/
  @javax.annotation.Nullable
  public String getMaxCosignedAccountsPerAccount() {
    return maxCosignedAccountsPerAccount;
  }

  public void setMaxCosignedAccountsPerAccount(String maxCosignedAccountsPerAccount) {
    this.maxCosignedAccountsPerAccount = maxCosignedAccountsPerAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultisigNetworkPropertiesDTO multisigNetworkPropertiesDTO = (MultisigNetworkPropertiesDTO) o;
    return Objects.equals(this.maxMultisigDepth, multisigNetworkPropertiesDTO.maxMultisigDepth) &&
        Objects.equals(this.maxCosignatoriesPerAccount, multisigNetworkPropertiesDTO.maxCosignatoriesPerAccount) &&
        Objects.equals(this.maxCosignedAccountsPerAccount, multisigNetworkPropertiesDTO.maxCosignedAccountsPerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxMultisigDepth, maxCosignatoriesPerAccount, maxCosignedAccountsPerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultisigNetworkPropertiesDTO {\n");
    sb.append("    maxMultisigDepth: ").append(toIndentedString(maxMultisigDepth)).append("\n");
    sb.append("    maxCosignatoriesPerAccount: ").append(toIndentedString(maxCosignatoriesPerAccount)).append("\n");
    sb.append("    maxCosignedAccountsPerAccount: ").append(toIndentedString(maxCosignedAccountsPerAccount)).append("\n");
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
    openapiFields.add("maxMultisigDepth");
    openapiFields.add("maxCosignatoriesPerAccount");
    openapiFields.add("maxCosignedAccountsPerAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultisigNetworkPropertiesDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultisigNetworkPropertiesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultisigNetworkPropertiesDTO is not found in the empty JSON string", MultisigNetworkPropertiesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultisigNetworkPropertiesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultisigNetworkPropertiesDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maxMultisigDepth") != null && !jsonObj.get("maxMultisigDepth").isJsonNull()) && !jsonObj.get("maxMultisigDepth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxMultisigDepth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxMultisigDepth").toString()));
      }
      if ((jsonObj.get("maxCosignatoriesPerAccount") != null && !jsonObj.get("maxCosignatoriesPerAccount").isJsonNull()) && !jsonObj.get("maxCosignatoriesPerAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxCosignatoriesPerAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxCosignatoriesPerAccount").toString()));
      }
      if ((jsonObj.get("maxCosignedAccountsPerAccount") != null && !jsonObj.get("maxCosignedAccountsPerAccount").isJsonNull()) && !jsonObj.get("maxCosignedAccountsPerAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxCosignedAccountsPerAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxCosignedAccountsPerAccount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultisigNetworkPropertiesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultisigNetworkPropertiesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultisigNetworkPropertiesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultisigNetworkPropertiesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MultisigNetworkPropertiesDTO>() {
           @Override
           public void write(JsonWriter out, MultisigNetworkPropertiesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultisigNetworkPropertiesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultisigNetworkPropertiesDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultisigNetworkPropertiesDTO
  * @throws IOException if the JSON string is invalid with respect to MultisigNetworkPropertiesDTO
  */
  public static MultisigNetworkPropertiesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultisigNetworkPropertiesDTO.class);
  }

 /**
  * Convert an instance of MultisigNetworkPropertiesDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

