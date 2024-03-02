//
// UnlockedAccountDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct UnlockedAccountDTO: Codable, JSONEncodable, Hashable {

    public var unlockedAccount: [String]

    public init(unlockedAccount: [String]) {
        self.unlockedAccount = unlockedAccount
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case unlockedAccount
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(unlockedAccount, forKey: .unlockedAccount)
    }
}

