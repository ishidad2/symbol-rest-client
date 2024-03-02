//
// TransactionTypeEnum.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Type of transaction: * 0x414C (16716 decimal) - AccountKeyLinkTransaction. * 0x4243 (16963 decimal) - VrfKeyLinkTransaction. * 0x4143 (16707 decimal) - VotingKeyLinkTransaction. * 0x424C (16972 decimal) - NodeKeyLinkTransaction. * 0x4141 (16705 decimal) - AggregateCompleteTransaction. * 0x4241 (16961 decimal) - AggregateBondedTransaction. * 0x414D (16717 decimal) - MosaicDefinitionTransaction. * 0x424D (16973 decimal) - MosaicSupplyChangeTransaction. * 0x434D (17229 decimal) - MosaicSupplyRevocationTransaction. * 0x414E (16718 decimal) - NamespaceRegistrationTransaction. * 0x424E (16974 decimal) - AddressAliasTransaction. * 0x434E (17230 decimal) - MosaicAliasTransaction. * 0x4144 (16708 decimal) - AccountMetadataTransaction. * 0x4244 (16964 decimal) - MosaicMetadataTransaction. * 0x4344 (17220 decimal) - NamespaceMetadataTransaction. * 0x4155 (16725 decimal) - MultisigAccountModificationTransaction. * 0x4148 (16712 decimal) - HashLockTransaction. * 0x4152 (16722 decimal) - SecretLockTransaction. * 0x4252 (16978 decimal) - SecretProofTransaction. * 0x4150 (16720 decimal) - AccountAddressRestrictionTransaction. * 0x4250 (16976 decimal) - AccountMosaicRestrictionTransaction. * 0x4350 (17232 decimal) - AccountOperationRestrictionTransaction. * 0x4151 (16721 decimal) - MosaicGlobalRestrictionTransaction. * 0x4251 (16977 decimal) - MosaicAddressRestrictionTransaction. * 0x4154 (16724 decimal) - TransferTransaction.  */
public enum TransactionTypeEnum: Int, Codable, CaseIterable {
    case _16716 = 16716
    case _16963 = 16963
    case _16707 = 16707
    case _16972 = 16972
    case _16705 = 16705
    case _16961 = 16961
    case _16717 = 16717
    case _16973 = 16973
    case _17229 = 17229
    case _16718 = 16718
    case _16974 = 16974
    case _17230 = 17230
    case _16708 = 16708
    case _16964 = 16964
    case _17220 = 17220
    case _16725 = 16725
    case _16712 = 16712
    case _16722 = 16722
    case _16978 = 16978
    case _16720 = 16720
    case _16976 = 16976
    case _17232 = 17232
    case _16721 = 16721
    case _16977 = 16977
    case _16724 = 16724
}
