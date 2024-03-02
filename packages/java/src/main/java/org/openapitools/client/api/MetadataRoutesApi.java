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


import org.openapitools.client.model.MerkleStateInfoDTO;
import org.openapitools.client.model.MetadataInfoDTO;
import org.openapitools.client.model.MetadataPage;
import org.openapitools.client.model.MetadataTypeEnum;
import org.openapitools.client.model.ModelError;
import org.openapitools.client.model.Order;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetadataRoutesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetadataRoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetadataRoutesApi(ApiClient apiClient) {
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
     * Build call for getMetadata
     * @param compositeHash Filter by composite hash. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetadataCall(String compositeHash, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/metadata/{compositeHash}"
            .replace("{" + "compositeHash" + "}", localVarApiClient.escapeString(compositeHash.toString()));

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
    private okhttp3.Call getMetadataValidateBeforeCall(String compositeHash, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'compositeHash' is set
        if (compositeHash == null) {
            throw new ApiException("Missing the required parameter 'compositeHash' when calling getMetadata(Async)");
        }

        return getMetadataCall(compositeHash, _callback);

    }

    /**
     * Get metadata information
     * Gets the metadata for a given composite hash.
     * @param compositeHash Filter by composite hash. (required)
     * @return MetadataInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public MetadataInfoDTO getMetadata(String compositeHash) throws ApiException {
        ApiResponse<MetadataInfoDTO> localVarResp = getMetadataWithHttpInfo(compositeHash);
        return localVarResp.getData();
    }

    /**
     * Get metadata information
     * Gets the metadata for a given composite hash.
     * @param compositeHash Filter by composite hash. (required)
     * @return ApiResponse&lt;MetadataInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MetadataInfoDTO> getMetadataWithHttpInfo(String compositeHash) throws ApiException {
        okhttp3.Call localVarCall = getMetadataValidateBeforeCall(compositeHash, null);
        Type localVarReturnType = new TypeToken<MetadataInfoDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get metadata information (asynchronously)
     * Gets the metadata for a given composite hash.
     * @param compositeHash Filter by composite hash. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetadataAsync(String compositeHash, final ApiCallback<MetadataInfoDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetadataValidateBeforeCall(compositeHash, _callback);
        Type localVarReturnType = new TypeToken<MetadataInfoDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMetadataMerkle
     * @param compositeHash Filter by composite hash. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetadataMerkleCall(String compositeHash, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/metadata/{compositeHash}/merkle"
            .replace("{" + "compositeHash" + "}", localVarApiClient.escapeString(compositeHash.toString()));

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
    private okhttp3.Call getMetadataMerkleValidateBeforeCall(String compositeHash, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'compositeHash' is set
        if (compositeHash == null) {
            throw new ApiException("Missing the required parameter 'compositeHash' when calling getMetadataMerkle(Async)");
        }

        return getMetadataMerkleCall(compositeHash, _callback);

    }

    /**
     * Get metadata merkle information
     * Gets the metadata merkle for a given composite hash.
     * @param compositeHash Filter by composite hash. (required)
     * @return MerkleStateInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public MerkleStateInfoDTO getMetadataMerkle(String compositeHash) throws ApiException {
        ApiResponse<MerkleStateInfoDTO> localVarResp = getMetadataMerkleWithHttpInfo(compositeHash);
        return localVarResp.getData();
    }

    /**
     * Get metadata merkle information
     * Gets the metadata merkle for a given composite hash.
     * @param compositeHash Filter by composite hash. (required)
     * @return ApiResponse&lt;MerkleStateInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerkleStateInfoDTO> getMetadataMerkleWithHttpInfo(String compositeHash) throws ApiException {
        okhttp3.Call localVarCall = getMetadataMerkleValidateBeforeCall(compositeHash, null);
        Type localVarReturnType = new TypeToken<MerkleStateInfoDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get metadata merkle information (asynchronously)
     * Gets the metadata merkle for a given composite hash.
     * @param compositeHash Filter by composite hash. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetadataMerkleAsync(String compositeHash, final ApiCallback<MerkleStateInfoDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetadataMerkleValidateBeforeCall(compositeHash, _callback);
        Type localVarReturnType = new TypeToken<MerkleStateInfoDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchMetadataEntries
     * @param sourceAddress Filter by address sending the metadata entry. (optional)
     * @param targetAddress Filter by target address. (optional)
     * @param scopedMetadataKey Filter by metadata key. (optional)
     * @param targetId Filter by namespace or mosaic id. (optional)
     * @param metadataType Filter by metadata type. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchMetadataEntriesCall(String sourceAddress, String targetAddress, String scopedMetadataKey, String targetId, MetadataTypeEnum metadataType, Integer pageSize, Integer pageNumber, String offset, Order order, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/metadata";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sourceAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sourceAddress", sourceAddress));
        }

        if (targetAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("targetAddress", targetAddress));
        }

        if (scopedMetadataKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scopedMetadataKey", scopedMetadataKey));
        }

        if (targetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("targetId", targetId));
        }

        if (metadataType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metadataType", metadataType));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNumber", pageNumber));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

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
    private okhttp3.Call searchMetadataEntriesValidateBeforeCall(String sourceAddress, String targetAddress, String scopedMetadataKey, String targetId, MetadataTypeEnum metadataType, Integer pageSize, Integer pageNumber, String offset, Order order, final ApiCallback _callback) throws ApiException {
        return searchMetadataEntriesCall(sourceAddress, targetAddress, scopedMetadataKey, targetId, metadataType, pageSize, pageNumber, offset, order, _callback);

    }

    /**
     * Search metadata entries
     * Returns an array of metadata.
     * @param sourceAddress Filter by address sending the metadata entry. (optional)
     * @param targetAddress Filter by target address. (optional)
     * @param scopedMetadataKey Filter by metadata key. (optional)
     * @param targetId Filter by namespace or mosaic id. (optional)
     * @param metadataType Filter by metadata type. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @return MetadataPage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public MetadataPage searchMetadataEntries(String sourceAddress, String targetAddress, String scopedMetadataKey, String targetId, MetadataTypeEnum metadataType, Integer pageSize, Integer pageNumber, String offset, Order order) throws ApiException {
        ApiResponse<MetadataPage> localVarResp = searchMetadataEntriesWithHttpInfo(sourceAddress, targetAddress, scopedMetadataKey, targetId, metadataType, pageSize, pageNumber, offset, order);
        return localVarResp.getData();
    }

    /**
     * Search metadata entries
     * Returns an array of metadata.
     * @param sourceAddress Filter by address sending the metadata entry. (optional)
     * @param targetAddress Filter by target address. (optional)
     * @param scopedMetadataKey Filter by metadata key. (optional)
     * @param targetId Filter by namespace or mosaic id. (optional)
     * @param metadataType Filter by metadata type. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @return ApiResponse&lt;MetadataPage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MetadataPage> searchMetadataEntriesWithHttpInfo(String sourceAddress, String targetAddress, String scopedMetadataKey, String targetId, MetadataTypeEnum metadataType, Integer pageSize, Integer pageNumber, String offset, Order order) throws ApiException {
        okhttp3.Call localVarCall = searchMetadataEntriesValidateBeforeCall(sourceAddress, targetAddress, scopedMetadataKey, targetId, metadataType, pageSize, pageNumber, offset, order, null);
        Type localVarReturnType = new TypeToken<MetadataPage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search metadata entries (asynchronously)
     * Returns an array of metadata.
     * @param sourceAddress Filter by address sending the metadata entry. (optional)
     * @param targetAddress Filter by target address. (optional)
     * @param scopedMetadataKey Filter by metadata key. (optional)
     * @param targetId Filter by namespace or mosaic id. (optional)
     * @param metadataType Filter by metadata type. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchMetadataEntriesAsync(String sourceAddress, String targetAddress, String scopedMetadataKey, String targetId, MetadataTypeEnum metadataType, Integer pageSize, Integer pageNumber, String offset, Order order, final ApiCallback<MetadataPage> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchMetadataEntriesValidateBeforeCall(sourceAddress, targetAddress, scopedMetadataKey, targetId, metadataType, pageSize, pageNumber, offset, order, _callback);
        Type localVarReturnType = new TypeToken<MetadataPage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
