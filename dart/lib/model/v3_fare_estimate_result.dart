part of swagger.api;

class V3FareEstimateResult {
  
  bool isEarlyBird = null;

  bool isJourneyInFreeTramZone = null;

  bool isThisWeekendJourney = null;

  V3ZoneInfo zoneInfo = null;

  List<V3PassengerFare> passengerFares = [];

  V3FareEstimateResult();

  @override
  String toString() {
    return 'V3FareEstimateResult[isEarlyBird=$isEarlyBird, isJourneyInFreeTramZone=$isJourneyInFreeTramZone, isThisWeekendJourney=$isThisWeekendJourney, zoneInfo=$zoneInfo, passengerFares=$passengerFares, ]';
  }

  V3FareEstimateResult.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    isEarlyBird = json['IsEarlyBird'];
    isJourneyInFreeTramZone = json['IsJourneyInFreeTramZone'];
    isThisWeekendJourney = json['IsThisWeekendJourney'];
    zoneInfo = new V3ZoneInfo.fromJson(json['ZoneInfo']);
    passengerFares = V3PassengerFare.listFromJson(json['PassengerFares']);
  }

  Map<String, dynamic> toJson() {
    return {
      'IsEarlyBird': isEarlyBird,
      'IsJourneyInFreeTramZone': isJourneyInFreeTramZone,
      'IsThisWeekendJourney': isThisWeekendJourney,
      'ZoneInfo': zoneInfo,
      'PassengerFares': passengerFares
     };
  }

  static List<V3FareEstimateResult> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3FareEstimateResult>() : json.map((value) => new V3FareEstimateResult.fromJson(value)).toList();
  }

  static Map<String, V3FareEstimateResult> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3FareEstimateResult>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3FareEstimateResult.fromJson(value));
    }
    return map;
  }
}
