use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Goal_Target {
  pub(crate) id: Option<String>,
  pub(crate) due: Option<Duration | FHIRDate>,
  pub(crate) measure: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) detail: Option<Boolean | CodeableConcept | i32 | Quantity | Range | Ratio | String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Goal {
  pub(crate) note: Vector<Annotation>,
  pub(crate) subject: Reference,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) start: Option<CodeableConcept | FHIRDate>,
  pub(crate) addresses: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) statusDate: Option<FHIRDate>,
  pub(crate) description: CodeableConcept,
  pub(crate) expressedBy: Option<Reference>,
  pub(crate) outcomeCode: Vector<CodeableConcept>,
  pub(crate) statusReason: Option<String>,
  pub(crate) lifecycleStatus: String,
  pub(crate) outcomeReference: Vector<Reference>,
  pub(crate) achievementStatus: Option<CodeableConcept>,
  pub(crate) target: Vector<Goal_Target>,
}