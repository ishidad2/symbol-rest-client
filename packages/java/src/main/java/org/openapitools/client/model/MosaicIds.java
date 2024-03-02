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
 * MosaicIds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class MosaicIds {
  public static final String SERIALIZED_NAME_MOSAIC_IDS = "mosaicIds";
  @SerializedName(SERIALIZED_NAME_MOSAIC_IDS)
  private List<String> mosaicIds;

  public MosaicIds() {
  }

  public MosaicIds mosaicIds(List<String> mosaicIds) {
    this.mosaicIds = mosaicIds;
    return this;
  }

  public MosaicIds addMosaicIdsItem(String mosaicIdsItem) {
    if (this.mosaicIds == null) {
      this.mosaicIds = new ArrayList<>();
    }
    this.mosaicIds.add(mosaicIdsItem);
    return this;
  }

   /**
   * Array of mosaic identifiers.
   * @return mosaicIds
  **/
  @javax.annotation.Nullable
  public List<String> getMosaicIds() {
    return mosaicIds;
  }

  public void setMosaicIds(List<String> mosaicIds) {
    this.mosaicIds = mosaicIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MosaicIds mosaicIds = (MosaicIds) o;
    return Objects.equals(this.mosaicIds, mosaicIds.mosaicIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mosaicIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MosaicIds {\n");
    sb.append("    mosaicIds: ").append(toIndentedString(mosaicIds)).append("\n");
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
    openapiFields.add("mosaicIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MosaicIds
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MosaicIds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MosaicIds is not found in the empty JSON string", MosaicIds.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MosaicIds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MosaicIds` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("mosaicIds") != null && !jsonObj.get("mosaicIds").isJsonNull() && !jsonObj.get("mosaicIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mosaicIds` to be an array in the JSON string but got `%s`", jsonObj.get("mosaicIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MosaicIds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MosaicIds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MosaicIds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MosaicIds.class));

       return (TypeAdapter<T>) new TypeAdapter<MosaicIds>() {
           @Override
           public void write(JsonWriter out, MosaicIds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MosaicIds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MosaicIds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MosaicIds
  * @throws IOException if the JSON string is invalid with respect to MosaicIds
  */
  public static MosaicIds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MosaicIds.class);
  }

 /**
  * Convert an instance of MosaicIds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

