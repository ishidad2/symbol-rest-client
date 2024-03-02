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
    /// HashLockEntryDTO
    /// </summary>
    [DataContract(Name = "HashLockEntryDTO")]
    public partial class HashLockEntryDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public LockStatus Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="HashLockEntryDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected HashLockEntryDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="HashLockEntryDTO" /> class.
        /// </summary>
        /// <param name="varVersion">The version of the state (required).</param>
        /// <param name="ownerAddress">Address encoded using a 32-character set. (required).</param>
        /// <param name="mosaicId">Mosaic identifier. (required).</param>
        /// <param name="amount">Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). (required).</param>
        /// <param name="endHeight">Height of the blockchain. (required).</param>
        /// <param name="status">status (required).</param>
        /// <param name="hash">hash (required).</param>
        public HashLockEntryDTO(int varVersion = default(int), string ownerAddress = default(string), string mosaicId = default(string), string amount = default(string), string endHeight = default(string), LockStatus status = default(LockStatus), string hash = default(string))
        {
            this.VarVersion = varVersion;
            // to ensure "ownerAddress" is required (not null)
            if (ownerAddress == null)
            {
                throw new ArgumentNullException("ownerAddress is a required property for HashLockEntryDTO and cannot be null");
            }
            this.OwnerAddress = ownerAddress;
            // to ensure "mosaicId" is required (not null)
            if (mosaicId == null)
            {
                throw new ArgumentNullException("mosaicId is a required property for HashLockEntryDTO and cannot be null");
            }
            this.MosaicId = mosaicId;
            // to ensure "amount" is required (not null)
            if (amount == null)
            {
                throw new ArgumentNullException("amount is a required property for HashLockEntryDTO and cannot be null");
            }
            this.Amount = amount;
            // to ensure "endHeight" is required (not null)
            if (endHeight == null)
            {
                throw new ArgumentNullException("endHeight is a required property for HashLockEntryDTO and cannot be null");
            }
            this.EndHeight = endHeight;
            this.Status = status;
            // to ensure "hash" is required (not null)
            if (hash == null)
            {
                throw new ArgumentNullException("hash is a required property for HashLockEntryDTO and cannot be null");
            }
            this.Hash = hash;
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
        [DataMember(Name = "ownerAddress", IsRequired = true, EmitDefaultValue = true)]
        public string OwnerAddress { get; set; }

        /// <summary>
        /// Mosaic identifier.
        /// </summary>
        /// <value>Mosaic identifier.</value>
        /// <example>0DC67FBE1CAD29E3</example>
        [DataMember(Name = "mosaicId", IsRequired = true, EmitDefaultValue = true)]
        public string MosaicId { get; set; }

        /// <summary>
        /// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
        /// </summary>
        /// <value>Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).</value>
        /// <example>123456</example>
        [DataMember(Name = "amount", IsRequired = true, EmitDefaultValue = true)]
        public string Amount { get; set; }

        /// <summary>
        /// Height of the blockchain.
        /// </summary>
        /// <value>Height of the blockchain.</value>
        /// <example>1</example>
        [DataMember(Name = "endHeight", IsRequired = true, EmitDefaultValue = true)]
        public string EndHeight { get; set; }

        /// <summary>
        /// Gets or Sets Hash
        /// </summary>
        /// <example>C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810</example>
        [DataMember(Name = "hash", IsRequired = true, EmitDefaultValue = true)]
        public string Hash { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HashLockEntryDTO {\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  OwnerAddress: ").Append(OwnerAddress).Append("\n");
            sb.Append("  MosaicId: ").Append(MosaicId).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  EndHeight: ").Append(EndHeight).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Hash: ").Append(Hash).Append("\n");
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
