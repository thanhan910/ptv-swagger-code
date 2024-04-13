part of swagger.api;

class V3StopAccessibilityWheelchair {
  
  bool accessibleRamp = null;
/* Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
  bool parking = null;
/* Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
  bool telephone = null;
/* Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
  bool toilet = null;
/* Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
  bool lowTicketCounter = null;
/* Indicates if there is a space for mobility device to board on or off a transport mode */
  bool manouvering = null;
/* Indicates if there is a raised platform to board a train */
  bool raisedPlatform = null;
/* Indicates if there are ramps (&lt;1:14) at the stop/platform */
  bool ramp = null;
/* Indicates if there is a path beyond the stop which is accessible */
  bool secondaryPath = null;
/* Indicates if there is shelter near the raised platform */
  bool raisedPlatformShelther = null;
/* Indicates if there are ramps (&gt;1:14) at the stop/platform */
  bool steepRamp = null;

  V3StopAccessibilityWheelchair();

  @override
  String toString() {
    return 'V3StopAccessibilityWheelchair[accessibleRamp=$accessibleRamp, parking=$parking, telephone=$telephone, toilet=$toilet, lowTicketCounter=$lowTicketCounter, manouvering=$manouvering, raisedPlatform=$raisedPlatform, ramp=$ramp, secondaryPath=$secondaryPath, raisedPlatformShelther=$raisedPlatformShelther, steepRamp=$steepRamp, ]';
  }

  V3StopAccessibilityWheelchair.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    accessibleRamp = json['accessible_ramp'];
    parking = json['parking'];
    telephone = json['telephone'];
    toilet = json['toilet'];
    lowTicketCounter = json['low_ticket_counter'];
    manouvering = json['manouvering'];
    raisedPlatform = json['raised_platform'];
    ramp = json['ramp'];
    secondaryPath = json['secondary_path'];
    raisedPlatformShelther = json['raised_platform_shelther'];
    steepRamp = json['steep_ramp'];
  }

  Map<String, dynamic> toJson() {
    return {
      'accessible_ramp': accessibleRamp,
      'parking': parking,
      'telephone': telephone,
      'toilet': toilet,
      'low_ticket_counter': lowTicketCounter,
      'manouvering': manouvering,
      'raised_platform': raisedPlatform,
      'ramp': ramp,
      'secondary_path': secondaryPath,
      'raised_platform_shelther': raisedPlatformShelther,
      'steep_ramp': steepRamp
     };
  }

  static List<V3StopAccessibilityWheelchair> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopAccessibilityWheelchair>() : json.map((value) => new V3StopAccessibilityWheelchair.fromJson(value)).toList();
  }

  static Map<String, V3StopAccessibilityWheelchair> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopAccessibilityWheelchair>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopAccessibilityWheelchair.fromJson(value));
    }
    return map;
  }
}
