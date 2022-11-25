use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Address::Address;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Location_Position {
  pub(crate) id: Option<String>,
  pub(crate) latitude: BigDecimal,
  pub(crate) altitude: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) longitude: BigDecimal,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Location_HoursOfOperation {
  pub(crate) id: Option<String>,
  pub(crate) allDay: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) daysOfWeek: Vector<String>,
  pub(crate) openingTime: Option<LocalTime>,
  pub(crate) closingTime: Option<LocalTime>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct LocationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) mode: Option<String>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) alias: Vector<String>,
  pub(crate) status: Option<String>,
  pub(crate) partOf: Option<Box<dyn Reference>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Option<Box<dyn Address>>,
  pub(crate) language: Option<String>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) physicalType: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) operationalStatus: Option<Box<dyn Coding>>,
  pub(crate) managingOrganization: Option<Box<dyn Reference>>,
  pub(crate) availabilityExceptions: Option<String>,
  pub(crate) position: Option<Box<Location_Position>>,
  pub(crate) hoursOfOperation: Vector<Box<Location_HoursOfOperation>>,
}

pub trait Location : DomainResource {
  fn name(&self) -> Option<&String>;
  fn mode(&self) -> Option<&String>;
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn alias(&self) -> &Vector<String>;
  fn status(&self) -> Option<&String>;
  fn partOf(&self) -> Option<&Box<dyn Reference>>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> Option<&Box<dyn Address>>;
  fn endpoint(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> Option<&String>;
  fn physicalType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn operationalStatus(&self) -> Option<&Box<dyn Coding>>;
  fn managingOrganization(&self) -> Option<&Box<dyn Reference>>;
  fn availabilityExceptions(&self) -> Option<&String>;
  fn position(&self) -> Option<&Box<Location_Position>>;
  fn hoursOfOperation(&self) -> &Vector<Box<Location_HoursOfOperation>>;
}

dyn_clone::clone_trait_object!(Location);

impl FHIRObject for LocationRaw {
}

impl Resource for LocationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for LocationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Location for LocationRaw {
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn mode(&self) -> Option<&String> { self.mode.as_ref() }
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn alias(&self) -> &Vector<String> { &self.alias }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn partOf(&self) -> Option<&Box<dyn Reference>> { self.partOf.as_ref() }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn address(&self) -> Option<&Box<dyn Address>> { self.address.as_ref() }
  fn endpoint(&self) -> &Vector<Box<dyn Reference>> { &self.endpoint }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn physicalType(&self) -> Option<&Box<dyn CodeableConcept>> { self.physicalType.as_ref() }
  fn operationalStatus(&self) -> Option<&Box<dyn Coding>> { self.operationalStatus.as_ref() }
  fn managingOrganization(&self) -> Option<&Box<dyn Reference>> { self.managingOrganization.as_ref() }
  fn availabilityExceptions(&self) -> Option<&String> { self.availabilityExceptions.as_ref() }
  fn position(&self) -> Option<&Box<Location_Position>> { self.position.as_ref() }
  fn hoursOfOperation(&self) -> &Vector<Box<Location_HoursOfOperation>> { &self.hoursOfOperation }
}

