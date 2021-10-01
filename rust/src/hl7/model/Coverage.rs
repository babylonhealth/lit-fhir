use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Coverage_Class {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) value: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Coverage_CostToBeneficiary_Exception {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Coverage_CostToBeneficiary {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) value: Money | Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) exception?: Coverage_CostToBeneficiary_Exception,
}

pub struct Coverage {
  pub(crate) _type?: CodeableConcept,
  pub(crate) payor: Reference,
  pub(crate) order?: u32,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) network?: String,
  pub(crate) contract?: Reference,
  pub(crate) dependent?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) subscriber?: Reference,
  pub(crate) beneficiary: Reference,
  pub(crate) subrogation?: Boolean,
  pub(crate) policyHolder?: Reference,
  pub(crate) subscriberId?: String,
  pub(crate) relationship?: CodeableConcept,
  pub(crate) class?: Coverage_Class,
  pub(crate) costToBeneficiary?: Coverage_CostToBeneficiary,
}