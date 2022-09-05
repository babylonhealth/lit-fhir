use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

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
pub struct Appointment_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) actor: Option<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) required: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct AppointmentRaw {
  pub(crate) id: Option<String>,
  pub(crate) end: Option<DateTime<FixedOffset>>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) slot: Vector<Box<dyn Reference>>,
  pub(crate) start: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) comment: Option<String>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) priority: Option<u32>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) specialty: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) serviceType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) serviceCategory: Vector<Box<dyn CodeableConcept>>,
  pub(crate) appointmentType: Option<Box<dyn CodeableConcept>>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) minutesDuration: Option<u32>,
  pub(crate) requestedPeriod: Vector<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) cancelationReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) supportingInformation: Vector<Box<dyn Reference>>,
  pub(crate) participant: Vector<Appointment_Participant>,
}

pub trait Appointment : DomainResource {
  fn end(&self) -> &Option<DateTime<FixedOffset>>;
  fn slot(&self) -> &Vector<Box<dyn Reference>>;
  fn start(&self) -> &Option<DateTime<FixedOffset>>;
  fn status(&self) -> &String;
  fn created(&self) -> &Option<DateTime<FixedOffset>>;
  fn comment(&self) -> &Option<String>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn priority(&self) -> &Option<u32>;
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn serviceType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn description(&self) -> &Option<String>;
  fn serviceCategory(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn appointmentType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn minutesDuration(&self) -> &Option<u32>;
  fn requestedPeriod(&self) -> &Vector<Box<dyn Period>>;
  fn cancelationReason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn patientInstruction(&self) -> &Option<String>;
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>>;
  fn participant(&self) -> &Vector<Appointment_Participant>;
}

dyn_clone::clone_trait_object!(Appointment);

impl FHIRObject for AppointmentRaw {
}

impl Resource for AppointmentRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for AppointmentRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Appointment for AppointmentRaw {
  fn end(&self) -> &Option<DateTime<FixedOffset>> { &self.end }
  fn slot(&self) -> &Vector<Box<dyn Reference>> { &self.slot }
  fn start(&self) -> &Option<DateTime<FixedOffset>> { &self.start }
  fn status(&self) -> &String { &self.status }
  fn created(&self) -> &Option<DateTime<FixedOffset>> { &self.created }
  fn comment(&self) -> &Option<String> { &self.comment }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn priority(&self) -> &Option<u32> { &self.priority }
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.specialty }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn serviceType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceType }
  fn description(&self) -> &Option<String> { &self.description }
  fn serviceCategory(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceCategory }
  fn appointmentType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.appointmentType }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn minutesDuration(&self) -> &Option<u32> { &self.minutesDuration }
  fn requestedPeriod(&self) -> &Vector<Box<dyn Period>> { &self.requestedPeriod }
  fn cancelationReason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.cancelationReason }
  fn patientInstruction(&self) -> &Option<String> { &self.patientInstruction }
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInformation }
  fn participant(&self) -> &Vector<Appointment_Participant> { &self.participant }
}

