use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CoverageEligibilityResponse_Error {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct CoverageEligibilityResponse_Insurance_Item_Benefit {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) used?: Money | String | u32,
  pub(crate) extension?: Extension,
  pub(crate) allowed?: Money | String | u32,
  pub(crate) modifierExtension?: Extension,
}

pub struct CoverageEligibilityResponse_Insurance_Item {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) unit?: CodeableConcept,
  pub(crate) term?: CodeableConcept,
  pub(crate) network?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) provider?: Reference,
  pub(crate) excluded?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) productOrService?: CodeableConcept,
  pub(crate) authorizationUrl?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) authorizationRequired?: Boolean,
  pub(crate) authorizationSupporting?: CodeableConcept,
  pub(crate) benefit?: CoverageEligibilityResponse_Insurance_Item_Benefit,
}

pub struct CoverageEligibilityResponse_Insurance {
  pub(crate) id?: String,
  pub(crate) inforce?: Boolean,
  pub(crate) coverage: Reference,
  pub(crate) extension?: Extension,
  pub(crate) benefitPeriod?: Period,
  pub(crate) modifierExtension?: Extension,
  pub(crate) item?: CoverageEligibilityResponse_Insurance_Item,
}

pub struct CoverageEligibilityResponse {
  pub(crate) form?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) purpose: String,
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) request: Reference,
  pub(crate) outcome: String,
  pub(crate) insurer: Reference,
  pub(crate) requestor?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) preAuthRef?: String,
  pub(crate) serviced?: FHIRDate | Period,
  pub(crate) disposition?: String,
  pub(crate) error?: CoverageEligibilityResponse_Error,
  pub(crate) insurance?: CoverageEligibilityResponse_Insurance,
}