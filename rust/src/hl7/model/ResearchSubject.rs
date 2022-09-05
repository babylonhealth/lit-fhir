use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ResearchSubjectRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) study: Box<dyn Reference>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) consent: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) actualArm: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) individual: Box<dyn Reference>,
  pub(crate) assignedArm: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait ResearchSubject : DomainResource {
  fn study(&self) -> &Box<dyn Reference>;
  fn status(&self) -> &String;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn consent(&self) -> &Option<Box<dyn Reference>>;
  fn actualArm(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn individual(&self) -> &Box<dyn Reference>;
  fn assignedArm(&self) -> &Option<String>;
}

dyn_clone::clone_trait_object!(ResearchSubject);

impl FHIRObject for ResearchSubjectRaw {
}

impl Resource for ResearchSubjectRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ResearchSubjectRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ResearchSubject for ResearchSubjectRaw {
  fn study(&self) -> &Box<dyn Reference> { &self.study }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn consent(&self) -> &Option<Box<dyn Reference>> { &self.consent }
  fn actualArm(&self) -> &Option<String> { &self.actualArm }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn individual(&self) -> &Box<dyn Reference> { &self.individual }
  fn assignedArm(&self) -> &Option<String> { &self.assignedArm }
}

