part of swagger.api;

class V3Disruptions {
  /* Subset of disruption information applicable to multiple route_types */
  List<V3Disruption> general = [];
/* Subset of disruption information applicable to metropolitan train */
  List<V3Disruption> metroTrain = [];
/* Subset of disruption information applicable to metropolitan tram */
  List<V3Disruption> metroTram = [];
/* Subset of disruption information applicable to metropolitan bus */
  List<V3Disruption> metroBus = [];
/* Subset of disruption information applicable to V/Line train */
  List<V3Disruption> regionalTrain = [];
/* Subset of disruption information applicable to V/Line coach */
  List<V3Disruption> regionalCoach = [];
/* Subset of disruption information applicable to regional bus */
  List<V3Disruption> regionalBus = [];
/* Subset of disruption information applicable to school bus */
  List<V3Disruption> schoolBus = [];
/* Subset of disruption information applicable to telebus services */
  List<V3Disruption> telebus = [];
/* Subset of disruption information applicable to night bus */
  List<V3Disruption> nightBus = [];
/* Subset of disruption information applicable to ferry */
  List<V3Disruption> ferry = [];
/* Subset of disruption information applicable to interstate train */
  List<V3Disruption> interstateTrain = [];
/* Subset of disruption information applicable to skybus */
  List<V3Disruption> skybus = [];
/* Subset of disruption information applicable to taxi */
  List<V3Disruption> taxi = [];

  V3Disruptions();

  @override
  String toString() {
    return 'V3Disruptions[general=$general, metroTrain=$metroTrain, metroTram=$metroTram, metroBus=$metroBus, regionalTrain=$regionalTrain, regionalCoach=$regionalCoach, regionalBus=$regionalBus, schoolBus=$schoolBus, telebus=$telebus, nightBus=$nightBus, ferry=$ferry, interstateTrain=$interstateTrain, skybus=$skybus, taxi=$taxi, ]';
  }

  V3Disruptions.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    general = V3Disruption.listFromJson(json['general']);
    metroTrain = V3Disruption.listFromJson(json['metro_train']);
    metroTram = V3Disruption.listFromJson(json['metro_tram']);
    metroBus = V3Disruption.listFromJson(json['metro_bus']);
    regionalTrain = V3Disruption.listFromJson(json['regional_train']);
    regionalCoach = V3Disruption.listFromJson(json['regional_coach']);
    regionalBus = V3Disruption.listFromJson(json['regional_bus']);
    schoolBus = V3Disruption.listFromJson(json['school_bus']);
    telebus = V3Disruption.listFromJson(json['telebus']);
    nightBus = V3Disruption.listFromJson(json['night_bus']);
    ferry = V3Disruption.listFromJson(json['ferry']);
    interstateTrain = V3Disruption.listFromJson(json['interstate_train']);
    skybus = V3Disruption.listFromJson(json['skybus']);
    taxi = V3Disruption.listFromJson(json['taxi']);
  }

  Map<String, dynamic> toJson() {
    return {
      'general': general,
      'metro_train': metroTrain,
      'metro_tram': metroTram,
      'metro_bus': metroBus,
      'regional_train': regionalTrain,
      'regional_coach': regionalCoach,
      'regional_bus': regionalBus,
      'school_bus': schoolBus,
      'telebus': telebus,
      'night_bus': nightBus,
      'ferry': ferry,
      'interstate_train': interstateTrain,
      'skybus': skybus,
      'taxi': taxi
     };
  }

  static List<V3Disruptions> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Disruptions>() : json.map((value) => new V3Disruptions.fromJson(value)).toList();
  }

  static Map<String, V3Disruptions> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Disruptions>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Disruptions.fromJson(value));
    }
    return map;
  }
}
