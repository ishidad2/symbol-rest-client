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
 * NamespaceNetworkPropertiesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class NamespaceNetworkPropertiesDTO {
  public static final String SERIALIZED_NAME_MAX_NAME_SIZE = "maxNameSize";
  @SerializedName(SERIALIZED_NAME_MAX_NAME_SIZE)
  private String maxNameSize;

  public static final String SERIALIZED_NAME_MAX_CHILD_NAMESPACES = "maxChildNamespaces";
  @SerializedName(SERIALIZED_NAME_MAX_CHILD_NAMESPACES)
  private String maxChildNamespaces;

  public static final String SERIALIZED_NAME_MAX_NAMESPACE_DEPTH = "maxNamespaceDepth";
  @SerializedName(SERIALIZED_NAME_MAX_NAMESPACE_DEPTH)
  private String maxNamespaceDepth;

  public static final String SERIALIZED_NAME_MIN_NAMESPACE_DURATION = "minNamespaceDuration";
  @SerializedName(SERIALIZED_NAME_MIN_NAMESPACE_DURATION)
  private String minNamespaceDuration;

  public static final String SERIALIZED_NAME_MAX_NAMESPACE_DURATION = "maxNamespaceDuration";
  @SerializedName(SERIALIZED_NAME_MAX_NAMESPACE_DURATION)
  private String maxNamespaceDuration;

  public static final String SERIALIZED_NAME_NAMESPACE_GRACE_PERIOD_DURATION = "namespaceGracePeriodDuration";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GRACE_PERIOD_DURATION)
  private String namespaceGracePeriodDuration;

  public static final String SERIALIZED_NAME_RESERVED_ROOT_NAMESPACE_NAMES = "reservedRootNamespaceNames";
  @SerializedName(SERIALIZED_NAME_RESERVED_ROOT_NAMESPACE_NAMES)
  private String reservedRootNamespaceNames;

  public static final String SERIALIZED_NAME_NAMESPACE_RENTAL_FEE_SINK_ADDRESS = "namespaceRentalFeeSinkAddress";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_RENTAL_FEE_SINK_ADDRESS)
  private String namespaceRentalFeeSinkAddress;

  public static final String SERIALIZED_NAME_ROOT_NAMESPACE_RENTAL_FEE_PER_BLOCK = "rootNamespaceRentalFeePerBlock";
  @SerializedName(SERIALIZED_NAME_ROOT_NAMESPACE_RENTAL_FEE_PER_BLOCK)
  private String rootNamespaceRentalFeePerBlock;

  public static final String SERIALIZED_NAME_CHILD_NAMESPACE_RENTAL_FEE = "childNamespaceRentalFee";
  @SerializedName(SERIALIZED_NAME_CHILD_NAMESPACE_RENTAL_FEE)
  private String childNamespaceRentalFee;

  public NamespaceNetworkPropertiesDTO() {
  }

  public NamespaceNetworkPropertiesDTO maxNameSize(String maxNameSize) {
    this.maxNameSize = maxNameSize;
    return this;
  }

   /**
   * Maximum namespace name size.
   * @return maxNameSize
  **/
  @javax.annotation.Nullable
  public String getMaxNameSize() {
    return maxNameSize;
  }

  public void setMaxNameSize(String maxNameSize) {
    this.maxNameSize = maxNameSize;
  }


  public NamespaceNetworkPropertiesDTO maxChildNamespaces(String maxChildNamespaces) {
    this.maxChildNamespaces = maxChildNamespaces;
    return this;
  }

   /**
   * Maximum number of children for a root namespace.
   * @return maxChildNamespaces
  **/
  @javax.annotation.Nullable
  public String getMaxChildNamespaces() {
    return maxChildNamespaces;
  }

  public void setMaxChildNamespaces(String maxChildNamespaces) {
    this.maxChildNamespaces = maxChildNamespaces;
  }


  public NamespaceNetworkPropertiesDTO maxNamespaceDepth(String maxNamespaceDepth) {
    this.maxNamespaceDepth = maxNamespaceDepth;
    return this;
  }

   /**
   * Maximum namespace depth.
   * @return maxNamespaceDepth
  **/
  @javax.annotation.Nullable
  public String getMaxNamespaceDepth() {
    return maxNamespaceDepth;
  }

  public void setMaxNamespaceDepth(String maxNamespaceDepth) {
    this.maxNamespaceDepth = maxNamespaceDepth;
  }


  public NamespaceNetworkPropertiesDTO minNamespaceDuration(String minNamespaceDuration) {
    this.minNamespaceDuration = minNamespaceDuration;
    return this;
  }

   /**
   * Minimum namespace duration.
   * @return minNamespaceDuration
  **/
  @javax.annotation.Nullable
  public String getMinNamespaceDuration() {
    return minNamespaceDuration;
  }

  public void setMinNamespaceDuration(String minNamespaceDuration) {
    this.minNamespaceDuration = minNamespaceDuration;
  }


  public NamespaceNetworkPropertiesDTO maxNamespaceDuration(String maxNamespaceDuration) {
    this.maxNamespaceDuration = maxNamespaceDuration;
    return this;
  }

   /**
   * Maximum namespace duration.
   * @return maxNamespaceDuration
  **/
  @javax.annotation.Nullable
  public String getMaxNamespaceDuration() {
    return maxNamespaceDuration;
  }

  public void setMaxNamespaceDuration(String maxNamespaceDuration) {
    this.maxNamespaceDuration = maxNamespaceDuration;
  }


  public NamespaceNetworkPropertiesDTO namespaceGracePeriodDuration(String namespaceGracePeriodDuration) {
    this.namespaceGracePeriodDuration = namespaceGracePeriodDuration;
    return this;
  }

   /**
   * Grace period during which time only the previous owner can renew an expired namespace.
   * @return namespaceGracePeriodDuration
  **/
  @javax.annotation.Nullable
  public String getNamespaceGracePeriodDuration() {
    return namespaceGracePeriodDuration;
  }

  public void setNamespaceGracePeriodDuration(String namespaceGracePeriodDuration) {
    this.namespaceGracePeriodDuration = namespaceGracePeriodDuration;
  }


  public NamespaceNetworkPropertiesDTO reservedRootNamespaceNames(String reservedRootNamespaceNames) {
    this.reservedRootNamespaceNames = reservedRootNamespaceNames;
    return this;
  }

   /**
   * Reserved root namespaces that cannot be claimed.
   * @return reservedRootNamespaceNames
  **/
  @javax.annotation.Nullable
  public String getReservedRootNamespaceNames() {
    return reservedRootNamespaceNames;
  }

  public void setReservedRootNamespaceNames(String reservedRootNamespaceNames) {
    this.reservedRootNamespaceNames = reservedRootNamespaceNames;
  }


  public NamespaceNetworkPropertiesDTO namespaceRentalFeeSinkAddress(String namespaceRentalFeeSinkAddress) {
    this.namespaceRentalFeeSinkAddress = namespaceRentalFeeSinkAddress;
    return this;
  }

   /**
   * Address encoded using a 32-character set.
   * @return namespaceRentalFeeSinkAddress
  **/
  @javax.annotation.Nullable
  public String getNamespaceRentalFeeSinkAddress() {
    return namespaceRentalFeeSinkAddress;
  }

  public void setNamespaceRentalFeeSinkAddress(String namespaceRentalFeeSinkAddress) {
    this.namespaceRentalFeeSinkAddress = namespaceRentalFeeSinkAddress;
  }


  public NamespaceNetworkPropertiesDTO rootNamespaceRentalFeePerBlock(String rootNamespaceRentalFeePerBlock) {
    this.rootNamespaceRentalFeePerBlock = rootNamespaceRentalFeePerBlock;
    return this;
  }

   /**
   * Root namespace rental fee per block.
   * @return rootNamespaceRentalFeePerBlock
  **/
  @javax.annotation.Nullable
  public String getRootNamespaceRentalFeePerBlock() {
    return rootNamespaceRentalFeePerBlock;
  }

  public void setRootNamespaceRentalFeePerBlock(String rootNamespaceRentalFeePerBlock) {
    this.rootNamespaceRentalFeePerBlock = rootNamespaceRentalFeePerBlock;
  }


  public NamespaceNetworkPropertiesDTO childNamespaceRentalFee(String childNamespaceRentalFee) {
    this.childNamespaceRentalFee = childNamespaceRentalFee;
    return this;
  }

   /**
   * Child namespace rental fee.
   * @return childNamespaceRentalFee
  **/
  @javax.annotation.Nullable
  public String getChildNamespaceRentalFee() {
    return childNamespaceRentalFee;
  }

  public void setChildNamespaceRentalFee(String childNamespaceRentalFee) {
    this.childNamespaceRentalFee = childNamespaceRentalFee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceNetworkPropertiesDTO namespaceNetworkPropertiesDTO = (NamespaceNetworkPropertiesDTO) o;
    return Objects.equals(this.maxNameSize, namespaceNetworkPropertiesDTO.maxNameSize) &&
        Objects.equals(this.maxChildNamespaces, namespaceNetworkPropertiesDTO.maxChildNamespaces) &&
        Objects.equals(this.maxNamespaceDepth, namespaceNetworkPropertiesDTO.maxNamespaceDepth) &&
        Objects.equals(this.minNamespaceDuration, namespaceNetworkPropertiesDTO.minNamespaceDuration) &&
        Objects.equals(this.maxNamespaceDuration, namespaceNetworkPropertiesDTO.maxNamespaceDuration) &&
        Objects.equals(this.namespaceGracePeriodDuration, namespaceNetworkPropertiesDTO.namespaceGracePeriodDuration) &&
        Objects.equals(this.reservedRootNamespaceNames, namespaceNetworkPropertiesDTO.reservedRootNamespaceNames) &&
        Objects.equals(this.namespaceRentalFeeSinkAddress, namespaceNetworkPropertiesDTO.namespaceRentalFeeSinkAddress) &&
        Objects.equals(this.rootNamespaceRentalFeePerBlock, namespaceNetworkPropertiesDTO.rootNamespaceRentalFeePerBlock) &&
        Objects.equals(this.childNamespaceRentalFee, namespaceNetworkPropertiesDTO.childNamespaceRentalFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNameSize, maxChildNamespaces, maxNamespaceDepth, minNamespaceDuration, maxNamespaceDuration, namespaceGracePeriodDuration, reservedRootNamespaceNames, namespaceRentalFeeSinkAddress, rootNamespaceRentalFeePerBlock, childNamespaceRentalFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceNetworkPropertiesDTO {\n");
    sb.append("    maxNameSize: ").append(toIndentedString(maxNameSize)).append("\n");
    sb.append("    maxChildNamespaces: ").append(toIndentedString(maxChildNamespaces)).append("\n");
    sb.append("    maxNamespaceDepth: ").append(toIndentedString(maxNamespaceDepth)).append("\n");
    sb.append("    minNamespaceDuration: ").append(toIndentedString(minNamespaceDuration)).append("\n");
    sb.append("    maxNamespaceDuration: ").append(toIndentedString(maxNamespaceDuration)).append("\n");
    sb.append("    namespaceGracePeriodDuration: ").append(toIndentedString(namespaceGracePeriodDuration)).append("\n");
    sb.append("    reservedRootNamespaceNames: ").append(toIndentedString(reservedRootNamespaceNames)).append("\n");
    sb.append("    namespaceRentalFeeSinkAddress: ").append(toIndentedString(namespaceRentalFeeSinkAddress)).append("\n");
    sb.append("    rootNamespaceRentalFeePerBlock: ").append(toIndentedString(rootNamespaceRentalFeePerBlock)).append("\n");
    sb.append("    childNamespaceRentalFee: ").append(toIndentedString(childNamespaceRentalFee)).append("\n");
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
    openapiFields.add("maxNameSize");
    openapiFields.add("maxChildNamespaces");
    openapiFields.add("maxNamespaceDepth");
    openapiFields.add("minNamespaceDuration");
    openapiFields.add("maxNamespaceDuration");
    openapiFields.add("namespaceGracePeriodDuration");
    openapiFields.add("reservedRootNamespaceNames");
    openapiFields.add("namespaceRentalFeeSinkAddress");
    openapiFields.add("rootNamespaceRentalFeePerBlock");
    openapiFields.add("childNamespaceRentalFee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NamespaceNetworkPropertiesDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NamespaceNetworkPropertiesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NamespaceNetworkPropertiesDTO is not found in the empty JSON string", NamespaceNetworkPropertiesDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NamespaceNetworkPropertiesDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NamespaceNetworkPropertiesDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maxNameSize") != null && !jsonObj.get("maxNameSize").isJsonNull()) && !jsonObj.get("maxNameSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxNameSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxNameSize").toString()));
      }
      if ((jsonObj.get("maxChildNamespaces") != null && !jsonObj.get("maxChildNamespaces").isJsonNull()) && !jsonObj.get("maxChildNamespaces").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxChildNamespaces` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxChildNamespaces").toString()));
      }
      if ((jsonObj.get("maxNamespaceDepth") != null && !jsonObj.get("maxNamespaceDepth").isJsonNull()) && !jsonObj.get("maxNamespaceDepth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxNamespaceDepth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxNamespaceDepth").toString()));
      }
      if ((jsonObj.get("minNamespaceDuration") != null && !jsonObj.get("minNamespaceDuration").isJsonNull()) && !jsonObj.get("minNamespaceDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minNamespaceDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minNamespaceDuration").toString()));
      }
      if ((jsonObj.get("maxNamespaceDuration") != null && !jsonObj.get("maxNamespaceDuration").isJsonNull()) && !jsonObj.get("maxNamespaceDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxNamespaceDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxNamespaceDuration").toString()));
      }
      if ((jsonObj.get("namespaceGracePeriodDuration") != null && !jsonObj.get("namespaceGracePeriodDuration").isJsonNull()) && !jsonObj.get("namespaceGracePeriodDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaceGracePeriodDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespaceGracePeriodDuration").toString()));
      }
      if ((jsonObj.get("reservedRootNamespaceNames") != null && !jsonObj.get("reservedRootNamespaceNames").isJsonNull()) && !jsonObj.get("reservedRootNamespaceNames").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reservedRootNamespaceNames` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reservedRootNamespaceNames").toString()));
      }
      if ((jsonObj.get("namespaceRentalFeeSinkAddress") != null && !jsonObj.get("namespaceRentalFeeSinkAddress").isJsonNull()) && !jsonObj.get("namespaceRentalFeeSinkAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaceRentalFeeSinkAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespaceRentalFeeSinkAddress").toString()));
      }
      if ((jsonObj.get("rootNamespaceRentalFeePerBlock") != null && !jsonObj.get("rootNamespaceRentalFeePerBlock").isJsonNull()) && !jsonObj.get("rootNamespaceRentalFeePerBlock").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rootNamespaceRentalFeePerBlock` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rootNamespaceRentalFeePerBlock").toString()));
      }
      if ((jsonObj.get("childNamespaceRentalFee") != null && !jsonObj.get("childNamespaceRentalFee").isJsonNull()) && !jsonObj.get("childNamespaceRentalFee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `childNamespaceRentalFee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("childNamespaceRentalFee").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NamespaceNetworkPropertiesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NamespaceNetworkPropertiesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NamespaceNetworkPropertiesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NamespaceNetworkPropertiesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<NamespaceNetworkPropertiesDTO>() {
           @Override
           public void write(JsonWriter out, NamespaceNetworkPropertiesDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NamespaceNetworkPropertiesDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NamespaceNetworkPropertiesDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NamespaceNetworkPropertiesDTO
  * @throws IOException if the JSON string is invalid with respect to NamespaceNetworkPropertiesDTO
  */
  public static NamespaceNetworkPropertiesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NamespaceNetworkPropertiesDTO.class);
  }

 /**
  * Convert an instance of NamespaceNetworkPropertiesDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

