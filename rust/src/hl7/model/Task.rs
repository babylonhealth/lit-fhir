use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionAll;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Task_Input {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: UnionAll,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Task_Output {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: UnionAll,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Task_Restriction {
  pub(crate) id: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) recipient: Vector<Reference>,
  pub(crate) repetitions: Option<u32>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Task {
  pub(crate) for: Option<Box<Reference>>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) focus: Option<Box<Reference>>,
  pub(crate) owner: Option<Box<Reference>>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) priority: Option<String>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) requester: Option<Box<Reference>>,
  pub(crate) insurance: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) lastModified: Option<DateTime<FixedOffset>>,
  pub(crate) performerType: Vector<CodeableConcept>,
  pub(crate) businessStatus: Option<CodeableConcept>,
  pub(crate) instantiatesUri: Option<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) executionPeriod: Option<Period>,
  pub(crate) reasonReference: Option<Box<Reference>>,
  pub(crate) relevantHistory: Vector<Reference>,
  pub(crate) instantiatesCanonical: Option<String>,
  pub(crate) input: Vector<Task_Input>,
  pub(crate) output: Vector<Task_Output>,
  pub(crate) restriction: Option<Task_Restriction>,
}