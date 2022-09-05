use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Address::Address;
use crate::core::model::Attachment::Attachment;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Person_Link {
  pub(crate) id: Option<String>,
  pub(crate) target: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) assurance: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct PersonRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Vector<Box<dyn HumanName>>,
  pub(crate) photo: Option<Box<dyn Attachment>>,
  pub(crate) gender: Option<String>,
  pub(crate) active: Option<bool>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Vector<Box<dyn Address>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) birthDate: Option<LocalDate>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) managingOrganization: Option<Box<dyn Reference>>,
  pub(crate) link: Vector<Box<Person_Link>>,
}

pub trait Person : DomainResource {
  fn name(&self) -> &Vector<Box<dyn HumanName>>;
  fn photo(&self) -> &Option<Box<dyn Attachment>>;
  fn gender(&self) -> &Option<String>;
  fn active(&self) -> &Option<bool>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> &Vector<Box<dyn Address>>;
  fn birthDate(&self) -> &Option<LocalDate>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn managingOrganization(&self) -> &Option<Box<dyn Reference>>;
  fn link(&self) -> &Vector<Box<Person_Link>>;
}

dyn_clone::clone_trait_object!(Person);

impl FHIRObject for PersonRaw {
}

impl Resource for PersonRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for PersonRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Person for PersonRaw {
  fn name(&self) -> &Vector<Box<dyn HumanName>> { &self.name }
  fn photo(&self) -> &Option<Box<dyn Attachment>> { &self.photo }
  fn gender(&self) -> &Option<String> { &self.gender }
  fn active(&self) -> &Option<bool> { &self.active }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn address(&self) -> &Vector<Box<dyn Address>> { &self.address }
  fn birthDate(&self) -> &Option<LocalDate> { &self.birthDate }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn managingOrganization(&self) -> &Option<Box<dyn Reference>> { &self.managingOrganization }
  fn link(&self) -> &Vector<Box<Person_Link>> { &self.link }
}

