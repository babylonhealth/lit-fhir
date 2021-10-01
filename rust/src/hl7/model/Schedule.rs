use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Schedule {
  pub(crate) actor: Vector<Reference>,
  pub(crate) active: Option<Boolean>,
  pub(crate) comment: Option<String>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) serviceType: Vector<CodeableConcept>,
  pub(crate) serviceCategory: Vector<CodeableConcept>,
  pub(crate) planningHorizon: Option<Period>,
}