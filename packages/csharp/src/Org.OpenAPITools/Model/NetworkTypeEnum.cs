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
    /// Network type: * 0x68 (104 decimal) - Main network. * 0x98 (152 decimal) - Test network. 
    /// </summary>
    /// <value>Network type: * 0x68 (104 decimal) - Main network. * 0x98 (152 decimal) - Test network. </value>
    public enum NetworkTypeEnum
    {
        /// <summary>
        /// Enum NUMBER_104 for value: 104
        /// </summary>
        NUMBER_104 = 104,

        /// <summary>
        /// Enum NUMBER_152 for value: 152
        /// </summary>
        NUMBER_152 = 152
    }

}
