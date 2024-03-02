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

import org.openapitools.client.models.AliasTypeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param mosaicId Mosaic identifier.
 * @param address Address encoded using a 32-character set.
 */


data class AliasDTO (

    @Json(name = "type")
    val type: AliasTypeEnum,

    /* Mosaic identifier. */
    @Json(name = "mosaicId")
    val mosaicId: kotlin.String? = null,

    /* Address encoded using a 32-character set. */
    @Json(name = "address")
    val address: kotlin.String? = null

)

