use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: Option<Boolean>,
  pub(crate) coverage: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Extension>,
  pub(crate) information: Reference,
  pub(crate) appliesToAll: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Item_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) diagnosis: Option<CodeableConcept | Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Item {
  pub(crate) id: Option<String>,
  pub(crate) detail: Vector<Reference>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) provider: Option<Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) facility: Option<Reference>,
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
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) enterer: Option<Reference>,
  pub(crate) insurer: Reference,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) provider: Option<Reference>,
  pub(crate) facility: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) serviced: Option<FHIRDate | Period>,
  pub(crate) insurance: Vector<CoverageEligibilityRequest_Insurance>,
  pub(crate) supportingInfo: Vector<CoverageEligibilityRequest_SupportingInfo>,
  pub(crate) item: Vector<CoverageEligibilityRequest_Item>,
}