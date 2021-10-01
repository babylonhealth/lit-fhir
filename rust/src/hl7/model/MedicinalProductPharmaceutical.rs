use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductPharmaceutical_Characteristics {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) status?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod {
  pub(crate) id?: String,
  pub(crate) value: Quantity,
  pub(crate) tissue: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) supportingInformation?: String,
}

pub struct MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) withdrawalPeriod?: MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriod,
}

pub struct MedicinalProductPharmaceutical_RouteOfAdministration {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) firstDose?: Quantity,
  pub(crate) maxSingleDose?: Quantity,
  pub(crate) maxDosePerDay?: Quantity,
  pub(crate) modifierExtension?: Extension,
  pub(crate) maxTreatmentPeriod?: Duration,
  pub(crate) maxDosePerTreatmentPeriod?: Ratio,
  pub(crate) targetSpecies?: MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies,
}

pub struct MedicinalProductPharmaceutical {
  pub(crate) device?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) ingredient?: Reference,
  pub(crate) unitOfPresentation?: CodeableConcept,
  pub(crate) administrableDoseForm: CodeableConcept,
  pub(crate) characteristics?: MedicinalProductPharmaceutical_Characteristics,
  pub(crate) routeOfAdministration: MedicinalProductPharmaceutical_RouteOfAdministration,
}