use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductContraindication_OtherTherapy {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) therapyRelationshipType: CodeableConcept,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductContraindication {
  pub(crate) subject: Vector<Reference>,
  pub(crate) disease: Option<CodeableConcept>,
  pub(crate) population: Vector<any>,
  pub(crate) comorbidity: Vector<CodeableConcept>,
  pub(crate) diseaseStatus: Option<CodeableConcept>,
  pub(crate) therapeuticIndication: Vector<Reference>,
  pub(crate) otherTherapy: Vector<MedicinalProductContraindication_OtherTherapy>,
}