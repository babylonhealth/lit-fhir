use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::UnionCanonicalOrUri;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Unmapped {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) mode: String,
  pub(crate) code: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Element_Target_DependsOn {
  pub(crate) id: Option<String>,
  pub(crate) value: String,
  pub(crate) system: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) property: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Element_Target {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) product: Vector<Box<dyn ConceptMap_Group_Element_Target_DependsOn>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) equivalence: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) dependsOn: Vector<ConceptMap_Group_Element_Target_DependsOn>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Element {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) target: Vector<ConceptMap_Group_Element_Target>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap_Group {
  pub(crate) id: Option<String>,
  pub(crate) source: Option<String>,
  pub(crate) target: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) sourceVersion: Option<String>,
  pub(crate) targetVersion: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) unmapped: Option<ConceptMap_Group_Unmapped>,
  pub(crate) element: Vector<ConceptMap_Group_FHIRElement>,
}

#[derive(Clone, Debug)]
pub struct ConceptMapRaw {
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
  pub(crate) copyright: Option<String>,
  pub(crate) source: Option<UnionCanonicalOrUri>,
  pub(crate) target: Option<UnionCanonicalOrUri>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) group: Vector<ConceptMap_Group>,
}

pub trait ConceptMap : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn source(&self) -> &Option<UnionCanonicalOrUri>;
  fn target(&self) -> &Option<UnionCanonicalOrUri>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn group(&self) -> &Vector<ConceptMap_Group>;
}

dyn_clone::clone_trait_object!(ConceptMap);

impl FHIRObject for ConceptMapRaw {
}

impl Resource for ConceptMapRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ConceptMapRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ConceptMap for ConceptMapRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn source(&self) -> &Option<UnionCanonicalOrUri> { &self.source }
  fn target(&self) -> &Option<UnionCanonicalOrUri> { &self.target }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn group(&self) -> &Vector<ConceptMap_Group> { &self.group }
}

