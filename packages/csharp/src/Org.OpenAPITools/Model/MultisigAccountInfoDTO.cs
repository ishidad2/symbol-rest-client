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
    /// MultisigAccountInfoDTO
    /// </summary>
    [DataContract(Name = "MultisigAccountInfoDTO")]
    public partial class MultisigAccountInfoDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MultisigAccountInfoDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MultisigAccountInfoDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MultisigAccountInfoDTO" /> class.
        /// </summary>
        /// <param name="multisig">multisig (required).</param>
        public MultisigAccountInfoDTO(MultisigDTO multisig = default(MultisigDTO))
        {
            // to ensure "multisig" is required (not null)
            if (multisig == null)
            {
                throw new ArgumentNullException("multisig is a required property for MultisigAccountInfoDTO and cannot be null");
            }
            this.Multisig = multisig;
        }

        /// <summary>
        /// Gets or Sets Multisig
        /// </summary>
        [DataMember(Name = "multisig", IsRequired = true, EmitDefaultValue = true)]
        public MultisigDTO Multisig { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MultisigAccountInfoDTO {\n");
            sb.Append("  Multisig: ").Append(Multisig).Append("\n");
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
