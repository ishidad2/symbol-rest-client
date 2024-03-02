//
// MosaicDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct MosaicDTO: Codable, JSONEncodable, Hashable {

    /** The version of the state */
    public var version: Int
    /** Mosaic identifier. */
    public var id: String
    /** Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    public var supply: String
    /** Height of the blockchain. */
    public var startHeight: String
    /** Address encoded using a 32-character set. */
    public var ownerAddress: String
    /** A number that allows uint 32 values. */
    public var revision: Int64
    /** - 0x00 (none) - No flags present. - 0x01 (supplyMutable) - Mosaic supports supply changes even when mosaic owner owns partial supply. - 0x02 (transferable) - Mosaic supports transfers between arbitrary accounts. When not set, mosaic can only be transferred to and from mosaic owner. - 0x04 (restrictable) - Mosaic supports custom restrictions configured by mosaic owner. - 0x08 (revokable) - Mosaic allows creator to revoke balances from another user.  */
    public var flags: Int
    /** Determines up to what decimal place the mosaic can be divided. Divisibility of 3 means that a mosaic can be divided into smallest parts of 0.001 mosaics. The divisibility must be in the range of 0 and 6.  */
    public var divisibility: Int
    /** Duration expressed in number of blocks. */
    public var duration: String

    public init(version: Int, id: String, supply: String, startHeight: String, ownerAddress: String, revision: Int64, flags: Int, divisibility: Int, duration: String) {
        self.version = version
        self.id = id
        self.supply = supply
        self.startHeight = startHeight
        self.ownerAddress = ownerAddress
        self.revision = revision
        self.flags = flags
        self.divisibility = divisibility
        self.duration = duration
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case version
        case id
        case supply
        case startHeight
        case ownerAddress
        case revision
        case flags
        case divisibility
        case duration
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(version, forKey: .version)
        try container.encode(id, forKey: .id)
        try container.encode(supply, forKey: .supply)
        try container.encode(startHeight, forKey: .startHeight)
        try container.encode(ownerAddress, forKey: .ownerAddress)
        try container.encode(revision, forKey: .revision)
        try container.encode(flags, forKey: .flags)
        try container.encode(divisibility, forKey: .divisibility)
        try container.encode(duration, forKey: .duration)
    }
}

