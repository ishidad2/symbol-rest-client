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

import org.openapitools.client.models.LinkActionEnum
import org.openapitools.client.models.NetworkTypeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param signerPublicKey Public key.
 * @param version Entity version.
 * @param network 
 * @param type 
 * @param linkedPublicKey 32 bytes voting public key.
 * @param startEpoch Finalization Epoch
 * @param endEpoch Finalization Epoch
 * @param linkAction 
 */


data class EmbeddedVotingKeyLinkTransactionDTO (

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

    /* 32 bytes voting public key. */
    @Json(name = "linkedPublicKey")
    val linkedPublicKey: kotlin.String,

    /* Finalization Epoch */
    @Json(name = "startEpoch")
    val startEpoch: kotlin.Long,

    /* Finalization Epoch */
    @Json(name = "endEpoch")
    val endEpoch: kotlin.Long,

    @Json(name = "linkAction")
    val linkAction: LinkActionEnum

)

