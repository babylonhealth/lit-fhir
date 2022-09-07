use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01475253842;



#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Contains {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) _abstract: Option<bool>,
  pub(crate) inactive: Option<bool>,
  pub(crate) contains: Vector<Box<ValueSet_Expansion_Contains>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) designation: Vector<Box<ValueSet_Compose_Include_Concept_Designation>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) value: Option<Union01475253842>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Expansion {
  pub(crate) id: Option<String>,
  pub(crate) total: Option<i32>,
  pub(crate) offset: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timestamp: DateTime<FixedOffset>,
  pub(crate) identifier: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) contains: Vector<Box<ValueSet_Expansion_Contains>>,
  pub(crate) parameter: Vector<Box<ValueSet_Expansion_Parameter>>,
}


#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include_Filter {
  pub(crate) id: Option<String>,
  pub(crate) op: String,
  pub(crate) value: String,
  pub(crate) property: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include_Concept_Designation {
  pub(crate) id: Option<String>,
  pub(crate) _use: Option<Box<dyn Coding>>,
  pub(crate) value: String,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include_Concept {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) designation: Vector<Box<ValueSet_Compose_Include_Concept_Designation>>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include {
  pub(crate) id: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) valueSet: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) filter: Vector<Box<ValueSet_Compose_Include_Filter>>,
  pub(crate) concept: Vector<Box<ValueSet_Compose_Include_Concept>>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose {
  pub(crate) id: Option<String>,
  pub(crate) exclude: Vector<Box<ValueSet_Compose_Include>>,
  pub(crate) inactive: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lockedDate: Option<LocalDate>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) include: Vector<Box<ValueSet_Compose_Include>>,
}

#[derive(Clone, Debug)]
pub struct ValueSetRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) immutable: Option<bool>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) expansion: Option<Box<ValueSet_Expansion>>,
  pub(crate) compose: Option<Box<ValueSet_Compose>>,
}

pub trait ValueSet : DomainResource {
  fn url(&self) -> Option<&String>;
  fn name(&self) -> Option<&String>;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn title(&self) -> Option<&String>;
  fn status(&self) -> &String;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> Option<&String>;
  fn publisher(&self) -> Option<&String>;
  fn immutable(&self) -> Option<&bool>;
  fn copyright(&self) -> Option<&String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> Option<&String>;
  fn experimental(&self) -> Option<&bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn expansion(&self) -> Option<&Box<ValueSet_Expansion>>;
  fn compose(&self) -> Option<&Box<ValueSet_Compose>>;
}

dyn_clone::clone_trait_object!(ValueSet);

impl FHIRObject for ValueSetRaw {
}

impl Resource for ValueSetRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ValueSetRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ValueSet for ValueSetRaw {
  fn url(&self) -> Option<&String> { self.url.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> Option<&String> { self.purpose.as_ref() }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn immutable(&self) -> Option<&bool> { self.immutable.as_ref() }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn expansion(&self) -> Option<&Box<ValueSet_Expansion>> { self.expansion.as_ref() }
  fn compose(&self) -> Option<&Box<ValueSet_Compose>> { self.compose.as_ref() }
}

