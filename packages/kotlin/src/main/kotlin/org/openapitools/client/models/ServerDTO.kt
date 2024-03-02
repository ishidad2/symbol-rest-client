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

import org.openapitools.client.models.DeploymentDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param restVersion catapult-rest component version.
 * @param sdkVersion catapult-sdk component version.
 * @param deployment 
 */


data class ServerDTO (

    /* catapult-rest component version. */
    @Json(name = "restVersion")
    val restVersion: kotlin.String,

    /* catapult-sdk component version. */
    @Json(name = "sdkVersion")
    val sdkVersion: kotlin.String,

    @Json(name = "deployment")
    val deployment: DeploymentDTO

)

