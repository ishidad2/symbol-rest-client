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

import org.openapitools.client.models.NetworkTypeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Transaction to create or modify a multisig account.
 *
 * @param propertySize A number that allows uint 32 values.
 * @param signature Entity's signature generated by the signer.
 * @param signerPublicKey Public key.
 * @param version Entity version.
 * @param network 
 * @param type 
 * @param maxFee Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
 * @param deadline Duration expressed in number of blocks.
 * @param targetAddress Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA 
 * @param scopedMetadataKey Metadata key scoped to source, target and type expressed.
 * @param targetMosaicId Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier. 
 * @param valueSizeDelta Change in value size in bytes.
 * @param valueSize A number that allows uint 32 values.
 * @param `value` Metadata value. If embedded in a transaction, this is calculated as xor(previous-value, value).
 */


data class MosaicMetadataTransactionDTO (

    /* A number that allows uint 32 values. */
    @Json(name = "size")
    val propertySize: kotlin.Long,

    /* Entity's signature generated by the signer. */
    @Json(name = "signature")
    val signature: kotlin.String,

    /* Public key. */
    @Json(name = "signerPublicKey")
    val signerPublicKey: kotlin.String,

    /* Entity version. */
    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "network")
    val network: NetworkTypeEnum,

    @Json(name = "type")
    val type: kotlin.Int,

    /* Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    @Json(name = "maxFee")
    val maxFee: kotlin.String,

    /* Duration expressed in number of blocks. */
    @Json(name = "deadline")
    val deadline: kotlin.String,

    /* Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA  */
    @Json(name = "targetAddress")
    val targetAddress: kotlin.String,

    /* Metadata key scoped to source, target and type expressed. */
    @Json(name = "scopedMetadataKey")
    val scopedMetadataKey: kotlin.String,

    /* Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.  */
    @Json(name = "targetMosaicId")
    val targetMosaicId: kotlin.String,

    /* Change in value size in bytes. */
    @Json(name = "valueSizeDelta")
    val valueSizeDelta: kotlin.Int,

    /* A number that allows uint 32 values. */
    @Json(name = "valueSize")
    val valueSize: kotlin.Long,

    /* Metadata value. If embedded in a transaction, this is calculated as xor(previous-value, value). */
    @Json(name = "value")
    val `value`: kotlin.String

)

