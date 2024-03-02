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
 * @param mosaicId Mosaic identifier.
 * @param names Mosaic linked namespace names.
 */


data class MosaicNamesDTO (

    /* Mosaic identifier. */
    @Json(name = "mosaicId")
    val mosaicId: kotlin.String,

    /* Mosaic linked namespace names. */
    @Json(name = "names")
    val names: kotlin.collections.List<kotlin.String>

)

