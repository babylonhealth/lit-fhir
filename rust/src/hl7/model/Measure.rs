use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Expression::Expression;
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



#[derive(Clone, Debug)]
pub struct Measure_SupplementalData {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) usage: Vector<Box<dyn CodeableConcept>>,
  pub(crate) criteria: Box<dyn Expression>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Measure_Group_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) criteria: Box<dyn Expression>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Measure_Group_Stratifier_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) criteria: Box<dyn Expression>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Measure_Group_Stratifier {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) criteria: Option<Box<dyn Expression>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) component: Vector<Box<Measure_Group_Stratifier_Component>>,
}

#[derive(Clone, Debug)]
pub struct Measure_Group {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) population: Vector<Box<Measure_Group_Population>>,
  pub(crate) stratifier: Vector<Box<Measure_Group_Stratifier>>,
}

#[derive(Clone, Debug)]
pub struct MeasureRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
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
  pub(crate) scoring: Option<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<Box<dyn ContactDetail>>,
  pub(crate) endorser: Vector<Box<dyn ContactDetail>>,
  pub(crate) guidance: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) rationale: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) disclaimer: Option<String>,
  pub(crate) definition: Vector<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<LocalDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastReviewDate: Option<LocalDate>,
  pub(crate) riskAdjustment: Option<String>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) rateAggregation: Option<String>,
  pub(crate) compositeScoring: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) improvementNotation: Option<Box<dyn CodeableConcept>>,
  pub(crate) clinicalRecommendationStatement: Option<String>,
  pub(crate) supplementalData: Vector<Box<Measure_SupplementalData>>,
  pub(crate) group: Vector<Box<Measure_Group>>,
}

pub trait Measure : DomainResource {
  fn url(&self) -> Option<&String>;
  fn name(&self) -> Option<&String>;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn title(&self) -> Option<&String>;
  fn usage(&self) -> Option<&String>;
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> Option<&String>;
  fn library(&self) -> &Vector<String>;
  fn scoring(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn subtitle(&self) -> Option<&String>;
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn guidance(&self) -> Option<&String>;
  fn publisher(&self) -> Option<&String>;
  fn copyright(&self) -> Option<&String>;
  fn rationale(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn subject(&self) -> Option<&UnionCodeableConceptOrReference>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn disclaimer(&self) -> Option<&String>;
  fn definition(&self) -> &Vector<String>;
  fn description(&self) -> Option<&String>;
  fn experimental(&self) -> Option<&bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> Option<&LocalDate>;
  fn lastReviewDate(&self) -> Option<&LocalDate>;
  fn riskAdjustment(&self) -> Option<&String>;
  fn effectivePeriod(&self) -> Option<&Box<dyn Period>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn rateAggregation(&self) -> Option<&String>;
  fn compositeScoring(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn improvementNotation(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn clinicalRecommendationStatement(&self) -> Option<&String>;
  fn supplementalData(&self) -> &Vector<Box<Measure_SupplementalData>>;
  fn group(&self) -> &Vector<Box<Measure_Group>>;
}

dyn_clone::clone_trait_object!(Measure);

impl FHIRObject for MeasureRaw {
}

impl Resource for MeasureRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MeasureRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Measure for MeasureRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn usage(&self) -> Option<&String> { self.usage.as_ref() }
  fn topic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.topic }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn ContactDetail>> { &self.author }
  fn editor(&self) -> &Vector<Box<dyn ContactDetail>> { &self.editor }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> Option<&String> { self.purpose.as_ref() }
  fn library(&self) -> &Vector<String> { &self.library }
  fn scoring(&self) -> Option<&Box<dyn CodeableConcept>> { self.scoring.as_ref() }
  fn subtitle(&self) -> Option<&String> { self.subtitle.as_ref() }
  fn reviewer(&self) -> &Vector<Box<dyn ContactDetail>> { &self.reviewer }
  fn endorser(&self) -> &Vector<Box<dyn ContactDetail>> { &self.endorser }
  fn guidance(&self) -> Option<&String> { self.guidance.as_ref() }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn rationale(&self) -> Option<&String> { self.rationale.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn subject(&self) -> Option<&UnionCodeableConceptOrReference> { self.subject.as_ref() }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn disclaimer(&self) -> Option<&String> { self.disclaimer.as_ref() }
  fn definition(&self) -> &Vector<String> { &self.definition }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> Option<&LocalDate> { self.approvalDate.as_ref() }
  fn lastReviewDate(&self) -> Option<&LocalDate> { self.lastReviewDate.as_ref() }
  fn riskAdjustment(&self) -> Option<&String> { self.riskAdjustment.as_ref() }
  fn effectivePeriod(&self) -> Option<&Box<dyn Period>> { self.effectivePeriod.as_ref() }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn rateAggregation(&self) -> Option<&String> { self.rateAggregation.as_ref() }
  fn compositeScoring(&self) -> Option<&Box<dyn CodeableConcept>> { self.compositeScoring.as_ref() }
  fn improvementNotation(&self) -> Option<&Box<dyn CodeableConcept>> { self.improvementNotation.as_ref() }
  fn clinicalRecommendationStatement(&self) -> Option<&String> { self.clinicalRecommendationStatement.as_ref() }
  fn supplementalData(&self) -> &Vector<Box<Measure_SupplementalData>> { &self.supplementalData }
  fn group(&self) -> &Vector<Box<Measure_Group>> { &self.group }
}

