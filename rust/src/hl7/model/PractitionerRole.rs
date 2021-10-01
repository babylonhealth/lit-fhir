use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct PractitionerRole_NotAvailable {
  pub(crate) id?: String,
  pub(crate) during?: Period,
  pub(crate) extension?: Extension,
  pub(crate) description: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct PractitionerRole_AvailableTime {
  pub(crate) id?: String,
  pub(crate) allDay?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) daysOfWeek?: String,
  pub(crate) availableEndTime?: Date,
  pub(crate) modifierExtension?: Extension,
  pub(crate) availableStartTime?: Date,
}

pub struct PractitionerRole {
  pub(crate) code?: CodeableConcept,
  pub(crate) active?: Boolean,
  pub(crate) period?: Period,
  pub(crate) telecom?: ContactPoint,
  pub(crate) location?: Reference,
  pub(crate) endpoint?: Reference,
  pub(crate) specialty?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) practitioner?: Reference,
  pub(crate) organization?: Reference,
  pub(crate) healthcareService?: Reference,
  pub(crate) availabilityExceptions?: String,
  pub(crate) notAvailable?: PractitionerRole_NotAvailable,
  pub(crate) availableTime?: PractitionerRole_AvailableTime,
}