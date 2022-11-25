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
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct FlagRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait Flag : DomainResource {
  fn code(&self) -> &Box<dyn CodeableConcept>;
  fn status(&self) -> &String;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn author(&self) -> Option<&Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
}

dyn_clone::clone_trait_object!(Flag);

impl FHIRObject for FlagRaw {
}

impl Resource for FlagRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for FlagRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Flag for FlagRaw {
  fn code(&self) -> &Box<dyn CodeableConcept> { &self.code }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn author(&self) -> Option<&Box<dyn Reference>> { self.author.as_ref() }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
}

