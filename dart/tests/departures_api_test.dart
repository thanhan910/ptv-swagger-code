import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for DeparturesApi
void main() {
  var instance = new DeparturesApi();

  group('tests for DeparturesApi', () {
    // View departures for all routes from a stop
    //
    //Future<V3DeparturesResponse> departuresGetForStop(int routeType, int stopId, { List<int> platformNumbers, int directionId, bool gtfs, DateTime dateUtc, int maxResults, bool includeCancelled, bool lookBackwards, List<String> expand, bool includeGeopath, String token, String devid, String signature }) async
    test('test departuresGetForStop', () async {
      // TODO
    });

    // View departures for a specific route from a stop
    //
    //Future<V3DeparturesResponse> departuresGetForStopAndRoute(int routeType, int stopId, String routeId, { int directionId, bool gtfs, DateTime dateUtc, int maxResults, bool includeCancelled, bool lookBackwards, List<String> expand, bool includeGeopath, String token, String devid, String signature }) async
    test('test departuresGetForStopAndRoute', () async {
      // TODO
    });

  });
}
