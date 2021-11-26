use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Reference::Reference;
use crate::core::model::Period::Period;
use crate::hl7::Union_1690912481;



#[derive(Clone, Debug)]
pub struct Group_Member {
  pub(crate) id: Option<String>,
  pub(crate) entity: Reference,
  pub(crate) period: Option<Period>,
  pub(crate) inactive: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Group_Characteristic {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) period: Option<Period>,
  pub(crate) exclude: bool,
  pub(crate) value: Union_1690912481,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Group {
  pub(crate) _type: String,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) active: Option<bool>,
  pub(crate) actual: bool,
  pub(crate) quantity: Option<u32>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) managingEntity: Option<Reference>,
  pub(crate) member: Vector<Group_Member>,
  pub(crate) characteristic: Vector<Group_Characteristic>,
}