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

from openapi_client.models.address_alias_transaction_body_dto import AddressAliasTransactionBodyDTO

class TestAddressAliasTransactionBodyDTO(unittest.TestCase):
    """AddressAliasTransactionBodyDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AddressAliasTransactionBodyDTO:
        """Test AddressAliasTransactionBodyDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AddressAliasTransactionBodyDTO`
        """
        model = AddressAliasTransactionBodyDTO()
        if include_optional:
            return AddressAliasTransactionBodyDTO(
                namespace_id = '85BBEA6CC462B244',
                address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY',
                alias_action = 0
            )
        else:
            return AddressAliasTransactionBodyDTO(
                namespace_id = '85BBEA6CC462B244',
                address = 'TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY',
                alias_action = 0,
        )
        """

    def testAddressAliasTransactionBodyDTO(self):
        """Test AddressAliasTransactionBodyDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
