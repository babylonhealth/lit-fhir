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
pub struct Account_Coverage {
  pub(crate) id: Option<String>,
  pub(crate) coverage: Box<dyn Reference>,
  pub(crate) priority: Option<u32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Account_Guarantor {
  pub(crate) id: Option<String>,
  pub(crate) party: Box<dyn Reference>,
  pub(crate) onHold: Option<bool>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct AccountRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) owner: Option<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) partOf: Option<Box<dyn Reference>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) servicePeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) coverage: Vector<Box<Account_Coverage>>,
  pub(crate) guarantor: Vector<Box<Account_Guarantor>>,
}

pub trait Account : DomainResource {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn name(&self) -> Option<&String>;
  fn owner(&self) -> Option<&Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn partOf(&self) -> Option<&Box<dyn Reference>>;
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> Option<&String>;
  fn servicePeriod(&self) -> Option<&Box<dyn Period>>;
  fn coverage(&self) -> &Vector<Box<Account_Coverage>>;
  fn guarantor(&self) -> &Vector<Box<Account_Guarantor>>;
}

dyn_clone::clone_trait_object!(Account);

impl FHIRObject for AccountRaw {
}

impl Resource for AccountRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for AccountRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Account for AccountRaw {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>> { self._type.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn owner(&self) -> Option<&Box<dyn Reference>> { self.owner.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn partOf(&self) -> Option<&Box<dyn Reference>> { self.partOf.as_ref() }
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn servicePeriod(&self) -> Option<&Box<dyn Period>> { self.servicePeriod.as_ref() }
  fn coverage(&self) -> &Vector<Box<Account_Coverage>> { &self.coverage }
  fn guarantor(&self) -> &Vector<Box<Account_Guarantor>> { &self.guarantor }
}

