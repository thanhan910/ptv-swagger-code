<?php
/**
 * V3ResultRoute
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.39
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * V3ResultRoute Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3ResultRoute implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.ResultRoute';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'route_name' => 'string',
        'route_number' => 'string',
        'route_type' => 'int',
        'route_id' => 'int',
        'route_gtfs_id' => 'string',
        'route_service_status' => '\Swagger\Client\Model\V3RouteServiceStatus'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'route_name' => null,
        'route_number' => null,
        'route_type' => 'int32',
        'route_id' => 'int32',
        'route_gtfs_id' => null,
        'route_service_status' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'route_name' => 'route_name',
        'route_number' => 'route_number',
        'route_type' => 'route_type',
        'route_id' => 'route_id',
        'route_gtfs_id' => 'route_gtfs_id',
        'route_service_status' => 'route_service_status'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'route_name' => 'setRouteName',
        'route_number' => 'setRouteNumber',
        'route_type' => 'setRouteType',
        'route_id' => 'setRouteId',
        'route_gtfs_id' => 'setRouteGtfsId',
        'route_service_status' => 'setRouteServiceStatus'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'route_name' => 'getRouteName',
        'route_number' => 'getRouteNumber',
        'route_type' => 'getRouteType',
        'route_id' => 'getRouteId',
        'route_gtfs_id' => 'getRouteGtfsId',
        'route_service_status' => 'getRouteServiceStatus'
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
        return self::$swaggerModelName;
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
        $this->container['route_name'] = isset($data['route_name']) ? $data['route_name'] : null;
        $this->container['route_number'] = isset($data['route_number']) ? $data['route_number'] : null;
        $this->container['route_type'] = isset($data['route_type']) ? $data['route_type'] : null;
        $this->container['route_id'] = isset($data['route_id']) ? $data['route_id'] : null;
        $this->container['route_gtfs_id'] = isset($data['route_gtfs_id']) ? $data['route_gtfs_id'] : null;
        $this->container['route_service_status'] = isset($data['route_service_status']) ? $data['route_service_status'] : null;
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
     * Gets route_name
     *
     * @return string
     */
    public function getRouteName()
    {
        return $this->container['route_name'];
    }

    /**
     * Sets route_name
     *
     * @param string $route_name Name of route
     *
     * @return $this
     */
    public function setRouteName($route_name)
    {
        $this->container['route_name'] = $route_name;

        return $this;
    }

    /**
     * Gets route_number
     *
     * @return string
     */
    public function getRouteNumber()
    {
        return $this->container['route_number'];
    }

    /**
     * Sets route_number
     *
     * @param string $route_number Route number presented to public (nb. not route_id)
     *
     * @return $this
     */
    public function setRouteNumber($route_number)
    {
        $this->container['route_number'] = $route_number;

        return $this;
    }

    /**
     * Gets route_type
     *
     * @return int
     */
    public function getRouteType()
    {
        return $this->container['route_type'];
    }

    /**
     * Sets route_type
     *
     * @param int $route_type Transport mode identifier
     *
     * @return $this
     */
    public function setRouteType($route_type)
    {
        $this->container['route_type'] = $route_type;

        return $this;
    }

    /**
     * Gets route_id
     *
     * @return int
     */
    public function getRouteId()
    {
        return $this->container['route_id'];
    }

    /**
     * Sets route_id
     *
     * @param int $route_id Route identifier
     *
     * @return $this
     */
    public function setRouteId($route_id)
    {
        $this->container['route_id'] = $route_id;

        return $this;
    }

    /**
     * Gets route_gtfs_id
     *
     * @return string
     */
    public function getRouteGtfsId()
    {
        return $this->container['route_gtfs_id'];
    }

    /**
     * Sets route_gtfs_id
     *
     * @param string $route_gtfs_id GTFS Identifer of the route
     *
     * @return $this
     */
    public function setRouteGtfsId($route_gtfs_id)
    {
        $this->container['route_gtfs_id'] = $route_gtfs_id;

        return $this;
    }

    /**
     * Gets route_service_status
     *
     * @return \Swagger\Client\Model\V3RouteServiceStatus
     */
    public function getRouteServiceStatus()
    {
        return $this->container['route_service_status'];
    }

    /**
     * Sets route_service_status
     *
     * @param \Swagger\Client\Model\V3RouteServiceStatus $route_service_status Service status for the route (indicates disruptions)
     *
     * @return $this
     */
    public function setRouteServiceStatus($route_service_status)
    {
        $this->container['route_service_status'] = $route_service_status;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    #[\ReturnTypeWillChange]
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    #[\ReturnTypeWillChange]
    public function offsetSet($offset, $value)
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
    #[\ReturnTypeWillChange]
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


