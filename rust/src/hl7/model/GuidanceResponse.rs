use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionCanonicalOrCodeableConceptOrUri;



#[derive(Clone, Debug)]
pub struct GuidanceResponseRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) result: Option<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) module: UnionCanonicalOrCodeableConceptOrUri,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) dataRequirement: Vector<Box<dyn DataRequirement>>,
  pub(crate) outputParameters: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) requestIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) evaluationMessage: Vector<Box<dyn Reference>>,
  pub(crate) occurrenceDateTime: Option<DateTime<FixedOffset>>,
}

pub trait GuidanceResponse : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn result(&self) -> Option<&Box<dyn Reference>>;
  fn subject(&self) -> Option<&Box<dyn Reference>>;
  fn module(&self) -> &UnionCanonicalOrCodeableConceptOrUri;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn performer(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn dataRequirement(&self) -> &Vector<Box<dyn DataRequirement>>;
  fn outputParameters(&self) -> Option<&Box<dyn Reference>>;
  fn requestIdentifier(&self) -> Option<&Box<dyn Identifier>>;
  fn evaluationMessage(&self) -> &Vector<Box<dyn Reference>>;
  fn occurrenceDateTime(&self) -> Option<&DateTime<FixedOffset>>;
}

dyn_clone::clone_trait_object!(GuidanceResponse);

impl FHIRObject for GuidanceResponseRaw {
}

impl Resource for GuidanceResponseRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for GuidanceResponseRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl GuidanceResponse for GuidanceResponseRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn result(&self) -> Option<&Box<dyn Reference>> { self.result.as_ref() }
  fn subject(&self) -> Option<&Box<dyn Reference>> { self.subject.as_ref() }
  fn module(&self) -> &UnionCanonicalOrCodeableConceptOrUri { &self.module }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn performer(&self) -> Option<&Box<dyn Reference>> { self.performer.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn dataRequirement(&self) -> &Vector<Box<dyn DataRequirement>> { &self.dataRequirement }
  fn outputParameters(&self) -> Option<&Box<dyn Reference>> { self.outputParameters.as_ref() }
  fn requestIdentifier(&self) -> Option<&Box<dyn Identifier>> { self.requestIdentifier.as_ref() }
  fn evaluationMessage(&self) -> &Vector<Box<dyn Reference>> { &self.evaluationMessage }
  fn occurrenceDateTime(&self) -> Option<&DateTime<FixedOffset>> { self.occurrenceDateTime.as_ref() }
}

