<?php
/**
 * AccountRestrictionFlagsEnum
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  SymbolRestClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Catapult REST Endpoints
 *
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 7.2.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace SymbolRestClient\Model;
use \SymbolRestClient\ObjectSerializer;

/**
 * AccountRestrictionFlagsEnum Class Doc Comment
 *
 * @category Class
 * @description Type of account restriction: * 0x0001 (1 decimal) - Allow only incoming transactions from a given address. * 0x0002 (2 decimal) - Allow only incoming transactions containing a given mosaic identifier. * 0x4001 (16385 decimal) - Allow only outgoing transactions to a given address. * 0x4004 (16388 decimal) - Allow only outgoing transactions with a given transaction type. * 0x8001 (32769 decimal) - Block incoming transactions from a given address. * 0x8002 (32770 decimal) - Block incoming transactions containing a given mosaic identifier. * 0xC001 (49153 decimal) - Block outgoing transactions to a given address. * 0xC004 (49156 decimal) - Block outgoing transactions with a given transaction type.
 * @package  SymbolRestClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class AccountRestrictionFlagsEnum
{
    /**
     * Possible values of this enum
     */
    public const NUMBER_1 = 1;

    public const NUMBER_2 = 2;

    public const NUMBER_16385 = 16385;

    public const NUMBER_16388 = 16388;

    public const NUMBER_32769 = 32769;

    public const NUMBER_32770 = 32770;

    public const NUMBER_49153 = 49153;

    public const NUMBER_49156 = 49156;

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::NUMBER_1,
            self::NUMBER_2,
            self::NUMBER_16385,
            self::NUMBER_16388,
            self::NUMBER_32769,
            self::NUMBER_32770,
            self::NUMBER_49153,
            self::NUMBER_49156
        ];
    }
}


