use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::UnionBooleanOrCanonical;
use crate::hl7::UnionReferenceOrUrl;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) page: Vector<ImplementationGuide_Manifest_Page>,
  pub(crate) resource: Vector<ImplementationGuide_Manifest_Resource>,
}


#[derive(Clone, Debug)]
pub struct ImplementationGuide_Definition_Page {
  pub(crate) id: Option<String>,
  pub(crate) page: Vector<Box<dyn ImplementationGuide_Definition_Page>>,
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
  pub(crate) page: Option<ImplementationGuide_Definition_Page>,
  pub(crate) grouping: Vector<ImplementationGuide_Definition_Grouping>,
  pub(crate) resource: Vector<ImplementationGuide_Definition_Resource>,
  pub(crate) template: Vector<ImplementationGuide_Definition_Template>,
  pub(crate) parameter: Vector<ImplementationGuide_Definition_Parameter>,
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
  pub(crate) global: Vector<ImplementationGuide_Global>,
  pub(crate) dependsOn: Vector<ImplementationGuide_DependsOn>,
  pub(crate) manifest: Option<ImplementationGuide_Manifest>,
  pub(crate) definition: Option<ImplementationGuide_Definition>,
}

pub trait ImplementationGuide : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn license(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn packageId(&self) -> &String;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn fhirVersion(&self) -> &Vector<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn global(&self) -> &Vector<ImplementationGuide_Global>;
  fn dependsOn(&self) -> &Vector<ImplementationGuide_DependsOn>;
  fn manifest(&self) -> &Option<ImplementationGuide_Manifest>;
  fn definition(&self) -> &Option<ImplementationGuide_Definition>;
}

dyn_clone::clone_trait_object!(ImplementationGuide);

impl FHIRObject for ImplementationGuideRaw {
}

impl Resource for ImplementationGuideRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ImplementationGuideRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ImplementationGuide for ImplementationGuideRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn license(&self) -> &Option<String> { &self.license }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn packageId(&self) -> &String { &self.packageId }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn fhirVersion(&self) -> &Vector<String> { &self.fhirVersion }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn global(&self) -> &Vector<ImplementationGuide_Global> { &self.global }
  fn dependsOn(&self) -> &Vector<ImplementationGuide_DependsOn> { &self.dependsOn }
  fn manifest(&self) -> &Option<ImplementationGuide_Manifest> { &self.manifest }
  fn definition(&self) -> &Option<ImplementationGuide_Definition> { &self.definition }
}

