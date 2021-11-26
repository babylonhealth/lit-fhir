use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::hl7::Union01474038381;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;



#[derive(Clone, Debug)]
pub struct AllergyIntolerance_Reaction {
  pub(crate) id: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) onset: Option<DateTime<FixedOffset>>,
  pub(crate) severity: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) substance: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) manifestation: Vector<CodeableConcept>,
  pub(crate) exposureRoute: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct AllergyIntolerance {
  pub(crate) _type: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) patient: Box<Reference>,
  pub(crate) category: Vector<String>,
  pub(crate) onset: Option<Union01474038381>,
  pub(crate) recorder: Option<Box<Reference>>,
  pub(crate) asserter: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) criticality: Option<String>,
  pub(crate) recordedDate: Option<DateTime<FixedOffset>>,
  pub(crate) clinicalStatus: Option<CodeableConcept>,
  pub(crate) lastOccurrence: Option<DateTime<FixedOffset>>,
  pub(crate) verificationStatus: Option<CodeableConcept>,
  pub(crate) reaction: Vector<AllergyIntolerance_Reaction>,
}