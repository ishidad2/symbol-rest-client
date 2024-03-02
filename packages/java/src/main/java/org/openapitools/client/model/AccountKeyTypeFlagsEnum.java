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
 * Type of account key: * 0 - Unset. * 1 - Linked account public key. * 2 - Node public key on which remote is allowed to harvest. * 4 - VRF public key. 
 */
@JsonAdapter(AccountKeyTypeFlagsEnum.Adapter.class)
public enum AccountKeyTypeFlagsEnum {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_4(4);

  private Integer value;

  AccountKeyTypeFlagsEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountKeyTypeFlagsEnum fromValue(Integer value) {
    for (AccountKeyTypeFlagsEnum b : AccountKeyTypeFlagsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AccountKeyTypeFlagsEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountKeyTypeFlagsEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountKeyTypeFlagsEnum read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return AccountKeyTypeFlagsEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    AccountKeyTypeFlagsEnum.fromValue(value);
  }
}

