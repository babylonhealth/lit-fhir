use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct RequestGroup_Action_Condition {
  pub(crate) id: Option<String>,
  pub(crate) kind: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<Expression>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct RequestGroup_Action_RelatedAction {
  pub(crate) id: Option<String>,
  pub(crate) actionId: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) offset: Option<Duration | Range>,
  pub(crate) relationship: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct RequestGroup_Action {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) prefix: Option<String>,
  pub(crate) action: Vector<RequestGroup_Action>,
  pub(crate) priority: Option<String>,
  pub(crate) resource: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timing: Option<Age | Duration | Date | Period | Range | Timing>,
  pub(crate) description: Option<String>,
  pub(crate) participant: Vector<Reference>,
  pub(crate) documentation: Vector<RelatedArtifact>,
  pub(crate) textEquivalent: Option<String>,
  pub(crate) groupingBehavior: Option<String>,
  pub(crate) requiredBehavior: Option<String>,
  pub(crate) precheckBehavior: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) selectionBehavior: Option<String>,
  pub(crate) cardinalityBehavior: Option<String>,
  pub(crate) condition: Vector<RequestGroup_Action_Condition>,
  pub(crate) relatedAction: Vector<RequestGroup_Action_RelatedAction>,
}

#[derive(Clone, Debug)]
pub struct RequestGroup {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) author: Option<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) replaces: Vector<Reference>,
  pub(crate) priority: Option<String>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<Date>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) action: Vector<RequestGroup_Action>,
}