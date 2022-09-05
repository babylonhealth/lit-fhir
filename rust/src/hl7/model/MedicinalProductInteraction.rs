use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductInteraction_Interactant {
  pub(crate) id: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductInteractionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) effect: Option<Box<dyn CodeableConcept>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) incidence: Option<Box<dyn CodeableConcept>>,
  pub(crate) management: Option<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) interactant: Vector<Box<MedicinalProductInteraction_Interactant>>,
}

pub trait MedicinalProductInteraction : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn effect(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn incidence(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn management(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn description(&self) -> &Option<String>;
  fn interactant(&self) -> &Vector<Box<MedicinalProductInteraction_Interactant>>;
}

dyn_clone::clone_trait_object!(MedicinalProductInteraction);

impl FHIRObject for MedicinalProductInteractionRaw {
}

impl Resource for MedicinalProductInteractionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicinalProductInteractionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductInteraction for MedicinalProductInteractionRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn effect(&self) -> &Option<Box<dyn CodeableConcept>> { &self.effect }
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn incidence(&self) -> &Option<Box<dyn CodeableConcept>> { &self.incidence }
  fn management(&self) -> &Option<Box<dyn CodeableConcept>> { &self.management }
  fn description(&self) -> &Option<String> { &self.description }
  fn interactant(&self) -> &Vector<Box<MedicinalProductInteraction_Interactant>> { &self.interactant }
}

