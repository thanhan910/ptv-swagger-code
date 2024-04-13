<?php
/**
 * V3RouteDeparturesSpecificParameters
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
 * V3RouteDeparturesSpecificParameters Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3RouteDeparturesSpecificParameters implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.RouteDeparturesSpecificParameters';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'train_scheduled_timetables' => 'bool',
        'scheduled_timetables' => 'bool',
        'date_utc' => '\DateTime',
        'max_results' => 'int',
        'include_cancelled' => 'bool',
        'look_backwards' => 'bool',
        'expand' => 'string[]',
        'include_geopath' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'train_scheduled_timetables' => null,
        'scheduled_timetables' => null,
        'date_utc' => 'date-time',
        'max_results' => 'int32',
        'include_cancelled' => null,
        'look_backwards' => null,
        'expand' => null,
        'include_geopath' => null
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
        'train_scheduled_timetables' => 'train_scheduled_timetables',
        'scheduled_timetables' => 'scheduled_timetables',
        'date_utc' => 'date_utc',
        'max_results' => 'max_results',
        'include_cancelled' => 'include_cancelled',
        'look_backwards' => 'look_backwards',
        'expand' => 'expand',
        'include_geopath' => 'include_geopath'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'train_scheduled_timetables' => 'setTrainScheduledTimetables',
        'scheduled_timetables' => 'setScheduledTimetables',
        'date_utc' => 'setDateUtc',
        'max_results' => 'setMaxResults',
        'include_cancelled' => 'setIncludeCancelled',
        'look_backwards' => 'setLookBackwards',
        'expand' => 'setExpand',
        'include_geopath' => 'setIncludeGeopath'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'train_scheduled_timetables' => 'getTrainScheduledTimetables',
        'scheduled_timetables' => 'getScheduledTimetables',
        'date_utc' => 'getDateUtc',
        'max_results' => 'getMaxResults',
        'include_cancelled' => 'getIncludeCancelled',
        'look_backwards' => 'getLookBackwards',
        'expand' => 'getExpand',
        'include_geopath' => 'getIncludeGeopath'
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

    const EXPAND_ALL = 'All';
    const EXPAND_STOP = 'Stop';
    const EXPAND_ROUTE = 'Route';
    const EXPAND_RUN = 'Run';
    const EXPAND_DIRECTION = 'Direction';
    const EXPAND_DISRUPTION = 'Disruption';
    const EXPAND_VEHICLE_DESCRIPTOR = 'VehicleDescriptor';
    const EXPAND_VEHICLE_POSITION = 'VehiclePosition';
    const EXPAND_NONE = 'None';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getExpandAllowableValues()
    {
        return [
            self::EXPAND_ALL,
            self::EXPAND_STOP,
            self::EXPAND_ROUTE,
            self::EXPAND_RUN,
            self::EXPAND_DIRECTION,
            self::EXPAND_DISRUPTION,
            self::EXPAND_VEHICLE_DESCRIPTOR,
            self::EXPAND_VEHICLE_POSITION,
            self::EXPAND_NONE,
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
        $this->container['train_scheduled_timetables'] = isset($data['train_scheduled_timetables']) ? $data['train_scheduled_timetables'] : null;
        $this->container['scheduled_timetables'] = isset($data['scheduled_timetables']) ? $data['scheduled_timetables'] : null;
        $this->container['date_utc'] = isset($data['date_utc']) ? $data['date_utc'] : null;
        $this->container['max_results'] = isset($data['max_results']) ? $data['max_results'] : null;
        $this->container['include_cancelled'] = isset($data['include_cancelled']) ? $data['include_cancelled'] : null;
        $this->container['look_backwards'] = isset($data['look_backwards']) ? $data['look_backwards'] : null;
        $this->container['expand'] = isset($data['expand']) ? $data['expand'] : null;
        $this->container['include_geopath'] = isset($data['include_geopath']) ? $data['include_geopath'] : null;
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
     * Gets train_scheduled_timetables
     *
     * @return bool
     */
    public function getTrainScheduledTimetables()
    {
        return $this->container['train_scheduled_timetables'];
    }

    /**
     * Sets train_scheduled_timetables
     *
     * @param bool $train_scheduled_timetables DEPRECATED - use `scheduled_timetables` instead
     *
     * @return $this
     */
    public function setTrainScheduledTimetables($train_scheduled_timetables)
    {
        $this->container['train_scheduled_timetables'] = $train_scheduled_timetables;

        return $this;
    }

    /**
     * Gets scheduled_timetables
     *
     * @return bool
     */
    public function getScheduledTimetables()
    {
        return $this->container['scheduled_timetables'];
    }

    /**
     * Sets scheduled_timetables
     *
     * @param bool $scheduled_timetables When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.
     *
     * @return $this
     */
    public function setScheduledTimetables($scheduled_timetables)
    {
        $this->container['scheduled_timetables'] = $scheduled_timetables;

        return $this;
    }

    /**
     * Gets date_utc
     *
     * @return \DateTime
     */
    public function getDateUtc()
    {
        return $this->container['date_utc'];
    }

    /**
     * Sets date_utc
     *
     * @param \DateTime $date_utc Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
     *
     * @return $this
     */
    public function setDateUtc($date_utc)
    {
        $this->container['date_utc'] = $date_utc;

        return $this;
    }

    /**
     * Gets max_results
     *
     * @return int
     */
    public function getMaxResults()
    {
        return $this->container['max_results'];
    }

    /**
     * Sets max_results
     *
     * @param int $max_results Maximum number of results returned
     *
     * @return $this
     */
    public function setMaxResults($max_results)
    {
        $this->container['max_results'] = $max_results;

        return $this;
    }

    /**
     * Gets include_cancelled
     *
     * @return bool
     */
    public function getIncludeCancelled()
    {
        return $this->container['include_cancelled'];
    }

    /**
     * Sets include_cancelled
     *
     * @param bool $include_cancelled Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
     *
     * @return $this
     */
    public function setIncludeCancelled($include_cancelled)
    {
        $this->container['include_cancelled'] = $include_cancelled;

        return $this;
    }

    /**
     * Gets look_backwards
     *
     * @return bool
     */
    public function getLookBackwards()
    {
        return $this->container['look_backwards'];
    }

    /**
     * Sets look_backwards
     *
     * @param bool $look_backwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
     *
     * @return $this
     */
    public function setLookBackwards($look_backwards)
    {
        $this->container['look_backwards'] = $look_backwards;

        return $this;
    }

    /**
     * Gets expand
     *
     * @return string[]
     */
    public function getExpand()
    {
        return $this->container['expand'];
    }

    /**
     * Sets expand
     *
     * @param string[] $expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
     *
     * @return $this
     */
    public function setExpand($expand)
    {
        $allowedValues = $this->getExpandAllowableValues();
        if (!is_null($expand) && array_diff($expand, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'expand', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['expand'] = $expand;

        return $this;
    }

    /**
     * Gets include_geopath
     *
     * @return bool
     */
    public function getIncludeGeopath()
    {
        return $this->container['include_geopath'];
    }

    /**
     * Sets include_geopath
     *
     * @param bool $include_geopath Indicates if the route geopath should be returned
     *
     * @return $this
     */
    public function setIncludeGeopath($include_geopath)
    {
        $this->container['include_geopath'] = $include_geopath;

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
