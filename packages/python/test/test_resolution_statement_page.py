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

from openapi_client.models.resolution_statement_page import ResolutionStatementPage

class TestResolutionStatementPage(unittest.TestCase):
    """ResolutionStatementPage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ResolutionStatementPage:
        """Test ResolutionStatementPage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ResolutionStatementPage`
        """
        model = ResolutionStatementPage()
        if include_optional:
            return ResolutionStatementPage(
                data = [
                    openapi_client.models.resolution_statement_info_dto.ResolutionStatementInfoDTO(
                        id = '', 
                        meta = openapi_client.models.statement_meta_dto.StatementMetaDTO(
                            timestamp = '108303181802', ), 
                        statement = openapi_client.models.resolution_statement_dto.ResolutionStatementDTO(
                            height = '1', 
                            unresolved = null, 
                            resolution_entries = [
                                openapi_client.models.resolution_entry_dto.ResolutionEntryDTO(
                                    source = openapi_client.models.source_dto.SourceDTO(
                                        primary_id = 2222212828, 
                                        secondary_id = 2222212828, ), 
                                    resolved = null, )
                                ], ), )
                    ],
                pagination = openapi_client.models.pagination.Pagination(
                    page_number = 56, 
                    page_size = 56, )
            )
        else:
            return ResolutionStatementPage(
                data = [
                    openapi_client.models.resolution_statement_info_dto.ResolutionStatementInfoDTO(
                        id = '', 
                        meta = openapi_client.models.statement_meta_dto.StatementMetaDTO(
                            timestamp = '108303181802', ), 
                        statement = openapi_client.models.resolution_statement_dto.ResolutionStatementDTO(
                            height = '1', 
                            unresolved = null, 
                            resolution_entries = [
                                openapi_client.models.resolution_entry_dto.ResolutionEntryDTO(
                                    source = openapi_client.models.source_dto.SourceDTO(
                                        primary_id = 2222212828, 
                                        secondary_id = 2222212828, ), 
                                    resolved = null, )
                                ], ), )
                    ],
                pagination = openapi_client.models.pagination.Pagination(
                    page_number = 56, 
                    page_size = 56, ),
        )
        """

    def testResolutionStatementPage(self):
        """Test ResolutionStatementPage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
