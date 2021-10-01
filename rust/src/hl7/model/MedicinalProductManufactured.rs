use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductManufactured {
  pub(crate) quantity: Quantity,
  pub(crate) ingredient?: Reference,
  pub(crate) manufacturer?: Reference,
  pub(crate) unitOfPresentation?: CodeableConcept,
  pub(crate) manufacturedDoseForm: CodeableConcept,
  pub(crate) otherCharacteristics?: CodeableConcept,
  pub(crate) physicalCharacteristics?: any,
}