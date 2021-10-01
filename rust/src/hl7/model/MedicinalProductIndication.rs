use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductIndication_OtherTherapy {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) medication: CodeableConcept | Reference,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) therapyRelationshipType: CodeableConcept,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIndication {
  pub(crate) subject: Vector<Reference>,
  pub(crate) duration: Option<Quantity>,
  pub(crate) population: Vector<any>,
  pub(crate) comorbidity: Vector<CodeableConcept>,
  pub(crate) diseaseStatus: Option<CodeableConcept>,
  pub(crate) intendedEffect: Option<CodeableConcept>,
  pub(crate) undesirableEffect: Vector<Reference>,
  pub(crate) diseaseSymptomProcedure: Option<CodeableConcept>,
  pub(crate) otherTherapy: Vector<MedicinalProductIndication_OtherTherapy>,
}