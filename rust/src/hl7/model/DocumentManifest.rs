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
pub struct DocumentManifest_Related {
  pub(crate) id: Option<String>,
  pub(crate) _ref: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DocumentManifestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn Reference>>,
  pub(crate) source: Option<String>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) content: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) recipient: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) masterIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) related: Vector<Box<DocumentManifest_Related>>,
}

pub trait DocumentManifest : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn Reference>>;
  fn source(&self) -> &Option<String>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn created(&self) -> &Option<DateTime<FixedOffset>>;
  fn content(&self) -> &Vector<Box<dyn Reference>>;
  fn recipient(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> &Option<String>;
  fn masterIdentifier(&self) -> &Option<Box<dyn Identifier>>;
  fn related(&self) -> &Vector<Box<DocumentManifest_Related>>;
}

dyn_clone::clone_trait_object!(DocumentManifest);

impl FHIRObject for DocumentManifestRaw {
}

impl Resource for DocumentManifestRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DocumentManifestRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DocumentManifest for DocumentManifestRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn Reference>> { &self.author }
  fn source(&self) -> &Option<String> { &self.source }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn created(&self) -> &Option<DateTime<FixedOffset>> { &self.created }
  fn content(&self) -> &Vector<Box<dyn Reference>> { &self.content }
  fn recipient(&self) -> &Vector<Box<dyn Reference>> { &self.recipient }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> &Option<String> { &self.description }
  fn masterIdentifier(&self) -> &Option<Box<dyn Identifier>> { &self.masterIdentifier }
  fn related(&self) -> &Vector<Box<DocumentManifest_Related>> { &self.related }
}

