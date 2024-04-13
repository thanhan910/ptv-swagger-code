part of swagger.api;

class V3StopAmenityDetails {
  /* Indicates if there is a public toilet at or near the stop */
  bool toilet = null;
/* Indicates if there is a taxi rank at or near the stop */
  bool taxiRank = null;
/* The number of free car parking spots at the stop */
  String carParking = null;
/* Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop */
  bool cctv = null;

  V3StopAmenityDetails();

  @override
  String toString() {
    return 'V3StopAmenityDetails[toilet=$toilet, taxiRank=$taxiRank, carParking=$carParking, cctv=$cctv, ]';
  }

  V3StopAmenityDetails.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    toilet = json['toilet'];
    taxiRank = json['taxi_rank'];
    carParking = json['car_parking'];
    cctv = json['cctv'];
  }

  Map<String, dynamic> toJson() {
    return {
      'toilet': toilet,
      'taxi_rank': taxiRank,
      'car_parking': carParking,
      'cctv': cctv
     };
  }

  static List<V3StopAmenityDetails> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopAmenityDetails>() : json.map((value) => new V3StopAmenityDetails.fromJson(value)).toList();
  }

  static Map<String, V3StopAmenityDetails> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopAmenityDetails>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopAmenityDetails.fromJson(value));
    }
    return map;
  }
}
