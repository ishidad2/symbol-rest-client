//
// AccountIds.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AccountIds: Codable, JSONEncodable, Hashable {

    /** Array of public keys. */
    public var publicKeys: [String]?
    /** Array of addresses. */
    public var addresses: [String]?

    public init(publicKeys: [String]? = nil, addresses: [String]? = nil) {
        self.publicKeys = publicKeys
        self.addresses = addresses
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case publicKeys
        case addresses
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(publicKeys, forKey: .publicKeys)
        try container.encodeIfPresent(addresses, forKey: .addresses)
    }
}

