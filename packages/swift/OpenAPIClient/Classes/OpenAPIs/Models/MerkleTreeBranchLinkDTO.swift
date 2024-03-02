//
// MerkleTreeBranchLinkDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Merkle tree branch link. */
public struct MerkleTreeBranchLinkDTO: Codable, JSONEncodable, Hashable {

    /** Branch link nibble bit index (hexadecimal). */
    public var bit: String
    public var link: String

    public init(bit: String, link: String) {
        self.bit = bit
        self.link = link
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case bit
        case link
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(bit, forKey: .bit)
        try container.encode(link, forKey: .link)
    }
}

