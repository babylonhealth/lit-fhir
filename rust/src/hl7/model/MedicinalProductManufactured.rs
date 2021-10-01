use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductManufactured {
  pub(crate) quantity: Quantity,
  pub(crate) ingredient: Vector<Reference>,
  pub(crate) manufacturer: Vector<Reference>,
  pub(crate) unitOfPresentation: Option<CodeableConcept>,
  pub(crate) manufacturedDoseForm: CodeableConcept,
  pub(crate) otherCharacteristics: Vector<CodeableConcept>,
  pub(crate) physicalCharacteristics: Option<any>,
}