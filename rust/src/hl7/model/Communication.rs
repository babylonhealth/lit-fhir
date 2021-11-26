use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionAttachmentOrReferenceOrString;



#[derive(Clone, Debug)]
pub struct Communication_Payload {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) content: UnionAttachmentOrReferenceOrString,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Communication {
  pub(crate) sent: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) topic: Option<CodeableConcept>,
  pub(crate) about: Vector<Reference>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) medium: Vector<CodeableConcept>,
  pub(crate) sender: Option<Box<Reference>>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) received: Option<DateTime<FixedOffset>>,
  pub(crate) encounter: Option<Box<Reference>>,
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