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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct AppointmentResponseRaw {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) start: Option<DateTime<FixedOffset>>,
  pub(crate) actor: Option<Box<dyn Reference>>,
  pub(crate) comment: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) appointment: Box<dyn Reference>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) participantType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) participantStatus: String,
}

pub trait AppointmentResponse : DomainResource {
  fn end(&self) -> Option<&DateTime<FixedOffset>>;
  fn start(&self) -> Option<&DateTime<FixedOffset>>;
  fn actor(&self) -> Option<&Box<dyn Reference>>;
  fn comment(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn appointment(&self) -> &Box<dyn Reference>;
  fn participantType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn participantStatus(&self) -> &String;
}

dyn_clone::clone_trait_object!(AppointmentResponse);

impl FHIRObject for AppointmentResponseRaw {
}

impl Resource for AppointmentResponseRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for AppointmentResponseRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl AppointmentResponse for AppointmentResponseRaw {
  fn end(&self) -> Option<&DateTime<FixedOffset>> { self.end.as_ref() }
  fn start(&self) -> Option<&DateTime<FixedOffset>> { self.start.as_ref() }
  fn actor(&self) -> Option<&Box<dyn Reference>> { self.actor.as_ref() }
  fn comment(&self) -> Option<&String> { self.comment.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn appointment(&self) -> &Box<dyn Reference> { &self.appointment }
  fn participantType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.participantType }
  fn participantStatus(&self) -> &String { &self.participantStatus }
}

