use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct GuidanceResponse {
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) result?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) module: String | CodeableConcept | String,
  pub(crate) encounter?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) reasonReference?: Reference,
  pub(crate) dataRequirement?: DataRequirement,
  pub(crate) outputParameters?: Reference,
  pub(crate) requestIdentifier?: Identifier,
  pub(crate) evaluationMessage?: Reference,
  pub(crate) occurrenceDateTime?: Date,
}