use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Signature::Signature;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct Provenance_Agent {
  pub(crate) id: Option<String>,
  pub(crate) who: Box<dyn Reference>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) role: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) onBehalfOf: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Provenance_Entity {
  pub(crate) id: Option<String>,
  pub(crate) role: String,
  pub(crate) what: Box<dyn Reference>,
  pub(crate) agent: Vector<Box<Provenance_Agent>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ProvenanceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) target: Vector<Box<dyn Reference>>,
  pub(crate) policy: Vector<String>,
  pub(crate) reason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) recorded: DateTime<FixedOffset>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) activity: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) signature: Vector<Box<dyn Signature>>,
  pub(crate) occurred: Option<UnionDateTimeOrPeriod>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) agent: Vector<Box<Provenance_Agent>>,
  pub(crate) entity: Vector<Box<Provenance_Entity>>,
}

pub trait Provenance : DomainResource {
  fn target(&self) -> &Vector<Box<dyn Reference>>;
  fn policy(&self) -> &Vector<String>;
  fn reason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn recorded(&self) -> &DateTime<FixedOffset>;
  fn location(&self) -> Option<&Box<dyn Reference>>;
  fn activity(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn signature(&self) -> &Vector<Box<dyn Signature>>;
  fn occurred(&self) -> Option<&UnionDateTimeOrPeriod>;
  fn agent(&self) -> &Vector<Box<Provenance_Agent>>;
  fn entity(&self) -> &Vector<Box<Provenance_Entity>>;
}

dyn_clone::clone_trait_object!(Provenance);

impl FHIRObject for ProvenanceRaw {
}

impl Resource for ProvenanceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ProvenanceRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Provenance for ProvenanceRaw {
  fn target(&self) -> &Vector<Box<dyn Reference>> { &self.target }
  fn policy(&self) -> &Vector<String> { &self.policy }
  fn reason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reason }
  fn recorded(&self) -> &DateTime<FixedOffset> { &self.recorded }
  fn location(&self) -> Option<&Box<dyn Reference>> { self.location.as_ref() }
  fn activity(&self) -> Option<&Box<dyn CodeableConcept>> { self.activity.as_ref() }
  fn signature(&self) -> &Vector<Box<dyn Signature>> { &self.signature }
  fn occurred(&self) -> Option<&UnionDateTimeOrPeriod> { self.occurred.as_ref() }
  fn agent(&self) -> &Vector<Box<Provenance_Agent>> { &self.agent }
  fn entity(&self) -> &Vector<Box<Provenance_Entity>> { &self.entity }
}

