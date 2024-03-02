//
// EmbeddedMosaicGlobalRestrictionTransactionDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct EmbeddedMosaicGlobalRestrictionTransactionDTO: Codable, JSONEncodable, Hashable {

    /** Public key. */
    public var signerPublicKey: String
    /** Entity version. */
    public var version: Int
    public var network: NetworkTypeEnum
    public var type: Int
    /** Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.  */
    public var mosaicId: String
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

    public init(signerPublicKey: String, version: Int, network: NetworkTypeEnum, type: Int, mosaicId: String, referenceMosaicId: String, restrictionKey: String, previousRestrictionValue: String, newRestrictionValue: String, previousRestrictionType: MosaicRestrictionTypeEnum, newRestrictionType: MosaicRestrictionTypeEnum) {
        self.signerPublicKey = signerPublicKey
        self.version = version
        self.network = network
        self.type = type
        self.mosaicId = mosaicId
        self.referenceMosaicId = referenceMosaicId
        self.restrictionKey = restrictionKey
        self.previousRestrictionValue = previousRestrictionValue
        self.newRestrictionValue = newRestrictionValue
        self.previousRestrictionType = previousRestrictionType
        self.newRestrictionType = newRestrictionType
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case signerPublicKey
        case version
        case network
        case type
        case mosaicId
        case referenceMosaicId
        case restrictionKey
        case previousRestrictionValue
        case newRestrictionValue
        case previousRestrictionType
        case newRestrictionType
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(signerPublicKey, forKey: .signerPublicKey)
        try container.encode(version, forKey: .version)
        try container.encode(network, forKey: .network)
        try container.encode(type, forKey: .type)
        try container.encode(mosaicId, forKey: .mosaicId)
        try container.encode(referenceMosaicId, forKey: .referenceMosaicId)
        try container.encode(restrictionKey, forKey: .restrictionKey)
        try container.encode(previousRestrictionValue, forKey: .previousRestrictionValue)
        try container.encode(newRestrictionValue, forKey: .newRestrictionValue)
        try container.encode(previousRestrictionType, forKey: .previousRestrictionType)
        try container.encode(newRestrictionType, forKey: .newRestrictionType)
    }
}

