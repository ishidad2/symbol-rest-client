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

from openapi_client.models.mosaic_supply_revocation_transaction_body_dto import MosaicSupplyRevocationTransactionBodyDTO

class TestMosaicSupplyRevocationTransactionBodyDTO(unittest.TestCase):
    """MosaicSupplyRevocationTransactionBodyDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MosaicSupplyRevocationTransactionBodyDTO:
        """Test MosaicSupplyRevocationTransactionBodyDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MosaicSupplyRevocationTransactionBodyDTO`
        """
        model = MosaicSupplyRevocationTransactionBodyDTO()
        if include_optional:
            return MosaicSupplyRevocationTransactionBodyDTO(
                source_address = 'TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA',
                mosaic_id = '85BBEA6CC462B244',
                amount = '123456'
            )
        else:
            return MosaicSupplyRevocationTransactionBodyDTO(
                source_address = 'TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA',
                mosaic_id = '85BBEA6CC462B244',
                amount = '123456',
        )
        """

    def testMosaicSupplyRevocationTransactionBodyDTO(self):
        """Test MosaicSupplyRevocationTransactionBodyDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
