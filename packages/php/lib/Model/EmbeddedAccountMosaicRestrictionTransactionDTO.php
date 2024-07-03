<?php
/**
 * EmbeddedAccountMosaicRestrictionTransactionDTO
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  SymbolRestClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Catapult REST Endpoints
 *
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 7.2.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace SymbolRestClient\Model;

use \ArrayAccess;
use \SymbolRestClient\ObjectSerializer;

/**
 * EmbeddedAccountMosaicRestrictionTransactionDTO Class Doc Comment
 *
 * @category Class
 * @package  SymbolRestClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class EmbeddedAccountMosaicRestrictionTransactionDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'EmbeddedAccountMosaicRestrictionTransactionDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'signer_public_key' => 'string',
        'version' => 'int',
        'network' => '\SymbolRestClient\Model\NetworkTypeEnum',
        'type' => 'int',
        'restriction_flags' => '\SymbolRestClient\Model\AccountRestrictionFlagsEnum',
        'restriction_additions' => 'string[]',
        'restriction_deletions' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'signer_public_key' => 'hex',
        'version' => null,
        'network' => null,
        'type' => null,
        'restriction_flags' => null,
        'restriction_additions' => 'hex',
        'restriction_deletions' => 'hex'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'signer_public_key' => false,
        'version' => false,
        'network' => false,
        'type' => false,
        'restriction_flags' => false,
        'restriction_additions' => false,
        'restriction_deletions' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'signer_public_key' => 'signerPublicKey',
        'version' => 'version',
        'network' => 'network',
        'type' => 'type',
        'restriction_flags' => 'restrictionFlags',
        'restriction_additions' => 'restrictionAdditions',
        'restriction_deletions' => 'restrictionDeletions'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'signer_public_key' => 'setSignerPublicKey',
        'version' => 'setVersion',
        'network' => 'setNetwork',
        'type' => 'setType',
        'restriction_flags' => 'setRestrictionFlags',
        'restriction_additions' => 'setRestrictionAdditions',
        'restriction_deletions' => 'setRestrictionDeletions'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'signer_public_key' => 'getSignerPublicKey',
        'version' => 'getVersion',
        'network' => 'getNetwork',
        'type' => 'getType',
        'restriction_flags' => 'getRestrictionFlags',
        'restriction_additions' => 'getRestrictionAdditions',
        'restriction_deletions' => 'getRestrictionDeletions'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('signer_public_key', $data ?? [], null);
        $this->setIfExists('version', $data ?? [], null);
        $this->setIfExists('network', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
        $this->setIfExists('restriction_flags', $data ?? [], null);
        $this->setIfExists('restriction_additions', $data ?? [], null);
        $this->setIfExists('restriction_deletions', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['signer_public_key'] === null) {
            $invalidProperties[] = "'signer_public_key' can't be null";
        }
        if ($this->container['version'] === null) {
            $invalidProperties[] = "'version' can't be null";
        }
        if ($this->container['network'] === null) {
            $invalidProperties[] = "'network' can't be null";
        }
        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
        }
        if ($this->container['restriction_flags'] === null) {
            $invalidProperties[] = "'restriction_flags' can't be null";
        }
        if ($this->container['restriction_additions'] === null) {
            $invalidProperties[] = "'restriction_additions' can't be null";
        }
        if ($this->container['restriction_deletions'] === null) {
            $invalidProperties[] = "'restriction_deletions' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets signer_public_key
     *
     * @return string
     */
    public function getSignerPublicKey()
    {
        return $this->container['signer_public_key'];
    }

    /**
     * Sets signer_public_key
     *
     * @param string $signer_public_key Public key.
     *
     * @return self
     */
    public function setSignerPublicKey($signer_public_key)
    {
        if (is_null($signer_public_key)) {
            throw new \InvalidArgumentException('non-nullable signer_public_key cannot be null');
        }
        $this->container['signer_public_key'] = $signer_public_key;

        return $this;
    }

    /**
     * Gets version
     *
     * @return int
     */
    public function getVersion()
    {
        return $this->container['version'];
    }

    /**
     * Sets version
     *
     * @param int $version Entity version.
     *
     * @return self
     */
    public function setVersion($version)
    {
        if (is_null($version)) {
            throw new \InvalidArgumentException('non-nullable version cannot be null');
        }
        $this->container['version'] = $version;

        return $this;
    }

    /**
     * Gets network
     *
     * @return \SymbolRestClient\Model\NetworkTypeEnum
     */
    public function getNetwork()
    {
        return $this->container['network'];
    }

    /**
     * Sets network
     *
     * @param \SymbolRestClient\Model\NetworkTypeEnum $network network
     *
     * @return self
     */
    public function setNetwork($network)
    {
        if (is_null($network)) {
            throw new \InvalidArgumentException('non-nullable network cannot be null');
        }
        $this->container['network'] = $network;

        return $this;
    }

    /**
     * Gets type
     *
     * @return int
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param int $type type
     *
     * @return self
     */
    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets restriction_flags
     *
     * @return \SymbolRestClient\Model\AccountRestrictionFlagsEnum
     */
    public function getRestrictionFlags()
    {
        return $this->container['restriction_flags'];
    }

    /**
     * Sets restriction_flags
     *
     * @param \SymbolRestClient\Model\AccountRestrictionFlagsEnum $restriction_flags restriction_flags
     *
     * @return self
     */
    public function setRestrictionFlags($restriction_flags)
    {
        if (is_null($restriction_flags)) {
            throw new \InvalidArgumentException('non-nullable restriction_flags cannot be null');
        }
        $this->container['restriction_flags'] = $restriction_flags;

        return $this;
    }

    /**
     * Gets restriction_additions
     *
     * @return string[]
     */
    public function getRestrictionAdditions()
    {
        return $this->container['restriction_additions'];
    }

    /**
     * Sets restriction_additions
     *
     * @param string[] $restriction_additions Account restriction additions.
     *
     * @return self
     */
    public function setRestrictionAdditions($restriction_additions)
    {
        if (is_null($restriction_additions)) {
            throw new \InvalidArgumentException('non-nullable restriction_additions cannot be null');
        }
        $this->container['restriction_additions'] = $restriction_additions;

        return $this;
    }

    /**
     * Gets restriction_deletions
     *
     * @return string[]
     */
    public function getRestrictionDeletions()
    {
        return $this->container['restriction_deletions'];
    }

    /**
     * Sets restriction_deletions
     *
     * @param string[] $restriction_deletions Account restriction deletions.
     *
     * @return self
     */
    public function setRestrictionDeletions($restriction_deletions)
    {
        if (is_null($restriction_deletions)) {
            throw new \InvalidArgumentException('non-nullable restriction_deletions cannot be null');
        }
        $this->container['restriction_deletions'] = $restriction_deletions;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


