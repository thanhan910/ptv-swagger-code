<?php
/**
 * V3Disruption
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
 * V3Disruption Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3Disruption implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.Disruption';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'disruption_id' => 'int',
        'title' => 'string',
        'url' => 'string',
        'description' => 'string',
        'disruption_status' => 'string',
        'disruption_type' => 'string',
        'published_on' => '\DateTime',
        'last_updated' => '\DateTime',
        'from_date' => '\DateTime',
        'to_date' => '\DateTime',
        'routes' => '\Swagger\Client\Model\V3DisruptionRoute[]',
        'stops' => '\Swagger\Client\Model\V3DisruptionStop[]',
        'colour' => 'string',
        'display_on_board' => 'bool',
        'display_status' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'disruption_id' => 'int64',
        'title' => null,
        'url' => null,
        'description' => null,
        'disruption_status' => null,
        'disruption_type' => null,
        'published_on' => 'date-time',
        'last_updated' => 'date-time',
        'from_date' => 'date-time',
        'to_date' => 'date-time',
        'routes' => null,
        'stops' => null,
        'colour' => null,
        'display_on_board' => null,
        'display_status' => null
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
        'disruption_id' => 'disruption_id',
        'title' => 'title',
        'url' => 'url',
        'description' => 'description',
        'disruption_status' => 'disruption_status',
        'disruption_type' => 'disruption_type',
        'published_on' => 'published_on',
        'last_updated' => 'last_updated',
        'from_date' => 'from_date',
        'to_date' => 'to_date',
        'routes' => 'routes',
        'stops' => 'stops',
        'colour' => 'colour',
        'display_on_board' => 'display_on_board',
        'display_status' => 'display_status'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'disruption_id' => 'setDisruptionId',
        'title' => 'setTitle',
        'url' => 'setUrl',
        'description' => 'setDescription',
        'disruption_status' => 'setDisruptionStatus',
        'disruption_type' => 'setDisruptionType',
        'published_on' => 'setPublishedOn',
        'last_updated' => 'setLastUpdated',
        'from_date' => 'setFromDate',
        'to_date' => 'setToDate',
        'routes' => 'setRoutes',
        'stops' => 'setStops',
        'colour' => 'setColour',
        'display_on_board' => 'setDisplayOnBoard',
        'display_status' => 'setDisplayStatus'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'disruption_id' => 'getDisruptionId',
        'title' => 'getTitle',
        'url' => 'getUrl',
        'description' => 'getDescription',
        'disruption_status' => 'getDisruptionStatus',
        'disruption_type' => 'getDisruptionType',
        'published_on' => 'getPublishedOn',
        'last_updated' => 'getLastUpdated',
        'from_date' => 'getFromDate',
        'to_date' => 'getToDate',
        'routes' => 'getRoutes',
        'stops' => 'getStops',
        'colour' => 'getColour',
        'display_on_board' => 'getDisplayOnBoard',
        'display_status' => 'getDisplayStatus'
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
        $this->container['disruption_id'] = isset($data['disruption_id']) ? $data['disruption_id'] : null;
        $this->container['title'] = isset($data['title']) ? $data['title'] : null;
        $this->container['url'] = isset($data['url']) ? $data['url'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['disruption_status'] = isset($data['disruption_status']) ? $data['disruption_status'] : null;
        $this->container['disruption_type'] = isset($data['disruption_type']) ? $data['disruption_type'] : null;
        $this->container['published_on'] = isset($data['published_on']) ? $data['published_on'] : null;
        $this->container['last_updated'] = isset($data['last_updated']) ? $data['last_updated'] : null;
        $this->container['from_date'] = isset($data['from_date']) ? $data['from_date'] : null;
        $this->container['to_date'] = isset($data['to_date']) ? $data['to_date'] : null;
        $this->container['routes'] = isset($data['routes']) ? $data['routes'] : null;
        $this->container['stops'] = isset($data['stops']) ? $data['stops'] : null;
        $this->container['colour'] = isset($data['colour']) ? $data['colour'] : null;
        $this->container['display_on_board'] = isset($data['display_on_board']) ? $data['display_on_board'] : null;
        $this->container['display_status'] = isset($data['display_status']) ? $data['display_status'] : null;
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
     * Gets disruption_id
     *
     * @return int
     */
    public function getDisruptionId()
    {
        return $this->container['disruption_id'];
    }

    /**
     * Sets disruption_id
     *
     * @param int $disruption_id Disruption information identifier
     *
     * @return $this
     */
    public function setDisruptionId($disruption_id)
    {
        $this->container['disruption_id'] = $disruption_id;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string $title Headline title summarising disruption information
     *
     * @return $this
     */
    public function setTitle($title)
    {
        $this->container['title'] = $title;

        return $this;
    }

    /**
     * Gets url
     *
     * @return string
     */
    public function getUrl()
    {
        return $this->container['url'];
    }

    /**
     * Sets url
     *
     * @param string $url URL of relevant article on PTV website
     *
     * @return $this
     */
    public function setUrl($url)
    {
        $this->container['url'] = $url;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string $description Description of the disruption
     *
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets disruption_status
     *
     * @return string
     */
    public function getDisruptionStatus()
    {
        return $this->container['disruption_status'];
    }

    /**
     * Sets disruption_status
     *
     * @param string $disruption_status Status of the disruption (e.g. \"Planned\", \"Current\")
     *
     * @return $this
     */
    public function setDisruptionStatus($disruption_status)
    {
        $this->container['disruption_status'] = $disruption_status;

        return $this;
    }

    /**
     * Gets disruption_type
     *
     * @return string
     */
    public function getDisruptionType()
    {
        return $this->container['disruption_type'];
    }

    /**
     * Sets disruption_type
     *
     * @param string $disruption_type Type of disruption
     *
     * @return $this
     */
    public function setDisruptionType($disruption_type)
    {
        $this->container['disruption_type'] = $disruption_type;

        return $this;
    }

    /**
     * Gets published_on
     *
     * @return \DateTime
     */
    public function getPublishedOn()
    {
        return $this->container['published_on'];
    }

    /**
     * Sets published_on
     *
     * @param \DateTime $published_on Date and time disruption information is published on PTV website, in ISO 8601 UTC format
     *
     * @return $this
     */
    public function setPublishedOn($published_on)
    {
        $this->container['published_on'] = $published_on;

        return $this;
    }

    /**
     * Gets last_updated
     *
     * @return \DateTime
     */
    public function getLastUpdated()
    {
        return $this->container['last_updated'];
    }

    /**
     * Sets last_updated
     *
     * @param \DateTime $last_updated Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
     *
     * @return $this
     */
    public function setLastUpdated($last_updated)
    {
        $this->container['last_updated'] = $last_updated;

        return $this;
    }

    /**
     * Gets from_date
     *
     * @return \DateTime
     */
    public function getFromDate()
    {
        return $this->container['from_date'];
    }

    /**
     * Sets from_date
     *
     * @param \DateTime $from_date Date and time at which disruption begins, in ISO 8601 UTC format
     *
     * @return $this
     */
    public function setFromDate($from_date)
    {
        $this->container['from_date'] = $from_date;

        return $this;
    }

    /**
     * Gets to_date
     *
     * @return \DateTime
     */
    public function getToDate()
    {
        return $this->container['to_date'];
    }

    /**
     * Sets to_date
     *
     * @param \DateTime $to_date Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
     *
     * @return $this
     */
    public function setToDate($to_date)
    {
        $this->container['to_date'] = $to_date;

        return $this;
    }

    /**
     * Gets routes
     *
     * @return \Swagger\Client\Model\V3DisruptionRoute[]
     */
    public function getRoutes()
    {
        return $this->container['routes'];
    }

    /**
     * Sets routes
     *
     * @param \Swagger\Client\Model\V3DisruptionRoute[] $routes Route relevant to a disruption (if applicable)
     *
     * @return $this
     */
    public function setRoutes($routes)
    {
        $this->container['routes'] = $routes;

        return $this;
    }

    /**
     * Gets stops
     *
     * @return \Swagger\Client\Model\V3DisruptionStop[]
     */
    public function getStops()
    {
        return $this->container['stops'];
    }

    /**
     * Sets stops
     *
     * @param \Swagger\Client\Model\V3DisruptionStop[] $stops Stop relevant to a disruption (if applicable)
     *
     * @return $this
     */
    public function setStops($stops)
    {
        $this->container['stops'] = $stops;

        return $this;
    }

    /**
     * Gets colour
     *
     * @return string
     */
    public function getColour()
    {
        return $this->container['colour'];
    }

    /**
     * Sets colour
     *
     * @param string $colour colour
     *
     * @return $this
     */
    public function setColour($colour)
    {
        $this->container['colour'] = $colour;

        return $this;
    }

    /**
     * Gets display_on_board
     *
     * @return bool
     */
    public function getDisplayOnBoard()
    {
        return $this->container['display_on_board'];
    }

    /**
     * Sets display_on_board
     *
     * @param bool $display_on_board display_on_board
     *
     * @return $this
     */
    public function setDisplayOnBoard($display_on_board)
    {
        $this->container['display_on_board'] = $display_on_board;

        return $this;
    }

    /**
     * Gets display_status
     *
     * @return bool
     */
    public function getDisplayStatus()
    {
        return $this->container['display_status'];
    }

    /**
     * Sets display_status
     *
     * @param bool $display_status display_status
     *
     * @return $this
     */
    public function setDisplayStatus($display_status)
    {
        $this->container['display_status'] = $display_status;

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
