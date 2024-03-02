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

from openapi_client.models.mosaics_names_dto import MosaicsNamesDTO

class TestMosaicsNamesDTO(unittest.TestCase):
    """MosaicsNamesDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MosaicsNamesDTO:
        """Test MosaicsNamesDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MosaicsNamesDTO`
        """
        model = MosaicsNamesDTO()
        if include_optional:
            return MosaicsNamesDTO(
                mosaic_names = [
                    openapi_client.models.mosaic_names_dto.MosaicNamesDTO(
                        mosaic_id = '0DC67FBE1CAD29E3', 
                        names = ["symbol.xym"], )
                    ]
            )
        else:
            return MosaicsNamesDTO(
                mosaic_names = [
                    openapi_client.models.mosaic_names_dto.MosaicNamesDTO(
                        mosaic_id = '0DC67FBE1CAD29E3', 
                        names = ["symbol.xym"], )
                    ],
        )
        """

    def testMosaicsNamesDTO(self):
        """Test MosaicsNamesDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
