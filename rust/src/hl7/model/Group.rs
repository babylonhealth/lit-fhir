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
use crate::hl7::model::UnionAliases::Union_1690912481;



#[derive(Clone, Debug)]
pub struct Group_Member {
  pub(crate) id: Option<String>,
  pub(crate) entity: Box<dyn Reference>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) inactive: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Group_Characteristic {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) exclude: bool,
  pub(crate) value: Box<Union_1690912481>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct GroupRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: String,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) active: Option<bool>,
  pub(crate) actual: bool,
  pub(crate) language: Option<String>,
  pub(crate) quantity: Option<u32>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) managingEntity: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) member: Vector<Box<Group_Member>>,
  pub(crate) characteristic: Vector<Box<Group_Characteristic>>,
}

pub trait Group : DomainResource {
  fn _type(&self) -> &String;
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn name(&self) -> &Option<String>;
  fn active(&self) -> &Option<bool>;
  fn actual(&self) -> &bool;
  fn quantity(&self) -> &Option<u32>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn managingEntity(&self) -> &Option<Box<dyn Reference>>;
  fn member(&self) -> &Vector<Box<Group_Member>>;
  fn characteristic(&self) -> &Vector<Box<Group_Characteristic>>;
}

dyn_clone::clone_trait_object!(Group);

impl FHIRObject for GroupRaw {
}

impl Resource for GroupRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for GroupRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Group for GroupRaw {
  fn _type(&self) -> &String { &self._type }
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn name(&self) -> &Option<String> { &self.name }
  fn active(&self) -> &Option<bool> { &self.active }
  fn actual(&self) -> &bool { &self.actual }
  fn quantity(&self) -> &Option<u32> { &self.quantity }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn managingEntity(&self) -> &Option<Box<dyn Reference>> { &self.managingEntity }
  fn member(&self) -> &Vector<Box<Group_Member>> { &self.member }
  fn characteristic(&self) -> &Vector<Box<Group_Characteristic>> { &self.characteristic }
}

