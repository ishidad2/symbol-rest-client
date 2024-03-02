//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AccountOperationRestrictionTransactionDTO {
  /// Returns a new [AccountOperationRestrictionTransactionDTO] instance.
  AccountOperationRestrictionTransactionDTO({
    required this.size,
    required this.signature,
    required this.signerPublicKey,
    required this.version,
    required this.network,
    required this.type,
    required this.maxFee,
    required this.deadline,
    required this.restrictionFlags,
    this.restrictionAdditions = const [],
    this.restrictionDeletions = const [],
  });

  /// A number that allows uint 32 values.
  int size;

  /// Entity's signature generated by the signer.
  String signature;

  /// Public key.
  String signerPublicKey;

  /// Entity version.
  int version;

  NetworkTypeEnum network;

  int type;

  /// Absolute amount. An amount of 123456789 (absolute) for a mosaic with divisibility 6 means 123.456789 (relative).
  String maxFee;

  /// Duration expressed in number of blocks.
  String deadline;

  AccountRestrictionFlagsEnum restrictionFlags;

  /// Account restriction additions.
  List<TransactionTypeEnum> restrictionAdditions;

  /// Account restriction deletions.
  List<TransactionTypeEnum> restrictionDeletions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AccountOperationRestrictionTransactionDTO &&
    other.size == size &&
    other.signature == signature &&
    other.signerPublicKey == signerPublicKey &&
    other.version == version &&
    other.network == network &&
    other.type == type &&
    other.maxFee == maxFee &&
    other.deadline == deadline &&
    other.restrictionFlags == restrictionFlags &&
    _deepEquality.equals(other.restrictionAdditions, restrictionAdditions) &&
    _deepEquality.equals(other.restrictionDeletions, restrictionDeletions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (size.hashCode) +
    (signature.hashCode) +
    (signerPublicKey.hashCode) +
    (version.hashCode) +
    (network.hashCode) +
    (type.hashCode) +
    (maxFee.hashCode) +
    (deadline.hashCode) +
    (restrictionFlags.hashCode) +
    (restrictionAdditions.hashCode) +
    (restrictionDeletions.hashCode);

  @override
  String toString() => 'AccountOperationRestrictionTransactionDTO[size=$size, signature=$signature, signerPublicKey=$signerPublicKey, version=$version, network=$network, type=$type, maxFee=$maxFee, deadline=$deadline, restrictionFlags=$restrictionFlags, restrictionAdditions=$restrictionAdditions, restrictionDeletions=$restrictionDeletions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'size'] = this.size;
      json[r'signature'] = this.signature;
      json[r'signerPublicKey'] = this.signerPublicKey;
      json[r'version'] = this.version;
      json[r'network'] = this.network;
      json[r'type'] = this.type;
      json[r'maxFee'] = this.maxFee;
      json[r'deadline'] = this.deadline;
      json[r'restrictionFlags'] = this.restrictionFlags;
      json[r'restrictionAdditions'] = this.restrictionAdditions;
      json[r'restrictionDeletions'] = this.restrictionDeletions;
    return json;
  }

  /// Returns a new [AccountOperationRestrictionTransactionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AccountOperationRestrictionTransactionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AccountOperationRestrictionTransactionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AccountOperationRestrictionTransactionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AccountOperationRestrictionTransactionDTO(
        size: mapValueOfType<int>(json, r'size')!,
        signature: mapValueOfType<String>(json, r'signature')!,
        signerPublicKey: mapValueOfType<String>(json, r'signerPublicKey')!,
        version: mapValueOfType<int>(json, r'version')!,
        network: NetworkTypeEnum.fromJson(json[r'network'])!,
        type: mapValueOfType<int>(json, r'type')!,
        maxFee: mapValueOfType<String>(json, r'maxFee')!,
        deadline: mapValueOfType<String>(json, r'deadline')!,
        restrictionFlags: AccountRestrictionFlagsEnum.fromJson(json[r'restrictionFlags'])!,
        restrictionAdditions: TransactionTypeEnum.listFromJson(json[r'restrictionAdditions']),
        restrictionDeletions: TransactionTypeEnum.listFromJson(json[r'restrictionDeletions']),
      );
    }
    return null;
  }

  static List<AccountOperationRestrictionTransactionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AccountOperationRestrictionTransactionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AccountOperationRestrictionTransactionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AccountOperationRestrictionTransactionDTO> mapFromJson(dynamic json) {
    final map = <String, AccountOperationRestrictionTransactionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AccountOperationRestrictionTransactionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AccountOperationRestrictionTransactionDTO-objects as value to a dart map
  static Map<String, List<AccountOperationRestrictionTransactionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AccountOperationRestrictionTransactionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AccountOperationRestrictionTransactionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'size',
    'signature',
    'signerPublicKey',
    'version',
    'network',
    'type',
    'maxFee',
    'deadline',
    'restrictionFlags',
    'restrictionAdditions',
    'restrictionDeletions',
  };
}

