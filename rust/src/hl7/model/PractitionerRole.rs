use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct PractitionerRole_NotAvailable {
  pub(crate) id: Option<String>,
  pub(crate) during: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct PractitionerRole_AvailableTime {
  pub(crate) id: Option<String>,
  pub(crate) allDay: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) daysOfWeek: Vector<String>,
  pub(crate) availableEndTime: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) availableStartTime: Option<Date>,
}

#[derive(Clone, Debug)]
pub struct PractitionerRole {
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) active: Option<Boolean>,
  pub(crate) period: Option<Period>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) location: Vector<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) practitioner: Option<Reference>,
  pub(crate) organization: Option<Reference>,
  pub(crate) healthcareService: Vector<Reference>,
  pub(crate) availabilityExceptions: Option<String>,
  pub(crate) notAvailable: Vector<PractitionerRole_NotAvailable>,
  pub(crate) availableTime: Vector<PractitionerRole_AvailableTime>,
}