use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductIngredient_Substance {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) strength?: MedicinalProductIngredient_SpecifiedSubstance_Strength,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrength {
  pub(crate) id?: String,
  pub(crate) country?: CodeableConcept,
  pub(crate) strength: Ratio,
  pub(crate) extension?: Extension,
  pub(crate) substance?: CodeableConcept,
  pub(crate) strengthLowLimit?: Ratio,
  pub(crate) measurementPoint?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicinalProductIngredient_SpecifiedSubstance_Strength {
  pub(crate) id?: String,
  pub(crate) country?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) presentation: Ratio,
  pub(crate) concentration?: Ratio,
  pub(crate) measurementPoint?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) presentationLowLimit?: Ratio,
  pub(crate) concentrationLowLimit?: Ratio,
  pub(crate) referenceStrength?: MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrength,
}

pub struct MedicinalProductIngredient_SpecifiedSubstance {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) group: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) confidentiality?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) strength?: MedicinalProductIngredient_SpecifiedSubstance_Strength,
}

pub struct MedicinalProductIngredient {
  pub(crate) role: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) manufacturer?: Reference,
  pub(crate) allergenicIndicator?: Boolean,
  pub(crate) substance?: MedicinalProductIngredient_Substance,
  pub(crate) specifiedSubstance?: MedicinalProductIngredient_SpecifiedSubstance,
}