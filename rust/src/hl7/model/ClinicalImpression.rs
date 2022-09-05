use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) finding: Vector<ClinicalImpression_Finding>,
  pub(crate) investigation: Vector<ClinicalImpression_Investigation>,
}

pub trait ClinicalImpression : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn subject(&self) -> &Box<dyn Reference>;
  fn problem(&self) -> &Vector<Box<dyn Reference>>;
  fn summary(&self) -> &Option<String>;
  fn assessor(&self) -> &Option<Box<dyn Reference>>;
  fn previous(&self) -> &Option<Box<dyn Reference>>;
  fn protocol(&self) -> &Vector<String>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> &Option<String>;
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn effective(&self) -> &Option<UnionDateTimeOrPeriod>;
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>>;
  fn prognosisReference(&self) -> &Vector<Box<dyn Reference>>;
  fn prognosisCodeableConcept(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn finding(&self) -> &Vector<ClinicalImpression_Finding>;
  fn investigation(&self) -> &Vector<ClinicalImpression_Investigation>;
}

dyn_clone::clone_trait_object!(ClinicalImpression);

impl FHIRObject for ClinicalImpressionRaw {
}

impl Resource for ClinicalImpressionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ClinicalImpressionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ClinicalImpression for ClinicalImpressionRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn problem(&self) -> &Vector<Box<dyn Reference>> { &self.problem }
  fn summary(&self) -> &Option<String> { &self.summary }
  fn assessor(&self) -> &Option<Box<dyn Reference>> { &self.assessor }
  fn previous(&self) -> &Option<Box<dyn Reference>> { &self.previous }
  fn protocol(&self) -> &Vector<String> { &self.protocol }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> &Option<String> { &self.description }
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.statusReason }
  fn effective(&self) -> &Option<UnionDateTimeOrPeriod> { &self.effective }
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInfo }
  fn prognosisReference(&self) -> &Vector<Box<dyn Reference>> { &self.prognosisReference }
  fn prognosisCodeableConcept(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.prognosisCodeableConcept }
  fn finding(&self) -> &Vector<ClinicalImpression_Finding> { &self.finding }
  fn investigation(&self) -> &Vector<ClinicalImpression_Investigation> { &self.investigation }
}

