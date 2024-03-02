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
 * Type of mosaic restriction. * 0 - Uninitialized value indicating no restriction. * 1 (EQ) - Allow if equal. * 2 (NE) - Allow if not equal. * 3 (LT) - Allow if less than. * 4 (LE) - Allow if less than or equal. * 5 (GT) - Allow if greater than. * 6 (GE) - Allow if greater than or equal. 
 *
 * Values: _0,_1,_2,_3,_4,_5,_6
 */

@JsonClass(generateAdapter = false)
enum class MosaicRestrictionTypeEnum(val value: kotlin.Int) {

    @Json(name = "0")
    _0(0),

    @Json(name = "1")
    _1(1),

    @Json(name = "2")
    _2(2),

    @Json(name = "3")
    _3(3),

    @Json(name = "4")
    _4(4),

    @Json(name = "5")
    _5(5),

    @Json(name = "6")
    _6(6);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is MosaicRestrictionTypeEnum) "$data" else null

        /**
         * Returns a valid [MosaicRestrictionTypeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): MosaicRestrictionTypeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

