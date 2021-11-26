use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionQuantityOrRangeOrString;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_Gene {
  pub(crate) id: Option<String>,
  pub(crate) gene: Option<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) geneSequenceOrigin: Option<CodeableConcept>,
}


#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_Target {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) target: Option<Identifier>,
  pub(crate) source: Vector<Reference>,
  pub(crate) organism: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) amount: Option<UnionQuantityOrRangeOrString>,
  pub(crate) amountType: Option<CodeableConcept>,
  pub(crate) interaction: Option<CodeableConcept>,
  pub(crate) organismType: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_GeneElement {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) element: Option<Identifier>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_Classification {
  pub(crate) id: Option<String>,
  pub(crate) domain: Option<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) subtype: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) classification: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation {
  pub(crate) comment: Option<String>,
  pub(crate) gene: Vector<SubstanceReferenceInformation_Gene>,
  pub(crate) target: Vector<SubstanceReferenceInformation_Target>,
  pub(crate) geneElement: Vector<SubstanceReferenceInformation_GeneElement>,
  pub(crate) classification: Vector<SubstanceReferenceInformation_Classification>,
}