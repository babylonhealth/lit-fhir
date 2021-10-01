use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SubstanceReferenceInformation_Gene {
  pub(crate) id?: String,
  pub(crate) gene?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) geneSequenceOrigin?: CodeableConcept,
}


pub struct SubstanceReferenceInformation_Target {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) target?: Identifier,
  pub(crate) source?: Reference,
  pub(crate) organism?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) amount?: Quantity | Range | String,
  pub(crate) amountType?: CodeableConcept,
  pub(crate) interaction?: CodeableConcept,
  pub(crate) organismType?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct SubstanceReferenceInformation_GeneElement {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) element?: Identifier,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct SubstanceReferenceInformation_Classification {
  pub(crate) id?: String,
  pub(crate) domain?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) subtype?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) classification?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct SubstanceReferenceInformation {
  pub(crate) comment?: String,
  pub(crate) gene?: SubstanceReferenceInformation_Gene,
  pub(crate) target?: SubstanceReferenceInformation_Target,
  pub(crate) geneElement?: SubstanceReferenceInformation_GeneElement,
  pub(crate) classification?: SubstanceReferenceInformation_Classification,
}