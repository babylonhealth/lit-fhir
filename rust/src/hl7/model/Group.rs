use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Group_Member {
  pub(crate) id: Option<String>,
  pub(crate) entity: Reference,
  pub(crate) period: Option<Period>,
  pub(crate) inactive: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Group_Characteristic {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) period: Option<Period>,
  pub(crate) exclude: Boolean,
  pub(crate) value: Boolean | CodeableConcept | Quantity | Range | Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Group {
  pub(crate) _type: String,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) active: Option<Boolean>,
  pub(crate) actual: Boolean,
  pub(crate) quantity: Option<u32>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) managingEntity: Option<Reference>,
  pub(crate) member: Vector<Group_Member>,
  pub(crate) characteristic: Vector<Group_Characteristic>,
}