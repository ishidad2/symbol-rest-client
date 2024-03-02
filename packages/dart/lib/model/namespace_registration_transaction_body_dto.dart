//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NamespaceRegistrationTransactionBodyDTO {
  /// Returns a new [NamespaceRegistrationTransactionBodyDTO] instance.
  NamespaceRegistrationTransactionBodyDTO({
    this.duration,
    this.parentId,
    required this.id,
    required this.registrationType,
    required this.name,
  });

  /// Duration expressed in number of blocks.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? duration;

  /// Namespace identifier.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? parentId;

  /// Namespace identifier.
  String id;

  NamespaceRegistrationTypeEnum registrationType;

  /// Namespace name.
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NamespaceRegistrationTransactionBodyDTO &&
    other.duration == duration &&
    other.parentId == parentId &&
    other.id == id &&
    other.registrationType == registrationType &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (duration == null ? 0 : duration!.hashCode) +
    (parentId == null ? 0 : parentId!.hashCode) +
    (id.hashCode) +
    (registrationType.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'NamespaceRegistrationTransactionBodyDTO[duration=$duration, parentId=$parentId, id=$id, registrationType=$registrationType, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.duration != null) {
      json[r'duration'] = this.duration;
    } else {
      json[r'duration'] = null;
    }
    if (this.parentId != null) {
      json[r'parentId'] = this.parentId;
    } else {
      json[r'parentId'] = null;
    }
      json[r'id'] = this.id;
      json[r'registrationType'] = this.registrationType;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [NamespaceRegistrationTransactionBodyDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NamespaceRegistrationTransactionBodyDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "NamespaceRegistrationTransactionBodyDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "NamespaceRegistrationTransactionBodyDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return NamespaceRegistrationTransactionBodyDTO(
        duration: mapValueOfType<String>(json, r'duration'),
        parentId: mapValueOfType<String>(json, r'parentId'),
        id: mapValueOfType<String>(json, r'id')!,
        registrationType: NamespaceRegistrationTypeEnum.fromJson(json[r'registrationType'])!,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<NamespaceRegistrationTransactionBodyDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NamespaceRegistrationTransactionBodyDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NamespaceRegistrationTransactionBodyDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NamespaceRegistrationTransactionBodyDTO> mapFromJson(dynamic json) {
    final map = <String, NamespaceRegistrationTransactionBodyDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NamespaceRegistrationTransactionBodyDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NamespaceRegistrationTransactionBodyDTO-objects as value to a dart map
  static Map<String, List<NamespaceRegistrationTransactionBodyDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NamespaceRegistrationTransactionBodyDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NamespaceRegistrationTransactionBodyDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'registrationType',
    'name',
  };
}

