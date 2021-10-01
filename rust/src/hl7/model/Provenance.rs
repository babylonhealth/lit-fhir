use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Provenance_Agent {
  pub(crate) id: Option<String>,
  pub(crate) who: Reference,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) role: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Provenance_Entity {
  pub(crate) id: Option<String>,
  pub(crate) role: String,
  pub(crate) what: Reference,
  pub(crate) agent: Vector<Provenance_Agent>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Provenance {
  pub(crate) target: Vector<Reference>,
  pub(crate) policy: Vector<String>,
  pub(crate) reason: Vector<CodeableConcept>,
  pub(crate) recorded: Date,
  pub(crate) location: Option<Reference>,
  pub(crate) activity: Option<CodeableConcept>,
  pub(crate) signature: Vector<Signature>,
  pub(crate) occurred: Option<Date | Period>,
  pub(crate) agent: Vector<Provenance_Agent>,
  pub(crate) entity: Vector<Provenance_Entity>,
}