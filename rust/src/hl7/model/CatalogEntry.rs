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
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CatalogEntry_RelatedEntry {
  pub(crate) id: Option<String>,
  pub(crate) item: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) relationtype: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CatalogEntryRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<String>,
  pub(crate) validTo: Option<DateTime<FixedOffset>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) orderable: bool,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) lastUpdated: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) referencedItem: Box<dyn Reference>,
  pub(crate) classification: Vector<Box<dyn CodeableConcept>>,
  pub(crate) validityPeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) additionalIdentifier: Vector<Box<dyn Identifier>>,
  pub(crate) additionalCharacteristic: Vector<Box<dyn CodeableConcept>>,
  pub(crate) additionalClassification: Vector<Box<dyn CodeableConcept>>,
  pub(crate) relatedEntry: Vector<Box<CatalogEntry_RelatedEntry>>,
}

pub trait CatalogEntry : DomainResource {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn status(&self) -> Option<&String>;
  fn validTo(&self) -> Option<&DateTime<FixedOffset>>;
  fn orderable(&self) -> &bool;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn lastUpdated(&self) -> Option<&DateTime<FixedOffset>>;
  fn referencedItem(&self) -> &Box<dyn Reference>;
  fn classification(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn validityPeriod(&self) -> Option<&Box<dyn Period>>;
  fn additionalIdentifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn additionalCharacteristic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn additionalClassification(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn relatedEntry(&self) -> &Vector<Box<CatalogEntry_RelatedEntry>>;
}

dyn_clone::clone_trait_object!(CatalogEntry);

impl FHIRObject for CatalogEntryRaw {
}

impl Resource for CatalogEntryRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for CatalogEntryRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CatalogEntry for CatalogEntryRaw {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>> { self._type.as_ref() }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn validTo(&self) -> Option<&DateTime<FixedOffset>> { self.validTo.as_ref() }
  fn orderable(&self) -> &bool { &self.orderable }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn lastUpdated(&self) -> Option<&DateTime<FixedOffset>> { self.lastUpdated.as_ref() }
  fn referencedItem(&self) -> &Box<dyn Reference> { &self.referencedItem }
  fn classification(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.classification }
  fn validityPeriod(&self) -> Option<&Box<dyn Period>> { self.validityPeriod.as_ref() }
  fn additionalIdentifier(&self) -> &Vector<Box<dyn Identifier>> { &self.additionalIdentifier }
  fn additionalCharacteristic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.additionalCharacteristic }
  fn additionalClassification(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.additionalClassification }
  fn relatedEntry(&self) -> &Vector<Box<CatalogEntry_RelatedEntry>> { &self.relatedEntry }
}

