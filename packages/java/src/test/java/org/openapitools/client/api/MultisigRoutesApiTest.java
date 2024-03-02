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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.MerkleStateInfoDTO;
import org.openapitools.client.model.ModelError;
import org.openapitools.client.model.MultisigAccountGraphInfoDTO;
import org.openapitools.client.model.MultisigAccountInfoDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MultisigRoutesApi
 */
@Disabled
public class MultisigRoutesApiTest {

    private final MultisigRoutesApi api = new MultisigRoutesApi();

    /**
     * Get multisig account information
     *
     * Returns the multisig account information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountMultisigTest() throws ApiException {
        String address = null;
        MultisigAccountInfoDTO response = api.getAccountMultisig(address);
        // TODO: test validations
    }

    /**
     * Get multisig account graph information
     *
     * Returns the multisig account graph.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountMultisigGraphTest() throws ApiException {
        String address = null;
        List<MultisigAccountGraphInfoDTO> response = api.getAccountMultisigGraph(address);
        // TODO: test validations
    }

    /**
     * Get multisig account merkle information
     *
     * Returns the multisig account merkle information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountMultisigMerkleTest() throws ApiException {
        String address = null;
        MerkleStateInfoDTO response = api.getAccountMultisigMerkle(address);
        // TODO: test validations
    }

}
