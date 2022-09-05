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
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionAll;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union00551919141;



#[derive(Clone, Debug)]
pub struct StructureMap_Structure {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) mode: String,
  pub(crate) alias: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct StructureMap_Group_Input {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: Option<String>,
  pub(crate) mode: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Source {
  pub(crate) id: Option<String>,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) check: Option<String>,
  pub(crate) context: String,
  pub(crate) element: Option<String>,
  pub(crate) listMode: Option<String>,
  pub(crate) variable: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) condition: Option<String>,
  pub(crate) logMessage: Option<String>,
  pub(crate) defaultValue: Option<UnionAll>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Dependent {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) variable: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Target_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) value: Union00551919141,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Target {
  pub(crate) id: Option<String>,
  pub(crate) context: Option<String>,
  pub(crate) element: Option<String>,
  pub(crate) variable: Option<String>,
  pub(crate) listMode: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) transform: Option<String>,
  pub(crate) listRuleId: Option<String>,
  pub(crate) contextType: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) parameter: Vector<Box<StructureMap_Group_Rule_Target_Parameter>>,
}

#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) rule: Vector<Box<StructureMap_Group_Rule>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) source: Vector<Box<StructureMap_Group_Rule_Source>>,
  pub(crate) dependent: Vector<Box<StructureMap_Group_Rule_Dependent>>,
  pub(crate) target: Vector<Box<StructureMap_Group_Rule_Target>>,
}

#[derive(Clone, Debug)]
pub struct StructureMap_Group {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extends: Option<String>,
  pub(crate) typeMode: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) input: Vector<Box<StructureMap_Group_Input>>,
  pub(crate) rule: Vector<Box<StructureMap_Group_Rule>>,
}

#[derive(Clone, Debug)]
pub struct StructureMapRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) import: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) structure: Vector<Box<StructureMap_Structure>>,
  pub(crate) group: Vector<Box<StructureMap_Group>>,
}

pub trait StructureMap : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn import(&self) -> &Vector<String>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn structure(&self) -> &Vector<Box<StructureMap_Structure>>;
  fn group(&self) -> &Vector<Box<StructureMap_Group>>;
}

dyn_clone::clone_trait_object!(StructureMap);

impl FHIRObject for StructureMapRaw {
}

impl Resource for StructureMapRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for StructureMapRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl StructureMap for StructureMapRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn import(&self) -> &Vector<String> { &self.import }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn structure(&self) -> &Vector<Box<StructureMap_Structure>> { &self.structure }
  fn group(&self) -> &Vector<Box<StructureMap_Group>> { &self.group }
}

