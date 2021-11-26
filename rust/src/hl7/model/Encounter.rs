use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Encounter_Location {
  pub(crate) id: Option<String>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) location: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) physicalType: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Encounter_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<CodeableConcept>,
  pub(crate) rank: Option<u32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) condition: Box<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Encounter_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) individual: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Encounter_ClassHistory {
  pub(crate) id: Option<String>,
  pub(crate) class: Coding,
  pub(crate) period: Period,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Encounter_StatusHistory {
  pub(crate) id: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Encounter_Hospitalization {
  pub(crate) id: Option<String>,
  pub(crate) origin: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) admitSource: Option<CodeableConcept>,
  pub(crate) reAdmission: Option<CodeableConcept>,
  pub(crate) destination: Option<Box<Reference>>,
  pub(crate) dietPreference: Vector<CodeableConcept>,
  pub(crate) specialCourtesy: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) specialArrangement: Vector<CodeableConcept>,
  pub(crate) dischargeDisposition: Option<CodeableConcept>,
  pub(crate) preAdmissionIdentifier: Option<Identifier>,
}

#[derive(Clone, Debug)]
pub struct Encounter {
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) class: Coding,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) length: Option<Duration>,
  pub(crate) partOf: Option<Box<Reference>>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) account: Vector<Reference>,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) serviceType: Option<CodeableConcept>,
  pub(crate) appointment: Vector<Reference>,
  pub(crate) episodeOfCare: Vector<Reference>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) serviceProvider: Option<Box<Reference>>,
  pub(crate) location: Vector<Encounter_Location>,
  pub(crate) diagnosis: Vector<Encounter_Diagnosis>,
  pub(crate) participant: Vector<Encounter_Participant>,
  pub(crate) classHistory: Vector<Encounter_ClassHistory>,
  pub(crate) statusHistory: Vector<Encounter_StatusHistory>,
  pub(crate) hospitalization: Option<Encounter_Hospitalization>,
}