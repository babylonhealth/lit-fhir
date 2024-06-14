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



#[derive(Clone, Debug)]
pub struct Communication_Payload {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) content: UnionAttachmentOrReferenceOrString,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CommunicationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) sent: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) topic: Option<Box<dyn CodeableConcept>>,
  pub(crate) about: Vector<Box<dyn Reference>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) medium: Vector<Box<dyn CodeableConcept>>,
  pub(crate) sender: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<String>,
  pub(crate) received: Option<DateTime<FixedOffset>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) recipient: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) inResponseTo: Vector<Box<dyn Reference>>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) payload: Vector<Box<Communication_Payload>>,
}

pub trait Communication : DomainResource {
  fn sent(&self) -> Option<&DateTime<FixedOffset>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn topic(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn about(&self) -> &Vector<Box<dyn Reference>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn medium(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn sender(&self) -> Option<&Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> Option<&Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priority(&self) -> Option<&String>;
  fn received(&self) -> Option<&DateTime<FixedOffset>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn recipient(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn inResponseTo(&self) -> &Vector<Box<dyn Reference>>;
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn payload(&self) -> &Vector<Box<Communication_Payload>>;
}

dyn_clone::clone_trait_object!(Communication);

impl FHIRObject for CommunicationRaw {
}

impl Resource for CommunicationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for CommunicationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Communication for CommunicationRaw {
  fn sent(&self) -> Option<&DateTime<FixedOffset>> { self.sent.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn topic(&self) -> Option<&Box<dyn CodeableConcept>> { self.topic.as_ref() }
  fn about(&self) -> &Vector<Box<dyn Reference>> { &self.about }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn medium(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.medium }
  fn sender(&self) -> Option<&Box<dyn Reference>> { self.sender.as_ref() }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> Option<&Box<dyn Reference>> { self.subject.as_ref() }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn priority(&self) -> Option<&String> { self.priority.as_ref() }
  fn received(&self) -> Option<&DateTime<FixedOffset>> { self.received.as_ref() }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn recipient(&self) -> &Vector<Box<dyn Reference>> { &self.recipient }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn inResponseTo(&self) -> &Vector<Box<dyn Reference>> { &self.inResponseTo }
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>> { self.statusReason.as_ref() }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn payload(&self) -> &Vector<Box<Communication_Payload>> { &self.payload }
}

