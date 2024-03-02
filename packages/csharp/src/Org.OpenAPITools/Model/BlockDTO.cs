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
    /// BlockDTO
    /// </summary>
    [DataContract(Name = "BlockDTO")]
    public partial class BlockDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Network
        /// </summary>
        [DataMember(Name = "network", IsRequired = true, EmitDefaultValue = true)]
        public NetworkTypeEnum Network { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BlockDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockDTO" /> class.
        /// </summary>
        /// <param name="size">A number that allows uint 32 values. (required).</param>
        /// <param name="signature">Entity&#39;s signature generated by the signer. (required).</param>
        /// <param name="signerPublicKey">Public key. (required).</param>
        /// <param name="varVersion">Entity version. (required).</param>
        /// <param name="network">network (required).</param>
        /// <param name="type">type (required).</param>
        /// <param name="height">Height of the blockchain. (required).</param>
        /// <param name="timestamp">Number of milliseconds elapsed since the creation of the nemesis block. This value can be converted to epoch time by adding the network&#39;s &#39;epochAdjustment&#39;. (required).</param>
        /// <param name="difficulty">Determines how hard is to harvest a new block, based on previous blocks. (required).</param>
        /// <param name="proofGamma">32-bytes VRF proof gamma. (required).</param>
        /// <param name="proofVerificationHash">16-bytes VRF proof verification hash. (required).</param>
        /// <param name="proofScalar">32-bytes VRF proof scalar. (required).</param>
        /// <param name="previousBlockHash">previousBlockHash (required).</param>
        /// <param name="transactionsHash">transactionsHash (required).</param>
        /// <param name="receiptsHash">receiptsHash (required).</param>
        /// <param name="stateHash">stateHash (required).</param>
        /// <param name="beneficiaryAddress">Address encoded using a 32-character set. (required).</param>
        /// <param name="feeMultiplier">Fee multiplier applied to transactions contained in block. (required).</param>
        public BlockDTO(long size = default(long), string signature = default(string), string signerPublicKey = default(string), int varVersion = default(int), NetworkTypeEnum network = default(NetworkTypeEnum), int type = default(int), string height = default(string), string timestamp = default(string), string difficulty = default(string), string proofGamma = default(string), string proofVerificationHash = default(string), string proofScalar = default(string), string previousBlockHash = default(string), string transactionsHash = default(string), string receiptsHash = default(string), string stateHash = default(string), string beneficiaryAddress = default(string), long feeMultiplier = default(long))
        {
            this.Size = size;
            // to ensure "signature" is required (not null)
            if (signature == null)
            {
                throw new ArgumentNullException("signature is a required property for BlockDTO and cannot be null");
            }
            this.Signature = signature;
            // to ensure "signerPublicKey" is required (not null)
            if (signerPublicKey == null)
            {
                throw new ArgumentNullException("signerPublicKey is a required property for BlockDTO and cannot be null");
            }
            this.SignerPublicKey = signerPublicKey;
            this.VarVersion = varVersion;
            this.Network = network;
            this.Type = type;
            // to ensure "height" is required (not null)
            if (height == null)
            {
                throw new ArgumentNullException("height is a required property for BlockDTO and cannot be null");
            }
            this.Height = height;
            // to ensure "timestamp" is required (not null)
            if (timestamp == null)
            {
                throw new ArgumentNullException("timestamp is a required property for BlockDTO and cannot be null");
            }
            this.Timestamp = timestamp;
            // to ensure "difficulty" is required (not null)
            if (difficulty == null)
            {
                throw new ArgumentNullException("difficulty is a required property for BlockDTO and cannot be null");
            }
            this.Difficulty = difficulty;
            // to ensure "proofGamma" is required (not null)
            if (proofGamma == null)
            {
                throw new ArgumentNullException("proofGamma is a required property for BlockDTO and cannot be null");
            }
            this.ProofGamma = proofGamma;
            // to ensure "proofVerificationHash" is required (not null)
            if (proofVerificationHash == null)
            {
                throw new ArgumentNullException("proofVerificationHash is a required property for BlockDTO and cannot be null");
            }
            this.ProofVerificationHash = proofVerificationHash;
            // to ensure "proofScalar" is required (not null)
            if (proofScalar == null)
            {
                throw new ArgumentNullException("proofScalar is a required property for BlockDTO and cannot be null");
            }
            this.ProofScalar = proofScalar;
            // to ensure "previousBlockHash" is required (not null)
            if (previousBlockHash == null)
            {
                throw new ArgumentNullException("previousBlockHash is a required property for BlockDTO and cannot be null");
            }
            this.PreviousBlockHash = previousBlockHash;
            // to ensure "transactionsHash" is required (not null)
            if (transactionsHash == null)
            {
                throw new ArgumentNullException("transactionsHash is a required property for BlockDTO and cannot be null");
            }
            this.TransactionsHash = transactionsHash;
            // to ensure "receiptsHash" is required (not null)
            if (receiptsHash == null)
            {
                throw new ArgumentNullException("receiptsHash is a required property for BlockDTO and cannot be null");
            }
            this.ReceiptsHash = receiptsHash;
            // to ensure "stateHash" is required (not null)
            if (stateHash == null)
            {
                throw new ArgumentNullException("stateHash is a required property for BlockDTO and cannot be null");
            }
            this.StateHash = stateHash;
            // to ensure "beneficiaryAddress" is required (not null)
            if (beneficiaryAddress == null)
            {
                throw new ArgumentNullException("beneficiaryAddress is a required property for BlockDTO and cannot be null");
            }
            this.BeneficiaryAddress = beneficiaryAddress;
            this.FeeMultiplier = feeMultiplier;
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
        /// Height of the blockchain.
        /// </summary>
        /// <value>Height of the blockchain.</value>
        /// <example>1</example>
        [DataMember(Name = "height", IsRequired = true, EmitDefaultValue = true)]
        public string Height { get; set; }

        /// <summary>
        /// Number of milliseconds elapsed since the creation of the nemesis block. This value can be converted to epoch time by adding the network&#39;s &#39;epochAdjustment&#39;.
        /// </summary>
        /// <value>Number of milliseconds elapsed since the creation of the nemesis block. This value can be converted to epoch time by adding the network&#39;s &#39;epochAdjustment&#39;.</value>
        /// <example>108303181802</example>
        [DataMember(Name = "timestamp", IsRequired = true, EmitDefaultValue = true)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Determines how hard is to harvest a new block, based on previous blocks.
        /// </summary>
        /// <value>Determines how hard is to harvest a new block, based on previous blocks.</value>
        /// <example>100000000000000</example>
        [DataMember(Name = "difficulty", IsRequired = true, EmitDefaultValue = true)]
        public string Difficulty { get; set; }

        /// <summary>
        /// 32-bytes VRF proof gamma.
        /// </summary>
        /// <value>32-bytes VRF proof gamma.</value>
        /// <example>8D49594A96C31EC6C64305FB2CCB47AA7A4AC0A4F614442BB3684D2BF41F274E</example>
        [DataMember(Name = "proofGamma", IsRequired = true, EmitDefaultValue = true)]
        public string ProofGamma { get; set; }

        /// <summary>
        /// 16-bytes VRF proof verification hash.
        /// </summary>
        /// <value>16-bytes VRF proof verification hash.</value>
        /// <example>82FB583BFE3EE78805784D078F2547AE</example>
        [DataMember(Name = "proofVerificationHash", IsRequired = true, EmitDefaultValue = true)]
        public string ProofVerificationHash { get; set; }

        /// <summary>
        /// 32-bytes VRF proof scalar.
        /// </summary>
        /// <value>32-bytes VRF proof scalar.</value>
        /// <example>480175C83739B22C53EAECAA7E7F3B245F1DFAFA6B3AE5C1D0129502FCBAAD0C</example>
        [DataMember(Name = "proofScalar", IsRequired = true, EmitDefaultValue = true)]
        public string ProofScalar { get; set; }

        /// <summary>
        /// Gets or Sets PreviousBlockHash
        /// </summary>
        /// <example>C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810</example>
        [DataMember(Name = "previousBlockHash", IsRequired = true, EmitDefaultValue = true)]
        public string PreviousBlockHash { get; set; }

        /// <summary>
        /// Gets or Sets TransactionsHash
        /// </summary>
        /// <example>C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810</example>
        [DataMember(Name = "transactionsHash", IsRequired = true, EmitDefaultValue = true)]
        public string TransactionsHash { get; set; }

        /// <summary>
        /// Gets or Sets ReceiptsHash
        /// </summary>
        /// <example>C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810</example>
        [DataMember(Name = "receiptsHash", IsRequired = true, EmitDefaultValue = true)]
        public string ReceiptsHash { get; set; }

        /// <summary>
        /// Gets or Sets StateHash
        /// </summary>
        /// <example>C8FC3FB54FDDFBCE0E8C71224990124E4EEC5AD5D30E592EDFA9524669A23810</example>
        [DataMember(Name = "stateHash", IsRequired = true, EmitDefaultValue = true)]
        public string StateHash { get; set; }

        /// <summary>
        /// Address encoded using a 32-character set.
        /// </summary>
        /// <value>Address encoded using a 32-character set.</value>
        /// <example>TADP6C2GVEG654OP5LZI32P2GYJSCMEGQBYB7QY</example>
        [DataMember(Name = "beneficiaryAddress", IsRequired = true, EmitDefaultValue = true)]
        public string BeneficiaryAddress { get; set; }

        /// <summary>
        /// Fee multiplier applied to transactions contained in block.
        /// </summary>
        /// <value>Fee multiplier applied to transactions contained in block.</value>
        /// <example>0</example>
        [DataMember(Name = "feeMultiplier", IsRequired = true, EmitDefaultValue = true)]
        public long FeeMultiplier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockDTO {\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Signature: ").Append(Signature).Append("\n");
            sb.Append("  SignerPublicKey: ").Append(SignerPublicKey).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Network: ").Append(Network).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Difficulty: ").Append(Difficulty).Append("\n");
            sb.Append("  ProofGamma: ").Append(ProofGamma).Append("\n");
            sb.Append("  ProofVerificationHash: ").Append(ProofVerificationHash).Append("\n");
            sb.Append("  ProofScalar: ").Append(ProofScalar).Append("\n");
            sb.Append("  PreviousBlockHash: ").Append(PreviousBlockHash).Append("\n");
            sb.Append("  TransactionsHash: ").Append(TransactionsHash).Append("\n");
            sb.Append("  ReceiptsHash: ").Append(ReceiptsHash).Append("\n");
            sb.Append("  StateHash: ").Append(StateHash).Append("\n");
            sb.Append("  BeneficiaryAddress: ").Append(BeneficiaryAddress).Append("\n");
            sb.Append("  FeeMultiplier: ").Append(FeeMultiplier).Append("\n");
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
