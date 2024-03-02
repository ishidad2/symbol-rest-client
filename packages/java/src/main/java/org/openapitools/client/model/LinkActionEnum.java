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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of action: * 0 - Unlink. * 1 - Link. 
 */
@JsonAdapter(LinkActionEnum.Adapter.class)
public enum LinkActionEnum {
  
  NUMBER_0(0),
  
  NUMBER_1(1);

  private Integer value;

  LinkActionEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkActionEnum fromValue(Integer value) {
    for (LinkActionEnum b : LinkActionEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LinkActionEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkActionEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkActionEnum read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return LinkActionEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    LinkActionEnum.fromValue(value);
  }
}

