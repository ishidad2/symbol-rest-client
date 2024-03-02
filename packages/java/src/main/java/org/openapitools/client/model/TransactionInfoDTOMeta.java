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
import org.openapitools.client.model.EmbeddedTransactionMetaDTO;
import org.openapitools.client.model.TransactionMetaDTO;



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
public class TransactionInfoDTOMeta extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TransactionInfoDTOMeta.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TransactionInfoDTOMeta.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TransactionInfoDTOMeta' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TransactionMetaDTO> adapterTransactionMetaDTO = gson.getDelegateAdapter(this, TypeToken.get(TransactionMetaDTO.class));
            final TypeAdapter<EmbeddedTransactionMetaDTO> adapterEmbeddedTransactionMetaDTO = gson.getDelegateAdapter(this, TypeToken.get(EmbeddedTransactionMetaDTO.class));

            return (TypeAdapter<T>) new TypeAdapter<TransactionInfoDTOMeta>() {
                @Override
                public void write(JsonWriter out, TransactionInfoDTOMeta value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TransactionMetaDTO`
                    if (value.getActualInstance() instanceof TransactionMetaDTO) {
                      JsonElement element = adapterTransactionMetaDTO.toJsonTree((TransactionMetaDTO)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EmbeddedTransactionMetaDTO`
                    if (value.getActualInstance() instanceof EmbeddedTransactionMetaDTO) {
                      JsonElement element = adapterEmbeddedTransactionMetaDTO.toJsonTree((EmbeddedTransactionMetaDTO)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemae: EmbeddedTransactionMetaDTO, TransactionMetaDTO");
                }

                @Override
                public TransactionInfoDTOMeta read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TransactionMetaDTO
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TransactionMetaDTO.validateJsonElement(jsonElement);
                      actualAdapter = adapterTransactionMetaDTO;
                      TransactionInfoDTOMeta ret = new TransactionInfoDTOMeta();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TransactionMetaDTO failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TransactionMetaDTO'", e);
                    }
                    // deserialize EmbeddedTransactionMetaDTO
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EmbeddedTransactionMetaDTO.validateJsonElement(jsonElement);
                      actualAdapter = adapterEmbeddedTransactionMetaDTO;
                      TransactionInfoDTOMeta ret = new TransactionInfoDTOMeta();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EmbeddedTransactionMetaDTO failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EmbeddedTransactionMetaDTO'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for TransactionInfoDTOMeta: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TransactionInfoDTOMeta() {
        super("anyOf", Boolean.FALSE);
    }

    public TransactionInfoDTOMeta(EmbeddedTransactionMetaDTO o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionInfoDTOMeta(TransactionMetaDTO o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TransactionMetaDTO", TransactionMetaDTO.class);
        schemas.put("EmbeddedTransactionMetaDTO", EmbeddedTransactionMetaDTO.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TransactionInfoDTOMeta.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * EmbeddedTransactionMetaDTO, TransactionMetaDTO
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TransactionMetaDTO) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EmbeddedTransactionMetaDTO) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EmbeddedTransactionMetaDTO, TransactionMetaDTO");
    }

    /**
     * Get the actual instance, which can be the following:
     * EmbeddedTransactionMetaDTO, TransactionMetaDTO
     *
     * @return The actual instance (EmbeddedTransactionMetaDTO, TransactionMetaDTO)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TransactionMetaDTO`. If the actual instance is not `TransactionMetaDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionMetaDTO`
     * @throws ClassCastException if the instance is not `TransactionMetaDTO`
     */
    public TransactionMetaDTO getTransactionMetaDTO() throws ClassCastException {
        return (TransactionMetaDTO)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EmbeddedTransactionMetaDTO`. If the actual instance is not `EmbeddedTransactionMetaDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EmbeddedTransactionMetaDTO`
     * @throws ClassCastException if the instance is not `EmbeddedTransactionMetaDTO`
     */
    public EmbeddedTransactionMetaDTO getEmbeddedTransactionMetaDTO() throws ClassCastException {
        return (EmbeddedTransactionMetaDTO)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionInfoDTOMeta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate anyOf schemas one by one
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TransactionMetaDTO
    try {
      TransactionMetaDTO.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TransactionMetaDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EmbeddedTransactionMetaDTO
    try {
      EmbeddedTransactionMetaDTO.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EmbeddedTransactionMetaDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    throw new IOException(String.format("The JSON string is invalid for TransactionInfoDTOMeta with anyOf schemas: EmbeddedTransactionMetaDTO, TransactionMetaDTO. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    
  }

 /**
  * Create an instance of TransactionInfoDTOMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionInfoDTOMeta
  * @throws IOException if the JSON string is invalid with respect to TransactionInfoDTOMeta
  */
  public static TransactionInfoDTOMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionInfoDTOMeta.class);
  }

 /**
  * Convert an instance of TransactionInfoDTOMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

