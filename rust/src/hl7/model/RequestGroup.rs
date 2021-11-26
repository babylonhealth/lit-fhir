use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Expression::Expression;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::RequestGroup_Action::RequestGroup_Action;
use crate::core::model::Resource::Resource;
use crate::hl7::Union01405873694;
use crate::hl7::UnionDurationOrRange;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) offset: Option<UnionDurationOrRange>,
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
  pub(crate) resource: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timing: Option<Union01405873694>,
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
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) replaces: Vector<Reference>,
  pub(crate) priority: Option<String>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) action: Vector<RequestGroup_Action>,
}