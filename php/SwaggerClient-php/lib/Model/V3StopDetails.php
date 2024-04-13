<?php
/**
 * V3StopDetails
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
 * Swagger Codegen version: 3.0.52
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
 * V3StopDetails Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3StopDetails implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.StopDetails';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'disruption_ids' => 'int[]',
        'station_type' => 'string',
        'station_description' => 'string',
        'route_type' => 'int',
        'stop_location' => '\Swagger\Client\Model\V3StopLocation',
        'stop_amenities' => '\Swagger\Client\Model\V3StopAmenityDetails',
        'stop_accessibility' => '\Swagger\Client\Model\V3StopAccessibility',
        'stop_staffing' => '\Swagger\Client\Model\V3StopStaffing',
        'routes' => 'object[]',
        'stop_id' => 'int',
        'stop_name' => 'string',
        'stop_landmark' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'disruption_ids' => 'int64',
        'station_type' => null,
        'station_description' => null,
        'route_type' => 'int32',
        'stop_location' => null,
        'stop_amenities' => null,
        'stop_accessibility' => null,
        'stop_staffing' => null,
        'routes' => null,
        'stop_id' => 'int32',
        'stop_name' => null,
        'stop_landmark' => null
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
        'disruption_ids' => 'disruption_ids',
        'station_type' => 'station_type',
        'station_description' => 'station_description',
        'route_type' => 'route_type',
        'stop_location' => 'stop_location',
        'stop_amenities' => 'stop_amenities',
        'stop_accessibility' => 'stop_accessibility',
        'stop_staffing' => 'stop_staffing',
        'routes' => 'routes',
        'stop_id' => 'stop_id',
        'stop_name' => 'stop_name',
        'stop_landmark' => 'stop_landmark'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'disruption_ids' => 'setDisruptionIds',
        'station_type' => 'setStationType',
        'station_description' => 'setStationDescription',
        'route_type' => 'setRouteType',
        'stop_location' => 'setStopLocation',
        'stop_amenities' => 'setStopAmenities',
        'stop_accessibility' => 'setStopAccessibility',
        'stop_staffing' => 'setStopStaffing',
        'routes' => 'setRoutes',
        'stop_id' => 'setStopId',
        'stop_name' => 'setStopName',
        'stop_landmark' => 'setStopLandmark'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'disruption_ids' => 'getDisruptionIds',
        'station_type' => 'getStationType',
        'station_description' => 'getStationDescription',
        'route_type' => 'getRouteType',
        'stop_location' => 'getStopLocation',
        'stop_amenities' => 'getStopAmenities',
        'stop_accessibility' => 'getStopAccessibility',
        'stop_staffing' => 'getStopStaffing',
        'routes' => 'getRoutes',
        'stop_id' => 'getStopId',
        'stop_name' => 'getStopName',
        'stop_landmark' => 'getStopLandmark'
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
        $this->container['disruption_ids'] = isset($data['disruption_ids']) ? $data['disruption_ids'] : null;
        $this->container['station_type'] = isset($data['station_type']) ? $data['station_type'] : null;
        $this->container['station_description'] = isset($data['station_description']) ? $data['station_description'] : null;
        $this->container['route_type'] = isset($data['route_type']) ? $data['route_type'] : null;
        $this->container['stop_location'] = isset($data['stop_location']) ? $data['stop_location'] : null;
        $this->container['stop_amenities'] = isset($data['stop_amenities']) ? $data['stop_amenities'] : null;
        $this->container['stop_accessibility'] = isset($data['stop_accessibility']) ? $data['stop_accessibility'] : null;
        $this->container['stop_staffing'] = isset($data['stop_staffing']) ? $data['stop_staffing'] : null;
        $this->container['routes'] = isset($data['routes']) ? $data['routes'] : null;
        $this->container['stop_id'] = isset($data['stop_id']) ? $data['stop_id'] : null;
        $this->container['stop_name'] = isset($data['stop_name']) ? $data['stop_name'] : null;
        $this->container['stop_landmark'] = isset($data['stop_landmark']) ? $data['stop_landmark'] : null;
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
     * Gets disruption_ids
     *
     * @return int[]
     */
    public function getDisruptionIds()
    {
        return $this->container['disruption_ids'];
    }

    /**
     * Sets disruption_ids
     *
     * @param int[] $disruption_ids Disruption information identifier(s)
     *
     * @return $this
     */
    public function setDisruptionIds($disruption_ids)
    {
        $this->container['disruption_ids'] = $disruption_ids;

        return $this;
    }

    /**
     * Gets station_type
     *
     * @return string
     */
    public function getStationType()
    {
        return $this->container['station_type'];
    }

    /**
     * Sets station_type
     *
     * @param string $station_type Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train
     *
     * @return $this
     */
    public function setStationType($station_type)
    {
        $this->container['station_type'] = $station_type;

        return $this;
    }

    /**
     * Gets station_description
     *
     * @return string
     */
    public function getStationDescription()
    {
        return $this->container['station_description'];
    }

    /**
     * Sets station_description
     *
     * @param string $station_description The definition applicable to the station_type; returns null for V/Line train
     *
     * @return $this
     */
    public function setStationDescription($station_description)
    {
        $this->container['station_description'] = $station_description;

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
     * Gets stop_location
     *
     * @return \Swagger\Client\Model\V3StopLocation
     */
    public function getStopLocation()
    {
        return $this->container['stop_location'];
    }

    /**
     * Sets stop_location
     *
     * @param \Swagger\Client\Model\V3StopLocation $stop_location stop_location
     *
     * @return $this
     */
    public function setStopLocation($stop_location)
    {
        $this->container['stop_location'] = $stop_location;

        return $this;
    }

    /**
     * Gets stop_amenities
     *
     * @return \Swagger\Client\Model\V3StopAmenityDetails
     */
    public function getStopAmenities()
    {
        return $this->container['stop_amenities'];
    }

    /**
     * Sets stop_amenities
     *
     * @param \Swagger\Client\Model\V3StopAmenityDetails $stop_amenities stop_amenities
     *
     * @return $this
     */
    public function setStopAmenities($stop_amenities)
    {
        $this->container['stop_amenities'] = $stop_amenities;

        return $this;
    }

    /**
     * Gets stop_accessibility
     *
     * @return \Swagger\Client\Model\V3StopAccessibility
     */
    public function getStopAccessibility()
    {
        return $this->container['stop_accessibility'];
    }

    /**
     * Sets stop_accessibility
     *
     * @param \Swagger\Client\Model\V3StopAccessibility $stop_accessibility stop_accessibility
     *
     * @return $this
     */
    public function setStopAccessibility($stop_accessibility)
    {
        $this->container['stop_accessibility'] = $stop_accessibility;

        return $this;
    }

    /**
     * Gets stop_staffing
     *
     * @return \Swagger\Client\Model\V3StopStaffing
     */
    public function getStopStaffing()
    {
        return $this->container['stop_staffing'];
    }

    /**
     * Sets stop_staffing
     *
     * @param \Swagger\Client\Model\V3StopStaffing $stop_staffing stop_staffing
     *
     * @return $this
     */
    public function setStopStaffing($stop_staffing)
    {
        $this->container['stop_staffing'] = $stop_staffing;

        return $this;
    }

    /**
     * Gets routes
     *
     * @return object[]
     */
    public function getRoutes()
    {
        return $this->container['routes'];
    }

    /**
     * Sets routes
     *
     * @param object[] $routes Routes travelling through the stop
     *
     * @return $this
     */
    public function setRoutes($routes)
    {
        $this->container['routes'] = $routes;

        return $this;
    }

    /**
     * Gets stop_id
     *
     * @return int
     */
    public function getStopId()
    {
        return $this->container['stop_id'];
    }

    /**
     * Sets stop_id
     *
     * @param int $stop_id Stop identifier
     *
     * @return $this
     */
    public function setStopId($stop_id)
    {
        $this->container['stop_id'] = $stop_id;

        return $this;
    }

    /**
     * Gets stop_name
     *
     * @return string
     */
    public function getStopName()
    {
        return $this->container['stop_name'];
    }

    /**
     * Sets stop_name
     *
     * @param string $stop_name Name of stop
     *
     * @return $this
     */
    public function setStopName($stop_name)
    {
        $this->container['stop_name'] = $stop_name;

        return $this;
    }

    /**
     * Gets stop_landmark
     *
     * @return string
     */
    public function getStopLandmark()
    {
        return $this->container['stop_landmark'];
    }

    /**
     * Sets stop_landmark
     *
     * @param string $stop_landmark Landmark in proximity of stop
     *
     * @return $this
     */
    public function setStopLandmark($stop_landmark)
    {
        $this->container['stop_landmark'] = $stop_landmark;

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
