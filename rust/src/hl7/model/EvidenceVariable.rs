use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct EvidenceVariable_Characteristic {
  pub(crate) id: Option<String>,
  pub(crate) exclude: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) usageContext: Vector<UsageContext>,
  pub(crate) groupMeasure: Option<String>,
  pub(crate) definition: String | CodeableConcept | DataRequirement | Expression | Reference | TriggerDefinition,
  pub(crate) timeFromStart: Option<Duration>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) participantEffective: Option<Duration | Date | Period | Timing>,
}

#[derive(Clone, Debug)]
pub struct EvidenceVariable {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) _type: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) shortTitle: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) characteristic: Vector<EvidenceVariable_Characteristic>,
}