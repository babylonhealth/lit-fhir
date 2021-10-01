use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct RequestGroup_Action_Condition {
  pub(crate) id?: String,
  pub(crate) kind: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: Expression,
  pub(crate) modifierExtension?: Extension,
}



pub struct RequestGroup_Action_RelatedAction {
  pub(crate) id?: String,
  pub(crate) actionId: String,
  pub(crate) extension?: Extension,
  pub(crate) offset?: Duration | Range,
  pub(crate) relationship: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct RequestGroup_Action {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) _type?: CodeableConcept,
  pub(crate) title?: String,
  pub(crate) prefix?: String,
  pub(crate) action?: RequestGroup_Action,
  pub(crate) priority?: String,
  pub(crate) resource?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) timing?: Age | Duration | Date | Period | Range | Timing,
  pub(crate) description?: String,
  pub(crate) participant?: Reference,
  pub(crate) documentation?: RelatedArtifact,
  pub(crate) textEquivalent?: String,
  pub(crate) groupingBehavior?: String,
  pub(crate) requiredBehavior?: String,
  pub(crate) precheckBehavior?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) selectionBehavior?: String,
  pub(crate) cardinalityBehavior?: String,
  pub(crate) condition?: RequestGroup_Action_Condition,
  pub(crate) relatedAction?: RequestGroup_Action_RelatedAction,
}

pub struct RequestGroup {
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) author?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) replaces?: Reference,
  pub(crate) priority?: String,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) instantiatesUri?: String,
  pub(crate) groupIdentifier?: Identifier,
  pub(crate) reasonReference?: Reference,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) action?: RequestGroup_Action,
}