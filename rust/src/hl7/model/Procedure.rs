use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Procedure_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Reference,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Procedure_FocalDevice {
  pub(crate) id: Option<String>,
  pub(crate) action: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) manipulated: Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Procedure {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) report: Vector<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Reference,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) recorder: Option<Reference>,
  pub(crate) asserter: Option<Reference>,
  pub(crate) location: Option<Reference>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) followUp: Vector<CodeableConcept>,
  pub(crate) usedCode: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) performed: Option<Age | Date | Period | Range | String>,
  pub(crate) complication: Vector<CodeableConcept>,
  pub(crate) usedReference: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) complicationDetail: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) performer: Vector<Procedure_Performer>,
  pub(crate) focalDevice: Vector<Procedure_FocalDevice>,
}