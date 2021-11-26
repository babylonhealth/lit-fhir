use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Duration::Duration;
use crate::core::model::Ratio::Ratio;



#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_Characteristics {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod {
  pub(crate) id: Option<String>,
  pub(crate) value: Quantity,
  pub(crate) tissue: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) supportingInformation: Option<String>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) withdrawalPeriod: Vector<MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical_RouteOfAdministration {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) firstDose: Option<Quantity>,
  pub(crate) maxSingleDose: Option<Quantity>,
  pub(crate) maxDosePerDay: Option<Quantity>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) maxTreatmentPeriod: Option<Duration>,
  pub(crate) maxDosePerTreatmentPeriod: Option<Ratio>,
  pub(crate) targetSpecies: Vector<MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductPharmaceutical {
  pub(crate) device: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) ingredient: Vector<Reference>,
  pub(crate) unitOfPresentation: Option<CodeableConcept>,
  pub(crate) administrableDoseForm: CodeableConcept,
  pub(crate) characteristics: Vector<MedicinalProductPharmaceutical_Characteristics>,
  pub(crate) routeOfAdministration: Vector<MedicinalProductPharmaceutical_RouteOfAdministration>,
}