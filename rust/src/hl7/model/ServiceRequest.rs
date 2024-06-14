use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionBooleanOrCodeableConcept;
use crate::core::model::UnionAliases::UnionQuantityOrRangeOrRatio;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriodOrTiming;



#[derive(Clone, Debug)]
pub struct ServiceRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) replaces: Vector<Box<dyn Reference>>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<String>,
  pub(crate) specimen: Vector<Box<dyn Reference>>,
  pub(crate) bodySite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) requester: Option<Box<dyn Reference>>,
  pub(crate) performer: Vector<Box<dyn Reference>>,
  pub(crate) insurance: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) requisition: Option<Box<dyn Identifier>>,
  pub(crate) orderDetail: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<UnionQuantityOrRangeOrRatio>,
  pub(crate) asNeeded: Option<UnionBooleanOrCodeableConcept>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) locationCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) performerType: Option<Box<dyn CodeableConcept>>,
  pub(crate) supportingInfo: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) relevantHistory: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) locationReference: Vector<Box<dyn Reference>>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) instantiatesCanonical: Vector<String>,
}

pub trait ServiceRequest : DomainResource {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn intent(&self) -> &String;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn replaces(&self) -> &Vector<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priority(&self) -> Option<&String>;
  fn specimen(&self) -> &Vector<Box<dyn Reference>>;
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn requester(&self) -> Option<&Box<dyn Reference>>;
  fn performer(&self) -> &Vector<Box<dyn Reference>>;
  fn insurance(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn requisition(&self) -> Option<&Box<dyn Identifier>>;
  fn orderDetail(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn quantity(&self) -> Option<&UnionQuantityOrRangeOrRatio>;
  fn asNeeded(&self) -> Option<&UnionBooleanOrCodeableConcept>;
  fn doNotPerform(&self) -> Option<&bool>;
  fn locationCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriodOrTiming>;
  fn performerType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn locationReference(&self) -> &Vector<Box<dyn Reference>>;
  fn patientInstruction(&self) -> Option<&String>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
}

dyn_clone::clone_trait_object!(ServiceRequest);

impl FHIRObject for ServiceRequestRaw {
}

impl Resource for ServiceRequestRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ServiceRequestRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ServiceRequest for ServiceRequestRaw {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>> { self.code.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn replaces(&self) -> &Vector<Box<dyn Reference>> { &self.replaces }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn priority(&self) -> Option<&String> { self.priority.as_ref() }
  fn specimen(&self) -> &Vector<Box<dyn Reference>> { &self.specimen }
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.bodySite }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn requester(&self) -> Option<&Box<dyn Reference>> { self.requester.as_ref() }
  fn performer(&self) -> &Vector<Box<dyn Reference>> { &self.performer }
  fn insurance(&self) -> &Vector<Box<dyn Reference>> { &self.insurance }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>> { self.authoredOn.as_ref() }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn requisition(&self) -> Option<&Box<dyn Identifier>> { self.requisition.as_ref() }
  fn orderDetail(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.orderDetail }
  fn quantity(&self) -> Option<&UnionQuantityOrRangeOrRatio> { self.quantity.as_ref() }
  fn asNeeded(&self) -> Option<&UnionBooleanOrCodeableConcept> { self.asNeeded.as_ref() }
  fn doNotPerform(&self) -> Option<&bool> { self.doNotPerform.as_ref() }
  fn locationCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.locationCode }
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriodOrTiming> { self.occurrence.as_ref() }
  fn performerType(&self) -> Option<&Box<dyn CodeableConcept>> { self.performerType.as_ref() }
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInfo }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>> { &self.relevantHistory }
  fn locationReference(&self) -> &Vector<Box<dyn Reference>> { &self.locationReference }
  fn patientInstruction(&self) -> Option<&String> { self.patientInstruction.as_ref() }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
}

