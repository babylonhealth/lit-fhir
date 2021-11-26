use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::ImplementationGuide_Definition_Page::ImplementationGuide_Definition_Page;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::UnionBooleanOrCanonical;
use crate::hl7::UnionReferenceOrUrl;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Global {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_DependsOn {
  pub(crate) id: Option<String>,
  pub(crate) uri: String,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) packageId: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_Manifest_Page {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) title: Option<String>,
  pub(crate) anchor: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Manifest_Resource {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Box<Reference>,
  pub(crate) example: Option<UnionBooleanOrCanonical>,
  pub(crate) relativePath: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ImplementationGuide_Manifest {
  pub(crate) id: Option<String>,
  pub(crate) image: Vector<String>,
  pub(crate) other: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) rendering: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) page: Vector<ImplementationGuide_Manifest_Page>,
  pub(crate) resource: Vector<ImplementationGuide_Manifest_Resource>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Page {
  pub(crate) id: Option<String>,
  pub(crate) page: Vector<ImplementationGuide_Definition_Page>,
  pub(crate) title: String,
  pub(crate) name: UnionReferenceOrUrl,
  pub(crate) extension: Vector<Extension>,
  pub(crate) generation: String,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Grouping {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Resource {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Box<Reference>,
  pub(crate) example: Option<UnionBooleanOrCanonical>,
  pub(crate) groupingId: Option<String>,
  pub(crate) fhirVersion: Vector<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Template {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) scope: Option<String>,
  pub(crate) source: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) value: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) page: Option<ImplementationGuide_Definition_Page>,
  pub(crate) grouping: Vector<ImplementationGuide_Definition_Grouping>,
  pub(crate) resource: Vector<ImplementationGuide_Definition_Resource>,
  pub(crate) template: Vector<ImplementationGuide_Definition_Template>,
  pub(crate) parameter: Vector<ImplementationGuide_Definition_Parameter>,
}

#[derive(Clone, Debug)]
pub struct ImplementationGuide {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) license: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) packageId: String,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: Vector<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) global: Vector<ImplementationGuide_Global>,
  pub(crate) dependsOn: Vector<ImplementationGuide_DependsOn>,
  pub(crate) manifest: Option<ImplementationGuide_Manifest>,
  pub(crate) definition: Option<ImplementationGuide_Definition>,
}