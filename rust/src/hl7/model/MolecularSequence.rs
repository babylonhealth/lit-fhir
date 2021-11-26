use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MolecularSequence_Variant {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) start: Option<i32>,
  pub(crate) cigar: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) observedAllele: Option<String>,
  pub(crate) variantPointer: Option<Box<Reference>>,
  pub(crate) referenceAllele: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_Repository {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) datasetId: Option<String>,
  pub(crate) readsetId: Option<String>,
  pub(crate) variantsetId: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_Quality_Roc {
  pub(crate) id: Option<String>,
  pub(crate) score: Vector<i32>,
  pub(crate) numTP: Vector<i32>,
  pub(crate) numFP: Vector<i32>,
  pub(crate) numFN: Vector<i32>,
  pub(crate) fMeasure: Vector<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) precision: Vector<BigDecimal>,
  pub(crate) sensitivity: Vector<BigDecimal>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MolecularSequence_Quality {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) _type: String,
  pub(crate) gtFP: Option<BigDecimal>,
  pub(crate) start: Option<i32>,
  pub(crate) score: Option<Quantity>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) recall: Option<BigDecimal>,
  pub(crate) fScore: Option<BigDecimal>,
  pub(crate) truthTP: Option<BigDecimal>,
  pub(crate) queryTP: Option<BigDecimal>,
  pub(crate) truthFN: Option<BigDecimal>,
  pub(crate) queryFP: Option<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) precision: Option<BigDecimal>,
  pub(crate) standardSequence: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) roc: Option<MolecularSequence_Quality_Roc>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_ReferenceSeq {
  pub(crate) id: Option<String>,
  pub(crate) strand: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) windowEnd: Option<i32>,
  pub(crate) chromosome: Option<CodeableConcept>,
  pub(crate) genomeBuild: Option<String>,
  pub(crate) orientation: Option<String>,
  pub(crate) windowStart: Option<i32>,
  pub(crate) referenceSeqId: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) referenceSeqString: Option<String>,
  pub(crate) referenceSeqPointer: Option<Box<Reference>>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_StructureVariant_Outer {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) start: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MolecularSequence_StructureVariant_Inner {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) start: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MolecularSequence_StructureVariant {
  pub(crate) id: Option<String>,
  pub(crate) exact: Option<bool>,
  pub(crate) length: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) variantType: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) outer: Option<MolecularSequence_StructureVariant_Outer>,
  pub(crate) inner: Option<MolecularSequence_StructureVariant_Inner>,
}

#[derive(Clone, Debug)]
pub struct MolecularSequence {
  pub(crate) _type: Option<String>,
  pub(crate) device: Option<Box<Reference>>,
  pub(crate) patient: Option<Box<Reference>>,
  pub(crate) pointer: Vector<Reference>,
  pub(crate) specimen: Option<Box<Reference>>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) observedSeq: Option<String>,
  pub(crate) readCoverage: Option<i32>,
  pub(crate) coordinateSystem: i32,
  pub(crate) variant: Vector<MolecularSequence_Variant>,
  pub(crate) repository: Vector<MolecularSequence_Repository>,
  pub(crate) quality: Vector<MolecularSequence_Quality>,
  pub(crate) referenceSeq: Option<MolecularSequence_ReferenceSeq>,
  pub(crate) structureVariant: Vector<MolecularSequence_StructureVariant>,
}