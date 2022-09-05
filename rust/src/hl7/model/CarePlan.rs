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
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionPeriodOrStringOrTiming;



#[derive(Clone, Debug)]
pub struct CarePlan_Activity_Detail {
  pub(crate) id: Option<String>,
  pub(crate) kind: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) goal: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) performer: Vector<Box<dyn Reference>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) product: Option<UnionCodeableConceptOrReference>,
  pub(crate) dailyAmount: Option<Box<dyn Quantity>>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) scheduled: Option<UnionPeriodOrStringOrTiming>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Vector<String>,
}

#[derive(Clone, Debug)]
pub struct CarePlan_Activity {
  pub(crate) id: Option<String>,
  pub(crate) progress: Vector<Box<dyn Annotation>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<Box<dyn Reference>>,
  pub(crate) outcomeReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) outcomeCodeableConcept: Vector<Box<dyn CodeableConcept>>,
  pub(crate) detail: Option<Box<CarePlan_Activity_Detail>>,
}

#[derive(Clone, Debug)]
pub struct CarePlanRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) goal: Vector<Box<dyn Reference>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) title: Option<String>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) language: Option<String>,
  pub(crate) replaces: Vector<Box<dyn Reference>>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) careTeam: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) addresses: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) contributor: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) supportingInfo: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) activity: Vector<Box<CarePlan_Activity>>,
}

pub trait CarePlan : DomainResource {
  fn goal(&self) -> &Vector<Box<dyn Reference>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn title(&self) -> &Option<String>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn intent(&self) -> &String;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn author(&self) -> &Option<Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &Option<DateTime<FixedOffset>>;
  fn replaces(&self) -> &Vector<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn careTeam(&self) -> &Vector<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn addresses(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> &Option<String>;
  fn contributor(&self) -> &Vector<Box<dyn Reference>>;
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn activity(&self) -> &Vector<Box<CarePlan_Activity>>;
}

dyn_clone::clone_trait_object!(CarePlan);

impl FHIRObject for CarePlanRaw {
}

impl Resource for CarePlanRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CarePlanRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CarePlan for CarePlanRaw {
  fn goal(&self) -> &Vector<Box<dyn Reference>> { &self.goal }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn title(&self) -> &Option<String> { &self.title }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn author(&self) -> &Option<Box<dyn Reference>> { &self.author }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn created(&self) -> &Option<DateTime<FixedOffset>> { &self.created }
  fn replaces(&self) -> &Vector<Box<dyn Reference>> { &self.replaces }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn careTeam(&self) -> &Vector<Box<dyn Reference>> { &self.careTeam }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn addresses(&self) -> &Vector<Box<dyn Reference>> { &self.addresses }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> &Option<String> { &self.description }
  fn contributor(&self) -> &Vector<Box<dyn Reference>> { &self.contributor }
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInfo }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn activity(&self) -> &Vector<Box<CarePlan_Activity>> { &self.activity }
}

