use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionPositiveIntOrString;



#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation_Recommendation_DateCriterion {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) value: DateTime<FixedOffset>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation_Recommendation {
  pub(crate) id: Option<String>,
  pub(crate) series: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) vaccineCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) targetDisease: Option<Box<dyn CodeableConcept>>,
  pub(crate) doseNumber: Option<UnionPositiveIntOrString>,
  pub(crate) forecastStatus: Box<dyn CodeableConcept>,
  pub(crate) forecastReason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) seriesDoses: Option<UnionPositiveIntOrString>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) supportingImmunization: Vector<Box<dyn Reference>>,
  pub(crate) contraindicatedVaccineCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) supportingPatientInformation: Vector<Box<dyn Reference>>,
  pub(crate) dateCriterion: Vector<Box<ImmunizationRecommendation_Recommendation_DateCriterion>>,
}

#[derive(Clone, Debug)]
pub struct ImmunizationRecommendationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) authority: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) recommendation: Vector<Box<ImmunizationRecommendation_Recommendation>>,
}

pub trait ImmunizationRecommendation : DomainResource {
  fn date(&self) -> &DateTime<FixedOffset>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn authority(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn recommendation(&self) -> &Vector<Box<ImmunizationRecommendation_Recommendation>>;
}

dyn_clone::clone_trait_object!(ImmunizationRecommendation);

impl FHIRObject for ImmunizationRecommendationRaw {
}

impl Resource for ImmunizationRecommendationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ImmunizationRecommendationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ImmunizationRecommendation for ImmunizationRecommendationRaw {
  fn date(&self) -> &DateTime<FixedOffset> { &self.date }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn authority(&self) -> Option<&Box<dyn Reference>> { self.authority.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn recommendation(&self) -> &Vector<Box<ImmunizationRecommendation_Recommendation>> { &self.recommendation }
}

