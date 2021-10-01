use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct NutritionOrder_Supplement {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) schedule: Vector<Timing>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) productName: Option<String>,
  pub(crate) instruction: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct NutritionOrder_OralDiet_Texture {
  pub(crate) id: Option<String>,
  pub(crate) modifier: Option<CodeableConcept>,
  pub(crate) foodType: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct NutritionOrder_OralDiet_Nutrient {
  pub(crate) id: Option<String>,
  pub(crate) amount: Option<Quantity>,
  pub(crate) modifier: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct NutritionOrder_OralDiet {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) schedule: Vector<Timing>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) instruction: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) fluidConsistencyType: Vector<CodeableConcept>,
  pub(crate) texture: Vector<NutritionOrder_OralDiet_Texture>,
  pub(crate) nutrient: Vector<NutritionOrder_OralDiet_Nutrient>,
}


#[derive(Clone, Debug)]
pub struct NutritionOrder_EnteralFormula_Administration {
  pub(crate) id: Option<String>,
  pub(crate) rate: Option<Quantity | Ratio>,
  pub(crate) schedule: Option<Timing>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct NutritionOrder_EnteralFormula {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) additiveType: Option<CodeableConcept>,
  pub(crate) caloricDensity: Option<Quantity>,
  pub(crate) baseFormulaType: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) maxVolumeToDeliver: Option<Quantity>,
  pub(crate) additiveProductName: Option<String>,
  pub(crate) routeofAdministration: Option<CodeableConcept>,
  pub(crate) baseFormulaProductName: Option<String>,
  pub(crate) administrationInstruction: Option<String>,
  pub(crate) administration: Vector<NutritionOrder_EnteralFormula_Administration>,
}

#[derive(Clone, Debug)]
pub struct NutritionOrder {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) patient: Reference,
  pub(crate) orderer: Option<Reference>,
  pub(crate) dateTime: Date,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) allergyIntolerance: Vector<Reference>,
  pub(crate) excludeFoodModifier: Vector<CodeableConcept>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) foodPreferenceModifier: Vector<CodeableConcept>,
  pub(crate) supplement: Vector<NutritionOrder_Supplement>,
  pub(crate) oralDiet: Option<NutritionOrder_OralDiet>,
  pub(crate) enteralFormula: Option<NutritionOrder_EnteralFormula>,
}