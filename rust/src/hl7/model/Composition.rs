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
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionIdentifierOrReference;



#[derive(Clone, Debug)]
pub struct Composition_Event {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) detail: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Composition_Section {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) mode: Option<String>,
  pub(crate) title: Option<String>,
  pub(crate) focus: Option<Box<dyn Reference>>,
  pub(crate) entry: Vector<Box<dyn Reference>>,
  pub(crate) author: Vector<Box<dyn Reference>>,
  pub(crate) section: Vector<Box<Composition_Section>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) orderedBy: Option<Box<dyn CodeableConcept>>,
  pub(crate) emptyReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Composition_Attester {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) time: Option<DateTime<FixedOffset>>,
  pub(crate) party: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Composition_RelatesTo {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) target: UnionIdentifierOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CompositionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) title: String,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) custodian: Option<Box<dyn Reference>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) confidentiality: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) event: Vector<Box<Composition_Event>>,
  pub(crate) section: Vector<Box<Composition_Section>>,
  pub(crate) attester: Vector<Box<Composition_Attester>>,
  pub(crate) relatesTo: Vector<Box<Composition_RelatesTo>>,
}

pub trait Composition : DomainResource {
  fn _type(&self) -> &Box<dyn CodeableConcept>;
  fn date(&self) -> &DateTime<FixedOffset>;
  fn title(&self) -> &String;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn custodian(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn confidentiality(&self) -> &Option<String>;
  fn event(&self) -> &Vector<Box<Composition_Event>>;
  fn section(&self) -> &Vector<Box<Composition_Section>>;
  fn attester(&self) -> &Vector<Box<Composition_Attester>>;
  fn relatesTo(&self) -> &Vector<Box<Composition_RelatesTo>>;
}

dyn_clone::clone_trait_object!(Composition);

impl FHIRObject for CompositionRaw {
}

impl Resource for CompositionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CompositionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Composition for CompositionRaw {
  fn _type(&self) -> &Box<dyn CodeableConcept> { &self._type }
  fn date(&self) -> &DateTime<FixedOffset> { &self.date }
  fn title(&self) -> &String { &self.title }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn Reference>> { &self.author }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn custodian(&self) -> &Option<Box<dyn Reference>> { &self.custodian }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn confidentiality(&self) -> &Option<String> { &self.confidentiality }
  fn event(&self) -> &Vector<Box<Composition_Event>> { &self.event }
  fn section(&self) -> &Vector<Box<Composition_Section>> { &self.section }
  fn attester(&self) -> &Vector<Box<Composition_Attester>> { &self.attester }
  fn relatesTo(&self) -> &Vector<Box<Composition_RelatesTo>> { &self.relatesTo }
}

