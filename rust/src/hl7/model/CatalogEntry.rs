use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Reference::Reference;
use crate::core::model::Period::Period;



#[derive(Clone, Debug)]
pub struct CatalogEntry_RelatedEntry {
  pub(crate) id: Option<String>,
  pub(crate) item: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) relationtype: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CatalogEntry {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) validTo: Option<DateTime<FixedOffset>>,
  pub(crate) orderable: bool,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) lastUpdated: Option<DateTime<FixedOffset>>,
  pub(crate) referencedItem: Box<Reference>,
  pub(crate) classification: Vector<CodeableConcept>,
  pub(crate) validityPeriod: Option<Period>,
  pub(crate) additionalIdentifier: Vector<Identifier>,
  pub(crate) additionalCharacteristic: Vector<CodeableConcept>,
  pub(crate) additionalClassification: Vector<CodeableConcept>,
  pub(crate) relatedEntry: Vector<CatalogEntry_RelatedEntry>,
}