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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MultisigAccountInfoDTO;

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
 * MultisigAccountGraphInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class MultisigAccountGraphInfoDTO {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_MULTISIG_ENTRIES = "multisigEntries";
  @SerializedName(SERIALIZED_NAME_MULTISIG_ENTRIES)
  private List<MultisigAccountInfoDTO> multisigEntries = new ArrayList<>();

  public MultisigAccountGraphInfoDTO() {
  }

  public MultisigAccountGraphInfoDTO level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Level of the multisig account.
   * @return level
  **/
  @javax.annotation.Nonnull
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public MultisigAccountGraphInfoDTO multisigEntries(List<MultisigAccountInfoDTO> multisigEntries) {
    this.multisigEntries = multisigEntries;
    return this;
  }

  public MultisigAccountGraphInfoDTO addMultisigEntriesItem(MultisigAccountInfoDTO multisigEntriesItem) {
    if (this.multisigEntries == null) {
      this.multisigEntries = new ArrayList<>();
    }
    this.multisigEntries.add(multisigEntriesItem);
    return this;
  }

   /**
   * Array of multisig accounts for this level.
   * @return multisigEntries
  **/
  @javax.annotation.Nonnull
  public List<MultisigAccountInfoDTO> getMultisigEntries() {
    return multisigEntries;
  }

  public void setMultisigEntries(List<MultisigAccountInfoDTO> multisigEntries) {
    this.multisigEntries = multisigEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultisigAccountGraphInfoDTO multisigAccountGraphInfoDTO = (MultisigAccountGraphInfoDTO) o;
    return Objects.equals(this.level, multisigAccountGraphInfoDTO.level) &&
        Objects.equals(this.multisigEntries, multisigAccountGraphInfoDTO.multisigEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, multisigEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultisigAccountGraphInfoDTO {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    multisigEntries: ").append(toIndentedString(multisigEntries)).append("\n");
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
    openapiFields.add("level");
    openapiFields.add("multisigEntries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("level");
    openapiRequiredFields.add("multisigEntries");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultisigAccountGraphInfoDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultisigAccountGraphInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultisigAccountGraphInfoDTO is not found in the empty JSON string", MultisigAccountGraphInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultisigAccountGraphInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultisigAccountGraphInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MultisigAccountGraphInfoDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("multisigEntries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `multisigEntries` to be an array in the JSON string but got `%s`", jsonObj.get("multisigEntries").toString()));
      }

      JsonArray jsonArraymultisigEntries = jsonObj.getAsJsonArray("multisigEntries");
      // validate the required field `multisigEntries` (array)
      for (int i = 0; i < jsonArraymultisigEntries.size(); i++) {
        MultisigAccountInfoDTO.validateJsonElement(jsonArraymultisigEntries.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultisigAccountGraphInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultisigAccountGraphInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultisigAccountGraphInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultisigAccountGraphInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MultisigAccountGraphInfoDTO>() {
           @Override
           public void write(JsonWriter out, MultisigAccountGraphInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultisigAccountGraphInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultisigAccountGraphInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultisigAccountGraphInfoDTO
  * @throws IOException if the JSON string is invalid with respect to MultisigAccountGraphInfoDTO
  */
  public static MultisigAccountGraphInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultisigAccountGraphInfoDTO.class);
  }

 /**
  * Convert an instance of MultisigAccountGraphInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

