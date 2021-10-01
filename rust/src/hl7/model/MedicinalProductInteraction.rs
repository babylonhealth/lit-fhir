use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductInteraction_Interactant {
  pub(crate) id: Option<String>,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductInteraction {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) effect: Option<CodeableConcept>,
  pub(crate) subject: Vector<Reference>,
  pub(crate) incidence: Option<CodeableConcept>,
  pub(crate) management: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) interactant: Vector<MedicinalProductInteraction_Interactant>,
}