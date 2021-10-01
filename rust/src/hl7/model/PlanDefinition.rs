use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct PlanDefinition_Goal_Target {
  pub(crate) id?: String,
  pub(crate) due?: Duration,
  pub(crate) measure?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) detail?: CodeableConcept | Quantity | Range,
  pub(crate) modifierExtension?: Extension,
}

pub struct PlanDefinition_Goal {
  pub(crate) id?: String,
  pub(crate) start?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) priority?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) addresses?: CodeableConcept,
  pub(crate) description: CodeableConcept,
  pub(crate) documentation?: RelatedArtifact,
  pub(crate) modifierExtension?: Extension,
  pub(crate) target?: PlanDefinition_Goal_Target,
}


pub struct PlanDefinition_Action_Condition {
  pub(crate) id?: String,
  pub(crate) kind: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: Expression,
  pub(crate) modifierExtension?: Extension,
}



pub struct PlanDefinition_Action_Participant {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct PlanDefinition_Action_DynamicValue {
  pub(crate) id?: String,
  pub(crate) path?: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: Expression,
  pub(crate) modifierExtension?: Extension,
}



pub struct PlanDefinition_Action_RelatedAction {
  pub(crate) id?: String,
  pub(crate) actionId: String,
  pub(crate) extension?: Extension,
  pub(crate) offset?: Duration | Range,
  pub(crate) relationship: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct PlanDefinition_Action {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) _type?: CodeableConcept,
  pub(crate) title?: String,
  pub(crate) input?: DataRequirement,
  pub(crate) prefix?: String,
  pub(crate) reason?: CodeableConcept,
  pub(crate) goalId?: String,
  pub(crate) output?: DataRequirement,
  pub(crate) action?: PlanDefinition_Action,
  pub(crate) trigger?: TriggerDefinition,
  pub(crate) priority?: String,
  pub(crate) extension?: Extension,
  pub(crate) timing?: Age | Duration | Date | Period | Range | Timing,
  pub(crate) transform?: String,
  pub(crate) subject?: CodeableConcept | Reference,
  pub(crate) description?: String,
  pub(crate) documentation?: RelatedArtifact,
  pub(crate) definition?: String | String,
  pub(crate) textEquivalent?: String,
  pub(crate) groupingBehavior?: String,
  pub(crate) requiredBehavior?: String,
  pub(crate) precheckBehavior?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) selectionBehavior?: String,
  pub(crate) cardinalityBehavior?: String,
  pub(crate) condition?: PlanDefinition_Action_Condition,
  pub(crate) participant?: PlanDefinition_Action_Participant,
  pub(crate) dynamicValue?: PlanDefinition_Action_DynamicValue,
  pub(crate) relatedAction?: PlanDefinition_Action_RelatedAction,
}

pub struct PlanDefinition {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) usage?: String,
  pub(crate) topic?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: ContactDetail,
  pub(crate) editor?: ContactDetail,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) library?: String,
  pub(crate) subtitle?: String,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) subject?: CodeableConcept | Reference,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) goal?: PlanDefinition_Goal,
  pub(crate) action?: PlanDefinition_Action,
}