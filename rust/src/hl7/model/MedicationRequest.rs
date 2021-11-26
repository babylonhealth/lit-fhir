use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionBooleanOrReference;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Dosage::Dosage;
use crate::core::UnionBooleanOrCodeableConcept;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Period::Period;
use crate::core::model::Duration::Duration;



#[derive(Clone, Debug)]
pub struct MedicationRequest_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) reason: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) allowed: UnionBooleanOrCodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationRequest_DispenseRequest_InitialFill {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) duration: Option<Duration>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicationRequest_DispenseRequest {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) validityPeriod: Option<Period>,
  pub(crate) dispenseInterval: Option<Duration>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) numberOfRepeatsAllowed: Option<u32>,
  pub(crate) expectedSupplyDuration: Option<Duration>,
  pub(crate) initialFill: Option<MedicationRequest_DispenseRequest_InitialFill>,
}

#[derive(Clone, Debug)]
pub struct MedicationRequest {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) subject: Box<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) recorder: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) requester: Option<Box<Reference>>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) insurance: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) reported: Option<UnionBooleanOrReference>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) eventHistory: Vector<Reference>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) performerType: Option<CodeableConcept>,
  pub(crate) detectedIssue: Vector<Reference>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) dosageInstruction: Vector<Dosage>,
  pub(crate) priorPrescription: Option<Box<Reference>>,
  pub(crate) courseOfTherapyType: Option<CodeableConcept>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) substitution: Option<MedicationRequest_Substitution>,
  pub(crate) dispenseRequest: Option<MedicationRequest_DispenseRequest>,
}