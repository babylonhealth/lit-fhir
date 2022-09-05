use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct NamingSystem_UniqueId {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) value: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) preferred: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct NamingSystemRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) kind: String,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) usage: Option<String>,
  pub(crate) status: String,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) responsible: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) uniqueId: Vector<NamingSystem_UniqueId>,
}

pub trait NamingSystem : DomainResource {
  fn name(&self) -> &String;
  fn kind(&self) -> &String;
  fn date(&self) -> &DateTime<FixedOffset>;
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn usage(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn publisher(&self) -> &Option<String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn responsible(&self) -> &Option<String>;
  fn description(&self) -> &Option<String>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn uniqueId(&self) -> &Vector<NamingSystem_UniqueId>;
}

dyn_clone::clone_trait_object!(NamingSystem);

impl FHIRObject for NamingSystemRaw {
}

impl Resource for NamingSystemRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for NamingSystemRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl NamingSystem for NamingSystemRaw {
  fn name(&self) -> &String { &self.name }
  fn kind(&self) -> &String { &self.kind }
  fn date(&self) -> &DateTime<FixedOffset> { &self.date }
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn usage(&self) -> &Option<String> { &self.usage }
  fn status(&self) -> &String { &self.status }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn responsible(&self) -> &Option<String> { &self.responsible }
  fn description(&self) -> &Option<String> { &self.description }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn uniqueId(&self) -> &Vector<NamingSystem_UniqueId> { &self.uniqueId }
}

