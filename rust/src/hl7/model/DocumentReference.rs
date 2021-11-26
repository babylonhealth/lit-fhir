use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Coding::Coding;
use crate::core::model::Attachment::Attachment;
use crate::core::model::Period::Period;



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
  pub(crate) sourcePatientInfo: Option<Box<Reference>>,
}


#[derive(Clone, Debug)]
pub struct DocumentReference_RelatesTo {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) target: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DocumentReference {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) docStatus: Option<String>,
  pub(crate) custodian: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) authenticator: Option<Box<Reference>>,
  pub(crate) securityLabel: Vector<CodeableConcept>,
  pub(crate) masterIdentifier: Option<Identifier>,
  pub(crate) content: Vector<DocumentReference_Content>,
  pub(crate) context: Option<DocumentReference_Context>,
  pub(crate) relatesTo: Vector<DocumentReference_RelatesTo>,
}