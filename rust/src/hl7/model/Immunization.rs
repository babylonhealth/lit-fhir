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
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Quantity::Quantity;
use crate::hl7::UnionDateTimeOrString;
use crate::hl7::UnionPositiveIntOrString;



#[derive(Clone, Debug)]
pub struct Immunization_Reaction {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) detail: Option<Box<Reference>>,
  pub(crate) reported: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Immunization_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<Reference>,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Immunization_Education {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Option<String>,
  pub(crate) documentType: Option<String>,
  pub(crate) publicationDate: Option<DateTime<FixedOffset>>,
  pub(crate) presentationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Immunization_ProtocolApplied {
  pub(crate) id: Option<String>,
  pub(crate) series: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) authority: Option<Box<Reference>>,
  pub(crate) targetDisease: Vector<CodeableConcept>,
  pub(crate) doseNumber: UnionPositiveIntOrString,
  pub(crate) seriesDoses: Option<UnionPositiveIntOrString>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Immunization {
  pub(crate) site: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) route: Option<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) patient: Box<Reference>,
  pub(crate) recorded: Option<DateTime<FixedOffset>>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) vaccineCode: CodeableConcept,
  pub(crate) isSubpotent: Option<bool>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) reportOrigin: Option<CodeableConcept>,
  pub(crate) manufacturer: Option<Box<Reference>>,
  pub(crate) doseQuantity: Option<Quantity>,
  pub(crate) occurrence: UnionDateTimeOrString,
  pub(crate) primarySource: Option<bool>,
  pub(crate) fundingSource: Option<CodeableConcept>,
  pub(crate) expirationDate: Option<FHIRDate>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) subpotentReason: Vector<CodeableConcept>,
  pub(crate) programEligibility: Vector<CodeableConcept>,
  pub(crate) reaction: Vector<Immunization_Reaction>,
  pub(crate) performer: Vector<Immunization_Performer>,
  pub(crate) education: Vector<Immunization_Education>,
  pub(crate) protocolApplied: Vector<Immunization_ProtocolApplied>,
}