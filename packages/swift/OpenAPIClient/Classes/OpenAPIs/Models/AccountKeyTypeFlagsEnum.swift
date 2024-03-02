//
// AccountKeyTypeFlagsEnum.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Type of account key: * 0 - Unset. * 1 - Linked account public key. * 2 - Node public key on which remote is allowed to harvest. * 4 - VRF public key.  */
public enum AccountKeyTypeFlagsEnum: Int, Codable, CaseIterable {
    case _0 = 0
    case _1 = 1
    case _2 = 2
    case _4 = 4
}
