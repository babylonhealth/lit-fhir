use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Location_Position {
  pub(crate) id?: String,
  pub(crate) latitude: BigDecimal,
  pub(crate) altitude?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) longitude: BigDecimal,
  pub(crate) modifierExtension?: Extension,
}


pub struct Location_HoursOfOperation {
  pub(crate) id?: String,
  pub(crate) allDay?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) daysOfWeek?: String,
  pub(crate) openingTime?: Date,
  pub(crate) closingTime?: Date,
  pub(crate) modifierExtension?: Extension,
}

pub struct Location {
  pub(crate) name?: String,
  pub(crate) mode?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) alias?: String,
  pub(crate) status?: String,
  pub(crate) partOf?: Reference,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) endpoint?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) physicalType?: CodeableConcept,
  pub(crate) operationalStatus?: Coding,
  pub(crate) managingOrganization?: Reference,
  pub(crate) availabilityExceptions?: String,
  pub(crate) position?: Location_Position,
  pub(crate) hoursOfOperation?: Location_HoursOfOperation,
}