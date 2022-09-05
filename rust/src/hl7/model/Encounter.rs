use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Encounter_Location {
  pub(crate) id: Option<String>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) location: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) physicalType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Encounter_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<Box<dyn CodeableConcept>>,
  pub(crate) rank: Option<u32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) condition: Box<dyn Reference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Encounter_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) individual: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Encounter_ClassHistory {
  pub(crate) id: Option<String>,
  pub(crate) class: Box<dyn Coding>,
  pub(crate) period: Box<dyn Period>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Encounter_StatusHistory {
  pub(crate) id: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Box<dyn Period>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Encounter_Hospitalization {
  pub(crate) id: Option<String>,
  pub(crate) origin: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) admitSource: Option<Box<dyn CodeableConcept>>,
  pub(crate) reAdmission: Option<Box<dyn CodeableConcept>>,
  pub(crate) destination: Option<Box<dyn Reference>>,
  pub(crate) dietPreference: Vector<Box<dyn CodeableConcept>>,
  pub(crate) specialCourtesy: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) specialArrangement: Vector<Box<dyn CodeableConcept>>,
  pub(crate) dischargeDisposition: Option<Box<dyn CodeableConcept>>,
  pub(crate) preAdmissionIdentifier: Option<Box<dyn Identifier>>,
}

#[derive(Clone, Debug)]
pub struct EncounterRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) class: Box<dyn Coding>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) length: Option<Box<dyn Duration>>,
  pub(crate) partOf: Option<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) account: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) priority: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) serviceType: Option<Box<dyn CodeableConcept>>,
  pub(crate) appointment: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) episodeOfCare: Vector<Box<dyn Reference>>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) serviceProvider: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) location: Vector<Encounter_Location>,
  pub(crate) diagnosis: Vector<Encounter_Diagnosis>,
  pub(crate) participant: Vector<Encounter_Participant>,
  pub(crate) classHistory: Vector<Encounter_ClassHistory>,
  pub(crate) statusHistory: Vector<Encounter_StatusHistory>,
  pub(crate) hospitalization: Option<Encounter_Hospitalization>,
}

pub trait Encounter : DomainResource {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn class(&self) -> &Box<dyn Coding>;
  fn status(&self) -> &String;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn length(&self) -> &Option<Box<dyn Duration>>;
  fn partOf(&self) -> &Option<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn account(&self) -> &Vector<Box<dyn Reference>>;
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn serviceType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn appointment(&self) -> &Vector<Box<dyn Reference>>;
  fn episodeOfCare(&self) -> &Vector<Box<dyn Reference>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn serviceProvider(&self) -> &Option<Box<dyn Reference>>;
  fn location(&self) -> &Vector<Encounter_Location>;
  fn diagnosis(&self) -> &Vector<Encounter_Diagnosis>;
  fn participant(&self) -> &Vector<Encounter_Participant>;
  fn classHistory(&self) -> &Vector<Encounter_ClassHistory>;
  fn statusHistory(&self) -> &Vector<Encounter_StatusHistory>;
  fn hospitalization(&self) -> &Option<Encounter_Hospitalization>;
}

dyn_clone::clone_trait_object!(Encounter);

impl FHIRObject for EncounterRaw {
}

impl Resource for EncounterRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for EncounterRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Encounter for EncounterRaw {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn class(&self) -> &Box<dyn Coding> { &self.class }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn length(&self) -> &Option<Box<dyn Duration>> { &self.length }
  fn partOf(&self) -> &Option<Box<dyn Reference>> { &self.partOf }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn account(&self) -> &Vector<Box<dyn Reference>> { &self.account }
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>> { &self.priority }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn serviceType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.serviceType }
  fn appointment(&self) -> &Vector<Box<dyn Reference>> { &self.appointment }
  fn episodeOfCare(&self) -> &Vector<Box<dyn Reference>> { &self.episodeOfCare }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn serviceProvider(&self) -> &Option<Box<dyn Reference>> { &self.serviceProvider }
  fn location(&self) -> &Vector<Encounter_Location> { &self.location }
  fn diagnosis(&self) -> &Vector<Encounter_Diagnosis> { &self.diagnosis }
  fn participant(&self) -> &Vector<Encounter_Participant> { &self.participant }
  fn classHistory(&self) -> &Vector<Encounter_ClassHistory> { &self.classHistory }
  fn statusHistory(&self) -> &Vector<Encounter_StatusHistory> { &self.statusHistory }
  fn hospitalization(&self) -> &Option<Encounter_Hospitalization> { &self.hospitalization }
}

