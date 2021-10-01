use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) used: Option<Money | String | u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) allowed: Option<Money | String | u32>,
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
  pub(crate) provider: Option<Reference>,
  pub(crate) excluded: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) productOrService: Option<CodeableConcept>,
  pub(crate) authorizationUrl: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) authorizationRequired: Option<Boolean>,
  pub(crate) authorizationSupporting: Vector<CodeableConcept>,
  pub(crate) benefit: Vector<CoverageEligibilityResponse_Insurance_Item_Benefit>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) inforce: Option<Boolean>,
  pub(crate) coverage: Reference,
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
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) request: Reference,
  pub(crate) outcome: String,
  pub(crate) insurer: Reference,
  pub(crate) requestor: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) preAuthRef: Option<String>,
  pub(crate) serviced: Option<FHIRDate | Period>,
  pub(crate) disposition: Option<String>,
  pub(crate) error: Vector<CoverageEligibilityResponse_Error>,
  pub(crate) insurance: Vector<CoverageEligibilityResponse_Insurance>,
}