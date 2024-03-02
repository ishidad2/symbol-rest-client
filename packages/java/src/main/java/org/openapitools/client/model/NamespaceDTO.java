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
import org.openapitools.client.model.AliasDTO;
import org.openapitools.client.model.NamespaceRegistrationTypeEnum;

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
 * NamespaceDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class NamespaceDTO {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_REGISTRATION_TYPE = "registrationType";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_TYPE)
  private NamespaceRegistrationTypeEnum registrationType;

  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public static final String SERIALIZED_NAME_LEVEL0 = "level0";
  @SerializedName(SERIALIZED_NAME_LEVEL0)
  private String level0;

  public static final String SERIALIZED_NAME_LEVEL1 = "level1";
  @SerializedName(SERIALIZED_NAME_LEVEL1)
  private String level1;

  public static final String SERIALIZED_NAME_LEVEL2 = "level2";
  @SerializedName(SERIALIZED_NAME_LEVEL2)
  private String level2;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private AliasDTO alias;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_OWNER_ADDRESS = "ownerAddress";
  @SerializedName(SERIALIZED_NAME_OWNER_ADDRESS)
  private String ownerAddress;

  public static final String SERIALIZED_NAME_START_HEIGHT = "startHeight";
  @SerializedName(SERIALIZED_NAME_START_HEIGHT)
  private String startHeight;

  public static final String SERIALIZED_NAME_END_HEIGHT = "endHeight";
  @SerializedName(SERIALIZED_NAME_END_HEIGHT)
  private String endHeight;

  public NamespaceDTO() {
  }

  public NamespaceDTO version(Integer version) {
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


  public NamespaceDTO registrationType(NamespaceRegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
    return this;
  }

   /**
   * Get registrationType
   * @return registrationType
  **/
  @javax.annotation.Nonnull
  public NamespaceRegistrationTypeEnum getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(NamespaceRegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
  }


  public NamespaceDTO depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Level of the namespace.
   * @return depth
  **/
  @javax.annotation.Nonnull
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public NamespaceDTO level0(String level0) {
    this.level0 = level0;
    return this;
  }

   /**
   * Namespace identifier.
   * @return level0
  **/
  @javax.annotation.Nonnull
  public String getLevel0() {
    return level0;
  }

  public void setLevel0(String level0) {
    this.level0 = level0;
  }


  public NamespaceDTO level1(String level1) {
    this.level1 = level1;
    return this;
  }

   /**
   * Namespace identifier.
   * @return level1
  **/
  @javax.annotation.Nullable
  public String getLevel1() {
    return level1;
  }

  public void setLevel1(String level1) {
    this.level1 = level1;
  }


  public NamespaceDTO level2(String level2) {
    this.level2 = level2;
    return this;
  }

   /**
   * Namespace identifier.
   * @return level2
  **/
  @javax.annotation.Nullable
  public String getLevel2() {
    return level2;
  }

  public void setLevel2(String level2) {
    this.level2 = level2;
  }


  public NamespaceDTO alias(AliasDTO alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nonnull
  public AliasDTO getAlias() {
    return alias;
  }

  public void setAlias(AliasDTO alias) {
    this.alias = alias;
  }


  public NamespaceDTO parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Namespace identifier.
   * @return parentId
  **/
  @javax.annotation.Nonnull
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public NamespaceDTO ownerAddress(String ownerAddress) {
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


  public NamespaceDTO startHeight(String startHeight) {
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


  public NamespaceDTO endHeight(String endHeight) {
    this.endHeight = endHeight;
    return this;
  }

   /**
   * Height of the blockchain.
   * @return endHeight
  **/
  @javax.annotation.Nonnull
  public String getEndHeight() {
    return endHeight;
  }

  public void setEndHeight(String endHeight) {
    this.endHeight = endHeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceDTO namespaceDTO = (NamespaceDTO) o;
    return Objects.equals(this.version, namespaceDTO.version) &&
        Objects.equals(this.registrationType, namespaceDTO.registrationType) &&
        Objects.equals(this.depth, namespaceDTO.depth) &&
        Objects.equals(this.level0, namespaceDTO.level0) &&
        Objects.equals(this.level1, namespaceDTO.level1) &&
        Objects.equals(this.level2, namespaceDTO.level2) &&
        Objects.equals(this.alias, namespaceDTO.alias) &&
        Objects.equals(this.parentId, namespaceDTO.parentId) &&
        Objects.equals(this.ownerAddress, namespaceDTO.ownerAddress) &&
        Objects.equals(this.startHeight, namespaceDTO.startHeight) &&
        Objects.equals(this.endHeight, namespaceDTO.endHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, registrationType, depth, level0, level1, level2, alias, parentId, ownerAddress, startHeight, endHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceDTO {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    registrationType: ").append(toIndentedString(registrationType)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    level0: ").append(toIndentedString(level0)).append("\n");
    sb.append("    level1: ").append(toIndentedString(level1)).append("\n");
    sb.append("    level2: ").append(toIndentedString(level2)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    startHeight: ").append(toIndentedString(startHeight)).append("\n");
    sb.append("    endHeight: ").append(toIndentedString(endHeight)).append("\n");
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
    openapiFields.add("registrationType");
    openapiFields.add("depth");
    openapiFields.add("level0");
    openapiFields.add("level1");
    openapiFields.add("level2");
    openapiFields.add("alias");
    openapiFields.add("parentId");
    openapiFields.add("ownerAddress");
    openapiFields.add("startHeight");
    openapiFields.add("endHeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("registrationType");
    openapiRequiredFields.add("depth");
    openapiRequiredFields.add("level0");
    openapiRequiredFields.add("alias");
    openapiRequiredFields.add("parentId");
    openapiRequiredFields.add("ownerAddress");
    openapiRequiredFields.add("startHeight");
    openapiRequiredFields.add("endHeight");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NamespaceDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NamespaceDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NamespaceDTO is not found in the empty JSON string", NamespaceDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NamespaceDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NamespaceDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NamespaceDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `registrationType`
      NamespaceRegistrationTypeEnum.validateJsonElement(jsonObj.get("registrationType"));
      if (!jsonObj.get("level0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level0").toString()));
      }
      if ((jsonObj.get("level1") != null && !jsonObj.get("level1").isJsonNull()) && !jsonObj.get("level1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level1").toString()));
      }
      if ((jsonObj.get("level2") != null && !jsonObj.get("level2").isJsonNull()) && !jsonObj.get("level2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level2").toString()));
      }
      // validate the required field `alias`
      AliasDTO.validateJsonElement(jsonObj.get("alias"));
      if (!jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if (!jsonObj.get("ownerAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerAddress").toString()));
      }
      if (!jsonObj.get("startHeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startHeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startHeight").toString()));
      }
      if (!jsonObj.get("endHeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endHeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endHeight").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NamespaceDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NamespaceDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NamespaceDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NamespaceDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<NamespaceDTO>() {
           @Override
           public void write(JsonWriter out, NamespaceDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NamespaceDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NamespaceDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NamespaceDTO
  * @throws IOException if the JSON string is invalid with respect to NamespaceDTO
  */
  public static NamespaceDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NamespaceDTO.class);
  }

 /**
  * Convert an instance of NamespaceDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

