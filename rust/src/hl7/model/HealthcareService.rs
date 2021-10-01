use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct HealthcareService_Eligibility {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct HealthcareService_NotAvailable {
  pub(crate) id: Option<String>,
  pub(crate) during: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct HealthcareService_AvailableTime {
  pub(crate) id: Option<String>,
  pub(crate) allDay: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) daysOfWeek: Vector<String>,
  pub(crate) availableEndTime: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) availableStartTime: Option<Date>,
}

#[derive(Clone, Debug)]
pub struct HealthcareService {
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) photo: Option<Attachment>,
  pub(crate) active: Option<Boolean>,
  pub(crate) comment: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) program: Vector<CodeableConcept>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) location: Vector<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) providedBy: Option<Reference>,
  pub(crate) extraDetails: Option<String>,
  pub(crate) coverageArea: Vector<Reference>,
  pub(crate) communication: Vector<CodeableConcept>,
  pub(crate) characteristic: Vector<CodeableConcept>,
  pub(crate) referralMethod: Vector<CodeableConcept>,
  pub(crate) appointmentRequired: Option<Boolean>,
  pub(crate) serviceProvisionCode: Vector<CodeableConcept>,
  pub(crate) availabilityExceptions: Option<String>,
  pub(crate) eligibility: Vector<HealthcareService_Eligibility>,
  pub(crate) notAvailable: Vector<HealthcareService_NotAvailable>,
  pub(crate) availableTime: Vector<HealthcareService_AvailableTime>,
}