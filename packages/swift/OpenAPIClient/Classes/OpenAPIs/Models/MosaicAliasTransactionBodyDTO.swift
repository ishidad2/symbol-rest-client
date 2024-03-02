//
// MosaicAliasTransactionBodyDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct MosaicAliasTransactionBodyDTO: Codable, JSONEncodable, Hashable {

    /** Namespace identifier. */
    public var namespaceId: String
    /** Mosaic identifier. */
    public var mosaicId: String
    public var aliasAction: AliasActionEnum

    public init(namespaceId: String, mosaicId: String, aliasAction: AliasActionEnum) {
        self.namespaceId = namespaceId
        self.mosaicId = mosaicId
        self.aliasAction = aliasAction
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case namespaceId
        case mosaicId
        case aliasAction
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(namespaceId, forKey: .namespaceId)
        try container.encode(mosaicId, forKey: .mosaicId)
        try container.encode(aliasAction, forKey: .aliasAction)
    }
}

