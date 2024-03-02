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
    /// AccountKeyLinkTransactionBodyDTO
    /// </summary>
    [DataContract(Name = "AccountKeyLinkTransactionBodyDTO")]
    public partial class AccountKeyLinkTransactionBodyDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets LinkAction
        /// </summary>
        [DataMember(Name = "linkAction", IsRequired = true, EmitDefaultValue = true)]
        public LinkActionEnum LinkAction { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountKeyLinkTransactionBodyDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AccountKeyLinkTransactionBodyDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountKeyLinkTransactionBodyDTO" /> class.
        /// </summary>
        /// <param name="linkedPublicKey">Public key. (required).</param>
        /// <param name="linkAction">linkAction (required).</param>
        public AccountKeyLinkTransactionBodyDTO(string linkedPublicKey = default(string), LinkActionEnum linkAction = default(LinkActionEnum))
        {
            // to ensure "linkedPublicKey" is required (not null)
            if (linkedPublicKey == null)
            {
                throw new ArgumentNullException("linkedPublicKey is a required property for AccountKeyLinkTransactionBodyDTO and cannot be null");
            }
            this.LinkedPublicKey = linkedPublicKey;
            this.LinkAction = linkAction;
        }

        /// <summary>
        /// Public key.
        /// </summary>
        /// <value>Public key.</value>
        /// <example>AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26</example>
        [DataMember(Name = "linkedPublicKey", IsRequired = true, EmitDefaultValue = true)]
        public string LinkedPublicKey { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AccountKeyLinkTransactionBodyDTO {\n");
            sb.Append("  LinkedPublicKey: ").Append(LinkedPublicKey).Append("\n");
            sb.Append("  LinkAction: ").Append(LinkAction).Append("\n");
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
