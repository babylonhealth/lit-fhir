use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionPositiveIntOrString;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation_Recommendation_DateCriterion {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) value: DateTime<FixedOffset>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation_Recommendation {
  pub(crate) id: Option<String>,
  pub(crate) series: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) vaccineCode: Vector<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) targetDisease: Option<CodeableConcept>,
  pub(crate) doseNumber: Option<UnionPositiveIntOrString>,
  pub(crate) forecastStatus: CodeableConcept,
  pub(crate) forecastReason: Vector<CodeableConcept>,
  pub(crate) seriesDoses: Option<UnionPositiveIntOrString>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) supportingImmunization: Vector<Reference>,
  pub(crate) contraindicatedVaccineCode: Vector<CodeableConcept>,
  pub(crate) supportingPatientInformation: Vector<Reference>,
  pub(crate) dateCriterion: Vector<ImmunizationRecommendation_Recommendation_DateCriterion>,
}

#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation {
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) patient: Box<Reference>,
  pub(crate) authority: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) recommendation: Vector<ImmunizationRecommendation_Recommendation>,
}