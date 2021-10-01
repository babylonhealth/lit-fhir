use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Goal_Target {
  pub(crate) id?: String,
  pub(crate) due?: Duration | FHIRDate,
  pub(crate) measure?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) detail?: Boolean | CodeableConcept | i32 | Quantity | Range | Ratio | String,
  pub(crate) modifierExtension?: Extension,
}

pub struct Goal {
  pub(crate) note?: Annotation,
  pub(crate) subject: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: CodeableConcept,
  pub(crate) start?: CodeableConcept | FHIRDate,
  pub(crate) addresses?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) statusDate?: FHIRDate,
  pub(crate) description: CodeableConcept,
  pub(crate) expressedBy?: Reference,
  pub(crate) outcomeCode?: CodeableConcept,
  pub(crate) statusReason?: String,
  pub(crate) lifecycleStatus: String,
  pub(crate) outcomeReference?: Reference,
  pub(crate) achievementStatus?: CodeableConcept,
  pub(crate) target?: Goal_Target,
}