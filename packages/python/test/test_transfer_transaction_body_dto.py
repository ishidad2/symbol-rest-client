# coding: utf-8

"""
    Catapult REST Endpoints

    OpenAPI Specification of catapult-rest

    The version of the OpenAPI document: 1.0.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.transfer_transaction_body_dto import TransferTransactionBodyDTO

class TestTransferTransactionBodyDTO(unittest.TestCase):
    """TransferTransactionBodyDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransferTransactionBodyDTO:
        """Test TransferTransactionBodyDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransferTransactionBodyDTO`
        """
        model = TransferTransactionBodyDTO()
        if include_optional:
            return TransferTransactionBodyDTO(
                recipient_address = 'TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA',
                mosaics = [
                    openapi_client.models.unresolved_mosaic.UnresolvedMosaic(
                        id = '85BBEA6CC462B244', 
                        amount = '123456', )
                    ],
                message = ''
            )
        else:
            return TransferTransactionBodyDTO(
                recipient_address = 'TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA',
                mosaics = [
                    openapi_client.models.unresolved_mosaic.UnresolvedMosaic(
                        id = '85BBEA6CC462B244', 
                        amount = '123456', )
                    ],
        )
        """

    def testTransferTransactionBodyDTO(self):
        """Test TransferTransactionBodyDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
