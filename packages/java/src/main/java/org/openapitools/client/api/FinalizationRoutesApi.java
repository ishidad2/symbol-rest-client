/*
 * Catapult REST Endpoints
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.FinalizationProofDTO;
import org.openapitools.client.model.ModelError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinalizationRoutesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FinalizationRoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FinalizationRoutesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getFinalizationProofAtEpoch
     * @param epoch Finalization epoch. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFinalizationProofAtEpochCall(Long epoch, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/finalization/proof/epoch/{epoch}"
            .replace("{" + "epoch" + "}", localVarApiClient.escapeString(epoch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFinalizationProofAtEpochValidateBeforeCall(Long epoch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'epoch' is set
        if (epoch == null) {
            throw new ApiException("Missing the required parameter 'epoch' when calling getFinalizationProofAtEpoch(Async)");
        }

        return getFinalizationProofAtEpochCall(epoch, _callback);

    }

    /**
     * Get finalization proof
     * Gets finalization proof for the greatest height associated with the given epoch.
     * @param epoch Finalization epoch. (required)
     * @return FinalizationProofDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public FinalizationProofDTO getFinalizationProofAtEpoch(Long epoch) throws ApiException {
        ApiResponse<FinalizationProofDTO> localVarResp = getFinalizationProofAtEpochWithHttpInfo(epoch);
        return localVarResp.getData();
    }

    /**
     * Get finalization proof
     * Gets finalization proof for the greatest height associated with the given epoch.
     * @param epoch Finalization epoch. (required)
     * @return ApiResponse&lt;FinalizationProofDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FinalizationProofDTO> getFinalizationProofAtEpochWithHttpInfo(Long epoch) throws ApiException {
        okhttp3.Call localVarCall = getFinalizationProofAtEpochValidateBeforeCall(epoch, null);
        Type localVarReturnType = new TypeToken<FinalizationProofDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get finalization proof (asynchronously)
     * Gets finalization proof for the greatest height associated with the given epoch.
     * @param epoch Finalization epoch. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFinalizationProofAtEpochAsync(Long epoch, final ApiCallback<FinalizationProofDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFinalizationProofAtEpochValidateBeforeCall(epoch, _callback);
        Type localVarReturnType = new TypeToken<FinalizationProofDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFinalizationProofAtHeight
     * @param height Block height. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFinalizationProofAtHeightCall(String height, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/finalization/proof/height/{height}"
            .replace("{" + "height" + "}", localVarApiClient.escapeString(height.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFinalizationProofAtHeightValidateBeforeCall(String height, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling getFinalizationProofAtHeight(Async)");
        }

        return getFinalizationProofAtHeightCall(height, _callback);

    }

    /**
     * Get finalization proof
     * Gets finalization proof at the given height.
     * @param height Block height. (required)
     * @return FinalizationProofDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public FinalizationProofDTO getFinalizationProofAtHeight(String height) throws ApiException {
        ApiResponse<FinalizationProofDTO> localVarResp = getFinalizationProofAtHeightWithHttpInfo(height);
        return localVarResp.getData();
    }

    /**
     * Get finalization proof
     * Gets finalization proof at the given height.
     * @param height Block height. (required)
     * @return ApiResponse&lt;FinalizationProofDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FinalizationProofDTO> getFinalizationProofAtHeightWithHttpInfo(String height) throws ApiException {
        okhttp3.Call localVarCall = getFinalizationProofAtHeightValidateBeforeCall(height, null);
        Type localVarReturnType = new TypeToken<FinalizationProofDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get finalization proof (asynchronously)
     * Gets finalization proof at the given height.
     * @param height Block height. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFinalizationProofAtHeightAsync(String height, final ApiCallback<FinalizationProofDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFinalizationProofAtHeightValidateBeforeCall(height, _callback);
        Type localVarReturnType = new TypeToken<FinalizationProofDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
