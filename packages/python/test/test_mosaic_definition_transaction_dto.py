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

from openapi_client.models.mosaic_definition_transaction_dto import MosaicDefinitionTransactionDTO

class TestMosaicDefinitionTransactionDTO(unittest.TestCase):
    """MosaicDefinitionTransactionDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MosaicDefinitionTransactionDTO:
        """Test MosaicDefinitionTransactionDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MosaicDefinitionTransactionDTO`
        """
        model = MosaicDefinitionTransactionDTO()
        if include_optional:
            return MosaicDefinitionTransactionDTO(
                size = 2222212828,
                signature = '4B408BBEDF25F2AC8E0E44A6E51E3CCBA03885902055F75EB9FF50433532CA44BF9175FDA7502EEE2FC1617126E453A2BD692BAFDAAF06BC8EDEBA7961B3730D',
                signer_public_key = 'AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26',
                version = 56,
                network = 144,
                type = 56,
                max_fee = '123456',
                deadline = '200',
                id = '0DC67FBE1CAD29E3',
                duration = '200',
                nonce = 2222212828,
                flags = 56,
                divisibility = 56
            )
        else:
            return MosaicDefinitionTransactionDTO(
                size = 2222212828,
                signature = '4B408BBEDF25F2AC8E0E44A6E51E3CCBA03885902055F75EB9FF50433532CA44BF9175FDA7502EEE2FC1617126E453A2BD692BAFDAAF06BC8EDEBA7961B3730D',
                signer_public_key = 'AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26',
                version = 56,
                network = 144,
                type = 56,
                max_fee = '123456',
                deadline = '200',
                id = '0DC67FBE1CAD29E3',
                duration = '200',
                nonce = 2222212828,
                flags = 56,
                divisibility = 56,
        )
        """

    def testMosaicDefinitionTransactionDTO(self):
        """Test MosaicDefinitionTransactionDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
