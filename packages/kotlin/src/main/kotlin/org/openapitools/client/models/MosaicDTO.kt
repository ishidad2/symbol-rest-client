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
 * 
 *
 * @param version The version of the state
 * @param id Mosaic identifier.
 * @param supply Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
 * @param startHeight Height of the blockchain.
 * @param ownerAddress Address encoded using a 32-character set.
 * @param revision A number that allows uint 32 values.
 * @param flags - 0x00 (none) - No flags present. - 0x01 (supplyMutable) - Mosaic supports supply changes even when mosaic owner owns partial supply. - 0x02 (transferable) - Mosaic supports transfers between arbitrary accounts. When not set, mosaic can only be transferred to and from mosaic owner. - 0x04 (restrictable) - Mosaic supports custom restrictions configured by mosaic owner. - 0x08 (revokable) - Mosaic allows creator to revoke balances from another user. 
 * @param divisibility Determines up to what decimal place the mosaic can be divided. Divisibility of 3 means that a mosaic can be divided into smallest parts of 0.001 mosaics. The divisibility must be in the range of 0 and 6. 
 * @param duration Duration expressed in number of blocks.
 */


data class MosaicDTO (

    /* The version of the state */
    @Json(name = "version")
    val version: kotlin.Int,

    /* Mosaic identifier. */
    @Json(name = "id")
    val id: kotlin.String,

    /* Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    @Json(name = "supply")
    val supply: kotlin.String,

    /* Height of the blockchain. */
    @Json(name = "startHeight")
    val startHeight: kotlin.String,

    /* Address encoded using a 32-character set. */
    @Json(name = "ownerAddress")
    val ownerAddress: kotlin.String,

    /* A number that allows uint 32 values. */
    @Json(name = "revision")
    val revision: kotlin.Long,

    /* - 0x00 (none) - No flags present. - 0x01 (supplyMutable) - Mosaic supports supply changes even when mosaic owner owns partial supply. - 0x02 (transferable) - Mosaic supports transfers between arbitrary accounts. When not set, mosaic can only be transferred to and from mosaic owner. - 0x04 (restrictable) - Mosaic supports custom restrictions configured by mosaic owner. - 0x08 (revokable) - Mosaic allows creator to revoke balances from another user.  */
    @Json(name = "flags")
    val flags: kotlin.Int,

    /* Determines up to what decimal place the mosaic can be divided. Divisibility of 3 means that a mosaic can be divided into smallest parts of 0.001 mosaics. The divisibility must be in the range of 0 and 6.  */
    @Json(name = "divisibility")
    val divisibility: kotlin.Int,

    /* Duration expressed in number of blocks. */
    @Json(name = "duration")
    val duration: kotlin.String

)

