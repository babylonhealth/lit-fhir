use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::MedicinalProductIngredient_SpecifiedSubstance_Strength::MedicinalProductIngredient_SpecifiedSubstance_Strength;
use crate::core::model::Meta::Meta;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) allergenicIndicator: Option<bool>,
  pub(crate) substance: Option<MedicinalProductIngredient_Substance>,
  pub(crate) specifiedSubstance: Vector<MedicinalProductIngredient_SpecifiedSubstance>,
}