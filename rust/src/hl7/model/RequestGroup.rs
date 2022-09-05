use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Expression::Expression;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01405873694;
use crate::hl7::model::UnionAliases::UnionDurationOrRange;



#[derive(Clone, Debug)]
pub struct RequestGroup_Action_Condition {
  pub(crate) id: Option<String>,
  pub(crate) kind: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<Box<dyn Expression>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct RequestGroup_Action_RelatedAction {
  pub(crate) id: Option<String>,
  pub(crate) actionId: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) offset: Option<UnionDurationOrRange>,
  pub(crate) relationship: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct RequestGroup_Action {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) title: Option<String>,
  pub(crate) prefix: Option<String>,
  pub(crate) action: Vector<Box<RequestGroup_Action>>,
  pub(crate) priority: Option<String>,
  pub(crate) resource: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timing: Option<Union01405873694>,
  pub(crate) description: Option<String>,
  pub(crate) participant: Vector<Box<dyn Reference>>,
  pub(crate) documentation: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) textEquivalent: Option<String>,
  pub(crate) groupingBehavior: Option<String>,
  pub(crate) requiredBehavior: Option<String>,
  pub(crate) precheckBehavior: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) selectionBehavior: Option<String>,
  pub(crate) cardinalityBehavior: Option<String>,
  pub(crate) condition: Vector<Box<RequestGroup_Action_Condition>>,
  pub(crate) relatedAction: Vector<Box<RequestGroup_Action_RelatedAction>>,
}

#[derive(Clone, Debug)]
pub struct RequestGroupRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) replaces: Vector<Box<dyn Reference>>,
  pub(crate) priority: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) action: Vector<Box<RequestGroup_Action>>,
}

pub trait RequestGroup : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn intent(&self) -> &String;
  fn author(&self) -> &Option<Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn replaces(&self) -> &Vector<Box<dyn Reference>>;
  fn priority(&self) -> &Option<String>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> &Option<DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn groupIdentifier(&self) -> &Option<Box<dyn Identifier>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn action(&self) -> &Vector<Box<RequestGroup_Action>>;
}

dyn_clone::clone_trait_object!(RequestGroup);

impl FHIRObject for RequestGroupRaw {
}

impl Resource for RequestGroupRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for RequestGroupRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl RequestGroup for RequestGroupRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn author(&self) -> &Option<Box<dyn Reference>> { &self.author }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn replaces(&self) -> &Vector<Box<dyn Reference>> { &self.replaces }
  fn priority(&self) -> &Option<String> { &self.priority }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> &Option<DateTime<FixedOffset>> { &self.authoredOn }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn groupIdentifier(&self) -> &Option<Box<dyn Identifier>> { &self.groupIdentifier }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn action(&self) -> &Vector<Box<RequestGroup_Action>> { &self.action }
}

