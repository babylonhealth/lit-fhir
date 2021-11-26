use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Substance_Instance {
  pub(crate) id: Option<String>,
  pub(crate) expiry: Option<DateTime<FixedOffset>>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Substance_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Ratio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) substance: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Substance {
  pub(crate) code: CodeableConcept,
  pub(crate) status: Option<String>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) instance: Vector<Substance_Instance>,
  pub(crate) ingredient: Vector<Substance_Ingredient>,
}