use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::UnionCodeableConceptOrReference;



#[derive(Clone, Debug)]
pub struct MedicinalProductInteraction_Interactant {
  pub(crate) id: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
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