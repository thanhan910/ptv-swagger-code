<?php
/**
 * V3SearchParameters
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.5.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * V3SearchParameters Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3SearchParameters implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.SearchParameters';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'route_types' => 'int[]',
        'latitude' => 'float',
        'longitude' => 'float',
        'max_distance' => 'float',
        'include_addresses' => 'bool',
        'include_outlets' => 'bool',
        'match_stop_by_suburb' => 'bool',
        'match_route_by_suburb' => 'bool',
        'match_stop_by_gtfs_stop_id' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'route_types' => 'int32',
        'latitude' => 'float',
        'longitude' => 'float',
        'max_distance' => 'float',
        'include_addresses' => null,
        'include_outlets' => null,
        'match_stop_by_suburb' => null,
        'match_route_by_suburb' => null,
        'match_stop_by_gtfs_stop_id' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'route_types' => false,
        'latitude' => false,
        'longitude' => false,
        'max_distance' => false,
        'include_addresses' => false,
        'include_outlets' => false,
        'match_stop_by_suburb' => false,
        'match_route_by_suburb' => false,
        'match_stop_by_gtfs_stop_id' => false
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
        'route_types' => 'route_types',
        'latitude' => 'latitude',
        'longitude' => 'longitude',
        'max_distance' => 'max_distance',
        'include_addresses' => 'include_addresses',
        'include_outlets' => 'include_outlets',
        'match_stop_by_suburb' => 'match_stop_by_suburb',
        'match_route_by_suburb' => 'match_route_by_suburb',
        'match_stop_by_gtfs_stop_id' => 'match_stop_by_gtfs_stop_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'route_types' => 'setRouteTypes',
        'latitude' => 'setLatitude',
        'longitude' => 'setLongitude',
        'max_distance' => 'setMaxDistance',
        'include_addresses' => 'setIncludeAddresses',
        'include_outlets' => 'setIncludeOutlets',
        'match_stop_by_suburb' => 'setMatchStopBySuburb',
        'match_route_by_suburb' => 'setMatchRouteBySuburb',
        'match_stop_by_gtfs_stop_id' => 'setMatchStopByGtfsStopId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'route_types' => 'getRouteTypes',
        'latitude' => 'getLatitude',
        'longitude' => 'getLongitude',
        'max_distance' => 'getMaxDistance',
        'include_addresses' => 'getIncludeAddresses',
        'include_outlets' => 'getIncludeOutlets',
        'match_stop_by_suburb' => 'getMatchStopBySuburb',
        'match_route_by_suburb' => 'getMatchRouteBySuburb',
        'match_stop_by_gtfs_stop_id' => 'getMatchStopByGtfsStopId'
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

    public const ROUTE_TYPES_0 = 0;
    public const ROUTE_TYPES_1 = 1;
    public const ROUTE_TYPES_2 = 2;
    public const ROUTE_TYPES_3 = 3;
    public const ROUTE_TYPES_4 = 4;

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getRouteTypesAllowableValues()
    {
        return [
            self::ROUTE_TYPES_0,
            self::ROUTE_TYPES_1,
            self::ROUTE_TYPES_2,
            self::ROUTE_TYPES_3,
            self::ROUTE_TYPES_4,
        ];
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
        $this->setIfExists('route_types', $data ?? [], null);
        $this->setIfExists('latitude', $data ?? [], null);
        $this->setIfExists('longitude', $data ?? [], null);
        $this->setIfExists('max_distance', $data ?? [], null);
        $this->setIfExists('include_addresses', $data ?? [], null);
        $this->setIfExists('include_outlets', $data ?? [], null);
        $this->setIfExists('match_stop_by_suburb', $data ?? [], null);
        $this->setIfExists('match_route_by_suburb', $data ?? [], null);
        $this->setIfExists('match_stop_by_gtfs_stop_id', $data ?? [], null);
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
     * Gets route_types
     *
     * @return int[]|null
     */
    public function getRouteTypes()
    {
        return $this->container['route_types'];
    }

    /**
     * Sets route_types
     *
     * @param int[]|null $route_types Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
     *
     * @return self
     */
    public function setRouteTypes($route_types)
    {
        if (is_null($route_types)) {
            throw new \InvalidArgumentException('non-nullable route_types cannot be null');
        }
        $allowedValues = $this->getRouteTypesAllowableValues();
        if (array_diff($route_types, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'route_types', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['route_types'] = $route_types;

        return $this;
    }

    /**
     * Gets latitude
     *
     * @return float|null
     */
    public function getLatitude()
    {
        return $this->container['latitude'];
    }

    /**
     * Sets latitude
     *
     * @param float|null $latitude Filter by geographic coordinate of latitude
     *
     * @return self
     */
    public function setLatitude($latitude)
    {
        if (is_null($latitude)) {
            throw new \InvalidArgumentException('non-nullable latitude cannot be null');
        }
        $this->container['latitude'] = $latitude;

        return $this;
    }

    /**
     * Gets longitude
     *
     * @return float|null
     */
    public function getLongitude()
    {
        return $this->container['longitude'];
    }

    /**
     * Sets longitude
     *
     * @param float|null $longitude Filter by geographic coordinate of longitude
     *
     * @return self
     */
    public function setLongitude($longitude)
    {
        if (is_null($longitude)) {
            throw new \InvalidArgumentException('non-nullable longitude cannot be null');
        }
        $this->container['longitude'] = $longitude;

        return $this;
    }

    /**
     * Gets max_distance
     *
     * @return float|null
     */
    public function getMaxDistance()
    {
        return $this->container['max_distance'];
    }

    /**
     * Sets max_distance
     *
     * @param float|null $max_distance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
     *
     * @return self
     */
    public function setMaxDistance($max_distance)
    {
        if (is_null($max_distance)) {
            throw new \InvalidArgumentException('non-nullable max_distance cannot be null');
        }
        $this->container['max_distance'] = $max_distance;

        return $this;
    }

    /**
     * Gets include_addresses
     *
     * @return bool|null
     */
    public function getIncludeAddresses()
    {
        return $this->container['include_addresses'];
    }

    /**
     * Sets include_addresses
     *
     * @param bool|null $include_addresses Placeholder for future development; currently unavailable
     *
     * @return self
     */
    public function setIncludeAddresses($include_addresses)
    {
        if (is_null($include_addresses)) {
            throw new \InvalidArgumentException('non-nullable include_addresses cannot be null');
        }
        $this->container['include_addresses'] = $include_addresses;

        return $this;
    }

    /**
     * Gets include_outlets
     *
     * @return bool|null
     */
    public function getIncludeOutlets()
    {
        return $this->container['include_outlets'];
    }

    /**
     * Sets include_outlets
     *
     * @param bool|null $include_outlets Indicates if outlets will be returned in response (default = true)
     *
     * @return self
     */
    public function setIncludeOutlets($include_outlets)
    {
        if (is_null($include_outlets)) {
            throw new \InvalidArgumentException('non-nullable include_outlets cannot be null');
        }
        $this->container['include_outlets'] = $include_outlets;

        return $this;
    }

    /**
     * Gets match_stop_by_suburb
     *
     * @return bool|null
     */
    public function getMatchStopBySuburb()
    {
        return $this->container['match_stop_by_suburb'];
    }

    /**
     * Sets match_stop_by_suburb
     *
     * @param bool|null $match_stop_by_suburb Indicates whether to find stops by suburbs in the search term (default = true)
     *
     * @return self
     */
    public function setMatchStopBySuburb($match_stop_by_suburb)
    {
        if (is_null($match_stop_by_suburb)) {
            throw new \InvalidArgumentException('non-nullable match_stop_by_suburb cannot be null');
        }
        $this->container['match_stop_by_suburb'] = $match_stop_by_suburb;

        return $this;
    }

    /**
     * Gets match_route_by_suburb
     *
     * @return bool|null
     */
    public function getMatchRouteBySuburb()
    {
        return $this->container['match_route_by_suburb'];
    }

    /**
     * Sets match_route_by_suburb
     *
     * @param bool|null $match_route_by_suburb Indicates whether to find routes by suburbs in the search term (default = true)
     *
     * @return self
     */
    public function setMatchRouteBySuburb($match_route_by_suburb)
    {
        if (is_null($match_route_by_suburb)) {
            throw new \InvalidArgumentException('non-nullable match_route_by_suburb cannot be null');
        }
        $this->container['match_route_by_suburb'] = $match_route_by_suburb;

        return $this;
    }

    /**
     * Gets match_stop_by_gtfs_stop_id
     *
     * @return bool|null
     */
    public function getMatchStopByGtfsStopId()
    {
        return $this->container['match_stop_by_gtfs_stop_id'];
    }

    /**
     * Sets match_stop_by_gtfs_stop_id
     *
     * @param bool|null $match_stop_by_gtfs_stop_id Indicates whether to search for stops according to a metlink stop ID (default = false)
     *
     * @return self
     */
    public function setMatchStopByGtfsStopId($match_stop_by_gtfs_stop_id)
    {
        if (is_null($match_stop_by_gtfs_stop_id)) {
            throw new \InvalidArgumentException('non-nullable match_stop_by_gtfs_stop_id cannot be null');
        }
        $this->container['match_stop_by_gtfs_stop_id'] = $match_stop_by_gtfs_stop_id;

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

