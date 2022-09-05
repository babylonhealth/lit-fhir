use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

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
pub struct ScheduleRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) actor: Vector<Box<dyn Reference>>,
  pub(crate) active: Option<bool>,
  pub(crate) comment: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) specialty: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) serviceType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) serviceCategory: Vector<Box<dyn CodeableConcept>>,
  pub(crate) planningHorizon: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait Schedule : DomainResource {
  fn actor(&self) -> &Vector<Box<dyn Reference>>;
  fn active(&self) -> &Option<bool>;
  fn comment(&self) -> &Option<String>;
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn serviceType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn serviceCategory(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn planningHorizon(&self) -> &Option<Box<dyn Period>>;
}

dyn_clone::clone_trait_object!(Schedule);

impl FHIRObject for ScheduleRaw {
}

impl Resource for ScheduleRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ScheduleRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Schedule for ScheduleRaw {
  fn actor(&self) -> &Vector<Box<dyn Reference>> { &self.actor }
  fn active(&self) -> &Option<bool> { &self.active }
  fn comment(&self) -> &Option<String> { &self.comment }
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.specialty }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn serviceType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceType }
  fn serviceCategory(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceCategory }
  fn planningHorizon(&self) -> &Option<Box<dyn Period>> { &self.planningHorizon }
}

