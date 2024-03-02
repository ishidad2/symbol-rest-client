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

from openapi_client.models.multisig_network_properties_dto import MultisigNetworkPropertiesDTO

class TestMultisigNetworkPropertiesDTO(unittest.TestCase):
    """MultisigNetworkPropertiesDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MultisigNetworkPropertiesDTO:
        """Test MultisigNetworkPropertiesDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MultisigNetworkPropertiesDTO`
        """
        model = MultisigNetworkPropertiesDTO()
        if include_optional:
            return MultisigNetworkPropertiesDTO(
                max_multisig_depth = '3',
                max_cosignatories_per_account = '10',
                max_cosigned_accounts_per_account = '5'
            )
        else:
            return MultisigNetworkPropertiesDTO(
        )
        """

    def testMultisigNetworkPropertiesDTO(self):
        """Test MultisigNetworkPropertiesDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
