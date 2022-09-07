use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Address::Address;
use crate::core::model::CodeableConcept::CodeableConcept;
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
pub struct Organization_Contact {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<Box<dyn HumanName>>,
  pub(crate) purpose: Option<Box<dyn CodeableConcept>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Option<Box<dyn Address>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct OrganizationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) active: Option<bool>,
  pub(crate) partOf: Option<Box<dyn Reference>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Vector<Box<dyn Address>>,
  pub(crate) language: Option<String>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) contact: Vector<Box<Organization_Contact>>,
}

pub trait Organization : DomainResource {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn name(&self) -> Option<&String>;
  fn alias(&self) -> &Vector<String>;
  fn active(&self) -> Option<&bool>;
  fn partOf(&self) -> Option<&Box<dyn Reference>>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> &Vector<Box<dyn Address>>;
  fn endpoint(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn contact(&self) -> &Vector<Box<Organization_Contact>>;
}

dyn_clone::clone_trait_object!(Organization);

impl FHIRObject for OrganizationRaw {
}

impl Resource for OrganizationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for OrganizationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Organization for OrganizationRaw {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn alias(&self) -> &Vector<String> { &self.alias }
  fn active(&self) -> Option<&bool> { self.active.as_ref() }
  fn partOf(&self) -> Option<&Box<dyn Reference>> { self.partOf.as_ref() }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn address(&self) -> &Vector<Box<dyn Address>> { &self.address }
  fn endpoint(&self) -> &Vector<Box<dyn Reference>> { &self.endpoint }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn contact(&self) -> &Vector<Box<Organization_Contact>> { &self.contact }
}

