use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicationStatement {
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) dosage: Vector<Dosage>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) context: Option<Reference>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) derivedFrom: Vector<Reference>,
  pub(crate) statusReason: Vector<CodeableConcept>,
  pub(crate) effective: Option<Date | Period>,
  pub(crate) dateAsserted: Option<Date>,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) informationSource: Option<Reference>,
}