use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Communication_Payload {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) content: Attachment | Reference | String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Communication {
  pub(crate) sent: Option<Date>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) topic: Option<CodeableConcept>,
  pub(crate) about: Vector<Reference>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) medium: Vector<CodeableConcept>,
  pub(crate) sender: Option<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) received: Option<Date>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) recipient: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) inResponseTo: Vector<Reference>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) payload: Vector<Communication_Payload>,
}