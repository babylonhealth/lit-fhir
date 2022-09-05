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
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Medication_Batch {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) expirationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Medication_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
  pub(crate) isActive: Option<bool>,
  pub(crate) strength: Option<Box<dyn Ratio>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) form: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<String>,
  pub(crate) amount: Option<Box<dyn Ratio>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) manufacturer: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) batch: Option<Box<Medication_Batch>>,
  pub(crate) ingredient: Vector<Box<Medication_Ingredient>>,
}

pub trait Medication : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn form(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &Option<String>;
  fn amount(&self) -> &Option<Box<dyn Ratio>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn manufacturer(&self) -> &Option<Box<dyn Reference>>;
  fn batch(&self) -> &Option<Box<Medication_Batch>>;
  fn ingredient(&self) -> &Vector<Box<Medication_Ingredient>>;
}

dyn_clone::clone_trait_object!(Medication);

impl FHIRObject for MedicationRaw {
}

impl Resource for MedicationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Medication for MedicationRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn form(&self) -> &Option<Box<dyn CodeableConcept>> { &self.form }
  fn status(&self) -> &Option<String> { &self.status }
  fn amount(&self) -> &Option<Box<dyn Ratio>> { &self.amount }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn manufacturer(&self) -> &Option<Box<dyn Reference>> { &self.manufacturer }
  fn batch(&self) -> &Option<Box<Medication_Batch>> { &self.batch }
  fn ingredient(&self) -> &Vector<Box<Medication_Ingredient>> { &self.ingredient }
}

