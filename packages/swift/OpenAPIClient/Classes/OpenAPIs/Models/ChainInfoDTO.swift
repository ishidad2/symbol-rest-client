//
// ChainInfoDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ChainInfoDTO: Codable, JSONEncodable, Hashable {

    /** Height of the blockchain. */
    public var height: String
    /** Score of the blockchain. During synchronization, nodes try to get the blockchain with highest score in the network.  */
    public var scoreHigh: String
    /** Score of the blockchain. During synchronization, nodes try to get the blockchain with highest score in the network.  */
    public var scoreLow: String
    public var latestFinalizedBlock: FinalizedBlockDTO

    public init(height: String, scoreHigh: String, scoreLow: String, latestFinalizedBlock: FinalizedBlockDTO) {
        self.height = height
        self.scoreHigh = scoreHigh
        self.scoreLow = scoreLow
        self.latestFinalizedBlock = latestFinalizedBlock
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case height
        case scoreHigh
        case scoreLow
        case latestFinalizedBlock
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(height, forKey: .height)
        try container.encode(scoreHigh, forKey: .scoreHigh)
        try container.encode(scoreLow, forKey: .scoreLow)
        try container.encode(latestFinalizedBlock, forKey: .latestFinalizedBlock)
    }
}

