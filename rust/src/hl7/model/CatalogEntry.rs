use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CatalogEntry_RelatedEntry {
  pub(crate) id?: String,
  pub(crate) item: Reference,
  pub(crate) extension?: Extension,
  pub(crate) relationtype: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct CatalogEntry {
  pub(crate) _type?: CodeableConcept,
  pub(crate) status?: String,
  pub(crate) validTo?: Date,
  pub(crate) orderable: Boolean,
  pub(crate) identifier?: Identifier,
  pub(crate) lastUpdated?: Date,
  pub(crate) referencedItem: Reference,
  pub(crate) classification?: CodeableConcept,
  pub(crate) validityPeriod?: Period,
  pub(crate) additionalIdentifier?: Identifier,
  pub(crate) additionalCharacteristic?: CodeableConcept,
  pub(crate) additionalClassification?: CodeableConcept,
  pub(crate) relatedEntry?: CatalogEntry_RelatedEntry,
}