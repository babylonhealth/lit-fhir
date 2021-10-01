use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct NutritionOrder_Supplement {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) schedule?: Timing,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) productName?: String,
  pub(crate) instruction?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct NutritionOrder_OralDiet_Texture {
  pub(crate) id?: String,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) foodType?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct NutritionOrder_OralDiet_Nutrient {
  pub(crate) id?: String,
  pub(crate) amount?: Quantity,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct NutritionOrder_OralDiet {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) schedule?: Timing,
  pub(crate) extension?: Extension,
  pub(crate) instruction?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) fluidConsistencyType?: CodeableConcept,
  pub(crate) texture?: NutritionOrder_OralDiet_Texture,
  pub(crate) nutrient?: NutritionOrder_OralDiet_Nutrient,
}


pub struct NutritionOrder_EnteralFormula_Administration {
  pub(crate) id?: String,
  pub(crate) rate?: Quantity | Ratio,
  pub(crate) schedule?: Timing,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct NutritionOrder_EnteralFormula {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) additiveType?: CodeableConcept,
  pub(crate) caloricDensity?: Quantity,
  pub(crate) baseFormulaType?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) maxVolumeToDeliver?: Quantity,
  pub(crate) additiveProductName?: String,
  pub(crate) routeofAdministration?: CodeableConcept,
  pub(crate) baseFormulaProductName?: String,
  pub(crate) administrationInstruction?: String,
  pub(crate) administration?: NutritionOrder_EnteralFormula_Administration,
}

pub struct NutritionOrder {
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) patient: Reference,
  pub(crate) orderer?: Reference,
  pub(crate) dateTime: Date,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) instantiates?: String,
  pub(crate) instantiatesUri?: String,
  pub(crate) allergyIntolerance?: Reference,
  pub(crate) excludeFoodModifier?: CodeableConcept,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) foodPreferenceModifier?: CodeableConcept,
  pub(crate) supplement?: NutritionOrder_Supplement,
  pub(crate) oralDiet?: NutritionOrder_OralDiet,
  pub(crate) enteralFormula?: NutritionOrder_EnteralFormula,
}