use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Medication_Batch {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) expirationDate: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Medication_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) item: CodeableConcept | Reference,
  pub(crate) isActive: Option<Boolean>,
  pub(crate) strength: Option<Ratio>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Medication {
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) form: Option<CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) amount: Option<Ratio>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) manufacturer: Option<Reference>,
  pub(crate) batch: Option<Medication_Batch>,
  pub(crate) ingredient: Vector<Medication_Ingredient>,
}