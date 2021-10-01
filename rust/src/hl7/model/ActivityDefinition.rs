use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ActivityDefinition_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ActivityDefinition_DynamicValue {
  pub(crate) id: Option<String>,
  pub(crate) path: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Expression,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ActivityDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) kind: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) intent: Option<String>,
  pub(crate) dosage: Vector<Dosage>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) profile: Option<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) priority: Option<String>,
  pub(crate) location: Option<Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) timing: Option<Age | Duration | Date | Period | Range | Timing>,
  pub(crate) transform: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) subject: Option<CodeableConcept | Reference>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) product: Option<CodeableConcept | Reference>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) doNotPerform: Option<Boolean>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) specimenRequirement: Vector<Reference>,
  pub(crate) observationRequirement: Vector<Reference>,
  pub(crate) observationResultRequirement: Vector<Reference>,
  pub(crate) participant: Vector<ActivityDefinition_Participant>,
  pub(crate) dynamicValue: Vector<ActivityDefinition_DynamicValue>,
}