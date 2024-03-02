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
 * @param minRemovalDelta Number of signatures needed to remove a cosignatory. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories. 
 * @param minApprovalDelta Number of signatures needed to approve a transaction. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories. 
 * @param addressAdditions Array of cosignatory accounts to add.
 * @param addressDeletions Array of cosignatory accounts to delete.
 */


data class MultisigAccountModificationTransactionBodyDTO (

    /* Number of signatures needed to remove a cosignatory. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories.  */
    @Json(name = "minRemovalDelta")
    val minRemovalDelta: kotlin.Int,

    /* Number of signatures needed to approve a transaction. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories.  */
    @Json(name = "minApprovalDelta")
    val minApprovalDelta: kotlin.Int,

    /* Array of cosignatory accounts to add. */
    @Json(name = "addressAdditions")
    val addressAdditions: kotlin.collections.List<kotlin.String>,

    /* Array of cosignatory accounts to delete. */
    @Json(name = "addressDeletions")
    val addressDeletions: kotlin.collections.List<kotlin.String>

)

