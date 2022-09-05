use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::Union01475253842;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ValueSet_Expansion_Contains {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) _abstract: Option<bool>,
  pub(crate) inactive: Option<bool>,
  pub(crate) contains: Vector<Box<dyn ValueSet_Expansion_Contains>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) designation: Vector<Box<dyn ValueSet_Compose_Include_Concept_Designation>>,
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
  pub(crate) contains: Vector<ValueSet_Expansion_Contains>,
  pub(crate) parameter: Vector<ValueSet_Expansion_Parameter>,
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
  pub(crate) designation: Vector<ValueSet_Compose_Include_Concept_Designation>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose_Include {
  pub(crate) id: Option<String>,
  pub(crate) system: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) valueSet: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) filter: Vector<ValueSet_Compose_Include_Filter>,
  pub(crate) concept: Vector<ValueSet_Compose_Include_Concept>,
}

#[derive(Clone, Debug)]
pub struct ValueSet_Compose {
  pub(crate) id: Option<String>,
  pub(crate) exclude: Vector<Box<dyn ValueSet_Compose_Include>>,
  pub(crate) inactive: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lockedDate: Option<FHIRDate>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) include: Vector<ValueSet_Compose_Include>,
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
  pub(crate) expansion: Option<ValueSet_Expansion>,
  pub(crate) compose: Option<ValueSet_Compose>,
}

pub trait ValueSet : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn immutable(&self) -> &Option<bool>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn expansion(&self) -> &Option<ValueSet_Expansion>;
  fn compose(&self) -> &Option<ValueSet_Compose>;
}

dyn_clone::clone_trait_object!(ValueSet);

impl FHIRObject for ValueSetRaw {
}

impl Resource for ValueSetRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ValueSetRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ValueSet for ValueSetRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn immutable(&self) -> &Option<bool> { &self.immutable }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn expansion(&self) -> &Option<ValueSet_Expansion> { &self.expansion }
  fn compose(&self) -> &Option<ValueSet_Compose> { &self.compose }
}

