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
pub struct SlotRaw {
  pub(crate) id: Option<String>,
  pub(crate) end: DateTime<FixedOffset>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) start: DateTime<FixedOffset>,
  pub(crate) status: String,
  pub(crate) comment: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) schedule: Box<dyn Reference>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) specialty: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) overbooked: Option<bool>,
  pub(crate) serviceType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) serviceCategory: Vector<Box<dyn CodeableConcept>>,
  pub(crate) appointmentType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait Slot : DomainResource {
  fn end(&self) -> &DateTime<FixedOffset>;
  fn start(&self) -> &DateTime<FixedOffset>;
  fn status(&self) -> &String;
  fn comment(&self) -> &Option<String>;
  fn schedule(&self) -> &Box<dyn Reference>;
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn overbooked(&self) -> &Option<bool>;
  fn serviceType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn serviceCategory(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn appointmentType(&self) -> &Option<Box<dyn CodeableConcept>>;
}

dyn_clone::clone_trait_object!(Slot);

impl FHIRObject for SlotRaw {
}

impl Resource for SlotRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SlotRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Slot for SlotRaw {
  fn end(&self) -> &DateTime<FixedOffset> { &self.end }
  fn start(&self) -> &DateTime<FixedOffset> { &self.start }
  fn status(&self) -> &String { &self.status }
  fn comment(&self) -> &Option<String> { &self.comment }
  fn schedule(&self) -> &Box<dyn Reference> { &self.schedule }
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.specialty }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn overbooked(&self) -> &Option<bool> { &self.overbooked }
  fn serviceType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceType }
  fn serviceCategory(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceCategory }
  fn appointmentType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.appointmentType }
}

