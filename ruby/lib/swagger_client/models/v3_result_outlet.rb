=begin
#PTV Timetable API - Version 3

#The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

OpenAPI spec version: v3

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.52
=end

require 'date'

module SwaggerClient
  class V3ResultOutlet
    # Distance of outlet from input location (in metres); returns 0 if no location is input
    attr_accessor :outlet_distance

    # The SLID / SPID
    attr_accessor :outlet_slid_spid

    # The location name of the outlet
    attr_accessor :outlet_name

    # The business name of the outlet
    attr_accessor :outlet_business

    # Geographic coordinate of latitude at outlet
    attr_accessor :outlet_latitude

    # Geographic coordinate of longitude at outlet
    attr_accessor :outlet_longitude

    # The city/municipality the outlet is in
    attr_accessor :outlet_suburb

    # The postcode for the outlet
    attr_accessor :outlet_postcode

    # The business hours on Monday
    attr_accessor :outlet_business_hour_mon

    # The business hours on Tuesday
    attr_accessor :outlet_business_hour_tue

    # The business hours on Wednesday
    attr_accessor :outlet_business_hour_wed

    # The business hours on Thursday
    attr_accessor :outlet_business_hour_thur

    # The business hours on Friday
    attr_accessor :outlet_business_hour_fri

    # The business hours on Saturday
    attr_accessor :outlet_business_hour_sat

    # The business hours on Sunday
    attr_accessor :outlet_business_hour_sun

    # Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.
    attr_accessor :outlet_notes

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'outlet_distance' => :'outlet_distance',
        :'outlet_slid_spid' => :'outlet_slid_spid',
        :'outlet_name' => :'outlet_name',
        :'outlet_business' => :'outlet_business',
        :'outlet_latitude' => :'outlet_latitude',
        :'outlet_longitude' => :'outlet_longitude',
        :'outlet_suburb' => :'outlet_suburb',
        :'outlet_postcode' => :'outlet_postcode',
        :'outlet_business_hour_mon' => :'outlet_business_hour_mon',
        :'outlet_business_hour_tue' => :'outlet_business_hour_tue',
        :'outlet_business_hour_wed' => :'outlet_business_hour_wed',
        :'outlet_business_hour_thur' => :'outlet_business_hour_thur',
        :'outlet_business_hour_fri' => :'outlet_business_hour_fri',
        :'outlet_business_hour_sat' => :'outlet_business_hour_sat',
        :'outlet_business_hour_sun' => :'outlet_business_hour_sun',
        :'outlet_notes' => :'outlet_notes'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'outlet_distance' => :'Object',
        :'outlet_slid_spid' => :'Object',
        :'outlet_name' => :'Object',
        :'outlet_business' => :'Object',
        :'outlet_latitude' => :'Object',
        :'outlet_longitude' => :'Object',
        :'outlet_suburb' => :'Object',
        :'outlet_postcode' => :'Object',
        :'outlet_business_hour_mon' => :'Object',
        :'outlet_business_hour_tue' => :'Object',
        :'outlet_business_hour_wed' => :'Object',
        :'outlet_business_hour_thur' => :'Object',
        :'outlet_business_hour_fri' => :'Object',
        :'outlet_business_hour_sat' => :'Object',
        :'outlet_business_hour_sun' => :'Object',
        :'outlet_notes' => :'Object'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end
  
    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerClient::V3ResultOutlet` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerClient::V3ResultOutlet`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'outlet_distance')
        self.outlet_distance = attributes[:'outlet_distance']
      end

      if attributes.key?(:'outlet_slid_spid')
        self.outlet_slid_spid = attributes[:'outlet_slid_spid']
      end

      if attributes.key?(:'outlet_name')
        self.outlet_name = attributes[:'outlet_name']
      end

      if attributes.key?(:'outlet_business')
        self.outlet_business = attributes[:'outlet_business']
      end

      if attributes.key?(:'outlet_latitude')
        self.outlet_latitude = attributes[:'outlet_latitude']
      end

      if attributes.key?(:'outlet_longitude')
        self.outlet_longitude = attributes[:'outlet_longitude']
      end

      if attributes.key?(:'outlet_suburb')
        self.outlet_suburb = attributes[:'outlet_suburb']
      end

      if attributes.key?(:'outlet_postcode')
        self.outlet_postcode = attributes[:'outlet_postcode']
      end

      if attributes.key?(:'outlet_business_hour_mon')
        self.outlet_business_hour_mon = attributes[:'outlet_business_hour_mon']
      end

      if attributes.key?(:'outlet_business_hour_tue')
        self.outlet_business_hour_tue = attributes[:'outlet_business_hour_tue']
      end

      if attributes.key?(:'outlet_business_hour_wed')
        self.outlet_business_hour_wed = attributes[:'outlet_business_hour_wed']
      end

      if attributes.key?(:'outlet_business_hour_thur')
        self.outlet_business_hour_thur = attributes[:'outlet_business_hour_thur']
      end

      if attributes.key?(:'outlet_business_hour_fri')
        self.outlet_business_hour_fri = attributes[:'outlet_business_hour_fri']
      end

      if attributes.key?(:'outlet_business_hour_sat')
        self.outlet_business_hour_sat = attributes[:'outlet_business_hour_sat']
      end

      if attributes.key?(:'outlet_business_hour_sun')
        self.outlet_business_hour_sun = attributes[:'outlet_business_hour_sun']
      end

      if attributes.key?(:'outlet_notes')
        self.outlet_notes = attributes[:'outlet_notes']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          outlet_distance == o.outlet_distance &&
          outlet_slid_spid == o.outlet_slid_spid &&
          outlet_name == o.outlet_name &&
          outlet_business == o.outlet_business &&
          outlet_latitude == o.outlet_latitude &&
          outlet_longitude == o.outlet_longitude &&
          outlet_suburb == o.outlet_suburb &&
          outlet_postcode == o.outlet_postcode &&
          outlet_business_hour_mon == o.outlet_business_hour_mon &&
          outlet_business_hour_tue == o.outlet_business_hour_tue &&
          outlet_business_hour_wed == o.outlet_business_hour_wed &&
          outlet_business_hour_thur == o.outlet_business_hour_thur &&
          outlet_business_hour_fri == o.outlet_business_hour_fri &&
          outlet_business_hour_sat == o.outlet_business_hour_sat &&
          outlet_business_hour_sun == o.outlet_business_hour_sun &&
          outlet_notes == o.outlet_notes
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [outlet_distance, outlet_slid_spid, outlet_name, outlet_business, outlet_latitude, outlet_longitude, outlet_suburb, outlet_postcode, outlet_business_hour_mon, outlet_business_hour_tue, outlet_business_hour_wed, outlet_business_hour_thur, outlet_business_hour_fri, outlet_business_hour_sat, outlet_business_hour_sun, outlet_notes].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        elsif attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        SwaggerClient.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end  end
end
