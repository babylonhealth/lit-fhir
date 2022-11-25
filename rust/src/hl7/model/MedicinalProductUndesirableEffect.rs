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
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductUndesirableEffectRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) population: Vector<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) classification: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) frequencyOfOccurrence: Option<Box<dyn CodeableConcept>>,
  pub(crate) symptomConditionEffect: Option<Box<dyn CodeableConcept>>,
}

pub trait MedicinalProductUndesirableEffect : DomainResource {
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn population(&self) -> &Vector<String>;
  fn classification(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn frequencyOfOccurrence(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn symptomConditionEffect(&self) -> Option<&Box<dyn CodeableConcept>>;
}

dyn_clone::clone_trait_object!(MedicinalProductUndesirableEffect);

impl FHIRObject for MedicinalProductUndesirableEffectRaw {
}

impl Resource for MedicinalProductUndesirableEffectRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicinalProductUndesirableEffectRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductUndesirableEffect for MedicinalProductUndesirableEffectRaw {
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn population(&self) -> &Vector<String> { &self.population }
  fn classification(&self) -> Option<&Box<dyn CodeableConcept>> { self.classification.as_ref() }
  fn frequencyOfOccurrence(&self) -> Option<&Box<dyn CodeableConcept>> { self.frequencyOfOccurrence.as_ref() }
  fn symptomConditionEffect(&self) -> Option<&Box<dyn CodeableConcept>> { self.symptomConditionEffect.as_ref() }
}

