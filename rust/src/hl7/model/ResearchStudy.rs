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
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ResearchStudy_Arm {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ResearchStudy_Objective {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ResearchStudyRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) site: Vector<Box<dyn Reference>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) title: Option<String>,
  pub(crate) phase: Option<Box<dyn CodeableConcept>>,
  pub(crate) focus: Vector<Box<dyn CodeableConcept>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) keyword: Vector<Box<dyn CodeableConcept>>,
  pub(crate) sponsor: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) protocol: Vector<Box<dyn Reference>>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) location: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) condition: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) enrollment: Vector<Box<dyn Reference>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) reasonStopped: Option<Box<dyn CodeableConcept>>,
  pub(crate) relatedArtifact: Vector<Box<dyn RelatedArtifact>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) primaryPurposeType: Option<Box<dyn CodeableConcept>>,
  pub(crate) principalInvestigator: Option<Box<dyn Reference>>,
  pub(crate) arm: Vector<Box<ResearchStudy_Arm>>,
  pub(crate) objective: Vector<Box<ResearchStudy_Objective>>,
}

pub trait ResearchStudy : DomainResource {
  fn site(&self) -> &Vector<Box<dyn Reference>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn title(&self) -> Option<&String>;
  fn phase(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn focus(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn keyword(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn sponsor(&self) -> Option<&Box<dyn Reference>>;
  fn protocol(&self) -> &Vector<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn location(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn condition(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn enrollment(&self) -> &Vector<Box<dyn Reference>>;
  fn description(&self) -> Option<&String>;
  fn reasonStopped(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>>;
  fn primaryPurposeType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn principalInvestigator(&self) -> Option<&Box<dyn Reference>>;
  fn arm(&self) -> &Vector<Box<ResearchStudy_Arm>>;
  fn objective(&self) -> &Vector<Box<ResearchStudy_Objective>>;
}

dyn_clone::clone_trait_object!(ResearchStudy);

impl FHIRObject for ResearchStudyRaw {
}

impl Resource for ResearchStudyRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ResearchStudyRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ResearchStudy for ResearchStudyRaw {
  fn site(&self) -> &Vector<Box<dyn Reference>> { &self.site }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn phase(&self) -> Option<&Box<dyn CodeableConcept>> { self.phase.as_ref() }
  fn focus(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.focus }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn keyword(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.keyword }
  fn sponsor(&self) -> Option<&Box<dyn Reference>> { self.sponsor.as_ref() }
  fn protocol(&self) -> &Vector<Box<dyn Reference>> { &self.protocol }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn location(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.location }
  fn condition(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.condition }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn enrollment(&self) -> &Vector<Box<dyn Reference>> { &self.enrollment }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn reasonStopped(&self) -> Option<&Box<dyn CodeableConcept>> { self.reasonStopped.as_ref() }
  fn relatedArtifact(&self) -> &Vector<Box<dyn RelatedArtifact>> { &self.relatedArtifact }
  fn primaryPurposeType(&self) -> Option<&Box<dyn CodeableConcept>> { self.primaryPurposeType.as_ref() }
  fn principalInvestigator(&self) -> Option<&Box<dyn Reference>> { self.principalInvestigator.as_ref() }
  fn arm(&self) -> &Vector<Box<ResearchStudy_Arm>> { &self.arm }
  fn objective(&self) -> &Vector<Box<ResearchStudy_Objective>> { &self.objective }
}

