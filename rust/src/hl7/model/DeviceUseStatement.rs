use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DeviceUseStatementRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) source: Option<Box<dyn Reference>>,
  pub(crate) device: Box<dyn Reference>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) bodySite: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timing: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) recordedOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) derivedFrom: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait DeviceUseStatement : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn source(&self) -> &Option<Box<dyn Reference>>;
  fn device(&self) -> &Box<dyn Reference>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn bodySite(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn timing(&self) -> &Option<UnionDateTimeOrPeriodOrTiming>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn recordedOn(&self) -> &Option<DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn derivedFrom(&self) -> &Vector<Box<dyn Reference>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(DeviceUseStatement);

impl FHIRObject for DeviceUseStatementRaw {
}

impl Resource for DeviceUseStatementRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DeviceUseStatementRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DeviceUseStatement for DeviceUseStatementRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn source(&self) -> &Option<Box<dyn Reference>> { &self.source }
  fn device(&self) -> &Box<dyn Reference> { &self.device }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn bodySite(&self) -> &Option<Box<dyn CodeableConcept>> { &self.bodySite }
  fn timing(&self) -> &Option<UnionDateTimeOrPeriodOrTiming> { &self.timing }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn recordedOn(&self) -> &Option<DateTime<FixedOffset>> { &self.recordedOn }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn derivedFrom(&self) -> &Vector<Box<dyn Reference>> { &self.derivedFrom }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
}

