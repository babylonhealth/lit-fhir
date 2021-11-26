use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CapabilityStatement_Rest_Resource_Operation::CapabilityStatement_Rest_Resource_Operation;
use crate::core::model::CapabilityStatement_Rest_Resource_SearchParam::CapabilityStatement_Rest_Resource_SearchParam;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Software {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) releaseDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Document {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) profile: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Implementation {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) custodian: Option<Box<Reference>>,
  pub(crate) description: String,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Security {
  pub(crate) id: Option<String>,
  pub(crate) cors: Option<bool>,
  pub(crate) service: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Interaction {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource_Operation {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: String,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource_Interaction {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource_SearchParam {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: Option<String>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatement_Rest_Resource {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) versioning: Option<String>,
  pub(crate) readHistory: Option<bool>,
  pub(crate) updateCreate: Option<bool>,
  pub(crate) documentation: Option<String>,
  pub(crate) searchInclude: Vector<String>,
  pub(crate) conditionalRead: Option<String>,
  pub(crate) referencePolicy: Vector<String>,
  pub(crate) supportedProfile: Vector<String>,
  pub(crate) searchRevInclude: Vector<String>,
  pub(crate) modifierExtension: Vector<Extension>,
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
  pub(crate) extension: Vector<Extension>,
  pub(crate) operation: Vector<CapabilityStatement_Rest_Resource_Operation>,
  pub(crate) searchParam: Vector<CapabilityStatement_Rest_Resource_SearchParam>,
  pub(crate) compartment: Vector<String>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) security: Option<CapabilityStatement_Rest_Security>,
  pub(crate) interaction: Vector<CapabilityStatement_Rest_Interaction>,
  pub(crate) resource: Vector<CapabilityStatement_Rest_Resource>,
}


#[derive(Clone, Debug)]
pub struct CapabilityStatement_Messaging_Endpoint {
  pub(crate) id: Option<String>,
  pub(crate) address: String,
  pub(crate) protocol: Coding,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct CapabilityStatement_Messaging_SupportedMessage {
  pub(crate) id: Option<String>,
  pub(crate) mode: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatement_Messaging {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reliableCache: Option<u32>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) endpoint: Vector<CapabilityStatement_Messaging_Endpoint>,
  pub(crate) supportedMessage: Vector<CapabilityStatement_Messaging_SupportedMessage>,
}

#[derive(Clone, Debug)]
pub struct CapabilityStatement {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: DateTime<FixedOffset>,
  pub(crate) kind: String,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) format: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) imports: Vector<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: String,
  pub(crate) patchFormat: Vector<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) implementationGuide: Vector<String>,
  pub(crate) software: Option<CapabilityStatement_Software>,
  pub(crate) document: Vector<CapabilityStatement_Document>,
  pub(crate) implementation: Option<CapabilityStatement_Implementation>,
  pub(crate) rest: Vector<CapabilityStatement_Rest>,
  pub(crate) messaging: Vector<CapabilityStatement_Messaging>,
}