use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct GuidanceResponse {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) result: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) module: String | CodeableConcept | String,
  pub(crate) encounter: Option<Reference>,
  pub(crate) performer: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) dataRequirement: Vector<DataRequirement>,
  pub(crate) outputParameters: Option<Reference>,
  pub(crate) requestIdentifier: Option<Identifier>,
  pub(crate) evaluationMessage: Vector<Reference>,
  pub(crate) occurrenceDateTime: Option<Date>,
}