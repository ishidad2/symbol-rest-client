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

import org.openapitools.client.models.ReceiptTypeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Receipt stored when a namespace expires.
 *
 * @param version Version of the receipt.
 * @param type 
 * @param artifactId Namespace identifier.
 */


data class NamespaceExpiryReceiptDTO (

    /* Version of the receipt. */
    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "type")
    val type: ReceiptTypeEnum,

    /* Namespace identifier. */
    @Json(name = "artifactId")
    val artifactId: kotlin.String

)

