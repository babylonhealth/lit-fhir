use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionAttachmentOrReferenceOrString;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct CommunicationRequest_Payload {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) content: UnionAttachmentOrReferenceOrString,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CommunicationRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) about: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) medium: Vector<Box<dyn CodeableConcept>>,
  pub(crate) sender: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) replaces: Vector<Box<dyn Reference>>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) requester: Option<Box<dyn Reference>>,
  pub(crate) recipient: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriod>,
  pub(crate) groupIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) payload: Vector<Box<CommunicationRequest_Payload>>,
}

pub trait CommunicationRequest : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn about(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn medium(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn sender(&self) -> Option<&Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> Option<&Box<dyn Reference>>;
  fn replaces(&self) -> &Vector<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priority(&self) -> Option<&String>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn requester(&self) -> Option<&Box<dyn Reference>>;
  fn recipient(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn doNotPerform(&self) -> Option<&bool>;
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriod>;
  fn groupIdentifier(&self) -> Option<&Box<dyn Identifier>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn payload(&self) -> &Vector<Box<CommunicationRequest_Payload>>;
}

dyn_clone::clone_trait_object!(CommunicationRequest);

impl FHIRObject for CommunicationRequestRaw {
}

impl Resource for CommunicationRequestRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for CommunicationRequestRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CommunicationRequest for CommunicationRequestRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn about(&self) -> &Vector<Box<dyn Reference>> { &self.about }
  fn status(&self) -> &String { &self.status }
  fn medium(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.medium }
  fn sender(&self) -> Option<&Box<dyn Reference>> { self.sender.as_ref() }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> Option<&Box<dyn Reference>> { self.subject.as_ref() }
  fn replaces(&self) -> &Vector<Box<dyn Reference>> { &self.replaces }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn priority(&self) -> Option<&String> { self.priority.as_ref() }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn requester(&self) -> Option<&Box<dyn Reference>> { self.requester.as_ref() }
  fn recipient(&self) -> &Vector<Box<dyn Reference>> { &self.recipient }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>> { self.authoredOn.as_ref() }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>> { self.statusReason.as_ref() }
  fn doNotPerform(&self) -> Option<&bool> { self.doNotPerform.as_ref() }
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriod> { self.occurrence.as_ref() }
  fn groupIdentifier(&self) -> Option<&Box<dyn Identifier>> { self.groupIdentifier.as_ref() }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn payload(&self) -> &Vector<Box<CommunicationRequest_Payload>> { &self.payload }
}

