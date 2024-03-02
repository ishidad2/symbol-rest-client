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
    /// ResolutionStatementPage
    /// </summary>
    [DataContract(Name = "ResolutionStatementPage")]
    public partial class ResolutionStatementPage : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResolutionStatementPage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ResolutionStatementPage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ResolutionStatementPage" /> class.
        /// </summary>
        /// <param name="data">Array of transaction address resolution statements. (required).</param>
        /// <param name="pagination">pagination (required).</param>
        public ResolutionStatementPage(List<ResolutionStatementInfoDTO> data = default(List<ResolutionStatementInfoDTO>), Pagination pagination = default(Pagination))
        {
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for ResolutionStatementPage and cannot be null");
            }
            this.Data = data;
            // to ensure "pagination" is required (not null)
            if (pagination == null)
            {
                throw new ArgumentNullException("pagination is a required property for ResolutionStatementPage and cannot be null");
            }
            this.Pagination = pagination;
        }

        /// <summary>
        /// Array of transaction address resolution statements.
        /// </summary>
        /// <value>Array of transaction address resolution statements.</value>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public List<ResolutionStatementInfoDTO> Data { get; set; }

        /// <summary>
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", IsRequired = true, EmitDefaultValue = true)]
        public Pagination Pagination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResolutionStatementPage {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
