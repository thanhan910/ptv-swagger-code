import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { DeparturesService } from './api/departures.service';
import { DirectionsService } from './api/directions.service';
import { DisruptionsService } from './api/disruptions.service';
import { FareEstimateService } from './api/fareEstimate.service';
import { OutletsService } from './api/outlets.service';
import { PatternsService } from './api/patterns.service';
import { RouteTypesService } from './api/routeTypes.service';
import { RoutesService } from './api/routes.service';
import { RunsService } from './api/runs.service';
import { SearchService } from './api/search.service';
import { StopsService } from './api/stops.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    DeparturesService,
    DirectionsService,
    DisruptionsService,
    FareEstimateService,
    OutletsService,
    PatternsService,
    RouteTypesService,
    RoutesService,
    RunsService,
    SearchService,
    StopsService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders<ApiModule> {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
