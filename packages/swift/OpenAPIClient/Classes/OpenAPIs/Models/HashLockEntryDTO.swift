//
// HashLockEntryDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct HashLockEntryDTO: Codable, JSONEncodable, Hashable {

    /** The version of the state */
    public var version: Int
    /** Address encoded using a 32-character set. */
    public var ownerAddress: String
    /** Mosaic identifier. */
    public var mosaicId: String
    /** Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    public var amount: String
    /** Height of the blockchain. */
    public var endHeight: String
    public var status: LockStatus
    public var hash: String

    public init(version: Int, ownerAddress: String, mosaicId: String, amount: String, endHeight: String, status: LockStatus, hash: String) {
        self.version = version
        self.ownerAddress = ownerAddress
        self.mosaicId = mosaicId
        self.amount = amount
        self.endHeight = endHeight
        self.status = status
        self.hash = hash
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case version
        case ownerAddress
        case mosaicId
        case amount
        case endHeight
        case status
        case hash
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(version, forKey: .version)
        try container.encode(ownerAddress, forKey: .ownerAddress)
        try container.encode(mosaicId, forKey: .mosaicId)
        try container.encode(amount, forKey: .amount)
        try container.encode(endHeight, forKey: .endHeight)
        try container.encode(status, forKey: .status)
        try container.encode(hash, forKey: .hash)
    }
}

