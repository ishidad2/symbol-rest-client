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

import org.openapitools.client.models.BlockDTO
import org.openapitools.client.models.ImportanceBlockDTO
import org.openapitools.client.models.NetworkTypeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param propertySize A number that allows uint 32 values.
 * @param signature Entity's signature generated by the signer.
 * @param signerPublicKey Public key.
 * @param version Entity version.
 * @param network 
 * @param type 
 * @param height Height of the blockchain.
 * @param timestamp Number of milliseconds elapsed since the creation of the nemesis block. This value can be converted to epoch time by adding the network's 'epochAdjustment'.
 * @param difficulty Determines how hard is to harvest a new block, based on previous blocks.
 * @param proofGamma 32-bytes VRF proof gamma.
 * @param proofVerificationHash 16-bytes VRF proof verification hash.
 * @param proofScalar 32-bytes VRF proof scalar.
 * @param previousBlockHash 
 * @param transactionsHash 
 * @param receiptsHash 
 * @param stateHash 
 * @param beneficiaryAddress Address encoded using a 32-character set.
 * @param feeMultiplier Fee multiplier applied to transactions contained in block.
 * @param votingEligibleAccountsCount A number that allows uint 32 values.
 * @param harvestingEligibleAccountsCount A number that allows uint 64 values represented with a string.
 * @param totalVotingBalance Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
 * @param previousImportanceBlockHash 
 */


data class BlockInfoDTOBlock (

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

    /* Height of the blockchain. */
    @Json(name = "height")
    val height: kotlin.String,

    /* Number of milliseconds elapsed since the creation of the nemesis block. This value can be converted to epoch time by adding the network's 'epochAdjustment'. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String,

    /* Determines how hard is to harvest a new block, based on previous blocks. */
    @Json(name = "difficulty")
    val difficulty: kotlin.String,

    /* 32-bytes VRF proof gamma. */
    @Json(name = "proofGamma")
    val proofGamma: kotlin.String,

    /* 16-bytes VRF proof verification hash. */
    @Json(name = "proofVerificationHash")
    val proofVerificationHash: kotlin.String,

    /* 32-bytes VRF proof scalar. */
    @Json(name = "proofScalar")
    val proofScalar: kotlin.String,

    @Json(name = "previousBlockHash")
    val previousBlockHash: kotlin.String,

    @Json(name = "transactionsHash")
    val transactionsHash: kotlin.String,

    @Json(name = "receiptsHash")
    val receiptsHash: kotlin.String,

    @Json(name = "stateHash")
    val stateHash: kotlin.String,

    /* Address encoded using a 32-character set. */
    @Json(name = "beneficiaryAddress")
    val beneficiaryAddress: kotlin.String,

    /* Fee multiplier applied to transactions contained in block. */
    @Json(name = "feeMultiplier")
    val feeMultiplier: kotlin.Long,

    /* A number that allows uint 32 values. */
    @Json(name = "votingEligibleAccountsCount")
    val votingEligibleAccountsCount: kotlin.Long,

    /* A number that allows uint 64 values represented with a string. */
    @Json(name = "harvestingEligibleAccountsCount")
    val harvestingEligibleAccountsCount: kotlin.String,

    /* Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    @Json(name = "totalVotingBalance")
    val totalVotingBalance: kotlin.String,

    @Json(name = "previousImportanceBlockHash")
    val previousImportanceBlockHash: kotlin.String

)

