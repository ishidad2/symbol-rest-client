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
    /// DeploymentDTO
    /// </summary>
    [DataContract(Name = "DeploymentDTO")]
    public partial class DeploymentDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DeploymentDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentDTO" /> class.
        /// </summary>
        /// <param name="deploymentTool">The tool used to create, maintain and deploy the node. Examples: symbol-bootstrap, manual. (required).</param>
        /// <param name="deploymentToolVersion">The version of the tool used to create, maintain and deploy the node. (required).</param>
        /// <param name="lastUpdatedDate">When was the node last upgraded. (required).</param>
        public DeploymentDTO(string deploymentTool = default(string), string deploymentToolVersion = default(string), string lastUpdatedDate = default(string))
        {
            // to ensure "deploymentTool" is required (not null)
            if (deploymentTool == null)
            {
                throw new ArgumentNullException("deploymentTool is a required property for DeploymentDTO and cannot be null");
            }
            this.DeploymentTool = deploymentTool;
            // to ensure "deploymentToolVersion" is required (not null)
            if (deploymentToolVersion == null)
            {
                throw new ArgumentNullException("deploymentToolVersion is a required property for DeploymentDTO and cannot be null");
            }
            this.DeploymentToolVersion = deploymentToolVersion;
            // to ensure "lastUpdatedDate" is required (not null)
            if (lastUpdatedDate == null)
            {
                throw new ArgumentNullException("lastUpdatedDate is a required property for DeploymentDTO and cannot be null");
            }
            this.LastUpdatedDate = lastUpdatedDate;
        }

        /// <summary>
        /// The tool used to create, maintain and deploy the node. Examples: symbol-bootstrap, manual.
        /// </summary>
        /// <value>The tool used to create, maintain and deploy the node. Examples: symbol-bootstrap, manual.</value>
        /// <example>symbol-bootstrap</example>
        [DataMember(Name = "deploymentTool", IsRequired = true, EmitDefaultValue = true)]
        public string DeploymentTool { get; set; }

        /// <summary>
        /// The version of the tool used to create, maintain and deploy the node.
        /// </summary>
        /// <value>The version of the tool used to create, maintain and deploy the node.</value>
        /// <example>1.0.6</example>
        [DataMember(Name = "deploymentToolVersion", IsRequired = true, EmitDefaultValue = true)]
        public string DeploymentToolVersion { get; set; }

        /// <summary>
        /// When was the node last upgraded.
        /// </summary>
        /// <value>When was the node last upgraded.</value>
        /// <example>2021-06-02</example>
        [DataMember(Name = "lastUpdatedDate", IsRequired = true, EmitDefaultValue = true)]
        public string LastUpdatedDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DeploymentDTO {\n");
            sb.Append("  DeploymentTool: ").Append(DeploymentTool).Append("\n");
            sb.Append("  DeploymentToolVersion: ").Append(DeploymentToolVersion).Append("\n");
            sb.Append("  LastUpdatedDate: ").Append(LastUpdatedDate).Append("\n");
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
