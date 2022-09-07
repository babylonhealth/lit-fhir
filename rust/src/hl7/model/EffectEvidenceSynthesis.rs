use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_SampleSize {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) numberOfStudies: Option<i32>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) numberOfParticipants: Option<i32>,
}


#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_ResultsByExposure {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) variantState: Option<Box<dyn CodeableConcept>>,
  pub(crate) exposureState: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) riskEvidenceSynthesis: Box<dyn Reference>,
}


#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_Certainty_CertaintySubcomponent {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) rating: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_Certainty {
  pub(crate) id: Option<String>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) rating: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) certaintySubcomponent: Vector<Box<EffectEvidenceSynthesis_Certainty_CertaintySubcomponent>>,
}


#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimate {
  pub(crate) id: Option<String>,
  pub(crate) to: Option<BigDecimal>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) from: Option<BigDecimal>,
  pub(crate) level: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesis_EffectEstimate {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) variantState: Option<Box<dyn CodeableConcept>>,
  pub(crate) unitOfMeasure: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) precisionEstimate: Vector<Box<EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimate>>,
}

#[derive(Clone, Debug)]
pub struct EffectEvidenceSynthesisRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) title: Option<String>,
  pub(crate) topic: Vector<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn ContactDetail>>,
  pub(crate) editor: Vector<Box<dyn ContactDetail>>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) outcome: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) reviewer: Vector<Box<dyn ContactDetail>>,
  pub(crate) endorser: Vector<Box<dyn ContactDetail>>,
  pub(crate) exposure: Box<dyn Reference>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) studyType: Option<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) population: Box<dyn Reference>,
  pub(crate) description: Option<String>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<LocalDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) synthesisType: Option<Box<dyn CodeableConcept>>,
  pub(crate) lastReviewDate: Option<LocalDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) exposureAlternative: Box<dyn Reference>,
  pub(crate) sampleSize: Option<Box<EffectEvidenceSynthesis_SampleSize>>,
  pub(crate) resultsByExposure: Vector<Box<EffectEvidenceSynthesis_ResultsByExposure>>,
  pub(crate) certainty: Vector<Box<EffectEvidenceSynthesis_Certainty>>,
  pub(crate) effectEstimate: Vector<Box<EffectEvidenceSynthesis_EffectEstimate>>,
}

pub trait EffectEvidenceSynthesis : DomainResource {
  fn url(&self) -> Option<&String>;
  fn name(&self) -> Option<&String>;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn title(&self) -> Option<&String>;
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn outcome(&self) -> &Box<dyn Reference>;
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn exposure(&self) -> &Box<dyn Reference>;
  fn publisher(&self) -> Option<&String>;
  fn copyright(&self) -> Option<&String>;
  fn studyType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn population(&self) -> &Box<dyn Reference>;
  fn description(&self) -> Option<&String>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> Option<&LocalDate>;
  fn synthesisType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn lastReviewDate(&self) -> Option<&LocalDate>;
  fn effectivePeriod(&self) -> Option<&Box<dyn Period>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn exposureAlternative(&self) -> &Box<dyn Reference>;
  fn sampleSize(&self) -> Option<&Box<EffectEvidenceSynthesis_SampleSize>>;
  fn resultsByExposure(&self) -> &Vector<Box<EffectEvidenceSynthesis_ResultsByExposure>>;
  fn certainty(&self) -> &Vector<Box<EffectEvidenceSynthesis_Certainty>>;
  fn effectEstimate(&self) -> &Vector<Box<EffectEvidenceSynthesis_EffectEstimate>>;
}

dyn_clone::clone_trait_object!(EffectEvidenceSynthesis);

impl FHIRObject for EffectEvidenceSynthesisRaw {
}

impl Resource for EffectEvidenceSynthesisRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for EffectEvidenceSynthesisRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl EffectEvidenceSynthesis for EffectEvidenceSynthesisRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.topic }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn ContactDetail>> { &self.author }
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>> { &self.editor }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn outcome(&self) -> &Box<dyn Reference> { &self.outcome }
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>> { &self.reviewer }
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>> { &self.endorser }
  fn exposure(&self) -> &Box<dyn Reference> { &self.exposure }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn studyType(&self) -> Option<&Box<dyn CodeableConcept>> { self.studyType.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn population(&self) -> &Box<dyn Reference> { &self.population }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> Option<&LocalDate> { self.approvalDate.as_ref() }
  fn synthesisType(&self) -> Option<&Box<dyn CodeableConcept>> { self.synthesisType.as_ref() }
  fn lastReviewDate(&self) -> Option<&LocalDate> { self.lastReviewDate.as_ref() }
  fn effectivePeriod(&self) -> Option<&Box<dyn Period>> { self.effectivePeriod.as_ref() }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn exposureAlternative(&self) -> &Box<dyn Reference> { &self.exposureAlternative }
  fn sampleSize(&self) -> Option<&Box<EffectEvidenceSynthesis_SampleSize>> { self.sampleSize.as_ref() }
  fn resultsByExposure(&self) -> &Vector<Box<EffectEvidenceSynthesis_ResultsByExposure>> { &self.resultsByExposure }
  fn certainty(&self) -> &Vector<Box<EffectEvidenceSynthesis_Certainty>> { &self.certainty }
  fn effectEstimate(&self) -> &Vector<Box<EffectEvidenceSynthesis_EffectEstimate>> { &self.effectEstimate }
}

