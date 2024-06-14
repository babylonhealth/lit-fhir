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
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_Substance {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) strength: Vector<Box<MedicinalProductIngredient_SpecifiedSubstance_Strength>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrength {
  pub(crate) id: Option<String>,
  pub(crate) country: Vector<Box<dyn CodeableConcept>>,
  pub(crate) strength: Box<dyn Ratio>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) substance: Option<Box<dyn CodeableConcept>>,
  pub(crate) strengthLowLimit: Option<Box<dyn Ratio>>,
  pub(crate) measurementPoint: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_SpecifiedSubstance_Strength {
  pub(crate) id: Option<String>,
  pub(crate) country: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) presentation: Box<dyn Ratio>,
  pub(crate) concentration: Option<Box<dyn Ratio>>,
  pub(crate) measurementPoint: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) presentationLowLimit: Option<Box<dyn Ratio>>,
  pub(crate) concentrationLowLimit: Option<Box<dyn Ratio>>,
  pub(crate) referenceStrength: Vector<Box<MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrength>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIngredient_SpecifiedSubstance {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) group: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) confidentiality: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) strength: Vector<Box<MedicinalProductIngredient_SpecifiedSubstance_Strength>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIngredientRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) role: Box<dyn CodeableConcept>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) manufacturer: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) allergenicIndicator: Option<bool>,
  pub(crate) substance: Option<Box<MedicinalProductIngredient_Substance>>,
  pub(crate) specifiedSubstance: Vector<Box<MedicinalProductIngredient_SpecifiedSubstance>>,
}

pub trait MedicinalProductIngredient : DomainResource {
  fn role(&self) -> &Box<dyn CodeableConcept>;
  fn identifier(&self) -> Option<&Box<dyn Identifier>>;
  fn manufacturer(&self) -> &Vector<Box<dyn Reference>>;
  fn allergenicIndicator(&self) -> Option<&bool>;
  fn substance(&self) -> Option<&Box<MedicinalProductIngredient_Substance>>;
  fn specifiedSubstance(&self) -> &Vector<Box<MedicinalProductIngredient_SpecifiedSubstance>>;
}

dyn_clone::clone_trait_object!(MedicinalProductIngredient);

impl FHIRObject for MedicinalProductIngredientRaw {
}

impl Resource for MedicinalProductIngredientRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicinalProductIngredientRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductIngredient for MedicinalProductIngredientRaw {
  fn role(&self) -> &Box<dyn CodeableConcept> { &self.role }
  fn identifier(&self) -> Option<&Box<dyn Identifier>> { self.identifier.as_ref() }
  fn manufacturer(&self) -> &Vector<Box<dyn Reference>> { &self.manufacturer }
  fn allergenicIndicator(&self) -> Option<&bool> { self.allergenicIndicator.as_ref() }
  fn substance(&self) -> Option<&Box<MedicinalProductIngredient_Substance>> { self.substance.as_ref() }
  fn specifiedSubstance(&self) -> &Vector<Box<MedicinalProductIngredient_SpecifiedSubstance>> { &self.specifiedSubstance }
}

