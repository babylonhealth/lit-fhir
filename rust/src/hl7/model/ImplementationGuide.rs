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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionBooleanOrCanonical;
use crate::hl7::model::UnionAliases::UnionReferenceOrUrl;



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Global {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) profile: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_DependsOn {
  pub(crate) id: Option<String>,
  pub(crate) uri: String,
  pub(crate) version: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) packageId: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_Manifest_Page {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) title: Option<String>,
  pub(crate) anchor: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Manifest_Resource {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Box<dyn Reference>,
  pub(crate) example: Option<UnionBooleanOrCanonical>,
  pub(crate) relativePath: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ImplementationGuide_Manifest {
  pub(crate) id: Option<String>,
  pub(crate) image: Vector<String>,
  pub(crate) other: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) rendering: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) page: Vector<Box<ImplementationGuide_Manifest_Page>>,
  pub(crate) resource: Vector<Box<ImplementationGuide_Manifest_Resource>>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Page {
  pub(crate) id: Option<String>,
  pub(crate) page: Vector<Box<ImplementationGuide_Definition_Page>>,
  pub(crate) title: String,
  pub(crate) name: UnionReferenceOrUrl,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) generation: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Grouping {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Resource {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Box<dyn Reference>,
  pub(crate) example: Option<UnionBooleanOrCanonical>,
  pub(crate) groupingId: Option<String>,
  pub(crate) fhirVersion: Vector<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Template {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) scope: Option<String>,
  pub(crate) source: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) value: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) page: Option<Box<ImplementationGuide_Definition_Page>>,
  pub(crate) grouping: Vector<Box<ImplementationGuide_Definition_Grouping>>,
  pub(crate) resource: Vector<Box<ImplementationGuide_Definition_Resource>>,
  pub(crate) template: Vector<Box<ImplementationGuide_Definition_Template>>,
  pub(crate) parameter: Vector<Box<ImplementationGuide_Definition_Parameter>>,
}

#[derive(Clone, Debug)]
pub struct ImplementationGuideRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) license: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) packageId: String,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) fhirVersion: Vector<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) global: Vector<Box<ImplementationGuide_Global>>,
  pub(crate) dependsOn: Vector<Box<ImplementationGuide_DependsOn>>,
  pub(crate) manifest: Option<Box<ImplementationGuide_Manifest>>,
  pub(crate) definition: Option<Box<ImplementationGuide_Definition>>,
}

pub trait ImplementationGuide : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn title(&self) -> Option<&String>;
  fn status(&self) -> &String;
  fn version(&self) -> Option<&String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn license(&self) -> Option<&String>;
  fn publisher(&self) -> Option<&String>;
  fn copyright(&self) -> Option<&String>;
  fn packageId(&self) -> &String;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> Option<&String>;
  fn fhirVersion(&self) -> &Vector<String>;
  fn experimental(&self) -> Option<&bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn global(&self) -> &Vector<Box<ImplementationGuide_Global>>;
  fn dependsOn(&self) -> &Vector<Box<ImplementationGuide_DependsOn>>;
  fn manifest(&self) -> Option<&Box<ImplementationGuide_Manifest>>;
  fn definition(&self) -> Option<&Box<ImplementationGuide_Definition>>;
}

dyn_clone::clone_trait_object!(ImplementationGuide);

impl FHIRObject for ImplementationGuideRaw {
}

impl Resource for ImplementationGuideRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ImplementationGuideRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ImplementationGuide for ImplementationGuideRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn title(&self) -> Option<&String> { self.title.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> Option<&String> { self.version.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn license(&self) -> Option<&String> { self.license.as_ref() }
  fn publisher(&self) -> Option<&String> { self.publisher.as_ref() }
  fn copyright(&self) -> Option<&String> { self.copyright.as_ref() }
  fn packageId(&self) -> &String { &self.packageId }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> Option<&String> { self.description.as_ref() }
  fn fhirVersion(&self) -> &Vector<String> { &self.fhirVersion }
  fn experimental(&self) -> Option<&bool> { self.experimental.as_ref() }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn global(&self) -> &Vector<Box<ImplementationGuide_Global>> { &self.global }
  fn dependsOn(&self) -> &Vector<Box<ImplementationGuide_DependsOn>> { &self.dependsOn }
  fn manifest(&self) -> Option<&Box<ImplementationGuide_Manifest>> { self.manifest.as_ref() }
  fn definition(&self) -> Option<&Box<ImplementationGuide_Definition>> { self.definition.as_ref() }
}

