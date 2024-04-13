package io.swagger.server.model


/**
 * @param general Subset of disruption information applicable to multiple route_types
 * @param metro_train Subset of disruption information applicable to metropolitan train
 * @param metro_tram Subset of disruption information applicable to metropolitan tram
 * @param metro_bus Subset of disruption information applicable to metropolitan bus
 * @param regional_train Subset of disruption information applicable to V/Line train
 * @param regional_coach Subset of disruption information applicable to V/Line coach
 * @param regional_bus Subset of disruption information applicable to regional bus
 * @param school_bus Subset of disruption information applicable to school bus
 * @param telebus Subset of disruption information applicable to telebus services
 * @param night_bus Subset of disruption information applicable to night bus
 * @param ferry Subset of disruption information applicable to ferry
 * @param interstate_train Subset of disruption information applicable to interstate train
 * @param skybus Subset of disruption information applicable to skybus
 * @param taxi Subset of disruption information applicable to taxi
 */
case class V3.Disruptions (
  general: Option[List[V3.Disruption]],
  metro_train: Option[List[V3.Disruption]],
  metro_tram: Option[List[V3.Disruption]],
  metro_bus: Option[List[V3.Disruption]],
  regional_train: Option[List[V3.Disruption]],
  regional_coach: Option[List[V3.Disruption]],
  regional_bus: Option[List[V3.Disruption]],
  school_bus: Option[List[V3.Disruption]],
  telebus: Option[List[V3.Disruption]],
  night_bus: Option[List[V3.Disruption]],
  ferry: Option[List[V3.Disruption]],
  interstate_train: Option[List[V3.Disruption]],
  skybus: Option[List[V3.Disruption]],
  taxi: Option[List[V3.Disruption]]
)

