part of swagger.api;

class V3OutletGeolocation {
  /* Distance of outlet from input location (in metres); returns 0 if no location is input */
  double outletDistance = null;
/* The SLID / SPID */
  String outletSlidSpid = null;
/* The location name of the outlet */
  String outletName = null;
/* The business name of the outlet */
  String outletBusiness = null;
/* Geographic coordinate of latitude at outlet */
  double outletLatitude = null;
/* Geographic coordinate of longitude at outlet */
  double outletLongitude = null;
/* The city/municipality the outlet is in */
  String outletSuburb = null;
/* The postcode for the outlet */
  int outletPostcode = null;
/* The business hours on Monday */
  String outletBusinessHourMon = null;
/* The business hours on Tuesday */
  String outletBusinessHourTue = null;
/* The business hours on Wednesday */
  String outletBusinessHourWed = null;
/* The business hours on Thursday */
  String outletBusinessHourThur = null;
/* The business hours on Friday */
  String outletBusinessHourFri = null;
/* The business hours on Saturday */
  String outletBusinessHourSat = null;
/* The business hours on Sunday */
  String outletBusinessHourSun = null;
/* Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty. */
  String outletNotes = null;

  V3OutletGeolocation();

  @override
  String toString() {
    return 'V3OutletGeolocation[outletDistance=$outletDistance, outletSlidSpid=$outletSlidSpid, outletName=$outletName, outletBusiness=$outletBusiness, outletLatitude=$outletLatitude, outletLongitude=$outletLongitude, outletSuburb=$outletSuburb, outletPostcode=$outletPostcode, outletBusinessHourMon=$outletBusinessHourMon, outletBusinessHourTue=$outletBusinessHourTue, outletBusinessHourWed=$outletBusinessHourWed, outletBusinessHourThur=$outletBusinessHourThur, outletBusinessHourFri=$outletBusinessHourFri, outletBusinessHourSat=$outletBusinessHourSat, outletBusinessHourSun=$outletBusinessHourSun, outletNotes=$outletNotes, ]';
  }

  V3OutletGeolocation.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    outletDistance = json['outlet_distance'];
    outletSlidSpid = json['outlet_slid_spid'];
    outletName = json['outlet_name'];
    outletBusiness = json['outlet_business'];
    outletLatitude = json['outlet_latitude'];
    outletLongitude = json['outlet_longitude'];
    outletSuburb = json['outlet_suburb'];
    outletPostcode = json['outlet_postcode'];
    outletBusinessHourMon = json['outlet_business_hour_mon'];
    outletBusinessHourTue = json['outlet_business_hour_tue'];
    outletBusinessHourWed = json['outlet_business_hour_wed'];
    outletBusinessHourThur = json['outlet_business_hour_thur'];
    outletBusinessHourFri = json['outlet_business_hour_fri'];
    outletBusinessHourSat = json['outlet_business_hour_sat'];
    outletBusinessHourSun = json['outlet_business_hour_sun'];
    outletNotes = json['outlet_notes'];
  }

  Map<String, dynamic> toJson() {
    return {
      'outlet_distance': outletDistance,
      'outlet_slid_spid': outletSlidSpid,
      'outlet_name': outletName,
      'outlet_business': outletBusiness,
      'outlet_latitude': outletLatitude,
      'outlet_longitude': outletLongitude,
      'outlet_suburb': outletSuburb,
      'outlet_postcode': outletPostcode,
      'outlet_business_hour_mon': outletBusinessHourMon,
      'outlet_business_hour_tue': outletBusinessHourTue,
      'outlet_business_hour_wed': outletBusinessHourWed,
      'outlet_business_hour_thur': outletBusinessHourThur,
      'outlet_business_hour_fri': outletBusinessHourFri,
      'outlet_business_hour_sat': outletBusinessHourSat,
      'outlet_business_hour_sun': outletBusinessHourSun,
      'outlet_notes': outletNotes
     };
  }

  static List<V3OutletGeolocation> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3OutletGeolocation>() : json.map((value) => new V3OutletGeolocation.fromJson(value)).toList();
  }

  static Map<String, V3OutletGeolocation> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3OutletGeolocation>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3OutletGeolocation.fromJson(value));
    }
    return map;
  }
}
