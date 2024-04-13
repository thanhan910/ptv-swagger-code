'use strict';


/**
 * Estimate a fare by zone
 *
 * minZone Integer Minimum Zone travelled through ie. 1
 * maxZone Integer Maximum Zone travelled through id. 6
 * journey_touch_on_utc Date JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)
 * journey_touch_off_utc Date JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)
 * is_journey_in_free_tram_zone Boolean  (optional)
 * travelled_route_types List  (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.FareEstimateResponse
 **/
exports.fareEstimate_GetFareEstimateByZone = function(minZone,maxZone,journey_touch_on_utc,journey_touch_off_utc,is_journey_in_free_tram_zone,travelled_route_types,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "FareEstimateResultStatus" : {
    "Message" : "Message",
    "StatusCode" : 0
  },
  "FareEstimateResult" : {
    "IsEarlyBird" : true,
    "IsJourneyInFreeTramZone" : true,
    "PassengerFares" : [ {
      "PassengerType" : "PassengerType",
      "Pass70PlusDayPerDay" : 4.145608029883936,
      "Fare2HourOffPeak" : 2.3021358869347655,
      "FareDailyPeak" : 7.061401241503109,
      "WeekendCap" : 7.386281948385884,
      "Fare2HourPeak" : 5.637376656633329,
      "Pass28To69DayPerDay" : 2.027123023002322,
      "Pass7Days" : 3.616076749251911,
      "FareDailyOffPeak" : 9.301444243932576,
      "HolidayCap" : 1.2315135367772556
    }, {
      "PassengerType" : "PassengerType",
      "Pass70PlusDayPerDay" : 4.145608029883936,
      "Fare2HourOffPeak" : 2.3021358869347655,
      "FareDailyPeak" : 7.061401241503109,
      "WeekendCap" : 7.386281948385884,
      "Fare2HourPeak" : 5.637376656633329,
      "Pass28To69DayPerDay" : 2.027123023002322,
      "Pass7Days" : 3.616076749251911,
      "FareDailyOffPeak" : 9.301444243932576,
      "HolidayCap" : 1.2315135367772556
    } ],
    "IsThisWeekendJourney" : true,
    "ZoneInfo" : {
      "UniqueZones" : [ 5, 5 ],
      "MinZone" : 6,
      "MaxZone" : 1
    }
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

