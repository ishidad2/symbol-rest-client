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
import org.openapitools.client.model.LockHashAlgorithmEnum;
import org.openapitools.client.model.NetworkTypeEnum;

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
 * Transaction to reveal a proof.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-02T22:49:20.273938+09:00[Asia/Tokyo]")
public class SecretProofTransactionDTO {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_SIGNER_PUBLIC_KEY = "signerPublicKey";
  @SerializedName(SERIALIZED_NAME_SIGNER_PUBLIC_KEY)
  private String signerPublicKey;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private NetworkTypeEnum network;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_MAX_FEE = "maxFee";
  @SerializedName(SERIALIZED_NAME_MAX_FEE)
  private String maxFee;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private String deadline;

  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipientAddress";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private String recipientAddress;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_HASH_ALGORITHM = "hashAlgorithm";
  @SerializedName(SERIALIZED_NAME_HASH_ALGORITHM)
  private LockHashAlgorithmEnum hashAlgorithm;

  public static final String SERIALIZED_NAME_PROOF = "proof";
  @SerializedName(SERIALIZED_NAME_PROOF)
  private String proof;

  public SecretProofTransactionDTO() {
  }

  public SecretProofTransactionDTO size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * A number that allows uint 32 values.
   * @return size
  **/
  @javax.annotation.Nonnull
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public SecretProofTransactionDTO signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Entity&#39;s signature generated by the signer.
   * @return signature
  **/
  @javax.annotation.Nonnull
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  public SecretProofTransactionDTO signerPublicKey(String signerPublicKey) {
    this.signerPublicKey = signerPublicKey;
    return this;
  }

   /**
   * Public key.
   * @return signerPublicKey
  **/
  @javax.annotation.Nonnull
  public String getSignerPublicKey() {
    return signerPublicKey;
  }

  public void setSignerPublicKey(String signerPublicKey) {
    this.signerPublicKey = signerPublicKey;
  }


  public SecretProofTransactionDTO version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Entity version.
   * @return version
  **/
  @javax.annotation.Nonnull
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  public SecretProofTransactionDTO network(NetworkTypeEnum network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nonnull
  public NetworkTypeEnum getNetwork() {
    return network;
  }

  public void setNetwork(NetworkTypeEnum network) {
    this.network = network;
  }


  public SecretProofTransactionDTO type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  public SecretProofTransactionDTO maxFee(String maxFee) {
    this.maxFee = maxFee;
    return this;
  }

   /**
   * Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
   * @return maxFee
  **/
  @javax.annotation.Nonnull
  public String getMaxFee() {
    return maxFee;
  }

  public void setMaxFee(String maxFee) {
    this.maxFee = maxFee;
  }


  public SecretProofTransactionDTO deadline(String deadline) {
    this.deadline = deadline;
    return this;
  }

   /**
   * Duration expressed in number of blocks.
   * @return deadline
  **/
  @javax.annotation.Nonnull
  public String getDeadline() {
    return deadline;
  }

  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }


  public SecretProofTransactionDTO recipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA 
   * @return recipientAddress
  **/
  @javax.annotation.Nonnull
  public String getRecipientAddress() {
    return recipientAddress;
  }

  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }


  public SecretProofTransactionDTO secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nonnull
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SecretProofTransactionDTO hashAlgorithm(LockHashAlgorithmEnum hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
    return this;
  }

   /**
   * Get hashAlgorithm
   * @return hashAlgorithm
  **/
  @javax.annotation.Nonnull
  public LockHashAlgorithmEnum getHashAlgorithm() {
    return hashAlgorithm;
  }

  public void setHashAlgorithm(LockHashAlgorithmEnum hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
  }


  public SecretProofTransactionDTO proof(String proof) {
    this.proof = proof;
    return this;
  }

   /**
   * Original random set of bytes.
   * @return proof
  **/
  @javax.annotation.Nonnull
  public String getProof() {
    return proof;
  }

  public void setProof(String proof) {
    this.proof = proof;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretProofTransactionDTO secretProofTransactionDTO = (SecretProofTransactionDTO) o;
    return Objects.equals(this.size, secretProofTransactionDTO.size) &&
        Objects.equals(this.signature, secretProofTransactionDTO.signature) &&
        Objects.equals(this.signerPublicKey, secretProofTransactionDTO.signerPublicKey) &&
        Objects.equals(this.version, secretProofTransactionDTO.version) &&
        Objects.equals(this.network, secretProofTransactionDTO.network) &&
        Objects.equals(this.type, secretProofTransactionDTO.type) &&
        Objects.equals(this.maxFee, secretProofTransactionDTO.maxFee) &&
        Objects.equals(this.deadline, secretProofTransactionDTO.deadline) &&
        Objects.equals(this.recipientAddress, secretProofTransactionDTO.recipientAddress) &&
        Objects.equals(this.secret, secretProofTransactionDTO.secret) &&
        Objects.equals(this.hashAlgorithm, secretProofTransactionDTO.hashAlgorithm) &&
        Objects.equals(this.proof, secretProofTransactionDTO.proof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, signature, signerPublicKey, version, network, type, maxFee, deadline, recipientAddress, secret, hashAlgorithm, proof);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretProofTransactionDTO {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signerPublicKey: ").append(toIndentedString(signerPublicKey)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maxFee: ").append(toIndentedString(maxFee)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    hashAlgorithm: ").append(toIndentedString(hashAlgorithm)).append("\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
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
    openapiFields.add("size");
    openapiFields.add("signature");
    openapiFields.add("signerPublicKey");
    openapiFields.add("version");
    openapiFields.add("network");
    openapiFields.add("type");
    openapiFields.add("maxFee");
    openapiFields.add("deadline");
    openapiFields.add("recipientAddress");
    openapiFields.add("secret");
    openapiFields.add("hashAlgorithm");
    openapiFields.add("proof");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("signature");
    openapiRequiredFields.add("signerPublicKey");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("maxFee");
    openapiRequiredFields.add("deadline");
    openapiRequiredFields.add("recipientAddress");
    openapiRequiredFields.add("secret");
    openapiRequiredFields.add("hashAlgorithm");
    openapiRequiredFields.add("proof");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SecretProofTransactionDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecretProofTransactionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecretProofTransactionDTO is not found in the empty JSON string", SecretProofTransactionDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SecretProofTransactionDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecretProofTransactionDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecretProofTransactionDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if (!jsonObj.get("signerPublicKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerPublicKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerPublicKey").toString()));
      }
      // validate the required field `network`
      NetworkTypeEnum.validateJsonElement(jsonObj.get("network"));
      if (!jsonObj.get("maxFee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxFee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxFee").toString()));
      }
      if (!jsonObj.get("deadline").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deadline` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deadline").toString()));
      }
      if (!jsonObj.get("recipientAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientAddress").toString()));
      }
      if (!jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      // validate the required field `hashAlgorithm`
      LockHashAlgorithmEnum.validateJsonElement(jsonObj.get("hashAlgorithm"));
      if (!jsonObj.get("proof").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proof` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proof").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecretProofTransactionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecretProofTransactionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecretProofTransactionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecretProofTransactionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SecretProofTransactionDTO>() {
           @Override
           public void write(JsonWriter out, SecretProofTransactionDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecretProofTransactionDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecretProofTransactionDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecretProofTransactionDTO
  * @throws IOException if the JSON string is invalid with respect to SecretProofTransactionDTO
  */
  public static SecretProofTransactionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecretProofTransactionDTO.class);
  }

 /**
  * Convert an instance of SecretProofTransactionDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

