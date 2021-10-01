use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct CarePlan_Activity_Detail {
  pub(crate) id: Option<String>,
  pub(crate) kind: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) goal: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) location: Option<Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) product: Option<CodeableConcept | Reference>,
  pub(crate) dailyAmount: Option<Quantity>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) doNotPerform: Option<Boolean>,
  pub(crate) scheduled: Option<Period | String | Timing>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) instantiatesCanonical: Vector<String>,
}

#[derive(Clone, Debug)]
pub struct CarePlan_Activity {
  pub(crate) id: Option<String>,
  pub(crate) progress: Vector<Annotation>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Option<Reference>,
  pub(crate) outcomeReference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) outcomeCodeableConcept: Vector<CodeableConcept>,
  pub(crate) detail: Option<CarePlan_Activity_Detail>,
}

#[derive(Clone, Debug)]
pub struct CarePlan {
  pub(crate) goal: Vector<Reference>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) title: Option<String>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) period: Option<Period>,
  pub(crate) author: Option<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) created: Option<Date>,
  pub(crate) replaces: Vector<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) careTeam: Vector<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) addresses: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) contributor: Vector<Reference>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) activity: Vector<CarePlan_Activity>,
}