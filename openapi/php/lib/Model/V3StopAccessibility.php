<?php
/**
 * V3StopAccessibility
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
 * V3StopAccessibility Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3StopAccessibility implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.StopAccessibility';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'lighting' => 'bool',
        'platform_number' => 'int',
        'audio_customer_information' => 'bool',
        'escalator' => 'bool',
        'hearing_loop' => 'bool',
        'lift' => 'bool',
        'stairs' => 'bool',
        'stop_accessible' => 'bool',
        'tactile_ground_surface_indicator' => 'bool',
        'waiting_room' => 'bool',
        'wheelchair' => '\OpenAPI\Client\Model\V3StopAccessibilityWheelchair'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'lighting' => null,
        'platform_number' => 'int32',
        'audio_customer_information' => null,
        'escalator' => null,
        'hearing_loop' => null,
        'lift' => null,
        'stairs' => null,
        'stop_accessible' => null,
        'tactile_ground_surface_indicator' => null,
        'waiting_room' => null,
        'wheelchair' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'lighting' => false,
        'platform_number' => false,
        'audio_customer_information' => false,
        'escalator' => false,
        'hearing_loop' => false,
        'lift' => false,
        'stairs' => false,
        'stop_accessible' => false,
        'tactile_ground_surface_indicator' => false,
        'waiting_room' => false,
        'wheelchair' => false
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
        'lighting' => 'lighting',
        'platform_number' => 'platform_number',
        'audio_customer_information' => 'audio_customer_information',
        'escalator' => 'escalator',
        'hearing_loop' => 'hearing_loop',
        'lift' => 'lift',
        'stairs' => 'stairs',
        'stop_accessible' => 'stop_accessible',
        'tactile_ground_surface_indicator' => 'tactile_ground_surface_indicator',
        'waiting_room' => 'waiting_room',
        'wheelchair' => 'wheelchair'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'lighting' => 'setLighting',
        'platform_number' => 'setPlatformNumber',
        'audio_customer_information' => 'setAudioCustomerInformation',
        'escalator' => 'setEscalator',
        'hearing_loop' => 'setHearingLoop',
        'lift' => 'setLift',
        'stairs' => 'setStairs',
        'stop_accessible' => 'setStopAccessible',
        'tactile_ground_surface_indicator' => 'setTactileGroundSurfaceIndicator',
        'waiting_room' => 'setWaitingRoom',
        'wheelchair' => 'setWheelchair'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'lighting' => 'getLighting',
        'platform_number' => 'getPlatformNumber',
        'audio_customer_information' => 'getAudioCustomerInformation',
        'escalator' => 'getEscalator',
        'hearing_loop' => 'getHearingLoop',
        'lift' => 'getLift',
        'stairs' => 'getStairs',
        'stop_accessible' => 'getStopAccessible',
        'tactile_ground_surface_indicator' => 'getTactileGroundSurfaceIndicator',
        'waiting_room' => 'getWaitingRoom',
        'wheelchair' => 'getWheelchair'
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
        $this->setIfExists('lighting', $data ?? [], null);
        $this->setIfExists('platform_number', $data ?? [], null);
        $this->setIfExists('audio_customer_information', $data ?? [], null);
        $this->setIfExists('escalator', $data ?? [], null);
        $this->setIfExists('hearing_loop', $data ?? [], null);
        $this->setIfExists('lift', $data ?? [], null);
        $this->setIfExists('stairs', $data ?? [], null);
        $this->setIfExists('stop_accessible', $data ?? [], null);
        $this->setIfExists('tactile_ground_surface_indicator', $data ?? [], null);
        $this->setIfExists('waiting_room', $data ?? [], null);
        $this->setIfExists('wheelchair', $data ?? [], null);
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
     * Gets lighting
     *
     * @return bool|null
     */
    public function getLighting()
    {
        return $this->container['lighting'];
    }

    /**
     * Sets lighting
     *
     * @param bool|null $lighting Indicates if there is lighting at the stop
     *
     * @return self
     */
    public function setLighting($lighting)
    {
        if (is_null($lighting)) {
            throw new \InvalidArgumentException('non-nullable lighting cannot be null');
        }
        $this->container['lighting'] = $lighting;

        return $this;
    }

    /**
     * Gets platform_number
     *
     * @return int|null
     */
    public function getPlatformNumber()
    {
        return $this->container['platform_number'];
    }

    /**
     * Sets platform_number
     *
     * @param int|null $platform_number Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
     *
     * @return self
     */
    public function setPlatformNumber($platform_number)
    {
        if (is_null($platform_number)) {
            throw new \InvalidArgumentException('non-nullable platform_number cannot be null');
        }
        $this->container['platform_number'] = $platform_number;

        return $this;
    }

    /**
     * Gets audio_customer_information
     *
     * @return bool|null
     */
    public function getAudioCustomerInformation()
    {
        return $this->container['audio_customer_information'];
    }

    /**
     * Sets audio_customer_information
     *
     * @param bool|null $audio_customer_information Indicates if there is at least one audio customer information at the stop/platform
     *
     * @return self
     */
    public function setAudioCustomerInformation($audio_customer_information)
    {
        if (is_null($audio_customer_information)) {
            throw new \InvalidArgumentException('non-nullable audio_customer_information cannot be null');
        }
        $this->container['audio_customer_information'] = $audio_customer_information;

        return $this;
    }

    /**
     * Gets escalator
     *
     * @return bool|null
     */
    public function getEscalator()
    {
        return $this->container['escalator'];
    }

    /**
     * Sets escalator
     *
     * @param bool|null $escalator Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
     *
     * @return self
     */
    public function setEscalator($escalator)
    {
        if (is_null($escalator)) {
            throw new \InvalidArgumentException('non-nullable escalator cannot be null');
        }
        $this->container['escalator'] = $escalator;

        return $this;
    }

    /**
     * Gets hearing_loop
     *
     * @return bool|null
     */
    public function getHearingLoop()
    {
        return $this->container['hearing_loop'];
    }

    /**
     * Sets hearing_loop
     *
     * @param bool|null $hearing_loop Indicates if there is a hearing loop facility at the stop/platform
     *
     * @return self
     */
    public function setHearingLoop($hearing_loop)
    {
        if (is_null($hearing_loop)) {
            throw new \InvalidArgumentException('non-nullable hearing_loop cannot be null');
        }
        $this->container['hearing_loop'] = $hearing_loop;

        return $this;
    }

    /**
     * Gets lift
     *
     * @return bool|null
     */
    public function getLift()
    {
        return $this->container['lift'];
    }

    /**
     * Sets lift
     *
     * @param bool|null $lift Indicates if there is an elevator at the stop/platform
     *
     * @return self
     */
    public function setLift($lift)
    {
        if (is_null($lift)) {
            throw new \InvalidArgumentException('non-nullable lift cannot be null');
        }
        $this->container['lift'] = $lift;

        return $this;
    }

    /**
     * Gets stairs
     *
     * @return bool|null
     */
    public function getStairs()
    {
        return $this->container['stairs'];
    }

    /**
     * Sets stairs
     *
     * @param bool|null $stairs Indicates if there are stairs available in the stop
     *
     * @return self
     */
    public function setStairs($stairs)
    {
        if (is_null($stairs)) {
            throw new \InvalidArgumentException('non-nullable stairs cannot be null');
        }
        $this->container['stairs'] = $stairs;

        return $this;
    }

    /**
     * Gets stop_accessible
     *
     * @return bool|null
     */
    public function getStopAccessible()
    {
        return $this->container['stop_accessible'];
    }

    /**
     * Sets stop_accessible
     *
     * @param bool|null $stop_accessible Indicates if the stop is accessible
     *
     * @return self
     */
    public function setStopAccessible($stop_accessible)
    {
        if (is_null($stop_accessible)) {
            throw new \InvalidArgumentException('non-nullable stop_accessible cannot be null');
        }
        $this->container['stop_accessible'] = $stop_accessible;

        return $this;
    }

    /**
     * Gets tactile_ground_surface_indicator
     *
     * @return bool|null
     */
    public function getTactileGroundSurfaceIndicator()
    {
        return $this->container['tactile_ground_surface_indicator'];
    }

    /**
     * Sets tactile_ground_surface_indicator
     *
     * @param bool|null $tactile_ground_surface_indicator Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
     *
     * @return self
     */
    public function setTactileGroundSurfaceIndicator($tactile_ground_surface_indicator)
    {
        if (is_null($tactile_ground_surface_indicator)) {
            throw new \InvalidArgumentException('non-nullable tactile_ground_surface_indicator cannot be null');
        }
        $this->container['tactile_ground_surface_indicator'] = $tactile_ground_surface_indicator;

        return $this;
    }

    /**
     * Gets waiting_room
     *
     * @return bool|null
     */
    public function getWaitingRoom()
    {
        return $this->container['waiting_room'];
    }

    /**
     * Sets waiting_room
     *
     * @param bool|null $waiting_room Indicates if there is a general waiting area at the stop
     *
     * @return self
     */
    public function setWaitingRoom($waiting_room)
    {
        if (is_null($waiting_room)) {
            throw new \InvalidArgumentException('non-nullable waiting_room cannot be null');
        }
        $this->container['waiting_room'] = $waiting_room;

        return $this;
    }

    /**
     * Gets wheelchair
     *
     * @return \OpenAPI\Client\Model\V3StopAccessibilityWheelchair|null
     */
    public function getWheelchair()
    {
        return $this->container['wheelchair'];
    }

    /**
     * Sets wheelchair
     *
     * @param \OpenAPI\Client\Model\V3StopAccessibilityWheelchair|null $wheelchair wheelchair
     *
     * @return self
     */
    public function setWheelchair($wheelchair)
    {
        if (is_null($wheelchair)) {
            throw new \InvalidArgumentException('non-nullable wheelchair cannot be null');
        }
        $this->container['wheelchair'] = $wheelchair;

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


