use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation_Recommendation_DateCriterion {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) value: Date,
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
  pub(crate) doseNumber: Option<u32 | String>,
  pub(crate) forecastStatus: CodeableConcept,
  pub(crate) forecastReason: Vector<CodeableConcept>,
  pub(crate) seriesDoses: Option<u32 | String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) supportingImmunization: Vector<Reference>,
  pub(crate) contraindicatedVaccineCode: Vector<CodeableConcept>,
  pub(crate) supportingPatientInformation: Vector<Reference>,
  pub(crate) dateCriterion: Vector<ImmunizationRecommendation_Recommendation_DateCriterion>,
}

#[derive(Clone, Debug)]
pub struct ImmunizationRecommendation {
  pub(crate) date: Date,
  pub(crate) patient: Reference,
  pub(crate) authority: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) recommendation: Vector<ImmunizationRecommendation_Recommendation>,
}