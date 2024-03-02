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

from openapi_client.models.embedded_mosaic_supply_revocation_transaction_dto import EmbeddedMosaicSupplyRevocationTransactionDTO

class TestEmbeddedMosaicSupplyRevocationTransactionDTO(unittest.TestCase):
    """EmbeddedMosaicSupplyRevocationTransactionDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EmbeddedMosaicSupplyRevocationTransactionDTO:
        """Test EmbeddedMosaicSupplyRevocationTransactionDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EmbeddedMosaicSupplyRevocationTransactionDTO`
        """
        model = EmbeddedMosaicSupplyRevocationTransactionDTO()
        if include_optional:
            return EmbeddedMosaicSupplyRevocationTransactionDTO(
                signer_public_key = 'AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26',
                version = 56,
                network = 144,
                type = 56,
                source_address = 'TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA',
                mosaic_id = '85BBEA6CC462B244',
                amount = '123456'
            )
        else:
            return EmbeddedMosaicSupplyRevocationTransactionDTO(
                signer_public_key = 'AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26',
                version = 56,
                network = 144,
                type = 56,
                source_address = 'TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA',
                mosaic_id = '85BBEA6CC462B244',
                amount = '123456',
        )
        """

    def testEmbeddedMosaicSupplyRevocationTransactionDTO(self):
        """Test EmbeddedMosaicSupplyRevocationTransactionDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
