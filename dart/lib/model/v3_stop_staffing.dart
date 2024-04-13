part of swagger.api;

class V3StopStaffing {
  /* Stop staffing hours */
  String friAmFrom = null;
/* Stop staffing hours */
  String friAmTo = null;
/* Stop staffing hours */
  String friPmFrom = null;
/* Stop staffing hours */
  String friPmTo = null;
/* Stop staffing hours */
  String monAmFrom = null;
/* Stop staffing hours */
  String monAmTo = null;
/* Stop staffing hours */
  String monPmFrom = null;
/* Stop staffing hours */
  String monPmTo = null;
/* Stop staffing hours */
  String phAdditionalText = null;
/* Stop staffing hours */
  String phFrom = null;
/* Stop staffing hours */
  String phTo = null;
/* Stop staffing hours */
  String satAmFrom = null;
/* Stop staffing hours */
  String satAmTo = null;
/* Stop staffing hours */
  String satPmFrom = null;
/* Stop staffing hours */
  String satPmTo = null;
/* Stop staffing hours */
  String sunAmFrom = null;
/* Stop staffing hours */
  String sunAmTo = null;
/* Stop staffing hours */
  String sunPmFrom = null;
/* Stop staffing hours */
  String sunPmTo = null;
/* Stop staffing hours */
  String thuAmFrom = null;
/* Stop staffing hours */
  String thuAmTo = null;
/* Stop staffing hours */
  String thuPmFrom = null;
/* Stop staffing hours */
  String thuPmTo = null;
/* Stop staffing hours */
  String tueAmFrom = null;
/* Stop staffing hours */
  String tueAmTo = null;
/* Stop staffing hours */
  String tuePmFrom = null;
/* Stop staffing hours */
  String tuePmTo = null;
/* Stop staffing hours */
  String wedAmFrom = null;
/* Stop staffing hours */
  String wedAmTo = null;
/* Stop staffing hours */
  String wedPmFrom = null;
/* Stop staffing hours */
  String wedPmTo = null;

  V3StopStaffing();

  @override
  String toString() {
    return 'V3StopStaffing[friAmFrom=$friAmFrom, friAmTo=$friAmTo, friPmFrom=$friPmFrom, friPmTo=$friPmTo, monAmFrom=$monAmFrom, monAmTo=$monAmTo, monPmFrom=$monPmFrom, monPmTo=$monPmTo, phAdditionalText=$phAdditionalText, phFrom=$phFrom, phTo=$phTo, satAmFrom=$satAmFrom, satAmTo=$satAmTo, satPmFrom=$satPmFrom, satPmTo=$satPmTo, sunAmFrom=$sunAmFrom, sunAmTo=$sunAmTo, sunPmFrom=$sunPmFrom, sunPmTo=$sunPmTo, thuAmFrom=$thuAmFrom, thuAmTo=$thuAmTo, thuPmFrom=$thuPmFrom, thuPmTo=$thuPmTo, tueAmFrom=$tueAmFrom, tueAmTo=$tueAmTo, tuePmFrom=$tuePmFrom, tuePmTo=$tuePmTo, wedAmFrom=$wedAmFrom, wedAmTo=$wedAmTo, wedPmFrom=$wedPmFrom, wedPmTo=$wedPmTo, ]';
  }

  V3StopStaffing.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    friAmFrom = json['fri_am_from'];
    friAmTo = json['fri_am_to'];
    friPmFrom = json['fri_pm_from'];
    friPmTo = json['fri_pm_to'];
    monAmFrom = json['mon_am_from'];
    monAmTo = json['mon_am_to'];
    monPmFrom = json['mon_pm_from'];
    monPmTo = json['mon_pm_to'];
    phAdditionalText = json['ph_additional_text'];
    phFrom = json['ph_from'];
    phTo = json['ph_to'];
    satAmFrom = json['sat_am_from'];
    satAmTo = json['sat_am_to'];
    satPmFrom = json['sat_pm_from'];
    satPmTo = json['sat_pm_to'];
    sunAmFrom = json['sun_am_from'];
    sunAmTo = json['sun_am_to'];
    sunPmFrom = json['sun_pm_from'];
    sunPmTo = json['sun_pm_to'];
    thuAmFrom = json['thu_am_from'];
    thuAmTo = json['thu_am_to'];
    thuPmFrom = json['thu_pm_from'];
    thuPmTo = json['thu_pm_to'];
    tueAmFrom = json['tue_am_from'];
    tueAmTo = json['tue_am_to'];
    tuePmFrom = json['tue_pm_from'];
    tuePmTo = json['tue_pm_to'];
    wedAmFrom = json['wed_am_from'];
    wedAmTo = json['wed_am_to'];
    wedPmFrom = json['wed_pm_from'];
    wedPmTo = json['wed_pm_To'];
  }

  Map<String, dynamic> toJson() {
    return {
      'fri_am_from': friAmFrom,
      'fri_am_to': friAmTo,
      'fri_pm_from': friPmFrom,
      'fri_pm_to': friPmTo,
      'mon_am_from': monAmFrom,
      'mon_am_to': monAmTo,
      'mon_pm_from': monPmFrom,
      'mon_pm_to': monPmTo,
      'ph_additional_text': phAdditionalText,
      'ph_from': phFrom,
      'ph_to': phTo,
      'sat_am_from': satAmFrom,
      'sat_am_to': satAmTo,
      'sat_pm_from': satPmFrom,
      'sat_pm_to': satPmTo,
      'sun_am_from': sunAmFrom,
      'sun_am_to': sunAmTo,
      'sun_pm_from': sunPmFrom,
      'sun_pm_to': sunPmTo,
      'thu_am_from': thuAmFrom,
      'thu_am_to': thuAmTo,
      'thu_pm_from': thuPmFrom,
      'thu_pm_to': thuPmTo,
      'tue_am_from': tueAmFrom,
      'tue_am_to': tueAmTo,
      'tue_pm_from': tuePmFrom,
      'tue_pm_to': tuePmTo,
      'wed_am_from': wedAmFrom,
      'wed_am_to': wedAmTo,
      'wed_pm_from': wedPmFrom,
      'wed_pm_To': wedPmTo
     };
  }

  static List<V3StopStaffing> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopStaffing>() : json.map((value) => new V3StopStaffing.fromJson(value)).toList();
  }

  static Map<String, V3StopStaffing> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopStaffing>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopStaffing.fromJson(value));
    }
    return map;
  }
}
