use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MolecularSequence_Variant {
  pub(crate) id?: String,
  pub(crate) end?: i32,
  pub(crate) start?: i32,
  pub(crate) cigar?: String,
  pub(crate) extension?: Extension,
  pub(crate) observedAllele?: String,
  pub(crate) variantPointer?: Reference,
  pub(crate) referenceAllele?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct MolecularSequence_Repository {
  pub(crate) id?: String,
  pub(crate) url?: String,
  pub(crate) _type: String,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) datasetId?: String,
  pub(crate) readsetId?: String,
  pub(crate) variantsetId?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct MolecularSequence_Quality_Roc {
  pub(crate) id?: String,
  pub(crate) score?: i32,
  pub(crate) numTP?: i32,
  pub(crate) numFP?: i32,
  pub(crate) numFN?: i32,
  pub(crate) fMeasure?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) precision?: BigDecimal,
  pub(crate) sensitivity?: BigDecimal,
  pub(crate) modifierExtension?: Extension,
}

pub struct MolecularSequence_Quality {
  pub(crate) id?: String,
  pub(crate) end?: i32,
  pub(crate) _type: String,
  pub(crate) gtFP?: BigDecimal,
  pub(crate) start?: i32,
  pub(crate) score?: Quantity,
  pub(crate) method?: CodeableConcept,
  pub(crate) recall?: BigDecimal,
  pub(crate) fScore?: BigDecimal,
  pub(crate) truthTP?: BigDecimal,
  pub(crate) queryTP?: BigDecimal,
  pub(crate) truthFN?: BigDecimal,
  pub(crate) queryFP?: BigDecimal,
  pub(crate) extension?: Extension,
  pub(crate) precision?: BigDecimal,
  pub(crate) standardSequence?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) roc?: MolecularSequence_Quality_Roc,
}


pub struct MolecularSequence_ReferenceSeq {
  pub(crate) id?: String,
  pub(crate) strand?: String,
  pub(crate) extension?: Extension,
  pub(crate) windowEnd?: i32,
  pub(crate) chromosome?: CodeableConcept,
  pub(crate) genomeBuild?: String,
  pub(crate) orientation?: String,
  pub(crate) windowStart?: i32,
  pub(crate) referenceSeqId?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) referenceSeqString?: String,
  pub(crate) referenceSeqPointer?: Reference,
}


pub struct MolecularSequence_StructureVariant_Outer {
  pub(crate) id?: String,
  pub(crate) end?: i32,
  pub(crate) start?: i32,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct MolecularSequence_StructureVariant_Inner {
  pub(crate) id?: String,
  pub(crate) end?: i32,
  pub(crate) start?: i32,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct MolecularSequence_StructureVariant {
  pub(crate) id?: String,
  pub(crate) exact?: Boolean,
  pub(crate) length?: i32,
  pub(crate) extension?: Extension,
  pub(crate) variantType?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) outer?: MolecularSequence_StructureVariant_Outer,
  pub(crate) inner?: MolecularSequence_StructureVariant_Inner,
}

pub struct MolecularSequence {
  pub(crate) _type?: String,
  pub(crate) device?: Reference,
  pub(crate) patient?: Reference,
  pub(crate) pointer?: Reference,
  pub(crate) specimen?: Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) performer?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) observedSeq?: String,
  pub(crate) readCoverage?: i32,
  pub(crate) coordinateSystem: i32,
  pub(crate) variant?: MolecularSequence_Variant,
  pub(crate) repository?: MolecularSequence_Repository,
  pub(crate) quality?: MolecularSequence_Quality,
  pub(crate) referenceSeq?: MolecularSequence_ReferenceSeq,
  pub(crate) structureVariant?: MolecularSequence_StructureVariant,
}