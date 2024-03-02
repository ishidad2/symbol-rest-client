/*
Catapult REST Endpoints

Testing TransactionStatusRoutesAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package openapi_client

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func Test_openapi_client_TransactionStatusRoutesAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test TransactionStatusRoutesAPIService GetTransactionStatus", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var hash string

		resp, httpRes, err := apiClient.TransactionStatusRoutesAPI.GetTransactionStatus(context.Background(), hash).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TransactionStatusRoutesAPIService GetTransactionStatuses", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TransactionStatusRoutesAPI.GetTransactionStatuses(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
