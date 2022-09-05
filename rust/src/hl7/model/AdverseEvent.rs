use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct AdverseEvent_SuspectEntity_Causality {
  pub(crate) id: Option<String>,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) assessment: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) productRelatedness: Option<String>,
}

#[derive(Clone, Debug)]
pub struct AdverseEvent_SuspectEntity {
  pub(crate) id: Option<String>,
  pub(crate) instance: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) causality: Vector<Box<AdverseEvent_SuspectEntity_Causality>>,
}

#[derive(Clone, Debug)]
pub struct AdverseEventRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) event: Option<Box<dyn CodeableConcept>>,
  pub(crate) study: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) outcome: Option<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) detected: Option<DateTime<FixedOffset>>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) severity: Option<Box<dyn CodeableConcept>>,
  pub(crate) recorder: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) actuality: String,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) seriousness: Option<Box<dyn CodeableConcept>>,
  pub(crate) contributor: Vector<Box<dyn Reference>>,
  pub(crate) recordedDate: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) referenceDocument: Vector<Box<dyn Reference>>,
  pub(crate) resultingCondition: Vector<Box<dyn Reference>>,
  pub(crate) subjectMedicalHistory: Vector<Box<dyn Reference>>,
  pub(crate) suspectEntity: Vector<Box<AdverseEvent_SuspectEntity>>,
}

pub trait AdverseEvent : DomainResource {
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn event(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn study(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn outcome(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn detected(&self) -> &Option<DateTime<FixedOffset>>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn severity(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn recorder(&self) -> &Option<Box<dyn Reference>>;
  fn actuality(&self) -> &String;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn seriousness(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn contributor(&self) -> &Vector<Box<dyn Reference>>;
  fn recordedDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn referenceDocument(&self) -> &Vector<Box<dyn Reference>>;
  fn resultingCondition(&self) -> &Vector<Box<dyn Reference>>;
  fn subjectMedicalHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn suspectEntity(&self) -> &Vector<Box<AdverseEvent_SuspectEntity>>;
}

dyn_clone::clone_trait_object!(AdverseEvent);

impl FHIRObject for AdverseEventRaw {
}

impl Resource for AdverseEventRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for AdverseEventRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl AdverseEvent for AdverseEventRaw {
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn event(&self) -> &Option<Box<dyn CodeableConcept>> { &self.event }
  fn study(&self) -> &Vector<Box<dyn Reference>> { &self.study }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn outcome(&self) -> &Option<Box<dyn CodeableConcept>> { &self.outcome }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn detected(&self) -> &Option<DateTime<FixedOffset>> { &self.detected }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn severity(&self) -> &Option<Box<dyn CodeableConcept>> { &self.severity }
  fn recorder(&self) -> &Option<Box<dyn Reference>> { &self.recorder }
  fn actuality(&self) -> &String { &self.actuality }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn seriousness(&self) -> &Option<Box<dyn CodeableConcept>> { &self.seriousness }
  fn contributor(&self) -> &Vector<Box<dyn Reference>> { &self.contributor }
  fn recordedDate(&self) -> &Option<DateTime<FixedOffset>> { &self.recordedDate }
  fn referenceDocument(&self) -> &Vector<Box<dyn Reference>> { &self.referenceDocument }
  fn resultingCondition(&self) -> &Vector<Box<dyn Reference>> { &self.resultingCondition }
  fn subjectMedicalHistory(&self) -> &Vector<Box<dyn Reference>> { &self.subjectMedicalHistory }
  fn suspectEntity(&self) -> &Vector<Box<AdverseEvent_SuspectEntity>> { &self.suspectEntity }
}

