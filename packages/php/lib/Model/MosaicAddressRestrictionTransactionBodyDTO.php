<?php
/**
 * MosaicAddressRestrictionTransactionBodyDTO
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
 * MosaicAddressRestrictionTransactionBodyDTO Class Doc Comment
 *
 * @category Class
 * @package  SymbolRestClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class MosaicAddressRestrictionTransactionBodyDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'MosaicAddressRestrictionTransactionBodyDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'mosaic_id' => 'string',
        'restriction_key' => 'string',
        'previous_restriction_value' => 'string',
        'new_restriction_value' => 'string',
        'target_address' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'mosaic_id' => 'hex',
        'restriction_key' => 'hex',
        'previous_restriction_value' => null,
        'new_restriction_value' => null,
        'target_address' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'mosaic_id' => false,
        'restriction_key' => false,
        'previous_restriction_value' => false,
        'new_restriction_value' => false,
        'target_address' => false
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
        'mosaic_id' => 'mosaicId',
        'restriction_key' => 'restrictionKey',
        'previous_restriction_value' => 'previousRestrictionValue',
        'new_restriction_value' => 'newRestrictionValue',
        'target_address' => 'targetAddress'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'mosaic_id' => 'setMosaicId',
        'restriction_key' => 'setRestrictionKey',
        'previous_restriction_value' => 'setPreviousRestrictionValue',
        'new_restriction_value' => 'setNewRestrictionValue',
        'target_address' => 'setTargetAddress'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'mosaic_id' => 'getMosaicId',
        'restriction_key' => 'getRestrictionKey',
        'previous_restriction_value' => 'getPreviousRestrictionValue',
        'new_restriction_value' => 'getNewRestrictionValue',
        'target_address' => 'getTargetAddress'
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
        $this->setIfExists('mosaic_id', $data ?? [], null);
        $this->setIfExists('restriction_key', $data ?? [], null);
        $this->setIfExists('previous_restriction_value', $data ?? [], null);
        $this->setIfExists('new_restriction_value', $data ?? [], null);
        $this->setIfExists('target_address', $data ?? [], null);
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

        if ($this->container['mosaic_id'] === null) {
            $invalidProperties[] = "'mosaic_id' can't be null";
        }
        if ($this->container['restriction_key'] === null) {
            $invalidProperties[] = "'restriction_key' can't be null";
        }
        if ($this->container['previous_restriction_value'] === null) {
            $invalidProperties[] = "'previous_restriction_value' can't be null";
        }
        if ($this->container['new_restriction_value'] === null) {
            $invalidProperties[] = "'new_restriction_value' can't be null";
        }
        if ($this->container['target_address'] === null) {
            $invalidProperties[] = "'target_address' can't be null";
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
     * Gets mosaic_id
     *
     * @return string
     */
    public function getMosaicId()
    {
        return $this->container['mosaic_id'];
    }

    /**
     * Sets mosaic_id
     *
     * @param string $mosaic_id Mosaic identifier. If the most significant bit of byte 0 is set, a namespaceId (alias) is used instead of the real mosaic identifier.
     *
     * @return self
     */
    public function setMosaicId($mosaic_id)
    {
        if (is_null($mosaic_id)) {
            throw new \InvalidArgumentException('non-nullable mosaic_id cannot be null');
        }
        $this->container['mosaic_id'] = $mosaic_id;

        return $this;
    }

    /**
     * Gets restriction_key
     *
     * @return string
     */
    public function getRestrictionKey()
    {
        return $this->container['restriction_key'];
    }

    /**
     * Sets restriction_key
     *
     * @param string $restriction_key Restriction key.
     *
     * @return self
     */
    public function setRestrictionKey($restriction_key)
    {
        if (is_null($restriction_key)) {
            throw new \InvalidArgumentException('non-nullable restriction_key cannot be null');
        }
        $this->container['restriction_key'] = $restriction_key;

        return $this;
    }

    /**
     * Gets previous_restriction_value
     *
     * @return string
     */
    public function getPreviousRestrictionValue()
    {
        return $this->container['previous_restriction_value'];
    }

    /**
     * Sets previous_restriction_value
     *
     * @param string $previous_restriction_value Restriction value.
     *
     * @return self
     */
    public function setPreviousRestrictionValue($previous_restriction_value)
    {
        if (is_null($previous_restriction_value)) {
            throw new \InvalidArgumentException('non-nullable previous_restriction_value cannot be null');
        }
        $this->container['previous_restriction_value'] = $previous_restriction_value;

        return $this;
    }

    /**
     * Gets new_restriction_value
     *
     * @return string
     */
    public function getNewRestrictionValue()
    {
        return $this->container['new_restriction_value'];
    }

    /**
     * Sets new_restriction_value
     *
     * @param string $new_restriction_value Restriction value.
     *
     * @return self
     */
    public function setNewRestrictionValue($new_restriction_value)
    {
        if (is_null($new_restriction_value)) {
            throw new \InvalidArgumentException('non-nullable new_restriction_value cannot be null');
        }
        $this->container['new_restriction_value'] = $new_restriction_value;

        return $this;
    }

    /**
     * Gets target_address
     *
     * @return string
     */
    public function getTargetAddress()
    {
        return $this->container['target_address'];
    }

    /**
     * Sets target_address
     *
     * @param string $target_address Address expressed in Base32 format. If the bit 0 of byte 0 is not set (like in 0x90), then it is a regular address. Example: TAOXUJOTTW3W5XTBQMQEX3SQNA6MCUVGXLXR3TA.  Otherwise (e.g. 0x91) it represents a namespace id which starts at byte 1. Example: THBIMC3THGH5RUYAAAAAAAAAAAAAAAAAAAAAAAA
     *
     * @return self
     */
    public function setTargetAddress($target_address)
    {
        if (is_null($target_address)) {
            throw new \InvalidArgumentException('non-nullable target_address cannot be null');
        }
        $this->container['target_address'] = $target_address;

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


