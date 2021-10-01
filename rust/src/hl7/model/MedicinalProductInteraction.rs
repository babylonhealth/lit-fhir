use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductInteraction_Interactant {
  pub(crate) id?: String,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicinalProductInteraction {
  pub(crate) _type?: CodeableConcept,
  pub(crate) effect?: CodeableConcept,
  pub(crate) subject?: Reference,
  pub(crate) incidence?: CodeableConcept,
  pub(crate) management?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) interactant?: MedicinalProductInteraction_Interactant,
}