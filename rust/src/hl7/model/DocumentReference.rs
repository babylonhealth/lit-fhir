use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct DocumentReference_Content {
  pub(crate) id: Option<String>,
  pub(crate) format: Option<Coding>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) attachment: Attachment,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct DocumentReference_Context {
  pub(crate) id: Option<String>,
  pub(crate) event: Vector<CodeableConcept>,
  pub(crate) period: Option<Period>,
  pub(crate) related: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) encounter: Vector<Reference>,
  pub(crate) facilityType: Option<CodeableConcept>,
  pub(crate) practiceSetting: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) sourcePatientInfo: Option<Reference>,
}


#[derive(Clone, Debug)]
pub struct DocumentReference_RelatesTo {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) target: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DocumentReference {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) status: String,
  pub(crate) author: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) docStatus: Option<String>,
  pub(crate) custodian: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) authenticator: Option<Reference>,
  pub(crate) securityLabel: Vector<CodeableConcept>,
  pub(crate) masterIdentifier: Option<Identifier>,
  pub(crate) content: Vector<DocumentReference_Content>,
  pub(crate) context: Option<DocumentReference_Context>,
  pub(crate) relatesTo: Vector<DocumentReference_RelatesTo>,
}