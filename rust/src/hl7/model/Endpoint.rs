use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct EndpointRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) header: Vector<String>,
  pub(crate) contact: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: String,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) payloadType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) connectionType: Box<dyn Coding>,
  pub(crate) payloadMimeType: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) managingOrganization: Option<Box<dyn Reference>>,
}

pub trait Endpoint : DomainResource {
  fn name(&self) -> Option<&String>;
  fn status(&self) -> &String;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn header(&self) -> &Vector<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> &String;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn payloadType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn connectionType(&self) -> &Box<dyn Coding>;
  fn payloadMimeType(&self) -> &Vector<String>;
  fn managingOrganization(&self) -> Option<&Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(Endpoint);

impl FHIRObject for EndpointRaw {
}

impl Resource for EndpointRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for EndpointRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Endpoint for EndpointRaw {
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn header(&self) -> &Vector<String> { &self.header }
  fn contact(&self) -> &Vector<Box<dyn ContactPoint>> { &self.contact }
  fn address(&self) -> &String { &self.address }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn payloadType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.payloadType }
  fn connectionType(&self) -> &Box<dyn Coding> { &self.connectionType }
  fn payloadMimeType(&self) -> &Vector<String> { &self.payloadMimeType }
  fn managingOrganization(&self) -> Option<&Box<dyn Reference>> { self.managingOrganization.as_ref() }
}

