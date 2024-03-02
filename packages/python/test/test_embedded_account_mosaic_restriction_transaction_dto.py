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

from openapi_client.models.embedded_account_mosaic_restriction_transaction_dto import EmbeddedAccountMosaicRestrictionTransactionDTO

class TestEmbeddedAccountMosaicRestrictionTransactionDTO(unittest.TestCase):
    """EmbeddedAccountMosaicRestrictionTransactionDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EmbeddedAccountMosaicRestrictionTransactionDTO:
        """Test EmbeddedAccountMosaicRestrictionTransactionDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EmbeddedAccountMosaicRestrictionTransactionDTO`
        """
        model = EmbeddedAccountMosaicRestrictionTransactionDTO()
        if include_optional:
            return EmbeddedAccountMosaicRestrictionTransactionDTO(
                signer_public_key = 'AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26',
                version = 56,
                network = 144,
                type = 56,
                restriction_flags = 1,
                restriction_additions = [
                    '85BBEA6CC462B244'
                    ],
                restriction_deletions = [
                    '85BBEA6CC462B244'
                    ]
            )
        else:
            return EmbeddedAccountMosaicRestrictionTransactionDTO(
                signer_public_key = 'AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26',
                version = 56,
                network = 144,
                type = 56,
                restriction_flags = 1,
                restriction_additions = [
                    '85BBEA6CC462B244'
                    ],
                restriction_deletions = [
                    '85BBEA6CC462B244'
                    ],
        )
        """

    def testEmbeddedAccountMosaicRestrictionTransactionDTO(self):
        """Test EmbeddedAccountMosaicRestrictionTransactionDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
