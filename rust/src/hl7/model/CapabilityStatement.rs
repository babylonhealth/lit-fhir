use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CapabilityStatement_Software {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) version?: String,
  pub(crate) extension?: Extension,
  pub(crate) releaseDate?: Date,
  pub(crate) modifierExtension?: Extension,
}


pub struct CapabilityStatement_Document {
  pub(crate) id?: String,
  pub(crate) mode: String,
  pub(crate) profile: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct CapabilityStatement_Implementation {
  pub(crate) id?: String,
  pub(crate) url?: String,
  pub(crate) extension?: Extension,
  pub(crate) custodian?: Reference,
  pub(crate) description: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct CapabilityStatement_Rest_Security {
  pub(crate) id?: String,
  pub(crate) cors?: Boolean,
  pub(crate) service?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct CapabilityStatement_Rest_Interaction {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct CapabilityStatement_Rest_Resource_Operation {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) extension?: Extension,
  pub(crate) definition: String,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct CapabilityStatement_Rest_Resource_Interaction {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct CapabilityStatement_Rest_Resource_SearchParam {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) _type: String,
  pub(crate) extension?: Extension,
  pub(crate) definition?: String,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct CapabilityStatement_Rest_Resource {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) profile?: String,
  pub(crate) extension?: Extension,
  pub(crate) versioning?: String,
  pub(crate) readHistory?: Boolean,
  pub(crate) updateCreate?: Boolean,
  pub(crate) documentation?: String,
  pub(crate) searchInclude?: String,
  pub(crate) conditionalRead?: String,
  pub(crate) referencePolicy?: String,
  pub(crate) supportedProfile?: String,
  pub(crate) searchRevInclude?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) conditionalCreate?: Boolean,
  pub(crate) conditionalUpdate?: Boolean,
  pub(crate) conditionalDelete?: String,
  pub(crate) operation?: CapabilityStatement_Rest_Resource_Operation,
  pub(crate) interaction?: CapabilityStatement_Rest_Resource_Interaction,
  pub(crate) searchParam?: CapabilityStatement_Rest_Resource_SearchParam,
}

pub struct CapabilityStatement_Rest {
  pub(crate) id?: String,
  pub(crate) mode: String,
  pub(crate) extension?: Extension,
  pub(crate) operation?: CapabilityStatement_Rest_Resource_Operation,
  pub(crate) searchParam?: CapabilityStatement_Rest_Resource_SearchParam,
  pub(crate) compartment?: String,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) security?: CapabilityStatement_Rest_Security,
  pub(crate) interaction?: CapabilityStatement_Rest_Interaction,
  pub(crate) resource?: CapabilityStatement_Rest_Resource,
}


pub struct CapabilityStatement_Messaging_Endpoint {
  pub(crate) id?: String,
  pub(crate) address: String,
  pub(crate) protocol: Coding,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct CapabilityStatement_Messaging_SupportedMessage {
  pub(crate) id?: String,
  pub(crate) mode: String,
  pub(crate) extension?: Extension,
  pub(crate) definition: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct CapabilityStatement_Messaging {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) reliableCache?: u32,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) endpoint?: CapabilityStatement_Messaging_Endpoint,
  pub(crate) supportedMessage?: CapabilityStatement_Messaging_SupportedMessage,
}

pub struct CapabilityStatement {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date: Date,
  pub(crate) kind: String,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) format: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) imports?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) fhirVersion: String,
  pub(crate) patchFormat?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) instantiates?: String,
  pub(crate) implementationGuide?: String,
  pub(crate) software?: CapabilityStatement_Software,
  pub(crate) document?: CapabilityStatement_Document,
  pub(crate) implementation?: CapabilityStatement_Implementation,
  pub(crate) rest?: CapabilityStatement_Rest,
  pub(crate) messaging?: CapabilityStatement_Messaging,
}