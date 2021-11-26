use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Period::Period;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionMoneyOrQuantity;



#[derive(Clone, Debug)]
pub struct Coverage_Class {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) name: Option<String>,
  pub(crate) value: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Coverage_CostToBeneficiary_Exception {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Coverage_CostToBeneficiary {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) value: UnionMoneyOrQuantity,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) exception: Vector<Coverage_CostToBeneficiary_Exception>,
}

#[derive(Clone, Debug)]
pub struct Coverage {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) payor: Vector<Reference>,
  pub(crate) order: Option<u32>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) network: Option<String>,
  pub(crate) contract: Vector<Reference>,
  pub(crate) dependent: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) subscriber: Option<Box<Reference>>,
  pub(crate) beneficiary: Box<Reference>,
  pub(crate) subrogation: Option<bool>,
  pub(crate) policyHolder: Option<Box<Reference>>,
  pub(crate) subscriberId: Option<String>,
  pub(crate) relationship: Option<CodeableConcept>,
  pub(crate) class: Vector<Coverage_Class>,
  pub(crate) costToBeneficiary: Vector<Coverage_CostToBeneficiary>,
}