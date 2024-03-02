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
import org.openapitools.client.model.FinalizedBlockDTO;

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
 * ChainInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class ChainInfoDTO {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_SCORE_HIGH = "scoreHigh";
  @SerializedName(SERIALIZED_NAME_SCORE_HIGH)
  private String scoreHigh;

  public static final String SERIALIZED_NAME_SCORE_LOW = "scoreLow";
  @SerializedName(SERIALIZED_NAME_SCORE_LOW)
  private String scoreLow;

  public static final String SERIALIZED_NAME_LATEST_FINALIZED_BLOCK = "latestFinalizedBlock";
  @SerializedName(SERIALIZED_NAME_LATEST_FINALIZED_BLOCK)
  private FinalizedBlockDTO latestFinalizedBlock;

  public ChainInfoDTO() {
  }

  public ChainInfoDTO height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the blockchain.
   * @return height
  **/
  @javax.annotation.Nonnull
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }


  public ChainInfoDTO scoreHigh(String scoreHigh) {
    this.scoreHigh = scoreHigh;
    return this;
  }

   /**
   * Score of the blockchain. During synchronization, nodes try to get the blockchain with highest score in the network. 
   * @return scoreHigh
  **/
  @javax.annotation.Nonnull
  public String getScoreHigh() {
    return scoreHigh;
  }

  public void setScoreHigh(String scoreHigh) {
    this.scoreHigh = scoreHigh;
  }


  public ChainInfoDTO scoreLow(String scoreLow) {
    this.scoreLow = scoreLow;
    return this;
  }

   /**
   * Score of the blockchain. During synchronization, nodes try to get the blockchain with highest score in the network. 
   * @return scoreLow
  **/
  @javax.annotation.Nonnull
  public String getScoreLow() {
    return scoreLow;
  }

  public void setScoreLow(String scoreLow) {
    this.scoreLow = scoreLow;
  }


  public ChainInfoDTO latestFinalizedBlock(FinalizedBlockDTO latestFinalizedBlock) {
    this.latestFinalizedBlock = latestFinalizedBlock;
    return this;
  }

   /**
   * Get latestFinalizedBlock
   * @return latestFinalizedBlock
  **/
  @javax.annotation.Nonnull
  public FinalizedBlockDTO getLatestFinalizedBlock() {
    return latestFinalizedBlock;
  }

  public void setLatestFinalizedBlock(FinalizedBlockDTO latestFinalizedBlock) {
    this.latestFinalizedBlock = latestFinalizedBlock;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainInfoDTO chainInfoDTO = (ChainInfoDTO) o;
    return Objects.equals(this.height, chainInfoDTO.height) &&
        Objects.equals(this.scoreHigh, chainInfoDTO.scoreHigh) &&
        Objects.equals(this.scoreLow, chainInfoDTO.scoreLow) &&
        Objects.equals(this.latestFinalizedBlock, chainInfoDTO.latestFinalizedBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, scoreHigh, scoreLow, latestFinalizedBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainInfoDTO {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    scoreHigh: ").append(toIndentedString(scoreHigh)).append("\n");
    sb.append("    scoreLow: ").append(toIndentedString(scoreLow)).append("\n");
    sb.append("    latestFinalizedBlock: ").append(toIndentedString(latestFinalizedBlock)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("scoreHigh");
    openapiFields.add("scoreLow");
    openapiFields.add("latestFinalizedBlock");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("scoreHigh");
    openapiRequiredFields.add("scoreLow");
    openapiRequiredFields.add("latestFinalizedBlock");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChainInfoDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChainInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChainInfoDTO is not found in the empty JSON string", ChainInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChainInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChainInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChainInfoDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      if (!jsonObj.get("scoreHigh").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreHigh` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreHigh").toString()));
      }
      if (!jsonObj.get("scoreLow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreLow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreLow").toString()));
      }
      // validate the required field `latestFinalizedBlock`
      FinalizedBlockDTO.validateJsonElement(jsonObj.get("latestFinalizedBlock"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChainInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChainInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChainInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChainInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ChainInfoDTO>() {
           @Override
           public void write(JsonWriter out, ChainInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChainInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChainInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChainInfoDTO
  * @throws IOException if the JSON string is invalid with respect to ChainInfoDTO
  */
  public static ChainInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChainInfoDTO.class);
  }

 /**
  * Convert an instance of ChainInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

