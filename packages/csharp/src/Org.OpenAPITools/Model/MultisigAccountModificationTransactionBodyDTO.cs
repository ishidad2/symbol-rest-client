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
    /// MultisigAccountModificationTransactionBodyDTO
    /// </summary>
    [DataContract(Name = "MultisigAccountModificationTransactionBodyDTO")]
    public partial class MultisigAccountModificationTransactionBodyDTO : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MultisigAccountModificationTransactionBodyDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MultisigAccountModificationTransactionBodyDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MultisigAccountModificationTransactionBodyDTO" /> class.
        /// </summary>
        /// <param name="minRemovalDelta">Number of signatures needed to remove a cosignatory. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories.  (required).</param>
        /// <param name="minApprovalDelta">Number of signatures needed to approve a transaction. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories.  (required).</param>
        /// <param name="addressAdditions">Array of cosignatory accounts to add. (required).</param>
        /// <param name="addressDeletions">Array of cosignatory accounts to delete. (required).</param>
        public MultisigAccountModificationTransactionBodyDTO(int minRemovalDelta = default(int), int minApprovalDelta = default(int), List<string> addressAdditions = default(List<string>), List<string> addressDeletions = default(List<string>))
        {
            this.MinRemovalDelta = minRemovalDelta;
            this.MinApprovalDelta = minApprovalDelta;
            // to ensure "addressAdditions" is required (not null)
            if (addressAdditions == null)
            {
                throw new ArgumentNullException("addressAdditions is a required property for MultisigAccountModificationTransactionBodyDTO and cannot be null");
            }
            this.AddressAdditions = addressAdditions;
            // to ensure "addressDeletions" is required (not null)
            if (addressDeletions == null)
            {
                throw new ArgumentNullException("addressDeletions is a required property for MultisigAccountModificationTransactionBodyDTO and cannot be null");
            }
            this.AddressDeletions = addressDeletions;
        }

        /// <summary>
        /// Number of signatures needed to remove a cosignatory. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories. 
        /// </summary>
        /// <value>Number of signatures needed to remove a cosignatory. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories. </value>
        /// <example>1</example>
        [DataMember(Name = "minRemovalDelta", IsRequired = true, EmitDefaultValue = true)]
        public int MinRemovalDelta { get; set; }

        /// <summary>
        /// Number of signatures needed to approve a transaction. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories. 
        /// </summary>
        /// <value>Number of signatures needed to approve a transaction. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories. </value>
        /// <example>1</example>
        [DataMember(Name = "minApprovalDelta", IsRequired = true, EmitDefaultValue = true)]
        public int MinApprovalDelta { get; set; }

        /// <summary>
        /// Array of cosignatory accounts to add.
        /// </summary>
        /// <value>Array of cosignatory accounts to add.</value>
        [DataMember(Name = "addressAdditions", IsRequired = true, EmitDefaultValue = true)]
        public List<string> AddressAdditions { get; set; }

        /// <summary>
        /// Array of cosignatory accounts to delete.
        /// </summary>
        /// <value>Array of cosignatory accounts to delete.</value>
        [DataMember(Name = "addressDeletions", IsRequired = true, EmitDefaultValue = true)]
        public List<string> AddressDeletions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MultisigAccountModificationTransactionBodyDTO {\n");
            sb.Append("  MinRemovalDelta: ").Append(MinRemovalDelta).Append("\n");
            sb.Append("  MinApprovalDelta: ").Append(MinApprovalDelta).Append("\n");
            sb.Append("  AddressAdditions: ").Append(AddressAdditions).Append("\n");
            sb.Append("  AddressDeletions: ").Append(AddressDeletions).Append("\n");
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
