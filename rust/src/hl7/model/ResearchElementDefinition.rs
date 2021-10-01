use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ResearchElementDefinition_Characteristic {
  pub(crate) id: Option<String>,
  pub(crate) exclude: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) usageContext: Vector<UsageContext>,
  pub(crate) definition: String | CodeableConcept | DataRequirement | Expression,
  pub(crate) unitOfMeasure: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) studyEffective: Option<Duration | Date | Period | Timing>,
  pub(crate) participantEffective: Option<Duration | Date | Period | Timing>,
  pub(crate) studyEffectiveDescription: Option<String>,
  pub(crate) studyEffectiveGroupMeasure: Option<String>,
  pub(crate) studyEffectiveTimeFromStart: Option<Duration>,
  pub(crate) participantEffectiveDescription: Option<String>,
  pub(crate) participantEffectiveGroupMeasure: Option<String>,
  pub(crate) participantEffectiveTimeFromStart: Option<Duration>,
}

#[derive(Clone, Debug)]
pub struct ResearchElementDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) _type: String,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) comment: Vector<String>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) shortTitle: Option<String>,
  pub(crate) subject: Option<CodeableConcept | Reference>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) variableType: Option<String>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) characteristic: Vector<ResearchElementDefinition_Characteristic>,
}