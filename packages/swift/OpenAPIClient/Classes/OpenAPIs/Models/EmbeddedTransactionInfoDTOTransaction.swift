//
// EmbeddedTransactionInfoDTOTransaction.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct EmbeddedTransactionInfoDTOTransaction: Codable, JSONEncodable, Hashable {

    /** Public key. */
    public var signerPublicKey: String
    /** Entity version. */
    public var version: Int
    public var network: NetworkTypeEnum
    public var type: Int
    /** 32 bytes voting public key. */
    public var linkedPublicKey: String
    public var linkAction: LinkActionEnum
    /** Finalization Epoch */
    public var startEpoch: Int64
    /** Finalization Epoch */
    public var endEpoch: Int64
    /** Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.  */
    public var mosaicId: String
    /** Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    public var amount: String
    /** Duration expressed in number of blocks. */
    public var duration: String
    public var hash: String
    /** Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA  */
    public var recipientAddress: String
    public var secret: String
    public var hashAlgorithm: LockHashAlgorithmEnum
    /** Original random set of bytes. */
    public var proof: String
    /** Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA  */
    public var targetAddress: String
    /** Metadata key scoped to source, target and type expressed. */
    public var scopedMetadataKey: String
    /** Change in value size in bytes. */
    public var valueSizeDelta: Int
    /** A number that allows uint 32 values. */
    public var valueSize: Int64
    /** Metadata value. If embedded in a transaction, this is calculated as xor(previous-value, value). */
    public var value: String
    /** Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.  */
    public var targetMosaicId: String
    /** Namespace identifier. */
    public var targetNamespaceId: String?
    /** Namespace identifier. */
    public var id: String
    /** A number that allows uint 32 values. */
    public var nonce: Int64
    /** - 0x00 (none) - No flags present. - 0x01 (supplyMutable) - Mosaic supports supply changes even when mosaic owner owns partial supply. - 0x02 (transferable) - Mosaic supports transfers between arbitrary accounts. When not set, mosaic can only be transferred to and from mosaic owner. - 0x04 (restrictable) - Mosaic supports custom restrictions configured by mosaic owner. - 0x08 (revokable) - Mosaic allows creator to revoke balances from another user.  */
    public var flags: Int
    /** Determines up to what decimal place the mosaic can be divided. Divisibility of 3 means that a mosaic can be divided into smallest parts of 0.001 mosaics. The divisibility must be in the range of 0 and 6.  */
    public var divisibility: Int
    /** Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    public var delta: String
    public var action: MosaicSupplyChangeActionEnum
    /** Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA  */
    public var sourceAddress: String
    /** Namespace identifier. */
    public var parentId: String?
    public var registrationType: NamespaceRegistrationTypeEnum
    /** Namespace name. */
    public var name: String
    /** Namespace identifier. */
    public var namespaceId: String
    /** Address encoded using a 32-character set. */
    public var address: String
    public var aliasAction: AliasActionEnum
    /** Number of signatures needed to remove a cosignatory. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories.  */
    public var minRemovalDelta: Int
    /** Number of signatures needed to approve a transaction. If we are modifying an existing multisig account, this indicates the relative change of the minimum cosignatories.  */
    public var minApprovalDelta: Int
    /** Array of cosignatory accounts to add. */
    public var addressAdditions: [String]
    /** Array of cosignatory accounts to delete. */
    public var addressDeletions: [String]
    public var restrictionFlags: AccountRestrictionFlagsEnum
    /** Account restriction additions. */
    public var restrictionAdditions: [TransactionTypeEnum]
    /** Account restriction deletions. */
    public var restrictionDeletions: [TransactionTypeEnum]
    /** Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.  */
    public var referenceMosaicId: String
    /** Restriction key. */
    public var restrictionKey: String
    /** Restriction value. */
    public var previousRestrictionValue: String
    /** Restriction value. */
    public var newRestrictionValue: String
    public var previousRestrictionType: MosaicRestrictionTypeEnum
    public var newRestrictionType: MosaicRestrictionTypeEnum
    /** Array of mosaics sent to the recipient.  */
    public var mosaics: [UnresolvedMosaic]
    /** Transfer transaction message */
    public var message: String?

    public init(signerPublicKey: String, version: Int, network: NetworkTypeEnum, type: Int, linkedPublicKey: String, linkAction: LinkActionEnum, startEpoch: Int64, endEpoch: Int64, mosaicId: String, amount: String, duration: String, hash: String, recipientAddress: String, secret: String, hashAlgorithm: LockHashAlgorithmEnum, proof: String, targetAddress: String, scopedMetadataKey: String, valueSizeDelta: Int, valueSize: Int64, value: String, targetMosaicId: String, targetNamespaceId: String? = nil, id: String, nonce: Int64, flags: Int, divisibility: Int, delta: String, action: MosaicSupplyChangeActionEnum, sourceAddress: String, parentId: String? = nil, registrationType: NamespaceRegistrationTypeEnum, name: String, namespaceId: String, address: String, aliasAction: AliasActionEnum, minRemovalDelta: Int, minApprovalDelta: Int, addressAdditions: [String], addressDeletions: [String], restrictionFlags: AccountRestrictionFlagsEnum, restrictionAdditions: [TransactionTypeEnum], restrictionDeletions: [TransactionTypeEnum], referenceMosaicId: String, restrictionKey: String, previousRestrictionValue: String, newRestrictionValue: String, previousRestrictionType: MosaicRestrictionTypeEnum, newRestrictionType: MosaicRestrictionTypeEnum, mosaics: [UnresolvedMosaic], message: String? = nil) {
        self.signerPublicKey = signerPublicKey
        self.version = version
        self.network = network
        self.type = type
        self.linkedPublicKey = linkedPublicKey
        self.linkAction = linkAction
        self.startEpoch = startEpoch
        self.endEpoch = endEpoch
        self.mosaicId = mosaicId
        self.amount = amount
        self.duration = duration
        self.hash = hash
        self.recipientAddress = recipientAddress
        self.secret = secret
        self.hashAlgorithm = hashAlgorithm
        self.proof = proof
        self.targetAddress = targetAddress
        self.scopedMetadataKey = scopedMetadataKey
        self.valueSizeDelta = valueSizeDelta
        self.valueSize = valueSize
        self.value = value
        self.targetMosaicId = targetMosaicId
        self.targetNamespaceId = targetNamespaceId
        self.id = id
        self.nonce = nonce
        self.flags = flags
        self.divisibility = divisibility
        self.delta = delta
        self.action = action
        self.sourceAddress = sourceAddress
        self.parentId = parentId
        self.registrationType = registrationType
        self.name = name
        self.namespaceId = namespaceId
        self.address = address
        self.aliasAction = aliasAction
        self.minRemovalDelta = minRemovalDelta
        self.minApprovalDelta = minApprovalDelta
        self.addressAdditions = addressAdditions
        self.addressDeletions = addressDeletions
        self.restrictionFlags = restrictionFlags
        self.restrictionAdditions = restrictionAdditions
        self.restrictionDeletions = restrictionDeletions
        self.referenceMosaicId = referenceMosaicId
        self.restrictionKey = restrictionKey
        self.previousRestrictionValue = previousRestrictionValue
        self.newRestrictionValue = newRestrictionValue
        self.previousRestrictionType = previousRestrictionType
        self.newRestrictionType = newRestrictionType
        self.mosaics = mosaics
        self.message = message
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case signerPublicKey
        case version
        case network
        case type
        case linkedPublicKey
        case linkAction
        case startEpoch
        case endEpoch
        case mosaicId
        case amount
        case duration
        case hash
        case recipientAddress
        case secret
        case hashAlgorithm
        case proof
        case targetAddress
        case scopedMetadataKey
        case valueSizeDelta
        case valueSize
        case value
        case targetMosaicId
        case targetNamespaceId
        case id
        case nonce
        case flags
        case divisibility
        case delta
        case action
        case sourceAddress
        case parentId
        case registrationType
        case name
        case namespaceId
        case address
        case aliasAction
        case minRemovalDelta
        case minApprovalDelta
        case addressAdditions
        case addressDeletions
        case restrictionFlags
        case restrictionAdditions
        case restrictionDeletions
        case referenceMosaicId
        case restrictionKey
        case previousRestrictionValue
        case newRestrictionValue
        case previousRestrictionType
        case newRestrictionType
        case mosaics
        case message
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(signerPublicKey, forKey: .signerPublicKey)
        try container.encode(version, forKey: .version)
        try container.encode(network, forKey: .network)
        try container.encode(type, forKey: .type)
        try container.encode(linkedPublicKey, forKey: .linkedPublicKey)
        try container.encode(linkAction, forKey: .linkAction)
        try container.encode(startEpoch, forKey: .startEpoch)
        try container.encode(endEpoch, forKey: .endEpoch)
        try container.encode(mosaicId, forKey: .mosaicId)
        try container.encode(amount, forKey: .amount)
        try container.encode(duration, forKey: .duration)
        try container.encode(hash, forKey: .hash)
        try container.encode(recipientAddress, forKey: .recipientAddress)
        try container.encode(secret, forKey: .secret)
        try container.encode(hashAlgorithm, forKey: .hashAlgorithm)
        try container.encode(proof, forKey: .proof)
        try container.encode(targetAddress, forKey: .targetAddress)
        try container.encode(scopedMetadataKey, forKey: .scopedMetadataKey)
        try container.encode(valueSizeDelta, forKey: .valueSizeDelta)
        try container.encode(valueSize, forKey: .valueSize)
        try container.encode(value, forKey: .value)
        try container.encode(targetMosaicId, forKey: .targetMosaicId)
        try container.encodeIfPresent(targetNamespaceId, forKey: .targetNamespaceId)
        try container.encode(id, forKey: .id)
        try container.encode(nonce, forKey: .nonce)
        try container.encode(flags, forKey: .flags)
        try container.encode(divisibility, forKey: .divisibility)
        try container.encode(delta, forKey: .delta)
        try container.encode(action, forKey: .action)
        try container.encode(sourceAddress, forKey: .sourceAddress)
        try container.encodeIfPresent(parentId, forKey: .parentId)
        try container.encode(registrationType, forKey: .registrationType)
        try container.encode(name, forKey: .name)
        try container.encode(namespaceId, forKey: .namespaceId)
        try container.encode(address, forKey: .address)
        try container.encode(aliasAction, forKey: .aliasAction)
        try container.encode(minRemovalDelta, forKey: .minRemovalDelta)
        try container.encode(minApprovalDelta, forKey: .minApprovalDelta)
        try container.encode(addressAdditions, forKey: .addressAdditions)
        try container.encode(addressDeletions, forKey: .addressDeletions)
        try container.encode(restrictionFlags, forKey: .restrictionFlags)
        try container.encode(restrictionAdditions, forKey: .restrictionAdditions)
        try container.encode(restrictionDeletions, forKey: .restrictionDeletions)
        try container.encode(referenceMosaicId, forKey: .referenceMosaicId)
        try container.encode(restrictionKey, forKey: .restrictionKey)
        try container.encode(previousRestrictionValue, forKey: .previousRestrictionValue)
        try container.encode(newRestrictionValue, forKey: .newRestrictionValue)
        try container.encode(previousRestrictionType, forKey: .previousRestrictionType)
        try container.encode(newRestrictionType, forKey: .newRestrictionType)
        try container.encode(mosaics, forKey: .mosaics)
        try container.encodeIfPresent(message, forKey: .message)
    }
}

