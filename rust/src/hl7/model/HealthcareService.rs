use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Attachment::Attachment;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Period::Period;



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
  pub(crate) allDay: Option<bool>,
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
  pub(crate) active: Option<bool>,
  pub(crate) comment: Option<String>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) program: Vector<CodeableConcept>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) location: Vector<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) providedBy: Option<Box<Reference>>,
  pub(crate) extraDetails: Option<String>,
  pub(crate) coverageArea: Vector<Reference>,
  pub(crate) communication: Vector<CodeableConcept>,
  pub(crate) characteristic: Vector<CodeableConcept>,
  pub(crate) referralMethod: Vector<CodeableConcept>,
  pub(crate) appointmentRequired: Option<bool>,
  pub(crate) serviceProvisionCode: Vector<CodeableConcept>,
  pub(crate) availabilityExceptions: Option<String>,
  pub(crate) eligibility: Vector<HealthcareService_Eligibility>,
  pub(crate) notAvailable: Vector<HealthcareService_NotAvailable>,
  pub(crate) availableTime: Vector<HealthcareService_AvailableTime>,
}