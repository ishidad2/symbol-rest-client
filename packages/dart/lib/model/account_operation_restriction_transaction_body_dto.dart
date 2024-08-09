//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AccountOperationRestrictionTransactionBodyDTO {
  /// Returns a new [AccountOperationRestrictionTransactionBodyDTO] instance.
  AccountOperationRestrictionTransactionBodyDTO({
    this.restrictionFlags,
    this.restrictionAdditions = const [],
    this.restrictionDeletions = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AccountRestrictionFlagsEnum? restrictionFlags;

  /// Account restriction additions.
  List<TransactionTypeEnum> restrictionAdditions;

  /// Account restriction deletions.
  List<TransactionTypeEnum> restrictionDeletions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AccountOperationRestrictionTransactionBodyDTO &&
    other.restrictionFlags == restrictionFlags &&
    _deepEquality.equals(other.restrictionAdditions, restrictionAdditions) &&
    _deepEquality.equals(other.restrictionDeletions, restrictionDeletions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (restrictionFlags == null ? 0 : restrictionFlags!.hashCode) +
    (restrictionAdditions.hashCode) +
    (restrictionDeletions.hashCode);

  @override
  String toString() => 'AccountOperationRestrictionTransactionBodyDTO[restrictionFlags=$restrictionFlags, restrictionAdditions=$restrictionAdditions, restrictionDeletions=$restrictionDeletions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.restrictionFlags != null) {
      json[r'restrictionFlags'] = this.restrictionFlags;
    } else {
      json[r'restrictionFlags'] = null;
    }
      json[r'restrictionAdditions'] = this.restrictionAdditions;
      json[r'restrictionDeletions'] = this.restrictionDeletions;
    return json;
  }

  /// Returns a new [AccountOperationRestrictionTransactionBodyDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AccountOperationRestrictionTransactionBodyDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AccountOperationRestrictionTransactionBodyDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AccountOperationRestrictionTransactionBodyDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AccountOperationRestrictionTransactionBodyDTO(
        restrictionFlags: AccountRestrictionFlagsEnum.fromJson(json[r'restrictionFlags']),
        restrictionAdditions: TransactionTypeEnum.listFromJson(json[r'restrictionAdditions']),
        restrictionDeletions: TransactionTypeEnum.listFromJson(json[r'restrictionDeletions']),
      );
    }
    return null;
  }

  static List<AccountOperationRestrictionTransactionBodyDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AccountOperationRestrictionTransactionBodyDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AccountOperationRestrictionTransactionBodyDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AccountOperationRestrictionTransactionBodyDTO> mapFromJson(dynamic json) {
    final map = <String, AccountOperationRestrictionTransactionBodyDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AccountOperationRestrictionTransactionBodyDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AccountOperationRestrictionTransactionBodyDTO-objects as value to a dart map
  static Map<String, List<AccountOperationRestrictionTransactionBodyDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AccountOperationRestrictionTransactionBodyDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AccountOperationRestrictionTransactionBodyDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

