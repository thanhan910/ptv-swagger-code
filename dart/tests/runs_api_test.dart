import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for RunsApi
void main() {
  var instance = new RunsApi();

  group('tests for RunsApi', () {
    // View all trip/service runs for a specific route ID
    //
    //Future<V3RunsResponse> runsForRoute(int routeId, { List<String> expand, DateTime dateUtc, String token, String devid, String signature }) async
    test('test runsForRoute', () async {
      // TODO
    });

    // View all trip/service runs for a specific route ID and route type
    //
    //Future<V3RunsResponse> runsForRouteAndRouteType(int routeId, int routeType, List<String> expand, { DateTime dateUtc, String token, String devid, String signature }) async
    test('test runsForRouteAndRouteType', () async {
      // TODO
    });

    // View all trip/service runs for a specific run_ref
    //
    //Future<V3RunsResponse> runsForRun(String runRef, List<String> expand, { DateTime dateUtc, bool includeGeopath, String token, String devid, String signature }) async
    test('test runsForRun', () async {
      // TODO
    });

    // View the trip/service run for a specific run_ref and route type
    //
    //Future<V3RunResponse> runsForRunAndRouteType(String runRef, int routeType, List<String> expand, { DateTime dateUtc, bool includeGeopath, String token, String devid, String signature }) async
    test('test runsForRunAndRouteType', () async {
      // TODO
    });

  });
}
