use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ImmunizationRecommendation_Recommendation_DateCriterion {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) value: Date,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ImmunizationRecommendation_Recommendation {
  pub(crate) id?: String,
  pub(crate) series?: String,
  pub(crate) extension?: Extension,
  pub(crate) vaccineCode?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) targetDisease?: CodeableConcept,
  pub(crate) doseNumber?: u32 | String,
  pub(crate) forecastStatus: CodeableConcept,
  pub(crate) forecastReason?: CodeableConcept,
  pub(crate) seriesDoses?: u32 | String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) supportingImmunization?: Reference,
  pub(crate) contraindicatedVaccineCode?: CodeableConcept,
  pub(crate) supportingPatientInformation?: Reference,
  pub(crate) dateCriterion?: ImmunizationRecommendation_Recommendation_DateCriterion,
}

pub struct ImmunizationRecommendation {
  pub(crate) date: Date,
  pub(crate) patient: Reference,
  pub(crate) authority?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) recommendation: ImmunizationRecommendation_Recommendation,
}