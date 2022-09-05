use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01763000476;
use crate::hl7::model::UnionAliases::Union_0044338899;



#[derive(Clone, Debug)]
pub struct ResearchElementDefinition_Characteristic {
  pub(crate) id: Option<String>,
  pub(crate) exclude: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) usageContext: Vector<Box<dyn UsageContext>>,
  pub(crate) definition: Box<Union_0044338899>,
  pub(crate) unitOfMeasure: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) studyEffective: Option<Union01763000476>,
  pub(crate) participantEffective: Option<Union01763000476>,
  pub(crate) studyEffectiveDescription: Option<String>,
  pub(crate) studyEffectiveGroupMeasure: Option<String>,
  pub(crate) studyEffectiveTimeFromStart: Option<Box<dyn Duration>>,
  pub(crate) participantEffectiveDescription: Option<String>,
  pub(crate) participantEffectiveGroupMeasure: Option<String>,
  pub(crate) participantEffectiveTimeFromStart: Option<Box<dyn Duration>>,
}

#[derive(Clone, Debug)]
pub struct ResearchElementDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) _type: String,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn ContactDetail>>,
  pub(crate) editor: Vector<Box<dyn ContactDetail>>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) comment: Vector<String>,
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
  pub(crate) shortTitle: Option<String>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<LocalDate>,
  pub(crate) variableType: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastReviewDate: Option<LocalDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) characteristic: Vector<Box<ResearchElementDefinition_Characteristic>>,
}

pub trait ResearchElementDefinition : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn _type(&self) -> &String;
  fn title(&self) -> &Option<String>;
  fn usage(&self) -> &Option<String>;
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn comment(&self) -> &Vector<String>;
  fn purpose(&self) -> &Option<String>;
  fn library(&self) -> &Vector<String>;
  fn subtitle(&self) -> &Option<String>;
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn shortTitle(&self) -> &Option<String>;
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> &Option<LocalDate>;
  fn variableType(&self) -> &Option<String>;
  fn lastReviewDate(&self) -> &Option<LocalDate>;
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn characteristic(&self) -> &Vector<Box<ResearchElementDefinition_Characteristic>>;
}

dyn_clone::clone_trait_object!(ResearchElementDefinition);

impl FHIRObject for ResearchElementDefinitionRaw {
}

impl Resource for ResearchElementDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ResearchElementDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ResearchElementDefinition for ResearchElementDefinitionRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn _type(&self) -> &String { &self._type }
  fn title(&self) -> &Option<String> { &self.title }
  fn usage(&self) -> &Option<String> { &self.usage }
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.topic }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn ContactDetail>> { &self.author }
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>> { &self.editor }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn comment(&self) -> &Vector<String> { &self.comment }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn library(&self) -> &Vector<String> { &self.library }
  fn subtitle(&self) -> &Option<String> { &self.subtitle }
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>> { &self.reviewer }
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>> { &self.endorser }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn shortTitle(&self) -> &Option<String> { &self.shortTitle }
  fn subject(&self) -> &Option<UnionCodeableConceptOrReference> { &self.subject }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> &Option<LocalDate> { &self.approvalDate }
  fn variableType(&self) -> &Option<String> { &self.variableType }
  fn lastReviewDate(&self) -> &Option<LocalDate> { &self.lastReviewDate }
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>> { &self.effectivePeriod }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn characteristic(&self) -> &Vector<Box<ResearchElementDefinition_Characteristic>> { &self.characteristic }
}

