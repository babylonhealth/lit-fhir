use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DocumentReference_Content {
  pub(crate) id?: String,
  pub(crate) format?: Coding,
  pub(crate) extension?: Extension,
  pub(crate) attachment: Attachment,
  pub(crate) modifierExtension?: Extension,
}


pub struct DocumentReference_Context {
  pub(crate) id?: String,
  pub(crate) event?: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) related?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) encounter?: Reference,
  pub(crate) facilityType?: CodeableConcept,
  pub(crate) practiceSetting?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) sourcePatientInfo?: Reference,
}


pub struct DocumentReference_RelatesTo {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) target: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct DocumentReference {
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) status: String,
  pub(crate) author?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) docStatus?: String,
  pub(crate) custodian?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) authenticator?: Reference,
  pub(crate) securityLabel?: CodeableConcept,
  pub(crate) masterIdentifier?: Identifier,
  pub(crate) content: DocumentReference_Content,
  pub(crate) context?: DocumentReference_Context,
  pub(crate) relatesTo?: DocumentReference_RelatesTo,
}