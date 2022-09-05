use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Expression::Expression;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01405873694;



#[derive(Clone, Debug)]
pub struct ActivityDefinition_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ActivityDefinition_DynamicValue {
  pub(crate) id: Option<String>,
  pub(crate) path: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Box<dyn Expression>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ActivityDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) kind: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn ContactDetail>>,
  pub(crate) editor: Vector<Box<dyn ContactDetail>>,
  pub(crate) intent: Option<String>,
  pub(crate) dosage: Vector<Box<dyn Dosage>>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) profile: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<Box<dyn ContactDetail>>,
  pub(crate) endorser: Vector<Box<dyn ContactDetail>>,
  pub(crate) priority: Option<String>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) bodySite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) timing: Option<Union01405873694>,
  pub(crate) transform: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) product: Option<UnionCodeableConceptOrReference>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<LocalDate>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastReviewDate: Option<LocalDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) specimenRequirement: Vector<Box<dyn Reference>>,
  pub(crate) observationRequirement: Vector<Box<dyn Reference>>,
  pub(crate) observationResultRequirement: Vector<Box<dyn Reference>>,
  pub(crate) participant: Vector<Box<ActivityDefinition_Participant>>,
  pub(crate) dynamicValue: Vector<Box<ActivityDefinition_DynamicValue>>,
}

pub trait ActivityDefinition : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn kind(&self) -> &Option<String>;
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn title(&self) -> &Option<String>;
  fn usage(&self) -> &Option<String>;
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn intent(&self) -> &Option<String>;
  fn dosage(&self) -> &Vector<Box<dyn Dosage>>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn library(&self) -> &Vector<String>;
  fn profile(&self) -> &Option<String>;
  fn subtitle(&self) -> &Option<String>;
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn priority(&self) -> &Option<String>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn quantity(&self) -> &Option<Box<dyn Quantity>>;
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn timing(&self) -> &Option<Union01405873694>;
  fn transform(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn product(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> &Option<LocalDate>;
  fn doNotPerform(&self) -> &Option<bool>;
  fn lastReviewDate(&self) -> &Option<LocalDate>;
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn specimenRequirement(&self) -> &Vector<Box<dyn Reference>>;
  fn observationRequirement(&self) -> &Vector<Box<dyn Reference>>;
  fn observationResultRequirement(&self) -> &Vector<Box<dyn Reference>>;
  fn participant(&self) -> &Vector<Box<ActivityDefinition_Participant>>;
  fn dynamicValue(&self) -> &Vector<Box<ActivityDefinition_DynamicValue>>;
}

dyn_clone::clone_trait_object!(ActivityDefinition);

impl FHIRObject for ActivityDefinitionRaw {
}

impl Resource for ActivityDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ActivityDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ActivityDefinition for ActivityDefinitionRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn kind(&self) -> &Option<String> { &self.kind }
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn title(&self) -> &Option<String> { &self.title }
  fn usage(&self) -> &Option<String> { &self.usage }
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.topic }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn ContactDetail>> { &self.author }
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>> { &self.editor }
  fn intent(&self) -> &Option<String> { &self.intent }
  fn dosage(&self) -> &Vector<Box<dyn Dosage>> { &self.dosage }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn library(&self) -> &Vector<String> { &self.library }
  fn profile(&self) -> &Option<String> { &self.profile }
  fn subtitle(&self) -> &Option<String> { &self.subtitle }
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>> { &self.reviewer }
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>> { &self.endorser }
  fn priority(&self) -> &Option<String> { &self.priority }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn quantity(&self) -> &Option<Box<dyn Quantity>> { &self.quantity }
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.bodySite }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn timing(&self) -> &Option<Union01405873694> { &self.timing }
  fn transform(&self) -> &Option<String> { &self.transform }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference> { &self.subject }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn product(&self) -> &Option<UnionCodeableConceptOrReference> { &self.product }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> &Option<LocalDate> { &self.approvalDate }
  fn doNotPerform(&self) -> &Option<bool> { &self.doNotPerform }
  fn lastReviewDate(&self) -> &Option<LocalDate> { &self.lastReviewDate }
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>> { &self.effectivePeriod }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn specimenRequirement(&self) -> &Vector<Box<dyn Reference>> { &self.specimenRequirement }
  fn observationRequirement(&self) -> &Vector<Box<dyn Reference>> { &self.observationRequirement }
  fn observationResultRequirement(&self) -> &Vector<Box<dyn Reference>> { &self.observationResultRequirement }
  fn participant(&self) -> &Vector<Box<ActivityDefinition_Participant>> { &self.participant }
  fn dynamicValue(&self) -> &Vector<Box<ActivityDefinition_DynamicValue>> { &self.dynamicValue }
}

