//
// VotingKeyLinkTransactionDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Transaction to associate a BLS public key with an account. Required for node operators willing to vote finalized blocks.  */
public struct VotingKeyLinkTransactionDTO: Codable, JSONEncodable, Hashable {

    /** A number that allows uint 32 values. */
    public var size: Int64
    /** Entity's signature generated by the signer. */
    public var signature: String
    /** Public key. */
    public var signerPublicKey: String
    /** Entity version. */
    public var version: Int
    public var network: NetworkTypeEnum
    public var type: Int
    /** Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative). */
    public var maxFee: String
    /** Duration expressed in number of blocks. */
    public var deadline: String
    /** 32 bytes voting public key. */
    public var linkedPublicKey: String
    /** Finalization Epoch */
    public var startEpoch: Int64
    /** Finalization Epoch */
    public var endEpoch: Int64
    public var linkAction: LinkActionEnum

    public init(size: Int64, signature: String, signerPublicKey: String, version: Int, network: NetworkTypeEnum, type: Int, maxFee: String, deadline: String, linkedPublicKey: String, startEpoch: Int64, endEpoch: Int64, linkAction: LinkActionEnum) {
        self.size = size
        self.signature = signature
        self.signerPublicKey = signerPublicKey
        self.version = version
        self.network = network
        self.type = type
        self.maxFee = maxFee
        self.deadline = deadline
        self.linkedPublicKey = linkedPublicKey
        self.startEpoch = startEpoch
        self.endEpoch = endEpoch
        self.linkAction = linkAction
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case size
        case signature
        case signerPublicKey
        case version
        case network
        case type
        case maxFee
        case deadline
        case linkedPublicKey
        case startEpoch
        case endEpoch
        case linkAction
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(size, forKey: .size)
        try container.encode(signature, forKey: .signature)
        try container.encode(signerPublicKey, forKey: .signerPublicKey)
        try container.encode(version, forKey: .version)
        try container.encode(network, forKey: .network)
        try container.encode(type, forKey: .type)
        try container.encode(maxFee, forKey: .maxFee)
        try container.encode(deadline, forKey: .deadline)
        try container.encode(linkedPublicKey, forKey: .linkedPublicKey)
        try container.encode(startEpoch, forKey: .startEpoch)
        try container.encode(endEpoch, forKey: .endEpoch)
        try container.encode(linkAction, forKey: .linkAction)
    }
}

