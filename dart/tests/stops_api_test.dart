import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for StopsApi
void main() {
  var instance = new StopsApi();

  group('tests for StopsApi', () {
    // View facilities at a specific stop (Metro and V/Line stations only)
    //
    //Future<V3StopResponse> stopsStopDetails(int stopId, int routeType, { bool stopLocation, bool stopAmenities, bool stopAccessibility, bool stopContact, bool stopTicket, bool gtfs, bool stopStaffing, bool stopDisruptions, String token, String devid, String signature }) async
    test('test stopsStopDetails', () async {
      // TODO
    });

    // View all stops near a specific location
    //
    //Future<V3StopsByDistanceResponse> stopsStopsByGeolocation(double latitude, double longitude, { List<int> routeTypes, int maxResults, double maxDistance, bool stopDisruptions, String token, String devid, String signature }) async
    test('test stopsStopsByGeolocation', () async {
      // TODO
    });

    // View all stops on a specific route
    //
    //Future<V3StopsOnRouteResponse> stopsStopsForRoute(int routeId, int routeType, { int directionId, bool stopDisruptions, bool includeGeopath, DateTime geopathUtc, String token, String devid, String signature }) async
    test('test stopsStopsForRoute', () async {
      // TODO
    });

  });
}
