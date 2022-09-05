use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Closure {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) translation: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Software {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Translation {
  pub(crate) id: Option<String>,
  pub(crate) needsMap: bool,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_ValidateCode {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) translations: bool,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Implementation {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Expansion_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_Expansion {
  pub(crate) id: Option<String>,
  pub(crate) paging: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) incomplete: Option<bool>,
  pub(crate) textFilter: Option<String>,
  pub(crate) hierarchical: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) parameter: Vector<Box<TerminologyCapabilities_Expansion_Parameter>>,
}


#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem_Version_Filter {
  pub(crate) id: Option<String>,
  pub(crate) op: Vector<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem_Version {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) language: Vector<String>,
  pub(crate) property: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) isDefault: Option<bool>,
  pub(crate) compositional: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) filter: Vector<Box<TerminologyCapabilities_CodeSystem_Version_Filter>>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilities_CodeSystem {
  pub(crate) id: Option<String>,
  pub(crate) uri: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) subsumption: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) version: Vector<Box<TerminologyCapabilities_CodeSystem_Version>>,
}

#[derive(Clone, Debug)]
pub struct TerminologyCapabilitiesRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) kind: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) lockedDate: Option<bool>,
  pub(crate) codeSearch: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) closure: Option<Box<TerminologyCapabilities_Closure>>,
  pub(crate) software: Option<Box<TerminologyCapabilities_Software>>,
  pub(crate) translation: Option<Box<TerminologyCapabilities_Translation>>,
  pub(crate) validateCode: Option<Box<TerminologyCapabilities_ValidateCode>>,
  pub(crate) implementation: Option<Box<TerminologyCapabilities_Implementation>>,
  pub(crate) expansion: Option<Box<TerminologyCapabilities_Expansion>>,
  pub(crate) codeSystem: Vector<Box<TerminologyCapabilities_CodeSystem>>,
}

pub trait TerminologyCapabilities : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &DateTime<FixedOffset>;
  fn kind(&self) -> &String;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn lockedDate(&self) -> &Option<bool>;
  fn codeSearch(&self) -> &Option<String>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn closure(&self) -> &Option<Box<TerminologyCapabilities_Closure>>;
  fn software(&self) -> &Option<Box<TerminologyCapabilities_Software>>;
  fn translation(&self) -> &Option<Box<TerminologyCapabilities_Translation>>;
  fn validateCode(&self) -> &Option<Box<TerminologyCapabilities_ValidateCode>>;
  fn implementation(&self) -> &Option<Box<TerminologyCapabilities_Implementation>>;
  fn expansion(&self) -> &Option<Box<TerminologyCapabilities_Expansion>>;
  fn codeSystem(&self) -> &Vector<Box<TerminologyCapabilities_CodeSystem>>;
}

dyn_clone::clone_trait_object!(TerminologyCapabilities);

impl FHIRObject for TerminologyCapabilitiesRaw {
}

impl Resource for TerminologyCapabilitiesRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for TerminologyCapabilitiesRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl TerminologyCapabilities for TerminologyCapabilitiesRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &DateTime<FixedOffset> { &self.date }
  fn kind(&self) -> &String { &self.kind }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn lockedDate(&self) -> &Option<bool> { &self.lockedDate }
  fn codeSearch(&self) -> &Option<String> { &self.codeSearch }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn closure(&self) -> &Option<Box<TerminologyCapabilities_Closure>> { &self.closure }
  fn software(&self) -> &Option<Box<TerminologyCapabilities_Software>> { &self.software }
  fn translation(&self) -> &Option<Box<TerminologyCapabilities_Translation>> { &self.translation }
  fn validateCode(&self) -> &Option<Box<TerminologyCapabilities_ValidateCode>> { &self.validateCode }
  fn implementation(&self) -> &Option<Box<TerminologyCapabilities_Implementation>> { &self.implementation }
  fn expansion(&self) -> &Option<Box<TerminologyCapabilities_Expansion>> { &self.expansion }
  fn codeSystem(&self) -> &Vector<Box<TerminologyCapabilities_CodeSystem>> { &self.codeSystem }
}

