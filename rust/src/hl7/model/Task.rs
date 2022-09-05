use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionAll;
use crate::core::model::Annotation::Annotation;
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
pub struct Task_Input {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) value: UnionAll,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Task_Output {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) value: UnionAll,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Task_Restriction {
  pub(crate) id: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) recipient: Vector<Box<dyn Reference>>,
  pub(crate) repetitions: Option<u32>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TaskRaw {
  pub(crate) id: Option<String>,
  pub(crate) _for: Option<Box<dyn Reference>>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) focus: Option<Box<dyn Reference>>,
  pub(crate) owner: Option<Box<dyn Reference>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) priority: Option<String>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) requester: Option<Box<dyn Reference>>,
  pub(crate) insurance: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Option<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) lastModified: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) performerType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) businessStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) instantiatesUri: Option<String>,
  pub(crate) groupIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) executionPeriod: Option<Box<dyn Period>>,
  pub(crate) reasonReference: Option<Box<dyn Reference>>,
  pub(crate) relevantHistory: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Option<String>,
  pub(crate) input: Vector<Task_Input>,
  pub(crate) output: Vector<Task_Output>,
  pub(crate) restriction: Option<Task_Restriction>,
}

pub trait Task : DomainResource {
  fn _for(&self) -> &Option<Box<dyn Reference>>;
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn focus(&self) -> &Option<Box<dyn Reference>>;
  fn owner(&self) -> &Option<Box<dyn Reference>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn intent(&self) -> &String;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn priority(&self) -> &Option<String>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn requester(&self) -> &Option<Box<dyn Reference>>;
  fn insurance(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> &Option<DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn description(&self) -> &Option<String>;
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn lastModified(&self) -> &Option<DateTime<FixedOffset>>;
  fn performerType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn businessStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn instantiatesUri(&self) -> &Option<String>;
  fn groupIdentifier(&self) -> &Option<Box<dyn Identifier>>;
  fn executionPeriod(&self) -> &Option<Box<dyn Period>>;
  fn reasonReference(&self) -> &Option<Box<dyn Reference>>;
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesCanonical(&self) -> &Option<String>;
  fn input(&self) -> &Vector<Task_Input>;
  fn output(&self) -> &Vector<Task_Output>;
  fn restriction(&self) -> &Option<Task_Restriction>;
}

dyn_clone::clone_trait_object!(Task);

impl FHIRObject for TaskRaw {
}

impl Resource for TaskRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for TaskRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Task for TaskRaw {
  fn _for(&self) -> &Option<Box<dyn Reference>> { &self._for }
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn focus(&self) -> &Option<Box<dyn Reference>> { &self.focus }
  fn owner(&self) -> &Option<Box<dyn Reference>> { &self.owner }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn priority(&self) -> &Option<String> { &self.priority }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn requester(&self) -> &Option<Box<dyn Reference>> { &self.requester }
  fn insurance(&self) -> &Vector<Box<dyn Reference>> { &self.insurance }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> &Option<DateTime<FixedOffset>> { &self.authoredOn }
  fn reasonCode(&self) -> &Option<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn description(&self) -> &Option<String> { &self.description }
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.statusReason }
  fn lastModified(&self) -> &Option<DateTime<FixedOffset>> { &self.lastModified }
  fn performerType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.performerType }
  fn businessStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.businessStatus }
  fn instantiatesUri(&self) -> &Option<String> { &self.instantiatesUri }
  fn groupIdentifier(&self) -> &Option<Box<dyn Identifier>> { &self.groupIdentifier }
  fn executionPeriod(&self) -> &Option<Box<dyn Period>> { &self.executionPeriod }
  fn reasonReference(&self) -> &Option<Box<dyn Reference>> { &self.reasonReference }
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>> { &self.relevantHistory }
  fn instantiatesCanonical(&self) -> &Option<String> { &self.instantiatesCanonical }
  fn input(&self) -> &Vector<Task_Input> { &self.input }
  fn output(&self) -> &Vector<Task_Output> { &self.output }
  fn restriction(&self) -> &Option<Task_Restriction> { &self.restriction }
}

