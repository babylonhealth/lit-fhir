use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Medication_Batch {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) expirationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Medication_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
  pub(crate) isActive: Option<bool>,
  pub(crate) strength: Option<Ratio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Medication {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) form: Option<CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) amount: Option<Ratio>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) manufacturer: Option<Box<Reference>>,
  pub(crate) batch: Option<Medication_Batch>,
  pub(crate) ingredient: Vector<Medication_Ingredient>,
}