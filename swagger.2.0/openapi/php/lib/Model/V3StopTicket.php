<?php
/**
 * V3StopTicket
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
 * V3StopTicket Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3StopTicket implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.StopTicket';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'ticket_type' => 'string',
        'zone' => 'string',
        'is_free_fare_zone' => 'bool',
        'ticket_machine' => 'bool',
        'ticket_checks' => 'bool',
        'vline_reservation' => 'bool',
        'ticket_zones' => 'int[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'ticket_type' => null,
        'zone' => null,
        'is_free_fare_zone' => null,
        'ticket_machine' => null,
        'ticket_checks' => null,
        'vline_reservation' => null,
        'ticket_zones' => 'int32'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'ticket_type' => false,
        'zone' => false,
        'is_free_fare_zone' => false,
        'ticket_machine' => false,
        'ticket_checks' => false,
        'vline_reservation' => false,
        'ticket_zones' => false
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
        'ticket_type' => 'ticket_type',
        'zone' => 'zone',
        'is_free_fare_zone' => 'is_free_fare_zone',
        'ticket_machine' => 'ticket_machine',
        'ticket_checks' => 'ticket_checks',
        'vline_reservation' => 'vline_reservation',
        'ticket_zones' => 'ticket_zones'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'ticket_type' => 'setTicketType',
        'zone' => 'setZone',
        'is_free_fare_zone' => 'setIsFreeFareZone',
        'ticket_machine' => 'setTicketMachine',
        'ticket_checks' => 'setTicketChecks',
        'vline_reservation' => 'setVlineReservation',
        'ticket_zones' => 'setTicketZones'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'ticket_type' => 'getTicketType',
        'zone' => 'getZone',
        'is_free_fare_zone' => 'getIsFreeFareZone',
        'ticket_machine' => 'getTicketMachine',
        'ticket_checks' => 'getTicketChecks',
        'vline_reservation' => 'getVlineReservation',
        'ticket_zones' => 'getTicketZones'
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
        $this->setIfExists('ticket_type', $data ?? [], null);
        $this->setIfExists('zone', $data ?? [], null);
        $this->setIfExists('is_free_fare_zone', $data ?? [], null);
        $this->setIfExists('ticket_machine', $data ?? [], null);
        $this->setIfExists('ticket_checks', $data ?? [], null);
        $this->setIfExists('vline_reservation', $data ?? [], null);
        $this->setIfExists('ticket_zones', $data ?? [], null);
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
     * Gets ticket_type
     *
     * @return string|null
     */
    public function getTicketType()
    {
        return $this->container['ticket_type'];
    }

    /**
     * Sets ticket_type
     *
     * @param string|null $ticket_type Indicates the ticket type for the stop (myki, paper or both)
     *
     * @return self
     */
    public function setTicketType($ticket_type)
    {
        if (is_null($ticket_type)) {
            throw new \InvalidArgumentException('non-nullable ticket_type cannot be null');
        }
        $this->container['ticket_type'] = $ticket_type;

        return $this;
    }

    /**
     * Gets zone
     *
     * @return string|null
     */
    public function getZone()
    {
        return $this->container['zone'];
    }

    /**
     * Sets zone
     *
     * @param string|null $zone Description of the zone
     *
     * @return self
     */
    public function setZone($zone)
    {
        if (is_null($zone)) {
            throw new \InvalidArgumentException('non-nullable zone cannot be null');
        }
        $this->container['zone'] = $zone;

        return $this;
    }

    /**
     * Gets is_free_fare_zone
     *
     * @return bool|null
     */
    public function getIsFreeFareZone()
    {
        return $this->container['is_free_fare_zone'];
    }

    /**
     * Sets is_free_fare_zone
     *
     * @param bool|null $is_free_fare_zone Indicates whether the stop is inside the free fare zone
     *
     * @return self
     */
    public function setIsFreeFareZone($is_free_fare_zone)
    {
        if (is_null($is_free_fare_zone)) {
            throw new \InvalidArgumentException('non-nullable is_free_fare_zone cannot be null');
        }
        $this->container['is_free_fare_zone'] = $is_free_fare_zone;

        return $this;
    }

    /**
     * Gets ticket_machine
     *
     * @return bool|null
     */
    public function getTicketMachine()
    {
        return $this->container['ticket_machine'];
    }

    /**
     * Sets ticket_machine
     *
     * @param bool|null $ticket_machine ticket_machine
     *
     * @return self
     */
    public function setTicketMachine($ticket_machine)
    {
        if (is_null($ticket_machine)) {
            throw new \InvalidArgumentException('non-nullable ticket_machine cannot be null');
        }
        $this->container['ticket_machine'] = $ticket_machine;

        return $this;
    }

    /**
     * Gets ticket_checks
     *
     * @return bool|null
     */
    public function getTicketChecks()
    {
        return $this->container['ticket_checks'];
    }

    /**
     * Sets ticket_checks
     *
     * @param bool|null $ticket_checks ticket_checks
     *
     * @return self
     */
    public function setTicketChecks($ticket_checks)
    {
        if (is_null($ticket_checks)) {
            throw new \InvalidArgumentException('non-nullable ticket_checks cannot be null');
        }
        $this->container['ticket_checks'] = $ticket_checks;

        return $this;
    }

    /**
     * Gets vline_reservation
     *
     * @return bool|null
     */
    public function getVlineReservation()
    {
        return $this->container['vline_reservation'];
    }

    /**
     * Sets vline_reservation
     *
     * @param bool|null $vline_reservation vline_reservation
     *
     * @return self
     */
    public function setVlineReservation($vline_reservation)
    {
        if (is_null($vline_reservation)) {
            throw new \InvalidArgumentException('non-nullable vline_reservation cannot be null');
        }
        $this->container['vline_reservation'] = $vline_reservation;

        return $this;
    }

    /**
     * Gets ticket_zones
     *
     * @return int[]|null
     */
    public function getTicketZones()
    {
        return $this->container['ticket_zones'];
    }

    /**
     * Sets ticket_zones
     *
     * @param int[]|null $ticket_zones ticket_zones
     *
     * @return self
     */
    public function setTicketZones($ticket_zones)
    {
        if (is_null($ticket_zones)) {
            throw new \InvalidArgumentException('non-nullable ticket_zones cannot be null');
        }
        $this->container['ticket_zones'] = $ticket_zones;

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

