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
pub struct EvidenceRaw {
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
  pub(crate) outcome: Vector<Box<dyn Reference>>,
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
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<LocalDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastReviewDate: Option<LocalDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) exposureVariant: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) exposureBackground: Box<dyn Reference>,
}

pub trait Evidence : DomainResource {
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
  fn outcome(&self) -> &Vector<Box<dyn Reference>>;
  fn subtitle(&self) -> Option<&String>;
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn publisher(&self) -> Option<&String>;
  fn copyright(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn shortTitle(&self) -> Option<&String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> Option<&String>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> Option<&LocalDate>;
  fn lastReviewDate(&self) -> Option<&LocalDate>;
  fn effectivePeriod(&self) -> Option<&Box<dyn Period>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn exposureVariant(&self) -> &Vector<Box<dyn Reference>>;
  fn exposureBackground(&self) -> &Box<dyn Reference>;
}

dyn_clone::clone_trait_object!(Evidence);

impl FHIRObject for EvidenceRaw {
}

impl Resource for EvidenceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for EvidenceRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Evidence for EvidenceRaw {
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
  fn outcome(&self) -> &Vector<Box<dyn Reference>> { &self.outcome }
  fn subtitle(&self) -> Option<&String> { self.subtitle.as_ref() }
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>> { &self.reviewer }
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>> { &self.endorser }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn shortTitle(&self) -> Option<&String> { self.shortTitle.as_ref() }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> Option<&LocalDate> { self.approvalDate.as_ref() }
  fn lastReviewDate(&self) -> Option<&LocalDate> { self.lastReviewDate.as_ref() }
  fn effectivePeriod(&self) -> Option<&Box<dyn Period>> { self.effectivePeriod.as_ref() }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn exposureVariant(&self) -> &Vector<Box<dyn Reference>> { &self.exposureVariant }
  fn exposureBackground(&self) -> &Box<dyn Reference> { &self.exposureBackground }
}

