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


import org.openapitools.client.model.BlockInfoDTO;
import org.openapitools.client.model.BlockOrderByEnum;
import org.openapitools.client.model.BlockPage;
import org.openapitools.client.model.MerkleProofInfoDTO;
import org.openapitools.client.model.ModelError;
import org.openapitools.client.model.Order;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockRoutesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BlockRoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BlockRoutesApi(ApiClient apiClient) {
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
     * Build call for getBlockByHeight
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
    public okhttp3.Call getBlockByHeightCall(String height, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/blocks/{height}"
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
    private okhttp3.Call getBlockByHeightValidateBeforeCall(String height, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling getBlockByHeight(Async)");
        }

        return getBlockByHeightCall(height, _callback);

    }

    /**
     * Get block information
     * Gets a block from the chain that has the given height.
     * @param height Block height. (required)
     * @return BlockInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public BlockInfoDTO getBlockByHeight(String height) throws ApiException {
        ApiResponse<BlockInfoDTO> localVarResp = getBlockByHeightWithHttpInfo(height);
        return localVarResp.getData();
    }

    /**
     * Get block information
     * Gets a block from the chain that has the given height.
     * @param height Block height. (required)
     * @return ApiResponse&lt;BlockInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BlockInfoDTO> getBlockByHeightWithHttpInfo(String height) throws ApiException {
        okhttp3.Call localVarCall = getBlockByHeightValidateBeforeCall(height, null);
        Type localVarReturnType = new TypeToken<BlockInfoDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get block information (asynchronously)
     * Gets a block from the chain that has the given height.
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
    public okhttp3.Call getBlockByHeightAsync(String height, final ApiCallback<BlockInfoDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBlockByHeightValidateBeforeCall(height, _callback);
        Type localVarReturnType = new TypeToken<BlockInfoDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMerkleReceipts
     * @param height Block height. (required)
     * @param hash Receipt hash. (required)
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
    public okhttp3.Call getMerkleReceiptsCall(String height, String hash, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/blocks/{height}/statements/{hash}/merkle"
            .replace("{" + "height" + "}", localVarApiClient.escapeString(height.toString()))
            .replace("{" + "hash" + "}", localVarApiClient.escapeString(hash.toString()));

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
    private okhttp3.Call getMerkleReceiptsValidateBeforeCall(String height, String hash, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling getMerkleReceipts(Async)");
        }

        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new ApiException("Missing the required parameter 'hash' when calling getMerkleReceipts(Async)");
        }

        return getMerkleReceiptsCall(height, hash, _callback);

    }

    /**
     * Get the merkle path for a given a receipt statement hash and block
     * Returns the merkle path for a receipt statement or resolution linked to a block. The merkle path is the minimum number of nodes needed to calculate the merkle root.  Steps to calculate the merkle root: 1. proofHash &#x3D; hash (leaf). 2. Concatenate proofHash with the first unprocessed item from the merklePath list as follows: * a) If item.position &#x3D;&#x3D; left -&gt; proofHash &#x3D; sha_256(item.hash + proofHash). * b) If item.position &#x3D;&#x3D; right -&gt; proofHash &#x3D; sha_256(proofHash+ item.hash). 3. Repeat 2. for every item in the merklePath list. 4. Compare if the calculated proofHash equals the one recorded in the block header (block.receiptsHash) to verify if the statement was linked with the block. 
     * @param height Block height. (required)
     * @param hash Receipt hash. (required)
     * @return MerkleProofInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public MerkleProofInfoDTO getMerkleReceipts(String height, String hash) throws ApiException {
        ApiResponse<MerkleProofInfoDTO> localVarResp = getMerkleReceiptsWithHttpInfo(height, hash);
        return localVarResp.getData();
    }

    /**
     * Get the merkle path for a given a receipt statement hash and block
     * Returns the merkle path for a receipt statement or resolution linked to a block. The merkle path is the minimum number of nodes needed to calculate the merkle root.  Steps to calculate the merkle root: 1. proofHash &#x3D; hash (leaf). 2. Concatenate proofHash with the first unprocessed item from the merklePath list as follows: * a) If item.position &#x3D;&#x3D; left -&gt; proofHash &#x3D; sha_256(item.hash + proofHash). * b) If item.position &#x3D;&#x3D; right -&gt; proofHash &#x3D; sha_256(proofHash+ item.hash). 3. Repeat 2. for every item in the merklePath list. 4. Compare if the calculated proofHash equals the one recorded in the block header (block.receiptsHash) to verify if the statement was linked with the block. 
     * @param height Block height. (required)
     * @param hash Receipt hash. (required)
     * @return ApiResponse&lt;MerkleProofInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerkleProofInfoDTO> getMerkleReceiptsWithHttpInfo(String height, String hash) throws ApiException {
        okhttp3.Call localVarCall = getMerkleReceiptsValidateBeforeCall(height, hash, null);
        Type localVarReturnType = new TypeToken<MerkleProofInfoDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the merkle path for a given a receipt statement hash and block (asynchronously)
     * Returns the merkle path for a receipt statement or resolution linked to a block. The merkle path is the minimum number of nodes needed to calculate the merkle root.  Steps to calculate the merkle root: 1. proofHash &#x3D; hash (leaf). 2. Concatenate proofHash with the first unprocessed item from the merklePath list as follows: * a) If item.position &#x3D;&#x3D; left -&gt; proofHash &#x3D; sha_256(item.hash + proofHash). * b) If item.position &#x3D;&#x3D; right -&gt; proofHash &#x3D; sha_256(proofHash+ item.hash). 3. Repeat 2. for every item in the merklePath list. 4. Compare if the calculated proofHash equals the one recorded in the block header (block.receiptsHash) to verify if the statement was linked with the block. 
     * @param height Block height. (required)
     * @param hash Receipt hash. (required)
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
    public okhttp3.Call getMerkleReceiptsAsync(String height, String hash, final ApiCallback<MerkleProofInfoDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMerkleReceiptsValidateBeforeCall(height, hash, _callback);
        Type localVarReturnType = new TypeToken<MerkleProofInfoDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMerkleTransaction
     * @param height Block height. (required)
     * @param hash Transaction hash. (required)
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
    public okhttp3.Call getMerkleTransactionCall(String height, String hash, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/blocks/{height}/transactions/{hash}/merkle"
            .replace("{" + "height" + "}", localVarApiClient.escapeString(height.toString()))
            .replace("{" + "hash" + "}", localVarApiClient.escapeString(hash.toString()));

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
    private okhttp3.Call getMerkleTransactionValidateBeforeCall(String height, String hash, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling getMerkleTransaction(Async)");
        }

        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new ApiException("Missing the required parameter 'hash' when calling getMerkleTransaction(Async)");
        }

        return getMerkleTransactionCall(height, hash, _callback);

    }

    /**
     * Get the merkle path for a given a transaction and block
     * Returns the merkle path for a transaction included in a block. The merkle path is the minimum number of nodes needed to calculate the merkle root.  Steps to calculate the merkle root: 1. proofHash &#x3D; hash (leaf). 2. Concatenate proofHash with the first unprocessed item from the merklePath list as follows: * a) If item.position &#x3D;&#x3D; left -&gt; proofHash &#x3D; sha_256(item.hash + proofHash). * b) If item.position &#x3D;&#x3D; right -&gt; proofHash &#x3D; sha_256(proofHash+ item.hash). 3. Repeat 2. for every item in the merklePath list. 4. Compare if the calculated proofHash equals the one recorded in the block header (block.transactionsHash) to verify if the transaction was included in the block. 
     * @param height Block height. (required)
     * @param hash Transaction hash. (required)
     * @return MerkleProofInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public MerkleProofInfoDTO getMerkleTransaction(String height, String hash) throws ApiException {
        ApiResponse<MerkleProofInfoDTO> localVarResp = getMerkleTransactionWithHttpInfo(height, hash);
        return localVarResp.getData();
    }

    /**
     * Get the merkle path for a given a transaction and block
     * Returns the merkle path for a transaction included in a block. The merkle path is the minimum number of nodes needed to calculate the merkle root.  Steps to calculate the merkle root: 1. proofHash &#x3D; hash (leaf). 2. Concatenate proofHash with the first unprocessed item from the merklePath list as follows: * a) If item.position &#x3D;&#x3D; left -&gt; proofHash &#x3D; sha_256(item.hash + proofHash). * b) If item.position &#x3D;&#x3D; right -&gt; proofHash &#x3D; sha_256(proofHash+ item.hash). 3. Repeat 2. for every item in the merklePath list. 4. Compare if the calculated proofHash equals the one recorded in the block header (block.transactionsHash) to verify if the transaction was included in the block. 
     * @param height Block height. (required)
     * @param hash Transaction hash. (required)
     * @return ApiResponse&lt;MerkleProofInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ResourceNotFound </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerkleProofInfoDTO> getMerkleTransactionWithHttpInfo(String height, String hash) throws ApiException {
        okhttp3.Call localVarCall = getMerkleTransactionValidateBeforeCall(height, hash, null);
        Type localVarReturnType = new TypeToken<MerkleProofInfoDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the merkle path for a given a transaction and block (asynchronously)
     * Returns the merkle path for a transaction included in a block. The merkle path is the minimum number of nodes needed to calculate the merkle root.  Steps to calculate the merkle root: 1. proofHash &#x3D; hash (leaf). 2. Concatenate proofHash with the first unprocessed item from the merklePath list as follows: * a) If item.position &#x3D;&#x3D; left -&gt; proofHash &#x3D; sha_256(item.hash + proofHash). * b) If item.position &#x3D;&#x3D; right -&gt; proofHash &#x3D; sha_256(proofHash+ item.hash). 3. Repeat 2. for every item in the merklePath list. 4. Compare if the calculated proofHash equals the one recorded in the block header (block.transactionsHash) to verify if the transaction was included in the block. 
     * @param height Block height. (required)
     * @param hash Transaction hash. (required)
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
    public okhttp3.Call getMerkleTransactionAsync(String height, String hash, final ApiCallback<MerkleProofInfoDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMerkleTransactionValidateBeforeCall(height, hash, _callback);
        Type localVarReturnType = new TypeToken<MerkleProofInfoDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchBlocks
     * @param signerPublicKey Filter by public key of the account signing the entity. (optional)
     * @param beneficiaryAddress Filter by beneficiary address. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @param orderBy Sort responses by the property set.  (optional)
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
    public okhttp3.Call searchBlocksCall(String signerPublicKey, String beneficiaryAddress, Integer pageSize, Integer pageNumber, String offset, Order order, BlockOrderByEnum orderBy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/blocks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (signerPublicKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("signerPublicKey", signerPublicKey));
        }

        if (beneficiaryAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("beneficiaryAddress", beneficiaryAddress));
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

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
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
    private okhttp3.Call searchBlocksValidateBeforeCall(String signerPublicKey, String beneficiaryAddress, Integer pageSize, Integer pageNumber, String offset, Order order, BlockOrderByEnum orderBy, final ApiCallback _callback) throws ApiException {
        return searchBlocksCall(signerPublicKey, beneficiaryAddress, pageSize, pageNumber, offset, order, orderBy, _callback);

    }

    /**
     * Search blocks
     * Gets an array of bocks.
     * @param signerPublicKey Filter by public key of the account signing the entity. (optional)
     * @param beneficiaryAddress Filter by beneficiary address. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @param orderBy Sort responses by the property set.  (optional)
     * @return BlockPage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public BlockPage searchBlocks(String signerPublicKey, String beneficiaryAddress, Integer pageSize, Integer pageNumber, String offset, Order order, BlockOrderByEnum orderBy) throws ApiException {
        ApiResponse<BlockPage> localVarResp = searchBlocksWithHttpInfo(signerPublicKey, beneficiaryAddress, pageSize, pageNumber, offset, order, orderBy);
        return localVarResp.getData();
    }

    /**
     * Search blocks
     * Gets an array of bocks.
     * @param signerPublicKey Filter by public key of the account signing the entity. (optional)
     * @param beneficiaryAddress Filter by beneficiary address. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @param orderBy Sort responses by the property set.  (optional)
     * @return ApiResponse&lt;BlockPage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> InvalidArgument </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BlockPage> searchBlocksWithHttpInfo(String signerPublicKey, String beneficiaryAddress, Integer pageSize, Integer pageNumber, String offset, Order order, BlockOrderByEnum orderBy) throws ApiException {
        okhttp3.Call localVarCall = searchBlocksValidateBeforeCall(signerPublicKey, beneficiaryAddress, pageSize, pageNumber, offset, order, orderBy, null);
        Type localVarReturnType = new TypeToken<BlockPage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search blocks (asynchronously)
     * Gets an array of bocks.
     * @param signerPublicKey Filter by public key of the account signing the entity. (optional)
     * @param beneficiaryAddress Filter by beneficiary address. (optional)
     * @param pageSize Select the number of entries to return. (optional, default to 10)
     * @param pageNumber Filter by page number. (optional, default to 1)
     * @param offset Entry id at which to start pagination. If the ordering parameter is set to -id, the elements returned precede the identifier. Otherwise, newer elements with respect to the id are returned.  (optional)
     * @param order Sort responses in ascending or descending order based on the collection property set on the param &#x60;&#x60;orderBy&#x60;&#x60;. If the request does not specify &#x60;&#x60;orderBy&#x60;&#x60;, REST returns the collection ordered by id.  (optional, default to desc)
     * @param orderBy Sort responses by the property set.  (optional)
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
    public okhttp3.Call searchBlocksAsync(String signerPublicKey, String beneficiaryAddress, Integer pageSize, Integer pageNumber, String offset, Order order, BlockOrderByEnum orderBy, final ApiCallback<BlockPage> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchBlocksValidateBeforeCall(signerPublicKey, beneficiaryAddress, pageSize, pageNumber, offset, order, orderBy, _callback);
        Type localVarReturnType = new TypeToken<BlockPage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
