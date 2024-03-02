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
    /// NodeKeyLinkNetworkPropertiesDTO
    /// </summary>
    [DataContract(Name = "NodeKeyLinkNetworkPropertiesDTO")]
    public partial class NodeKeyLinkNetworkPropertiesDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NodeKeyLinkNetworkPropertiesDTO" /> class.
        /// </summary>
        /// <param name="dummy">to trigger plugin load.</param>
        public NodeKeyLinkNetworkPropertiesDTO(string dummy = default(string))
        {
            this.Dummy = dummy;
        }

        /// <summary>
        /// to trigger plugin load
        /// </summary>
        /// <value>to trigger plugin load</value>
        [DataMember(Name = "dummy", EmitDefaultValue = false)]
        public string Dummy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NodeKeyLinkNetworkPropertiesDTO {\n");
            sb.Append("  Dummy: ").Append(Dummy).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
