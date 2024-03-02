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
 * Type of receipt: * 0x124D (4685 decimal) - Mosaic_Rental_Fee. * 0x134E (4942 decimal) - Namespace_Rental_Fee. * 0x2143 (8515 decimal) - Harvest_Fee. * 0x2248 (8776 decimal) - LockHash_Completed. * 0x2348 (9032 decimal) - LockHash_Expired. * 0x2252 (8786 decimal) - LockSecret_Completed. * 0x2352 (9042 decimal) - LockSecret_Expired. * 0x3148 (12616 decimal) - LockHash_Created. * 0x3152 (12626 decimal) - LockSecret_Created. * 0x414D (16717 decimal) - Mosaic_Expired. * 0x414E (16718 decimal) - Namespace_Expired. * 0x424E (16974 decimal) - Namespace_Deleted. * 0x5143 (20803 decimal) - Inflation. * 0xE143 (57667 decimal) - Transaction_Group. * 0xF143 (61763 decimal) - Address_Alias_Resolution. * 0xF243 (62019 decimal) - Mosaic_Alias_Resolution. 
 *
 * Values: _4685,_4942,_8515,_8776,_9032,_8786,_9042,_12616,_12626,_16717,_16718,_16974,_20803,_57667,_61763,_62019
 */

@JsonClass(generateAdapter = false)
enum class ReceiptTypeEnum(val value: kotlin.Int) {

    @Json(name = "4685")
    _4685(4685),

    @Json(name = "4942")
    _4942(4942),

    @Json(name = "8515")
    _8515(8515),

    @Json(name = "8776")
    _8776(8776),

    @Json(name = "9032")
    _9032(9032),

    @Json(name = "8786")
    _8786(8786),

    @Json(name = "9042")
    _9042(9042),

    @Json(name = "12616")
    _12616(12616),

    @Json(name = "12626")
    _12626(12626),

    @Json(name = "16717")
    _16717(16717),

    @Json(name = "16718")
    _16718(16718),

    @Json(name = "16974")
    _16974(16974),

    @Json(name = "20803")
    _20803(20803),

    @Json(name = "57667")
    _57667(57667),

    @Json(name = "61763")
    _61763(61763),

    @Json(name = "62019")
    _62019(62019);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ReceiptTypeEnum) "$data" else null

        /**
         * Returns a valid [ReceiptTypeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ReceiptTypeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

