//
// AccountInfoDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AccountInfoDTO: Codable, JSONEncodable, Hashable {

    /** Internal resource identifier. */
    public var id: String
    public var account: AccountDTO

    public init(id: String, account: AccountDTO) {
        self.id = id
        self.account = account
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case account
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(account, forKey: .account)
    }
}

