# coding: utf-8

"""
    Catapult REST Endpoints

    OpenAPI Specification of catapult-rest

    The version of the OpenAPI document: 1.0.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.transaction_status_routes_api import TransactionStatusRoutesApi


class TestTransactionStatusRoutesApi(unittest.TestCase):
    """TransactionStatusRoutesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = TransactionStatusRoutesApi()

    def tearDown(self) -> None:
        pass

    def test_get_transaction_status(self) -> None:
        """Test case for get_transaction_status

        Get transaction status
        """
        pass

    def test_get_transaction_statuses(self) -> None:
        """Test case for get_transaction_statuses

        Get transaction statuses
        """
        pass


if __name__ == '__main__':
    unittest.main()
