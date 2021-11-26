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
use crate::core::model::Quantity::Quantity;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Dosage::Dosage;



#[derive(Clone, Debug)]
pub struct MedicationDispense_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<Reference>,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationDispense_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) reason: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) wasSubstituted: bool,
  pub(crate) responsibleParty: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicationDispense {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) context: Option<Box<Reference>>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) receiver: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) daysSupply: Option<Quantity>,
  pub(crate) destination: Option<Box<Reference>>,
  pub(crate) whenPrepared: Option<DateTime<FixedOffset>>,
  pub(crate) eventHistory: Vector<Reference>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) detectedIssue: Vector<Reference>,
  pub(crate) whenHandedOver: Option<DateTime<FixedOffset>>,
  pub(crate) statusReason: Option<UnionCodeableConceptOrReference>,
  pub(crate) dosageInstruction: Vector<Dosage>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) authorizingPrescription: Vector<Reference>,
  pub(crate) performer: Vector<MedicationDispense_Performer>,
  pub(crate) substitution: Option<MedicationDispense_Substitution>,
}