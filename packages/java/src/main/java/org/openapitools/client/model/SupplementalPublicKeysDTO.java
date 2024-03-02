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
import org.openapitools.client.model.AccountLinkPublicKeyDTO;
import org.openapitools.client.model.AccountLinkVotingKeysDTO;

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
 * SupplementalPublicKeysDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class SupplementalPublicKeysDTO {
  public static final String SERIALIZED_NAME_LINKED = "linked";
  @SerializedName(SERIALIZED_NAME_LINKED)
  private AccountLinkPublicKeyDTO linked;

  public static final String SERIALIZED_NAME_NODE = "node";
  @SerializedName(SERIALIZED_NAME_NODE)
  private AccountLinkPublicKeyDTO node;

  public static final String SERIALIZED_NAME_VRF = "vrf";
  @SerializedName(SERIALIZED_NAME_VRF)
  private AccountLinkPublicKeyDTO vrf;

  public static final String SERIALIZED_NAME_VOTING = "voting";
  @SerializedName(SERIALIZED_NAME_VOTING)
  private AccountLinkVotingKeysDTO voting;

  public SupplementalPublicKeysDTO() {
  }

  public SupplementalPublicKeysDTO linked(AccountLinkPublicKeyDTO linked) {
    this.linked = linked;
    return this;
  }

   /**
   * Get linked
   * @return linked
  **/
  @javax.annotation.Nullable
  public AccountLinkPublicKeyDTO getLinked() {
    return linked;
  }

  public void setLinked(AccountLinkPublicKeyDTO linked) {
    this.linked = linked;
  }


  public SupplementalPublicKeysDTO node(AccountLinkPublicKeyDTO node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @javax.annotation.Nullable
  public AccountLinkPublicKeyDTO getNode() {
    return node;
  }

  public void setNode(AccountLinkPublicKeyDTO node) {
    this.node = node;
  }


  public SupplementalPublicKeysDTO vrf(AccountLinkPublicKeyDTO vrf) {
    this.vrf = vrf;
    return this;
  }

   /**
   * Get vrf
   * @return vrf
  **/
  @javax.annotation.Nullable
  public AccountLinkPublicKeyDTO getVrf() {
    return vrf;
  }

  public void setVrf(AccountLinkPublicKeyDTO vrf) {
    this.vrf = vrf;
  }


  public SupplementalPublicKeysDTO voting(AccountLinkVotingKeysDTO voting) {
    this.voting = voting;
    return this;
  }

   /**
   * Get voting
   * @return voting
  **/
  @javax.annotation.Nullable
  public AccountLinkVotingKeysDTO getVoting() {
    return voting;
  }

  public void setVoting(AccountLinkVotingKeysDTO voting) {
    this.voting = voting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplementalPublicKeysDTO supplementalPublicKeysDTO = (SupplementalPublicKeysDTO) o;
    return Objects.equals(this.linked, supplementalPublicKeysDTO.linked) &&
        Objects.equals(this.node, supplementalPublicKeysDTO.node) &&
        Objects.equals(this.vrf, supplementalPublicKeysDTO.vrf) &&
        Objects.equals(this.voting, supplementalPublicKeysDTO.voting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linked, node, vrf, voting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalPublicKeysDTO {\n");
    sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
    sb.append("    voting: ").append(toIndentedString(voting)).append("\n");
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
    openapiFields.add("linked");
    openapiFields.add("node");
    openapiFields.add("vrf");
    openapiFields.add("voting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SupplementalPublicKeysDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupplementalPublicKeysDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupplementalPublicKeysDTO is not found in the empty JSON string", SupplementalPublicKeysDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupplementalPublicKeysDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupplementalPublicKeysDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `linked`
      if (jsonObj.get("linked") != null && !jsonObj.get("linked").isJsonNull()) {
        AccountLinkPublicKeyDTO.validateJsonElement(jsonObj.get("linked"));
      }
      // validate the optional field `node`
      if (jsonObj.get("node") != null && !jsonObj.get("node").isJsonNull()) {
        AccountLinkPublicKeyDTO.validateJsonElement(jsonObj.get("node"));
      }
      // validate the optional field `vrf`
      if (jsonObj.get("vrf") != null && !jsonObj.get("vrf").isJsonNull()) {
        AccountLinkPublicKeyDTO.validateJsonElement(jsonObj.get("vrf"));
      }
      // validate the optional field `voting`
      if (jsonObj.get("voting") != null && !jsonObj.get("voting").isJsonNull()) {
        AccountLinkVotingKeysDTO.validateJsonElement(jsonObj.get("voting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupplementalPublicKeysDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupplementalPublicKeysDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupplementalPublicKeysDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupplementalPublicKeysDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SupplementalPublicKeysDTO>() {
           @Override
           public void write(JsonWriter out, SupplementalPublicKeysDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupplementalPublicKeysDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SupplementalPublicKeysDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SupplementalPublicKeysDTO
  * @throws IOException if the JSON string is invalid with respect to SupplementalPublicKeysDTO
  */
  public static SupplementalPublicKeysDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupplementalPublicKeysDTO.class);
  }

 /**
  * Convert an instance of SupplementalPublicKeysDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

