use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct CatalogEntry_RelatedEntry {
  pub(crate) id: Option<String>,
  pub(crate) item: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) relationtype: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CatalogEntry {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) validTo: Option<Date>,
  pub(crate) orderable: Boolean,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) lastUpdated: Option<Date>,
  pub(crate) referencedItem: Reference,
  pub(crate) classification: Vector<CodeableConcept>,
  pub(crate) validityPeriod: Option<Period>,
  pub(crate) additionalIdentifier: Vector<Identifier>,
  pub(crate) additionalCharacteristic: Vector<CodeableConcept>,
  pub(crate) additionalClassification: Vector<CodeableConcept>,
  pub(crate) relatedEntry: Vector<CatalogEntry_RelatedEntry>,
}