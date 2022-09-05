use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Duration::Duration;
use crate::core::model::Expression::Expression;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::Resource::Resource;
use crate::core::model::TriggerDefinition::TriggerDefinition;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01405873694;
use crate::hl7::model::UnionAliases::UnionCanonicalOrUri;
use crate::hl7::model::UnionAliases::UnionCodeableConceptOrQuantityOrRange;
use crate::hl7::model::UnionAliases::UnionDurationOrRange;



#[derive(Clone, Debug)]
pub struct PlanDefinition_Goal_Target {
  pub(crate) id: Option<String>,
  pub(crate) due: Option<Box<dyn Duration>>,
  pub(crate) measure: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) detail: Option<UnionCodeableConceptOrQuantityOrRange>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct PlanDefinition_Goal {
  pub(crate) id: Option<String>,
  pub(crate) start: Option<Box<dyn CodeableConcept>>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) addresses: Vector<Box<dyn CodeableConcept>>,
  pub(crate) description: Box<dyn CodeableConcept>,
  pub(crate) documentation: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) target: Vector<Box<PlanDefinition_Goal_Target>>,
}


#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_Condition {
  pub(crate) id: Option<String>,
  pub(crate) kind: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<Box<dyn Expression>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_DynamicValue {
  pub(crate) id: Option<String>,
  pub(crate) path: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<Box<dyn Expression>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct PlanDefinition_Action_RelatedAction {
  pub(crate) id: Option<String>,
  pub(crate) actionId: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) offset: Option<UnionDurationOrRange>,
  pub(crate) relationship: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct PlanDefinition_Action {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) title: Option<String>,
  pub(crate) input: Vector<Box<dyn DataRequirement>>,
  pub(crate) prefix: Option<String>,
  pub(crate) reason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) goalId: Vector<String>,
  pub(crate) output: Vector<Box<dyn DataRequirement>>,
  pub(crate) action: Vector<Box<PlanDefinition_Action>>,
  pub(crate) trigger: Vector<Box<dyn TriggerDefinition>>,
  pub(crate) priority: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timing: Option<Union01405873694>,
  pub(crate) transform: Option<String>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) description: Option<String>,
  pub(crate) documentation: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) definition: Option<UnionCanonicalOrUri>,
  pub(crate) textEquivalent: Option<String>,
  pub(crate) groupingBehavior: Option<String>,
  pub(crate) requiredBehavior: Option<String>,
  pub(crate) precheckBehavior: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) selectionBehavior: Option<String>,
  pub(crate) cardinalityBehavior: Option<String>,
  pub(crate) condition: Vector<Box<PlanDefinition_Action_Condition>>,
  pub(crate) participant: Vector<Box<PlanDefinition_Action_Participant>>,
  pub(crate) dynamicValue: Vector<Box<PlanDefinition_Action_DynamicValue>>,
  pub(crate) relatedAction: Vector<Box<PlanDefinition_Action_RelatedAction>>,
}

#[derive(Clone, Debug)]
pub struct PlanDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn ContactDetail>>,
  pub(crate) editor: Vector<Box<dyn ContactDetail>>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) language: Option<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<Box<dyn ContactDetail>>,
  pub(crate) endorser: Vector<Box<dyn ContactDetail>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<LocalDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastReviewDate: Option<LocalDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) goal: Vector<Box<PlanDefinition_Goal>>,
  pub(crate) action: Vector<Box<PlanDefinition_Action>>,
}

pub trait PlanDefinition : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn usage(&self) -> &Option<String>;
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn library(&self) -> &Vector<String>;
  fn subtitle(&self) -> &Option<String>;
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> &Option<LocalDate>;
  fn lastReviewDate(&self) -> &Option<LocalDate>;
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn goal(&self) -> &Vector<Box<PlanDefinition_Goal>>;
  fn action(&self) -> &Vector<Box<PlanDefinition_Action>>;
}

dyn_clone::clone_trait_object!(PlanDefinition);

impl FHIRObject for PlanDefinitionRaw {
}

impl Resource for PlanDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for PlanDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl PlanDefinition for PlanDefinitionRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn usage(&self) -> &Option<String> { &self.usage }
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.topic }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn ContactDetail>> { &self.author }
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>> { &self.editor }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn library(&self) -> &Vector<String> { &self.library }
  fn subtitle(&self) -> &Option<String> { &self.subtitle }
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>> { &self.reviewer }
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>> { &self.endorser }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference> { &self.subject }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> &Option<LocalDate> { &self.approvalDate }
  fn lastReviewDate(&self) -> &Option<LocalDate> { &self.lastReviewDate }
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>> { &self.effectivePeriod }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn goal(&self) -> &Vector<Box<PlanDefinition_Goal>> { &self.goal }
  fn action(&self) -> &Vector<Box<PlanDefinition_Action>> { &self.action }
}

