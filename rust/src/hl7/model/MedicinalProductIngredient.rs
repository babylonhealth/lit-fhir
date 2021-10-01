use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_Substance {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) strength: Vector<MedicinalProductIngredient_SpecifiedSubstance_Strength>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrength {
  pub(crate) id: Option<String>,
  pub(crate) country: Vector<CodeableConcept>,
  pub(crate) strength: Ratio,
  pub(crate) extension: Vector<Extension>,
  pub(crate) substance: Option<CodeableConcept>,
  pub(crate) strengthLowLimit: Option<Ratio>,
  pub(crate) measurementPoint: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_SpecifiedSubstance_Strength {
  pub(crate) id: Option<String>,
  pub(crate) country: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) presentation: Ratio,
  pub(crate) concentration: Option<Ratio>,
  pub(crate) measurementPoint: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) presentationLowLimit: Option<Ratio>,
  pub(crate) concentrationLowLimit: Option<Ratio>,
  pub(crate) referenceStrength: Vector<MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrength>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_SpecifiedSubstance {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) group: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) confidentiality: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) strength: Vector<MedicinalProductIngredient_SpecifiedSubstance_Strength>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient {
  pub(crate) role: CodeableConcept,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) manufacturer: Vector<Reference>,
  pub(crate) allergenicIndicator: Option<Boolean>,
  pub(crate) substance: Option<MedicinalProductIngredient_Substance>,
  pub(crate) specifiedSubstance: Vector<MedicinalProductIngredient_SpecifiedSubstance>,
}