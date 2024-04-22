<?php
/**
 * V3SiriDownstreamSubscription
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
 * V3SiriDownstreamSubscription Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3SiriDownstreamSubscription implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.SiriDownstreamSubscription';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'subscriber_ref' => 'string',
        'subscription_ref' => 'string',
        'message_type' => 'int',
        'siri_format' => 'int',
        'siri_version' => 'string',
        'consumer_address' => 'string',
        'initial_termination_time' => '\DateTime',
        'validity_period_start' => '\DateTime',
        'validity_period_end' => '\DateTime',
        'preview_interval' => 'string',
        'topics' => '\OpenAPI\Client\Model\V3SiriDownstreamSubscriptionTopic[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'subscriber_ref' => null,
        'subscription_ref' => null,
        'message_type' => 'int32',
        'siri_format' => 'int32',
        'siri_version' => null,
        'consumer_address' => null,
        'initial_termination_time' => 'date-time',
        'validity_period_start' => 'date-time',
        'validity_period_end' => 'date-time',
        'preview_interval' => null,
        'topics' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'subscriber_ref' => false,
        'subscription_ref' => false,
        'message_type' => false,
        'siri_format' => false,
        'siri_version' => false,
        'consumer_address' => false,
        'initial_termination_time' => false,
        'validity_period_start' => false,
        'validity_period_end' => false,
        'preview_interval' => false,
        'topics' => false
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
        'subscriber_ref' => 'subscriber_ref',
        'subscription_ref' => 'subscription_ref',
        'message_type' => 'message_type',
        'siri_format' => 'siri_format',
        'siri_version' => 'siri_version',
        'consumer_address' => 'consumer_address',
        'initial_termination_time' => 'initial_termination_time',
        'validity_period_start' => 'validity_period_start',
        'validity_period_end' => 'validity_period_end',
        'preview_interval' => 'preview_interval',
        'topics' => 'topics'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'subscriber_ref' => 'setSubscriberRef',
        'subscription_ref' => 'setSubscriptionRef',
        'message_type' => 'setMessageType',
        'siri_format' => 'setSiriFormat',
        'siri_version' => 'setSiriVersion',
        'consumer_address' => 'setConsumerAddress',
        'initial_termination_time' => 'setInitialTerminationTime',
        'validity_period_start' => 'setValidityPeriodStart',
        'validity_period_end' => 'setValidityPeriodEnd',
        'preview_interval' => 'setPreviewInterval',
        'topics' => 'setTopics'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'subscriber_ref' => 'getSubscriberRef',
        'subscription_ref' => 'getSubscriptionRef',
        'message_type' => 'getMessageType',
        'siri_format' => 'getSiriFormat',
        'siri_version' => 'getSiriVersion',
        'consumer_address' => 'getConsumerAddress',
        'initial_termination_time' => 'getInitialTerminationTime',
        'validity_period_start' => 'getValidityPeriodStart',
        'validity_period_end' => 'getValidityPeriodEnd',
        'preview_interval' => 'getPreviewInterval',
        'topics' => 'getTopics'
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

    public const MESSAGE_TYPE_0 = 0;
    public const MESSAGE_TYPE_1 = 1;
    public const SIRI_FORMAT_0 = 0;
    public const SIRI_FORMAT_1 = 1;

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getMessageTypeAllowableValues()
    {
        return [
            self::MESSAGE_TYPE_0,
            self::MESSAGE_TYPE_1,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getSiriFormatAllowableValues()
    {
        return [
            self::SIRI_FORMAT_0,
            self::SIRI_FORMAT_1,
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
        $this->setIfExists('subscriber_ref', $data ?? [], null);
        $this->setIfExists('subscription_ref', $data ?? [], null);
        $this->setIfExists('message_type', $data ?? [], null);
        $this->setIfExists('siri_format', $data ?? [], null);
        $this->setIfExists('siri_version', $data ?? [], null);
        $this->setIfExists('consumer_address', $data ?? [], null);
        $this->setIfExists('initial_termination_time', $data ?? [], null);
        $this->setIfExists('validity_period_start', $data ?? [], null);
        $this->setIfExists('validity_period_end', $data ?? [], null);
        $this->setIfExists('preview_interval', $data ?? [], null);
        $this->setIfExists('topics', $data ?? [], null);
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

        $allowedValues = $this->getMessageTypeAllowableValues();
        if (!is_null($this->container['message_type']) && !in_array($this->container['message_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'message_type', must be one of '%s'",
                $this->container['message_type'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getSiriFormatAllowableValues();
        if (!is_null($this->container['siri_format']) && !in_array($this->container['siri_format'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'siri_format', must be one of '%s'",
                $this->container['siri_format'],
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['siri_version']) && !preg_match("/1.3|2.0/", $this->container['siri_version'])) {
            $invalidProperties[] = "invalid value for 'siri_version', must be conform to the pattern /1.3|2.0/.";
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
     * Gets subscriber_ref
     *
     * @return string|null
     */
    public function getSubscriberRef()
    {
        return $this->container['subscriber_ref'];
    }

    /**
     * Sets subscriber_ref
     *
     * @param string|null $subscriber_ref subscriber_ref
     *
     * @return self
     */
    public function setSubscriberRef($subscriber_ref)
    {
        if (is_null($subscriber_ref)) {
            throw new \InvalidArgumentException('non-nullable subscriber_ref cannot be null');
        }
        $this->container['subscriber_ref'] = $subscriber_ref;

        return $this;
    }

    /**
     * Gets subscription_ref
     *
     * @return string|null
     */
    public function getSubscriptionRef()
    {
        return $this->container['subscription_ref'];
    }

    /**
     * Sets subscription_ref
     *
     * @param string|null $subscription_ref subscription_ref
     *
     * @return self
     */
    public function setSubscriptionRef($subscription_ref)
    {
        if (is_null($subscription_ref)) {
            throw new \InvalidArgumentException('non-nullable subscription_ref cannot be null');
        }
        $this->container['subscription_ref'] = $subscription_ref;

        return $this;
    }

    /**
     * Gets message_type
     *
     * @return int|null
     */
    public function getMessageType()
    {
        return $this->container['message_type'];
    }

    /**
     * Sets message_type
     *
     * @param int|null $message_type message_type
     *
     * @return self
     */
    public function setMessageType($message_type)
    {
        if (is_null($message_type)) {
            throw new \InvalidArgumentException('non-nullable message_type cannot be null');
        }
        $allowedValues = $this->getMessageTypeAllowableValues();
        if (!in_array($message_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'message_type', must be one of '%s'",
                    $message_type,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['message_type'] = $message_type;

        return $this;
    }

    /**
     * Gets siri_format
     *
     * @return int|null
     */
    public function getSiriFormat()
    {
        return $this->container['siri_format'];
    }

    /**
     * Sets siri_format
     *
     * @param int|null $siri_format siri_format
     *
     * @return self
     */
    public function setSiriFormat($siri_format)
    {
        if (is_null($siri_format)) {
            throw new \InvalidArgumentException('non-nullable siri_format cannot be null');
        }
        $allowedValues = $this->getSiriFormatAllowableValues();
        if (!in_array($siri_format, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'siri_format', must be one of '%s'",
                    $siri_format,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['siri_format'] = $siri_format;

        return $this;
    }

    /**
     * Gets siri_version
     *
     * @return string|null
     */
    public function getSiriVersion()
    {
        return $this->container['siri_version'];
    }

    /**
     * Sets siri_version
     *
     * @param string|null $siri_version siri_version
     *
     * @return self
     */
    public function setSiriVersion($siri_version)
    {
        if (is_null($siri_version)) {
            throw new \InvalidArgumentException('non-nullable siri_version cannot be null');
        }

        if ((!preg_match("/1.3|2.0/", ObjectSerializer::toString($siri_version)))) {
            throw new \InvalidArgumentException("invalid value for \$siri_version when calling V3SiriDownstreamSubscription., must conform to the pattern /1.3|2.0/.");
        }

        $this->container['siri_version'] = $siri_version;

        return $this;
    }

    /**
     * Gets consumer_address
     *
     * @return string|null
     */
    public function getConsumerAddress()
    {
        return $this->container['consumer_address'];
    }

    /**
     * Sets consumer_address
     *
     * @param string|null $consumer_address consumer_address
     *
     * @return self
     */
    public function setConsumerAddress($consumer_address)
    {
        if (is_null($consumer_address)) {
            throw new \InvalidArgumentException('non-nullable consumer_address cannot be null');
        }
        $this->container['consumer_address'] = $consumer_address;

        return $this;
    }

    /**
     * Gets initial_termination_time
     *
     * @return \DateTime|null
     */
    public function getInitialTerminationTime()
    {
        return $this->container['initial_termination_time'];
    }

    /**
     * Sets initial_termination_time
     *
     * @param \DateTime|null $initial_termination_time initial_termination_time
     *
     * @return self
     */
    public function setInitialTerminationTime($initial_termination_time)
    {
        if (is_null($initial_termination_time)) {
            throw new \InvalidArgumentException('non-nullable initial_termination_time cannot be null');
        }
        $this->container['initial_termination_time'] = $initial_termination_time;

        return $this;
    }

    /**
     * Gets validity_period_start
     *
     * @return \DateTime|null
     */
    public function getValidityPeriodStart()
    {
        return $this->container['validity_period_start'];
    }

    /**
     * Sets validity_period_start
     *
     * @param \DateTime|null $validity_period_start validity_period_start
     *
     * @return self
     */
    public function setValidityPeriodStart($validity_period_start)
    {
        if (is_null($validity_period_start)) {
            throw new \InvalidArgumentException('non-nullable validity_period_start cannot be null');
        }
        $this->container['validity_period_start'] = $validity_period_start;

        return $this;
    }

    /**
     * Gets validity_period_end
     *
     * @return \DateTime|null
     */
    public function getValidityPeriodEnd()
    {
        return $this->container['validity_period_end'];
    }

    /**
     * Sets validity_period_end
     *
     * @param \DateTime|null $validity_period_end validity_period_end
     *
     * @return self
     */
    public function setValidityPeriodEnd($validity_period_end)
    {
        if (is_null($validity_period_end)) {
            throw new \InvalidArgumentException('non-nullable validity_period_end cannot be null');
        }
        $this->container['validity_period_end'] = $validity_period_end;

        return $this;
    }

    /**
     * Gets preview_interval
     *
     * @return string|null
     */
    public function getPreviewInterval()
    {
        return $this->container['preview_interval'];
    }

    /**
     * Sets preview_interval
     *
     * @param string|null $preview_interval preview_interval
     *
     * @return self
     */
    public function setPreviewInterval($preview_interval)
    {
        if (is_null($preview_interval)) {
            throw new \InvalidArgumentException('non-nullable preview_interval cannot be null');
        }
        $this->container['preview_interval'] = $preview_interval;

        return $this;
    }

    /**
     * Gets topics
     *
     * @return \OpenAPI\Client\Model\V3SiriDownstreamSubscriptionTopic[]|null
     */
    public function getTopics()
    {
        return $this->container['topics'];
    }

    /**
     * Sets topics
     *
     * @param \OpenAPI\Client\Model\V3SiriDownstreamSubscriptionTopic[]|null $topics topics
     *
     * @return self
     */
    public function setTopics($topics)
    {
        if (is_null($topics)) {
            throw new \InvalidArgumentException('non-nullable topics cannot be null');
        }
        $this->container['topics'] = $topics;

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


