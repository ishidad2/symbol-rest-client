//
// HashLockTransactionBodyDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct HashLockTransactionBodyDTO: Codable, JSONEncodable, Hashable {

    /** Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.  */
    public var mosaicId: String
    /** Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    public var amount: String
    /** Duration expressed in number of blocks. */
    public var duration: String
    public var hash: String

    public init(mosaicId: String, amount: String, duration: String, hash: String) {
        self.mosaicId = mosaicId
        self.amount = amount
        self.duration = duration
        self.hash = hash
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case mosaicId
        case amount
        case duration
        case hash
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(mosaicId, forKey: .mosaicId)
        try container.encode(amount, forKey: .amount)
        try container.encode(duration, forKey: .duration)
        try container.encode(hash, forKey: .hash)
    }
}

