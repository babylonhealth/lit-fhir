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
use crate::hl7::model::UnionAliases::UnionDecimalOrRange;
use crate::hl7::model::UnionAliases::UnionPeriodOrRange;



#[derive(Clone, Debug)]
pub struct RiskAssessment_Prediction {
  pub(crate) id: Option<String>,
  pub(crate) outcome: Option<Box<dyn CodeableConcept>>,
  pub(crate) when: Option<UnionPeriodOrRange>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) rationale: Option<String>,
  pub(crate) relativeRisk: Option<BigDecimal>,
  pub(crate) probability: Option<UnionDecimalOrRange>,
  pub(crate) qualitativeRisk: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct RiskAssessmentRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) basis: Vector<Box<dyn Reference>>,
  pub(crate) parent: Option<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) basedOn: Option<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) condition: Option<Box<dyn Reference>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) mitigation: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriod>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) prediction: Vector<Box<RiskAssessment_Prediction>>,
}

pub trait RiskAssessment : DomainResource {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn basis(&self) -> &Vector<Box<dyn Reference>>;
  fn parent(&self) -> Option<&Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn method(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn basedOn(&self) -> Option<&Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn condition(&self) -> Option<&Box<dyn Reference>>;
  fn performer(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn mitigation(&self) -> Option<&String>;
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriod>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn prediction(&self) -> &Vector<Box<RiskAssessment_Prediction>>;
}

dyn_clone::clone_trait_object!(RiskAssessment);

impl FHIRObject for RiskAssessmentRaw {
}

impl Resource for RiskAssessmentRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for RiskAssessmentRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl RiskAssessment for RiskAssessmentRaw {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>> { self.code.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn basis(&self) -> &Vector<Box<dyn Reference>> { &self.basis }
  fn parent(&self) -> Option<&Box<dyn Reference>> { self.parent.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn method(&self) -> Option<&Box<dyn CodeableConcept>> { self.method.as_ref() }
  fn basedOn(&self) -> Option<&Box<dyn Reference>> { self.basedOn.as_ref() }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn condition(&self) -> Option<&Box<dyn Reference>> { self.condition.as_ref() }
  fn performer(&self) -> Option<&Box<dyn Reference>> { self.performer.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn mitigation(&self) -> Option<&String> { self.mitigation.as_ref() }
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriod> { self.occurrence.as_ref() }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn prediction(&self) -> &Vector<Box<RiskAssessment_Prediction>> { &self.prediction }
}

