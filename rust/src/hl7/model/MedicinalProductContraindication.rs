use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductContraindication_OtherTherapy {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) medication: UnionCodeableConceptOrReference,
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