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
import org.openapitools.client.model.MerkleTreeBranchDTO;
import org.openapitools.client.model.MerkleTreeBranchLinkDTO;
import org.openapitools.client.model.MerkleTreeLeafDTO;
import org.openapitools.client.model.MerkleTreeNodeTypeEnum;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class MerkleStateInfoDTOTreeInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MerkleStateInfoDTOTreeInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MerkleStateInfoDTOTreeInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MerkleStateInfoDTOTreeInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MerkleTreeBranchDTO> adapterMerkleTreeBranchDTO = gson.getDelegateAdapter(this, TypeToken.get(MerkleTreeBranchDTO.class));
            final TypeAdapter<MerkleTreeLeafDTO> adapterMerkleTreeLeafDTO = gson.getDelegateAdapter(this, TypeToken.get(MerkleTreeLeafDTO.class));

            return (TypeAdapter<T>) new TypeAdapter<MerkleStateInfoDTOTreeInner>() {
                @Override
                public void write(JsonWriter out, MerkleStateInfoDTOTreeInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MerkleTreeBranchDTO`
                    if (value.getActualInstance() instanceof MerkleTreeBranchDTO) {
                      JsonElement element = adapterMerkleTreeBranchDTO.toJsonTree((MerkleTreeBranchDTO)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `MerkleTreeLeafDTO`
                    if (value.getActualInstance() instanceof MerkleTreeLeafDTO) {
                      JsonElement element = adapterMerkleTreeLeafDTO.toJsonTree((MerkleTreeLeafDTO)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemae: MerkleTreeBranchDTO, MerkleTreeLeafDTO");
                }

                @Override
                public MerkleStateInfoDTOTreeInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MerkleTreeBranchDTO
                    try {
                      // validate the JSON object to see if any exception is thrown
                      MerkleTreeBranchDTO.validateJsonElement(jsonElement);
                      actualAdapter = adapterMerkleTreeBranchDTO;
                      MerkleStateInfoDTOTreeInner ret = new MerkleStateInfoDTOTreeInner();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for MerkleTreeBranchDTO failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'MerkleTreeBranchDTO'", e);
                    }
                    // deserialize MerkleTreeLeafDTO
                    try {
                      // validate the JSON object to see if any exception is thrown
                      MerkleTreeLeafDTO.validateJsonElement(jsonElement);
                      actualAdapter = adapterMerkleTreeLeafDTO;
                      MerkleStateInfoDTOTreeInner ret = new MerkleStateInfoDTOTreeInner();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for MerkleTreeLeafDTO failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'MerkleTreeLeafDTO'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for MerkleStateInfoDTOTreeInner: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MerkleStateInfoDTOTreeInner() {
        super("anyOf", Boolean.FALSE);
    }

    public MerkleStateInfoDTOTreeInner(MerkleTreeBranchDTO o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public MerkleStateInfoDTOTreeInner(MerkleTreeLeafDTO o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MerkleTreeBranchDTO", MerkleTreeBranchDTO.class);
        schemas.put("MerkleTreeLeafDTO", MerkleTreeLeafDTO.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MerkleStateInfoDTOTreeInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * MerkleTreeBranchDTO, MerkleTreeLeafDTO
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MerkleTreeBranchDTO) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MerkleTreeLeafDTO) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MerkleTreeBranchDTO, MerkleTreeLeafDTO");
    }

    /**
     * Get the actual instance, which can be the following:
     * MerkleTreeBranchDTO, MerkleTreeLeafDTO
     *
     * @return The actual instance (MerkleTreeBranchDTO, MerkleTreeLeafDTO)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MerkleTreeBranchDTO`. If the actual instance is not `MerkleTreeBranchDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MerkleTreeBranchDTO`
     * @throws ClassCastException if the instance is not `MerkleTreeBranchDTO`
     */
    public MerkleTreeBranchDTO getMerkleTreeBranchDTO() throws ClassCastException {
        return (MerkleTreeBranchDTO)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MerkleTreeLeafDTO`. If the actual instance is not `MerkleTreeLeafDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MerkleTreeLeafDTO`
     * @throws ClassCastException if the instance is not `MerkleTreeLeafDTO`
     */
    public MerkleTreeLeafDTO getMerkleTreeLeafDTO() throws ClassCastException {
        return (MerkleTreeLeafDTO)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MerkleStateInfoDTOTreeInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate anyOf schemas one by one
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with MerkleTreeBranchDTO
    try {
      MerkleTreeBranchDTO.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MerkleTreeBranchDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with MerkleTreeLeafDTO
    try {
      MerkleTreeLeafDTO.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MerkleTreeLeafDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    throw new IOException(String.format("The JSON string is invalid for MerkleStateInfoDTOTreeInner with anyOf schemas: MerkleTreeBranchDTO, MerkleTreeLeafDTO. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    
  }

 /**
  * Create an instance of MerkleStateInfoDTOTreeInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerkleStateInfoDTOTreeInner
  * @throws IOException if the JSON string is invalid with respect to MerkleStateInfoDTOTreeInner
  */
  public static MerkleStateInfoDTOTreeInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerkleStateInfoDTOTreeInner.class);
  }

 /**
  * Convert an instance of MerkleStateInfoDTOTreeInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

