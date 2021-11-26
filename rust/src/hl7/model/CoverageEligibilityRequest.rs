use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateOrPeriod;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Money::Money;
use crate::core::UnionCodeableConceptOrReference;



#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: Option<bool>,
  pub(crate) coverage: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Extension>,
  pub(crate) information: Box<Reference>,
  pub(crate) appliesToAll: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Item_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) diagnosis: Option<UnionCodeableConceptOrReference>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Item {
  pub(crate) id: Option<String>,
  pub(crate) detail: Vector<Reference>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) provider: Option<Box<Reference>>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) facility: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) productOrService: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) supportingInfoSequence: Vector<u32>,
  pub(crate) diagnosis: Vector<CoverageEligibilityRequest_Item_Diagnosis>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest {
  pub(crate) status: String,
  pub(crate) purpose: Vector<String>,
  pub(crate) patient: Box<Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) enterer: Option<Box<Reference>>,
  pub(crate) insurer: Box<Reference>,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) provider: Option<Box<Reference>>,
  pub(crate) facility: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) insurance: Vector<CoverageEligibilityRequest_Insurance>,
  pub(crate) supportingInfo: Vector<CoverageEligibilityRequest_SupportingInfo>,
  pub(crate) item: Vector<CoverageEligibilityRequest_Item>,
}