use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ImplementationGuide_Global {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) profile: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ImplementationGuide_DependsOn {
  pub(crate) id?: String,
  pub(crate) uri: String,
  pub(crate) version?: String,
  pub(crate) extension?: Extension,
  pub(crate) packageId?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct ImplementationGuide_Manifest_Page {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) title?: String,
  pub(crate) anchor?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ImplementationGuide_Manifest_Resource {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) example?: Boolean | String,
  pub(crate) relativePath?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct ImplementationGuide_Manifest {
  pub(crate) id?: String,
  pub(crate) image?: String,
  pub(crate) other?: String,
  pub(crate) extension?: Extension,
  pub(crate) rendering?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) page?: ImplementationGuide_Manifest_Page,
  pub(crate) resource: ImplementationGuide_Manifest_Resource,
}


pub struct ImplementationGuide_Definition_Page {
  pub(crate) id?: String,
  pub(crate) page?: ImplementationGuide_Definition_Page,
  pub(crate) title: String,
  pub(crate) name: Reference | String,
  pub(crate) extension?: Extension,
  pub(crate) generation: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct ImplementationGuide_Definition_Grouping {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct ImplementationGuide_Definition_Resource {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) example?: Boolean | String,
  pub(crate) groupingId?: String,
  pub(crate) fhirVersion?: String,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct ImplementationGuide_Definition_Template {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) scope?: String,
  pub(crate) source: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ImplementationGuide_Definition_Parameter {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) value: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ImplementationGuide_Definition {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) page?: ImplementationGuide_Definition_Page,
  pub(crate) grouping?: ImplementationGuide_Definition_Grouping,
  pub(crate) resource: ImplementationGuide_Definition_Resource,
  pub(crate) template?: ImplementationGuide_Definition_Template,
  pub(crate) parameter?: ImplementationGuide_Definition_Parameter,
}

pub struct ImplementationGuide {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) license?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) packageId: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) fhirVersion: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) global?: ImplementationGuide_Global,
  pub(crate) dependsOn?: ImplementationGuide_DependsOn,
  pub(crate) manifest?: ImplementationGuide_Manifest,
  pub(crate) definition?: ImplementationGuide_Definition,
}