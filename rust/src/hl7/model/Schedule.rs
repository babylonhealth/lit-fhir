use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Schedule {
  pub(crate) actor: Reference,
  pub(crate) active?: Boolean,
  pub(crate) comment?: String,
  pub(crate) specialty?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) serviceType?: CodeableConcept,
  pub(crate) serviceCategory?: CodeableConcept,
  pub(crate) planningHorizon?: Period,
}