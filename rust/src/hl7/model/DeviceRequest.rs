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
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01850316684;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriodOrTiming;



#[derive(Clone, Debug)]
pub struct DeviceRequest_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<Union01850316684>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DeviceRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: Option<String>,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) code: UnionCodeableConceptOrReference,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) priority: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) requester: Option<Box<dyn Reference>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) insurance: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) priorRequest: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) performerType: Option<Box<dyn CodeableConcept>>,
  pub(crate) supportingInfo: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) relevantHistory: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) parameter: Vector<Box<DeviceRequest_Parameter>>,
}

pub trait DeviceRequest : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &Option<String>;
  fn intent(&self) -> &String;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn code(&self) -> &UnionCodeableConceptOrReference;
  fn subject(&self) -> &Box<dyn Reference>;
  fn priority(&self) -> &Option<String>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn requester(&self) -> &Option<Box<dyn Reference>>;
  fn performer(&self) -> &Option<Box<dyn Reference>>;
  fn insurance(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> &Option<DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priorRequest(&self) -> &Vector<Box<dyn Reference>>;
  fn occurrence(&self) -> &Option<UnionDateTimeOrPeriodOrTiming>;
  fn performerType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn groupIdentifier(&self) -> &Option<Box<dyn Identifier>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn parameter(&self) -> &Vector<Box<DeviceRequest_Parameter>>;
}

dyn_clone::clone_trait_object!(DeviceRequest);

impl FHIRObject for DeviceRequestRaw {
}

impl Resource for DeviceRequestRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DeviceRequestRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DeviceRequest for DeviceRequestRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &Option<String> { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn code(&self) -> &UnionCodeableConceptOrReference { &self.code }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn priority(&self) -> &Option<String> { &self.priority }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn requester(&self) -> &Option<Box<dyn Reference>> { &self.requester }
  fn performer(&self) -> &Option<Box<dyn Reference>> { &self.performer }
  fn insurance(&self) -> &Vector<Box<dyn Reference>> { &self.insurance }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> &Option<DateTime<FixedOffset>> { &self.authoredOn }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn priorRequest(&self) -> &Vector<Box<dyn Reference>> { &self.priorRequest }
  fn occurrence(&self) -> &Option<UnionDateTimeOrPeriodOrTiming> { &self.occurrence }
  fn performerType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.performerType }
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInfo }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn groupIdentifier(&self) -> &Option<Box<dyn Identifier>> { &self.groupIdentifier }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>> { &self.relevantHistory }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn parameter(&self) -> &Vector<Box<DeviceRequest_Parameter>> { &self.parameter }
}

