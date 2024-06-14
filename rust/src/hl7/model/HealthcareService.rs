use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
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
pub struct HealthcareService_Eligibility {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct HealthcareService_NotAvailable {
  pub(crate) id: Option<String>,
  pub(crate) during: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct HealthcareService_AvailableTime {
  pub(crate) id: Option<String>,
  pub(crate) allDay: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) daysOfWeek: Vector<String>,
  pub(crate) availableEndTime: Option<LocalTime>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) availableStartTime: Option<LocalTime>,
}

#[derive(Clone, Debug)]
pub struct HealthcareServiceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) photo: Option<Box<dyn Attachment>>,
  pub(crate) active: Option<bool>,
  pub(crate) comment: Option<String>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) program: Vector<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) location: Vector<Box<dyn Reference>>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) specialty: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) providedBy: Option<Box<dyn Reference>>,
  pub(crate) extraDetails: Option<String>,
  pub(crate) coverageArea: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) communication: Vector<Box<dyn CodeableConcept>>,
  pub(crate) characteristic: Vector<Box<dyn CodeableConcept>>,
  pub(crate) referralMethod: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) appointmentRequired: Option<bool>,
  pub(crate) serviceProvisionCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) availabilityExceptions: Option<String>,
  pub(crate) eligibility: Vector<Box<HealthcareService_Eligibility>>,
  pub(crate) notAvailable: Vector<Box<HealthcareService_NotAvailable>>,
  pub(crate) availableTime: Vector<Box<HealthcareService_AvailableTime>>,
}

pub trait HealthcareService : DomainResource {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn name(&self) -> Option<&String>;
  fn photo(&self) -> Option<&Box<dyn Attachment>>;
  fn active(&self) -> Option<&bool>;
  fn comment(&self) -> Option<&String>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn program(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn location(&self) -> &Vector<Box<dyn Reference>>;
  fn endpoint(&self) -> &Vector<Box<dyn Reference>>;
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn providedBy(&self) -> Option<&Box<dyn Reference>>;
  fn extraDetails(&self) -> Option<&String>;
  fn coverageArea(&self) -> &Vector<Box<dyn Reference>>;
  fn communication(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn characteristic(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn referralMethod(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn appointmentRequired(&self) -> Option<&bool>;
  fn serviceProvisionCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn availabilityExceptions(&self) -> Option<&String>;
  fn eligibility(&self) -> &Vector<Box<HealthcareService_Eligibility>>;
  fn notAvailable(&self) -> &Vector<Box<HealthcareService_NotAvailable>>;
  fn availableTime(&self) -> &Vector<Box<HealthcareService_AvailableTime>>;
}

dyn_clone::clone_trait_object!(HealthcareService);

impl FHIRObject for HealthcareServiceRaw {
}

impl Resource for HealthcareServiceRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for HealthcareServiceRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl HealthcareService for HealthcareServiceRaw {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn photo(&self) -> Option<&Box<dyn Attachment>> { self.photo.as_ref() }
  fn active(&self) -> Option<&bool> { self.active.as_ref() }
  fn comment(&self) -> Option<&String> { self.comment.as_ref() }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn program(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.program }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn location(&self) -> &Vector<Box<dyn Reference>> { &self.location }
  fn endpoint(&self) -> &Vector<Box<dyn Reference>> { &self.endpoint }
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.specialty }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn providedBy(&self) -> Option<&Box<dyn Reference>> { self.providedBy.as_ref() }
  fn extraDetails(&self) -> Option<&String> { self.extraDetails.as_ref() }
  fn coverageArea(&self) -> &Vector<Box<dyn Reference>> { &self.coverageArea }
  fn communication(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.communication }
  fn characteristic(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.characteristic }
  fn referralMethod(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.referralMethod }
  fn appointmentRequired(&self) -> Option<&bool> { self.appointmentRequired.as_ref() }
  fn serviceProvisionCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.serviceProvisionCode }
  fn availabilityExceptions(&self) -> Option<&String> { self.availabilityExceptions.as_ref() }
  fn eligibility(&self) -> &Vector<Box<HealthcareService_Eligibility>> { &self.eligibility }
  fn notAvailable(&self) -> &Vector<Box<HealthcareService_NotAvailable>> { &self.notAvailable }
  fn availableTime(&self) -> &Vector<Box<HealthcareService_AvailableTime>> { &self.availableTime }
}

