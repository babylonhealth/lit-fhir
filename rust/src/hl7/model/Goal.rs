use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionCodeableConceptOrDate;
use crate::hl7::model::UnionAliases::UnionDurationOrDate;
use crate::hl7::model::UnionAliases::Union_1061953715;



#[derive(Clone, Debug)]
pub struct Goal_Target {
  pub(crate) id: Option<String>,
  pub(crate) due: Option<UnionDurationOrDate>,
  pub(crate) measure: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) detail: Option<Box<Union_1061953715>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct GoalRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<Box<dyn CodeableConcept>>,
  pub(crate) start: Option<UnionCodeableConceptOrDate>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) addresses: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) statusDate: Option<LocalDate>,
  pub(crate) description: Box<dyn CodeableConcept>,
  pub(crate) expressedBy: Option<Box<dyn Reference>>,
  pub(crate) outcomeCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) statusReason: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lifecycleStatus: String,
  pub(crate) outcomeReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) achievementStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) target: Vector<Box<Goal_Target>>,
}

pub trait Goal : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priority(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn start(&self) -> Option<&UnionCodeableConceptOrDate>;
  fn addresses(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn statusDate(&self) -> Option<&LocalDate>;
  fn description(&self) -> &Box<dyn CodeableConcept>;
  fn expressedBy(&self) -> Option<&Box<dyn Reference>>;
  fn outcomeCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn statusReason(&self) -> Option<&String>;
  fn lifecycleStatus(&self) -> &String;
  fn outcomeReference(&self) -> &Vector<Box<dyn Reference>>;
  fn achievementStatus(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn target(&self) -> &Vector<Box<Goal_Target>>;
}

dyn_clone::clone_trait_object!(Goal);

impl FHIRObject for GoalRaw {
}

impl Resource for GoalRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for GoalRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Goal for GoalRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn priority(&self) -> Option<&Box<dyn CodeableConcept>> { self.priority.as_ref() }
  fn start(&self) -> Option<&UnionCodeableConceptOrDate> { self.start.as_ref() }
  fn addresses(&self) -> &Vector<Box<dyn Reference>> { &self.addresses }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn statusDate(&self) -> Option<&LocalDate> { self.statusDate.as_ref() }
  fn description(&self) -> &Box<dyn CodeableConcept> { &self.description }
  fn expressedBy(&self) -> Option<&Box<dyn Reference>> { self.expressedBy.as_ref() }
  fn outcomeCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.outcomeCode }
  fn statusReason(&self) -> Option<&String> { self.statusReason.as_ref() }
  fn lifecycleStatus(&self) -> &String { &self.lifecycleStatus }
  fn outcomeReference(&self) -> &Vector<Box<dyn Reference>> { &self.outcomeReference }
  fn achievementStatus(&self) -> Option<&Box<dyn CodeableConcept>> { self.achievementStatus.as_ref() }
  fn target(&self) -> &Vector<Box<Goal_Target>> { &self.target }
}

