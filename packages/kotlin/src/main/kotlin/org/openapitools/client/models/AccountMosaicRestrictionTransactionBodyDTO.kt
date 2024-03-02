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

import org.openapitools.client.models.AccountRestrictionFlagsEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param restrictionFlags 
 * @param restrictionAdditions Account restriction additions.
 * @param restrictionDeletions Account restriction deletions.
 */


data class AccountMosaicRestrictionTransactionBodyDTO (

    @Json(name = "restrictionFlags")
    val restrictionFlags: AccountRestrictionFlagsEnum,

    /* Account restriction additions. */
    @Json(name = "restrictionAdditions")
    val restrictionAdditions: kotlin.collections.List<kotlin.String>,

    /* Account restriction deletions. */
    @Json(name = "restrictionDeletions")
    val restrictionDeletions: kotlin.collections.List<kotlin.String>

)

