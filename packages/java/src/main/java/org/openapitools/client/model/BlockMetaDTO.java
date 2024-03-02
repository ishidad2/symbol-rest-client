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
 * BlockMetaDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class BlockMetaDTO {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_TOTAL_FEE = "totalFee";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEE)
  private String totalFee;

  public static final String SERIALIZED_NAME_GENERATION_HASH = "generationHash";
  @SerializedName(SERIALIZED_NAME_GENERATION_HASH)
  private String generationHash;

  public static final String SERIALIZED_NAME_STATE_HASH_SUB_CACHE_MERKLE_ROOTS = "stateHashSubCacheMerkleRoots";
  @SerializedName(SERIALIZED_NAME_STATE_HASH_SUB_CACHE_MERKLE_ROOTS)
  private List<String> stateHashSubCacheMerkleRoots = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_TRANSACTIONS_COUNT = "totalTransactionsCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSACTIONS_COUNT)
  private Integer totalTransactionsCount;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public static final String SERIALIZED_NAME_STATEMENTS_COUNT = "statementsCount";
  @SerializedName(SERIALIZED_NAME_STATEMENTS_COUNT)
  private Integer statementsCount;

  public BlockMetaDTO() {
  }

  public BlockMetaDTO hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nonnull
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  public BlockMetaDTO totalFee(String totalFee) {
    this.totalFee = totalFee;
    return this;
  }

   /**
   * Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
   * @return totalFee
  **/
  @javax.annotation.Nonnull
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }


  public BlockMetaDTO generationHash(String generationHash) {
    this.generationHash = generationHash;
    return this;
  }

   /**
   * Get generationHash
   * @return generationHash
  **/
  @javax.annotation.Nonnull
  public String getGenerationHash() {
    return generationHash;
  }

  public void setGenerationHash(String generationHash) {
    this.generationHash = generationHash;
  }


  public BlockMetaDTO stateHashSubCacheMerkleRoots(List<String> stateHashSubCacheMerkleRoots) {
    this.stateHashSubCacheMerkleRoots = stateHashSubCacheMerkleRoots;
    return this;
  }

  public BlockMetaDTO addStateHashSubCacheMerkleRootsItem(String stateHashSubCacheMerkleRootsItem) {
    if (this.stateHashSubCacheMerkleRoots == null) {
      this.stateHashSubCacheMerkleRoots = new ArrayList<>();
    }
    this.stateHashSubCacheMerkleRoots.add(stateHashSubCacheMerkleRootsItem);
    return this;
  }

   /**
   * Get stateHashSubCacheMerkleRoots
   * @return stateHashSubCacheMerkleRoots
  **/
  @javax.annotation.Nonnull
  public List<String> getStateHashSubCacheMerkleRoots() {
    return stateHashSubCacheMerkleRoots;
  }

  public void setStateHashSubCacheMerkleRoots(List<String> stateHashSubCacheMerkleRoots) {
    this.stateHashSubCacheMerkleRoots = stateHashSubCacheMerkleRoots;
  }


  public BlockMetaDTO totalTransactionsCount(Integer totalTransactionsCount) {
    this.totalTransactionsCount = totalTransactionsCount;
    return this;
  }

   /**
   * Total number of [transactions](https://docs.symbolplatform.com/concepts/transaction.html) confirmed in this block, including *embedded* transactions (i.e. transactions contained within aggregate transactions). 
   * @return totalTransactionsCount
  **/
  @javax.annotation.Nonnull
  public Integer getTotalTransactionsCount() {
    return totalTransactionsCount;
  }

  public void setTotalTransactionsCount(Integer totalTransactionsCount) {
    this.totalTransactionsCount = totalTransactionsCount;
  }


  public BlockMetaDTO transactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Number of [transactions](https://docs.symbolplatform.com/concepts/transaction.html) confirmed in this block. This does not count *embedded* transactions (i.e. transactions contained within aggregate transactions). 
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  public Integer getTransactionsCount() {
    return transactionsCount;
  }

  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  public BlockMetaDTO statementsCount(Integer statementsCount) {
    this.statementsCount = statementsCount;
    return this;
  }

   /**
   * Number of statements (of any kind) present in this block. Bear in mind that some of them (like [resolution statements](https://docs.symbolplatform.com/concepts/receipt.html#resolution-statement)) are triggered by transactions present in the block, but in general, [transaction statements](https://docs.symbolplatform.com/concepts/receipt.html#transaction-statement) are not. 
   * @return statementsCount
  **/
  @javax.annotation.Nonnull
  public Integer getStatementsCount() {
    return statementsCount;
  }

  public void setStatementsCount(Integer statementsCount) {
    this.statementsCount = statementsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockMetaDTO blockMetaDTO = (BlockMetaDTO) o;
    return Objects.equals(this.hash, blockMetaDTO.hash) &&
        Objects.equals(this.totalFee, blockMetaDTO.totalFee) &&
        Objects.equals(this.generationHash, blockMetaDTO.generationHash) &&
        Objects.equals(this.stateHashSubCacheMerkleRoots, blockMetaDTO.stateHashSubCacheMerkleRoots) &&
        Objects.equals(this.totalTransactionsCount, blockMetaDTO.totalTransactionsCount) &&
        Objects.equals(this.transactionsCount, blockMetaDTO.transactionsCount) &&
        Objects.equals(this.statementsCount, blockMetaDTO.statementsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, totalFee, generationHash, stateHashSubCacheMerkleRoots, totalTransactionsCount, transactionsCount, statementsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockMetaDTO {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    generationHash: ").append(toIndentedString(generationHash)).append("\n");
    sb.append("    stateHashSubCacheMerkleRoots: ").append(toIndentedString(stateHashSubCacheMerkleRoots)).append("\n");
    sb.append("    totalTransactionsCount: ").append(toIndentedString(totalTransactionsCount)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    statementsCount: ").append(toIndentedString(statementsCount)).append("\n");
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
    openapiFields.add("hash");
    openapiFields.add("totalFee");
    openapiFields.add("generationHash");
    openapiFields.add("stateHashSubCacheMerkleRoots");
    openapiFields.add("totalTransactionsCount");
    openapiFields.add("transactionsCount");
    openapiFields.add("statementsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hash");
    openapiRequiredFields.add("totalFee");
    openapiRequiredFields.add("generationHash");
    openapiRequiredFields.add("stateHashSubCacheMerkleRoots");
    openapiRequiredFields.add("totalTransactionsCount");
    openapiRequiredFields.add("transactionsCount");
    openapiRequiredFields.add("statementsCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockMetaDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockMetaDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockMetaDTO is not found in the empty JSON string", BlockMetaDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockMetaDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockMetaDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlockMetaDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
      if (!jsonObj.get("totalFee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalFee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalFee").toString()));
      }
      if (!jsonObj.get("generationHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generationHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generationHash").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("stateHashSubCacheMerkleRoots") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("stateHashSubCacheMerkleRoots").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateHashSubCacheMerkleRoots` to be an array in the JSON string but got `%s`", jsonObj.get("stateHashSubCacheMerkleRoots").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockMetaDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockMetaDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockMetaDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockMetaDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockMetaDTO>() {
           @Override
           public void write(JsonWriter out, BlockMetaDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockMetaDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockMetaDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockMetaDTO
  * @throws IOException if the JSON string is invalid with respect to BlockMetaDTO
  */
  public static BlockMetaDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockMetaDTO.class);
  }

 /**
  * Convert an instance of BlockMetaDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

