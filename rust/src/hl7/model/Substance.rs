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
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Substance_Instance {
  pub(crate) id: Option<String>,
  pub(crate) expiry: Option<DateTime<FixedOffset>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Substance_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Box<dyn Ratio>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) substance: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubstanceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instance: Vector<Box<Substance_Instance>>,
  pub(crate) ingredient: Vector<Box<Substance_Ingredient>>,
}

pub trait Substance : DomainResource {
  fn code(&self) -> &Box<dyn CodeableConcept>;
  fn status(&self) -> Option<&String>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> Option<&String>;
  fn instance(&self) -> &Vector<Box<Substance_Instance>>;
  fn ingredient(&self) -> &Vector<Box<Substance_Ingredient>>;
}

dyn_clone::clone_trait_object!(Substance);

impl FHIRObject for SubstanceRaw {
}

impl Resource for SubstanceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for SubstanceRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Substance for SubstanceRaw {
  fn code(&self) -> &Box<dyn CodeableConcept> { &self.code }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn instance(&self) -> &Vector<Box<Substance_Instance>> { &self.instance }
  fn ingredient(&self) -> &Vector<Box<Substance_Ingredient>> { &self.ingredient }
}

