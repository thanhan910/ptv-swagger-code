<?php
/**
 * V3BulkDeparturesResponse
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
 * V3BulkDeparturesResponse Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3BulkDeparturesResponse implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.BulkDeparturesResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'responses' => '\OpenAPI\Client\Model\V3BulkDeparturesUpdateResponse[]',
        'stops' => 'array<string,\OpenAPI\Client\Model\V3BulkDeparturesStopResponse>',
        'routes' => 'object[]',
        'runs' => '\OpenAPI\Client\Model\V3Run[]',
        'directions' => '\OpenAPI\Client\Model\V3Direction[]',
        'disruptions' => 'array<string,\OpenAPI\Client\Model\V3Disruption>',
        'status' => '\OpenAPI\Client\Model\V3Status'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'responses' => null,
        'stops' => null,
        'routes' => null,
        'runs' => null,
        'directions' => null,
        'disruptions' => null,
        'status' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'responses' => false,
        'stops' => false,
        'routes' => false,
        'runs' => false,
        'directions' => false,
        'disruptions' => false,
        'status' => false
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
        'responses' => 'responses',
        'stops' => 'stops',
        'routes' => 'routes',
        'runs' => 'runs',
        'directions' => 'directions',
        'disruptions' => 'disruptions',
        'status' => 'status'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'responses' => 'setResponses',
        'stops' => 'setStops',
        'routes' => 'setRoutes',
        'runs' => 'setRuns',
        'directions' => 'setDirections',
        'disruptions' => 'setDisruptions',
        'status' => 'setStatus'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'responses' => 'getResponses',
        'stops' => 'getStops',
        'routes' => 'getRoutes',
        'runs' => 'getRuns',
        'directions' => 'getDirections',
        'disruptions' => 'getDisruptions',
        'status' => 'getStatus'
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
        $this->setIfExists('responses', $data ?? [], null);
        $this->setIfExists('stops', $data ?? [], null);
        $this->setIfExists('routes', $data ?? [], null);
        $this->setIfExists('runs', $data ?? [], null);
        $this->setIfExists('directions', $data ?? [], null);
        $this->setIfExists('disruptions', $data ?? [], null);
        $this->setIfExists('status', $data ?? [], null);
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
     * Gets responses
     *
     * @return \OpenAPI\Client\Model\V3BulkDeparturesUpdateResponse[]|null
     */
    public function getResponses()
    {
        return $this->container['responses'];
    }

    /**
     * Sets responses
     *
     * @param \OpenAPI\Client\Model\V3BulkDeparturesUpdateResponse[]|null $responses Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.
     *
     * @return self
     */
    public function setResponses($responses)
    {
        if (is_null($responses)) {
            throw new \InvalidArgumentException('non-nullable responses cannot be null');
        }
        $this->container['responses'] = $responses;

        return $this;
    }

    /**
     * Gets stops
     *
     * @return array<string,\OpenAPI\Client\Model\V3BulkDeparturesStopResponse>|null
     */
    public function getStops()
    {
        return $this->container['stops'];
    }

    /**
     * Sets stops
     *
     * @param array<string,\OpenAPI\Client\Model\V3BulkDeparturesStopResponse>|null $stops A train station, tram stop, bus stop, regional coach stop or Night Bus stop
     *
     * @return self
     */
    public function setStops($stops)
    {
        if (is_null($stops)) {
            throw new \InvalidArgumentException('non-nullable stops cannot be null');
        }
        $this->container['stops'] = $stops;

        return $this;
    }

    /**
     * Gets routes
     *
     * @return object[]|null
     */
    public function getRoutes()
    {
        return $this->container['routes'];
    }

    /**
     * Sets routes
     *
     * @param object[]|null $routes Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
     *
     * @return self
     */
    public function setRoutes($routes)
    {
        if (is_null($routes)) {
            throw new \InvalidArgumentException('non-nullable routes cannot be null');
        }
        $this->container['routes'] = $routes;

        return $this;
    }

    /**
     * Gets runs
     *
     * @return \OpenAPI\Client\Model\V3Run[]|null
     */
    public function getRuns()
    {
        return $this->container['runs'];
    }

    /**
     * Sets runs
     *
     * @param \OpenAPI\Client\Model\V3Run[]|null $runs Individual trips/services of a route
     *
     * @return self
     */
    public function setRuns($runs)
    {
        if (is_null($runs)) {
            throw new \InvalidArgumentException('non-nullable runs cannot be null');
        }
        $this->container['runs'] = $runs;

        return $this;
    }

    /**
     * Gets directions
     *
     * @return \OpenAPI\Client\Model\V3Direction[]|null
     */
    public function getDirections()
    {
        return $this->container['directions'];
    }

    /**
     * Sets directions
     *
     * @param \OpenAPI\Client\Model\V3Direction[]|null $directions Directions of travel of route
     *
     * @return self
     */
    public function setDirections($directions)
    {
        if (is_null($directions)) {
            throw new \InvalidArgumentException('non-nullable directions cannot be null');
        }
        $this->container['directions'] = $directions;

        return $this;
    }

    /**
     * Gets disruptions
     *
     * @return array<string,\OpenAPI\Client\Model\V3Disruption>|null
     */
    public function getDisruptions()
    {
        return $this->container['disruptions'];
    }

    /**
     * Sets disruptions
     *
     * @param array<string,\OpenAPI\Client\Model\V3Disruption>|null $disruptions Disruption information applicable to relevant routes or stops
     *
     * @return self
     */
    public function setDisruptions($disruptions)
    {
        if (is_null($disruptions)) {
            throw new \InvalidArgumentException('non-nullable disruptions cannot be null');
        }
        $this->container['disruptions'] = $disruptions;

        return $this;
    }

    /**
     * Gets status
     *
     * @return \OpenAPI\Client\Model\V3Status|null
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param \OpenAPI\Client\Model\V3Status|null $status status
     *
     * @return self
     */
    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $this->container['status'] = $status;

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


