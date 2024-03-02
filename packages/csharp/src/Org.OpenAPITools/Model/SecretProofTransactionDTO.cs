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
    /// Transaction to reveal a proof.
    /// </summary>
    [DataContract(Name = "SecretProofTransactionDTO")]
    public partial class SecretProofTransactionDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Network
        /// </summary>
        [DataMember(Name = "network", IsRequired = true, EmitDefaultValue = true)]
        public NetworkTypeEnum Network { get; set; }

        /// <summary>
        /// Gets or Sets HashAlgorithm
        /// </summary>
        [DataMember(Name = "hashAlgorithm", IsRequired = true, EmitDefaultValue = true)]
        public LockHashAlgorithmEnum HashAlgorithm { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecretProofTransactionDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SecretProofTransactionDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecretProofTransactionDTO" /> class.
        /// </summary>
        /// <param name="size">A number that allows uint 32 values. (required).</param>
        /// <param name="signature">Entity&#39;s signature generated by the signer. (required).</param>
        /// <param name="signerPublicKey">Public key. (required).</param>
        /// <param name="varVersion">Entity version. (required).</param>
        /// <param name="network">network (required).</param>
        /// <param name="type">type (required).</param>
        /// <param name="maxFee">Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). (required).</param>
        /// <param name="deadline">Duration expressed in number of blocks. (required).</param>
        /// <param name="recipientAddress">Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA  (required).</param>
        /// <param name="secret">secret (required).</param>
        /// <param name="hashAlgorithm">hashAlgorithm (required).</param>
        /// <param name="proof">Original random set of bytes. (required).</param>
        public SecretProofTransactionDTO(long size = default(long), string signature = default(string), string signerPublicKey = default(string), int varVersion = default(int), NetworkTypeEnum network = default(NetworkTypeEnum), int type = default(int), string maxFee = default(string), string deadline = default(string), string recipientAddress = default(string), string secret = default(string), LockHashAlgorithmEnum hashAlgorithm = default(LockHashAlgorithmEnum), string proof = default(string))
        {
            this.Size = size;
            // to ensure "signature" is required (not null)
            if (signature == null)
            {
                throw new ArgumentNullException("signature is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.Signature = signature;
            // to ensure "signerPublicKey" is required (not null)
            if (signerPublicKey == null)
            {
                throw new ArgumentNullException("signerPublicKey is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.SignerPublicKey = signerPublicKey;
            this.VarVersion = varVersion;
            this.Network = network;
            this.Type = type;
            // to ensure "maxFee" is required (not null)
            if (maxFee == null)
            {
                throw new ArgumentNullException("maxFee is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.MaxFee = maxFee;
            // to ensure "deadline" is required (not null)
            if (deadline == null)
            {
                throw new ArgumentNullException("deadline is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.Deadline = deadline;
            // to ensure "recipientAddress" is required (not null)
            if (recipientAddress == null)
            {
                throw new ArgumentNullException("recipientAddress is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.RecipientAddress = recipientAddress;
            // to ensure "secret" is required (not null)
            if (secret == null)
            {
                throw new ArgumentNullException("secret is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.Secret = secret;
            this.HashAlgorithm = hashAlgorithm;
            // to ensure "proof" is required (not null)
            if (proof == null)
            {
                throw new ArgumentNullException("proof is a required property for SecretProofTransactionDTO and cannot be null");
            }
            this.Proof = proof;
        }

        /// <summary>
        /// A number that allows uint 32 values.
        /// </summary>
        /// <value>A number that allows uint 32 values.</value>
        /// <example>2222212828</example>
        [DataMember(Name = "size", IsRequired = true, EmitDefaultValue = true)]
        public long Size { get; set; }

        /// <summary>
        /// Entity&#39;s signature generated by the signer.
        /// </summary>
        /// <value>Entity&#39;s signature generated by the signer.</value>
        /// <example>4B408BBEDF25F2AC8E0E44A6E51E3CCBA03885902055F75EB9FF50433532CA44BF9175FDA7502EEE2FC1617126E453A2BD692BAFDAAF06BC8EDEBA7961B3730D</example>
        [DataMember(Name = "signature", IsRequired = true, EmitDefaultValue = true)]
        public string Signature { get; set; }

        /// <summary>
        /// Public key.
        /// </summary>
        /// <value>Public key.</value>
        /// <example>AC1A6E1D8DE5B17D2C6B1293F1CAD3829EEACF38D09311BB3C8E5A880092DE26</example>
        [DataMember(Name = "signerPublicKey", IsRequired = true, EmitDefaultValue = true)]
        public string SignerPublicKey { get; set; }

        /// <summary>
        /// Entity version.
        /// </summary>
        /// <value>Entity version.</value>
        [DataMember(Name = "version", IsRequired = true, EmitDefaultValue = true)]
        public int VarVersion { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public int Type { get; set; }

        /// <summary>
        /// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
        /// </summary>
        /// <value>Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).</value>
        /// <example>123456</example>
        [DataMember(Name = "maxFee", IsRequired = true, EmitDefaultValue = true)]
        public string MaxFee { get; set; }

        /// <summary>
        /// Duration expressed in number of blocks.
        /// </summary>
        /// <value>Duration expressed in number of blocks.</value>
        /// <example>200</example>
        [DataMember(Name = "deadline", IsRequired = true, EmitDefaultValue = true)]
        public string Deadline { get; set; }

        /// <summary>
        /// Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA 
        /// </summary>
        /// <value>Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA </value>
        /// <example>TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA</example>
        [DataMember(Name = "recipientAddress", IsRequired = true, EmitDefaultValue = true)]
        public string RecipientAddress { get; set; }

        /// <summary>
        /// Gets or Sets Secret
        /// </summary>
        /// <example>C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810</example>
        [DataMember(Name = "secret", IsRequired = true, EmitDefaultValue = true)]
        public string Secret { get; set; }

        /// <summary>
        /// Original random set of bytes.
        /// </summary>
        /// <value>Original random set of bytes.</value>
        [DataMember(Name = "proof", IsRequired = true, EmitDefaultValue = true)]
        public string Proof { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecretProofTransactionDTO {\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Signature: ").Append(Signature).Append("\n");
            sb.Append("  SignerPublicKey: ").Append(SignerPublicKey).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Network: ").Append(Network).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  MaxFee: ").Append(MaxFee).Append("\n");
            sb.Append("  Deadline: ").Append(Deadline).Append("\n");
            sb.Append("  RecipientAddress: ").Append(RecipientAddress).Append("\n");
            sb.Append("  Secret: ").Append(Secret).Append("\n");
            sb.Append("  HashAlgorithm: ").Append(HashAlgorithm).Append("\n");
            sb.Append("  Proof: ").Append(Proof).Append("\n");
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
