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
use crate::core::model::Quantity::Quantity;
use crate::core::model::Range::Range;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union00107722725;
use crate::hl7::model::UnionAliases::Union02118820890;



#[derive(Clone, Debug)]
pub struct Observation_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) value: Option<Union02118820890>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) interpretation: Vector<Box<dyn CodeableConcept>>,
  pub(crate) referenceRange: Vector<Box<Observation_ReferenceRange>>,
  pub(crate) dataAbsentReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Observation_ReferenceRange {
  pub(crate) id: Option<String>,
  pub(crate) low: Option<Box<dyn Quantity>>,
  pub(crate) age: Option<Box<dyn Range>>,
  pub(crate) high: Option<Box<dyn Quantity>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) text: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) appliesTo: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ObservationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) focus: Vector<Box<dyn Reference>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) device: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<Union02118820890>,
  pub(crate) bodySite: Option<Box<dyn CodeableConcept>>,
  pub(crate) specimen: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) performer: Vector<Box<dyn Reference>>,
  pub(crate) hasMember: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) derivedFrom: Vector<Box<dyn Reference>>,
  pub(crate) effective: Option<Union00107722725>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) interpretation: Vector<Box<dyn CodeableConcept>>,
  pub(crate) dataAbsentReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) component: Vector<Box<Observation_Component>>,
  pub(crate) referenceRange: Vector<Box<Observation_ReferenceRange>>,
}

pub trait Observation : DomainResource {
  fn code(&self) -> &Box<dyn CodeableConcept>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn focus(&self) -> &Vector<Box<dyn Reference>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn issued(&self) -> Option<&DateTime<FixedOffset>>;
  fn method(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn device(&self) -> Option<&Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> Option<&Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn value(&self) -> Option<&Union02118820890>;
  fn bodySite(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn specimen(&self) -> Option<&Box<dyn Reference>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn performer(&self) -> &Vector<Box<dyn Reference>>;
  fn hasMember(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn derivedFrom(&self) -> &Vector<Box<dyn Reference>>;
  fn effective(&self) -> Option<&Union00107722725>;
  fn interpretation(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn dataAbsentReason(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn component(&self) -> &Vector<Box<Observation_Component>>;
  fn referenceRange(&self) -> &Vector<Box<Observation_ReferenceRange>>;
}

dyn_clone::clone_trait_object!(Observation);

impl FHIRObject for ObservationRaw {
}

impl Resource for ObservationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ObservationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Observation for ObservationRaw {
  fn code(&self) -> &Box<dyn CodeableConcept> { &self.code }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn focus(&self) -> &Vector<Box<dyn Reference>> { &self.focus }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn issued(&self) -> Option<&DateTime<FixedOffset>> { self.issued.as_ref() }
  fn method(&self) -> Option<&Box<dyn CodeableConcept>> { self.method.as_ref() }
  fn device(&self) -> Option<&Box<dyn Reference>> { self.device.as_ref() }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> Option<&Box<dyn Reference>> { self.subject.as_ref() }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn value(&self) -> Option<&Union02118820890> { self.value.as_ref() }
  fn bodySite(&self) -> Option<&Box<dyn CodeableConcept>> { self.bodySite.as_ref() }
  fn specimen(&self) -> Option<&Box<dyn Reference>> { self.specimen.as_ref() }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn performer(&self) -> &Vector<Box<dyn Reference>> { &self.performer }
  fn hasMember(&self) -> &Vector<Box<dyn Reference>> { &self.hasMember }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn derivedFrom(&self) -> &Vector<Box<dyn Reference>> { &self.derivedFrom }
  fn effective(&self) -> Option<&Union00107722725> { self.effective.as_ref() }
  fn interpretation(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.interpretation }
  fn dataAbsentReason(&self) -> Option<&Box<dyn CodeableConcept>> { self.dataAbsentReason.as_ref() }
  fn component(&self) -> &Vector<Box<Observation_Component>> { &self.component }
  fn referenceRange(&self) -> &Vector<Box<Observation_ReferenceRange>> { &self.referenceRange }
}

