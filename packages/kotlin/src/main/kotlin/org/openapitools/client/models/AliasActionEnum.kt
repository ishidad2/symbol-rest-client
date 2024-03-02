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
 * Alias action: * 0 - Unlink alias. * 1 - Link alias. 
 *
 * Values: _0,_1
 */

@JsonClass(generateAdapter = false)
enum class AliasActionEnum(val value: kotlin.Int) {

    @Json(name = "0")
    _0(0),

    @Json(name = "1")
    _1(1);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AliasActionEnum) "$data" else null

        /**
         * Returns a valid [AliasActionEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AliasActionEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

