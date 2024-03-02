/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Type of Merkle tree node: * 0 - Branch node. * 255 - Leaf node. 
 *
 * Values: _0,_255
 */

@JsonClass(generateAdapter = false)
enum class MerkleTreeNodeTypeEnum(val value: kotlin.Int) {

    @Json(name = "0")
    _0(0),

    @Json(name = "255")
    _255(255);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is MerkleTreeNodeTypeEnum) "$data" else null

        /**
         * Returns a valid [MerkleTreeNodeTypeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): MerkleTreeNodeTypeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

