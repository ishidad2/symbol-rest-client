//
// NetworkPropertiesDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Network related configuration properties. */
public struct NetworkPropertiesDTO: Codable, JSONEncodable, Hashable {

    /** Network identifier. */
    public var identifier: String?
    public var nodeEqualityStrategy: NodeIdentityEqualityStrategy?
    /** Public key. */
    public var nemesisSignerPublicKey: String?
    public var generationHashSeed: String?
    /** Nemesis epoch time adjustment. */
    public var epochAdjustment: String?

    public init(identifier: String? = nil, nodeEqualityStrategy: NodeIdentityEqualityStrategy? = nil, nemesisSignerPublicKey: String? = nil, generationHashSeed: String? = nil, epochAdjustment: String? = nil) {
        self.identifier = identifier
        self.nodeEqualityStrategy = nodeEqualityStrategy
        self.nemesisSignerPublicKey = nemesisSignerPublicKey
        self.generationHashSeed = generationHashSeed
        self.epochAdjustment = epochAdjustment
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case identifier
        case nodeEqualityStrategy
        case nemesisSignerPublicKey
        case generationHashSeed
        case epochAdjustment
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(identifier, forKey: .identifier)
        try container.encodeIfPresent(nodeEqualityStrategy, forKey: .nodeEqualityStrategy)
        try container.encodeIfPresent(nemesisSignerPublicKey, forKey: .nemesisSignerPublicKey)
        try container.encodeIfPresent(generationHashSeed, forKey: .generationHashSeed)
        try container.encodeIfPresent(epochAdjustment, forKey: .epochAdjustment)
    }
}

