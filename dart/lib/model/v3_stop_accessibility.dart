part of swagger.api;

class V3StopAccessibility {
  /* Indicates if there is lighting at the stop */
  bool lighting = null;
/* Indicates the platform number for xivic information (Platform 0 indicates general stop facilities) */
  int platformNumber = null;
/* Indicates if there is at least one audio customer information at the stop/platform */
  bool audioCustomerInformation = null;
/* Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
  bool escalator = null;
/* Indicates if there is a hearing loop facility at the stop/platform */
  bool hearingLoop = null;
/* Indicates if there is an elevator at the stop/platform */
  bool lift = null;
/* Indicates if there are stairs available in the stop */
  bool stairs = null;
/* Indicates if the stop is accessible */
  bool stopAccessible = null;
/* Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop */
  bool tactileGroundSurfaceIndicator = null;
/* Indicates if there is a general waiting area at the stop */
  bool waitingRoom = null;

  V3StopAccessibilityWheelchair wheelchair = null;

  V3StopAccessibility();

  @override
  String toString() {
    return 'V3StopAccessibility[lighting=$lighting, platformNumber=$platformNumber, audioCustomerInformation=$audioCustomerInformation, escalator=$escalator, hearingLoop=$hearingLoop, lift=$lift, stairs=$stairs, stopAccessible=$stopAccessible, tactileGroundSurfaceIndicator=$tactileGroundSurfaceIndicator, waitingRoom=$waitingRoom, wheelchair=$wheelchair, ]';
  }

  V3StopAccessibility.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    lighting = json['lighting'];
    platformNumber = json['platform_number'];
    audioCustomerInformation = json['audio_customer_information'];
    escalator = json['escalator'];
    hearingLoop = json['hearing_loop'];
    lift = json['lift'];
    stairs = json['stairs'];
    stopAccessible = json['stop_accessible'];
    tactileGroundSurfaceIndicator = json['tactile_ground_surface_indicator'];
    waitingRoom = json['waiting_room'];
    wheelchair = new V3StopAccessibilityWheelchair.fromJson(json['wheelchair']);
  }

  Map<String, dynamic> toJson() {
    return {
      'lighting': lighting,
      'platform_number': platformNumber,
      'audio_customer_information': audioCustomerInformation,
      'escalator': escalator,
      'hearing_loop': hearingLoop,
      'lift': lift,
      'stairs': stairs,
      'stop_accessible': stopAccessible,
      'tactile_ground_surface_indicator': tactileGroundSurfaceIndicator,
      'waiting_room': waitingRoom,
      'wheelchair': wheelchair
     };
  }

  static List<V3StopAccessibility> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopAccessibility>() : json.map((value) => new V3StopAccessibility.fromJson(value)).toList();
  }

  static Map<String, V3StopAccessibility> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopAccessibility>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopAccessibility.fromJson(value));
    }
    return map;
  }
}
