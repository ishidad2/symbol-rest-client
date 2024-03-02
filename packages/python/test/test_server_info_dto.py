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

from openapi_client.models.server_info_dto import ServerInfoDTO

class TestServerInfoDTO(unittest.TestCase):
    """ServerInfoDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ServerInfoDTO:
        """Test ServerInfoDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ServerInfoDTO`
        """
        model = ServerInfoDTO()
        if include_optional:
            return ServerInfoDTO(
                server_info = openapi_client.models.server_dto.ServerDTO(
                    rest_version = '1.0.14', 
                    sdk_version = '0.7.14', 
                    deployment = openapi_client.models.deployment_dto.DeploymentDTO(
                        deployment_tool = 'symbol-bootstrap', 
                        deployment_tool_version = '1.0.6', 
                        last_updated_date = '2021-06-02', ), )
            )
        else:
            return ServerInfoDTO(
                server_info = openapi_client.models.server_dto.ServerDTO(
                    rest_version = '1.0.14', 
                    sdk_version = '0.7.14', 
                    deployment = openapi_client.models.deployment_dto.DeploymentDTO(
                        deployment_tool = 'symbol-bootstrap', 
                        deployment_tool_version = '1.0.6', 
                        last_updated_date = '2021-06-02', ), ),
        )
        """

    def testServerInfoDTO(self):
        """Test ServerInfoDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
