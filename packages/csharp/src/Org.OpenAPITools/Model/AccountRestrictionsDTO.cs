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
    /// AccountRestrictionsDTO
    /// </summary>
    [DataContract(Name = "AccountRestrictionsDTO")]
    public partial class AccountRestrictionsDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountRestrictionsDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AccountRestrictionsDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountRestrictionsDTO" /> class.
        /// </summary>
        /// <param name="varVersion">The version of the state (required).</param>
        /// <param name="address">Address encoded using a 32-character set. (required).</param>
        /// <param name="restrictions">restrictions (required).</param>
        public AccountRestrictionsDTO(int varVersion = default(int), string address = default(string), List<AccountRestrictionDTO> restrictions = default(List<AccountRestrictionDTO>))
        {
            this.VarVersion = varVersion;
            // to ensure "address" is required (not null)
            if (address == null)
            {
                throw new ArgumentNullException("address is a required property for AccountRestrictionsDTO and cannot be null");
            }
            this.Address = address;
            // to ensure "restrictions" is required (not null)
            if (restrictions == null)
            {
                throw new ArgumentNullException("restrictions is a required property for AccountRestrictionsDTO and cannot be null");
            }
            this.Restrictions = restrictions;
        }

        /// <summary>
        /// The version of the state
        /// </summary>
        /// <value>The version of the state</value>
        /// <example>1</example>
        [DataMember(Name = "version", IsRequired = true, EmitDefaultValue = true)]
        public int VarVersion { get; set; }

        /// <summary>
        /// Address encoded using a 32-character set.
        /// </summary>
        /// <value>Address encoded using a 32-character set.</value>
        /// <example>TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY</example>
        [DataMember(Name = "address", IsRequired = true, EmitDefaultValue = true)]
        public string Address { get; set; }

        /// <summary>
        /// Gets or Sets Restrictions
        /// </summary>
        [DataMember(Name = "restrictions", IsRequired = true, EmitDefaultValue = true)]
        public List<AccountRestrictionDTO> Restrictions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AccountRestrictionsDTO {\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Restrictions: ").Append(Restrictions).Append("\n");
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
