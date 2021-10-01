use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct HealthcareService_Eligibility {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) comment?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct HealthcareService_NotAvailable {
  pub(crate) id?: String,
  pub(crate) during?: Period,
  pub(crate) extension?: Extension,
  pub(crate) description: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct HealthcareService_AvailableTime {
  pub(crate) id?: String,
  pub(crate) allDay?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) daysOfWeek?: String,
  pub(crate) availableEndTime?: Date,
  pub(crate) modifierExtension?: Extension,
  pub(crate) availableStartTime?: Date,
}

pub struct HealthcareService {
  pub(crate) _type?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) photo?: Attachment,
  pub(crate) active?: Boolean,
  pub(crate) comment?: String,
  pub(crate) telecom?: ContactPoint,
  pub(crate) program?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) location?: Reference,
  pub(crate) endpoint?: Reference,
  pub(crate) specialty?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) providedBy?: Reference,
  pub(crate) extraDetails?: String,
  pub(crate) coverageArea?: Reference,
  pub(crate) communication?: CodeableConcept,
  pub(crate) characteristic?: CodeableConcept,
  pub(crate) referralMethod?: CodeableConcept,
  pub(crate) appointmentRequired?: Boolean,
  pub(crate) serviceProvisionCode?: CodeableConcept,
  pub(crate) availabilityExceptions?: String,
  pub(crate) eligibility?: HealthcareService_Eligibility,
  pub(crate) notAvailable?: HealthcareService_NotAvailable,
  pub(crate) availableTime?: HealthcareService_AvailableTime,
}