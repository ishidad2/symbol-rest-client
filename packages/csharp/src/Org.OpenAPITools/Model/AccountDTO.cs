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
    /// AccountDTO
    /// </summary>
    [DataContract(Name = "AccountDTO")]
    public partial class AccountDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets AccountType
        /// </summary>
        [DataMember(Name = "accountType", IsRequired = true, EmitDefaultValue = true)]
        public AccountTypeEnum AccountType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AccountDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountDTO" /> class.
        /// </summary>
        /// <param name="varVersion">The version of the state (required).</param>
        /// <param name="address">Address encoded using a 32-character set. (required).</param>
        /// <param name="addressHeight">Height of the blockchain. (required).</param>
        /// <param name="publicKey">Public key. (required).</param>
        /// <param name="publicKeyHeight">Height of the blockchain. (required).</param>
        /// <param name="accountType">accountType (required).</param>
        /// <param name="supplementalPublicKeys">supplementalPublicKeys (required).</param>
        /// <param name="activityBuckets">activityBuckets (required).</param>
        /// <param name="mosaics">Mosaic units owned. (required).</param>
        /// <param name="importance">Probability of an account to harvest the next block. (required).</param>
        /// <param name="importanceHeight">Height of the blockchain. (required).</param>
        public AccountDTO(int varVersion = default(int), string address = default(string), string addressHeight = default(string), string publicKey = default(string), string publicKeyHeight = default(string), AccountTypeEnum accountType = default(AccountTypeEnum), SupplementalPublicKeysDTO supplementalPublicKeys = default(SupplementalPublicKeysDTO), List<ActivityBucketDTO> activityBuckets = default(List<ActivityBucketDTO>), List<Mosaic> mosaics = default(List<Mosaic>), string importance = default(string), string importanceHeight = default(string))
        {
            this.VarVersion = varVersion;
            // to ensure "address" is required (not null)
            if (address == null)
            {
                throw new ArgumentNullException("address is a required property for AccountDTO and cannot be null");
            }
            this.Address = address;
            // to ensure "addressHeight" is required (not null)
            if (addressHeight == null)
            {
                throw new ArgumentNullException("addressHeight is a required property for AccountDTO and cannot be null");
            }
            this.AddressHeight = addressHeight;
            // to ensure "publicKey" is required (not null)
            if (publicKey == null)
            {
                throw new ArgumentNullException("publicKey is a required property for AccountDTO and cannot be null");
            }
            this.PublicKey = publicKey;
            // to ensure "publicKeyHeight" is required (not null)
            if (publicKeyHeight == null)
            {
                throw new ArgumentNullException("publicKeyHeight is a required property for AccountDTO and cannot be null");
            }
            this.PublicKeyHeight = publicKeyHeight;
            this.AccountType = accountType;
            // to ensure "supplementalPublicKeys" is required (not null)
            if (supplementalPublicKeys == null)
            {
                throw new ArgumentNullException("supplementalPublicKeys is a required property for AccountDTO and cannot be null");
            }
            this.SupplementalPublicKeys = supplementalPublicKeys;
            // to ensure "activityBuckets" is required (not null)
            if (activityBuckets == null)
            {
                throw new ArgumentNullException("activityBuckets is a required property for AccountDTO and cannot be null");
            }
            this.ActivityBuckets = activityBuckets;
            // to ensure "mosaics" is required (not null)
            if (mosaics == null)
            {
                throw new ArgumentNullException("mosaics is a required property for AccountDTO and cannot be null");
            }
            this.Mosaics = mosaics;
            // to ensure "importance" is required (not null)
            if (importance == null)
            {
                throw new ArgumentNullException("importance is a required property for AccountDTO and cannot be null");
            }
            this.Importance = importance;
            // to ensure "importanceHeight" is required (not null)
            if (importanceHeight == null)
            {
                throw new ArgumentNullException("importanceHeight is a required property for AccountDTO and cannot be null");
            }
            this.ImportanceHeight = importanceHeight;
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
        /// Height of the blockchain.
        /// </summary>
        /// <value>Height of the blockchain.</value>
        /// <example>1</example>
        [DataMember(Name = "addressHeight", IsRequired = true, EmitDefaultValue = true)]
        public string AddressHeight { get; set; }

        /// <summary>
        /// Public key.
        /// </summary>
        /// <value>Public key.</value>
        /// <example>AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26</example>
        [DataMember(Name = "publicKey", IsRequired = true, EmitDefaultValue = true)]
        public string PublicKey { get; set; }

        /// <summary>
        /// Height of the blockchain.
        /// </summary>
        /// <value>Height of the blockchain.</value>
        /// <example>1</example>
        [DataMember(Name = "publicKeyHeight", IsRequired = true, EmitDefaultValue = true)]
        public string PublicKeyHeight { get; set; }

        /// <summary>
        /// Gets or Sets SupplementalPublicKeys
        /// </summary>
        [DataMember(Name = "supplementalPublicKeys", IsRequired = true, EmitDefaultValue = true)]
        public SupplementalPublicKeysDTO SupplementalPublicKeys { get; set; }

        /// <summary>
        /// Gets or Sets ActivityBuckets
        /// </summary>
        [DataMember(Name = "activityBuckets", IsRequired = true, EmitDefaultValue = true)]
        public List<ActivityBucketDTO> ActivityBuckets { get; set; }

        /// <summary>
        /// Mosaic units owned.
        /// </summary>
        /// <value>Mosaic units owned.</value>
        [DataMember(Name = "mosaics", IsRequired = true, EmitDefaultValue = true)]
        public List<Mosaic> Mosaics { get; set; }

        /// <summary>
        /// Probability of an account to harvest the next block.
        /// </summary>
        /// <value>Probability of an account to harvest the next block.</value>
        /// <example>0</example>
        [DataMember(Name = "importance", IsRequired = true, EmitDefaultValue = true)]
        public string Importance { get; set; }

        /// <summary>
        /// Height of the blockchain.
        /// </summary>
        /// <value>Height of the blockchain.</value>
        /// <example>1</example>
        [DataMember(Name = "importanceHeight", IsRequired = true, EmitDefaultValue = true)]
        public string ImportanceHeight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AccountDTO {\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  AddressHeight: ").Append(AddressHeight).Append("\n");
            sb.Append("  PublicKey: ").Append(PublicKey).Append("\n");
            sb.Append("  PublicKeyHeight: ").Append(PublicKeyHeight).Append("\n");
            sb.Append("  AccountType: ").Append(AccountType).Append("\n");
            sb.Append("  SupplementalPublicKeys: ").Append(SupplementalPublicKeys).Append("\n");
            sb.Append("  ActivityBuckets: ").Append(ActivityBuckets).Append("\n");
            sb.Append("  Mosaics: ").Append(Mosaics).Append("\n");
            sb.Append("  Importance: ").Append(Importance).Append("\n");
            sb.Append("  ImportanceHeight: ").Append(ImportanceHeight).Append("\n");
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
