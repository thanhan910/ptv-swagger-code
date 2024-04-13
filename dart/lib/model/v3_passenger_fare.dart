part of swagger.api;

class V3PassengerFare {
  
  String passengerType = null;

  double fare2HourPeak = null;

  double fare2HourOffPeak = null;

  double fareDailyPeak = null;

  double fareDailyOffPeak = null;

  double pass7Days = null;

  double pass28To69DayPerDay = null;

  double pass70PlusDayPerDay = null;

  double weekendCap = null;

  double holidayCap = null;

  V3PassengerFare();

  @override
  String toString() {
    return 'V3PassengerFare[passengerType=$passengerType, fare2HourPeak=$fare2HourPeak, fare2HourOffPeak=$fare2HourOffPeak, fareDailyPeak=$fareDailyPeak, fareDailyOffPeak=$fareDailyOffPeak, pass7Days=$pass7Days, pass28To69DayPerDay=$pass28To69DayPerDay, pass70PlusDayPerDay=$pass70PlusDayPerDay, weekendCap=$weekendCap, holidayCap=$holidayCap, ]';
  }

  V3PassengerFare.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    passengerType = json['PassengerType'];
    fare2HourPeak = json['Fare2HourPeak'];
    fare2HourOffPeak = json['Fare2HourOffPeak'];
    fareDailyPeak = json['FareDailyPeak'];
    fareDailyOffPeak = json['FareDailyOffPeak'];
    pass7Days = json['Pass7Days'];
    pass28To69DayPerDay = json['Pass28To69DayPerDay'];
    pass70PlusDayPerDay = json['Pass70PlusDayPerDay'];
    weekendCap = json['WeekendCap'];
    holidayCap = json['HolidayCap'];
  }

  Map<String, dynamic> toJson() {
    return {
      'PassengerType': passengerType,
      'Fare2HourPeak': fare2HourPeak,
      'Fare2HourOffPeak': fare2HourOffPeak,
      'FareDailyPeak': fareDailyPeak,
      'FareDailyOffPeak': fareDailyOffPeak,
      'Pass7Days': pass7Days,
      'Pass28To69DayPerDay': pass28To69DayPerDay,
      'Pass70PlusDayPerDay': pass70PlusDayPerDay,
      'WeekendCap': weekendCap,
      'HolidayCap': holidayCap
     };
  }

  static List<V3PassengerFare> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3PassengerFare>() : json.map((value) => new V3PassengerFare.fromJson(value)).toList();
  }

  static Map<String, V3PassengerFare> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3PassengerFare>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3PassengerFare.fromJson(value));
    }
    return map;
  }
}
