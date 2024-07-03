<?php
/**
 * AccountDTO
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
 * AccountDTO Class Doc Comment
 *
 * @category Class
 * @package  SymbolRestClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class AccountDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'AccountDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'version' => 'int',
        'address' => 'string',
        'address_height' => 'string',
        'public_key' => 'string',
        'public_key_height' => 'string',
        'account_type' => '\SymbolRestClient\Model\AccountTypeEnum',
        'supplemental_public_keys' => '\SymbolRestClient\Model\SupplementalPublicKeysDTO',
        'activity_buckets' => '\SymbolRestClient\Model\ActivityBucketDTO[]',
        'mosaics' => '\SymbolRestClient\Model\Mosaic[]',
        'importance' => 'string',
        'importance_height' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'version' => null,
        'address' => null,
        'address_height' => null,
        'public_key' => 'hex',
        'public_key_height' => null,
        'account_type' => null,
        'supplemental_public_keys' => null,
        'activity_buckets' => null,
        'mosaics' => null,
        'importance' => null,
        'importance_height' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'version' => false,
        'address' => false,
        'address_height' => false,
        'public_key' => false,
        'public_key_height' => false,
        'account_type' => false,
        'supplemental_public_keys' => false,
        'activity_buckets' => false,
        'mosaics' => false,
        'importance' => false,
        'importance_height' => false
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
        'version' => 'version',
        'address' => 'address',
        'address_height' => 'addressHeight',
        'public_key' => 'publicKey',
        'public_key_height' => 'publicKeyHeight',
        'account_type' => 'accountType',
        'supplemental_public_keys' => 'supplementalPublicKeys',
        'activity_buckets' => 'activityBuckets',
        'mosaics' => 'mosaics',
        'importance' => 'importance',
        'importance_height' => 'importanceHeight'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'version' => 'setVersion',
        'address' => 'setAddress',
        'address_height' => 'setAddressHeight',
        'public_key' => 'setPublicKey',
        'public_key_height' => 'setPublicKeyHeight',
        'account_type' => 'setAccountType',
        'supplemental_public_keys' => 'setSupplementalPublicKeys',
        'activity_buckets' => 'setActivityBuckets',
        'mosaics' => 'setMosaics',
        'importance' => 'setImportance',
        'importance_height' => 'setImportanceHeight'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'version' => 'getVersion',
        'address' => 'getAddress',
        'address_height' => 'getAddressHeight',
        'public_key' => 'getPublicKey',
        'public_key_height' => 'getPublicKeyHeight',
        'account_type' => 'getAccountType',
        'supplemental_public_keys' => 'getSupplementalPublicKeys',
        'activity_buckets' => 'getActivityBuckets',
        'mosaics' => 'getMosaics',
        'importance' => 'getImportance',
        'importance_height' => 'getImportanceHeight'
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
        $this->setIfExists('version', $data ?? [], null);
        $this->setIfExists('address', $data ?? [], null);
        $this->setIfExists('address_height', $data ?? [], null);
        $this->setIfExists('public_key', $data ?? [], null);
        $this->setIfExists('public_key_height', $data ?? [], null);
        $this->setIfExists('account_type', $data ?? [], null);
        $this->setIfExists('supplemental_public_keys', $data ?? [], null);
        $this->setIfExists('activity_buckets', $data ?? [], null);
        $this->setIfExists('mosaics', $data ?? [], null);
        $this->setIfExists('importance', $data ?? [], null);
        $this->setIfExists('importance_height', $data ?? [], null);
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

        if ($this->container['version'] === null) {
            $invalidProperties[] = "'version' can't be null";
        }
        if ($this->container['address'] === null) {
            $invalidProperties[] = "'address' can't be null";
        }
        if ($this->container['address_height'] === null) {
            $invalidProperties[] = "'address_height' can't be null";
        }
        if ($this->container['public_key'] === null) {
            $invalidProperties[] = "'public_key' can't be null";
        }
        if ($this->container['public_key_height'] === null) {
            $invalidProperties[] = "'public_key_height' can't be null";
        }
        if ($this->container['account_type'] === null) {
            $invalidProperties[] = "'account_type' can't be null";
        }
        if ($this->container['supplemental_public_keys'] === null) {
            $invalidProperties[] = "'supplemental_public_keys' can't be null";
        }
        if ($this->container['activity_buckets'] === null) {
            $invalidProperties[] = "'activity_buckets' can't be null";
        }
        if ($this->container['mosaics'] === null) {
            $invalidProperties[] = "'mosaics' can't be null";
        }
        if ($this->container['importance'] === null) {
            $invalidProperties[] = "'importance' can't be null";
        }
        if ($this->container['importance_height'] === null) {
            $invalidProperties[] = "'importance_height' can't be null";
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
     * @param int $version The version of the state
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
     * Gets address
     *
     * @return string
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param string $address Address encoded using a 32-character set.
     *
     * @return self
     */
    public function setAddress($address)
    {
        if (is_null($address)) {
            throw new \InvalidArgumentException('non-nullable address cannot be null');
        }
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets address_height
     *
     * @return string
     */
    public function getAddressHeight()
    {
        return $this->container['address_height'];
    }

    /**
     * Sets address_height
     *
     * @param string $address_height Height of the blockchain.
     *
     * @return self
     */
    public function setAddressHeight($address_height)
    {
        if (is_null($address_height)) {
            throw new \InvalidArgumentException('non-nullable address_height cannot be null');
        }
        $this->container['address_height'] = $address_height;

        return $this;
    }

    /**
     * Gets public_key
     *
     * @return string
     */
    public function getPublicKey()
    {
        return $this->container['public_key'];
    }

    /**
     * Sets public_key
     *
     * @param string $public_key Public key.
     *
     * @return self
     */
    public function setPublicKey($public_key)
    {
        if (is_null($public_key)) {
            throw new \InvalidArgumentException('non-nullable public_key cannot be null');
        }
        $this->container['public_key'] = $public_key;

        return $this;
    }

    /**
     * Gets public_key_height
     *
     * @return string
     */
    public function getPublicKeyHeight()
    {
        return $this->container['public_key_height'];
    }

    /**
     * Sets public_key_height
     *
     * @param string $public_key_height Height of the blockchain.
     *
     * @return self
     */
    public function setPublicKeyHeight($public_key_height)
    {
        if (is_null($public_key_height)) {
            throw new \InvalidArgumentException('non-nullable public_key_height cannot be null');
        }
        $this->container['public_key_height'] = $public_key_height;

        return $this;
    }

    /**
     * Gets account_type
     *
     * @return \SymbolRestClient\Model\AccountTypeEnum
     */
    public function getAccountType()
    {
        return $this->container['account_type'];
    }

    /**
     * Sets account_type
     *
     * @param \SymbolRestClient\Model\AccountTypeEnum $account_type account_type
     *
     * @return self
     */
    public function setAccountType($account_type)
    {
        if (is_null($account_type)) {
            throw new \InvalidArgumentException('non-nullable account_type cannot be null');
        }
        $this->container['account_type'] = $account_type;

        return $this;
    }

    /**
     * Gets supplemental_public_keys
     *
     * @return \SymbolRestClient\Model\SupplementalPublicKeysDTO
     */
    public function getSupplementalPublicKeys()
    {
        return $this->container['supplemental_public_keys'];
    }

    /**
     * Sets supplemental_public_keys
     *
     * @param \SymbolRestClient\Model\SupplementalPublicKeysDTO $supplemental_public_keys supplemental_public_keys
     *
     * @return self
     */
    public function setSupplementalPublicKeys($supplemental_public_keys)
    {
        if (is_null($supplemental_public_keys)) {
            throw new \InvalidArgumentException('non-nullable supplemental_public_keys cannot be null');
        }
        $this->container['supplemental_public_keys'] = $supplemental_public_keys;

        return $this;
    }

    /**
     * Gets activity_buckets
     *
     * @return \SymbolRestClient\Model\ActivityBucketDTO[]
     */
    public function getActivityBuckets()
    {
        return $this->container['activity_buckets'];
    }

    /**
     * Sets activity_buckets
     *
     * @param \SymbolRestClient\Model\ActivityBucketDTO[] $activity_buckets activity_buckets
     *
     * @return self
     */
    public function setActivityBuckets($activity_buckets)
    {
        if (is_null($activity_buckets)) {
            throw new \InvalidArgumentException('non-nullable activity_buckets cannot be null');
        }
        $this->container['activity_buckets'] = $activity_buckets;

        return $this;
    }

    /**
     * Gets mosaics
     *
     * @return \SymbolRestClient\Model\Mosaic[]
     */
    public function getMosaics()
    {
        return $this->container['mosaics'];
    }

    /**
     * Sets mosaics
     *
     * @param \SymbolRestClient\Model\Mosaic[] $mosaics Mosaic units owned.
     *
     * @return self
     */
    public function setMosaics($mosaics)
    {
        if (is_null($mosaics)) {
            throw new \InvalidArgumentException('non-nullable mosaics cannot be null');
        }
        $this->container['mosaics'] = $mosaics;

        return $this;
    }

    /**
     * Gets importance
     *
     * @return string
     */
    public function getImportance()
    {
        return $this->container['importance'];
    }

    /**
     * Sets importance
     *
     * @param string $importance Probability of an account to harvest the next block.
     *
     * @return self
     */
    public function setImportance($importance)
    {
        if (is_null($importance)) {
            throw new \InvalidArgumentException('non-nullable importance cannot be null');
        }
        $this->container['importance'] = $importance;

        return $this;
    }

    /**
     * Gets importance_height
     *
     * @return string
     */
    public function getImportanceHeight()
    {
        return $this->container['importance_height'];
    }

    /**
     * Sets importance_height
     *
     * @param string $importance_height Height of the blockchain.
     *
     * @return self
     */
    public function setImportanceHeight($importance_height)
    {
        if (is_null($importance_height)) {
            throw new \InvalidArgumentException('non-nullable importance_height cannot be null');
        }
        $this->container['importance_height'] = $importance_height;

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


