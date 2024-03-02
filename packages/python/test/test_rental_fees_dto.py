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

from openapi_client.models.rental_fees_dto import RentalFeesDTO

class TestRentalFeesDTO(unittest.TestCase):
    """RentalFeesDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RentalFeesDTO:
        """Test RentalFeesDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RentalFeesDTO`
        """
        model = RentalFeesDTO()
        if include_optional:
            return RentalFeesDTO(
                effective_root_namespace_rental_fee_per_block = '123456',
                effective_child_namespace_rental_fee = '123456',
                effective_mosaic_rental_fee = '123456'
            )
        else:
            return RentalFeesDTO(
                effective_root_namespace_rental_fee_per_block = '123456',
                effective_child_namespace_rental_fee = '123456',
                effective_mosaic_rental_fee = '123456',
        )
        """

    def testRentalFeesDTO(self):
        """Test RentalFeesDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
