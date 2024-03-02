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

import org.openapitools.client.models.AliasActionEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param namespaceId Namespace identifier.
 * @param address Address encoded using a 32-character set.
 * @param aliasAction 
 */


data class AddressAliasTransactionBodyDTO (

    /* Namespace identifier. */
    @Json(name = "namespaceId")
    val namespaceId: kotlin.String,

    /* Address encoded using a 32-character set. */
    @Json(name = "address")
    val address: kotlin.String,

    @Json(name = "aliasAction")
    val aliasAction: AliasActionEnum

)

