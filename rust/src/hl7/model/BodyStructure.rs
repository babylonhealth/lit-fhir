use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct BodyStructureRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) image: Vector<Box<dyn Attachment>>,
  pub(crate) active: Option<bool>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) location: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) morphology: Option<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) locationQualifier: Vector<Box<dyn CodeableConcept>>,
}

pub trait BodyStructure : DomainResource {
  fn image(&self) -> &Vector<Box<dyn Attachment>>;
  fn active(&self) -> Option<&bool>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn location(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn morphology(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn description(&self) -> Option<&String>;
  fn locationQualifier(&self) -> &Vector<Box<dyn CodeableConcept>>;
}

dyn_clone::clone_trait_object!(BodyStructure);

impl FHIRObject for BodyStructureRaw {
}

impl Resource for BodyStructureRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for BodyStructureRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl BodyStructure for BodyStructureRaw {
  fn image(&self) -> &Vector<Box<dyn Attachment>> { &self.image }
  fn active(&self) -> Option<&bool> { self.active.as_ref() }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn location(&self) -> Option<&Box<dyn CodeableConcept>> { self.location.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn morphology(&self) -> Option<&Box<dyn CodeableConcept>> { self.morphology.as_ref() }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn locationQualifier(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.locationQualifier }
}

