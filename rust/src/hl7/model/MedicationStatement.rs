use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::Dosage::Dosage;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::core::UnionCodeableConceptOrReference;



#[derive(Clone, Debug)]
pub struct MedicationStatement {
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) dosage: Vector<Dosage>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Box<Reference>,
  pub(crate) context: Option<Box<Reference>>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) derivedFrom: Vector<Reference>,
  pub(crate) statusReason: Vector<CodeableConcept>,
  pub(crate) effective: Option<UnionDateTimeOrPeriod>,
  pub(crate) dateAsserted: Option<DateTime<FixedOffset>>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) informationSource: Option<Box<Reference>>,
}