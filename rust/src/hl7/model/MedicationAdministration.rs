use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::UnionQuantityOrRatio;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicationAdministration_Dosage {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) site: Option<CodeableConcept>,
  pub(crate) dose: Option<Quantity>,
  pub(crate) route: Option<CodeableConcept>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) rate: Option<UnionQuantityOrRatio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicationAdministration_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<Reference>,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicationAdministration {
  pub(crate) note: Vector<Annotation>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) device: Vector<Reference>,
  pub(crate) subject: Box<Reference>,
  pub(crate) context: Option<Box<Reference>>,
  pub(crate) request: Option<Box<Reference>>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) statusReason: Vector<CodeableConcept>,
  pub(crate) effective: UnionDateTimeOrPeriod,
  pub(crate) eventHistory: Vector<Reference>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) dosage: Option<MedicationAdministration_Dosage>,
  pub(crate) performer: Vector<MedicationAdministration_Performer>,
}