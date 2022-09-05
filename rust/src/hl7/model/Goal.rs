use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionCodeableConceptOrDate;
use crate::hl7::UnionDurationOrDate;
use crate::hl7::Union_1061953715;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Goal_Target {
  pub(crate) id: Option<String>,
  pub(crate) due: Option<UnionDurationOrDate>,
  pub(crate) measure: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) detail: Option<Union_1061953715>,
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
  pub(crate) statusDate: Option<FHIRDate>,
  pub(crate) description: Box<dyn CodeableConcept>,
  pub(crate) expressedBy: Option<Box<dyn Reference>>,
  pub(crate) outcomeCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) statusReason: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lifecycleStatus: String,
  pub(crate) outcomeReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) achievementStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) target: Vector<Goal_Target>,
}

pub trait Goal : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn start(&self) -> &Option<UnionCodeableConceptOrDate>;
  fn addresses(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn statusDate(&self) -> &Option<FHIRDate>;
  fn description(&self) -> &Box<dyn CodeableConcept>;
  fn expressedBy(&self) -> &Option<Box<dyn Reference>>;
  fn outcomeCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn statusReason(&self) -> &Option<String>;
  fn lifecycleStatus(&self) -> &String;
  fn outcomeReference(&self) -> &Vector<Box<dyn Reference>>;
  fn achievementStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn target(&self) -> &Vector<Goal_Target>;
}

dyn_clone::clone_trait_object!(Goal);

impl FHIRObject for GoalRaw {
}

impl Resource for GoalRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for GoalRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Goal for GoalRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>> { &self.priority }
  fn start(&self) -> &Option<UnionCodeableConceptOrDate> { &self.start }
  fn addresses(&self) -> &Vector<Box<dyn Reference>> { &self.addresses }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn statusDate(&self) -> &Option<FHIRDate> { &self.statusDate }
  fn description(&self) -> &Box<dyn CodeableConcept> { &self.description }
  fn expressedBy(&self) -> &Option<Box<dyn Reference>> { &self.expressedBy }
  fn outcomeCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.outcomeCode }
  fn statusReason(&self) -> &Option<String> { &self.statusReason }
  fn lifecycleStatus(&self) -> &String { &self.lifecycleStatus }
  fn outcomeReference(&self) -> &Vector<Box<dyn Reference>> { &self.outcomeReference }
  fn achievementStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.achievementStatus }
  fn target(&self) -> &Vector<Goal_Target> { &self.target }
}

