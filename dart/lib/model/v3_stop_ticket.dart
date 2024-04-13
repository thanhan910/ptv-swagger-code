part of swagger.api;

class V3StopTicket {
  /* Indicates the ticket type for the stop (myki, paper or both) */
  String ticketType = null;
/* Description of the zone */
  String zone = null;
/* Indicates whether the stop is inside the free fare zone */
  bool isFreeFareZone = null;

  bool ticketMachine = null;

  bool ticketChecks = null;

  bool vlineReservation = null;

  List<int> ticketZones = [];

  V3StopTicket();

  @override
  String toString() {
    return 'V3StopTicket[ticketType=$ticketType, zone=$zone, isFreeFareZone=$isFreeFareZone, ticketMachine=$ticketMachine, ticketChecks=$ticketChecks, vlineReservation=$vlineReservation, ticketZones=$ticketZones, ]';
  }

  V3StopTicket.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    ticketType = json['ticket_type'];
    zone = json['zone'];
    isFreeFareZone = json['is_free_fare_zone'];
    ticketMachine = json['ticket_machine'];
    ticketChecks = json['ticket_checks'];
    vlineReservation = json['vline_reservation'];
    ticketZones = (json['ticket_zones'] as List).map((item) => item as int).toList();
  }

  Map<String, dynamic> toJson() {
    return {
      'ticket_type': ticketType,
      'zone': zone,
      'is_free_fare_zone': isFreeFareZone,
      'ticket_machine': ticketMachine,
      'ticket_checks': ticketChecks,
      'vline_reservation': vlineReservation,
      'ticket_zones': ticketZones
     };
  }

  static List<V3StopTicket> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopTicket>() : json.map((value) => new V3StopTicket.fromJson(value)).toList();
  }

  static Map<String, V3StopTicket> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopTicket>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopTicket.fromJson(value));
    }
    return map;
  }
}
