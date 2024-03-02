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
import org.openapitools.client.model.MerkleTreeBranchLinkDTO;
import org.openapitools.client.model.MerkleTreeNodeTypeEnum;

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
 * Merkle tree branch node.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class MerkleTreeBranchDTO {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private MerkleTreeNodeTypeEnum type;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_ENCODED_PATH = "encodedPath";
  @SerializedName(SERIALIZED_NAME_ENCODED_PATH)
  private String encodedPath;

  public static final String SERIALIZED_NAME_NIBBLE_COUNT = "nibbleCount";
  @SerializedName(SERIALIZED_NAME_NIBBLE_COUNT)
  private Integer nibbleCount;

  public static final String SERIALIZED_NAME_LINK_MASK = "linkMask";
  @SerializedName(SERIALIZED_NAME_LINK_MASK)
  private String linkMask;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<MerkleTreeBranchLinkDTO> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_BRANCH_HASH = "branchHash";
  @SerializedName(SERIALIZED_NAME_BRANCH_HASH)
  private String branchHash;

  public MerkleTreeBranchDTO() {
  }

  public MerkleTreeBranchDTO type(MerkleTreeNodeTypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public MerkleTreeNodeTypeEnum getType() {
    return type;
  }

  public void setType(MerkleTreeNodeTypeEnum type) {
    this.type = type;
  }


  public MerkleTreeBranchDTO path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Branch link path.
   * @return path
  **/
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public MerkleTreeBranchDTO encodedPath(String encodedPath) {
    this.encodedPath = encodedPath;
    return this;
  }

   /**
   * Encoded branch link path.
   * @return encodedPath
  **/
  @javax.annotation.Nonnull
  public String getEncodedPath() {
    return encodedPath;
  }

  public void setEncodedPath(String encodedPath) {
    this.encodedPath = encodedPath;
  }


  public MerkleTreeBranchDTO nibbleCount(Integer nibbleCount) {
    this.nibbleCount = nibbleCount;
    return this;
  }

   /**
   * Nibble count.
   * @return nibbleCount
  **/
  @javax.annotation.Nonnull
  public Integer getNibbleCount() {
    return nibbleCount;
  }

  public void setNibbleCount(Integer nibbleCount) {
    this.nibbleCount = nibbleCount;
  }


  public MerkleTreeBranchDTO linkMask(String linkMask) {
    this.linkMask = linkMask;
    return this;
  }

   /**
   * Branch link bitmask.
   * @return linkMask
  **/
  @javax.annotation.Nonnull
  public String getLinkMask() {
    return linkMask;
  }

  public void setLinkMask(String linkMask) {
    this.linkMask = linkMask;
  }


  public MerkleTreeBranchDTO links(List<MerkleTreeBranchLinkDTO> links) {
    this.links = links;
    return this;
  }

  public MerkleTreeBranchDTO addLinksItem(MerkleTreeBranchLinkDTO linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Branch links (max 16).
   * @return links
  **/
  @javax.annotation.Nonnull
  public List<MerkleTreeBranchLinkDTO> getLinks() {
    return links;
  }

  public void setLinks(List<MerkleTreeBranchLinkDTO> links) {
    this.links = links;
  }


  public MerkleTreeBranchDTO branchHash(String branchHash) {
    this.branchHash = branchHash;
    return this;
  }

   /**
   * Get branchHash
   * @return branchHash
  **/
  @javax.annotation.Nonnull
  public String getBranchHash() {
    return branchHash;
  }

  public void setBranchHash(String branchHash) {
    this.branchHash = branchHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerkleTreeBranchDTO merkleTreeBranchDTO = (MerkleTreeBranchDTO) o;
    return Objects.equals(this.type, merkleTreeBranchDTO.type) &&
        Objects.equals(this.path, merkleTreeBranchDTO.path) &&
        Objects.equals(this.encodedPath, merkleTreeBranchDTO.encodedPath) &&
        Objects.equals(this.nibbleCount, merkleTreeBranchDTO.nibbleCount) &&
        Objects.equals(this.linkMask, merkleTreeBranchDTO.linkMask) &&
        Objects.equals(this.links, merkleTreeBranchDTO.links) &&
        Objects.equals(this.branchHash, merkleTreeBranchDTO.branchHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, path, encodedPath, nibbleCount, linkMask, links, branchHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerkleTreeBranchDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    encodedPath: ").append(toIndentedString(encodedPath)).append("\n");
    sb.append("    nibbleCount: ").append(toIndentedString(nibbleCount)).append("\n");
    sb.append("    linkMask: ").append(toIndentedString(linkMask)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    branchHash: ").append(toIndentedString(branchHash)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("path");
    openapiFields.add("encodedPath");
    openapiFields.add("nibbleCount");
    openapiFields.add("linkMask");
    openapiFields.add("links");
    openapiFields.add("branchHash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("encodedPath");
    openapiRequiredFields.add("nibbleCount");
    openapiRequiredFields.add("linkMask");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("branchHash");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MerkleTreeBranchDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MerkleTreeBranchDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerkleTreeBranchDTO is not found in the empty JSON string", MerkleTreeBranchDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MerkleTreeBranchDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerkleTreeBranchDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MerkleTreeBranchDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `type`
      MerkleTreeNodeTypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("encodedPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodedPath").toString()));
      }
      if (!jsonObj.get("linkMask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkMask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkMask").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        MerkleTreeBranchLinkDTO.validateJsonElement(jsonArraylinks.get(i));
      };
      if (!jsonObj.get("branchHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branchHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branchHash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerkleTreeBranchDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerkleTreeBranchDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerkleTreeBranchDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerkleTreeBranchDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MerkleTreeBranchDTO>() {
           @Override
           public void write(JsonWriter out, MerkleTreeBranchDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerkleTreeBranchDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerkleTreeBranchDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerkleTreeBranchDTO
  * @throws IOException if the JSON string is invalid with respect to MerkleTreeBranchDTO
  */
  public static MerkleTreeBranchDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerkleTreeBranchDTO.class);
  }

 /**
  * Convert an instance of MerkleTreeBranchDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

