use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CoverageEligibilityRequest_Insurance {
  pub(crate) id?: String,
  pub(crate) focal?: Boolean,
  pub(crate) coverage: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) businessArrangement?: String,
}


pub struct CoverageEligibilityRequest_SupportingInfo {
  pub(crate) id?: String,
  pub(crate) sequence: u32,
  pub(crate) extension?: Extension,
  pub(crate) information: Reference,
  pub(crate) appliesToAll?: Boolean,
  pub(crate) modifierExtension?: Extension,
}


pub struct CoverageEligibilityRequest_Item_Diagnosis {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) diagnosis?: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct CoverageEligibilityRequest_Item {
  pub(crate) id?: String,
  pub(crate) detail?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) provider?: Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) facility?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) productOrService?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) supportingInfoSequence?: u32,
  pub(crate) diagnosis?: CoverageEligibilityRequest_Item_Diagnosis,
}

pub struct CoverageEligibilityRequest {
  pub(crate) status: String,
  pub(crate) purpose: String,
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) enterer?: Reference,
  pub(crate) insurer: Reference,
  pub(crate) priority?: CodeableConcept,
  pub(crate) provider?: Reference,
  pub(crate) facility?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) serviced?: FHIRDate | Period,
  pub(crate) insurance?: CoverageEligibilityRequest_Insurance,
  pub(crate) supportingInfo?: CoverageEligibilityRequest_SupportingInfo,
  pub(crate) item?: CoverageEligibilityRequest_Item,
}