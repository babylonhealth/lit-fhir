use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductContraindication_OtherTherapy {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) therapyRelationshipType: CodeableConcept,
}

pub struct MedicinalProductContraindication {
  pub(crate) subject?: Reference,
  pub(crate) disease?: CodeableConcept,
  pub(crate) population?: any,
  pub(crate) comorbidity?: CodeableConcept,
  pub(crate) diseaseStatus?: CodeableConcept,
  pub(crate) therapeuticIndication?: Reference,
  pub(crate) otherTherapy?: MedicinalProductContraindication_OtherTherapy,
}