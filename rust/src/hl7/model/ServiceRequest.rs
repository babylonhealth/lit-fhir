use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ServiceRequest {
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn?: Reference,
  pub(crate) subject: Reference,
  pub(crate) replaces?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: String,
  pub(crate) specimen?: Reference,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) encounter?: Reference,
  pub(crate) requester?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) insurance?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) requisition?: Identifier,
  pub(crate) orderDetail?: CodeableConcept,
  pub(crate) quantity?: Quantity | Range | Ratio,
  pub(crate) asNeeded?: Boolean | CodeableConcept,
  pub(crate) doNotPerform?: Boolean,
  pub(crate) locationCode?: CodeableConcept,
  pub(crate) occurrence?: Date | Period | Timing,
  pub(crate) performerType?: CodeableConcept,
  pub(crate) supportingInfo?: Reference,
  pub(crate) instantiatesUri?: String,
  pub(crate) reasonReference?: Reference,
  pub(crate) relevantHistory?: Reference,
  pub(crate) locationReference?: Reference,
  pub(crate) patientInstruction?: String,
  pub(crate) instantiatesCanonical?: String,
}