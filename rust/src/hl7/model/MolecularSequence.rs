use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MolecularSequence_Variant {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) start: Option<i32>,
  pub(crate) cigar: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) observedAllele: Option<String>,
  pub(crate) variantPointer: Option<Box<dyn Reference>>,
  pub(crate) referenceAllele: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_Repository {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) _type: String,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) datasetId: Option<String>,
  pub(crate) readsetId: Option<String>,
  pub(crate) variantsetId: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_Quality_Roc {
  pub(crate) id: Option<String>,
  pub(crate) score: Vector<i32>,
  pub(crate) numTP: Vector<i32>,
  pub(crate) numFP: Vector<i32>,
  pub(crate) numFN: Vector<i32>,
  pub(crate) fMeasure: Vector<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) precision: Vector<BigDecimal>,
  pub(crate) sensitivity: Vector<BigDecimal>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MolecularSequence_Quality {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) _type: String,
  pub(crate) gtFP: Option<BigDecimal>,
  pub(crate) start: Option<i32>,
  pub(crate) score: Option<Box<dyn Quantity>>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) recall: Option<BigDecimal>,
  pub(crate) fScore: Option<BigDecimal>,
  pub(crate) truthTP: Option<BigDecimal>,
  pub(crate) queryTP: Option<BigDecimal>,
  pub(crate) truthFN: Option<BigDecimal>,
  pub(crate) queryFP: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) precision: Option<BigDecimal>,
  pub(crate) standardSequence: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) roc: Option<Box<MolecularSequence_Quality_Roc>>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_ReferenceSeq {
  pub(crate) id: Option<String>,
  pub(crate) strand: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) windowEnd: Option<i32>,
  pub(crate) chromosome: Option<Box<dyn CodeableConcept>>,
  pub(crate) genomeBuild: Option<String>,
  pub(crate) orientation: Option<String>,
  pub(crate) windowStart: Option<i32>,
  pub(crate) referenceSeqId: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) referenceSeqString: Option<String>,
  pub(crate) referenceSeqPointer: Option<Box<dyn Reference>>,
}


#[derive(Clone, Debug)]
pub struct MolecularSequence_StructureVariant_Outer {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) start: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MolecularSequence_StructureVariant_Inner {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<i32>,
  pub(crate) start: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MolecularSequence_StructureVariant {
  pub(crate) id: Option<String>,
  pub(crate) exact: Option<bool>,
  pub(crate) length: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) variantType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) outer: Option<Box<MolecularSequence_StructureVariant_Outer>>,
  pub(crate) inner: Option<Box<MolecularSequence_StructureVariant_Inner>>,
}

#[derive(Clone, Debug)]
pub struct MolecularSequenceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<String>,
  pub(crate) device: Option<Box<dyn Reference>>,
  pub(crate) patient: Option<Box<dyn Reference>>,
  pub(crate) pointer: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) specimen: Option<Box<dyn Reference>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) observedSeq: Option<String>,
  pub(crate) readCoverage: Option<i32>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) coordinateSystem: i32,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) variant: Vector<Box<MolecularSequence_Variant>>,
  pub(crate) repository: Vector<Box<MolecularSequence_Repository>>,
  pub(crate) quality: Vector<Box<MolecularSequence_Quality>>,
  pub(crate) referenceSeq: Option<Box<MolecularSequence_ReferenceSeq>>,
  pub(crate) structureVariant: Vector<Box<MolecularSequence_StructureVariant>>,
}

pub trait MolecularSequence : DomainResource {
  fn _type(&self) -> &Option<String>;
  fn device(&self) -> &Option<Box<dyn Reference>>;
  fn patient(&self) -> &Option<Box<dyn Reference>>;
  fn pointer(&self) -> &Vector<Box<dyn Reference>>;
  fn specimen(&self) -> &Option<Box<dyn Reference>>;
  fn quantity(&self) -> &Option<Box<dyn Quantity>>;
  fn performer(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn observedSeq(&self) -> &Option<String>;
  fn readCoverage(&self) -> &Option<i32>;
  fn coordinateSystem(&self) -> &i32;
  fn variant(&self) -> &Vector<Box<MolecularSequence_Variant>>;
  fn repository(&self) -> &Vector<Box<MolecularSequence_Repository>>;
  fn quality(&self) -> &Vector<Box<MolecularSequence_Quality>>;
  fn referenceSeq(&self) -> &Option<Box<MolecularSequence_ReferenceSeq>>;
  fn structureVariant(&self) -> &Vector<Box<MolecularSequence_StructureVariant>>;
}

dyn_clone::clone_trait_object!(MolecularSequence);

impl FHIRObject for MolecularSequenceRaw {
}

impl Resource for MolecularSequenceRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MolecularSequenceRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MolecularSequence for MolecularSequenceRaw {
  fn _type(&self) -> &Option<String> { &self._type }
  fn device(&self) -> &Option<Box<dyn Reference>> { &self.device }
  fn patient(&self) -> &Option<Box<dyn Reference>> { &self.patient }
  fn pointer(&self) -> &Vector<Box<dyn Reference>> { &self.pointer }
  fn specimen(&self) -> &Option<Box<dyn Reference>> { &self.specimen }
  fn quantity(&self) -> &Option<Box<dyn Quantity>> { &self.quantity }
  fn performer(&self) -> &Option<Box<dyn Reference>> { &self.performer }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn observedSeq(&self) -> &Option<String> { &self.observedSeq }
  fn readCoverage(&self) -> &Option<i32> { &self.readCoverage }
  fn coordinateSystem(&self) -> &i32 { &self.coordinateSystem }
  fn variant(&self) -> &Vector<Box<MolecularSequence_Variant>> { &self.variant }
  fn repository(&self) -> &Vector<Box<MolecularSequence_Repository>> { &self.repository }
  fn quality(&self) -> &Vector<Box<MolecularSequence_Quality>> { &self.quality }
  fn referenceSeq(&self) -> &Option<Box<MolecularSequence_ReferenceSeq>> { &self.referenceSeq }
  fn structureVariant(&self) -> &Vector<Box<MolecularSequence_StructureVariant>> { &self.structureVariant }
}

