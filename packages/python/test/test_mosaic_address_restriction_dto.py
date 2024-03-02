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

from openapi_client.models.mosaic_address_restriction_dto import MosaicAddressRestrictionDTO

class TestMosaicAddressRestrictionDTO(unittest.TestCase):
    """MosaicAddressRestrictionDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MosaicAddressRestrictionDTO:
        """Test MosaicAddressRestrictionDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MosaicAddressRestrictionDTO`
        """
        model = MosaicAddressRestrictionDTO()
        if include_optional:
            return MosaicAddressRestrictionDTO(
                id = '',
                mosaic_restriction_entry = openapi_client.models.mosaic_address_restriction_entry_wrapper_dto.MosaicAddressRestrictionEntryWrapperDTO(
                    version = 1, 
                    composite_hash = 'C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810', 
                    entry_type = 0, 
                    mosaic_id = '0DC67FBE1CAD29E3', 
                    target_address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY', 
                    restrictions = [
                        openapi_client.models.mosaic_address_restriction_entry_dto.MosaicAddressRestrictionEntryDTO(
                            key = '0DC67FBE1CAD29E3', 
                            value = '', )
                        ], )
            )
        else:
            return MosaicAddressRestrictionDTO(
                id = '',
                mosaic_restriction_entry = openapi_client.models.mosaic_address_restriction_entry_wrapper_dto.MosaicAddressRestrictionEntryWrapperDTO(
                    version = 1, 
                    composite_hash = 'C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810', 
                    entry_type = 0, 
                    mosaic_id = '0DC67FBE1CAD29E3', 
                    target_address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY', 
                    restrictions = [
                        openapi_client.models.mosaic_address_restriction_entry_dto.MosaicAddressRestrictionEntryDTO(
                            key = '0DC67FBE1CAD29E3', 
                            value = '', )
                        ], ),
        )
        """

    def testMosaicAddressRestrictionDTO(self):
        """Test MosaicAddressRestrictionDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
