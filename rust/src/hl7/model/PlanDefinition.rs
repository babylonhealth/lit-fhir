use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct PlanDefinition_Goal_Target {
  pub(crate) id: Option<String>,
  pub(crate) due: Option<Duration>,
  pub(crate) measure: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) detail: Option<CodeableConcept | Quantity | Range>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct PlanDefinition_Goal {
  pub(crate) id: Option<String>,
  pub(crate) start: Option<CodeableConcept>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) addresses: Vector<CodeableConcept>,
  pub(crate) description: CodeableConcept,
  pub(crate) documentation: Vector<RelatedArtifact>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) target: Vector<PlanDefinition_Goal_Target>,
}


#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_Condition {
  pub(crate) id: Option<String>,
  pub(crate) kind: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<Expression>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_DynamicValue {
  pub(crate) id: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<Expression>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_RelatedAction {
  pub(crate) id: Option<String>,
  pub(crate) actionId: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) offset: Option<Duration | Range>,
  pub(crate) relationship: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct PlanDefinition_Action {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) input: Vector<DataRequirement>,
  pub(crate) prefix: Option<String>,
  pub(crate) reason: Vector<CodeableConcept>,
  pub(crate) goalId: Vector<String>,
  pub(crate) output: Vector<DataRequirement>,
  pub(crate) action: Vector<PlanDefinition_Action>,
  pub(crate) trigger: Vector<TriggerDefinition>,
  pub(crate) priority: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timing: Option<Age | Duration | Date | Period | Range | Timing>,
  pub(crate) transform: Option<String>,
  pub(crate) subject: Option<CodeableConcept | Reference>,
  pub(crate) description: Option<String>,
  pub(crate) documentation: Vector<RelatedArtifact>,
  pub(crate) definition: Option<String | String>,
  pub(crate) textEquivalent: Option<String>,
  pub(crate) groupingBehavior: Option<String>,
  pub(crate) requiredBehavior: Option<String>,
  pub(crate) precheckBehavior: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) selectionBehavior: Option<String>,
  pub(crate) cardinalityBehavior: Option<String>,
  pub(crate) condition: Vector<PlanDefinition_Action_Condition>,
  pub(crate) participant: Vector<PlanDefinition_Action_Participant>,
  pub(crate) dynamicValue: Vector<PlanDefinition_Action_DynamicValue>,
  pub(crate) relatedAction: Vector<PlanDefinition_Action_RelatedAction>,
}

#[derive(Clone, Debug)]
pub struct PlanDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) subject: Option<CodeableConcept | Reference>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) goal: Vector<PlanDefinition_Goal>,
  pub(crate) action: Vector<PlanDefinition_Action>,
}