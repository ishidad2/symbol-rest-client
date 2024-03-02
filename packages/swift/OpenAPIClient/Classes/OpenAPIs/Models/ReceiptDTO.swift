//
// ReceiptDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ReceiptDTO: Codable, JSONEncodable, Hashable {

    /** Version of the receipt. */
    public var version: Int
    public var type: ReceiptTypeEnum

    public init(version: Int, type: ReceiptTypeEnum) {
        self.version = version
        self.type = type
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case version
        case type
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(version, forKey: .version)
        try container.encode(type, forKey: .type)
    }
}

