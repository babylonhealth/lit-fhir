use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_Characteristics {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod {
  pub(crate) id: Option<String>,
  pub(crate) value: Box<dyn Quantity>,
  pub(crate) tissue: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) supportingInformation: Option<String>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) withdrawalPeriod: Vector<MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_RouteOfAdministration {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) firstDose: Option<Box<dyn Quantity>>,
  pub(crate) maxSingleDose: Option<Box<dyn Quantity>>,
  pub(crate) maxDosePerDay: Option<Box<dyn Quantity>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) maxTreatmentPeriod: Option<Box<dyn Duration>>,
  pub(crate) maxDosePerTreatmentPeriod: Option<Box<dyn Ratio>>,
  pub(crate) targetSpecies: Vector<MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceuticalRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) device: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) ingredient: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) unitOfPresentation: Option<Box<dyn CodeableConcept>>,
  pub(crate) administrableDoseForm: Box<dyn CodeableConcept>,
  pub(crate) characteristics: Vector<MedicinalProductPharmaceutical_Characteristics>,
  pub(crate) routeOfAdministration: Vector<MedicinalProductPharmaceutical_RouteOfAdministration>,
}

pub trait MedicinalProductPharmaceutical : DomainResource {
  fn device(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn ingredient(&self) -> &Vector<Box<dyn Reference>>;
  fn unitOfPresentation(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn administrableDoseForm(&self) -> &Box<dyn CodeableConcept>;
  fn characteristics(&self) -> &Vector<MedicinalProductPharmaceutical_Characteristics>;
  fn routeOfAdministration(&self) -> &Vector<MedicinalProductPharmaceutical_RouteOfAdministration>;
}

dyn_clone::clone_trait_object!(MedicinalProductPharmaceutical);

impl FHIRObject for MedicinalProductPharmaceuticalRaw {
}

impl Resource for MedicinalProductPharmaceuticalRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicinalProductPharmaceuticalRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductPharmaceutical for MedicinalProductPharmaceuticalRaw {
  fn device(&self) -> &Vector<Box<dyn Reference>> { &self.device }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn ingredient(&self) -> &Vector<Box<dyn Reference>> { &self.ingredient }
  fn unitOfPresentation(&self) -> &Option<Box<dyn CodeableConcept>> { &self.unitOfPresentation }
  fn administrableDoseForm(&self) -> &Box<dyn CodeableConcept> { &self.administrableDoseForm }
  fn characteristics(&self) -> &Vector<MedicinalProductPharmaceutical_Characteristics> { &self.characteristics }
  fn routeOfAdministration(&self) -> &Vector<MedicinalProductPharmaceutical_RouteOfAdministration> { &self.routeOfAdministration }
}

