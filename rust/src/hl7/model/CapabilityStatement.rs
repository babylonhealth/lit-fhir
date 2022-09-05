use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Software {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) releaseDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Document {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) profile: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Implementation {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) custodian: Option<Box<dyn Reference>>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Security {
  pub(crate) id: Option<String>,
  pub(crate) cors: Option<bool>,
  pub(crate) service: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Interaction {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource_Operation {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: String,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource_Interaction {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource_SearchParam {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: Option<String>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) versioning: Option<String>,
  pub(crate) readHistory: Option<bool>,
  pub(crate) updateCreate: Option<bool>,
  pub(crate) documentation: Option<String>,
  pub(crate) searchInclude: Vector<String>,
  pub(crate) conditionalRead: Option<String>,
  pub(crate) referencePolicy: Vector<String>,
  pub(crate) supportedProfile: Vector<String>,
  pub(crate) searchRevInclude: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) conditionalCreate: Option<bool>,
  pub(crate) conditionalUpdate: Option<bool>,
  pub(crate) conditionalDelete: Option<String>,
  pub(crate) operation: Vector<CapabilityStatement_Rest_Resource_Operation>,
  pub(crate) interaction: Vector<CapabilityStatement_Rest_Resource_Interaction>,
  pub(crate) searchParam: Vector<CapabilityStatement_Rest_Resource_SearchParam>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) operation: Vector<Box<dyn CapabilityStatement_Rest_Resource_Operation>>,
  pub(crate) searchParam: Vector<Box<dyn CapabilityStatement_Rest_Resource_SearchParam>>,
  pub(crate) compartment: Vector<String>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) security: Option<CapabilityStatement_Rest_Security>,
  pub(crate) interaction: Vector<CapabilityStatement_Rest_Interaction>,
  pub(crate) resource: Vector<CapabilityStatement_Rest_Resource>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Messaging_Endpoint {
  pub(crate) id: Option<String>,
  pub(crate) address: String,
  pub(crate) protocol: Box<dyn Coding>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Messaging_SupportedMessage {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatement_Messaging {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reliableCache: Option<u32>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) endpoint: Vector<CapabilityStatement_Messaging_Endpoint>,
  pub(crate) supportedMessage: Vector<CapabilityStatement_Messaging_SupportedMessage>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatementRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) kind: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) format: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) imports: Vector<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: String,
  pub(crate) patchFormat: Vector<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) implementationGuide: Vector<String>,
  pub(crate) software: Option<CapabilityStatement_Software>,
  pub(crate) document: Vector<CapabilityStatement_Document>,
  pub(crate) implementation: Option<CapabilityStatement_Implementation>,
  pub(crate) rest: Vector<CapabilityStatement_Rest>,
  pub(crate) messaging: Vector<CapabilityStatement_Messaging>,
}

pub trait CapabilityStatement : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &DateTime<FixedOffset>;
  fn kind(&self) -> &String;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn format(&self) -> &Vector<String>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn imports(&self) -> &Vector<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn fhirVersion(&self) -> &String;
  fn patchFormat(&self) -> &Vector<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn instantiates(&self) -> &Vector<String>;
  fn implementationGuide(&self) -> &Vector<String>;
  fn software(&self) -> &Option<CapabilityStatement_Software>;
  fn document(&self) -> &Vector<CapabilityStatement_Document>;
  fn implementation(&self) -> &Option<CapabilityStatement_Implementation>;
  fn rest(&self) -> &Vector<CapabilityStatement_Rest>;
  fn messaging(&self) -> &Vector<CapabilityStatement_Messaging>;
}

dyn_clone::clone_trait_object!(CapabilityStatement);

impl FHIRObject for CapabilityStatementRaw {
}

impl Resource for CapabilityStatementRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CapabilityStatementRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CapabilityStatement for CapabilityStatementRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &DateTime<FixedOffset> { &self.date }
  fn kind(&self) -> &String { &self.kind }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn format(&self) -> &Vector<String> { &self.format }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn imports(&self) -> &Vector<String> { &self.imports }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn fhirVersion(&self) -> &String { &self.fhirVersion }
  fn patchFormat(&self) -> &Vector<String> { &self.patchFormat }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn instantiates(&self) -> &Vector<String> { &self.instantiates }
  fn implementationGuide(&self) -> &Vector<String> { &self.implementationGuide }
  fn software(&self) -> &Option<CapabilityStatement_Software> { &self.software }
  fn document(&self) -> &Vector<CapabilityStatement_Document> { &self.document }
  fn implementation(&self) -> &Option<CapabilityStatement_Implementation> { &self.implementation }
  fn rest(&self) -> &Vector<CapabilityStatement_Rest> { &self.rest }
  fn messaging(&self) -> &Vector<CapabilityStatement_Messaging> { &self.messaging }
}

