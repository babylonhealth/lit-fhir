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
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateOrPeriod;
use crate::core::model::Period::Period;
use crate::hl7::UnionMoneyOrStringOrUnsignedInt;



#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Error {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance_Item_Benefit {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) used: Option<UnionMoneyOrStringOrUnsignedInt>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) allowed: Option<UnionMoneyOrStringOrUnsignedInt>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance_Item {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) unit: Option<CodeableConcept>,
  pub(crate) term: Option<CodeableConcept>,
  pub(crate) network: Option<CodeableConcept>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) provider: Option<Box<Reference>>,
  pub(crate) excluded: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) productOrService: Option<CodeableConcept>,
  pub(crate) authorizationUrl: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) authorizationRequired: Option<bool>,
  pub(crate) authorizationSupporting: Vector<CodeableConcept>,
  pub(crate) benefit: Vector<CoverageEligibilityResponse_Insurance_Item_Benefit>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) inforce: Option<bool>,
  pub(crate) coverage: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) benefitPeriod: Option<Period>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) item: Vector<CoverageEligibilityResponse_Insurance_Item>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse {
  pub(crate) form: Option<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) purpose: Vector<String>,
  pub(crate) patient: Box<Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) request: Box<Reference>,
  pub(crate) outcome: String,
  pub(crate) insurer: Box<Reference>,
  pub(crate) requestor: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) preAuthRef: Option<String>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) disposition: Option<String>,
  pub(crate) error: Vector<CoverageEligibilityResponse_Error>,
  pub(crate) insurance: Vector<CoverageEligibilityResponse_Insurance>,
}