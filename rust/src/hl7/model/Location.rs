use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Address::Address;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Location_Position {
  pub(crate) id: Option<String>,
  pub(crate) latitude: BigDecimal,
  pub(crate) altitude: Option<BigDecimal>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) longitude: BigDecimal,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Location_HoursOfOperation {
  pub(crate) id: Option<String>,
  pub(crate) allDay: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) daysOfWeek: Vector<String>,
  pub(crate) openingTime: Option<Date>,
  pub(crate) closingTime: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Location {
  pub(crate) name: Option<String>,
  pub(crate) mode: Option<String>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) alias: Vector<String>,
  pub(crate) status: Option<String>,
  pub(crate) partOf: Option<Box<Reference>>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Option<Address>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) physicalType: Option<CodeableConcept>,
  pub(crate) operationalStatus: Option<Coding>,
  pub(crate) managingOrganization: Option<Box<Reference>>,
  pub(crate) availabilityExceptions: Option<String>,
  pub(crate) position: Option<Location_Position>,
  pub(crate) hoursOfOperation: Vector<Location_HoursOfOperation>,
}