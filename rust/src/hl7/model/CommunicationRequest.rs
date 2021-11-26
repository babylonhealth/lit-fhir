use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::UnionAttachmentOrReferenceOrString;



#[derive(Clone, Debug)]
pub struct CommunicationRequest_Payload {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) content: UnionAttachmentOrReferenceOrString,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CommunicationRequest {
  pub(crate) note: Vector<Annotation>,
  pub(crate) about: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) medium: Vector<CodeableConcept>,
  pub(crate) sender: Option<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) replaces: Vector<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) requester: Option<Reference>,
  pub(crate) recipient: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriod>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) payload: Vector<CommunicationRequest_Payload>,
}