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
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Timing::Timing;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionQuantityOrRatio;



#[derive(Clone, Debug)]
pub struct NutritionOrder_Supplement {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) schedule: Vector<Box<dyn Timing>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) productName: Option<String>,
  pub(crate) instruction: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct NutritionOrder_OralDiet_Texture {
  pub(crate) id: Option<String>,
  pub(crate) modifier: Option<Box<dyn CodeableConcept>>,
  pub(crate) foodType: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct NutritionOrder_OralDiet_Nutrient {
  pub(crate) id: Option<String>,
  pub(crate) amount: Option<Box<dyn Quantity>>,
  pub(crate) modifier: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct NutritionOrder_OralDiet {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) schedule: Vector<Box<dyn Timing>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) instruction: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) fluidConsistencyType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) texture: Vector<Box<NutritionOrder_OralDiet_Texture>>,
  pub(crate) nutrient: Vector<Box<NutritionOrder_OralDiet_Nutrient>>,
}


#[derive(Clone, Debug)]
pub struct NutritionOrder_EnteralFormula_Administration {
  pub(crate) id: Option<String>,
  pub(crate) rate: Option<UnionQuantityOrRatio>,
  pub(crate) schedule: Option<Box<dyn Timing>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct NutritionOrder_EnteralFormula {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) additiveType: Option<Box<dyn CodeableConcept>>,
  pub(crate) caloricDensity: Option<Box<dyn Quantity>>,
  pub(crate) baseFormulaType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) maxVolumeToDeliver: Option<Box<dyn Quantity>>,
  pub(crate) additiveProductName: Option<String>,
  pub(crate) routeofAdministration: Option<Box<dyn CodeableConcept>>,
  pub(crate) baseFormulaProductName: Option<String>,
  pub(crate) administrationInstruction: Option<String>,
  pub(crate) administration: Vector<Box<NutritionOrder_EnteralFormula_Administration>>,
}

#[derive(Clone, Debug)]
pub struct NutritionOrderRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) orderer: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) dateTime: DateTime<FixedOffset>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) allergyIntolerance: Vector<Box<dyn Reference>>,
  pub(crate) excludeFoodModifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) foodPreferenceModifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) supplement: Vector<Box<NutritionOrder_Supplement>>,
  pub(crate) oralDiet: Option<Box<NutritionOrder_OralDiet>>,
  pub(crate) enteralFormula: Option<Box<NutritionOrder_EnteralFormula>>,
}

pub trait NutritionOrder : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn intent(&self) -> &String;
  fn patient(&self) -> &Box<dyn Reference>;
  fn orderer(&self) -> &Option<Box<dyn Reference>>;
  fn dateTime(&self) -> &DateTime<FixedOffset>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn instantiates(&self) -> &Vector<String>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn allergyIntolerance(&self) -> &Vector<Box<dyn Reference>>;
  fn excludeFoodModifier(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn foodPreferenceModifier(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn supplement(&self) -> &Vector<Box<NutritionOrder_Supplement>>;
  fn oralDiet(&self) -> &Option<Box<NutritionOrder_OralDiet>>;
  fn enteralFormula(&self) -> &Option<Box<NutritionOrder_EnteralFormula>>;
}

dyn_clone::clone_trait_object!(NutritionOrder);

impl FHIRObject for NutritionOrderRaw {
}

impl Resource for NutritionOrderRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for NutritionOrderRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl NutritionOrder for NutritionOrderRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn orderer(&self) -> &Option<Box<dyn Reference>> { &self.orderer }
  fn dateTime(&self) -> &DateTime<FixedOffset> { &self.dateTime }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn instantiates(&self) -> &Vector<String> { &self.instantiates }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn allergyIntolerance(&self) -> &Vector<Box<dyn Reference>> { &self.allergyIntolerance }
  fn excludeFoodModifier(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.excludeFoodModifier }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn foodPreferenceModifier(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.foodPreferenceModifier }
  fn supplement(&self) -> &Vector<Box<NutritionOrder_Supplement>> { &self.supplement }
  fn oralDiet(&self) -> &Option<Box<NutritionOrder_OralDiet>> { &self.oralDiet }
  fn enteralFormula(&self) -> &Option<Box<NutritionOrder_EnteralFormula>> { &self.enteralFormula }
}

