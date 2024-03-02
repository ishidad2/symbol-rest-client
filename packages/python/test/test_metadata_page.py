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

from openapi_client.models.metadata_page import MetadataPage

class TestMetadataPage(unittest.TestCase):
    """MetadataPage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MetadataPage:
        """Test MetadataPage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MetadataPage`
        """
        model = MetadataPage()
        if include_optional:
            return MetadataPage(
                data = [
                    openapi_client.models.metadata_info_dto.MetadataInfoDTO(
                        id = '', 
                        metadata_entry = openapi_client.models.metadata_entry_dto.MetadataEntryDTO(
                            version = 1, 
                            composite_hash = 'C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810', 
                            source_address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY', 
                            target_address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY', 
                            scoped_metadata_key = '0DC67FBE1CAD29E3', 
                            target_id = null, 
                            metadata_type = 0, 
                            value = '', ), )
                    ],
                pagination = openapi_client.models.pagination.Pagination(
                    page_number = 56, 
                    page_size = 56, )
            )
        else:
            return MetadataPage(
                data = [
                    openapi_client.models.metadata_info_dto.MetadataInfoDTO(
                        id = '', 
                        metadata_entry = openapi_client.models.metadata_entry_dto.MetadataEntryDTO(
                            version = 1, 
                            composite_hash = 'C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810', 
                            source_address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY', 
                            target_address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY', 
                            scoped_metadata_key = '0DC67FBE1CAD29E3', 
                            target_id = null, 
                            metadata_type = 0, 
                            value = '', ), )
                    ],
                pagination = openapi_client.models.pagination.Pagination(
                    page_number = 56, 
                    page_size = 56, ),
        )
        """

    def testMetadataPage(self):
        """Test MetadataPage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
