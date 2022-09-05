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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionPositiveIntOrString;



#[derive(Clone, Debug)]
pub struct ImmunizationEvaluationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) series: Option<String>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) authority: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) doseStatus: Box<dyn CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) targetDisease: Box<dyn CodeableConcept>,
  pub(crate) doseNumber: Option<UnionPositiveIntOrString>,
  pub(crate) seriesDoses: Option<UnionPositiveIntOrString>,
  pub(crate) doseStatusReason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) immunizationEvent: Box<dyn Reference>,
}

pub trait ImmunizationEvaluation : DomainResource {
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn status(&self) -> &String;
  fn series(&self) -> &Option<String>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn authority(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn doseStatus(&self) -> &Box<dyn CodeableConcept>;
  fn description(&self) -> &Option<String>;
  fn targetDisease(&self) -> &Box<dyn CodeableConcept>;
  fn doseNumber(&self) -> &Option<UnionPositiveIntOrString>;
  fn seriesDoses(&self) -> &Option<UnionPositiveIntOrString>;
  fn doseStatusReason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn immunizationEvent(&self) -> &Box<dyn Reference>;
}

dyn_clone::clone_trait_object!(ImmunizationEvaluation);

impl FHIRObject for ImmunizationEvaluationRaw {
}

impl Resource for ImmunizationEvaluationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ImmunizationEvaluationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ImmunizationEvaluation for ImmunizationEvaluationRaw {
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn status(&self) -> &String { &self.status }
  fn series(&self) -> &Option<String> { &self.series }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn authority(&self) -> &Option<Box<dyn Reference>> { &self.authority }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn doseStatus(&self) -> &Box<dyn CodeableConcept> { &self.doseStatus }
  fn description(&self) -> &Option<String> { &self.description }
  fn targetDisease(&self) -> &Box<dyn CodeableConcept> { &self.targetDisease }
  fn doseNumber(&self) -> &Option<UnionPositiveIntOrString> { &self.doseNumber }
  fn seriesDoses(&self) -> &Option<UnionPositiveIntOrString> { &self.seriesDoses }
  fn doseStatusReason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.doseStatusReason }
  fn immunizationEvent(&self) -> &Box<dyn Reference> { &self.immunizationEvent }
}

