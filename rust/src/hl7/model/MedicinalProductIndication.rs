use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductIndication_OtherTherapy {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) therapyRelationshipType: CodeableConcept,
}

pub struct MedicinalProductIndication {
  pub(crate) subject?: Reference,
  pub(crate) duration?: Quantity,
  pub(crate) population?: any,
  pub(crate) comorbidity?: CodeableConcept,
  pub(crate) diseaseStatus?: CodeableConcept,
  pub(crate) intendedEffect?: CodeableConcept,
  pub(crate) undesirableEffect?: Reference,
  pub(crate) diseaseSymptomProcedure?: CodeableConcept,
  pub(crate) otherTherapy?: MedicinalProductIndication_OtherTherapy,
}