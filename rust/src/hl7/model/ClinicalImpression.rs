use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct ClinicalImpression_Finding {
  pub(crate) id: Option<String>,
  pub(crate) basis: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) itemReference: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) itemCodeableConcept: Option<Box<dyn CodeableConcept>>,
}


#[derive(Clone, Debug)]
pub struct ClinicalImpression_Investigation {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) item: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ClinicalImpressionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) problem: Vector<Box<dyn Reference>>,
  pub(crate) summary: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) assessor: Option<Box<dyn Reference>>,
  pub(crate) previous: Option<Box<dyn Reference>>,
  pub(crate) protocol: Vector<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) effective: Option<UnionDateTimeOrPeriod>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) supportingInfo: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) prognosisReference: Vector<Box<dyn Reference>>,
  pub(crate) prognosisCodeableConcept: Vector<Box<dyn CodeableConcept>>,
  pub(crate) finding: Vector<Box<ClinicalImpression_Finding>>,
  pub(crate) investigation: Vector<Box<ClinicalImpression_Investigation>>,
}

pub trait ClinicalImpression : DomainResource {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn subject(&self) -> &Box<dyn Reference>;
  fn problem(&self) -> &Vector<Box<dyn Reference>>;
  fn summary(&self) -> Option<&String>;
  fn assessor(&self) -> Option<&Box<dyn Reference>>;
  fn previous(&self) -> Option<&Box<dyn Reference>>;
  fn protocol(&self) -> &Vector<String>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> Option<&String>;
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn effective(&self) -> Option<&UnionDateTimeOrPeriod>;
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>>;
  fn prognosisReference(&self) -> &Vector<Box<dyn Reference>>;
  fn prognosisCodeableConcept(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn finding(&self) -> &Vector<Box<ClinicalImpression_Finding>>;
  fn investigation(&self) -> &Vector<Box<ClinicalImpression_Investigation>>;
}

dyn_clone::clone_trait_object!(ClinicalImpression);

impl FHIRObject for ClinicalImpressionRaw {
}

impl Resource for ClinicalImpressionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ClinicalImpressionRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ClinicalImpression for ClinicalImpressionRaw {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>> { self.code.as_ref() }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn problem(&self) -> &Vector<Box<dyn Reference>> { &self.problem }
  fn summary(&self) -> Option<&String> { self.summary.as_ref() }
  fn assessor(&self) -> Option<&Box<dyn Reference>> { self.assessor.as_ref() }
  fn previous(&self) -> Option<&Box<dyn Reference>> { self.previous.as_ref() }
  fn protocol(&self) -> &Vector<String> { &self.protocol }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>> { self.statusReason.as_ref() }
  fn effective(&self) -> Option<&UnionDateTimeOrPeriod> { self.effective.as_ref() }
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInfo }
  fn prognosisReference(&self) -> &Vector<Box<dyn Reference>> { &self.prognosisReference }
  fn prognosisCodeableConcept(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.prognosisCodeableConcept }
  fn finding(&self) -> &Vector<Box<ClinicalImpression_Finding>> { &self.finding }
  fn investigation(&self) -> &Vector<Box<ClinicalImpression_Investigation>> { &self.investigation }
}

