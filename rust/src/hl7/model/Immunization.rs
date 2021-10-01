use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Immunization_Reaction {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) detail: Option<Reference>,
  pub(crate) reported: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Immunization_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Reference,
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
  pub(crate) publicationDate: Option<Date>,
  pub(crate) presentationDate: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Immunization_ProtocolApplied {
  pub(crate) id: Option<String>,
  pub(crate) series: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) authority: Option<Reference>,
  pub(crate) targetDisease: Vector<CodeableConcept>,
  pub(crate) doseNumber: u32 | String,
  pub(crate) seriesDoses: Option<u32 | String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Immunization {
  pub(crate) site: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) route: Option<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) patient: Reference,
  pub(crate) recorded: Option<Date>,
  pub(crate) location: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) vaccineCode: CodeableConcept,
  pub(crate) isSubpotent: Option<Boolean>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) reportOrigin: Option<CodeableConcept>,
  pub(crate) manufacturer: Option<Reference>,
  pub(crate) doseQuantity: Option<Quantity>,
  pub(crate) occurrence: Date | String,
  pub(crate) primarySource: Option<Boolean>,
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