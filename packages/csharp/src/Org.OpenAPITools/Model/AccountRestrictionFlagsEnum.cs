/*
 * Catapult REST Endpoints
 *
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Type of account restriction: * 0x0001 (1 decimal) - Allow only incoming transactions from a given address. * 0x0002 (2 decimal) - Allow only incoming transactions containing a given mosaic identifier. * 0x4001 (16385 decimal) - Allow only outgoing transactions to a given address. * 0x4004 (16388 decimal) - Allow only outgoing transactions with a given transaction type. * 0x8001 (32769 decimal) - Block incoming transactions from a given address. * 0x8002 (32770 decimal) - Block incoming transactions containing a given mosaic identifier. * 0xC001 (49153 decimal) - Block outgoing transactions to a given address. * 0xC004 (49156 decimal) - Block outgoing transactions with a given transaction type. 
    /// </summary>
    /// <value>Type of account restriction: * 0x0001 (1 decimal) - Allow only incoming transactions from a given address. * 0x0002 (2 decimal) - Allow only incoming transactions containing a given mosaic identifier. * 0x4001 (16385 decimal) - Allow only outgoing transactions to a given address. * 0x4004 (16388 decimal) - Allow only outgoing transactions with a given transaction type. * 0x8001 (32769 decimal) - Block incoming transactions from a given address. * 0x8002 (32770 decimal) - Block incoming transactions containing a given mosaic identifier. * 0xC001 (49153 decimal) - Block outgoing transactions to a given address. * 0xC004 (49156 decimal) - Block outgoing transactions with a given transaction type. </value>
    public enum AccountRestrictionFlagsEnum
    {
        /// <summary>
        /// Enum NUMBER_1 for value: 1
        /// </summary>
        NUMBER_1 = 1,

        /// <summary>
        /// Enum NUMBER_2 for value: 2
        /// </summary>
        NUMBER_2 = 2,

        /// <summary>
        /// Enum NUMBER_16385 for value: 16385
        /// </summary>
        NUMBER_16385 = 16385,

        /// <summary>
        /// Enum NUMBER_16388 for value: 16388
        /// </summary>
        NUMBER_16388 = 16388,

        /// <summary>
        /// Enum NUMBER_32769 for value: 32769
        /// </summary>
        NUMBER_32769 = 32769,

        /// <summary>
        /// Enum NUMBER_32770 for value: 32770
        /// </summary>
        NUMBER_32770 = 32770,

        /// <summary>
        /// Enum NUMBER_49153 for value: 49153
        /// </summary>
        NUMBER_49153 = 49153,

        /// <summary>
        /// Enum NUMBER_49156 for value: 49156
        /// </summary>
        NUMBER_49156 = 49156
    }

}
