use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::Union01474038381;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Procedure_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<Reference>,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Procedure_FocalDevice {
  pub(crate) id: Option<String>,
  pub(crate) action: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) manipulated: Box<Reference>,
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
  pub(crate) subject: Box<Reference>,
  pub(crate) outcome: Option<CodeableConcept>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) recorder: Option<Box<Reference>>,
  pub(crate) asserter: Option<Box<Reference>>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) followUp: Vector<CodeableConcept>,
  pub(crate) usedCode: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) performed: Option<Union01474038381>,
  pub(crate) complication: Vector<CodeableConcept>,
  pub(crate) usedReference: Vector<Reference>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) complicationDetail: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) performer: Vector<Procedure_Performer>,
  pub(crate) focalDevice: Vector<Procedure_FocalDevice>,
}