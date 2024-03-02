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
    /// NodeHealthDTO
    /// </summary>
    [DataContract(Name = "NodeHealthDTO")]
    public partial class NodeHealthDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets ApiNode
        /// </summary>
        [DataMember(Name = "apiNode", IsRequired = true, EmitDefaultValue = true)]
        public NodeStatusEnum ApiNode { get; set; }

        /// <summary>
        /// Gets or Sets Db
        /// </summary>
        [DataMember(Name = "db", IsRequired = true, EmitDefaultValue = true)]
        public NodeStatusEnum Db { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="NodeHealthDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NodeHealthDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NodeHealthDTO" /> class.
        /// </summary>
        /// <param name="apiNode">apiNode (required).</param>
        /// <param name="db">db (required).</param>
        public NodeHealthDTO(NodeStatusEnum apiNode = default(NodeStatusEnum), NodeStatusEnum db = default(NodeStatusEnum))
        {
            this.ApiNode = apiNode;
            this.Db = db;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NodeHealthDTO {\n");
            sb.Append("  ApiNode: ").Append(ApiNode).Append("\n");
            sb.Append("  Db: ").Append(Db).Append("\n");
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
