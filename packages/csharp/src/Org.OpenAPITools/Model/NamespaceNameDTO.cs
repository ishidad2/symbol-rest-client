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
    /// NamespaceNameDTO
    /// </summary>
    [DataContract(Name = "NamespaceNameDTO")]
    public partial class NamespaceNameDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NamespaceNameDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NamespaceNameDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NamespaceNameDTO" /> class.
        /// </summary>
        /// <param name="parentId">Namespace identifier..</param>
        /// <param name="id">Namespace identifier. (required).</param>
        /// <param name="name">Namespace name. (required).</param>
        public NamespaceNameDTO(string parentId = default(string), string id = default(string), string name = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for NamespaceNameDTO and cannot be null");
            }
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for NamespaceNameDTO and cannot be null");
            }
            this.Name = name;
            this.ParentId = parentId;
        }

        /// <summary>
        /// Namespace identifier.
        /// </summary>
        /// <value>Namespace identifier.</value>
        /// <example>85BBEA6CC462B244</example>
        [DataMember(Name = "parentId", EmitDefaultValue = false)]
        public string ParentId { get; set; }

        /// <summary>
        /// Namespace identifier.
        /// </summary>
        /// <value>Namespace identifier.</value>
        /// <example>85BBEA6CC462B244</example>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Namespace name.
        /// </summary>
        /// <value>Namespace name.</value>
        /// <example>cat</example>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NamespaceNameDTO {\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
