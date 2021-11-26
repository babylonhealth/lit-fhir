use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::Union00659500323;
use crate::hl7::UnionAgeOrRangeOrString;
use crate::hl7::UnionDateOrPeriodOrString;
use crate::hl7::Union_1204024681;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct FamilyMemberHistory_Condition {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) note: Vector<Annotation>,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) onset: Option<Union_1204024681>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) contributedToDeath: Option<bool>,
}

#[derive(Clone, Debug)]
pub struct FamilyMemberHistory {
  pub(crate) sex: Option<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) name: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) age: Option<UnionAgeOrRangeOrString>,
  pub(crate) patient: Box<Reference>,
  pub(crate) born: Option<UnionDateOrPeriodOrString>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) deceased: Option<Union00659500323>,
  pub(crate) relationship: CodeableConcept,
  pub(crate) estimatedAge: Option<bool>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) dataAbsentReason: Option<CodeableConcept>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) condition: Vector<FamilyMemberHistory_Condition>,
}