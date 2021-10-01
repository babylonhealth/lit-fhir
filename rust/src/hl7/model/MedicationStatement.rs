use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicationStatement {
  pub(crate) note?: Annotation,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) dosage?: Dosage,
  pub(crate) basedOn?: Reference,
  pub(crate) subject: Reference,
  pub(crate) context?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) derivedFrom?: Reference,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) effective?: Date | Period,
  pub(crate) dateAsserted?: Date,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) reasonReference?: Reference,
  pub(crate) informationSource?: Reference,
}