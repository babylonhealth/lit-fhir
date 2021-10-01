use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Encounter_Location {
  pub(crate) id?: String,
  pub(crate) status?: String,
  pub(crate) period?: Period,
  pub(crate) location: Reference,
  pub(crate) extension?: Extension,
  pub(crate) physicalType?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct Encounter_Diagnosis {
  pub(crate) id?: String,
  pub(crate) use?: CodeableConcept,
  pub(crate) rank?: u32,
  pub(crate) extension?: Extension,
  pub(crate) condition: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Encounter_Participant {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) extension?: Extension,
  pub(crate) individual?: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Encounter_ClassHistory {
  pub(crate) id?: String,
  pub(crate) class: Coding,
  pub(crate) period: Period,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Encounter_StatusHistory {
  pub(crate) id?: String,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Encounter_Hospitalization {
  pub(crate) id?: String,
  pub(crate) origin?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) admitSource?: CodeableConcept,
  pub(crate) reAdmission?: CodeableConcept,
  pub(crate) destination?: Reference,
  pub(crate) dietPreference?: CodeableConcept,
  pub(crate) specialCourtesy?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) specialArrangement?: CodeableConcept,
  pub(crate) dischargeDisposition?: CodeableConcept,
  pub(crate) preAdmissionIdentifier?: Identifier,
}

pub struct Encounter {
  pub(crate) _type?: CodeableConcept,
  pub(crate) class: Coding,
  pub(crate) status: String,
  pub(crate) period?: Period,
  pub(crate) length?: Duration,
  pub(crate) partOf?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) account?: Reference,
  pub(crate) priority?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) serviceType?: CodeableConcept,
  pub(crate) appointment?: Reference,
  pub(crate) episodeOfCare?: Reference,
  pub(crate) reasonReference?: Reference,
  pub(crate) serviceProvider?: Reference,
  pub(crate) location?: Encounter_Location,
  pub(crate) diagnosis?: Encounter_Diagnosis,
  pub(crate) participant?: Encounter_Participant,
  pub(crate) classHistory?: Encounter_ClassHistory,
  pub(crate) statusHistory?: Encounter_StatusHistory,
  pub(crate) hospitalization?: Encounter_Hospitalization,
}