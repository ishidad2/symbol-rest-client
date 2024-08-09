//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EmbeddedVotingKeyLinkTransactionDTO {
  /// Returns a new [EmbeddedVotingKeyLinkTransactionDTO] instance.
  EmbeddedVotingKeyLinkTransactionDTO({
    required this.signerPublicKey,
    required this.version,
    required this.network,
    required this.type,
    this.linkedPublicKey,
    this.startEpoch,
    this.endEpoch,
    this.linkAction,
  });

  /// Public key.
  String signerPublicKey;

  /// Entity version.
  int version;

  NetworkTypeEnum network;

  int type;

  /// 32 bytes voting public key.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? linkedPublicKey;

  /// Finalization Epoch
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? startEpoch;

  /// Finalization Epoch
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? endEpoch;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LinkActionEnum? linkAction;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmbeddedVotingKeyLinkTransactionDTO &&
    other.signerPublicKey == signerPublicKey &&
    other.version == version &&
    other.network == network &&
    other.type == type &&
    other.linkedPublicKey == linkedPublicKey &&
    other.startEpoch == startEpoch &&
    other.endEpoch == endEpoch &&
    other.linkAction == linkAction;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (signerPublicKey.hashCode) +
    (version.hashCode) +
    (network.hashCode) +
    (type.hashCode) +
    (linkedPublicKey == null ? 0 : linkedPublicKey!.hashCode) +
    (startEpoch == null ? 0 : startEpoch!.hashCode) +
    (endEpoch == null ? 0 : endEpoch!.hashCode) +
    (linkAction == null ? 0 : linkAction!.hashCode);

  @override
  String toString() => 'EmbeddedVotingKeyLinkTransactionDTO[signerPublicKey=$signerPublicKey, version=$version, network=$network, type=$type, linkedPublicKey=$linkedPublicKey, startEpoch=$startEpoch, endEpoch=$endEpoch, linkAction=$linkAction]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'signerPublicKey'] = this.signerPublicKey;
      json[r'version'] = this.version;
      json[r'network'] = this.network;
      json[r'type'] = this.type;
    if (this.linkedPublicKey != null) {
      json[r'linkedPublicKey'] = this.linkedPublicKey;
    } else {
      json[r'linkedPublicKey'] = null;
    }
    if (this.startEpoch != null) {
      json[r'startEpoch'] = this.startEpoch;
    } else {
      json[r'startEpoch'] = null;
    }
    if (this.endEpoch != null) {
      json[r'endEpoch'] = this.endEpoch;
    } else {
      json[r'endEpoch'] = null;
    }
    if (this.linkAction != null) {
      json[r'linkAction'] = this.linkAction;
    } else {
      json[r'linkAction'] = null;
    }
    return json;
  }

  /// Returns a new [EmbeddedVotingKeyLinkTransactionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EmbeddedVotingKeyLinkTransactionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EmbeddedVotingKeyLinkTransactionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EmbeddedVotingKeyLinkTransactionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EmbeddedVotingKeyLinkTransactionDTO(
        signerPublicKey: mapValueOfType<String>(json, r'signerPublicKey')!,
        version: mapValueOfType<int>(json, r'version')!,
        network: NetworkTypeEnum.fromJson(json[r'network'])!,
        type: mapValueOfType<int>(json, r'type')!,
        linkedPublicKey: mapValueOfType<String>(json, r'linkedPublicKey'),
        startEpoch: mapValueOfType<int>(json, r'startEpoch'),
        endEpoch: mapValueOfType<int>(json, r'endEpoch'),
        linkAction: LinkActionEnum.fromJson(json[r'linkAction']),
      );
    }
    return null;
  }

  static List<EmbeddedVotingKeyLinkTransactionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EmbeddedVotingKeyLinkTransactionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EmbeddedVotingKeyLinkTransactionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EmbeddedVotingKeyLinkTransactionDTO> mapFromJson(dynamic json) {
    final map = <String, EmbeddedVotingKeyLinkTransactionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EmbeddedVotingKeyLinkTransactionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EmbeddedVotingKeyLinkTransactionDTO-objects as value to a dart map
  static Map<String, List<EmbeddedVotingKeyLinkTransactionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EmbeddedVotingKeyLinkTransactionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EmbeddedVotingKeyLinkTransactionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'signerPublicKey',
    'version',
    'network',
    'type',
  };
}

