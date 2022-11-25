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
use crate::hl7::model::UnionAliases::Union01474038381;



#[derive(Clone, Debug)]
pub struct AllergyIntolerance_Reaction {
  pub(crate) id: Option<String>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) onset: Option<DateTime<FixedOffset>>,
  pub(crate) severity: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) substance: Option<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) manifestation: Vector<Box<dyn CodeableConcept>>,
  pub(crate) exposureRoute: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct AllergyIntoleranceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<String>,
  pub(crate) onset: Option<Union01474038381>,
  pub(crate) recorder: Option<Box<dyn Reference>>,
  pub(crate) asserter: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) criticality: Option<String>,
  pub(crate) recordedDate: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) clinicalStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) lastOccurrence: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) verificationStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) reaction: Vector<Box<AllergyIntolerance_Reaction>>,
}

pub trait AllergyIntolerance : DomainResource {
  fn _type(&self) -> Option<&String>;
  fn code(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn category(&self) -> &Vector<String>;
  fn onset(&self) -> Option<&Union01474038381>;
  fn recorder(&self) -> Option<&Box<dyn Reference>>;
  fn asserter(&self) -> Option<&Box<dyn Reference>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn criticality(&self) -> Option<&String>;
  fn recordedDate(&self) -> Option<&DateTime<FixedOffset>>;
  fn clinicalStatus(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn lastOccurrence(&self) -> Option<&DateTime<FixedOffset>>;
  fn verificationStatus(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn reaction(&self) -> &Vector<Box<AllergyIntolerance_Reaction>>;
}

dyn_clone::clone_trait_object!(AllergyIntolerance);

impl FHIRObject for AllergyIntoleranceRaw {
}

impl Resource for AllergyIntoleranceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for AllergyIntoleranceRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl AllergyIntolerance for AllergyIntoleranceRaw {
  fn _type(&self) -> Option<&String> { self._type.as_ref() }
  fn code(&self) -> Option<&Box<dyn CodeableConcept>> { self.code.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn category(&self) -> &Vector<String> { &self.category }
  fn onset(&self) -> Option<&Union01474038381> { self.onset.as_ref() }
  fn recorder(&self) -> Option<&Box<dyn Reference>> { self.recorder.as_ref() }
  fn asserter(&self) -> Option<&Box<dyn Reference>> { self.asserter.as_ref() }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn criticality(&self) -> Option<&String> { self.criticality.as_ref() }
  fn recordedDate(&self) -> Option<&DateTime<FixedOffset>> { self.recordedDate.as_ref() }
  fn clinicalStatus(&self) -> Option<&Box<dyn CodeableConcept>> { self.clinicalStatus.as_ref() }
  fn lastOccurrence(&self) -> Option<&DateTime<FixedOffset>> { self.lastOccurrence.as_ref() }
  fn verificationStatus(&self) -> Option<&Box<dyn CodeableConcept>> { self.verificationStatus.as_ref() }
  fn reaction(&self) -> &Vector<Box<AllergyIntolerance_Reaction>> { &self.reaction }
}

